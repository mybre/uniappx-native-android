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
import uts.sdk.modules.xCamreaU.XCamreaUComponent;
import uts.sdk.modules.xCamreaU.XCamreaUElement;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesUtsapiXcamrea : BasePage {
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
        val _component_x_checkbox = resolveEasyComponent("x-checkbox", GenUniModulesTmxUiComponentsXCheckboxXCheckboxClass);
        val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
        val _component_x_image = resolveEasyComponent("x-image", GenUniModulesTmxUiComponentsXImageXImageClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "相机 xCamrea"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "可以实时捕捉画面，保存到相册或者保存到本地缓存，h5返回的是base64位数据。目前较为简便，可以适应基本需求,不使用后一定要关闭相机.可以在录制视频的时候拍照"
                        );
                    }
                    ), "_" to 1))
                );
            }
            ), "_" to 1)),
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createElementVNode("text", null, toDisplayString(_ctx.flashValue), 1),
                    createElementVNode(XCamreaUComponent.name, utsMapOf("onRecoder" to _ctx.recoder, "orientation" to _ctx.orientation, "flash" to (_ctx.flashValue == "1"), "onTake" to _ctx.getPhoto, "ref" to "camrea", "style" to normalizeStyle(utsMapOf("width" to "100%", "height" to "320px"))), null, 44, utsArrayOf(
                        "onRecoder",
                        "orientation",
                        "flash",
                        "onTake"
                    ))
                );
            }
            ), "_" to 1)),
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "flex flex-row flex-row-center-start mb-20"), utsArrayOf(
                        createVNode(_component_x_checkbox, utsMapOf("class" to "mr-20", "onChange" to _ctx.configChange, "modelValue" to _ctx.flashValue, "onUpdate:modelValue" to fun(`$event`: String){
                            _ctx.flashValue = `$event`;
                        }
                        , "label" to "打开闪光灯"), null, 8, utsArrayOf(
                            "onChange",
                            "modelValue",
                            "onUpdate:modelValue"
                        )),
                        createVNode(_component_x_checkbox, utsMapOf("onChange" to _ctx.configChange, "modelValue" to _ctx.orientation, "onUpdate:modelValue" to fun(`$event`: String){
                            _ctx.orientation = `$event`;
                        }
                        , "value" to "front", "un-check-value" to "back", "label" to "使用前置摄像头"), null, 8, utsArrayOf(
                            "onChange",
                            "modelValue",
                            "onUpdate:modelValue"
                        ))
                    )),
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "相机抓拍"
                        );
                    }
                    ), "_" to 1)),
                    createElementVNode("view", utsMapOf("class" to "flex flex-row flex-row-center-between mb-8"), utsArrayOf(
                        createVNode(_component_x_button, utsMapOf("width" to "31%", "onClick" to _ctx.open), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                "打开相机"
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "onClick"
                        )),
                        createVNode(_component_x_button, utsMapOf("width" to "31%", "onClick" to _ctx.close), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                "关闭相机"
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "onClick"
                        )),
                        createVNode(_component_x_button, utsMapOf("width" to "31%", "onClick" to _ctx.take), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                "拍照"
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "onClick"
                        ))
                    )),
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "视屏录制"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999", "class" to "mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "停止是结束录制,不是关闭相机的意思,你需要自己维护状态呈现给用户,点了暂停可点开始继续录制并会接着上次继续"
                        );
                    }
                    ), "_" to 1)),
                    createElementVNode("view", utsMapOf("class" to "flex flex-row flex-row-center-between"), utsArrayOf(
                        createVNode(_component_x_button, utsMapOf("loading" to _ctx.isRcodering, "width" to "31%", "onClick" to _ctx.start), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                "开始/继续"
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "loading",
                            "onClick"
                        )),
                        createVNode(_component_x_button, utsMapOf("disabled" to !_ctx.isRcodering, "width" to "31%", "onClick" to _ctx.pause), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                "暂停"
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "disabled",
                            "onClick"
                        )),
                        createVNode(_component_x_button, utsMapOf("disabled" to !_ctx.isRcodering, "width" to "31%", "onClick" to _ctx.stop), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                "停止"
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "disabled",
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
                            "抓拍预览"
                        );
                    }
                    ), "_" to 1)),
                    if (_ctx.urlSrc != "") {
                        createVNode(_component_x_image, utsMapOf("key" to 0, "src" to _ctx.urlSrc), null, 8, utsArrayOf(
                            "src"
                        ));
                    } else {
                        createVNode(_component_x_text, utsMapOf("key" to 1, "font-size" to "12", "color" to "error", "class" to "text-weight-b"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                "请点击上方拍照"
                            );
                        }
                        ), "_" to 1));
                    }
                    ,
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b my-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "视频预览"
                        );
                    }
                    ), "_" to 1)),
                    if (_ctx.videoUrlSrc != "") {
                        createElementVNode("video", utsMapOf("key" to 2, "style" to normalizeStyle(utsMapOf("height" to "125px", "width" to "100%")), "src" to _ctx.videoUrlSrc), null, 12, utsArrayOf(
                            "src"
                        ));
                    } else {
                        createVNode(_component_x_text, utsMapOf("key" to 3, "font-size" to "12", "color" to "error", "class" to "text-weight-b"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                "请点击上方录制然后点结束"
                            );
                        }
                        ), "_" to 1));
                    }
                );
            }
            ), "_" to 1)),
            createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("height" to "50px"))), null, 4)
        ), 4);
    }
    open var urlSrc: String by `$data`;
    open var videoUrlSrc: String by `$data`;
    open var flashValue: String by `$data`;
    open var orientation: String by `$data`;
    open var isRcodering: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("urlSrc" to "", "videoUrlSrc" to "", "flashValue" to "", "orientation" to "back", "isRcodering" to false);
    }
    override fun `$initMethods`() {
        this.start = fun() {
            var el = (this.`$refs`["camrea"] as XCamreaUElement);
            el.start();
            this.isRcodering = true;
        }
        ;
        this.pause = fun() {
            var el = (this.`$refs`["camrea"] as XCamreaUElement);
            el.pause();
            this.isRcodering = false;
        }
        ;
        this.stop = fun() {
            var el = (this.`$refs`["camrea"] as XCamreaUElement);
            el.stop();
        }
        ;
        this.open = fun() {
            var el = (this.`$refs`["camrea"] as XCamreaUElement);
            el.open();
        }
        ;
        this.close = fun() {
            var el = (this.`$refs`["camrea"] as XCamreaUElement);
            el.close();
        }
        ;
        this.configChange = fun() {
            if (this.orientation == "front" && this.flashValue == "1") {
                uni_showToast(ShowToastOptions(title = "闪光灯不能与前置摄像头同时开启", icon = "none"));
                return;
            }
            this.close();
            this.`$nextTick`(fun(){
                this.open();
            }
            );
        }
        ;
        this.take = fun() {
            var el = (this.`$refs`["camrea"] as XCamreaUElement);
            el.take();
        }
        ;
        this.recoder = fun(result: Map<String, String>) {
            var src = "";
            src = result["path"] as String;
            if (src != "") {
                this.videoUrlSrc = src!! as String;
                console.log(src);
            }
            this.isRcodering = false;
        }
        ;
        this.getPhoto = fun(result: Map<String, String>) {
            var src = "";
            src = result["path"] as String;
            if (src != "") {
                this.urlSrc = src!! as String;
            }
        }
        ;
    }
    open lateinit var start: () -> Unit;
    open lateinit var pause: () -> Unit;
    open lateinit var stop: () -> Unit;
    open lateinit var open: () -> Unit;
    open lateinit var close: () -> Unit;
    open lateinit var configChange: () -> Unit;
    open lateinit var take: () -> Unit;
    open lateinit var recoder: (result: Map<String, String>) -> Unit;
    open lateinit var getPhoto: (result: Map<String, String>) -> Unit;
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
