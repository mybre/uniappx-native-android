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
import uts.sdk.modules.xAnimationS.xAnimationS;
import uts.sdk.modules.xAnimationS.XDANIMATION_FLIP3D_OPTIONS;
import uts.sdk.modules.xAnimationS.XDANIMATION_TRANSLATE_OPTIONS;
import uts.sdk.modules.xAnimationS.XDANIMATION_ROTATE_OPTIONS;
import uts.sdk.modules.xAnimationS.XDANIMATION_SCALE_OPTIONS;
open class GenPagesUtsapiXAnimationS : BasePage {
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
        var setup: (__props: GenPagesUtsapiXAnimationS) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesUtsapiXAnimationS;
            val _cache = __ins.renderCache;
            val flipx = fun(){
                xAnimationS.flip3D(XDANIMATION_FLIP3D_OPTIONS(ele = uni_getElementById("xta"), deg = 360, from = 0, duration = 1000));
            }
            ;
            val scalex = fun(){
                xAnimationS.scale(XDANIMATION_SCALE_OPTIONS(ele = uni_getElementById("xta"), duration = 320, direction = 2, from = 0.6, scale = 1));
            }
            ;
            val translatel = fun(){
                xAnimationS.translate(XDANIMATION_TRANSLATE_OPTIONS(ele = uni_getElementById("xta"), duration = 320, translation = 0, from = 0, len = -100));
            }
            ;
            val translater = fun(){
                xAnimationS.translate(XDANIMATION_TRANSLATE_OPTIONS(ele = uni_getElementById("xta"), duration = 320, translation = 0, from = -100, len = 0));
            }
            ;
            val rotate = fun(){
                xAnimationS.rotate(XDANIMATION_ROTATE_OPTIONS(ele = uni_getElementById("xta")));
            }
            ;
            val rotate2 = fun(){
                xAnimationS.rotate(XDANIMATION_ROTATE_OPTIONS(ele = uni_getElementById("xta"), from = 180, deg = -180));
            }
            ;
            return fun(): Any? {
                val _component_x_text = resolveEasyComponent("x-text", GenUniModulesTmxUiComponentsXTextXTextClass);
                val _component_x_sheet = resolveEasyComponent("x-sheet", GenUniModulesTmxUiComponentsXSheetXSheetClass);
                val _component_x_cell = resolveEasyComponent("x-cell", GenUniModulesTmxUiComponentsXCellXCellClass);
                val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
                return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                    createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "原生动画 xAnimationS"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    " 这是原生高质量动画插件,不是css style动画,有3d动画,有生命周期回调,对于想实现极致性能要求动画时,非常有效!. 注意:ios 3d翻转,角度只能是0-180之间,如果想翻转360需要自行分段先执行0-180,再执行180-0 "
                                );
                            }
                            ), "_" to 1))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_sheet, utsMapOf("id" to "xta"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("view", null, utsArrayOf(
                                createVNode(_component_x_cell, utsMapOf("url" to "xcrypto", "title" to "加密")),
                                createVNode(_component_x_cell, utsMapOf("url" to "other", "title" to "杂项插件")),
                                createVNode(_component_x_cell, utsMapOf("url" to "xtips", "title" to "消息提示")),
                                createVNode(_component_x_cell, utsMapOf("url" to "screenshot", "title" to "屏幕截图")),
                                createVNode(_component_x_cell, utsMapOf("url" to "clipboard", "title" to "剪切板"))
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "flex flex-row flex-row-center-between mb-20"), utsArrayOf(
                                createVNode(_component_x_button, utsMapOf("class" to "flex-1", "onClick" to scalex), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        "缩放"
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_x_button, utsMapOf("class" to "ml-16 flex-1", "onClick" to flipx), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        "3d翻转"
                                    );
                                }
                                ), "_" to 1))
                            )),
                            createElementVNode("view", utsMapOf("class" to "flex flex-row flex-row-center-between mb-20"), utsArrayOf(
                                createVNode(_component_x_button, utsMapOf("class" to "flex-1", "onClick" to translatel), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        "左移100"
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_x_button, utsMapOf("class" to "ml-16 flex-1", "onClick" to translater), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        "右移100"
                                    );
                                }
                                ), "_" to 1))
                            )),
                            createElementVNode("view", utsMapOf("class" to "flex flex-row flex-row-center-between"), utsArrayOf(
                                createVNode(_component_x_button, utsMapOf("class" to "flex-1", "onClick" to rotate), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        "旋转360"
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_x_button, utsMapOf("class" to "ml-16 flex-1", "onClick" to rotate2), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        "旋转180"
                                    );
                                }
                                ), "_" to 1))
                            ))
                        );
                    }
                    ), "_" to 1))
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
