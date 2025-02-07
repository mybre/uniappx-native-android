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
import io.dcloud.uniapp.extapi.downloadFile as uni_downloadFile;
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading;
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading;
import uts.sdk.modules.xShareS.xShare;
open class GenPagesUtsapiXshare : BasePage {
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
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_x_text = resolveEasyComponent("x-text", GenUniModulesTmxUiComponentsXTextXTextClass);
        val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
        val _component_x_sheet = resolveEasyComponent("x-sheet", GenUniModulesTmxUiComponentsXSheetXSheetClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "分享 xShare"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("class" to "mb-20", "color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            " 文本无法分享到微信，其它的视频，图片，文件可以分享到微信，QQ等相关应用。 "
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.shareText), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "分享文本"
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
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "扫码Api xScanS"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("class" to "mb-20", "color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            " 可以分享到微信，qq等 "
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.shareImage), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "分享图片"
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
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "分享文件"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("class" to "mb-20", "color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            " 可以分享到微信，qq等 "
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.sharePdf), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "分享PDF文件"
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
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "分享视频"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("class" to "mb-20", "color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            " 可以分享到微信，qq等 "
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_button, utsMapOf("block" to true, "onClick" to _ctx.shareMp4), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "分享视频"
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
    override fun `$initMethods`() {
        this.shareText = fun() {
            xShare("TMUI4.0x好棒 https://x-ui.design", "text/plain", "TMUI4.0x好棒 https://x-ui.design", null);
        }
        ;
        this.shareImage = fun() {
            uni_downloadFile(DownloadFileOptions(url = "https://xui.tmui.design/assets/logo-a483vlZl.png", success = fun(res) {
                xShare("我是分享的文本", "image/*", null, res.tempFilePath);
            }
            ));
        }
        ;
        this.sharePdf = fun() {
            uni_showLoading(ShowLoadingOptions(title = "..."));
            uni_downloadFile(DownloadFileOptions(url = "https://www.espressif.com/sites/default/files/documentation/0a-esp8266ex_datasheet_cn.pdf", success = fun(evt) {
                uni_hideLoading();
                var decodedPath = evt.tempFilePath;
                xShare("我是分享的文本", "*/*", null, decodedPath);
            }
            , fail = fun(_) {
                uni_hideLoading();
            }
            ));
        }
        ;
        this.shareMp4 = fun() {
            uni_showLoading(ShowLoadingOptions(title = "..."));
            uni_downloadFile(DownloadFileOptions(url = "https://cdn.tmui.design/public/testDownVideo.mp4", success = fun(evt) {
                uni_hideLoading();
                var decodedPath = evt.tempFilePath;
                xShare("我是分享的视频", "*/*", null, decodedPath);
                uni_hideLoading();
            }
            , fail = fun(_) {
                uni_hideLoading();
            }
            ));
        }
        ;
    }
    open lateinit var shareText: () -> Unit;
    open lateinit var shareImage: () -> Unit;
    open lateinit var sharePdf: () -> Unit;
    open lateinit var shareMp4: () -> Unit;
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
