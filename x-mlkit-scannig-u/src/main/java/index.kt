@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xMlkitScannigU;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Vibrator;
import android.util.Size;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
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
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.extapi.chooseImage as uni_chooseImage;
import io.dcloud.uniapp.extapi.downloadFile as uni_downloadFile;
import io.dcloud.uniapp.extapi.getStorageSync as uni_getStorageSync;
import io.dcloud.uniapp.extapi.setStorageSync as uni_setStorageSync;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
val colors = Map<String, String>(utsArrayOf(
    utsArrayOf(
        "primary",
        "#0579FF"
    ),
    utsArrayOf(
        "success",
        "#09CC54"
    ),
    utsArrayOf(
        "danger",
        "#FE6D1B"
    ),
    utsArrayOf(
        "warn",
        "#F0A22C"
    ),
    utsArrayOf(
        "error",
        "#E2001B"
    ),
    utsArrayOf(
        "info",
        "#F2F2F2"
    ),
    utsArrayOf(
        "kleinblue",
        "#002FA7"
    ),
    utsArrayOf(
        "chinesered",
        "#FF0000"
    ),
    utsArrayOf(
        "internationalorange",
        "#FF4F00"
    ),
    utsArrayOf(
        "egyptianvlue",
        "#1034A6"
    ),
    utsArrayOf(
        "parisviolet",
        "#6C3082"
    ),
    utsArrayOf(
        "moroccanblue",
        "#1256A7"
    ),
    utsArrayOf(
        "brazilgreen",
        "#009B3A"
    ),
    utsArrayOf(
        "britishracinggreen",
        "#004225"
    ),
    utsArrayOf(
        "indianyellow",
        "#E3A857"
    ),
    utsArrayOf(
        "australiangold",
        "#FFDF00"
    ),
    utsArrayOf(
        "venetianred",
        "#C80815"
    ),
    utsArrayOf(
        "majorelleblue",
        "#6050DC"
    ),
    utsArrayOf(
        "tuscanred",
        "#7C3030"
    ),
    utsArrayOf(
        "naplesyellow",
        "#FADA5E"
    ),
    utsArrayOf(
        "capumortuum",
        "#592720"
    ),
    utsArrayOf(
        "mayablue",
        "#73C2FB"
    ),
    utsArrayOf(
        "persianrose",
        "#FE28A2"
    ),
    utsArrayOf(
        "tyrianpurple",
        "#66023C"
    ),
    utsArrayOf(
        "saharasand",
        "#F1E788"
    ),
    utsArrayOf(
        "burmeseruby",
        "#B00A0A"
    ),
    utsArrayOf(
        "transparent",
        "rgba(0,0,0,0)"
    ),
    utsArrayOf(
        "aliceblue",
        "#F0F8FF"
    ),
    utsArrayOf(
        "antiquewhite",
        "#FAEBD7"
    ),
    utsArrayOf(
        "aqua",
        "#00FFFF"
    ),
    utsArrayOf(
        "aquamarine",
        "#7FFFD4"
    ),
    utsArrayOf(
        "azure",
        "#F0FFFF"
    ),
    utsArrayOf(
        "beige",
        "#F5F5DC"
    ),
    utsArrayOf(
        "bisque",
        "#FFE4C4"
    ),
    utsArrayOf(
        "black",
        "#000000"
    ),
    utsArrayOf(
        "blanchedalmond",
        "#FFEBCD"
    ),
    utsArrayOf(
        "blue",
        "#0000FF"
    ),
    utsArrayOf(
        "blueviolet",
        "#8A2BE2"
    ),
    utsArrayOf(
        "brown",
        "#A52A2A"
    ),
    utsArrayOf(
        "burlywood",
        "#DEB887"
    ),
    utsArrayOf(
        "cadetblue",
        "#5F9EA0"
    ),
    utsArrayOf(
        "chartreuse",
        "#7FFF00"
    ),
    utsArrayOf(
        "chocolate",
        "#D2691E"
    ),
    utsArrayOf(
        "coral",
        "#FF7F50"
    ),
    utsArrayOf(
        "cornflowerblue",
        "#6495ED"
    ),
    utsArrayOf(
        "cornsilk",
        "#FFF8DC"
    ),
    utsArrayOf(
        "crimson",
        "#DC143C"
    ),
    utsArrayOf(
        "cyan",
        "#00FFFF"
    ),
    utsArrayOf(
        "darkblue",
        "#00008B"
    ),
    utsArrayOf(
        "darkcyan",
        "#008B8B"
    ),
    utsArrayOf(
        "darkgoldenrod",
        "#B8860B"
    ),
    utsArrayOf(
        "darkgray",
        "#A9A9A9"
    ),
    utsArrayOf(
        "darkgreen",
        "#006400"
    ),
    utsArrayOf(
        "darkkhaki",
        "#BDB76B"
    ),
    utsArrayOf(
        "darkmagenta",
        "#8B008B"
    ),
    utsArrayOf(
        "darkolivegreen",
        "#556B2F"
    ),
    utsArrayOf(
        "darkorange",
        "#FF8C00"
    ),
    utsArrayOf(
        "darkorchid",
        "#9932CC"
    ),
    utsArrayOf(
        "darkred",
        "#8B0000"
    ),
    utsArrayOf(
        "darksalmon",
        "#E9967A"
    ),
    utsArrayOf(
        "darkseagreen",
        "#8FBC8F"
    ),
    utsArrayOf(
        "darkslateblue",
        "#483D8B"
    ),
    utsArrayOf(
        "darkslategray",
        "#2F4F4F"
    ),
    utsArrayOf(
        "darkturquoise",
        "#00CED1"
    ),
    utsArrayOf(
        "darkviolet",
        "#9400D3"
    ),
    utsArrayOf(
        "deeppink",
        "#FF1493"
    ),
    utsArrayOf(
        "deepskyblue",
        "#00BFFF"
    ),
    utsArrayOf(
        "dimgray",
        "#696969"
    ),
    utsArrayOf(
        "dodgerblue",
        "#1E90FF"
    ),
    utsArrayOf(
        "firebrick",
        "#B22222"
    ),
    utsArrayOf(
        "floralwhite",
        "#FFFAF0"
    ),
    utsArrayOf(
        "forestgreen",
        "#228B22"
    ),
    utsArrayOf(
        "fuchsia",
        "#FF00FF"
    ),
    utsArrayOf(
        "gainsboro",
        "#DCDCDC"
    ),
    utsArrayOf(
        "ghostwhite",
        "#F8F8FF"
    ),
    utsArrayOf(
        "gold",
        "#FFD700"
    ),
    utsArrayOf(
        "goldenrod",
        "#DAA520"
    ),
    utsArrayOf(
        "gray",
        "#808080"
    ),
    utsArrayOf(
        "green",
        "#008000"
    ),
    utsArrayOf(
        "greenyellow",
        "#ADFF2F"
    ),
    utsArrayOf(
        "honeydew",
        "#F0FFF0"
    ),
    utsArrayOf(
        "hotpink",
        "#FF69B4"
    ),
    utsArrayOf(
        "indianred",
        "#CD5C5C"
    ),
    utsArrayOf(
        "indigo",
        "#4B0082"
    ),
    utsArrayOf(
        "ivory",
        "#FFFFF0"
    ),
    utsArrayOf(
        "khaki",
        "#F0E68C"
    ),
    utsArrayOf(
        "lavender",
        "#E6E6FA"
    ),
    utsArrayOf(
        "lavenderblush",
        "#FFF0F5"
    ),
    utsArrayOf(
        "lawngreen",
        "#7CFC00"
    ),
    utsArrayOf(
        "lemonchiffon",
        "#FFFACD"
    ),
    utsArrayOf(
        "lightblue",
        "#ADD8E6"
    ),
    utsArrayOf(
        "lightcoral",
        "#F08080"
    ),
    utsArrayOf(
        "lightcyan",
        "#E0FFFF"
    ),
    utsArrayOf(
        "lightgoldenrodyellow",
        "#FAFAD2"
    ),
    utsArrayOf(
        "lightgray",
        "#D3D3D3"
    ),
    utsArrayOf(
        "lightgreen",
        "#90EE90"
    ),
    utsArrayOf(
        "lightpink",
        "#FFB6C1"
    ),
    utsArrayOf(
        "lightsalmon",
        "#FFA07A"
    ),
    utsArrayOf(
        "lightseagreen",
        "#20B2AA"
    ),
    utsArrayOf(
        "lightskyblue",
        "#87CEFA"
    ),
    utsArrayOf(
        "lightslategray",
        "#778899"
    ),
    utsArrayOf(
        "lightsteelblue",
        "#B0C4DE"
    ),
    utsArrayOf(
        "lightyellow",
        "#FFFFE0"
    ),
    utsArrayOf(
        "lime",
        "#00FF00"
    ),
    utsArrayOf(
        "limegreen",
        "#32CD32"
    ),
    utsArrayOf(
        "linen",
        "#FAF0E6"
    ),
    utsArrayOf(
        "magenta",
        "#FF00FF"
    ),
    utsArrayOf(
        "maroon",
        "#800000"
    ),
    utsArrayOf(
        "mediumaquamarine",
        "#66CDAA"
    ),
    utsArrayOf(
        "mediumblue",
        "#0000CD"
    ),
    utsArrayOf(
        "mediumorchid",
        "#BA55D3"
    ),
    utsArrayOf(
        "mediumpurple",
        "#9370DB"
    ),
    utsArrayOf(
        "mediumseagreen",
        "#3CB371"
    ),
    utsArrayOf(
        "mediumslateblue",
        "#7B68EE"
    ),
    utsArrayOf(
        "mediumspringgreen",
        "#00FA9A"
    ),
    utsArrayOf(
        "mediumturquoise",
        "#48D1CC"
    ),
    utsArrayOf(
        "mediumvioletred",
        "#C71585"
    ),
    utsArrayOf(
        "midnightblue",
        "#191970"
    ),
    utsArrayOf(
        "mintcream",
        "#F5FFFA"
    ),
    utsArrayOf(
        "mistyrose",
        "#FFE4E1"
    ),
    utsArrayOf(
        "moccasin",
        "#FFE4B5"
    ),
    utsArrayOf(
        "navajowhite",
        "#FFDEAD"
    ),
    utsArrayOf(
        "navy",
        "#000080"
    ),
    utsArrayOf(
        "oldlace",
        "#FDF5E6"
    ),
    utsArrayOf(
        "olive",
        "#808000"
    ),
    utsArrayOf(
        "olivedrab",
        "#6B8E23"
    ),
    utsArrayOf(
        "orange",
        "#FFA500"
    ),
    utsArrayOf(
        "orangered",
        "#FF4500"
    ),
    utsArrayOf(
        "orchid",
        "#DA70D6"
    ),
    utsArrayOf(
        "palegoldenrod",
        "#EEE8AA"
    ),
    utsArrayOf(
        "palegreen",
        "#98FB98"
    ),
    utsArrayOf(
        "paleturquoise",
        "#AFEEEE"
    ),
    utsArrayOf(
        "palevioletred",
        "#DB7093"
    ),
    utsArrayOf(
        "papayawhip",
        "#FFEFD5"
    ),
    utsArrayOf(
        "peachpuff",
        "#FFDAB9"
    ),
    utsArrayOf(
        "peru",
        "#CD853F"
    ),
    utsArrayOf(
        "pink",
        "#FFC0CB"
    ),
    utsArrayOf(
        "plum",
        "#DDA0DD"
    ),
    utsArrayOf(
        "powderblue",
        "#B0E0E6"
    ),
    utsArrayOf(
        "purple",
        "#800080"
    ),
    utsArrayOf(
        "rebeccapurple",
        "#663399"
    ),
    utsArrayOf(
        "red",
        "#FF0000"
    ),
    utsArrayOf(
        "rosybrown",
        "#BC8F8F"
    ),
    utsArrayOf(
        "royalblue",
        "#4169E1"
    ),
    utsArrayOf(
        "saddlebrown",
        "#8B4513"
    ),
    utsArrayOf(
        "salmon",
        "#FA8072"
    ),
    utsArrayOf(
        "sandybrown",
        "#F4A460"
    ),
    utsArrayOf(
        "seagreen",
        "#2E8B57"
    ),
    utsArrayOf(
        "seashell",
        "#FFF5EE"
    ),
    utsArrayOf(
        "sienna",
        "#A0522D"
    ),
    utsArrayOf(
        "silver",
        "#C0C0C0"
    ),
    utsArrayOf(
        "skyblue",
        "#87CEEB"
    ),
    utsArrayOf(
        "slateblue",
        "#6A5ACD"
    ),
    utsArrayOf(
        "slategray",
        "#708090"
    ),
    utsArrayOf(
        "snow",
        "#FFFAFA"
    ),
    utsArrayOf(
        "springgreen",
        "#00FF7F"
    ),
    utsArrayOf(
        "steelblue",
        "#4682B4"
    ),
    utsArrayOf(
        "tan",
        "#D2B48C"
    ),
    utsArrayOf(
        "teal",
        "#008080"
    ),
    utsArrayOf(
        "thistle",
        "#D8BFD8"
    ),
    utsArrayOf(
        "tomato",
        "#FF6347"
    ),
    utsArrayOf(
        "turquoise",
        "#40E0D0"
    ),
    utsArrayOf(
        "violet",
        "#EE82EE"
    ),
    utsArrayOf(
        "wheat",
        "#F5DEB3"
    ),
    utsArrayOf(
        "white",
        "#FFFFFF"
    ),
    utsArrayOf(
        "whitesmoke",
        "#F5F5F5"
    ),
    utsArrayOf(
        "yellow",
        "#FFFF00"
    ),
    utsArrayOf(
        "yellowgreen",
        "#9ACD32"
    )
));
fun isValidColor(color: String): Boolean {
    val hexRegex = UTSRegExp("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}|[A-Fa-f0-9]{8})\$", "");
    val rgbRegex = UTSRegExp("^rgb\\((\\d{1,3}), (\\d{1,3}), (\\d{1,3})\\)\$", "");
    val rgbaRegex = UTSRegExp("^rgba\\((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\s*,\\s*(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\s*,\\s*(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\s*,\\s*((1(\\.0{1,2})?)|(0(\\.\\d{1,2})?))\\)\$", "");
    val hslRegex = UTSRegExp("^hsl\\((\\d{1,3}), (\\d{1,3})%, (\\d{1,3})%\\)\$", "");
    val hslaRegex = UTSRegExp("^hsla\\(\\s*((\\d{1,2}|[1-2]\\d{2}|3[0-5]\\d)(\\.\\d+)?|\\d+(\\.\\d+)?)\\s*,\\s*((\\d{1,2}|\\d{0,1}\\d{1}\\d{1}|[1-2]\\d{2}|3[0-5]\\d)(\\.\\d+)?|\\d+(\\.\\d+)?)%\\s*,\\s*((\\d{1,2}|\\d{0,1}\\d{1}\\d{1}|[1-2]\\d{2}|3[0-5]\\d)(\\.\\d+)?|\\d+(\\.\\d+)?)%\\s*,\\s*((1|0(\\.\\d{1,2})?|(\\.\\d{1,2})))\\)\$", "i");
    if (color == "") {
        return false;
    } else if (color === "inherit" || color === "transparent") {
        return false;
    } else if (color === "currentColor") {
        return false;
    } else if (hexRegex.test(color) || rgbRegex.test(color) || rgbaRegex.test(color) || hslRegex.test(color) || hslaRegex.test(color)) {
        return true;
    }
    return false;
}
fun getDefaultColor(sColor: String): String {
    if (sColor == "") {
        return "";
    }
    var sc = sColor.toLocaleLowerCase().trim().replace(" ", "");
    if (isValidColor(sc)) {
        return sc;
    }
    var sco = colors.get(sc);
    if (UTSAndroid.`typeof`( sco) == "string") {
        return sco as String;
    }
    return colors.get("primary")!!;
}
fun getUid(rdix: Number = 1, length: Number = 12): String {
    var ix = "";
    ix = Math.floor(Math.random() * rdix * Math.floor(Math.random() * Date.now())).toString().substring(0, length as Int);
    return ix;
}
open class MyTouchListener : View.OnTouchListener {
    open var callbackFun: (types: String, event: MotionEvent, detail: UTSJSONObject) -> Unit;
    open var dubleTime: Number = 0;
    open var tid: Number = 56;
    open var _x: Number = 0;
    open var _y: Number = 0;
    open var swipe_mindiff: Number = 40;
    open var tid_siper: Number = 100;
    open var swipeDirection = "";
    constructor(call: (types: String, event: MotionEvent, detail: UTSJSONObject?) -> Unit){
        this.callbackFun = call;
    }
    override fun onTouch(view: View, event: MotionEvent): Boolean {
        if (event.action == MotionEvent.ACTION_DOWN) {
            this._x = event.getX();
            this._y = event.getY();
            this.swipeDirection = "";
            this.callbackFun("down", event, UTSJSONObject());
            var difftime = Date().getTime() - this.dubleTime;
            if (difftime > 0 && difftime <= 300) {
                this.callbackFun("doubleClick", event, UTSJSONObject());
            }
            this.dubleTime = Date().getTime();
            clearTimeout(this.tid);
            tid = setTimeout(fun() {
                this.callbackFun("longPress", event, UTSJSONObject());
            }
            , 800);
        }
        if (event.action == MotionEvent.ACTION_UP) {
            clearTimeout(this.tid);
            this.callbackFun("up", event, UTSJSONObject());
            if (Date().getTime() - this.dubleTime > 50) {
                this.callbackFun("click", event, UTSJSONObject());
            }
        }
        if (event.action == MotionEvent.ACTION_CANCEL || event.action == MotionEvent.ACTION_OUTSIDE) {
            this.callbackFun("cancel", event, UTSJSONObject());
            clearTimeout(this.tid);
        }
        if (event.action == MotionEvent.ACTION_MOVE) {
            var x = event.getX();
            var y = event.getY();
            var deltaX = Math.abs(x - this._x);
            var deltaY = Math.abs(y - this._y);
            if (deltaX > deltaY && deltaX > this.swipe_mindiff) {
                this.swipeDirection = if ((this._x > x)) {
                    "left";
                } else {
                    "right";
                };
            } else if (deltaY > deltaX && deltaY > this.swipe_mindiff) {
                this.swipeDirection = if ((this._y < y)) {
                    "down";
                } else {
                    "up";
                }
                ;
            }
            if (this.swipeDirection != "") {
                this.callbackFun("swiper", event, let {
                    object : UTSJSONObject() {
                        var x = x
                        var y = y
                        var diffX = deltaX
                        var diffY = deltaY
                        var direction = it.swipeDirection
                    }
                });
            }
            this.callbackFun("move", event, UTSJSONObject());
            clearTimeout(this.tid);
        }
        return true;
    }
}
open class xView {
    open var view: Any;
    open var tagId: String = "x_view_id_" + getUid();
    open var bgView: GradientDrawable;
    private var _onclickFun = fun(_event: MotionEvent): Unit {};
    private var _onTouchStart = fun(_event: MotionEvent): Unit {};
    private var _onTouchEnd = fun(_event: MotionEvent): Unit {};
    private var _onTouchCancel = fun(_event: MotionEvent): Unit {};
    private var _onTouchMove = fun(_event: MotionEvent): Unit {};
    private var _onTouchLongPress = fun(_event: MotionEvent): Unit {};
    private var _onTouchDubleClick = fun(_event: MotionEvent): Unit {};
    private var _onTouchSwiper = fun(_event: MotionEvent, detail: UTSJSONObject?): Unit {};
    private var _disabled = false;
    constructor(context: Context){
        var view = View(context);
        view.setTag(this.tagId);
        var layoutParams_crd = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(layoutParams_crd);
        this.bgView = GradientDrawable();
        this.bgView.setShape(GradientDrawable.RECTANGLE);
        this.bgView.setColor(Color.WHITE);
        this.bgView.mutate();
        view.setBackground(this.bgView);
        this.view = view;
        view.setOnTouchListener(MyTouchListener(fun(types: String, event: MotionEvent, detail: UTSJSONObject?): Unit {
            if (this._disabled == false) {
                if (types == "down") {
                    this._onTouchStart(event);
                }
                if (types == "up") {
                    this._onTouchEnd(event);
                }
                if (types == "click") {
                    this._onclickFun(event);
                }
                if (types == "move") {
                    this._onTouchMove(event);
                }
                if (types == "cancel") {
                    this._onTouchCancel(event);
                }
                if (types == "longPress") {
                    this._onTouchLongPress(event);
                }
                if (types == "doubleClick") {
                    this._onTouchDubleClick(event);
                }
                if (types == "swiper") {
                    this._onTouchSwiper(event, detail);
                }
            }
        }
        ));
    }
    open fun getView(): View {
        return this.view as View;
    }
    open fun setDisabled(dis: Boolean): xView {
        this._disabled = dis;
        return this;
    }
    open fun setSwiper(kFun: (event: MotionEvent, detail: UTSJSONObject?) -> Unit): xView {
        if (UTSAndroid.`typeof`( kFun) !== "undefined") {
            this._onTouchSwiper = kFun;
        }
        return this;
    }
    open fun setDoubleClick(kFun: (event: MotionEvent) -> Unit): xView {
        if (UTSAndroid.`typeof`( kFun) !== "undefined") {
            this._onTouchDubleClick = kFun;
        }
        return this;
    }
    open fun setClick(kFun: (event: MotionEvent) -> Unit): xView {
        if (UTSAndroid.`typeof`( kFun) !== "undefined") {
            this._onclickFun = kFun;
        }
        return this;
    }
    open fun setTouchStart(kFun: (event: MotionEvent) -> Unit): xView {
        if (UTSAndroid.`typeof`( kFun) !== "undefined") {
            this._onTouchStart = kFun;
        }
        return this;
    }
    open fun setTouchMove(kFun: (event: MotionEvent) -> Unit): xView {
        if (UTSAndroid.`typeof`( kFun) !== "undefined") {
            this._onTouchMove = kFun;
        }
        return this;
    }
    open fun setTouchEnd(kFun: (event: MotionEvent) -> Unit): xView {
        if (UTSAndroid.`typeof`( kFun) !== "undefined") {
            this._onTouchEnd = kFun;
        }
        return this;
    }
    open fun setTouchCancel(kFun: (event: MotionEvent) -> Unit): xView {
        if (UTSAndroid.`typeof`( kFun) !== "undefined") {
            this._onTouchCancel = kFun;
        }
        return this;
    }
    open fun setTouchLongPress(kFun: (event: MotionEvent) -> Unit): xView {
        if (UTSAndroid.`typeof`( kFun) !== "undefined") {
            this._onTouchLongPress = kFun;
        }
        return this;
    }
    open fun setBackgroundColor(colorStr: String): xView {
        this.bgView.mutate();
        if (colorStr == "transparent") {
            this.bgView.setColor(Color.TRANSPARENT);
        } else {
            this.bgView.setColor(Color.parseColor(getDefaultColor(colorStr)));
        }
        return this;
    }
    open fun setBorder(w: Number?, colorStr: String?, dashed: Boolean?): xView {
        this.bgView.mutate();
        var tw: Number = 1;
        var tcolor = "transparent";
        if (UTSAndroid.`typeof`( tw) !== "undefined") {
            tw = w as Number;
        }
        if (UTSAndroid.`typeof`( tw) !== "undefined") {
            tcolor = colorStr as String;
        }
        if (UTSAndroid.`typeof`( dashed) !== "undefined") {
            dashed as Boolean;
        }
        var colorNum = Color.TRANSPARENT;
        if (tcolor != "transparent") {
            colorNum = Color.parseColor(getDefaultColor(tcolor));
        }
        if (dashed == true) {
            var dashedWidth: Number = 8;
            var dashedGap: Number = 5;
            this.bgView.setStroke(tw.toInt(), colorNum, dashedWidth.toFloat(), dashedGap.toFloat());
        } else {
            this.bgView.setStroke(tw.toInt(), colorNum);
        }
        return this;
    }
    open fun setMargin(n: Any): xView {
        var view = this.view as View;
        var selfPrams = view.getLayoutParams();
        var params = LinearLayout.LayoutParams(selfPrams.width, selfPrams.height);
        if (UTSArray.isArray(n)) {
            var rd = n as UTSArray<Number>;
            if (rd.length == 0) {
                var rds: Number = 0;
                var rdf = rds.toInt();
                params.setMargins(rdf, rdf, rdf, rdf);
            } else if (rd.length == 1) {
                var rdf = rd[0].toInt();
                params.setMargins(rdf, rdf, rdf, rdf);
            } else if (rd.length == 2) {
                params.setMargins(rd[0].toInt(), rd[1].toInt(), rd[0].toInt(), rd[1].toInt());
            } else if (rd.length == 3) {
                var rds: Number = 0;
                var rdf = rds.toInt();
                params.setMargins(rd[0].toInt(), rd[1].toInt(), rd[2].toInt(), rdf);
            } else if (rd.length == 4) {
                params.setMargins(rd[0].toInt(), rd[1].toInt(), rd[2].toInt(), rd[3].toInt());
            }
        } else {
            var rd = n as Number;
            var rdf = rd.toInt();
            params.setMargins(rdf, rdf, rdf, rdf);
        }
        view.setLayoutParams(params);
        return this;
    }
    open fun setPadding(n: Any): xView {
        var view = this.view as View;
        if (UTSArray.isArray(n)) {
            var rd = n as UTSArray<Number>;
            if (rd.length == 0) {
                var rds: Number = 0;
                var rdf = rds.toInt();
                view.setPadding(rdf, rdf, rdf, rdf);
            } else if (rd.length == 1) {
                var rdf = rd[0].toInt();
                view.setPadding(rdf, rdf, rdf, rdf);
            } else if (rd.length == 2) {
                view.setPadding(rd[0].toInt(), rd[1].toInt(), rd[0].toInt(), rd[1].toInt());
            } else if (rd.length == 3) {
                var rds: Number = 0;
                var rdf = rds.toInt();
                view.setPadding(rd[0].toInt(), rd[1].toInt(), rd[2].toInt(), rdf);
            } else if (rd.length == 4) {
                view.setPadding(rd[0].toInt(), rd[1].toInt(), rd[2].toInt(), rd[3].toInt());
            }
        } else {
            var rd = n as Number;
            var rdf = rd.toInt();
            view.setPadding(rdf, rdf, rdf, rdf);
        }
        return this;
    }
    open fun setRadius(radius: Any): xView {
        var x: Number = 0;
        this.bgView.mutate();
        if (UTSArray.isArray(radius)) {
            var rd = radius as UTSArray<Number>;
            if (rd.length == 0) {
                var rdfs: Number = 0;
                this.bgView.setCornerRadius(rdfs.toFloat());
            } else if (rd.length == 1) {
                var rdfs = rd[0];
                this.bgView.setCornerRadius(rdfs.toFloat());
            } else if (rd.length == 2) {
                var tl = utsArrayOf(
                    rd[0].toFloat(),
                    rd[0].toFloat(),
                    rd[1].toFloat(),
                    rd[1].toFloat(),
                    x.toFloat(),
                    x.toFloat(),
                    x.toFloat(),
                    x.toFloat()
                );
                var tlint = tl.toKotlinList().toFloatArray();
                this.bgView.setCornerRadii(tlint);
            } else if (rd.length == 3) {
                var tl = utsArrayOf(
                    rd[0].toFloat(),
                    rd[0].toFloat(),
                    rd[1].toFloat(),
                    rd[1].toFloat(),
                    rd[2].toFloat(),
                    rd[2].toFloat(),
                    x.toFloat(),
                    x.toFloat()
                );
                var tlint = tl.toKotlinList().toFloatArray();
                this.bgView.setCornerRadii(tlint);
            } else if (rd.length == 4) {
                var tl = utsArrayOf(
                    rd[0].toFloat(),
                    rd[0].toFloat(),
                    rd[1].toFloat(),
                    rd[1].toFloat(),
                    rd[2].toFloat(),
                    rd[2].toFloat(),
                    rd[3].toFloat(),
                    rd[3].toFloat()
                );
                var tlint = tl.toKotlinList().toFloatArray();
                this.bgView.setCornerRadii(tlint);
            }
        } else {
            var rd = radius as Number;
            this.bgView.setCornerRadius(rd.toFloat());
        }
        return this;
    }
    open fun setSizeBy(w: String = "100%", h: String = "auto") {
        var view = this.view as View;
        var ww = ViewGroup.LayoutParams.MATCH_PARENT;
        var hh = ViewGroup.LayoutParams.MATCH_PARENT;
        if (w == "auto") {
            ww = ViewGroup.LayoutParams.WRAP_CONTENT;
        }
        if (h == "auto") {
            hh = ViewGroup.LayoutParams.WRAP_CONTENT;
        }
        var layoutParams_crd = LinearLayout.LayoutParams(ww, hh);
        view.setLayoutParams(layoutParams_crd);
    }
    open fun setSize(width: Number, height: Number): xView {
        var view = this.view as View;
        var layoutParams_crd = LinearLayout.LayoutParams(width.toInt(), height.toInt());
        view.setLayoutParams(layoutParams_crd);
        return this;
    }
    open fun setWidth(width: Number): xView {
        var view = this.view as View;
        var lpar = view.getLayoutParams();
        var layoutParams_crd = LinearLayout.LayoutParams(width.toInt(), lpar.height.toInt());
        view.setLayoutParams(layoutParams_crd);
        return this;
    }
    open fun setHeight(height: Number): xView {
        var view = this.view as View;
        var lpar = view.getLayoutParams();
        var layoutParams_crd = LinearLayout.LayoutParams(lpar.width.toInt(), height.toInt());
        view.setLayoutParams(layoutParams_crd);
        return this;
    }
}
open class SCANNING_PHOTO_RESULT_BOUND (
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
    @JsonNotNull
    open var centerX: Number,
    @JsonNotNull
    open var centerY: Number,
) : UTSObject()
open class SCANNING_PHOTO_RESULT (
    @JsonNotNull
    open var url: String,
    @JsonNotNull
    open var position: UTSArray<UTSArray<UTSArray<Number>>>,
    @JsonNotNull
    open var bounds: UTSArray<SCANNING_PHOTO_RESULT_BOUND>,
    @JsonNotNull
    open var text: UTSArray<String>,
) : UTSObject()
open class CAMERA_PHOTO_SIZE (
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSObject()
typealias CallFunType = (str: UTSArray<String>, type: String) -> Unit;
typealias BARCODEFORMAT = String;
open class SCANNING_OPTIONS (
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
    @JsonNotNull
    open var cameraDevice: String,
    open var zoom: Number? = null,
    open var continuousScan: Boolean? = null,
    open var vibatar: Boolean? = null,
    open var scanSpeedduration: Number? = null,
    open var scanningQrCode: Boolean? = null,
    open var isSavePhoto: Boolean? = null,
    open var qrCodeType: BARCODEFORMAT? = null,
    @JsonNotNull
    open var flashMode: Boolean = false,
) : UTSObject()
fun chooseImage(): UTSPromise<SCANNING_PHOTO_RESULT?> {
    return UTSPromise(fun(res, _reject){
        uni_chooseImage(ChooseImageOptions(count = 1, success = fun(evt: ChooseImageSuccess) {
            console.log("**");
            if (evt.tempFilePaths.length > 0) {
                console.log(evt, "----");
                val imgs = evt.tempFilePaths[0] as String;
                try {
                    val decodedPath = Uri.decode(imgs).substring(7);
                    val file = File(decodedPath);
                    var image = InputImage.fromFilePath(UTSAndroid.getAppContext() as Context, Uri.fromFile(file));
                    var scanner = BarcodeScanning.getClient();
                    scanner.process(image).addOnSuccessListener(fun(barcodes){
                        var listpos = utsArrayOf<UTSArray<UTSArray<Number>>>();
                        var bounedlist = utsArrayOf<SCANNING_PHOTO_RESULT_BOUND>();
                        var rulstText = utsArrayOf<String>();
                        for(barcode in resolveUTSKeyIterator(barcodes)){
                            var bounds = barcode.boundingBox;
                            var corners = barcode.cornerPoints;
                            var rawValue = barcode.rawValue;
                            var valueType = barcode.valueType;
                            if (rawValue != null && bounds != null && corners != null) {
                                var iminfo = SCANNING_PHOTO_RESULT_BOUND(width = bounds!!.width(), height = bounds!!.height(), centerX = bounds!!.centerX(), centerY = bounds!!.centerY());
                                var posinfo = utsArrayOf<UTSArray<Number>>();
                                for(pos in resolveUTSKeyIterator(corners)){
                                    posinfo.push(utsArrayOf<Number>(pos!!.x as Number, pos!!.y as Number));
                                }
                                listpos.push(posinfo);
                                bounedlist.push(iminfo);
                                rulstText.push(rawValue);
                            }
                        }
                        res(SCANNING_PHOTO_RESULT(url = imgs, position = listpos, bounds = bounedlist, text = rulstText));
                    }
                    );
                }
                 catch (e: IOException) {
                    res(null);
                }
            }
        }
        , fail = fun(_) {
            res(null);
        }
        ));
    }
    );
}
fun decoderUriPathToQr(filePath: Uri): UTSPromise<SCANNING_PHOTO_RESULT?> {
    return UTSPromise(fun(res, _reject){
        var image = InputImage.fromFilePath(UTSAndroid.getAppContext() as Context, filePath);
        var scanner = BarcodeScanning.getClient();
        scanner.process(image).addOnSuccessListener(fun(barcodes){
            var listpos = utsArrayOf<UTSArray<UTSArray<Number>>>();
            var bounedlist = utsArrayOf<SCANNING_PHOTO_RESULT_BOUND>();
            var rulstText = utsArrayOf<String>();
            for(barcode in resolveUTSKeyIterator(barcodes)){
                var bounds = barcode.boundingBox;
                var corners = barcode.cornerPoints;
                var rawValue = barcode.rawValue;
                var valueType = barcode.valueType;
                if (rawValue != null && bounds != null && corners != null) {
                    var iminfo = SCANNING_PHOTO_RESULT_BOUND(width = bounds!!.width(), height = bounds!!.height(), centerX = bounds!!.centerX(), centerY = bounds!!.centerY());
                    var posinfo = utsArrayOf<UTSArray<Number>>();
                    for(pos in resolveUTSKeyIterator(corners)){
                        posinfo.push(utsArrayOf<Number>(pos!!.x as Number, pos!!.y as Number));
                    }
                    listpos.push(posinfo);
                    bounedlist.push(iminfo);
                    rulstText.push(rawValue);
                }
            }
            res(SCANNING_PHOTO_RESULT(url = "", position = listpos, bounds = bounedlist, text = rulstText));
        }
        );
    }
    );
}
fun decoderBuffToQr(bitmap: ByteArray, width: Number, height: Number, ration: Number): UTSPromise<SCANNING_PHOTO_RESULT?> {
    return UTSPromise(fun(res, _reject){
        var options = BarcodeScannerOptions.Builder().setBarcodeFormats(Barcode.FORMAT_QR_CODE, Barcode.FORMAT_EAN_13, Barcode.FORMAT_CODE_128, Barcode.FORMAT_CODABAR).build();
        var image = InputImage.fromByteArray(bitmap, width.toInt(), height.toInt(), ration.toInt(), InputImage.IMAGE_FORMAT_NV21);
        var scanner = BarcodeScanning.getClient(options);
        scanner.process(image).addOnSuccessListener(fun(barcodes){
            var listpos = utsArrayOf<UTSArray<UTSArray<Number>>>();
            var bounedlist = utsArrayOf<SCANNING_PHOTO_RESULT_BOUND>();
            var rulstText = utsArrayOf<String>();
            for(barcode in resolveUTSKeyIterator(barcodes)){
                var bounds = barcode.boundingBox;
                var corners = barcode.cornerPoints;
                var rawValue = barcode.rawValue;
                var valueType = barcode.valueType;
                if (rawValue != null && bounds != null && corners != null) {
                    var iminfo = SCANNING_PHOTO_RESULT_BOUND(width = bounds!!.width(), height = bounds!!.height(), centerX = bounds!!.centerX(), centerY = bounds!!.centerY());
                    var posinfo = utsArrayOf<UTSArray<Number>>();
                    for(pos in resolveUTSKeyIterator(corners)){
                        posinfo.push(utsArrayOf<Number>(pos!!.x as Number, pos!!.y as Number));
                    }
                    listpos.push(posinfo);
                    bounedlist.push(iminfo);
                    rulstText.push(rawValue);
                }
            }
            res(SCANNING_PHOTO_RESULT(url = "", position = listpos, bounds = bounedlist, text = rulstText));
        }
        ).addOnFailureListener(fun(e){
            res(null);
        }
        );
    }
    );
}
fun urlPathDecoderQr(url: String): UTSPromise<SCANNING_PHOTO_RESULT?> {
    return UTSPromise(fun(res, _reject){
        uni_downloadFile(DownloadFileOptions(url = url, success = fun(res) {
            val contentResolver = UTSAndroid.getAppContext()!!.contentResolver;
            var decodedPath = res.tempFilePath;
            if (res.tempFilePath.indexOf("file://") > -1) {
                decodedPath = Uri.decode(res.tempFilePath).substring(7);
            }
            try {
                val file = File(decodedPath);
                var image = InputImage.fromFilePath(UTSAndroid.getAppContext() as Context, Uri.fromFile(file));
                var scanner = BarcodeScanning.getClient();
                scanner.process(image).addOnSuccessListener(fun(barcodes){
                    var listpos = utsArrayOf<UTSArray<UTSArray<Number>>>();
                    var bounedlist = utsArrayOf<SCANNING_PHOTO_RESULT_BOUND>();
                    var rulstText = utsArrayOf<String>();
                    for(barcode in resolveUTSKeyIterator(barcodes)){
                        var bounds = barcode.boundingBox;
                        var corners = barcode.cornerPoints;
                        var rawValue = barcode.rawValue;
                        var valueType = barcode.valueType;
                        if (rawValue != null && bounds != null && corners != null) {
                            var iminfo = SCANNING_PHOTO_RESULT_BOUND(width = bounds!!.width(), height = bounds!!.height(), centerX = bounds!!.centerX(), centerY = bounds!!.centerY());
                            var posinfo = utsArrayOf<UTSArray<Number>>();
                            for(pos in resolveUTSKeyIterator(corners)){
                                posinfo.push(utsArrayOf<Number>(pos!!.x as Number, pos!!.y as Number));
                            }
                            listpos.push(posinfo);
                            bounedlist.push(iminfo);
                            rulstText.push(rawValue);
                        }
                    }
                    res(SCANNING_PHOTO_RESULT(url = url, position = listpos, bounds = bounedlist, text = rulstText));
                }
                );
            }
             catch (e: IOException) {
                res(null);
            }
        }
        , fail = fun(_) {
            res(null);
        }
        ));
    }
    );
}
open class buffoptsPlanesType (
    @JsonNotNull
    open var data: ByteBuffer,
    @JsonNotNull
    open var getRowStride: Number,
    @JsonNotNull
    open var getPixelStride: Number,
) : UTSObject()
open class buffoptsType (
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
    @JsonNotNull
    open var format: Number,
    @JsonNotNull
    open var rect: Rect,
    @JsonNotNull
    open var planes: UTSArray<buffoptsPlanesType>,
) : UTSObject()
open class cameraListNameType (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var device: CameraCharacteristics,
) : UTSObject()
open class xCamera {
    open var parentView: FrameLayout;
    open var resultView: RelativeLayout? = null;
    open var viewBox_width: Number = 0;
    open var viewBox_height: Number = 0;
    open var imgPointsBycanmarea = utsArrayOf<RelativeLayout>();
    open var options = SCANNING_OPTIONS(width = 800, height = 800, cameraDevice = "BACK", scanSpeedduration = 450, scanningQrCode = true, isSavePhoto = false, qrCodeType = null, vibatar = true, zoom = 3, continuousScan = false);
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
    open var isDecoderQring = false;
    open var isOpeningCameraing = false;
    open var callFunEvent: CallFunType = fun(str: UTSArray<String>, type: String){};
    open var tempresultList = utsArrayOf<String>();
    open var isAppPause = false;
    open var flashMode = false;
    constructor(GroupView: FrameLayout, options: SCANNING_OPTIONS? = null){
        this.context = UTSAndroid.getAppContext()!! as Context;
        this.parentView = GroupView;
        if (options != null) {
            this.options = SCANNING_OPTIONS(width = options.width, height = options.height, cameraDevice = options.cameraDevice, scanSpeedduration = if (options.scanSpeedduration == null) {
                this.options.scanSpeedduration;
            } else {
                options.scanSpeedduration;
            }
            , scanningQrCode = if (options.scanningQrCode == null) {
                this.options.scanningQrCode;
            } else {
                options.scanningQrCode;
            }
            , isSavePhoto = if (options.isSavePhoto == null) {
                this.options.isSavePhoto;
            } else {
                options.isSavePhoto;
            }
            , qrCodeType = if (options.qrCodeType == null) {
                this.options.qrCodeType;
            } else {
                options.qrCodeType;
            }
            , vibatar = if (options.vibatar == null) {
                this.options.vibatar;
            } else {
                options.vibatar;
            }
            , zoom = if (options.zoom == null) {
                this.options.zoom;
            } else {
                options.zoom;
            }
            , continuousScan = if (options.continuousScan == null) {
                this.options.continuousScan;
            } else {
                options.continuousScan;
            }
            );
            this.flashMode = options.flashMode;
        }
        this.cameraService = this.context!!.getSystemService(Context.CAMERA_SERVICE) as CameraManager;
        this.vibrator = this.context!!.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator;
        this._createCameraView();
        this._creatCameraResultView();
    }
    open fun setVibatar() {
        if (this.vibrator == null) {
            return;
        }
        if (this.vibrator!!.hasVibrator()) {
            this.vibrator!!.vibrate(80);
        }
    }
    private fun _createCameraView() {
        var sv = PreviewView(UTSAndroid.getAppContext()!!);
        sv.scaleType = PreviewView.ScaleType.FILL_CENTER;
        var layaout = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sv.setLayoutParams(layaout);
        this.cameraView = sv;
        this.parentView.addView(this.cameraView!!);
    }
    private fun _creatCameraResultView() {
        var t = this;
        var resultView = RelativeLayout(this.context);
        var layaout = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        resultView.setLayoutParams(layaout);
        this.resultView = resultView;
        this.parentView.addView(this.resultView!!);
        open class previewChangeRectadd : View.OnLayoutChangeListener {
            override fun onLayoutChange(v: View, left: Int, top: Int, right: Int, bottom: Int, oldLeft: Int, oldTop: Int, oldRight: Int, oldBottom: Int) {
                t.viewBox_width = right - left;
                t.viewBox_height = bottom - top;
            }
        }
        this.parentView!!.addOnLayoutChangeListener(previewChangeRectadd());
    }
    open fun openCamera(): UTSPromise<Boolean> {
        var _this = this;
        if (this.isOpeningCameraing) {
            this.closeCamera();
        }
        return UTSPromise(fun(res, rej){
            _this.checkPermissions().then(fun(res: Boolean){
                if (!res) {
                    uni_showToast(ShowToastOptions(title = "未授权相机使用权", icon = "none"));
                    return;
                }
                try {
                    _this._openCamera();
                }
                 catch (e: Throwable) {
                    console.log(e);
                }
                res(true);
            }
            ).`catch`(fun(){
                uni_showToast(ShowToastOptions(title = "未授权相机使用权", icon = "none"));
                rej(false);
            }
            );
        }
        );
    }
    open fun setCallEvent(call: CallFunType) {
        this.callFunEvent = call;
    }
    open fun getCamraRotation(): Number {
        return 0;
    }
    open fun setFlashModel(flash: Boolean) {
        if (this.camera != null && this.isOpeningCameraing) {
            var cameraControl = this.camera!!.cameraControl!!;
            cameraControl.enableTorch(flash);
        }
    }
    open fun closeCamera() {
        this.setFlashModel(false);
        this.cameraProvider?.unbindAll();
        this.cameraPreview?.setSurfaceProvider(null);
        this.isOpeningCameraing = false;
        run {
            var i: Number = 0;
            while(i < this.imgPointsBycanmarea.length){
                this.resultView?.removeView(this.imgPointsBycanmarea[i]);
                i++;
            }
        }
    }
    private fun _openCamera() {
        var _this = this;
        var cameraProviderFuture = ProcessCameraProvider.getInstance(this.context);
        open class IntentRunable : Runnable {
            override fun run() {
                var cameraProvider: ProcessCameraProvider = cameraProviderFuture.get();
                var previewView = _this.cameraView!! as PreviewView;
                var cameraSelector: CameraSelector = CameraSelector.Builder().requireLensFacing(CameraSelector.LENS_FACING_BACK).build();
                var preview: Preview = Preview.Builder().build();
                preview.setSurfaceProvider(previewView.getSurfaceProvider());
                var imageAnalysis = ImageAnalysis.Builder().setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST).build();
                open class MyImageAnalyzer : ImageAnalysis.Analyzer {
                    constructor() : super() {}
                    override fun analyze(image: ImageProxy) {
                        _this.qrDecoder(image);
                    }
                    override fun getDefaultTargetResolution(): Size {
                        return Size(_this.viewBox_width.toInt(), _this.viewBox_height.toInt());
                    }
                }
                var cameraExecutor = Executors.newSingleThreadExecutor();
                imageAnalysis.setAnalyzer(cameraExecutor, MyImageAnalyzer());
                var camera: Camera = cameraProvider.bindToLifecycle(UTSAndroid.getUniActivity()!! as LifecycleOwner, cameraSelector, preview, imageAnalysis);
                _this.camera = camera;
                _this.cameraPreview = preview;
                _this.cameraProvider = cameraProvider;
                _this.isDecoderQring = false;
                _this.isOpeningCameraing = true;
                _this.setFlashModel(_this.flashMode);
            }
        }
        cameraProviderFuture.addListener(IntentRunable(), ContextCompat.getMainExecutor(this.context));
    }
    open fun checkPermissions(): UTSPromise<Boolean> {
        var permissionCheck = utsArrayOf(
            "android.permission.CAMERA"
        );
        return UTSPromise(fun(res){
            if (UTSAndroid.checkSystemPermissionGranted(UTSAndroid.getUniActivity()!!, permissionCheck)) {
                res(true);
            } else {
                console.log("当前不具备指定权限");
                UTSAndroid.requestSystemPermission(UTSAndroid.getUniActivity()!!, permissionCheck, fun(allRight: Boolean, _: UTSArray<String>) {
                    res(true);
                }
                , fun(_: Boolean, _: UTSArray<String>) {
                    res(false);
                }
                );
            }
        }
        );
    }
    open fun setImageViewRusletBox(width: Number, height: Number, realWidth: Number, realHeight: Number, jieguo: SCANNING_PHOTO_RESULT) {
        var t = this;
        var btnwidth: Number = 100;
        var btnwidth2: Number = 50;
        run {
            var i: Number = 0;
            while(i < jieguo.bounds.length){
                var item = jieguo.bounds[i];
                var layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                var x = item.centerX;
                var y = item.centerY;
                layoutParams.topMargin = (y - btnwidth2).toInt();
                layoutParams.leftMargin = (x - btnwidth2).toInt();
                var relativeLayout = RelativeLayout(t.context);
                relativeLayout.layoutParams = layoutParams;
                val rtxt = jieguo.text[i];
                var v = xView(t.context);
                v.setSize(btnwidth, btnwidth).setRadius(100).setBackgroundColor("#21d429").setBorder(12, "#ffffff", false).setClick(fun(event: MotionEvent){
                    try {
                        t.callFunEvent(utsArrayOf(
                            rtxt
                        ), "click");
                    }
                     catch (e: Throwable) {}
                }
                );
                var ov = v.getView();
                var scaleAnimation = ScaleAnimation(1.0.toFloat(), 0.7.toFloat(), 1.0.toFloat(), 0.7.toFloat(), Animation.RELATIVE_TO_SELF, 0.7.toFloat(), Animation.RELATIVE_TO_SELF, 0.7.toFloat());
                scaleAnimation.setDuration(600);
                scaleAnimation.setRepeatMode(Animation.REVERSE);
                scaleAnimation.setRepeatCount(Animation.INFINITE);
                ov.startAnimation(scaleAnimation);
                relativeLayout.addView(ov);
                this.imgPointsBycanmarea.push(relativeLayout);
                this.resultView!!.addView(relativeLayout);
                i++;
            }
        }
    }
    private fun YUV_420_888toNV21(opts: buffoptsType): ByteArray {
        var crop = opts.rect;
        var format = opts.format;
        var width = crop.width();
        var height = crop.height();
        var planes = opts.planes!!;
        var data = ByteArray((width * height * ImageFormat.getBitsPerPixel(format.toInt()) / 8).toInt());
        var rowData = ByteArray(planes[0].getRowStride.toInt());
        var channelOffset: Number = 0;
        var outputStride: Number = 1;
        run {
            var i: Number = 0;
            while(i < planes.length){
                when (i) {
                    0 -> 
                        {
                            channelOffset = 0;
                            outputStride = 1;
                        }
                    1 -> 
                        {
                            channelOffset = width * height;
                            outputStride = 1;
                        }
                    2 -> 
                        {
                            channelOffset = width * height * 1.25;
                            outputStride = 1;
                        }
                }
                var buffer = planes[i.toInt()].data!!;
                var rowStride = planes[i.toInt()].getRowStride;
                var pixelStride = planes[i.toInt()].getPixelStride;
                var shift = if ((i == 0)) {
                    0;
                } else {
                    1;
                }
                ;
                var w = width shr shift;
                var h = height shr shift;
                buffer.position((rowStride * (crop.top shr shift) + pixelStride * (crop.left shr shift)).toInt());
                run {
                    var row: Number = 0;
                    while(row < h){
                        var length: Number = 0;
                        if (pixelStride == 1 && outputStride == 1) {
                            length = w;
                            buffer.get(data, channelOffset.toInt(), length.toInt());
                            channelOffset += length;
                        } else {
                            length = (w - 1) * pixelStride + 1;
                            buffer.get(rowData, 0, length.toInt());
                            run {
                                var col: Number = 0;
                                while(col < w){
                                    data[channelOffset.toInt()] = rowData[(col * pixelStride).toInt()];
                                    channelOffset += outputStride;
                                    col++;
                                }
                            }
                        }
                        if (row < h - 1) {
                            buffer.position((buffer.position() + rowStride - length).toInt());
                        }
                        row++;
                    }
                }
                i++;
            }
        }
        return data;
    }
    open fun getCorrectionMatrix(imageProxy: ImageProxy, previewView: PreviewView): Matrix {
        var cropRect = imageProxy.cropRect;
        var rotationDegrees = imageProxy.imageInfo.rotationDegrees;
        var matrix = Matrix();
        var source = floatArrayOf(cropRect.left.toFloat(), cropRect.top.toFloat(), cropRect.right.toFloat(), cropRect.top.toFloat(), cropRect.right.toFloat(), cropRect.bottom.toFloat(), cropRect.left.toFloat(), cropRect.bottom.toFloat());
        var d0 = 0.toFloat();
        var destination = floatArrayOf(d0, d0, previewView.width.toFloat(), d0, previewView.width.toFloat(), previewView.height.toFloat(), d0, previewView.height.toFloat());
        var vertexSize: Number = 2;
        var shiftOffset = rotationDegrees / 90 * vertexSize;
        var tempArray = destination.clone();
        for(toIndex in resolveUTSKeyIterator(source.indices)){
            var fromIndex = (toIndex + shiftOffset) % source.size;
            destination[toIndex] = tempArray[fromIndex.toInt()];
        }
        var success = matrix.setPolyToPoly(source, 0, destination, 0, 4);
        return matrix;
    }
    private fun qrDecoder(img: ImageProxy) {
        var t = this;
        var image = img.getImage();
        if (!this.isDecoderQring && image != null) {
            this.isDecoderQring = true;
            var width = image.getWidth();
            var height = image.getHeight();
            var planes = image.getPlanes();
            var yBufferCopy = utsArrayOf<ByteArray>();
            var yr = planes[0];
            var ur = planes[1];
            var vr = planes[2];
            var oraingMax = yr.getBuffer().limit();
            run {
                var i: Number = 0;
                while(i < 3){
                    var buffer = planes[i.toInt()].getBuffer();
                    yBufferCopy.push(ByteArray(buffer.remaining().toInt()));
                    buffer.get(yBufferCopy[i.toInt()]);
                    i++;
                }
            }
            var y = ByteBuffer.wrap(yBufferCopy[0]!!);
            var u = ByteBuffer.wrap(yBufferCopy[1]!!);
            var v = ByteBuffer.wrap(yBufferCopy[2]!!);
            var opts = buffoptsType(width = width, height = height, format = image.getFormat(), rect = image.getCropRect(), planes = utsArrayOf<buffoptsPlanesType>(buffoptsPlanesType(data = y, getRowStride = yr.getRowStride(), getPixelStride = yr.getPixelStride()), buffoptsPlanesType(data = u, getRowStride = ur.getRowStride(), getPixelStride = ur.getPixelStride()), buffoptsPlanesType(data = v, getRowStride = vr.getRowStride(), getPixelStride = vr.getPixelStride())));
            decoderBuffToQr(this.YUV_420_888toNV21(opts), width, height, 0).then(fun(res){
                if (res != null && t.isOpeningCameraing) {
                    var matrix = t.getCorrectionMatrix(img, this.cameraView!!);
                    var texts = res.text as UTSArray<String>;
                    if (texts.length > 0) {
                        if (t.options.vibatar == true) {
                            t.setVibatar();
                        }
                        if (t.options.continuousScan == false) {
                            t.closeCamera();
                        }
                        var ruslt = res as SCANNING_PHOTO_RESULT;
                        run {
                            var i: Number = 0;
                            while(i < ruslt.bounds.length){
                                var item = ruslt.bounds[i];
                                var ponit = floatArrayOf(item.centerX.toFloat(), item.centerY.toFloat());
                                matrix.mapPoints(ponit);
                                item.centerX = ponit[0];
                                item.centerY = ponit[1];
                                i++;
                            }
                        }
                        t.callFunEvent(texts, "auto");
                        t.setImageViewRusletBox(t.options.width, t.options.height, width, height, ruslt);
                    }
                    t.isDecoderQring = false;
                } else {
                    t.isDecoderQring = false;
                }
            }
            ).`catch`(fun(){});
        }
        img.close();
    }
}
open class XMlkitScannigUComponent : UTSComponent<FrameLayout> {
    constructor(proxy: PageProxy, componentData: IComponentData) : super(proxy, componentData) ;
    open var cameraWidth: Number = 800;
    open var cameraeiHght: Number = 800;
    open var autoOpenCamera: Boolean = true;
    open var flash: Boolean = false;
    open var CBOX: FrameLayout? = null;
    open var xcamera: xCamera? = null;
    open var defaultscaneventFun: CallFunType? = null;
    override fun NVLoad(): FrameLayout {
        var grop = FrameLayout(UTSAndroid!!.getAppContext()!!);
        this.CBOX = grop;
        return grop;
    }
    override fun NVLayouted() {
        if (this.autoOpenCamera) {
            this.createXcamrera();
        }
    }
    override fun NVBeforeUnload() {
        this.xcamera?.closeCamera();
    }
    open fun checkPermissions(): UTSPromise<Boolean> {
        var permissionCheck = utsArrayOf(
            "android.permission.CAMERA"
        );
        return UTSPromise(fun(res){
            if (UTSAndroid.checkSystemPermissionGranted(UTSAndroid.getUniActivity()!!, permissionCheck)) {
                res(true);
            } else {
                console.log("当前不具备指定权限");
                UTSAndroid.requestSystemPermission(UTSAndroid.getUniActivity()!!, permissionCheck, fun(allRight: Boolean, _: UTSArray<String>) {
                    res(true);
                }
                , fun(_: Boolean, _: UTSArray<String>) {
                    res(false);
                }
                );
            }
        }
        );
    }
    open fun createXcamrera() {
        var _this = this;
        this.xcamera = xCamera(this.CBOX!!, SCANNING_OPTIONS(width = this.cameraWidth, height = this.cameraeiHght, cameraDevice = "BACK", zoom = 5, flashMode = this.flash));
        this.xcamera!!.setCallEvent(fun(str: UTSArray<String>, type: String){
            if (type == "auto") {
                _this.`$emit`("scan", str);
            } else if (type == "click") {
                _this.`$emit`("clickQr", str[0]!!);
            }
        }
        );
        this.xcamera!!.openCamera();
    }
    open fun setFlashModel(flash: Boolean) {
        if (this.xcamera != null) {
            this.xcamera!!.setFlashModel(flash);
        }
    }
    open fun openCamera() {
        var _this = this;
        var isPrivacyAgreeCamrea = uni_getStorageSync("isPrivacyAgreeCamreaByTmui");
        if (isPrivacyAgreeCamrea != "on") {
            uni_showModal(ShowModalOptions(title = "提醒", content = "将授权你的设备相机使用权限进行拍摄识别功能，是否允许？", success = fun(isPermisseions) {
                if (isPermisseions.confirm) {
                    _this.checkPermissions().then(fun(res: Boolean){
                        _this.createXcamrera();
                        uni_setStorageSync("isPrivacyAgreeCamreaByTmui", "on");
                    }
                    ).`catch`(fun(){
                        uni_setStorageSync("isPrivacyAgreeCamreaByTmui", "off");
                    }
                    );
                }
            }, fail = fun(_) {
                uni_showToast(ShowToastOptions(title = "未授权相机使用权", icon = "none"));
            }));
        } else {
            _this.createXcamrera();
        }
    }
    open fun closeCamera() {
        this.xcamera?.closeCamera();
    }
    open fun chooseImage() {
        var _this = this;
        uni_chooseImage(ChooseImageOptions(count = 1, success = fun(evt: ChooseImageSuccess) {
            if (evt.tempFilePaths.length > 0) {
                val imgs = evt.tempFilePaths[0] as String;
                try {
                    val decodedPath = Uri.decode(imgs).substring(7);
                    val file = File(decodedPath);
                    var image = InputImage.fromFilePath(UTSAndroid.getAppContext() as Context, Uri.fromFile(file));
                    var scanner = BarcodeScanning.getClient();
                    scanner.process(image).addOnSuccessListener(fun(barcodes){
                        var listpos = utsArrayOf<UTSArray<UTSArray<Number>>>();
                        var bounedlist = utsArrayOf<SCANNING_PHOTO_RESULT_BOUND>();
                        var rulstText = utsArrayOf<String>();
                        for(barcode in resolveUTSKeyIterator(barcodes)){
                            var bounds = barcode.boundingBox;
                            var corners = barcode.cornerPoints;
                            var rawValue = barcode.rawValue;
                            var valueType = barcode.valueType;
                            if (rawValue != null && bounds != null && corners != null) {
                                var iminfo = SCANNING_PHOTO_RESULT_BOUND(width = bounds!!.width(), height = bounds!!.height(), centerX = bounds!!.centerX(), centerY = bounds!!.centerY());
                                var posinfo = utsArrayOf<UTSArray<Number>>();
                                for(pos in resolveUTSKeyIterator(corners)){
                                    posinfo.push(utsArrayOf<Number>(pos!!.x as Number, pos!!.y as Number));
                                }
                                listpos.push(posinfo);
                                bounedlist.push(iminfo);
                                rulstText.push(rawValue);
                            }
                        }
                        _this.`$emit`("scan", if (rulstText.length == 0) {
                            utsArrayOf();
                        } else {
                            rulstText;
                        }
                        );
                    }
                    );
                }
                 catch (e: IOException) {
                    _this.`$emit`("scan", utsArrayOf<String>());
                }
            }
        }
        , fail = fun(_) {
            _this.`$emit`("scan", utsArrayOf<String>());
        }
        ));
    }
    companion object {
        var name = "x-mlkit-scannig-u";
        init {
            io.dcloud.uniapp.UniSDKEngine.registerUniComponent("x-mlkit-scannig-u", XMlkitScannigUComponent::class.java, XMlkitScannigUElement::class.java);
        }
    }
}
open class XMlkitScannigUElement : DomNode {
    constructor(data: INodeData, pageNode: PageNode) : super(data, pageNode) ;
    open fun checkPermissions(): UTSPromise<Boolean> {
        return (getComponent() as XMlkitScannigUComponent).checkPermissions();
    }
    open fun createXcamrera() {
        return (getComponent() as XMlkitScannigUComponent).createXcamrera();
    }
    open fun setFlashModel(flash: Boolean) {
        return (getComponent() as XMlkitScannigUComponent).setFlashModel(flash);
    }
    open fun openCamera() {
        return (getComponent() as XMlkitScannigUComponent).openCamera();
    }
    open fun closeCamera() {
        return (getComponent() as XMlkitScannigUComponent).closeCamera();
    }
    open fun chooseImage() {
        return (getComponent() as XMlkitScannigUComponent).chooseImage();
    }
}
