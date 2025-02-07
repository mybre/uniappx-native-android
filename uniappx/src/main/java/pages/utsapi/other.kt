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
import uts.sdk.modules.xSvgU.XSvgUComponent;
import uts.sdk.modules.xCallPhone.makePhone;
import uts.sdk.modules.xRunnableS.runWorker;
import uts.sdk.modules.xWindowGrey.setWindowGrey;
import uts.sdk.modules.xWindowGrey.removeWindowGrey;
import uts.sdk.modules.xNetworkChange.xNetChange;
import uts.sdk.modules.xNetworkChange.xUnNetChange;
open class GenPagesUtsapiOther : BasePage {
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
        var setup: (__props: GenPagesUtsapiOther) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesUtsapiOther;
            val _cache = __ins.renderCache;
            val netstatus = ref(true);
            val callPhone = fun(){
                makePhone("10086");
            }
            ;
            xNetChange(fun(netcon: Boolean){
                netstatus.value = netcon;
            }
            );
            val openLunMiniWechart = fun(){
                console.log(1);
            }
            ;
            val setPageGrey = fun(){
                return setWindowGrey();
            }
            ;
            val delPageGrey = fun(){
                return removeWindowGrey();
            }
            ;
            val buildForFunResult = ref(-1);
            val buildForFun = fun(){
                buildForFunResult.value = 0;
                runWorker(fun(): Any? {
                    var k: Number = 0;
                    run {
                        var i: Number = 0;
                        while(i < 100000000){
                            k += i;
                            i++;
                        }
                    }
                    return k;
                }
                , fun(result: Any?){
                    console.log(result, "----");
                    buildForFunResult.value = result!! as Number;
                }
                );
            }
            ;
            onUnload(fun(){
                xUnNetChange();
            }
            );
            return fun(): Any? {
                val _component_x_text = resolveEasyComponent("x-text", GenUniModulesTmxUiComponentsXTextXTextClass);
                val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
                val _component_x_sheet = resolveEasyComponent("x-sheet", GenUniModulesTmxUiComponentsXSheetXSheetClass);
                val _component_x_image = resolveEasyComponent("x-image", GenUniModulesTmxUiComponentsXImageXImageClass);
                return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                    createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "拨打电话"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to callPhone), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "拨打10086"
                                );
                            }
                            ), "_" to 1))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "网络状态"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_text, utsMapOf("font-size" to "12", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "网络状态变化,可关闭/打开网络观察"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_text, utsMapOf("color" to if (unref(netstatus)) {
                                "success";
                            } else {
                                "error";
                            }
                            ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "当前网络状态:" + toDisplayString(if (unref(netstatus)) {
                                        "网络已连接";
                                    } else {
                                        "网络已断开";
                                    }
                                    )
                                );
                            }
                            ), "_" to 1), 8, utsArrayOf(
                                "color"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "拉起微信小程序"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to openLunMiniWechart), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "打开tmui3.0小程序"
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
                                    "设置窗口灰"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_text, utsMapOf("font-size" to "12", "class" to "text-weight-b mb-5"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "变灰只针对当前窗口所有内容,如果你想任何页面,自动变灰,你可能需要自行封装通过Minx到每个页面执行灰度操作."
                                );
                            }
                            ), "_" to 1)),
                            createElementVNode("view", utsMapOf("class" to "flex flex-row flex-row-center-between mb-20"), utsArrayOf(
                                createVNode(_component_x_image, utsMapOf("width" to "45%", "height" to "50px", "src" to "https://store.tmui.design/api_v2/public/random_picture?random=39")),
                                createVNode(_component_x_image, utsMapOf("width" to "45%", "height" to "50px", "src" to "https://store.tmui.design/api_v2/public/random_picture?random=322"))
                            )),
                            createElementVNode("view", utsMapOf("class" to "flex flex-row flex-row-center-between"), utsArrayOf(
                                createVNode(_component_x_button, utsMapOf("class" to "mr-20 flex-1", "onClick" to setPageGrey), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        "变灰"
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_x_button, utsMapOf("class" to "flex-1", "onClick" to delPageGrey), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        "恢复"
                                    );
                                }
                                ), "_" to 1))
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "显示SVG"
                                );
                            }
                            ), "_" to 1)),
                            createElementVNode("view", utsMapOf("class" to "flex flex-row flex-row-center-center"), utsArrayOf(
                                createElementVNode(XSvgUComponent.name, utsMapOf("src" to "/static/mailUnreadFill.svg", "width" to 36, "height" to 36, "style" to normalizeStyle(utsMapOf("width" to "36px", "height" to "36px"))), null, 4),
                                createElementVNode(XSvgUComponent.name, utsMapOf("src" to "/static/undraw_farming_ni77.svg", "width" to 100, "height" to 120, "style" to normalizeStyle(utsMapOf("width" to "100px", "height" to "120px"))), null, 4)
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "多线程"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_text, utsMapOf("font-size" to "12", "class" to "text-weight-b mb-5"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "可以执行你复杂的函数逻辑避免卡UI页面线程，这对复杂数据处理非常有效。"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to buildForFun), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "执行循环1000000000次页面不卡"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_text, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "结果集：" + toDisplayString(if (unref(buildForFunResult) == 0) {
                                        "处理中";
                                    } else {
                                        unref(buildForFunResult);
                                    }
                                    )
                                );
                            }
                            ), "_" to 1))
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
