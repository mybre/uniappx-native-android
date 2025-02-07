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
import uts.sdk.modules.xModalS.showModal;
import uts.sdk.modules.xModalS.X_MODAL_TYPE;
open class GenPagesUtsapiXmodal : BasePage {
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
                            "对话框 xShwoModal"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "这是全局方法,可以在任意位置调用,会覆盖整个屏幕的内容包括系统界面.可以修改图标,背景,内容背景色用于代替官方的 uni.showModal"
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
                            "重新配置个性主题，并为按钮添加图标"
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
                            "按钮钮不分离"
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
                            "只显示确认按钮"
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
            showModal(X_MODAL_TYPE(title = "提醒框", content = "这是一条测试消息对话框，默认是按钮分离哦。", contentAlign = "center"));
        }
        ;
        this.loadAlert2 = fun() {
            showModal(X_MODAL_TYPE(title = "提醒框", content = "这是一条测试消息对话框，默认是按钮分离哦。", contentBgColor = "#333", titleColor = "#fff", contentColor = "#f5f5f5", confirmBgColor = "#fc2760", cancelBgColor = "#6c5861", cancelColor = "#fff", confirmIcon = "EB79", cancelIcon = "EB97", contentAlign = "center"));
        }
        ;
        this.loadAlert3 = fun() {
            showModal(X_MODAL_TYPE(title = "提醒框", content = "这是一条测试消息对话框。", isSplitBtn = false));
        }
        ;
        this.loadAlert4 = fun() {
            showModal(X_MODAL_TYPE(title = "提醒框", content = "这是一条测试消息对话框.", showCancel = false));
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
