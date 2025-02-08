@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xLoadingS;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
open class XLOADINGS_TYPE (
    open var iconColor: String? = null,
    open var contentBgColor: String? = null,
    open var maskBgColor: String? = null,
    open var iconSize: Number? = null,
    open var iconCode: String? = null,
    open var title: String? = null,
    open var titleSize: Number? = null,
    open var titleColor: String? = null,
    open var size: Number? = null,
) : UTSObject()
open class XLOADINGS_TYPE_PRIVATE (
    @JsonNotNull
    open var iconColor: String,
    @JsonNotNull
    open var contentBgColor: String,
    @JsonNotNull
    open var maskBgColor: String,
    @JsonNotNull
    open var iconSize: Number,
    @JsonNotNull
    open var iconCode: String,
    @JsonNotNull
    open var title: String,
    @JsonNotNull
    open var titleSize: Number,
    @JsonNotNull
    open var titleColor: String,
    @JsonNotNull
    open var size: Number,
) : UTSObject()
open class RGBA (
    @JsonNotNull
    open var r: Number,
    @JsonNotNull
    open var g: Number,
    @JsonNotNull
    open var b: Number,
    @JsonNotNull
    open var a: Number,
) : UTSObject()
fun hexToRgb(sColors: String): RGBA? {
    if (sColors == "") {
        return null;
    }
    var reg = UTSRegExp("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}|[A-Fa-f0-9]{8})\$", "");
    var sColor: String = sColors.toLowerCase();
    if (sColor != "" && reg.test(sColor)) {
        if (sColor.length == 4) {
            var sColorNew = "#";
            run {
                var i: Number = 1;
                while(i < 4){
                    sColorNew += sColor.slice(i, i + 1).concat(sColor.slice(i, i + 1));
                    i += 1;
                }
            }
            sColor = sColorNew;
        }
        var sColorChange: UTSArray<Number> = utsArrayOf();
        sColorChange.push(parseInt(sColor.substring(1, 3), 16));
        sColorChange.push(parseInt(sColor.substring(3, 5), 16));
        sColorChange.push(parseInt(sColor.substring(5, 7), 16));
        if (sColor.length == 9) {
            sColorChange.push(parseInt(sColor.substring(7, 9), 16) / 255);
        }
        return RGBA(r = sColorChange[0], g = sColorChange[1], b = sColorChange[2], a = if (sColorChange.length == 4) {
            sColorChange[3];
        } else {
            1;
        });
    } else if (UTSRegExp("^(rgb|RGB|rgba|RGBA)", "").test(sColor)) {
        var arr: UTSArray<String> = sColor.replace(UTSRegExp("(?:\\(|\\)|rgba|rgb|RGB|RGBA)*", "g"), "").split(",");
        var p: UTSArray<Number> = arr.map(fun(kVal: String): Number {
            return parseInt(kVal);
        }
        );
        if (p.length < 3) {
            return RGBA(r = 0, g = 0, b = 0, a = 1);
        }
        if (p.length == 3) {
            p.add(1);
        }
        return RGBA(r = p[0], g = p[1], b = p[2], a = if (arr.length == 3) {
            p[3];
        } else {
            parseFloat(arr[3]);
        }
        );
    }
    return null;
}
val defaultConfig = XLOADINGS_TYPE_PRIVATE(iconColor = "rgb(5,121,255)", contentBgColor = "rgba(255,255,255,1)", maskBgColor = "rgba(0,0,0,0.6)", iconSize = 36, iconCode = "EEC4", title = "", titleSize = 12, titleColor = "#a0a1a7", size = 100);
fun configCover(opts: XLOADINGS_TYPE): XLOADINGS_TYPE_PRIVATE {
    var iconColor = if (opts.iconColor != null) {
        opts.iconColor!!;
    } else {
        defaultConfig.iconColor;
    }
    ;
    var contentBgColor = if (opts.contentBgColor != null) {
        opts.contentBgColor!!;
    } else {
        defaultConfig.contentBgColor;
    }
    ;
    var maskBgColor = if (opts.maskBgColor != null) {
        opts.maskBgColor!!;
    } else {
        defaultConfig.maskBgColor;
    }
    ;
    var iconSize = if (opts.iconSize != null) {
        opts.iconSize!!;
    } else {
        defaultConfig.iconSize;
    }
    ;
    var iconCode = if (opts.iconCode != null) {
        opts.iconCode!!;
    } else {
        defaultConfig.iconCode;
    }
    ;
    var title = if (opts.title != null) {
        opts.title!!;
    } else {
        defaultConfig.title;
    }
    ;
    var titleSize = if (opts.titleSize != null) {
        opts.titleSize!!;
    } else {
        defaultConfig.titleSize;
    }
    ;
    var titleColor = if (opts.titleColor != null) {
        opts.titleColor!!;
    } else {
        defaultConfig.titleColor;
    }
    ;
    var size = if (opts.size != null) {
        opts.size!!;
    } else {
        defaultConfig.size;
    }
    ;
    return XLOADINGS_TYPE_PRIVATE(iconColor = iconColor, contentBgColor = contentBgColor, maskBgColor = maskBgColor, iconSize = iconSize, iconCode = iconCode, title = title, titleSize = titleSize, titleColor = titleColor, size = size);
}
var maskDomId: Number = 5894;
fun px2dp(n: Number): Number {
    val mets = UTSAndroid.getAppContext()!!.resources!!.getDisplayMetrics();
    return mets.density * n;
}
fun setSpin(textView: TextView) {
    try {
        textView.clearAnimation();
    }
     catch (e: Throwable) {}
    var rotationStart: Number = 0;
    var rotation: Number = 360;
    var rotationAnimator = ObjectAnimator.ofFloat(textView, "rotation", rotationStart.toFloat(), rotation.toFloat());
    rotationAnimator.setDuration(1000);
    open class LinearInterpolator : TimeInterpolator {
        override fun getInterpolation(input: Float): Float {
            return input;
        }
    }
    rotationAnimator.setInterpolator(LinearInterpolator());
    rotationAnimator.setRepeatCount(ValueAnimator.INFINITE);
    rotationAnimator.start();
}
fun hideXloading() {
    UTSAndroid.getDispatcher("main").async(fun(_) {
        var decorView = UTSAndroid.getUniActivity()!!.window.decorView as ViewGroup;
        var mk = decorView.findViewById<View>(maskDomId.toInt());
        if (mk != null) {
            decorView.removeView(mk);
        }
    }
    );
}
fun showLoading(opts: XLOADINGS_TYPE?) {
    var decorView = UTSAndroid.getUniActivity()!!.window.decorView as ViewGroup;
    UTSAndroid.getDispatcher("main").async(fun(_) {
        try {
            var mk = decorView.findViewById<View>(maskDomId.toInt());
            if (mk != null) {
                decorView.removeView(mk);
            }
        }
         catch (e: Throwable) {}
        var realopts = if (opts == null) {
            (XLOADINGS_TYPE());
        } else {
            opts!!;
        }
        ;
        var config = configCover(realopts);
        var rmbgColor = hexToRgb(config.maskBgColor);
        var textColor = hexToRgb(config.iconColor);
        var wrapColor = hexToRgb(config.contentBgColor);
        var titleColorRgb = hexToRgb(config.titleColor);
        var mbgColor = if (rmbgColor == null) {
            Color.parseColor(config.maskBgColor);
        } else {
            Color.argb((rmbgColor!!.a * 255).toInt(), rmbgColor!!.r.toInt(), rmbgColor!!.g.toInt(), rmbgColor!!.b.toInt());
        }
        ;
        var fontColor = if (textColor == null) {
            Color.parseColor(config.iconColor);
        } else {
            Color.argb((textColor!!.a * 255).toInt(), textColor!!.r.toInt(), textColor!!.g.toInt(), textColor!!.b.toInt());
        }
        ;
        var contentColor = if (rmbgColor == null) {
            Color.parseColor(config.contentBgColor);
        } else {
            Color.argb((wrapColor!!.a * 255).toInt(), wrapColor!!.r.toInt(), wrapColor!!.g.toInt(), wrapColor!!.b.toInt());
        }
        ;
        var titleColor = if (titleColorRgb == null) {
            Color.parseColor(config.titleColor);
        } else {
            Color.argb((titleColorRgb!!.a * 255).toInt(), titleColorRgb!!.r.toInt(), titleColorRgb!!.g.toInt(), titleColorRgb!!.b.toInt());
        }
        ;
        val context = UTSAndroid.getAppContext()!! as Context;
        var maskerDom = RelativeLayout(context);
        open class MaskerDomClickListsner : View.OnTouchListener {
            constructor() : super() {}
            override fun onTouch(view: View, event: MotionEvent): Boolean {
                return true;
            }
        }
        maskerDom.setOnTouchListener(MaskerDomClickListsner());
        var maskerDomLayrPrams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        maskerDom.setLayoutParams(maskerDomLayrPrams);
        maskerDom.setBackgroundColor(mbgColor);
        maskerDom.setGravity(Gravity.CENTER);
        maskerDom.setId(maskDomId.toInt());
        var contentWrapDiv = LinearLayout(context);
        var bg = GradientDrawable();
        bg.setColor(contentColor);
        bg.setCornerRadius(px2dp(16).toFloat());
        contentWrapDiv.setBackground(bg);
        var wpx = px2dp(config.size).toInt();
        var wpxminheight = px2dp(100).toInt();
        contentWrapDiv.setLayoutParams(LinearLayout.LayoutParams(wpx, ViewGroup.LayoutParams.WRAP_CONTENT));
        contentWrapDiv.setMinimumHeight(wpx);
        var wpadingx = px2dp(16).toInt();
        contentWrapDiv.setPadding(wpadingx, wpadingx, wpadingx, wpadingx);
        contentWrapDiv.setGravity(Gravity.CENTER);
        contentWrapDiv.setOrientation(LinearLayout.VERTICAL);
        var iconDiv = TextView(context);
        iconDiv.setTextColor(fontColor);
        var assetManager = context!!.getAssets();
        var typeface = Typeface.createFromAsset(assetManager, "remixicon.ttf");
        iconDiv.setTypeface(typeface);
        iconDiv.setGravity(Gravity.CENTER);
        iconDiv.setTextSize(config.iconSize.toFloat());
        if (!TextUtils.isEmpty(config.iconCode)) {
            var codePoint = Integer.parseInt(config.iconCode, 16);
            var charArray = Character.toChars(codePoint);
            var text = String(charArray);
            iconDiv.setText(text);
        }
        setSpin(iconDiv);
        contentWrapDiv.addView(iconDiv);
        if (config.title != "") {
            var titleDiv = TextView(context);
            titleDiv.setText(config.title);
            titleDiv.setTextSize(config.titleSize.toFloat());
            titleDiv.setTextColor(titleColor);
            titleDiv.setGravity(Gravity.CENTER);
            contentWrapDiv.addView(titleDiv);
        }
        maskerDom.addView(contentWrapDiv);
        decorView.addView(maskerDom!!);
        try {
            var s0 = 0.toFloat();
            var s1 = 1.toFloat();
            contentWrapDiv.setAlpha(s0);
            contentWrapDiv.setScaleX(s0);
            contentWrapDiv.setScaleY(s0);
            var ani = contentWrapDiv.animate() as ViewPropertyAnimator;
            ani.alpha(s1).scaleX(s1).scaleY(s1).setDuration(250).start();
        }
         catch (e: Throwable) {}
    }
    );
}
