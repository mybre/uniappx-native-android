@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xMlkitScannigS;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.media.Image.Plane;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.util.Size;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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
    ix = Math.floor(Math.random() * rdix * Math.floor(Math.random() * Date.now())).toString(10).substring(0, length as Int);
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
typealias CALL_RESULT_FUN = (str: String) -> Unit;
fun decoderUriPathToQrByUri(filePath: Uri, callback: (rs: SCANNING_PHOTO_RESULT) -> Unit) {
    try {
        var image = InputImage.fromFilePath(UTSAndroid.getAppContext() as Context, filePath);
        var options = BarcodeScannerOptions.Builder().setBarcodeFormats(Barcode.FORMAT_QR_CODE, Barcode.FORMAT_EAN_13, Barcode.FORMAT_CODE_128, Barcode.FORMAT_CODABAR).build();
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
            callback(SCANNING_PHOTO_RESULT(url = "", position = listpos, bounds = bounedlist, text = rulstText));
        }
        );
    }
     catch (e: Throwable) {
        console.error(e);
    }
}
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
fun decoderUriPathToQr(filePath: String, callback: (rs: SCANNING_PHOTO_RESULT) -> Unit) {
    try {
        var uri = UTSAndroid.getFileProviderUri(File(filePath))!!;
        var image = InputImage.fromFilePath(UTSAndroid.getAppContext() as Context, uri);
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
            callback(SCANNING_PHOTO_RESULT(url = "", position = listpos, bounds = bounedlist, text = rulstText));
        }
        );
    }
     catch (e: Throwable) {
        console.error(e);
    }
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
open class ConverXy (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    @JsonNotNull
    open var minx: Number,
    @JsonNotNull
    open var maxx: Number,
    @JsonNotNull
    open var miny: Number,
    @JsonNotNull
    open var maxy: Number,
) : UTSObject()
open class contaiaSize (
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSObject()
open class contaiaCalseSize (
    @JsonNotNull
    open var scale: Number,
    @JsonNotNull
    open var offsetX: Number,
    @JsonNotNull
    open var offsetY: Number,
) : UTSObject()
open class contaiPointXy (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
) : UTSObject()
var parentView: RelativeLayout? = null;
var maskDomId: Number = 8586;
fun px2dp(n: Number): Number {
    val mets = UTSAndroid.getAppContext()!!.resources!!.getDisplayMetrics();
    return mets.density * n;
}
open class xCamera {
    open var vibrator = null as Vibrator?;
    open var context: Context;
    open var resultView: RelativeLayout? = null;
    open var imgPointsBycanmarea = utsArrayOf<RelativeLayout>();
    open var camreaLayouView: RelativeLayout? = null;
    open var imageLayouView: RelativeLayout? = null;
    open var viewBox_width: Number = 0;
    open var viewBox_height: Number = 0;
    open var imageView = null as ImageView?;
    open var imageUrl = null as Uri?;
    open var isSelectedImging = false;
    open var cameraView: PreviewView? = null;
    open var cameraProvider: ProcessCameraProvider? = null;
    open var camera: Camera? = null;
    open var cameraPreview: Preview? = null;
    open var isDecoderQring = false;
    open var isOpeningCameraing = false;
    open var callFunEvent: CALL_RESULT_FUN = fun(str: String){};
    open var onlyCamera: Boolean = false;
    open var tempresultList = utsArrayOf<String>();
    open var activityresult = fun(requestCode: Int, resultCode: Int, data: Intent?){
        var t = this;
        if (resultCode == Activity.RESULT_OK && data != null && data?.data != null) {
            var selectedImageUri = data.data!!;
            this.camreaLayouView!!.setVisibility(View.GONE);
            this.imageUrl = selectedImageUri;
            this.isSelectedImging = false;
            decoderUriPathToQrByUri(this.imageUrl!!, fun(res: SCANNING_PHOTO_RESULT){
                t.isOpeningCameraing = false;
                t.clearImageView();
                t.imageView!!.setImageURI(t.imageUrl!!);
                var matrix = t.getCorrectionMatrixByimgUri(t.imageView!!, t.cameraView!!, 90);
                var ruslt = res as SCANNING_PHOTO_RESULT;
                if (ruslt.text.length > 0) {
                    t.setVibatar();
                }
                run {
                    var i: Number = 0;
                    while(i < ruslt.bounds.length){
                        var item = ruslt.bounds[i];
                        var result = t.calcPoint(t.imageView!!, t.cameraView!!, item.centerX, item.centerY, 0);
                        item.centerX = result.x;
                        item.centerY = result.y;
                        i++;
                    }
                }
                t.setImageViewRusletBox(ruslt);
                if (ruslt.text.length == 1) {
                    t.callFunEvent(ruslt.text[0]);
                    t.close();
                }
            });
        } else {
            this.isSelectedImging = false;
        }
    }
    ;
    constructor(){
        this.context = UTSAndroid.getAppContext()!! as Context;
        this.vibrator = this.context!!.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator;
    }
    open fun clearImageView() {
        this.clearImagePonit();
        if (!this.isOpeningCameraing) {
            this.imageView!!.setImageDrawable(null);
        }
    }
    open fun setVibatar() {
        if (this.vibrator == null) {
            return;
        }
        if (this.vibrator!!.hasVibrator()) {
            this.vibrator!!.vibrate(80);
        }
    }
    open fun openCamera(call: CALL_RESULT_FUN, onlyCameras: Boolean) {
        this.onlyCamera = onlyCameras;
        var t = this;
        this.callFunEvent = call;
        if (parentView == null) {
            this.createView();
            t._openCamera();
        } else {
            this._openCamera();
        }
    }
    open fun close() {
        UTSAndroid.offAppActivityResult(this.activityresult);
        var decorView = UTSAndroid.getUniActivity()!!.window.decorView as ViewGroup;
        this.closeCamera();
        this.clearImagePonit();
        if (parentView != null) {
            decorView.removeView(parentView);
        }
        parentView = null;
    }
    private fun _openCamera() {
        var _this = this;
        this.closeCamera();
        this.clearImagePonit();
        var cameraProviderFuture = ProcessCameraProvider.getInstance(this.context);
        this.camreaLayouView!!.setVisibility(View.VISIBLE);
        open class IntentRunable : Runnable {
            override fun run() {
                var cameraProvider: ProcessCameraProvider = cameraProviderFuture.get();
                var previewView = _this.cameraView!! as PreviewView;
                var cameraSelector: CameraSelector = CameraSelector.Builder().requireLensFacing(CameraSelector.LENS_FACING_BACK).build();
                var preview: Preview = Preview.Builder().build();
                preview.setSurfaceProvider(previewView.getSurfaceProvider());
                var imageAnalysis = ImageAnalysis.Builder().setTargetResolution(Size(800, 800)).setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST).build();
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
            }
        }
        cameraProviderFuture.addListener(IntentRunable(), ContextCompat.getMainExecutor(this.context));
    }
    open fun closeCamera() {
        this.cameraProvider?.unbindAll();
        this.cameraPreview?.setSurfaceProvider(null);
        this.isOpeningCameraing = false;
    }
    open fun clearImagePonit() {
        run {
            var i: Number = 0;
            while(i < this.imgPointsBycanmarea.length){
                this.resultView?.removeView(this.imgPointsBycanmarea[i]);
                i++;
            }
        }
    }
    private fun createView() {
        var t = this;
        var decorView = UTSAndroid.getUniActivity()!!.window.decorView as ViewGroup;
        parentView = RelativeLayout(this.context);
        parentView!!.setId(maskDomId.toInt());
        parentView!!.setBackgroundColor(Color.BLACK);
        parentView!!.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        open class MaskerDomClickListsner : View.OnTouchListener {
            constructor() : super() {}
            override fun onTouch(view: View, event: MotionEvent): Boolean {
                return true;
            }
        }
        parentView!!.setOnTouchListener(MaskerDomClickListsner());
        var continaer = LinearLayout(this.context);
        continaer.setOrientation(LinearLayout.VERTICAL);
        continaer.setBackgroundColor(Color.TRANSPARENT);
        var continaerLayparams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        continaer.setLayoutParams(continaerLayparams);
        var boxWrapParent = LinearLayout(this.context);
        boxWrapParent.setOrientation(LinearLayout.VERTICAL);
        var boxLayparams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        boxLayparams.weight = 1.toFloat();
        boxLayparams.height = 0;
        boxWrapParent.setLayoutParams(boxLayparams);
        var boxWrap = RelativeLayout(this.context);
        boxWrap.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        boxWrapParent.addView(boxWrap);
        open class previewChangeRectadd : View.OnLayoutChangeListener {
            override fun onLayoutChange(v: View, left: Int, top: Int, right: Int, bottom: Int, oldLeft: Int, oldTop: Int, oldRight: Int, oldBottom: Int) {
                t.viewBox_width = right - left;
                t.viewBox_height = bottom - top;
            }
        }
        boxWrap.addOnLayoutChangeListener(previewChangeRectadd());
        var rongqitop = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        rongqitop.topMargin = 0;
        rongqitop.leftMargin = 0;
        this.resultView = RelativeLayout(this.context);
        this.resultView!!.setLayoutParams(rongqitop);
        var imgPview = RelativeLayout(this.context);
        var rongqitop2 = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        rongqitop2.topMargin = 0;
        rongqitop2.leftMargin = 0;
        imgPview.setLayoutParams(rongqitop2);
        this.imageView = ImageView(this.context);
        this.imageView!!.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.imageView!!.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        imgPview.addView(this.imageView!!);
        this.imageView!!.setImageDrawable(null);
        var cview = RelativeLayout(this.context);
        var rongqitop3 = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        cview.setLayoutParams(rongqitop3);
        var sv = PreviewView(this.context);
        sv.setScaleType(PreviewView.ScaleType.FILL_CENTER);
        var layaout = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sv.setLayoutParams(layaout);
        this.cameraView = sv;
        cview.addView(this.cameraView!!);
        this.camreaLayouView = cview;
        this.imageLayouView = imgPview;
        boxWrap.addView(imgPview);
        boxWrap.addView(cview);
        boxWrap.addView(this.resultView!!);
        var footerWrap = LinearLayout(this.context);
        footerWrap.setOrientation(LinearLayout.HORIZONTAL);
        var footerWrapLayparams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        footerWrapLayparams.height = px2dp(100).toInt();
        footerWrap.setLayoutParams(footerWrapLayparams);
        var photoView = LinearLayout(this.context);
        photoView.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        var xiangcheText = TextView(this.context);
        xiangcheText.setTextColor(Color.WHITE);
        xiangcheText.setPadding(32, 52, 0, 0);
        xiangcheText.setTextSize(16.toFloat());
        xiangcheText.setGravity(Gravity.LEFT);
        xiangcheText.setText(if (!this.onlyCamera) {
            "相册选择";
        } else {
            " ";
        }
        );
        xiangcheText.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        open class XiangcheClickListsner : View.OnTouchListener {
            constructor() : super() {}
            override fun onTouch(view: View, event: MotionEvent): Boolean {
                UTSAndroid.offAppActivityResult(t.activityresult);
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t.closeCamera();
                    t.isSelectedImging = true;
                    var intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    UTSAndroid.onAppActivityResult(t.activityresult);
                    UTSAndroid.getUniActivity()!!.startActivityForResult(intent, 1);
                }
                return true;
            }
        }
        if (!this.onlyCamera) {
            xiangcheText.setOnTouchListener(XiangcheClickListsner());
        }
        photoView.addView(xiangcheText);
        var cneterView = LinearLayout(this.context);
        var cneterViewParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        cneterViewParams.weight = 1.toFloat();
        cneterView.setLayoutParams(cneterViewParams);
        var scanView = LinearLayout(this.context);
        scanView.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        scanView.setGravity(Gravity.RIGHT);
        var shaoyishaoText = TextView(this.context);
        shaoyishaoText.setTextColor(Color.WHITE);
        shaoyishaoText.setPadding(0, 52, 32, 0);
        shaoyishaoText.setTextSize(16.toFloat());
        shaoyishaoText.setGravity(Gravity.RIGHT);
        shaoyishaoText.setText("扫一扫");
        shaoyishaoText.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        open class ShaoyishaoTextClickListsner : View.OnTouchListener {
            constructor() : super() {}
            override fun onTouch(view: View, event: MotionEvent): Boolean {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t._openCamera();
                }
                return true;
            }
        }
        shaoyishaoText.setOnTouchListener(ShaoyishaoTextClickListsner());
        scanView.addView(shaoyishaoText);
        footerWrap.addView(photoView);
        footerWrap.addView(cneterView);
        footerWrap.addView(scanView);
        var titleView = RelativeLayout(this.context);
        var tplays = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tplays.topMargin = px2dp(60).toInt();
        tplays.leftMargin = px2dp(16).toInt();
        titleView!!.setLayoutParams(tplays);
        var backBtn = TextView(this.context);
        backBtn.setTextColor(Color.WHITE);
        backBtn.setTextSize(16.toFloat());
        backBtn.setGravity(Gravity.BOTTOM);
        backBtn.setText("返回");
        backBtn.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        open class BackDomClickListsner : View.OnTouchListener {
            constructor() : super() {}
            override fun onTouch(view: View, event: MotionEvent): Boolean {
                t.close();
                return true;
            }
        }
        backBtn.setOnTouchListener(BackDomClickListsner());
        titleView!!.addView(backBtn);
        continaer.addView(boxWrapParent);
        continaer.addView(footerWrap);
        parentView!!.addView(continaer);
        parentView!!.addView(titleView);
        decorView.addView(parentView!!);
        try {
            var s0 = 0.toFloat();
            var s1 = 1.toFloat();
            parentView!!.setAlpha(s0);
            parentView!!.setScaleX(s0);
            parentView!!.setScaleY(s0);
            var ani = parentView!!.animate() as ViewPropertyAnimator;
            ani.alpha(s1).scaleX(s1).scaleY(s1).setDuration(250).start();
        }
         catch (e: Throwable) {}
    }
    open fun setImageViewRusletBox(jieguo: SCANNING_PHOTO_RESULT) {
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
                        t.callFunEvent(rtxt);
                        t.close();
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
    open fun YUV42088ToNV21Copy(a: ByteBuffer, b: ByteBuffer, c: ByteBuffer, widths: Number, heights: Number, yr: Number, ur: Number, vr: Number): ByteArray {
        var width = widths;
        var height = heights;
        var yBuffer = a;
        var uBuffer = b;
        var vBuffer = c;
        yBuffer.rewind();
        uBuffer.rewind();
        vBuffer.rewind();
        var yRowStride = yr;
        var uvRowStride = ur;
        var uvPixelStride = vr;
        var nv21Data = ByteArray((width * height * 3 / 2).toInt());
        var yIndex: Number = 0;
        var uvIndex = width * height;
        var bytesPerPixel: Number = 1;
        try {
            run {
                var row: Number = 0;
                while(row < height){
                    run {
                        var col: Number = 0;
                        while(col < width){
                            nv21Data[(yIndex++).toInt()] = yBuffer.get();
                            col++;
                        }
                    }
                    var rowRemainder = yRowStride - width * bytesPerPixel;
                    if (rowRemainder > 0) {
                        yBuffer.position((yBuffer.position() + rowRemainder).toInt());
                    } else {
                        yBuffer.position((yBuffer.position() + width * bytesPerPixel).toInt());
                    }
                    row++;
                }
            }
        }
         catch (e: Throwable) {}
        try {
            run {
                var row: Number = 0;
                while(row < height / 2){
                    run {
                        var col: Number = 0;
                        while(col < width / 2){
                            nv21Data[(uvIndex++).toInt()] = uBuffer.get();
                            if (uvPixelStride == 2) {
                                uBuffer.position((uBuffer.position() + 1).toInt());
                            }
                            nv21Data[(uvIndex++).toInt()] = vBuffer.get();
                            if (uvPixelStride == 2) {
                                vBuffer.position((vBuffer.position() + 1).toInt());
                            }
                            col++;
                        }
                    }
                    var uvRowSkip = uvRowStride - (width / 2) * uvPixelStride;
                    if (uvRowSkip > 0) {
                        uBuffer.position((uBuffer.position() + uvRowSkip).toInt());
                        vBuffer.position((vBuffer.position() + uvRowSkip).toInt());
                    }
                    row++;
                }
            }
        }
         catch (e: Throwable) {}
        return nv21Data;
    }
    open fun copyImagePlan(plane: Plane): ByteBuffer {
        var copiedBuffer = ByteBuffer.allocateDirect(plane.getBuffer().capacity());
        copiedBuffer.order(ByteOrder.nativeOrder());
        plane.getBuffer().rewind();
        copiedBuffer.put(plane.getBuffer());
        copiedBuffer.rewind();
        return copiedBuffer;
    }
    open fun getCorrectionMatrixByimgUri(imgView: ImageView, previewView: PreviewView, rotationDegrees: Number): Matrix {
        var matrix = Matrix();
        var imgWidt = imgView.drawable!!.intrinsicWidth as Number;
        var imgHeight = imgView.drawable!!.intrinsicHeight as Number;
        var d0 = 0.toFloat();
        var source = floatArrayOf(d0, d0, imgWidt.toFloat(), d0, imgWidt.toFloat(), imgHeight.toFloat(), d0, imgHeight.toFloat());
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
    open fun calcPoint(imgView: ImageView, previewView: PreviewView, image_point_x: Number, image_point_y: Number, degration: Number): ConverXy {
        val image_w = imgView.drawable!!.intrinsicWidth as Number;
        val image_h = imgView.drawable!!.intrinsicHeight as Number;
        val c_w = previewView.width;
        val c_h = previewView.height;
        fun scaleAndCenterContent(container: contaiaSize, content: contaiaSize): contaiaCalseSize {
            val scaleWidth = container.width / content.width;
            val scaleHeight = container.height / content.height;
            val scale = Math.min(scaleWidth, scaleHeight);
            val offsetX = (container.width - content.width * scale) / 2;
            val offsetY = (container.height - content.height * scale) / 2;
            return contaiaCalseSize(scale = scale, offsetX = offsetX, offsetY = offsetY);
        }
        fun mapContentCoordinatesToContainer(contentX: Number, contentY: Number, calcsize: contaiaCalseSize): contaiPointXy {
            val containerX = contentX * calcsize.scale + calcsize.offsetX;
            val containerY = contentY * calcsize.scale + calcsize.offsetY;
            return contaiPointXy(x = containerX, y = containerY);
        }
        var rc = scaleAndCenterContent(contaiaSize(width = c_w, height = c_h), contaiaSize(width = image_h, height = image_w));
        if (degration == 0) {
            rc = scaleAndCenterContent(contaiaSize(width = c_w, height = c_h), contaiaSize(width = image_w, height = image_h));
        }
        var result = mapContentCoordinatesToContainer(image_point_y, image_point_x, rc);
        if (degration == 0) {
            result = mapContentCoordinatesToContainer(image_point_x, image_point_y, rc);
        }
        var nexyxcov = ConverXy(x = c_w - result.x, y = result.y, minx = 0, maxx = 0, miny = 0, maxy = 0);
        if (degration == 0) {
            nexyxcov = ConverXy(x = result.x, y = result.y, minx = 0, maxx = 0, miny = 0, maxy = 0);
        }
        return nexyxcov;
    }
    open fun qrDecoder(img: ImageProxy) {
        var t = this;
        var image = img.getImage();
        if (!this.isDecoderQring && image != null && t.isOpeningCameraing) {
            this.isDecoderQring = true;
            var width = image.getWidth();
            var height = image.getHeight();
            var planes = image.getPlanes();
            var a = this.copyImagePlan(planes[0]);
            var b = this.copyImagePlan(planes[1]);
            var c = this.copyImagePlan(planes[2]);
            var yr = planes[0].getRowStride();
            var ur = planes[1].getRowStride();
            var vr = planes[1].getPixelStride();
            var starttime = Date().getTime();
            var av = this.YUV42088ToNV21Copy(a, b, c, width, height, yr, ur, vr);
            var rotationDegrees = img.imageInfo.rotationDegrees;
            decoderBuffToQr(av, width, height, 0).then(fun(res){
                if (res != null) {
                    var matrix = t.getCorrectionMatrix(img, t.cameraView!!);
                    if (res.text.length > 0) {
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
                        if (ruslt.text.length > 0) {
                            t.setVibatar();
                        }
                        t.setImageViewRusletBox(ruslt);
                        t.closeCamera();
                        if (ruslt.text.length == 1) {
                            t.callFunEvent(ruslt.text[0]);
                            t.close();
                        }
                    } else {
                        t.isDecoderQring = false;
                    }
                }
            }
            ).`catch`(fun(){
                t.isDecoderQring = false;
            }
            );
        }
        img.close();
    }
}
val camera = xCamera();
fun urlPathDecoderQr(url: String, callback: (rs: SCANNING_PHOTO_RESULT) -> Unit) {
    uni_downloadFile(DownloadFileOptions(url = url, success = fun(res) {
        val contentResolver = UTSAndroid.getAppContext()!!.contentResolver;
        var decodedPath = res.tempFilePath;
        if (res.tempFilePath.indexOf("file://") > -1) {
            decodedPath = Uri.decode(res.tempFilePath).substring(7);
        }
        decoderUriPathToQr(decodedPath, callback);
    }
    , fail = fun(_) {
        console.error("下载图片错误");
    }
    ));
}
fun checkPermissions(): UTSPromise<Boolean> {
    var permissionCheck = utsArrayOf(
        "android.permission.CAMERA"
    );
    return UTSPromise(fun(res, _reject){
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
open class ConverXy1 (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    @JsonNotNull
    open var minx: Number,
    @JsonNotNull
    open var maxx: Number,
    @JsonNotNull
    open var miny: Number,
    @JsonNotNull
    open var maxy: Number,
) : UTSObject()
open class contaiaSize1 (
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSObject()
open class contaiaCalseSize1 (
    @JsonNotNull
    open var scale: Number,
    @JsonNotNull
    open var offsetX: Number,
    @JsonNotNull
    open var offsetY: Number,
) : UTSObject()
open class contaiPointXy1 (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
) : UTSObject()
var parentView1: RelativeLayout? = null;
var onlyCamera = false;
var callFunEvent: CALL_RESULT_FUN = fun(str: String){};
fun px2dp1(n: Number): Number {
    val mets = UTSAndroid.getAppContext()!!.resources!!.getDisplayMetrics();
    return mets.density * n;
}
open class DemoActivity : Activity, LifecycleOwner {
    open var lifecycleRegistry: LifecycleRegistry? = null;
    open var vibrator = null as Vibrator?;
    open var context: Context;
    open var resultView: RelativeLayout? = null;
    open var imgPointsBycanmarea = utsArrayOf<RelativeLayout>();
    open var camreaLayouView: RelativeLayout? = null;
    open var imageLayouView: RelativeLayout? = null;
    open var viewBox_width: Number = 0;
    open var viewBox_height: Number = 0;
    open var imageView = null as ImageView?;
    open var imageUrl = null as Uri?;
    open var isSelectedImging = false;
    open var cameraView: PreviewView? = null;
    open var cameraProvider: ProcessCameraProvider? = null;
    open var camera: Camera? = null;
    open var cameraPreview: Preview? = null;
    open var flashMode = false;
    open var isDecoderQring = false;
    open var isOpeningCameraing = false;
    open var tempresultList = utsArrayOf<String>();
    constructor() : super() {
        this.context = UTSAndroid.getAppContext() as Context;
        this.vibrator = this.context!!.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator;
        this.lifecycleRegistry = LifecycleRegistry(this);
        this.lifecycleRegistry!!.markState(Lifecycle.State.CREATED);
    }
    private fun createView() {
        var t = this;
        parentView1 = RelativeLayout(this.context);
        parentView1!!.setBackgroundColor(Color.BLACK);
        parentView1!!.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        open class MaskerDomClickListsner : View.OnTouchListener {
            constructor() : super() {}
            override fun onTouch(view: View, event: MotionEvent): Boolean {
                return true;
            }
        }
        parentView1!!.setOnTouchListener(MaskerDomClickListsner());
        var continaer = LinearLayout(this.context);
        continaer.setOrientation(LinearLayout.VERTICAL);
        continaer.setBackgroundColor(Color.TRANSPARENT);
        var continaerLayparams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        continaer.setLayoutParams(continaerLayparams);
        var boxWrapParent = LinearLayout(this.context);
        boxWrapParent.setOrientation(LinearLayout.VERTICAL);
        var boxLayparams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        boxLayparams.weight = 1.toFloat();
        boxLayparams.height = 0;
        boxWrapParent.setLayoutParams(boxLayparams);
        var boxWrap = RelativeLayout(this.context);
        boxWrap.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        boxWrapParent.addView(boxWrap);
        open class previewChangeRectadd : View.OnLayoutChangeListener {
            override fun onLayoutChange(v: View, left: Int, top: Int, right: Int, bottom: Int, oldLeft: Int, oldTop: Int, oldRight: Int, oldBottom: Int) {
                t.viewBox_width = right - left;
                t.viewBox_height = bottom - top;
            }
        }
        boxWrap.addOnLayoutChangeListener(previewChangeRectadd());
        var rongqitop = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        rongqitop.topMargin = 0;
        rongqitop.leftMargin = 0;
        this.resultView = RelativeLayout(this.context);
        this.resultView!!.setLayoutParams(rongqitop);
        var imgPview = RelativeLayout(this.context);
        var rongqitop2 = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        rongqitop2.topMargin = 0;
        rongqitop2.leftMargin = 0;
        imgPview.setLayoutParams(rongqitop2);
        this.imageView = ImageView(this.context);
        this.imageView!!.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.imageView!!.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        imgPview.addView(this.imageView!!);
        this.imageView!!.setImageDrawable(null);
        var cview = RelativeLayout(this.context);
        var rongqitop3 = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        cview.setLayoutParams(rongqitop3);
        var sv = PreviewView(this.context);
        sv.setScaleType(PreviewView.ScaleType.FILL_CENTER);
        var layaout = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sv.setLayoutParams(layaout);
        this.cameraView = sv;
        cview.addView(this.cameraView!!);
        this.camreaLayouView = cview;
        this.imageLayouView = imgPview;
        boxWrap.addView(imgPview);
        boxWrap.addView(cview);
        boxWrap.addView(this.resultView!!);
        var footerWrap = LinearLayout(this.context);
        footerWrap.setOrientation(LinearLayout.HORIZONTAL);
        var footerWrapLayparams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        footerWrapLayparams.height = px2dp1(100).toInt();
        footerWrap.setLayoutParams(footerWrapLayparams);
        var photoView = LinearLayout(this.context);
        photoView.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        var xiangcheText = TextView(this.context);
        xiangcheText.setTextColor(Color.WHITE);
        xiangcheText.setPadding(32, 52, 0, 0);
        xiangcheText.setTextSize(16.toFloat());
        xiangcheText.setGravity(Gravity.LEFT);
        xiangcheText.setText(if (!onlyCamera) {
            "相册选择";
        } else {
            " ";
        }
        );
        xiangcheText.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        open class XiangcheClickListsner : View.OnTouchListener {
            constructor() : super() {}
            override fun onTouch(view: View, event: MotionEvent): Boolean {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t.closeCamera();
                    t.isSelectedImging = true;
                    var intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    t.startActivityForResult(intent, 1);
                }
                return true;
            }
        }
        if (!onlyCamera) {
            xiangcheText.setOnTouchListener(XiangcheClickListsner());
        }
        photoView.addView(xiangcheText);
        var falshText = TextView(this.context);
        falshText.setTextColor(Color.WHITE);
        falshText.setPadding(32, 52, 0, 0);
        falshText.setTextSize(16.toFloat());
        falshText.setGravity(Gravity.CENTER);
        falshText.setText(if (this.flashMode) {
            "关灯";
        } else {
            "开灯";
        }
        );
        falshText.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        open class FalshTextClickListsner : View.OnTouchListener {
            constructor() : super() {}
            override fun onTouch(view: View, event: MotionEvent): Boolean {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t.flashMode = !t.flashMode;
                    falshText.setText(if (t.flashMode) {
                        "关灯";
                    } else {
                        "开灯";
                    }
                    );
                    t.setFlashModel(t.flashMode);
                }
                return true;
            }
        }
        falshText.setOnTouchListener(FalshTextClickListsner());
        var cneterView = LinearLayout(this.context);
        var cneterViewParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        cneterViewParams.weight = 1.toFloat();
        cneterView.setGravity(Gravity.CENTER);
        cneterView.setLayoutParams(cneterViewParams);
        cneterView.addView(falshText);
        var scanView = LinearLayout(this.context);
        scanView.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        scanView.setGravity(Gravity.RIGHT);
        var shaoyishaoText = TextView(this.context);
        shaoyishaoText.setTextColor(Color.WHITE);
        shaoyishaoText.setPadding(0, 52, 32, 0);
        shaoyishaoText.setTextSize(16.toFloat());
        shaoyishaoText.setGravity(Gravity.RIGHT);
        shaoyishaoText.setText("扫一扫");
        shaoyishaoText.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        open class ShaoyishaoTextClickListsner : View.OnTouchListener {
            constructor() : super() {}
            override fun onTouch(view: View, event: MotionEvent): Boolean {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t._openCamera();
                }
                return true;
            }
        }
        shaoyishaoText.setOnTouchListener(ShaoyishaoTextClickListsner());
        scanView.addView(shaoyishaoText);
        footerWrap.addView(photoView);
        footerWrap.addView(cneterView);
        footerWrap.addView(scanView);
        var titleView = RelativeLayout(this.context);
        var tplays = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tplays.topMargin = px2dp1(60).toInt();
        tplays.leftMargin = px2dp1(16).toInt();
        titleView!!.setLayoutParams(tplays);
        var backBtn = TextView(this.context);
        backBtn.setTextColor(Color.WHITE);
        backBtn.setTextSize(16.toFloat());
        backBtn.setGravity(Gravity.BOTTOM);
        backBtn.setText("返回");
        backBtn.setLayoutParams(LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        open class BackDomClickListsner : View.OnTouchListener {
            constructor() : super() {}
            override fun onTouch(view: View, event: MotionEvent): Boolean {
                t.close();
                return true;
            }
        }
        backBtn.setOnTouchListener(BackDomClickListsner());
        titleView!!.addView(backBtn);
        continaer.addView(boxWrapParent);
        continaer.addView(footerWrap);
        parentView1!!.addView(continaer);
        parentView1!!.addView(titleView);
        this.setContentView(parentView1);
    }
    override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState);
        this.lifecycleRegistry = LifecycleRegistry(this);
        this.lifecycleRegistry!!.markState(Lifecycle.State.CREATED);
        this.hideTitleBar();
    }
    open fun clearImageView() {
        this.clearImagePonit();
        if (!this.isOpeningCameraing) {
            this.imageView!!.setImageDrawable(null);
        }
    }
    open fun openCamera() {
        var t = this;
        if (parentView1 == null) {
            this.createView();
            t._openCamera();
        } else {
            this._openCamera();
        }
    }
    open fun close() {
        this.closeCamera();
        this.clearImagePonit();
        parentView1 = null;
        this.finish();
    }
    open fun closeCamera() {
        try {
            this.setFlashModel(false);
            this.cameraProvider?.unbindAll();
            this.cameraPreview?.setSurfaceProvider(null);
            this.isOpeningCameraing = false;
        }
         catch (e: Throwable) {}
    }
    private fun _openCamera() {
        var _this = this;
        var lifecycleOwner = this;
        this.closeCamera();
        this.clearImagePonit();
        var cameraProviderFuture = ProcessCameraProvider.getInstance(this.context);
        this.camreaLayouView!!.setVisibility(View.VISIBLE);
        open class IntentRunable : Runnable {
            override fun run() {
                var cameraProvider: ProcessCameraProvider = cameraProviderFuture.get();
                var previewView = _this.cameraView!! as PreviewView;
                var cameraSelector: CameraSelector = CameraSelector.Builder().requireLensFacing(CameraSelector.LENS_FACING_BACK).build();
                var preview: Preview = Preview.Builder().build();
                preview.setSurfaceProvider(previewView.getSurfaceProvider());
                var imageAnalysis = ImageAnalysis.Builder().setTargetResolution(Size(800, 800)).setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST).build();
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
                var camera: Camera = cameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, preview, imageAnalysis);
                _this.camera = camera;
                _this.cameraPreview = preview;
                _this.cameraProvider = cameraProvider;
                _this.isDecoderQring = false;
                _this.isOpeningCameraing = true;
            }
        }
        cameraProviderFuture.addListener(IntentRunable(), ContextCompat.getMainExecutor(this.context));
    }
    open fun clearImagePonit() {
        run {
            var i: Number = 0;
            while(i < this.imgPointsBycanmarea.length){
                this.resultView?.removeView(this.imgPointsBycanmarea[i]);
                i++;
            }
        }
    }
    open fun setImageViewRusletBox(jieguo: SCANNING_PHOTO_RESULT) {
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
                        callFunEvent(rtxt);
                        t.close();
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
    open fun YUV42088ToNV21Copy(a: ByteBuffer, b: ByteBuffer, c: ByteBuffer, widths: Number, heights: Number, yr: Number, ur: Number, vr: Number): ByteArray {
        var width = widths;
        var height = heights;
        var yBuffer = a;
        var uBuffer = b;
        var vBuffer = c;
        yBuffer.rewind();
        uBuffer.rewind();
        vBuffer.rewind();
        var yRowStride = yr;
        var uvRowStride = ur;
        var uvPixelStride = vr;
        var nv21Data = ByteArray((width * height * 3 / 2).toInt());
        var yIndex: Number = 0;
        var uvIndex = width * height;
        var bytesPerPixel: Number = 1;
        try {
            run {
                var row: Number = 0;
                while(row < height){
                    run {
                        var col: Number = 0;
                        while(col < width){
                            nv21Data[(yIndex++).toInt()] = yBuffer.get();
                            col++;
                        }
                    }
                    var rowRemainder = yRowStride - width * bytesPerPixel;
                    if (rowRemainder > 0) {
                        yBuffer.position((yBuffer.position() + rowRemainder).toInt());
                    } else {
                        yBuffer.position((yBuffer.position() + width * bytesPerPixel).toInt());
                    }
                    row++;
                }
            }
        }
         catch (e: Throwable) {}
        try {
            run {
                var row: Number = 0;
                while(row < height / 2){
                    run {
                        var col: Number = 0;
                        while(col < width / 2){
                            nv21Data[(uvIndex++).toInt()] = uBuffer.get();
                            if (uvPixelStride == 2) {
                                uBuffer.position((uBuffer.position() + 1).toInt());
                            }
                            nv21Data[(uvIndex++).toInt()] = vBuffer.get();
                            if (uvPixelStride == 2) {
                                vBuffer.position((vBuffer.position() + 1).toInt());
                            }
                            col++;
                        }
                    }
                    var uvRowSkip = uvRowStride - (width / 2) * uvPixelStride;
                    if (uvRowSkip > 0) {
                        uBuffer.position((uBuffer.position() + uvRowSkip).toInt());
                        vBuffer.position((vBuffer.position() + uvRowSkip).toInt());
                    }
                    row++;
                }
            }
        }
         catch (e: Throwable) {}
        return nv21Data;
    }
    open fun copyImagePlan(plane: Plane): ByteBuffer {
        var copiedBuffer = ByteBuffer.allocateDirect(plane.getBuffer().capacity());
        copiedBuffer.order(ByteOrder.nativeOrder());
        plane.getBuffer().rewind();
        copiedBuffer.put(plane.getBuffer());
        copiedBuffer.rewind();
        return copiedBuffer;
    }
    open fun getCorrectionMatrixByimgUri(imgView: ImageView, previewView: PreviewView, rotationDegrees: Number): Matrix {
        var matrix = Matrix();
        var imgWidt = imgView.drawable!!.intrinsicWidth as Number;
        var imgHeight = imgView.drawable!!.intrinsicHeight as Number;
        var d0 = 0.toFloat();
        var source = floatArrayOf(d0, d0, imgWidt.toFloat(), d0, imgWidt.toFloat(), imgHeight.toFloat(), d0, imgHeight.toFloat());
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
    open fun calcPoint(imgView: ImageView, previewView: PreviewView, image_point_x: Number, image_point_y: Number, degration: Number): ConverXy1 {
        val image_w = imgView.drawable!!.intrinsicWidth as Number;
        val image_h = imgView.drawable!!.intrinsicHeight as Number;
        val c_w = previewView.width;
        val c_h = previewView.height;
        fun scaleAndCenterContent(container: contaiaSize1, content: contaiaSize1): contaiaCalseSize1 {
            val scaleWidth = container.width / content.width;
            val scaleHeight = container.height / content.height;
            val scale = Math.min(scaleWidth, scaleHeight);
            val offsetX = (container.width - content.width * scale) / 2;
            val offsetY = (container.height - content.height * scale) / 2;
            return contaiaCalseSize1(scale = scale, offsetX = offsetX, offsetY = offsetY);
        }
        fun mapContentCoordinatesToContainer(contentX: Number, contentY: Number, calcsize: contaiaCalseSize1): contaiPointXy1 {
            val containerX = contentX * calcsize.scale + calcsize.offsetX;
            val containerY = contentY * calcsize.scale + calcsize.offsetY;
            return contaiPointXy1(x = containerX, y = containerY);
        }
        var rc = scaleAndCenterContent(contaiaSize1(width = c_w, height = c_h), contaiaSize1(width = image_h, height = image_w));
        if (degration == 0) {
            rc = scaleAndCenterContent(contaiaSize1(width = c_w, height = c_h), contaiaSize1(width = image_w, height = image_h));
        }
        var result = mapContentCoordinatesToContainer(image_point_y, image_point_x, rc);
        if (degration == 0) {
            result = mapContentCoordinatesToContainer(image_point_x, image_point_y, rc);
        }
        var nexyxcov = ConverXy1(x = c_w - result.x, y = result.y, minx = 0, maxx = 0, miny = 0, maxy = 0);
        if (degration == 0) {
            nexyxcov = ConverXy1(x = result.x, y = result.y, minx = 0, maxx = 0, miny = 0, maxy = 0);
        }
        return nexyxcov;
    }
    open fun qrDecoder(img: ImageProxy) {
        var t = this;
        var image = img.getImage();
        if (!this.isDecoderQring && image != null && t.isOpeningCameraing) {
            this.isDecoderQring = true;
            var width = image.getWidth();
            var height = image.getHeight();
            var planes = image.getPlanes();
            var a = this.copyImagePlan(planes[0]);
            var b = this.copyImagePlan(planes[1]);
            var c = this.copyImagePlan(planes[2]);
            var yr = planes[0].getRowStride();
            var ur = planes[1].getRowStride();
            var vr = planes[1].getPixelStride();
            var starttime = Date().getTime();
            var av = this.YUV42088ToNV21Copy(a, b, c, width, height, yr, ur, vr);
            var rotationDegrees = img.imageInfo.rotationDegrees;
            decoderBuffToQr(av, width, height, 0).then(fun(res){
                if (res != null) {
                    var matrix = t.getCorrectionMatrix(img, t.cameraView!!);
                    if (res.text.length > 0) {
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
                        if (ruslt.text.length > 0) {
                            t.setVibatar();
                        }
                        t.setImageViewRusletBox(ruslt);
                        t.closeCamera();
                        if (ruslt.text.length == 1) {
                            callFunEvent(ruslt.text[0]);
                            t.close();
                        }
                    } else {
                        t.isDecoderQring = false;
                    }
                }
            }
            ).`catch`(fun(){
                t.isDecoderQring = false;
            }
            );
        }
        img.close();
    }
    open fun setFlashModel(flash: Boolean) {
        if (this.camera != null && this.isOpeningCameraing) {
            this.flashMode = flash;
            var cameraControl = this.camera!!.cameraControl!!;
            cameraControl.enableTorch(flash);
        }
    }
    open fun setVibatar() {
        if (this.vibrator == null) {
            return;
        }
        if (this.vibrator!!.hasVibrator()) {
            this.vibrator!!.vibrate(80);
        }
    }
    open fun hideTitleBar(): Unit {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    open fun showTitleBar(): Unit {
        this.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data);
        var t = this;
        if (resultCode == Activity.RESULT_OK && data != null && data?.data != null) {
            var selectedImageUri = data.data!!;
            this.camreaLayouView!!.setVisibility(View.GONE);
            this.imageUrl = selectedImageUri;
            this.isSelectedImging = false;
            decoderUriPathToQrByUri(this.imageUrl!!, fun(res: SCANNING_PHOTO_RESULT){
                t.isOpeningCameraing = false;
                t.clearImageView();
                t.imageView!!.setImageURI(t.imageUrl!!);
                var matrix = t.getCorrectionMatrixByimgUri(t.imageView!!, t.cameraView!!, 90);
                var ruslt = res as SCANNING_PHOTO_RESULT;
                if (ruslt.text.length > 0) {
                    t.setVibatar();
                }
                run {
                    var i: Number = 0;
                    while(i < ruslt.bounds.length){
                        var item = ruslt.bounds[i];
                        var result = t.calcPoint(t.imageView!!, t.cameraView!!, item.centerX, item.centerY, 0);
                        item.centerX = result.x;
                        item.centerY = result.y;
                        i++;
                    }
                }
                t.setImageViewRusletBox(ruslt);
                if (ruslt.text.length == 1) {
                    callFunEvent(ruslt.text[0]);
                    t.close();
                }
            });
        } else {
            this.isSelectedImging = false;
        }
    }
    override fun onStart() {
        super.onStart();
        lifecycleRegistry!!.markState(Lifecycle.State.STARTED);
    }
    override fun onDestroy(): Unit {
        super.onDestroy();
        this.close();
        this.showTitleBar();
        console.log("扫码被注销.");
    }
    override fun onStop() {
        lifecycleRegistry!!.markState(Lifecycle.State.CREATED);
        super.onStop();
    }
    override fun onPause(): Unit {
        super.onPause();
        lifecycleRegistry!!.markState(Lifecycle.State.CREATED);
        console.log("暂停扫码");
        this.closeCamera();
    }
    override fun onResume(): Unit {
        super.onResume();
        lifecycleRegistry!!.markState(Lifecycle.State.RESUMED);
        var t = this;
        console.log("恢复扫码1", t.isSelectedImging);
        if (t.imageUrl != null || t.isSelectedImging) {
            return;
        }
        console.log("恢复扫码2");
        this.closeCamera();
        this.openCamera();
    }
    override fun getLifecycle(): Lifecycle {
        return this.lifecycleRegistry!!;
    }
}
@Suppress("DEPRECATION")
open class IntentRunable : Runnable {
    override fun run() {
        var intent = Intent(UTSAndroid.getUniActivity(), DemoActivity().javaClass);
        UTSAndroid.getUniActivity()!!.startActivityForResult(intent, 1);
    }
}
@Suppress("DEPRECATION")
fun gotoDemoActivity(call: CALL_RESULT_FUN, onlyCamera: Boolean): Boolean {
    callFunEvent = call;
    UTSAndroid.getUniActivity()!!.runOnUiThread(IntentRunable());
    return true;
}
fun openCameraApi(call: CALL_RESULT_FUN, onlyCamera: Boolean) {
    var isPrivacyAgreeCamrea = uni_getStorageSync("isPrivacyAgreeCamreaByTmui");
    if (isPrivacyAgreeCamrea != "on") {
        uni_showModal(ShowModalOptions(title = "提醒", content = "将授权你的设备相机使用权限进行拍摄识别功能，是否允许？", success = fun(isPermisseions) {
            if (isPermisseions.confirm) {
                checkPermissions().then(fun(res: Boolean){
                    gotoDemoActivity(call, onlyCamera);
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
        gotoDemoActivity(call, onlyCamera);
    }
}
fun closeCamera() {}
