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
import uts.sdk.modules.xQrU.XQrUComponent;
import uts.sdk.modules.xQrU.XQrUElement;
import io.dcloud.uniapp.extapi.previewImage as uni_previewImage;
open class GenPagesUtsapiQrcode : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {}, __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_x_text = resolveEasyComponent("x-text", GenUniModulesTmxUiComponentsXTextXTextClass);
        val _component_x_sheet = resolveEasyComponent("x-sheet", GenUniModulesTmxUiComponentsXSheetXSheetClass);
        val _component_x_input = resolveEasyComponent("x-input", GenUniModulesTmxUiComponentsXInputXInputClass);
        val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "二维码组件 xQrU"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            " APP端使用Zxing库原生生成码，WEB/H5使用第三方js库原生生成，非webview，生成速度极快。 "
                        );
                    }
                    ), "_" to 1))
                );
            }
            ), "_" to 1)),
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "生成码"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            " 输入内容自动生成 "
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_input, utsMapOf("darkBgColor" to "", "class" to "mb-32", "modelValue" to _ctx.urls2, "onUpdate:modelValue" to fun(`$event`: String){
                        _ctx.urls2 = `$event`;
                    }
                    ), null, 8, utsArrayOf(
                        "modelValue",
                        "onUpdate:modelValue"
                    )),
                    createElementVNode("view", utsMapOf("class" to "flex flex-row mb-16"), utsArrayOf(
                        createElementVNode(XQrUComponent.name, utsMapOf("ref" to "qr", "logo" to "/static/logo-cirel.png", "class" to "mr-32", "content" to _ctx.urls2, "width" to 120, "height" to 120, "style" to normalizeStyle(utsMapOf("width" to "120px", "height" to "120px"))), null, 12, utsArrayOf(
                            "content"
                        )),
                        createElementVNode(XQrUComponent.name, utsMapOf("logo" to "/static/logo-cirel.png", "foregroundColor" to "#FF0000", "content" to _ctx.urls2, "width" to 120, "height" to 120, "style" to normalizeStyle(utsMapOf("width" to "120px", "height" to "120px"))), null, 12, utsArrayOf(
                            "content"
                        ))
                    )),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.getQrPath), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "获取码的图片路径"
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "onClick"
                    ))
                );
            }
            ), "_" to 1))
        ), 4);
    }
    open var urls: String by `$data`;
    open var urls2: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("urls" to "TMUI4x", "urls2" to "https://tmui.design");
    }
    override fun `$initMethods`() {
        this.getQrPath = fun() {
            var el = this.`$refs`["qr"] as XQrUElement;
            var path = el.getQrcodePath();
            console.log(path);
            uni_previewImage(PreviewImageOptions(current = path, urls = utsArrayOf<String>(path)));
        }
        ;
    }
    open lateinit var getQrPath: () -> Unit;
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
