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
import uts.sdk.modules.xMlkitScannigU.XMlkitScannigUComponent;
import uts.sdk.modules.xMlkitScannigU.XMlkitScannigUElement;
import uts.sdk.modules.xMlkitScannigS.openCameraApi;
import uts.sdk.modules.xMlkitScannigS.closeCamera;
import uts.sdk.modules.xModalS.showModal;
import uts.sdk.modules.xModalS.X_MODAL_TYPE;
import uts.sdk.modules.xToastS.showToast;
import uts.sdk.modules.xToastS.XTOAST_TYPE;
open class GenPagesUtsapiScan : BasePage {
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
        onPageShow(fun() {}, __ins);
        onLoad(fun(_: OnLoadOptions) {}, __ins);
        onBeforeUnmount(fun() {
            closeCamera();
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_x_navbar = resolveEasyComponent("x-navbar", GenUniModulesTmxUiComponentsXNavbarXNavbarClass);
        val _component_x_text = resolveEasyComponent("x-text", GenUniModulesTmxUiComponentsXTextXTextClass);
        val _component_x_sheet = resolveEasyComponent("x-sheet", GenUniModulesTmxUiComponentsXSheetXSheetClass);
        val _component_x_col = resolveEasyComponent("x-col", GenUniModulesTmxUiComponentsXColXColClass);
        val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
        val _component_x_row = resolveEasyComponent("x-row", GenUniModulesTmxUiComponentsXRowXRowClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_x_navbar, utsMapOf("title" to "扫码")),
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "扫码组件 xScanU"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            " 实时扫码，可以嵌入到页面中，自行布局功能。[安卓，Ios,Web/H5]三端支持 ",
                            createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("color" to "red"))), "电脑时：电脑必须授权摄像头权限", 4)
                        );
                    }
                    ), "_" to 1))
                );
            }
            ), "_" to 1)),
            createVNode(_component_x_sheet, utsMapOf("padding" to utsArrayOf(
                "0"
            )), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createElementVNode(XMlkitScannigUComponent.name, utsMapOf("on:clickQr" to _ctx.onclickQr, "onScan" to _ctx.saningEvent, "flash" to true, "autoOpenCamera" to false, "cameraWidth" to 1080, "cameraeiHght" to 1080, "style" to normalizeStyle(utsMapOf("width" to "100%", "height" to "375px", "background" to "black")), "ref" to "XscanU"), null, 44, utsArrayOf(
                        "on:clickQr",
                        "onScan"
                    )),
                    createVNode(_component_x_row, utsMapOf("class" to "pt-32 pb-16"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            if (_ctx.result.length > 1) {
                                createVNode(_component_x_col, utsMapOf("key" to 0, "_class" to "px-10", "span" to 12), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_x_text, utsMapOf("class" to "mb-32 text-align-center", "color" to "error", "font-size" to "20"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                "识别了多个码，请选择一个。"
                                            );
                                        }), "_" to 1))
                                    );
                                }), "_" to 1));
                            } else {
                                createCommentVNode("v-if", true);
                            }
                            ,
                            createVNode(_component_x_col, utsMapOf("_class" to "px-20", "span" to 6), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_x_button, utsMapOf("onClick" to _ctx.openCamera, "block" to true), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            "打开/继续识别"
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "onClick"
                                    ))
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_col, utsMapOf("_class" to "px-20", "span" to 6), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_x_button, utsMapOf("onClick" to _ctx.close, "block" to true), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            "暂停识别"
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "onClick"
                                    ))
                                );
                            }
                            ), "_" to 1))
                        );
                    }
                    ), "_" to 1)),
                    createElementVNode("view", utsMapOf("class" to "mx-16 mb-16"), utsArrayOf(
                        createVNode(_component_x_button, utsMapOf("onClick" to _ctx.choose, "block" to true), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                "相册选择识别"
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "onClick"
                        ))
                    ))
                );
            }
            ), "_" to 1)),
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "扫码Api xScanS"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            " 实时扫码，可以任意位置调用，非页面嵌入式 "
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
                            "打开相机"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("onClick" to _ctx.apiOpen, "block" to true), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "打开相机"
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "onClick"
                    )),
                    createVNode(_component_x_sheet, utsMapOf("margin" to utsArrayOf(
                        "0",
                        "20",
                        "0",
                        "0"
                    ), "color" to "#f5f5f5", "darkColor" to "#333"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "识别结果：" + toDisplayString(_ctx.apiStr)
                                );
                            }
                            ), "_" to 1))
                        );
                    }
                    ), "_" to 1))
                );
            }
            ), "_" to 1))
        ), 4);
    }
    open var result: UTSArray<String> by `$data`;
    open var apiStr: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("result" to utsArrayOf<String>(), "apiStr" to "");
    }
    override fun `$initMethods`() {
        this.saningEvent = fun(str: Any) {
            this.result = str as UTSArray<String>;
            if (this.result.length == 1) {
                showToast(XTOAST_TYPE(title = str[0], iconCode = "", size = 200));
            }
            console.log(this.result);
        }
        ;
        this.onclickQr = fun(str: String) {
            showModal(X_MODAL_TYPE(title = "提醒", content = str, showCancel = false));
        }
        ;
        this.openCamera = fun() {
            var el = (this.`$refs`["XscanU"] as XMlkitScannigUElement);
            el.openCamera();
        }
        ;
        this.choose = fun() {
            var el = (this.`$refs`["XscanU"] as XMlkitScannigUElement);
            el.chooseImage();
        }
        ;
        this.close = fun() {
            var el = (this.`$refs`["XscanU"] as XMlkitScannigUElement);
            el.closeCamera();
        }
        ;
        this.apiOpen = fun() {
            var t = this;
            openCameraApi(fun(str: String){
                t.apiStr = str;
                showToast(XTOAST_TYPE(title = str, iconCode = "", size = 200));
            }
            , false);
        }
        ;
    }
    open lateinit var saningEvent: (str: Any) -> Unit;
    open lateinit var onclickQr: (str: String) -> Unit;
    open lateinit var openCamera: () -> Unit;
    open lateinit var choose: () -> Unit;
    open lateinit var close: () -> Unit;
    open lateinit var apiOpen: () -> Unit;
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
