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
import uts.sdk.modules.xToastS.showToast;
import uts.sdk.modules.xToastS.XTOAST_TYPE;
open class GenPagesUtsapiXtoast : BasePage {
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
                            "提示消息 xToastS"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "这是全局方法,可以在任意位置调用,会覆盖整个屏幕的内容包括系统界面. 支持属性多。用于代替官方的 uni.showToast"
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
                            "打开消息提示"
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
                            "定义图标，颜色等"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.loadAlert2), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "打开"
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
                            "仅限示标题"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.loadAlert3), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "打开"
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
                            "仅限示图标"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.loadAlert4), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "打开"
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
    open var msgBGcolor: String by `$data`;
    open var maskBGcolor: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("msgBGcolor" to computed<String>(fun(): String {
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
        this.loadAlert1 = fun() {
            showToast(XTOAST_TYPE(title = "提示消息提示消息提示消息提示消息操作成功操作成功提示消息提示消息提示消息提示消息操作成功操作成功"));
        }
        ;
        this.loadAlert2 = fun() {
            showToast(XTOAST_TYPE(iconCode = "EB79", title = "操作成功", contentBgColor = "#333", titleColor = "#1fc73d", iconColor = "#1fc73d"));
        }
        ;
        this.loadAlert3 = fun() {
            showToast(XTOAST_TYPE(iconCode = "", title = "提示消息提示消息提示消息提示消息操作成功操作成功提示消息提示消息提示消息提示消息操作成功操作成功"));
        }
        ;
        this.loadAlert4 = fun() {
            showToast(XTOAST_TYPE(iconCode = "F100", title = ""));
        }
        ;
    }
    open lateinit var loadAlert1: () -> Unit;
    open lateinit var loadAlert2: () -> Unit;
    open lateinit var loadAlert3: () -> Unit;
    open lateinit var loadAlert4: () -> Unit;
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
