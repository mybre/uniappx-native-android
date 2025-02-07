@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uni.UNIBEFAB40;
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
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import uts.sdk.modules.xOpenweb.openWeb;
import io.dcloud.uniapp.extapi.reLaunch as uni_reLaunch;
import io.dcloud.uniapp.extapi.redirectTo as uni_redirectTo;
import io.dcloud.uniapp.extapi.switchTab as uni_switchTab;
open class GenUniModulesTmxUiComponentsXLinkXLink : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    open var href: String by `$props`;
    open var color: String by `$props`;
    open var fontSize: String by `$props`;
    open var line: Boolean by `$props`;
    open var openType: String by `$props`;
    open var prefix: String by `$props`;
    open var suffix: String by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesTmxUiComponentsXLinkXLink) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesTmxUiComponentsXLinkXLink;
            val _cache = __ins.renderCache;
            fun emits(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val _color = computed(fun(): String {
                if (props.color == "") {
                    return getDefaultColor(xConfig.color);
                }
                return getDefaultColor(props.color);
            }
            );
            val getIcon = fun(icon: String): String {
                var texts = "";
                try {
                    var code = "";
                    code = fonts[icon] as String;
                    var codePoint = Integer.parseInt(code, 16);
                    var charArray = Character.toChars(codePoint);
                    texts = String(charArray);
                }
                 catch (e: Throwable) {
                    console.error("xicon解析失败。", e);
                }
                return texts;
            }
            ;
            val _fontSize = computed(fun(): String {
                var fontSize = checkIsCssUnit(props.fontSize, xConfig.unit);
                if (xConfig.fontScale == 1) {
                    return fontSize;
                }
                var sizeNumber = parseInt(fontSize);
                if (isNaN(sizeNumber)) {
                    sizeNumber = 14;
                }
                return (sizeNumber * xConfig.fontScale).toString(10) + getUnit(fontSize);
            }
            );
            val _prefix = computed(fun(): String {
                if (props.prefix == "") {
                    return "";
                }
                return getIcon(props.prefix);
            }
            );
            val _suffix = computed(fun(): String {
                if (props.suffix == "") {
                    return "";
                }
                return getIcon(props.suffix);
            }
            );
            val onclick = fun(){
                emits("click");
                if (props.href == "") {
                    return;
                }
                var isHttpRef = props.href.indexOf(".");
                var href = props.href;
                if (isHttpRef > -1) {
                    openWeb(href);
                }
                when (props.openType) {
                    "navigateBack" -> 
                        uni_navigateBack(NavigateBackOptions());
                    "navigate" -> 
                        uni_navigateTo(NavigateToOptions(url = href));
                    "reLaunch" -> 
                        uni_reLaunch(ReLaunchOptions(url = href));
                    "redirect" -> 
                        uni_redirectTo(RedirectToOptions(url = href));
                    "switchTab" -> 
                        uni_switchTab(SwitchTabOptions(url = href));
                    else -> 
                        uni_navigateTo(NavigateToOptions(url = href));
                }
            }
            ;
            return fun(): Any? {
                return createElementVNode("text", utsMapOf("onClick" to onclick, "class" to "xLink", "style" to normalizeStyle(utsMapOf("color" to unref(_color), "fontSize" to unref(_fontSize), "text-decoration-line" to if (props.line) {
                    "underline";
                } else {
                    "none";
                }
                ))), utsArrayOf(
                    if (unref(_prefix) != "") {
                        createElementVNode("text", utsMapOf("key" to 0, "style" to normalizeStyle(utsMapOf("font-family" to "remixicon", "font-size" to unref(_fontSize), "color" to unref(_color), "paddingRight" to "5px"))), toDisplayString(unref(_prefix)), 5);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("color" to unref(_color), "fontSize" to unref(_fontSize)))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "default")
                    ), 4),
                    if (unref(_suffix) != "") {
                        createElementVNode("text", utsMapOf("key" to 1, "style" to normalizeStyle(utsMapOf("font-family" to "remixicon", "font-size" to unref(_fontSize), "color" to unref(_color), "paddingLeft" to "5px"))), toDisplayString(unref(_suffix)), 5);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                ), 4);
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf())
        };
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("click" to null);
        var props = normalizePropsOptions(utsMapOf("href" to utsMapOf("type" to "String", "default" to ""), "color" to utsMapOf("type" to "String", "default" to ""), "fontSize" to utsMapOf("type" to "String", "default" to "15"), "line" to utsMapOf("type" to "Boolean", "default" to false), "openType" to utsMapOf("type" to "String", "default" to "navigate"), "prefix" to utsMapOf("type" to "String", "default" to "links-line"), "suffix" to utsMapOf("type" to "String", "default" to "")));
        var propsNeedCastKeys = utsArrayOf(
            "href",
            "color",
            "fontSize",
            "line",
            "openType",
            "prefix",
            "suffix"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
