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
open class GenUniModulesTmxUiComponentsXRowXRow : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        provide("xRowCol", this.col);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", mergeProps(_ctx.`$attrs`, utsMapOf("class" to "xRow", "style" to utsMapOf("justify-content" to _ctx._justify, "align-items" to _ctx._align, "flex-wrap" to if (_ctx.wrap) {
            "wrap";
        } else {
            "nowrap";
        }
        ))), utsArrayOf(
            renderSlot(_ctx.`$slots`, "default")
        ), 16);
    }
    open var col: Number by `$props`;
    open var justify: String by `$props`;
    open var align: String by `$props`;
    open var wrap: Boolean by `$props`;
    open var _justify: String by `$data`;
    open var _align: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("_justify" to computed<String>(fun(): String {
            var str = "flex-start";
            if (this.justify == "end") {
                str = "flex-end";
            } else if (this.justify == "start") {
                str = "flex-start";
            } else {
                str = this.justify;
            }
            return str;
        }
        ), "_align" to computed<String>(fun(): String {
            return this.align;
        }
        ));
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("xRow" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("col" to utsMapOf("type" to "Number", "default" to 12), "justify" to utsMapOf("type" to "String", "default" to "start"), "align" to utsMapOf("type" to "String", "default" to "flex-start"), "wrap" to utsMapOf("type" to "Boolean", "default" to true)));
        var propsNeedCastKeys = utsArrayOf(
            "col",
            "justify",
            "align",
            "wrap"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
