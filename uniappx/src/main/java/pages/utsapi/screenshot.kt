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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById;
import uts.sdk.modules.xScreenshotS.getRootShotImage;
import uts.sdk.modules.xScreenshotS.getElementShotImage;
import io.dcloud.uniapp.extapi.previewImage as uni_previewImage;
open class GenPagesUtsapiScreenshot : BasePage {
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
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesUtsapiScreenshot) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesUtsapiScreenshot;
            val _cache = __ins.renderCache;
            val getScreenimg = fun(){
                getRootShotImage(fun(str: String){
                    if (str == null) {
                        return;
                    }
                    console.log(str);
                    uni_previewImage(PreviewImageOptions(current = str, urls = utsArrayOf<String>(str)));
                }
                );
            }
            ;
            val getSEleimg = fun(){
                var ele = uni_getElementById("screentIds") as UniElement?;
                getElementShotImage(ele, fun(str: String){
                    if (str == null) {
                        return;
                    }
                    console.log(str);
                    uni_previewImage(PreviewImageOptions(current = str, urls = utsArrayOf<String>(str)));
                }
                );
            }
            ;
            return fun(): Any? {
                val _component_x_text = resolveEasyComponent("x-text", GenUniModulesTmxUiComponentsXTextXTextClass);
                val _component_x_sheet = resolveEasyComponent("x-sheet", GenUniModulesTmxUiComponentsXSheetXSheetClass);
                val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
                return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                    createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "屏幕截图 xScreenshotS"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    " 它可对窗口页面进行静默截图,也可以对指定元素进行截图,并保存到缓存目录中,主要应用场景: 窗口图片分享,测试屏幕截图,上报屏幕截图(bug,体验,反馈等),也可指定节点截图对某View排版截图成海报. [WEB不支持] "
                                );
                            }
                            ), "_" to 1))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_sheet, utsMapOf("id" to "screentIds"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_button, utsMapOf("class" to "mb-16", "block" to true, "onClick" to getScreenimg), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "保存屏幕图片"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to getSEleimg), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "保存节点截图"
                                );
                            }
                            ), "_" to 1))
                        );
                    }
                    ), "_" to 1)),
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("height" to "50px"))), null, 4)
                ), 4);
            }
            ;
        }
        ;
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
