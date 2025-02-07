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
import uts.sdk.modules.xOcrS.chooseImageBuilder;
import uts.sdk.modules.xOcrS.downloadUrlImageBuilder;
import uts.sdk.modules.xOcrS.localFilePathImageBuilder;
open class GenPagesUtsapiOcr : BasePage {
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
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_x_text = resolveEasyComponent("x-text", GenUniModulesTmxUiComponentsXTextXTextClass);
        val _component_x_sheet = resolveEasyComponent("x-sheet", GenUniModulesTmxUiComponentsXSheetXSheetClass);
        val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
        val _component_x_image = resolveEasyComponent("x-image", GenUniModulesTmxUiComponentsXImageXImageClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "文本识别 xOcrS"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            " 支持中文，韩文，日语，英文，德语的识别。 "
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
                            "相册/相机识别"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.choose), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "相册/相机选取"
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "onClick"
                    )),
                    createVNode(_component_x_sheet, utsMapOf("color" to "info", "margin" to utsArrayOf(
                        "0",
                        "32",
                        "0",
                        "0"
                    ), "dark-color" to "#333"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    " 识别结果：" + toDisplayString(_ctx.result.join("\n"))
                                );
                            }
                            ), "_" to 1))
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
                            "网络图片"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_image, utsMapOf("round" to "16", "src" to "https://cdn.tmui.design/xui/xuiocrScanImg.jpg")),
                    createVNode(_component_x_button, utsMapOf("class" to "mt-32", "block" to true, "onClick" to _ctx.download), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "识别上图文字"
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "onClick"
                    )),
                    createVNode(_component_x_sheet, utsMapOf("color" to "info", "margin" to utsArrayOf(
                        "0",
                        "32",
                        "0",
                        "0"
                    ), "dark-color" to "#333"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    " 识别结果：" + toDisplayString(_ctx.result2.join("\n"))
                                );
                            }
                            ), "_" to 1))
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
                            "本地图片路径"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_image, utsMapOf("round" to "16", "src" to "/static/braner.jpg")),
                    createVNode(_component_x_button, utsMapOf("class" to "mt-32", "block" to true, "onClick" to _ctx.localImg), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "识别上图文字"
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "onClick"
                    )),
                    createVNode(_component_x_sheet, utsMapOf("color" to "info", "margin" to utsArrayOf(
                        "0",
                        "32",
                        "0",
                        "0"
                    ), "dark-color" to "#333"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    " 识别结果：" + toDisplayString(_ctx.result3.join("\n"))
                                );
                            }
                            ), "_" to 1))
                        );
                    }
                    ), "_" to 1))
                );
            }
            ), "_" to 1)),
            createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("height" to "50px"))), null, 4)
        ), 4);
    }
    open var result: UTSArray<String> by `$data`;
    open var result2: UTSArray<String> by `$data`;
    open var result3: UTSArray<String> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("result" to utsArrayOf<String>(), "result2" to utsArrayOf<String>(), "result3" to utsArrayOf<String>());
    }
    override fun `$initMethods`() {
        this.choose = fun() {
            var _this = this;
            chooseImageBuilder(fun(txt: UTSArray<String>, sour: UTSArray<String>){
                _this.result = txt;
                console.log(txt, sour as UTSArray<String>);
            }
            , "zh");
        }
        ;
        this.download = fun() {
            var _this = this;
            downloadUrlImageBuilder("https://cdn.tmui.design/xui/xuiocrScanImg.jpg", fun(txt: UTSArray<String>, sour: UTSArray<String>){
                _this.result2 = txt;
                console.log(txt, sour as UTSArray<String>);
            }
            , "zh");
        }
        ;
        this.localImg = fun() {
            var _this = this;
            localFilePathImageBuilder("/static/braner.jpg", fun(txt: UTSArray<String>, sour: UTSArray<String>){
                _this.result3 = txt;
                console.log(txt, sour as UTSArray<String>);
            }
            , "zh");
        }
        ;
    }
    open lateinit var choose: () -> Unit;
    open lateinit var download: () -> Unit;
    open lateinit var localImg: () -> Unit;
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
