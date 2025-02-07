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
import uts.sdk.modules.xLoadingS.showLoading;
import uts.sdk.modules.xLoadingS.hideXloading;
import uts.sdk.modules.xLoadingS.XLOADINGS_TYPE;
open class GenPagesUtsapiXloadings : BasePage {
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
        val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "全屏加载 xLoadingS"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "这是全局方法,可以在任意位置调用,会覆盖整个屏幕的内容包括系统界面.可以修改图标,背景,内容背景色支持属性多。用于代替官方的 uni.showLoading"
                        );
                    }
                    ), "_" to 1))
                );
            }
            ), "_" to 1)),
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.loadAlert1), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "尝试加载下"
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "onClick"
                    ))
                );
            }
            ), "_" to 1)),
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-24"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "自定义图标及遮罩背景"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.loadAlert2), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "加载"
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "onClick"
                    ))
                );
            }
            ), "_" to 1)),
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-24"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "添加标题，高度可自适应，自动断行"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.loadAlert3), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "加载"
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
    open var showModel: Boolean by `$data`;
    open var msgBGcolor: String by `$data`;
    open var maskBGcolor: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("showModel" to false, "msgBGcolor" to computed<String>(fun(): String {
            return if (xStore.xConfig.dark == "dark") {
                "#333333";
            } else {
                "#ffffff";
            }
            ;
        }
        ), "maskBGcolor" to computed<String>(fun(): String {
            return if (xStore.xConfig.dark == "dark") {
                "#000";
            } else {
                "#f5f5f5";
            }
            ;
        }
        ));
    }
    override fun `$initMethods`() {
        this.closeModal = fun() {
            showLoading(XLOADINGS_TYPE(contentBgColor = this.msgBGcolor));
            setTimeout(fun() {
                hideXloading();
            }
            , 1500);
        }
        ;
        this.loadAlert1 = fun() {
            showLoading(XLOADINGS_TYPE(contentBgColor = this.msgBGcolor));
            setTimeout(fun() {
                hideXloading();
            }
            , 1500);
        }
        ;
        this.loadAlert2 = fun() {
            showLoading(XLOADINGS_TYPE(contentBgColor = this.msgBGcolor, iconCode = "EEC2", maskBgColor = this.maskBGcolor));
            setTimeout(fun() {
                hideXloading();
            }
            , 1500);
        }
        ;
        this.loadAlert3 = fun() {
            showLoading(XLOADINGS_TYPE(contentBgColor = "#FFF", titleColor = xStore.xConfig.color, title = "我是测试超长文本顶替非机动车顶替", iconCode = "EEC2", maskBgColor = "rgb(5, 121, 255)"));
            setTimeout(fun() {
                hideXloading();
            }
            , 1500);
        }
        ;
    }
    open lateinit var closeModal: () -> Unit;
    open lateinit var loadAlert1: () -> Unit;
    open lateinit var loadAlert2: () -> Unit;
    open lateinit var loadAlert3: () -> Unit;
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
