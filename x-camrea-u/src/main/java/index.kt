@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xCamreaU;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.util.Size;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.camera.core.AspectRatio;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.Quality;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.LifecycleOwner;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.UniSDKEngine;
import io.dcloud.uniapp.appframe.PageProxy;
import io.dcloud.uniapp.dom.node.DomNode;
import io.dcloud.uniapp.dom.node.PageNode;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.interfaces.INodeData;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.ui.component.IComponentData;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import io.dcloud.uts.component.*;
import io.dcloud.uts.component.UTSComponent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Executors;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
open class CAMERA_PHOTO_SIZE (
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSObject()
open class cameraListNameType (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var device: CameraCharacteristics,
) : UTSObject()
typealias TAKE_CALL_BACK = (path: String) -> Unit;
var callFuntake = fun(path: String){};
var callVideoFun = fun(path: String){};
fun getUid(rdix: Number = 1, length: Number = 12): String {
    var ix = "";
    ix = Math.floor(Math.random() * rdix * Math.floor(Math.random() * Date.now())).toString().substring(0, length as Int);
    return ix;
}
open class xCamera {
    open var parentView: FrameLayout;
    open var viewBox_width: Number = 0;
    open var viewBox_height: Number = 0;
    open var imgPointsBycanmarea = utsArrayOf<RelativeLayout>();
    open var vibrator = null as Vibrator?;
    open var context: Context;
    open var cameraRate = Map<Number, Number>(utsArrayOf(
        utsArrayOf(
            Surface.ROTATION_0,
            0
        ),
        utsArrayOf(
            Surface.ROTATION_90,
            0
        ),
        utsArrayOf(
            Surface.ROTATION_180,
            0
        ),
        utsArrayOf(
            Surface.ROTATION_270,
            0
        )
    ));
    open var cameraService: CameraManager;
    open var cameraListName = Map<String, cameraListNameType>();
    open var cameraPreviewSize = CAMERA_PHOTO_SIZE(width = 800, height = 800);
    open var cameraDevice: CameraDevice? = null;
    open var cameraDeviceCaptureSession: CameraCaptureSession? = null;
    open var sufaceHolderView: Surface? = null;
    open var cameraView: PreviewView? = null;
    open var cameraProvider: ProcessCameraProvider? = null;
    open var camera: Camera? = null;
    open var cameraPreview: Preview? = null;
    open var videoCapture: VideoCapture<Recorder>? = null;
    open var recoderVideoObj: Recording? = null;
    open var isDecoderQring = false;
    open var isOpeningCameraing = false;
    open var callFunEvent: TAKE_CALL_BACK = fun(str: String){};
    open var CamerDeviceDir = CameraSelector.LENS_FACING_FRONT;
    open var flashMode = false;
    open var takeModelType = "photo";
    private var PHOTO_TYPE = "image/jpeg";
    private var RATIO_4_3_VALUE = (4.0 as Number) / 3.0;
    private var RATIO_16_9_VALUE = (16.0 as Number) / 9.0;
    constructor(GroupView: FrameLayout){
        this.context = UTSAndroid.getAppContext()!! as Context;
        this.parentView = GroupView;
        this.cameraService = this.context.getSystemService(Context.CAMERA_SERVICE) as CameraManager;
        this.vibrator = this.context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator;
        this._createCameraView();
    }
    private fun _createCameraView() {
        var sv = PreviewView(UTSAndroid.getAppContext()!!);
        sv.scaleType = PreviewView.ScaleType.FILL_CENTER;
        var layaout = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sv.setLayoutParams(layaout);
        this.cameraView = sv;
        this.parentView.addView(this.cameraView!!);
    }
    open fun openCamera() {
        var _this = this;
        if (this.isOpeningCameraing) {
            this.closeCamera();
        }
        _this._openCamera();
    }
    open fun startRecoderVideo(call: (path: String) -> Unit) {
        callVideoFun = call;
        var _this = this;
        if (_this.recoderVideoObj?.isClosed() == false) {
            _this.recoderVideoObj?.resume();
        } else {
            if (this.isOpeningCameraing || this.recoderVideoObj != null) {
                this.stopRecoderVideo();
                this.closeCamera();
            }
            _this.takeModelType = "video";
            _this._openCamera();
        }
    }
    open fun pauseRecoderVideo() {
        var _this = this;
        _this.recoderVideoObj?.pause();
    }
    open fun stopRecoderVideo() {
        var _this = this;
        _this.takeModelType = "photo";
        _this.recoderVideoObj?.stop();
        _this.recoderVideoObj?.close();
        _this.recoderVideoObj = null;
        _this.videoCapture = null;
    }
    open fun setCallEvent(call: TAKE_CALL_BACK) {
        this.callFunEvent = call;
    }
    open fun getCamraRotation(): Number {
        return 0;
    }
    open fun closeCamera() {
        var t = this;
        open class IntentRunable2 : Runnable {
            override fun run() {
                t.cameraProvider?.unbindAll();
                t.cameraPreview?.setSurfaceProvider(null);
                t.isOpeningCameraing = false;
            }
        }
        Handler(Looper.getMainLooper()).post(IntentRunable2());
    }
    private fun aspectRatio(width: Int, height: Int): Int {
        var previewRatio = Math.max(width, height).toDouble() / Math.min(width, height);
        if (Math.abs(previewRatio - this.RATIO_4_3_VALUE) <= Math.abs(previewRatio - this.RATIO_16_9_VALUE)) {
            return AspectRatio.RATIO_4_3;
        }
        return AspectRatio.RATIO_16_9;
    }
    private fun _openCamera() {
        var _this = this;
        var cameraProviderFuture = ProcessCameraProvider.getInstance(this.context);
        open class IntentRunable : Runnable {
            override fun run() {
                var cameraProvider: ProcessCameraProvider = cameraProviderFuture.get();
                var previewView = _this.cameraView!! as PreviewView;
                var cameraSelector: CameraSelector = CameraSelector.Builder().requireLensFacing(_this.CamerDeviceDir).build();
                var screenAspectRatio = _this.aspectRatio(1280.toInt(), 720.toInt());
                var preview: Preview = Preview.Builder().setTargetAspectRatio(screenAspectRatio).build();
                preview.setSurfaceProvider(previewView.getSurfaceProvider());
                var imageCapture: ImageCapture = ImageCapture.Builder().setTargetAspectRatio(screenAspectRatio).build();
                var imageAnalysis = ImageAnalysis.Builder().setTargetResolution(Size(1280, 720)).setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST).build();
                open class MyImageAnalyzer : ImageAnalysis.Analyzer {
                    constructor() : super() {}
                    override fun analyze(image: ImageProxy) {
                        if (_this.isDecoderQring) {
                            _this.savePhotoTocache(image);
                        } else {
                            image.close();
                        }
                    }
                    override fun getDefaultTargetResolution(): Size {
                        return Size(_this.viewBox_width.toInt(), _this.viewBox_height.toInt());
                    }
                }
                var cameraExecutor = Executors.newSingleThreadExecutor();
                imageAnalysis.setAnalyzer(cameraExecutor, MyImageAnalyzer());
                var recorder = Recorder.Builder().setQualitySelector(QualitySelector.from(Quality.HIGHEST)).build();
                _this.videoCapture = VideoCapture.withOutput(recorder);
                var camera: Camera = cameraProvider.bindToLifecycle(UTSAndroid.getUniActivity()!! as LifecycleOwner, cameraSelector, imageCapture, imageAnalysis, preview, videoCapture!!);
                if (_this.takeModelType == "video") {
                    var filepath = _this.context.getExternalCacheDir()?.getPath() ?: "";
                    var videoFile = File(filepath, "tmui4xCamreaVideo" + getUid(1, 12) + ".mp4");
                    var outputOptions = FileOutputOptions.Builder(videoFile).build();
                    open class reocdereventClass : Consumer<VideoRecordEvent> {
                        override fun accept(event: VideoRecordEvent) {
                            if (event is VideoRecordEvent.Start) {
                                console.log("开始录制");
                            } else if (event is VideoRecordEvent.Finalize) {
                                console.log("结束录制", videoFile.absolutePath);
                                callVideoFun(videoFile.absolutePath);
                            }
                        }
                    }
                    _this.recoderVideoObj = _this.videoCapture!!.getOutput().prepareRecording(_this.context, outputOptions).start(ContextCompat.getMainExecutor(_this.context), reocdereventClass() as Consumer<VideoRecordEvent>);
                }
                var cameraControl = camera.cameraControl;
                var cameraInfo: CameraInfo = camera.cameraInfo;
                cameraControl.enableTorch(_this.flashMode);
                _this.camera = camera;
                _this.cameraPreview = preview;
                _this.cameraProvider = cameraProvider;
                _this.isDecoderQring = false;
                _this.isOpeningCameraing = true;
            }
        }
        try {
            cameraProviderFuture.addListener(IntentRunable(), ContextCompat.getMainExecutor(this.context));
        }
         catch (e: Throwable) {
            console.error("开启错误.");
        }
    }
    open fun takPhoto(call: (path: String) -> Unit) {
        callFuntake = call;
        this.isDecoderQring = true;
    }
    open fun setCameraDir(type: String) {
        this.CamerDeviceDir = if (type == "back") {
            CameraSelector.LENS_FACING_BACK;
        } else {
            CameraSelector.LENS_FACING_FRONT;
        }
        ;
    }
    open fun setFlash(type: Boolean) {
        this.flashMode = type;
    }
    open fun savePhotoTocache(image: ImageProxy) {
        var context = UTSAndroid.getAppContext()!!;
        var filepath = context.getExternalCacheDir()?.getPath() ?: "";
        var img: Bitmap? = image.toBitmap();
        var file = File(filepath, "tmui4xCamrea" + getUid(1, 12) + ".jpg");
        var fos = FileOutputStream(file);
        var conunt = (img?.getByteCount() ?: 0) / 1024 / 1024;
        var saved = img!!.compress(Bitmap.CompressFormat.JPEG, if (conunt > 1) {
            64;
        } else {
            100;
        }
        , fos);
        var t = this;
        open class IntentRunable2 : Runnable {
            override fun run() {
                if (saved) {
                    callFuntake(file.getPath());
                    t.isDecoderQring = false;
                }
            }
        }
        image.close();
        Handler(Looper.getMainLooper()).post(IntentRunable2());
    }
}
open class XCamreaUComponent : UTSComponent<FrameLayout> {
    constructor(proxy: PageProxy, componentData: IComponentData) : super(proxy, componentData) ;
    open var cameraWidth: Number = 800;
    open var cameraeiHght: Number = 800;
    open var autoOpenCamera: Boolean = true;
    open var orientation: String = "back";
    open var flash: Boolean = false;
    open var CBOX: FrameLayout? = null;
    open var xcamera: xCamera? = null;
    open var defaultscaneventFun = null;
    override fun NVLoad(): FrameLayout {
        var grop = FrameLayout(UTSAndroid!!.getAppContext()!!);
        this.CBOX = grop;
        return grop;
    }
    override fun NVLayouted() {
        this.xcamera = xCamera(this.CBOX!!);
        var t = this;
        if (this.autoOpenCamera) {
            this.open();
        }
        UTSAndroid.onAppActivityPause(fun(){
            t.pauseResum();
        }
        );
    }
    override fun NVBeforeUnload() {
        var t = this;
        UTSAndroid.offAppActivityPause(fun(){
            t.pauseResum();
        }
        );
    }
    override fun NVUnloaded() {
        this.close();
    }
    open fun pauseResum() {
        if (this.xcamera?.isOpeningCameraing == true) {
            this.open();
        }
    }
    open fun checkPermissions(call: (istrue: Boolean) -> Unit) {
        var permissionCheck = utsArrayOf(
            "android.permission.CAMERA"
        );
        if (UTSAndroid.checkSystemPermissionGranted(UTSAndroid.getUniActivity()!!, permissionCheck)) {
            call(true);
        } else {
            console.log("当前不具备指定权限");
            UTSAndroid.requestSystemPermission(UTSAndroid.getUniActivity()!!, permissionCheck, fun(allRight: Boolean, _: UTSArray<String>) {
                call(true);
            }
            , fun(_: Boolean, _: UTSArray<String>) {
                call(false);
            }
            );
        }
    }
    open fun open() {
        var _this = this;
        this.checkPermissions(fun(auth: Boolean){
            if (auth) {
                _this.xcamera?.setCameraDir(this.orientation);
                _this.xcamera?.setFlash(this.flash);
                _this.xcamera?.openCamera();
            }
        }
        );
    }
    open fun take() {
        var t = this;
        this.xcamera?.takPhoto(fun(path: String){
            var map = Map<String, String>();
            map.set("path", path + "");
            t.`$emit`("take", map);
        }
        );
    }
    open fun start() {
        var t = this;
        this.xcamera?.startRecoderVideo(fun(path: String){
            var map = Map<String, String>();
            map.set("path", path + "");
            t.`$emit`("recoder", map);
        }
        );
    }
    open fun pause() {
        this.xcamera?.pauseRecoderVideo();
    }
    open fun stop() {
        this.xcamera?.stopRecoderVideo();
    }
    open fun close() {
        this.xcamera?.closeCamera();
    }
    companion object {
        var name = "x-camrea-u";
        init {
            io.dcloud.uniapp.UniSDKEngine.registerUniComponent("x-camrea-u", XCamreaUComponent::class.java, XCamreaUElement::class.java);
        }
    }
}
open class XCamreaUElement : DomNode {
    constructor(data: INodeData, pageNode: PageNode) : super(data, pageNode) ;
    open fun pauseResum() {
        return (getComponent() as XCamreaUComponent).pauseResum();
    }
    open fun checkPermissions(call: (istrue: Boolean) -> Unit) {
        return (getComponent() as XCamreaUComponent).checkPermissions(call);
    }
    open fun open() {
        return (getComponent() as XCamreaUComponent).open();
    }
    open fun take() {
        return (getComponent() as XCamreaUComponent).take();
    }
    open fun start() {
        return (getComponent() as XCamreaUComponent).start();
    }
    open fun pause() {
        return (getComponent() as XCamreaUComponent).pause();
    }
    open fun stop() {
        return (getComponent() as XCamreaUComponent).stop();
    }
    open fun close() {
        return (getComponent() as XCamreaUComponent).close();
    }
}
