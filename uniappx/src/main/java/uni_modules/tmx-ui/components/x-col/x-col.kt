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
open class GenUniModulesTmxUiComponentsXColXCol : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("onClick" to _ctx.onClick, "style" to normalizeStyle(utsMapOf("width" to _ctx._width, "transform" to ("translateX(" + _ctx._offset + ")")))), utsArrayOf(
            createElementVNode("view", mergeProps(_ctx.`$attrs`, utsMapOf("style" to utsArrayOf(
                _ctx.__style
            ), "class" to _ctx.___class)), utsArrayOf(
                renderSlot(_ctx.`$slots`, "default")
            ), 16)
        ), 12, utsArrayOf(
            "onClick"
        ));
    }
    open var xRowCol: Number by `$inject`;
    open var span: Number by `$props`;
    open var offset: String by `$props`;
    open var _style: String by `$props`;
    open var _class: String by `$props`;
    open var _width: String by `$data`;
    open var __style: String by `$data`;
    open var ___class: String by `$data`;
    open var _offset: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("_width" to computed<String>(fun(): String {
            return (this.span / this.xRowCol * 100).toFixed(6) + "%";
        }
        ), "__style" to computed<String>(fun(): String {
            return this._style;
        }
        ), "___class" to computed<String>(fun(): String {
            return this._class;
        }
        ), "_offset" to computed<String>(fun(): String {
            return checkIsCssUnit(this.offset, "rpx");
        }
        ));
    }
    override fun `$initMethods`() {
        this.onClick = fun() {
            this.`$emit`("click");
        }
        ;
    }
    open lateinit var onClick: () -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf())
        };
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf("xRowCol" to utsMapOf("type" to "Number", "default" to 12));
        var emits: Map<String, Any?> = utsMapOf("click" to null);
        var props = normalizePropsOptions(utsMapOf("span" to utsMapOf("type" to "Number", "default" to 3), "offset" to utsMapOf("type" to "String", "default" to "0"), "_style" to utsMapOf("type" to "String", "default" to ""), "_class" to utsMapOf("type" to "String", "default" to "")));
        var propsNeedCastKeys = utsArrayOf(
            "span",
            "offset",
            "_style",
            "_class"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
