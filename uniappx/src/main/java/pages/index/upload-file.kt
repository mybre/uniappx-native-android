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
import uts.sdk.modules.xFileS.xFileSystem;
import uts.sdk.modules.xFileS.fileListType;
open class GenPagesIndexUploadFile : BasePage {
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
        var setup: (__props: GenPagesIndexUploadFile) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesIndexUploadFile;
            val _cache = __ins.renderCache;
            val filse = ref<XUploadFileComponentPublicInstance?>(null);
            val list = utsArrayOf<UTSJSONObject>(object : UTSJSONObject() {
                var name = "测试文档.doc"
                var type = "doc"
                var id = "1"
                var request = "{code:1,data:'11',msg:'成功'}"
            }, object : UTSJSONObject() {
                var name = "测试服务默认文件22.mp4"
                var type = "mp4"
                var id = "2"
                var request = "{code:1,data:'22',msg:'成功'}"
            });
            val onchange = fun(list: UTSArray<fileListType>){};
            val upl = fun(){
                filse.value?.start?.invoke();
            }
            ;
            val bef = fun(list: UTSArray<fileListType>): UTSPromise<UTSArray<fileListType>> {
                console.log(list);
                return UTSPromise.resolve(list);
            }
            ;
            return fun(): Any? {
                val _component_x_text = resolveEasyComponent("x-text", GenUniModulesTmxUiComponentsXTextXTextClass);
                val _component_x_sheet = resolveEasyComponent("x-sheet", GenUniModulesTmxUiComponentsXSheetXSheetClass);
                val _component_x_upload_file = resolveEasyComponent("x-upload-file", GenUniModulesTmxUiComponentsXUploadFileXUploadFileClass);
                val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
                return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                    createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_text, utsMapOf("font-size" to "18", "class" to "text-weight-b mb-8"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "文件选择 xUploadFile"
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_x_text, utsMapOf("color" to "#999999"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "使用时请注意区别：安卓端和IOS端没有区别。web端是我模拟的格式有点区别，上传文件是File对象。"
                                );
                            }
                            ), "_" to 1))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_x_sheet, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_x_upload_file, utsMapOf("before-upload" to bef, "auto-start" to true, "ref_key" to "filse", "ref" to filse, "onChange" to onchange, "default-list" to list), null, 512),
                            createVNode(_component_x_button, utsMapOf("onClick" to upl, "block" to true, "class" to "mt-20", "skin" to "thin"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "手动上传"
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
