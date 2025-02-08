@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xQrU;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.sumimakito.awesomeqr.AwesomeQRCode;
import com.github.sumimakito.awesomeqr.AwesomeQRCode.Renderer;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
fun px2dp(n: Number): Number {
    val mets = UTSAndroid.getAppContext()!!.resources!!.getDisplayMetrics();
    return mets.density * n;
}
open class XQrUComponent : UTSComponent<LinearLayout> {
    constructor(proxy: PageProxy, componentData: IComponentData) : super(proxy, componentData) ;
    open var width: Number = 100;
    open var height: Number = 100;
    open var type: String = "QR_CODE";
    open var margin: Number = 2;
    open var foregroundColor: String = "#000000";
    open var backGroundColor: String = "#FFFFFF";
    open var content: String = "https://xui.tmui.design";
    open var logo: String = "";
    open var dotRound: Boolean = true;
    open var CBOX: LinearLayout? = null;
    open var qrImgView: ImageView? = null;
    override fun NVLoad(): LinearLayout {
        var grop = LinearLayout(this.`$androidContext`);
        this.CBOX = grop;
        return grop;
    }
    override fun NVLayouted() {
        var width = Math.ceil(px2dp(this.width));
        var height = width;
        this.createCode(this.content, width, height, this.margin, this.type, this.foregroundColor, this.backGroundColor);
    }
    open fun savePhotoTocache(img: Bitmap): String {
        var context = UTSAndroid.getAppContext()!!;
        var filepath = context.getExternalCacheDir()?.getPath() ?: "";
        var fileid = Math.random().toString(16).substring(2, 11);
        var file = File(filepath, fileid + ".jpg");
        var fos = FileOutputStream(file);
        img.compress(Bitmap.CompressFormat.JPEG, 100, fos);
        return file.getPath();
    }
    open fun getQrcodePath(): String {
        var filename = Math.random().toString(16).substring(2, 11);
        if (this.qrImgView == null) {
            return "";
        }
        var imgview: ImageView = this.qrImgView!!;
        var bitmap: Bitmap = (imgview.getDrawable() as BitmapDrawable).getBitmap();
        var filestring = "";
        try {
            filestring = this.savePhotoTocache(bitmap);
        }
         catch (e: Throwable) {}
        return filestring;
    }
    open fun createCode(code: String, width: Number = 100, height: Number = 100, margin: Number = 1, type: String = "QR_CODE", ForegroundColor: String = "#000000", backGroundColor: String = "#FFFFFF") {
        if (this.CBOX == null) {
            return;
        }
        var images = ImageView(this.`$androidContext`);
        if (this.qrImgView != null) {
            images = this.qrImgView!!;
        } else {
            this.qrImgView = images;
            this.CBOX!!.addView(images);
        }
        open class qrCallbac : AwesomeQRCode.Callback {
            override fun onRendered(renderer: Renderer, bitmap: Bitmap) {
                images.setImageBitmap(bitmap);
            }
            override fun onError(renderer: Renderer, e: Exception) {}
        }
        var logoimg: Bitmap? = null;
        if (this.logo != "") {
            var imgpath = UTSAndroid.convert2AbsFullPath(this.logo);
            logoimg = BitmapFactory.decodeFile(imgpath);
        }
        AwesomeQRCode.Renderer().contents(code).roundedDots(this.dotRound).colorLight(Color.parseColor(backGroundColor)).colorDark(Color.parseColor(ForegroundColor)).dotScale(1.toFloat()).size(width.toInt()).margin(margin.toInt()).logo(logoimg).logoScale(0.25.toFloat()).renderAsync(qrCallbac());
    }
    override fun `$init`() {
        this.`$watch`<String>("content", fun(newV){
            var width = Math.ceil(px2dp(this.width));
            var height = width;
            this.createCode(newV, width, height, this.margin, this.type, this.foregroundColor, this.backGroundColor);
        }
        );
    }
    companion object {
        var name = "x-qr-u";
        init {
            io.dcloud.uniapp.UniSDKEngine.registerUniComponent("x-qr-u", XQrUComponent::class.java, XQrUElement::class.java);
        }
    }
}
open class XQrUElement : DomNode {
    constructor(data: INodeData, pageNode: PageNode) : super(data, pageNode) ;
    open fun savePhotoTocache(img: Bitmap): String {
        return (getComponent() as XQrUComponent).savePhotoTocache(img);
    }
    open fun getQrcodePath(): String {
        return (getComponent() as XQrUComponent).getQrcodePath();
    }
    open fun createCode(code: String, width: Number = 100, height: Number = 100, margin: Number = 1, type: String = "QR_CODE", ForegroundColor: String = "#000000", backGroundColor: String = "#FFFFFF") {
        return (getComponent() as XQrUComponent).createCode(code, width, height, margin, type, ForegroundColor, backGroundColor);
    }
}
