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
import io.dcloud.uniapp.extapi.`$emit` as uni__emit;
open class GenPagesUtsapiIndex : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onPageScroll(fun(e: OnPageScrollOptions) {
            xProvitae.scrollTop = e.scrollTop;
        }
        , __ins);
        onResize(fun(_: OnResizeOptions) {
            uni__emit("onResize", fun() {});
        }
        , __ins);
        onLoad(fun(_: OnLoadOptions) {}, __ins);
        onPageHide(fun() {
            uni__emit("onHide", fun() {});
        }
        , __ins);
        onPageShow(fun() {
            uni__emit("onShow", fun() {});
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _cache = this.`$`.renderCache;
        val _component_x_cell = resolveEasyComponent("x-cell", GenUniModulesTmxUiComponentsXCellXCellClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_x_cell, utsMapOf("url" to "qrcode", "title" to "二维码生成")),
            createVNode(_component_x_cell, utsMapOf("url" to "ocr", "title" to "ocr文本识别")),
            createVNode(_component_x_cell, utsMapOf("url" to "scan", "title" to "扫码")),
            createVNode(_component_x_cell, utsMapOf("url" to "../index/upload-file", "title" to "文件选择")),
            createVNode(_component_x_cell, utsMapOf("url" to "xloadings", "title" to "全屏加载(showLoading)")),
            createVNode(_component_x_cell, utsMapOf("url" to "xtoast", "title" to "提示消息(toast)")),
            createVNode(_component_x_cell, utsMapOf("url" to "xmodal", "title" to "对话框( showModal)")),
            createVNode(_component_x_cell, utsMapOf("url" to "xcamrea", "title" to "相机")),
            createVNode(_component_x_cell, utsMapOf("url" to "xshare", "title" to "分享")),
            createVNode(_component_x_cell, utsMapOf("url" to "xcrypto", "title" to "加密")),
            createVNode(_component_x_cell, utsMapOf("url" to "other", "title" to "杂项插件")),
            createVNode(_component_x_cell, utsMapOf("url" to "xtips", "title" to "消息提示")),
            createVNode(_component_x_cell, utsMapOf("url" to "screenshot", "title" to "屏幕截图")),
            createVNode(_component_x_cell, utsMapOf("url" to "clipboard", "title" to "剪切板")),
            createVNode(_component_x_cell, utsMapOf("url" to "xAnimationS", "title" to "高质量原生动画"))
        ), 4);
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(), utsArrayOf(
                GenApp.styles
            ))
        };
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
