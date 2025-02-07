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
import uts.sdk.modules.xCryptoS.md5;
import uts.sdk.modules.xCryptoS.sha256;
import uts.sdk.modules.xCryptoS.sha1;
import uts.sdk.modules.xCryptoS.hmacSha256;
import uts.sdk.modules.xCryptoS.base64Encode;
import uts.sdk.modules.xCryptoS.base64Decode;
import uts.sdk.modules.xCryptoS.aesEncrypt;
import uts.sdk.modules.xCryptoS.aesDecrypt;
import uts.sdk.modules.xCryptoS.desEncrypt;
import uts.sdk.modules.xCryptoS.desDecrypt;
import uts.sdk.modules.xCryptoS.rsaEncrypt;
import uts.sdk.modules.xCryptoS.rsaDecrypt;
import uts.sdk.modules.xCryptoS.rc4Encrypt;
import uts.sdk.modules.xCryptoS.rc4Decrypt;
open class GenPagesUtsapiXcrypto : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {
            var t = this;
            t.sh256ValueEntr = sha256(t.sh256Value);
            console.log("hmacSha256:", hmacSha256(t.sh256Value, t.sh256Value));
            console.log("sha1:", sha1(t.sh256Value));
            var aes = aesEncrypt("1234567890abcdef", "TMUI4.0X", "CBC", "1234567890abcdef");
            var deaes = aesDecrypt("1234567890abcdef", aes, "CBC", "1234567890abcdef");
            console.log("aes:", aes, "deaes:", deaes);
            var des = desEncrypt(t.sh256Value, t.sh256Value, "CBC", "12345678");
            var dedes = desDecrypt(t.sh256Value, des, "CBC", "12345678");
            console.log("des:", des, "dedes:", dedes);
            var rsa = rsaEncrypt("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJqyEuU/GSbjbnhOz4m1fgDEowwWNJwaBf9j0nnmP0JZm9kg4Foj+D3Bu2+w2Sfdhcdv+39OkK+qNr3qP6NdSYECAwEAAQ==", t.sh256Value);
            var dersa = rsaDecrypt("MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEAmrIS5T8ZJuNueE7PibV+AMSjDBY0nBoF/2PSeeY/Qlmb2SDgWiP4PcG7b7DZJ92Fx2/7f06Qr6o2veo/o11JgQIDAQABAkADkbDGBrUpWeuh2C80L+RKZXfsAk0lqKPTVyBsNefKu5EFK4qTAeJa9l+IN1pumAyHhXBDe3M8v9MnHakEJ/H7AiEAy3nM8NdAa5R7QwNCvp4RzxcNVwyi4TWXLq2eWcDRjCMCIQDCoMET52EE3b/pJboFjaL3G4FGsa6e3EocMWFjCuTsCwIhAJBkd921Mp7lOG9+od+5NnQaLLpIWlGtAQL76/JPVaS3AiEAu3rSwnON93wMU3AuAw9uvg5Wt1yNUyXslb/Tie6CmgUCIFObFzO91SnltHAIQ5tfeBDf5HyuH0sZSMn/Erh9ZnFP", rsa);
            console.log("rsa:", rsa, "dersa:", dersa);
            var rc4 = rc4Encrypt(t.sh256Value, t.sh256Value);
            var derc4 = rc4Decrypt(t.sh256Value, rc4);
            console.log("rc4:", rc4, "derc4:", derc4);
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_x_text = resolveEasyComponent("x-text", GenUniModulesTmxUiComponentsXTextXTextClass);
        val _component_x_link = resolveEasyComponent("x-link", GenUniModulesTmxUiComponentsXLinkXLinkClass);
        val _component_x_sheet = resolveEasyComponent("x-sheet", GenUniModulesTmxUiComponentsXSheetXSheetClass);
        val _component_x_input = resolveEasyComponent("x-input", GenUniModulesTmxUiComponentsXInputXInputClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "加密 xCrypto"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "这几个加密采用原生加密代码，作为对比，可以线上用CryptoJS对标的函数进行加密核对是否正确。经过我核对本插件生成的加密字符与CryptoJS是相同的。支持ios,andriod,web加密，不依赖第三方插件"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_link, utsMapOf("href" to "https://www.mklab.cn/utils/md5"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "打开外链进行加密核对"
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
                            "MD5加密"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_input, utsMapOf("modelValue" to _ctx.md5Value, "onUpdate:modelValue" to fun(`$event`: String){
                        _ctx.md5Value = `$event`;
                    }
                    , "dark-bg-color" to ""), null, 8, utsArrayOf(
                        "modelValue",
                        "onUpdate:modelValue"
                    )),
                    createVNode(_component_x_sheet, utsMapOf("color" to "info", "margin" to utsArrayOf(
                        "0",
                        "16",
                        "0",
                        "0"
                    )), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    toDisplayString(_ctx.md5str)
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
                    createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "BASE64加密"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_text, utsMapOf("font-size" to "12", "color" to "error", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            "如果web端要加密像中文这种字符需要encodeURI再传给函数.否则无法加密,并报错."
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_input, utsMapOf("modelValue" to _ctx.base64Value, "onUpdate:modelValue" to fun(`$event`: String){
                        _ctx.base64Value = `$event`;
                    }
                    , "dark-bg-color" to ""), null, 8, utsArrayOf(
                        "modelValue",
                        "onUpdate:modelValue"
                    )),
                    createVNode(_component_x_sheet, utsMapOf("color" to "info", "margin" to utsArrayOf(
                        "0",
                        "16",
                        "0",
                        "0"
                    )), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    toDisplayString(_ctx.base64str)
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
                            "SHA256加密"
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_input, utsMapOf("onInput" to _ctx.inputChange, "modelValue" to _ctx.sh256Value, "onUpdate:modelValue" to fun(`$event`: String){
                        _ctx.sh256Value = `$event`;
                    }
                    , "dark-bg-color" to ""), null, 8, utsArrayOf(
                        "onInput",
                        "modelValue",
                        "onUpdate:modelValue"
                    )),
                    createVNode(_component_x_sheet, utsMapOf("color" to "info", "margin" to utsArrayOf(
                        "0",
                        "16",
                        "0",
                        "0"
                    )), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    toDisplayString(_ctx.sh256ValueEntr)
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
    open var md5Value: String by `$data`;
    open var base64Value: String by `$data`;
    open var sh256Value: String by `$data`;
    open var sh256ValueEntr: String by `$data`;
    open var md5str: String by `$data`;
    open var base64str: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("md5Value" to "TMUI4.0X", "base64Value" to "TMUI4.0X", "sh256Value" to "TMUI4.0X", "sh256ValueEntr" to "", "md5str" to computed<String>(fun(): String {
            return md5(this.md5Value);
        }
        ), "base64str" to computed<String>(fun(): String {
            return base64Encode(this.base64Value);
        }
        ));
    }
    override fun `$initMethods`() {
        this.inputChange = fun() {
            var t = this;
            t.sh256ValueEntr = sha256(t.sh256Value);
        }
        ;
    }
    open lateinit var inputChange: () -> Unit;
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
