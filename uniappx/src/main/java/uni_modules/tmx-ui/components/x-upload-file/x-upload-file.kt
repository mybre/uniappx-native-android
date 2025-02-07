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
import io.dcloud.uniapp.extapi.env as uni_env;
import io.dcloud.uniapp.extapi.getFileSystemManager as uni_getFileSystemManager;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
import io.dcloud.uniapp.extapi.uploadFile as uni_uploadFile;
import uts.sdk.modules.xFileS.xFileSystem;
import uts.sdk.modules.xFileS.fileListType;
open class GenUniModulesTmxUiComponentsXUploadFileXUploadFile : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onMounted(fun() {
            this.xfile = xFileSystem(this.filter, this.multiple, this.maxFileSize);
            this.`$nextTick`(fun() {
                this.covertList();
            }
            );
        }
        , __ins);
        onBeforeUnmount(fun() {
            this.xfile?.destory();
        }
        , __ins);
        this.`$watch`(fun(): Any? {
            return this.defaultList;
        }
        , fun() {
            this.covertList();
        }
        );
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_x_button = resolveEasyComponent("x-button", GenUniModulesTmxUiComponentsXButtonXButtonClass);
        val _component_x_icon = resolveEasyComponent("x-icon", GenUniModulesTmxUiComponentsXIconXIconClass);
        return createElementVNode("view", utsMapOf("class" to "xFile"), utsArrayOf(
            createElementVNode("view", utsMapOf("onClick" to _ctx.openfile), utsArrayOf(
                renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("pointer-events" to "none"))), utsArrayOf(
                            createVNode(_component_x_button, utsMapOf("disabled" to _ctx._disabled, "loading" to _ctx._uploading, "icon" to "file-add-line", "block" to true), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "选择文件"
                                );
                            }
                            ), "_" to 1), 8, utsArrayOf(
                                "disabled",
                                "loading"
                            ))
                        ), 4)
                    );
                }
                )
            ), 8, utsArrayOf(
                "onClick"
            )),
            if (_ctx.fileList.length > 0) {
                createElementVNode("view", utsMapOf("key" to 0, "style" to normalizeStyle(utsMapOf("margin-top" to "16px"))), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.fileList, fun(item, index, __index, _cached): Any {
                        return createElementVNode("view", utsMapOf("class" to "xFileItem", "style" to normalizeStyle(utsMapOf("borderBottomColor" to if (index == _ctx.fileList.length - 1) {
                            "transparent";
                        } else {
                            _ctx._borderBottomColor;
                        })), "key" to index), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "xFileItemWrap"), utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("margin-right" to "20px", "flex" to "1"))), utsArrayOf(
                                    createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("color" to if (_ctx._isDark) {
                                        "#ffffff";
                                    } else {
                                        "#333333";
                                    })), "class" to "xFileItemTitle"), toDisplayString(item.name), 5),
                                    createElementVNode("text", utsMapOf("class" to "xFileItemSubtext", "style" to normalizeStyle(utsMapOf("color" to _ctx.statusColor(item.status)))), toDisplayString(_ctx.getTextStatus(item)), 5)
                                ), 4),
                                if (isTrue((item.status != 3) && !_ctx.uploadFileDisabledDel)) {
                                    createVNode(_component_x_icon, utsMapOf("key" to 0, "onClick" to fun(){
                                        _ctx.remove(item);
                                    }, "name" to "close-line", "font-size" to "24px", "color" to "#bdbdbd"), null, 8, utsArrayOf(
                                        "onClick"
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                            ))
                        ), 4);
                    }), 128)
                ), 4);
            } else {
                createCommentVNode("v-if", true);
            }
        ));
    }
    open var defaultList: UTSArray<UTSJSONObject>? by `$props`;
    open var header: UTSJSONObject? by `$props`;
    open var name: String by `$props`;
    open var formData: UTSJSONObject? by `$props`;
    open var url: String by `$props`;
    open var maxCount: Number by `$props`;
    open var multiple: Boolean by `$props`;
    open var maxFileSize: Number by `$props`;
    open var loading: Boolean by `$props`;
    open var autoStart: Boolean by `$props`;
    open var statusCode: Number by `$props`;
    open var disabled: Boolean by `$props`;
    open var uploadFileDisabledDel: Boolean by `$props`;
    open var filter: UTSArray<String> by `$props`;
    open var borderBottomColor: String by `$props`;
    open var beforeUpload: XFILESUPLOAD_BEFORE_CALLBACK by `$props`;
    open var xfile: xFileSystem? by `$data`;
    open var fileList: UTSArray<fileListType> by `$data`;
    open var _uploading: Boolean by `$data`;
    open var _uploadingIndex: Number by `$data`;
    open var _maxCount: Number by `$data`;
    open var _url: String by `$data`;
    open var _formData: UTSJSONObject? by `$data`;
    open var _header: UTSJSONObject? by `$data`;
    open var _name: String by `$data`;
    open var _disabled: Boolean by `$data`;
    open var _borderBottomColor: String by `$data`;
    open var _isDark: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("xfile" to null as xFileSystem?, "fileList" to utsArrayOf<fileListType>(), "_uploading" to false, "_uploadingIndex" to 0, "_maxCount" to computed<Number>(fun(): Number {
            return this.maxCount;
        }
        ), "_url" to computed<String>(fun(): String {
            return this.url;
        }
        ), "_formData" to computed<UTSJSONObject?>(fun(): UTSJSONObject? {
            return this.formData;
        }
        ), "_header" to computed<UTSJSONObject?>(fun(): UTSJSONObject? {
            return this.header;
        }
        ), "_name" to computed<String>(fun(): String {
            return this.name;
        }
        ), "_disabled" to computed<Boolean>(fun(): Boolean {
            return this.disabled || (this.fileList.length > this._maxCount && this._maxCount > -1);
        }
        ), "_borderBottomColor" to computed<String>(fun(): String {
            if (xConfig.dark == "dark") {
                return xConfig.borderDarkColor;
            }
            return this.borderBottomColor;
        }
        ), "_isDark" to computed<Boolean>(fun(): Boolean {
            return xConfig.dark == "dark";
        }
        ));
    }
    override fun `$initMethods`() {
        this.covertList = fun() {
            if (this.defaultList == null) {
                return;
            }
            var dlist = this.defaultList!!.map(fun(el: UTSJSONObject, index: Number): fileListType {
                var uid = Math.floor(Math.random() * 1 * Math.floor(Math.random() * Date.now())).toString(10).substring(0, 10);
                var type = el.getString("type");
                type = if (type == null) {
                    uid;
                } else {
                    type;
                }
                ;
                var name = el.getString("name");
                name = if (name == null) {
                    index.toString(10);
                } else {
                    name;
                }
                ;
                var requestdata = el.getAny("request");
                return fileListType(name = name, type = type, id = uid, request = requestdata as Any, realFilePath = "", cacheFilePath = "", status = 2, file = "", uri = "", size = 0);
            }
            );
            this.fileList = dlist;
            this.xfile!!.clear();
        }
        ;
        this.fileIsOnlyInSys = fun(dir: String): UTSPromise<String> {
            var baseNamePath = if (dir == null) {
                "tmui4temp";
            } else {
                dir;
            }
            ;
            baseNamePath = uni_env.CACHE_PATH + "/" + baseNamePath;
            val fileManager = uni_getFileSystemManager();
            return UTSPromise(fun(res, rej){
                fileManager.readdir(ReadDirOptions(dirPath = baseNamePath, success = fun(result: ReadDirSuccessResult) {
                    if (result == null) {
                        fileManager.mkdir(MkDirOptions(dirPath = baseNamePath, recursive = true, success = fun(result: FileManagerSuccessResult) {
                            res(baseNamePath);
                        }, fail = fun(er: IFileSystemManagerFail) {
                            console.log("创建目录失败", er);
                            rej("");
                        }));
                    } else {
                        res(baseNamePath);
                    }
                }
                , fail = fun(ere: IFileSystemManagerFail) {
                    fileManager.mkdir(MkDirOptions(dirPath = baseNamePath, recursive = true, success = fun(result: FileManagerSuccessResult) {
                        res(baseNamePath);
                    }
                    , fail = fun(er: IFileSystemManagerFail) {
                        console.log("创建目录失败", er);
                        rej("");
                    }
                    ));
                }
                ));
            }
            );
        }
        ;
        this.getCacheFiles = fun(dir: String?): UTSPromise<UTSArray<String>> {
            var baseNamePath = if (dir == null) {
                "tmui4temp";
            } else {
                dir;
            }
            ;
            baseNamePath = uni_env.CACHE_PATH + "/" + baseNamePath;
            val fileManager = uni_getFileSystemManager();
            return UTSPromise(fun(res, rej){
                fileManager.readdir(ReadDirOptions(dirPath = baseNamePath, success = fun(result: ReadDirSuccessResult) {
                    if (result == null) {
                        fileManager.mkdir(MkDirOptions(dirPath = baseNamePath, recursive = true, success = fun(result2: FileManagerSuccessResult) {
                            res(utsArrayOf<String>());
                        }, fail = fun(er: IFileSystemManagerFail) {
                            rej(utsArrayOf<String>());
                        }));
                    } else {
                        res(result.files);
                    }
                }
                , fail = fun(ere: IFileSystemManagerFail) {
                    fileManager.mkdir(MkDirOptions(dirPath = baseNamePath, recursive = true, success = fun(result: FileManagerSuccessResult) {
                        res(utsArrayOf<String>());
                    }
                    , fail = fun(er: IFileSystemManagerFail) {
                        console.log("创建目录失败", er);
                        rej(utsArrayOf<String>());
                    }
                    ));
                }
                ));
            }
            );
        }
        ;
        this.openfile = fun() {
            var _this = this;
            if (this._uploading || this._disabled || (_this.fileList.length > _this._maxCount && _this._maxCount > -1)) {
                return;
            }
            this.xfile!!.openDocument(fun(listtest: Any){
                var list = utsArrayOf<fileListType>();
                list = listtest as UTSArray<fileListType>;
                run {
                    var i: Number = 0;
                    while(i < list.length){
                        var el = list[i] as fileListType;
                        var isSonme = _this.fileList.some(fun(ele): Boolean {
                            return ele.type == el.type && ele.name == el.name;
                        }
                        );
                        if (_this.fileList.length > _this._maxCount && _this._maxCount > -1) {
                            break;
                        } else if (!isSonme) {
                            _this.fileList.push(el as fileListType);
                        }
                        i++;
                    }
                }
                if (_this.autoStart) {
                    _this.start();
                }
            }
            );
        }
        ;
        this.copyFile = fun(reassignedItem: fileListType, call: (item: fileListType?) -> Unit) {
            var item = reassignedItem;
            var _this = this;
            var index = this.fileList.findIndex(fun(v): Boolean {
                return v.id == item.id;
            }
            );
            if (index == -1) {
                call(null);
                return;
            }
            if ((item?.cacheFilePath != null && item?.cacheFilePath != "") || item.status != 0) {
                call(item);
                return;
            }
            this.fileIsOnlyInSys("tmui4temp").then(fun(basedir: String){
                _this.xfile!!.copyFileToPath(item, basedir).then(fun(oreal: fileListType?){
                    if (oreal != null) {
                        item = oreal!!;
                        _this.fileList.splice(index, 1, oreal!!);
                        call(item);
                    } else {
                        call(null);
                    }
                }
                );
            }
            );
        }
        ;
        this.remove = fun(item: fileListType) {
            if (this._uploading) {
                uni_showToast(ShowToastOptions(title = "上传中禁止删除", icon = "none"));
                return;
            }
            if (this.uploadFileDisabledDel) {
                uni_showToast(ShowToastOptions(title = "已上传文件禁止删除", icon = "none"));
                return;
            }
            this.xfile!!.remove(item.id);
            var tems = this.fileList.slice(0);
            this.fileList = tems.filter(fun(v): Boolean {
                return v.id != item.id;
            }
            );
            this.`$emit`("change", this.fileList.slice(0));
        }
        ;
        this.clearCacheFiles = fun() {
            var baseNamePath = "tmui4temp";
            baseNamePath = uni_env.CACHE_PATH + "/" + baseNamePath;
            this.getCacheFiles(null).then(fun(files: UTSArray<String>){
                val fileManager = uni_getFileSystemManager();
                files.forEach(fun(el: String){
                    fileManager.unlink(UnLinkOptions(filePath = baseNamePath + "/" + el, success = fun(res: FileManagerSuccessResult){
                        console.info("缓存清除成功：", el);
                    }
                    , fail = fun(res: IFileSystemManagerFail){
                        console.error("文件删除失败：", el);
                    }
                    ));
                }
                );
            }
            );
        }
        ;
        this.start = fun() {
            if (this._uploading) {
                return;
            }
            var _this = this;
            this._uploadingIndex = 0;
            this._uploading = true;
            this.beforeUpload(this.fileList.slice(0)).then(fun(list: UTSArray<fileListType>){
                _this.fileList = list.slice(0);
                _this.uploadFile();
            }
            ).`catch`(fun(_: Any?){
                console.error("参数有误,请返回正确.");
            }
            );
        }
        ;
        this.statusColor = fun(status: Number?): String {
            if (status == 0) {
                return "#888888";
            }
            if (status == 1 || status == 4) {
                return "#FF0000";
            }
            if (status == 2) {
                return "#12cb4d";
            }
            return "#1480e5";
        }
        ;
        this.getFilesize = fun(item: fileListType): String {
            var size = item.size;
            if (size == null || size == 0) {
                return "";
            }
            var fileszie = size!! as Number;
            if (fileszie <= 1024) {
                return fileszie.toString(10) + "字节";
            }
            if (fileszie <= 1048576) {
                var fz = (fileszie / 1024).toFixed(2);
                return fz + "kb";
            }
            if (fileszie <= 1073741824) {
                var fz = (fileszie / 1048576).toFixed(2);
                return fz + "mb";
            }
            var fz = (fileszie / 1073741824).toFixed(2);
            return fz + "gb";
        }
        ;
        this.uploadFile = fun() {
            var _this = this;
            if (this.fileList.length == 0 || this._uploadingIndex > this.fileList.length - 1) {
                this._uploading = false;
                this.`$emit`("change", this.fileList.slice(0));
                this.clearCacheFiles();
                _this.xfile?.destory();
                _this.xfile = xFileSystem(_this.filter, _this.multiple, this.maxFileSize);
                return;
            }
            var item = this.fileList[this._uploadingIndex];
            if (item.status == 2 || item.status == 4) {
                this._uploadingIndex += 1;
                this.uploadFile();
                return;
            }
            this.copyFile(item, fun(realItem: fileListType?){
                if (realItem != null) {
                    item = realItem!!;
                    item.status = 3;
                    _this.`$forceUpdate`();
                    var filepath = item!!.realFilePath;
                    var files = null as UTSArray<UploadFileOptionFiles>?;
                    uni_uploadFile(UploadFileOptions(url = _this._url, formData = _this._formData, name = _this._name, header = _this._header, filePath = item!!.realFilePath, files = files, success = fun(res: UploadFileSuccess){
                        if (res.statusCode != _this.statusCode) {
                            item.status = 1;
                            _this._uploadingIndex += 1;
                            _this.`$forceUpdate`();
                            _this.uploadFile();
                        } else {
                            item.status = 2;
                            item!!.request = res.data;
                            _this._uploadingIndex += 1;
                            _this.`$forceUpdate`();
                            _this.uploadFile();
                        }
                    }
                    , fail = fun(error: UploadFileFail){
                        console.error(error);
                        item.status = 1;
                        _this._uploadingIndex += 1;
                        _this.`$forceUpdate`();
                        _this.uploadFile();
                    }
                    ));
                }
            }
            );
        }
        ;
        this.getTextStatus = fun(item: fileListType): String {
            var text = "";
            if (item.status == 0) {
                text = "待上传";
            } else if (item.status == 1) {
                text = "上传失败";
            } else if (item.status == 2) {
                text = "上传成功";
            } else if (item.status == 3) {
                text = "上传中...";
            } else if (item.status == 4) {
                text = "超过大小";
            }
            var fsize = this.getFilesize(item as fileListType);
            return text + (if (fsize == "") {
                "";
            } else {
                " | " + fsize;
            }
            );
        }
        ;
    }
    open lateinit var covertList: () -> Unit;
    open lateinit var fileIsOnlyInSys: (dir: String) -> UTSPromise<String>;
    open lateinit var getCacheFiles: (dir: String?) -> UTSPromise<UTSArray<String>>;
    open lateinit var openfile: () -> Unit;
    open lateinit var copyFile: (item: fileListType, call: (item: fileListType?) -> Unit) -> Unit;
    open lateinit var remove: (item: fileListType) -> Unit;
    open lateinit var clearCacheFiles: () -> Unit;
    open lateinit var start: () -> Unit;
    open lateinit var statusColor: (status: Number?) -> String;
    open lateinit var getFilesize: (item: fileListType) -> String;
    open lateinit var uploadFile: () -> Unit;
    open lateinit var getTextStatus: (item: fileListType) -> String;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("xFileItemWrap" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center")), "xFileItem" to padStyleMapOf(utsMapOf("paddingTop" to 16, "paddingRight" to 0, "paddingBottom" to 16, "paddingLeft" to 0, "borderBottomWidth" to 1, "borderBottomStyle" to "solid")), "xFileItemTitle" to padStyleMapOf(utsMapOf("fontSize" to 15, "lines" to 1, "textOverflow" to "ellipsis")), "xFileItemSubtext" to padStyleMapOf(utsMapOf("fontSize" to 12, "marginTop" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null);
        var props = normalizePropsOptions(utsMapOf("defaultList" to utsMapOf("type" to "Array", "default" to null), "header" to utsMapOf("type" to "Object", "default" to null), "name" to utsMapOf("type" to "String", "default" to "file"), "formData" to utsMapOf("type" to "Object", "default" to null), "url" to utsMapOf("type" to "String", "default" to "https://mockapi.eolink.com/LRViGGZ8e6c1e8b4a636cd82bca1eb15d2635ed8c74e774/admin/upload_pic/"), "maxCount" to utsMapOf("type" to "Number", "default" to -1), "multiple" to utsMapOf("type" to "Boolean", "default" to true), "maxFileSize" to utsMapOf("type" to "Number", "default" to 31457280), "loading" to utsMapOf("type" to "Boolean", "default" to true), "autoStart" to utsMapOf("type" to "Boolean", "default" to true), "statusCode" to utsMapOf("type" to "Number", "default" to 200), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "uploadFileDisabledDel" to utsMapOf("type" to "Boolean", "default" to false), "filter" to utsMapOf("type" to "Array", "default" to fun(): UTSArray<String> {
            return utsArrayOf<String>();
        }
        ), "borderBottomColor" to utsMapOf("type" to "String", "default" to "#f5f5f5"), "beforeUpload" to utsMapOf("type" to "Function", "default" to fun(list: UTSArray<fileListType>): UTSPromise<UTSArray<fileListType>> {
            return UTSPromise.resolve(list);
        }
        )));
        var propsNeedCastKeys = utsArrayOf(
            "defaultList",
            "header",
            "name",
            "formData",
            "url",
            "maxCount",
            "multiple",
            "maxFileSize",
            "loading",
            "autoStart",
            "statusCode",
            "disabled",
            "uploadFileDisabledDel",
            "filter",
            "borderBottomColor",
            "beforeUpload"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
