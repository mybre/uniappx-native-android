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
import io.dcloud.uniapp.extapi.createSelectorQuery as uni_createSelectorQuery;
import io.dcloud.uniapp.extapi.pageScrollTo as uni_pageScrollTo;
open class GenUniModulesTmxUiComponentsXFormXForm : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        provide("XFORMITEM_TOP", this.top);
        provide("XFORMITEM_LABEL_WIDTH", this.labelWidth);
        provide("XFORMITEM_LABEL_Direction", this.labelDirection);
        provide("labelFontColor", this.labelFontColor);
        provide("XFORMITEM_LABEL_SCROLL", this.errorAutoPage);
        provide("XFORMITEM_LABEL_FontSize", this.labelFontSize);
        provide("XFORMITEM_SHOWLABEL", this.showLabel);
        onBeforeUnmount(fun() {
            this.isdestry = true;
            this.list = utsArrayOf<FORM_ITEM>();
            this.oldFormData = UTSJSONObject() as Any;
        }
        , __ins);
        onMounted(fun() {
            this.oldFormData = JSON.parse<Any>(JSON.stringify(this._modelValue))!!;
            this.getNodeInfo();
        }
        , __ins);
        this.`$watch`(fun(): Any? {
            return this.modelValue;
        }
        , fun(newValue: Any, _: Any) {
            this.diffFiled(newValue, this.oldFormData);
        }
        , WatchOptions(deep = true));
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "xForm"), utsArrayOf(
            renderSlot(_ctx.`$slots`, "default")
        ));
    }
    open var labelWidth: String by `$props`;
    open var labelDirection: String by `$props`;
    open var labelFontColor: String by `$props`;
    open var errorAutoPage: Boolean by `$props`;
    open var modelValue: Any by `$props`;
    open var labelFontSize: String by `$props`;
    open var showLabel: Boolean by `$props`;
    open var list: UTSArray<FORM_ITEM> by `$data`;
    open var top: Number by `$data`;
    open var isOkTop: Boolean by `$data`;
    open var oldFormData: Any by `$data`;
    open var isdestry: Boolean by `$data`;
    open var id: Any? by `$data`;
    open var _modelValue: Any by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("list" to utsArrayOf<FORM_ITEM>(), "top" to 0, "isOkTop" to false, "oldFormData" to UTSJSONObject() as Any, "isdestry" to false, "id" to ("xForm-" + getUid1()), "_modelValue" to computed<Any>(fun(): Any {
            return this.modelValue;
        }
        ));
    }
    override fun `$initMethods`() {
        this.pushAdd = fun(item: FORM_ITEM) {
            if (this.isdestry) {
                return;
            }
            var index = this.list.findIndex(fun(el: FORM_ITEM): Boolean {
                return el.id == item.id;
            }
            );
            if (index > -1) {
                this.list.splice(index, 1, item);
            } else {
                this.list.push(item);
            }
        }
        ;
        this.delItem = fun(id: String) {
            if (this.isdestry) {
                return;
            }
            if (this.list.length == 0) {
                return;
            }
            var index: Number = this.list.findIndex(fun(el: FORM_ITEM): Boolean {
                return el.id == id;
            }
            );
            if (index > -1) {
                this.list.splice(index, 1);
            }
        }
        ;
        this.diffFiled = fun(newvals: Any, olds: Any) {
            if (this.isdestry) {
                return;
            }
            if (UTSAndroid.`typeof`( newvals) != "object" || UTSAndroid.`typeof`( olds) != "object") {
                return;
            }
            var newval = JSON.parseObject(JSON.stringify(newvals)) as UTSJSONObject;
            var old = JSON.parseObject(JSON.stringify(olds)) as UTSJSONObject;
            var fileds = utsArrayOf<FORMITEM_R>();
            for(key in resolveUTSKeyIterator(old)){
                var kVal: Any? = newval.get(key);
                var oldval: Any? = old.get(key);
                if (kVal != oldval) {
                    fileds.push(FORMITEM_R(key = key, value = kVal));
                }
            }
            this.actionsRequired(fileds);
            this.oldFormData = JSON.parse<Any>(JSON.stringify(this._modelValue))!!;
        }
        ;
        this.actionsRequired = fun(list: UTSArray<FORMITEM_R>) {
            this.list.forEach(fun(el: FORM_ITEM){
                var index = list.findIndex(fun(ele: FORMITEM_R): Boolean {
                    return ele.key == el.name;
                }
                );
                if (index > -1) {
                    el.ele.vaildCompele(list[index].value);
                }
            }
            );
        }
        ;
        this.getNodeInfo = fun() {
            uni_createSelectorQuery().`in`(this).select(".xForm").boundingClientRect().exec(fun(ret){
                var nodeinfo = ret[0] as NodeInfo;
                this.top = nodeinfo.top!!;
                this.isOkTop = true;
            }
            );
        }
        ;
        this.valid = fun(keys: UTSArray<String>): FORM_SUBMIT_RESULT {
            return this._valid(keys);
        }
        ;
        this.submit = fun(): FORM_SUBMIT_RESULT {
            return this._valid(utsArrayOf<String>());
        }
        ;
        this._valid = fun(keys: UTSArray<String>): FORM_SUBMIT_RESULT {
            var top: Number = 0;
            var result = FORM_SUBMIT_RESULT(valid = true, errorMessage = "", key = "", formData = utsArrayOf<FORM_SUBMIT_OBJECT>());
            var modevalue = JSON.parseObject(JSON.stringify(this._modelValue)) as UTSJSONObject;
            for(key in resolveUTSKeyIterator(modevalue)){
                if (keys.length == 0 || keys.includes(key)) {
                    var valdata: Any? = modevalue.get(key);
                    var index = this.list.findIndex(fun(ele: FORM_ITEM): Boolean {
                        return ele.name == key;
                    }
                    );
                    if (index > -1) {
                        var resultJg = this.list[index].ele.vaildCompele(valdata) as FORM_SUBMIT_OBJECT;
                        if (!resultJg.valid && result.valid) {
                            result.valid = false;
                            result.key = key;
                            result.errorMessage = resultJg.errorMessage;
                            top = this.list[index].top;
                        }
                        result.formData.push(resultJg);
                    }
                }
            }
            this.`$emit`("submit", result);
            if (this.errorAutoPage && !result.valid && top > 0) {
                uni_pageScrollTo(PageScrollToOptions(scrollTop = top, fail = fun(_){
                    console.error("当前页面没有放置可滚动的列表，但使用了表单出错滚动功能，请关闭表单属性：error-auto-page");
                }
                ));
            }
            return result;
        }
        ;
    }
    open lateinit var pushAdd: (item: FORM_ITEM) -> Unit;
    open lateinit var delItem: (id: String) -> Unit;
    open lateinit var diffFiled: (newvals: Any, olds: Any) -> Unit;
    open lateinit var actionsRequired: (list: UTSArray<FORMITEM_R>) -> Unit;
    open lateinit var getNodeInfo: () -> Unit;
    open lateinit var valid: (keys: UTSArray<String>) -> FORM_SUBMIT_RESULT;
    open lateinit var submit: () -> FORM_SUBMIT_RESULT;
    open lateinit var _valid: (keys: UTSArray<String>) -> FORM_SUBMIT_RESULT;
    companion object {
        var name = "xForm";
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf())
        };
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("submit" to null);
        var props = normalizePropsOptions(utsMapOf("labelWidth" to utsMapOf("type" to "String", "default" to "100"), "labelDirection" to utsMapOf("type" to "String", "default" to "horizontal"), "labelFontColor" to utsMapOf("type" to "String", "default" to "#333333"), "errorAutoPage" to utsMapOf("type" to "Boolean", "default" to true), "modelValue" to utsMapOf("default" to fun(): UTSJSONObject {
            return UTSJSONObject();
        }
        ), "labelFontSize" to utsMapOf("type" to "String", "default" to "16"), "showLabel" to utsMapOf("type" to "Boolean", "default" to true)));
        var propsNeedCastKeys = utsArrayOf(
            "labelWidth",
            "labelDirection",
            "labelFontColor",
            "errorAutoPage",
            "modelValue",
            "labelFontSize",
            "showLabel"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
