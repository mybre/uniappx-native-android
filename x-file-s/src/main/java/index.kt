@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xFileS;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.OpenableColumns;
import android.webkit.MimeTypeMap;
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
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading;
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class xFileSListType (
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var uri: String,
    open var file: Any? = null,
    open var request: Any? = null,
    @JsonNotNull
    open var realFilePath: String,
    @JsonNotNull
    open var cacheFilePath: String,
    open var size: Number? = null,
    open var status: Number? = null,
) : UTSObject()
typealias fileListType = xFileSListType;
open class xFileSNameTYpe (
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var uri: Uri,
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var realFilePath: String,
    @JsonNotNull
    open var cacheFilePath: String,
    @JsonNotNull
    open var fileSize: Number,
    @JsonNotNull
    open var status: Number,
) : UTSObject()
typealias callReadBackFun = (byte: ByteArray) -> Unit;
val mimeTypes = Map<String, String>(utsArrayOf(
    utsArrayOf(
        "jpg",
        "image/*"
    ),
    utsArrayOf(
        "jpeg",
        "image/*"
    ),
    utsArrayOf(
        "png",
        "image/*"
    ),
    utsArrayOf(
        "gif",
        "image/*"
    ),
    utsArrayOf(
        "bmp",
        "image/*"
    ),
    utsArrayOf(
        "webp",
        "image/*"
    ),
    utsArrayOf(
        "tiff",
        "image/*"
    ),
    utsArrayOf(
        "svg",
        "image/*"
    ),
    utsArrayOf(
        "ico",
        "image/*"
    ),
    utsArrayOf(
        "mp4",
        "video/*"
    ),
    utsArrayOf(
        "webm",
        "video/*"
    ),
    utsArrayOf(
        "ogv",
        "video/*"
    ),
    utsArrayOf(
        "mov",
        "video/*"
    ),
    utsArrayOf(
        "avi",
        "video/*"
    ),
    utsArrayOf(
        "wmv",
        "video/*"
    ),
    utsArrayOf(
        "mp3",
        "audio/*"
    ),
    utsArrayOf(
        "wav",
        "audio/*"
    ),
    utsArrayOf(
        "ogg",
        "audio/*"
    ),
    utsArrayOf(
        "flac",
        "audio/*"
    ),
    utsArrayOf(
        "aac",
        "audio/*"
    ),
    utsArrayOf(
        "pdf",
        "application/*"
    ),
    utsArrayOf(
        "doc",
        "application/*"
    ),
    utsArrayOf(
        "docx",
        "application/*"
    ),
    utsArrayOf(
        "xls",
        "application/*"
    ),
    utsArrayOf(
        "xlsx",
        "application/*"
    ),
    utsArrayOf(
        "ppt",
        "application/*"
    ),
    utsArrayOf(
        "pptx",
        "application/*"
    ),
    utsArrayOf(
        "odt",
        "application/*"
    ),
    utsArrayOf(
        "ods",
        "application/*"
    ),
    utsArrayOf(
        "txt",
        "text/plain"
    ),
    utsArrayOf(
        "html",
        "text/html"
    ),
    utsArrayOf(
        "css",
        "text/css"
    ),
    utsArrayOf(
        "js",
        "text/javascript"
    ),
    utsArrayOf(
        "xml",
        "text/xml"
    ),
    utsArrayOf(
        "zip",
        "application/*"
    ),
    utsArrayOf(
        "rar",
        "application/*"
    ),
    utsArrayOf(
        "7z",
        "application/*"
    ),
    utsArrayOf(
        "json",
        "application/*"
    )
));
fun getMimeTypeFromUri(uri: Uri, max: Number): xFileSNameTYpe {
    var context = UTSAndroid.getAppContext() as Context;
    var contentResolver = context.getContentResolver() as ContentResolver;
    var mime = MimeTypeMap.getSingleton() as MimeTypeMap;
    var gz = mime.getExtensionFromMimeType(contentResolver.getType(uri)) as String?;
    var str = uri.getEncodedPath();
    var par = contentResolver.openFileDescriptor(uri, "r") as ParcelFileDescriptor;
    var filesize = par.getStatSize();
    if (gz == null) {
        gz = str!!.substring(str!!.lastIndexOf(".") + 1);
    }
    var name = str!!.substring(0, str!!.lastIndexOf("/"));
    name = str!!.substring(0, str!!.lastIndexOf("."));
    if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
        var cursor = contentResolver.query(uri, null, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            var nameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
            if (nameIndex != -1) {
                name = cursor.getString(nameIndex);
            }
            cursor.close();
        }
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
    return xFileSNameTYpe(name = name, type = gz!!, uri = uri, id = Math.floor(Math.random() * 1 * Math.floor(Math.random() * Date.now())).toString(10).substring(0, 10), realFilePath = "", cacheFilePath = "", fileSize = filesize, status = if (filesize > max) {
        4;
    } else {
        0;
    }
    );
}
var filelistAll = utsArrayOf<xFileSNameTYpe>();
fun isInfilelist(file: xFileSNameTYpe): Boolean {
    return filelistAll.some(fun(el): Boolean {
        return el.name == file.name && el.type == file.type;
    }
    );
}
var callFun = fun(list: UTSArray<fileListType>){};
var nowXFileSystem = null as xFileSystem?;
val activityResult = fun(requestCode: Int, resultCode: Int, data: Intent?){
    var jgCode: Number = 1;
    console.log(1);
    if (data != null && requestCode == jgCode.toInt()) {
        var fdata = data!! as Intent;
        var flistdata = fdata.getClipData();
        var flistdataOnly = data?.data;
        if (flistdata != null) {
            var count = flistdata.getItemCount();
            run {
                var i: Number = 0;
                while(i < count){
                    var item = flistdata.getItemAt(i.toInt());
                    var uri = item.getUri();
                    var itemfile = getMimeTypeFromUri(uri, nowXFileSystem!!.maxFileSize);
                    if (!isInfilelist(itemfile)) {
                        filelistAll.push(itemfile);
                    }
                    i++;
                }
            }
        } else if (flistdataOnly != null) {
            var itemfile = getMimeTypeFromUri(flistdataOnly!!, nowXFileSystem!!.maxFileSize);
            if (!isInfilelist(itemfile)) {
                filelistAll.push(itemfile);
            }
        }
        var listfile = filelistAll.map(fun(el): fileListType {
            return fileListType(name = el.name, type = el.type, id = el.id, uri = "", realFilePath = el.realFilePath, cacheFilePath = el.cacheFilePath, status = if (el.fileSize > nowXFileSystem!!.maxFileSize) {
                4;
            } else {
                0;
            }
            , size = el.fileSize);
        }
        );
        callFun(listfile);
    }
}
;
open class xFileSystem {
    open var mimeTypeFilter: UTSArray<String> = utsArrayOf<String>();
    open var filelist = utsArrayOf<xFileSNameTYpe>();
    open var multiple: Boolean = true;
    open var maxFileSize: Number = 31457280;
    constructor(typeFilter: UTSArray<String>?, tempmultiple: Boolean?, maxSize: Number?){
        if (typeFilter != null) {
            var filter: UTSArray<String> = utsArrayOf<String>();
            var tms = typeFilter!! as UTSArray<String>;
            run {
                var i: Number = 0;
                while(i < tms.length){
                    if (mimeTypes.get(tms[i]) != null) {
                        filter.push(mimeTypes.get(tms[i])!!);
                    }
                    i++;
                }
            }
            if (filter.length == 0) {
                filter.push("*/*");
            }
            this.mimeTypeFilter = filter;
        }
        if (tempmultiple != null) {
            this.multiple = tempmultiple!!;
        }
        if (maxSize != null) {
            this.maxFileSize = maxSize!!;
        }
        nowXFileSystem = this;
        UTSAndroid.onAppActivityResult(activityResult);
    }
    open fun destory() {
        UTSAndroid.offAppActivityResult(activityResult);
    }
    open fun openDocument(call: (list: UTSArray<fileListType>) -> Unit) {
        var intent = Intent(Intent.ACTION_OPEN_DOCUMENT);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            intent.setAction(Intent.ACTION_OPEN_DOCUMENT);
        } else {
            intent.setAction(Intent.ACTION_GET_CONTENT);
        }
        if (this.mimeTypeFilter.length == 0) {
            intent.type = "*/*";
        } else {
            var key = this.mimeTypeFilter[this.mimeTypeFilter.length - 1];
            var ftype = key;
            if (ftype != null) {
                intent.setType(ftype!!);
            } else {
                intent.setType("*/*");
            }
        }
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, this.multiple);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        callFun = call;
        UTSAndroid.getUniActivity()!!.startActivityForResult(intent, 1);
    }
    open fun remove(id: String): UTSArray<fileListType> {
        run {
            var i: Number = 0;
            while(i < filelistAll.length){
                var item = filelistAll[i];
                if (item.id == id) {
                    filelistAll.splice(i, 1);
                    break;
                }
                i++;
            }
        }
        return filelistAll.map(fun(el): fileListType {
            return fileListType(name = el.name, type = el.type, id = el.id, uri = "", realFilePath = el.realFilePath, cacheFilePath = el.cacheFilePath, size = el.fileSize, status = el.status);
        }
        );
    }
    open fun clear(): UTSArray<fileListType> {
        filelistAll = utsArrayOf<xFileSNameTYpe>();
        this.filelist = utsArrayOf<xFileSNameTYpe>();
        return utsArrayOf<fileListType>();
    }
    open fun readFile(item: xFileSListType, size: Number? = null, callBack: callReadBackFun? = null): ByteArray {
        var index: Number = -1;
        run {
            var i: Number = 0;
            while(i < filelistAll.length){
                var item = filelistAll[i];
                if (item.id == item.id) {
                    index = i;
                    break;
                }
                i++;
            }
        }
        if (index == -1) {
            console.error("文件id不存在");
            return ByteArray(0.toInt());
        }
        var file = filelistAll[index];
        var sizeBlock = if (size == null) {
            1024;
        } else {
            size!!;
        }
        ;
        var context = UTSAndroid.getAppContext() as Context;
        var cover = context.getContentResolver() as ContentResolver;
        var inputStream = cover.openInputStream(file.uri);
        var byteArrayOutputStream = ByteArrayOutputStream();
        var buffer = ByteArray(sizeBlock.toInt());
        var n = inputStream!!.read(buffer);
        while(-1 != n){
            byteArrayOutputStream.write(buffer, 0, n);
            if (callBack != null) {
                var tempbuffer = ByteArray(sizeBlock.toInt());
                byteArrayOutputStream.write(tempbuffer, 0, n);
                callBack(tempbuffer)!!;
            }
            n = inputStream!!.read(buffer);
        }
        var ar = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.flush();
        }
         catch (e: Throwable) {
            byteArrayOutputStream.close();
        }
        return ar;
    }
    open fun copyFileToPath(item: xFileSListType, path: String): UTSPromise<xFileSListType?> {
        var file = item;
        if (file.status == 4) {
            console.error("文件大小超了");
            return UTSPromise.resolve(item);
        }
        var fileData = this.readFile(item, 1024, null);
        var filepath = path + "/" + file.name;
        var realfilepath = UTSAndroid.convert2AbsFullPath(filepath);
        uni_showLoading(ShowLoadingOptions(title = "...", mask = true));
        return UTSPromise(fun(res, rej){
            try {
                var outputStream = FileOutputStream(realfilepath);
                outputStream.write(fileData);
                outputStream.flush();
                uni_hideLoading();
                file.realFilePath = realfilepath;
                file.cacheFilePath = filepath;
                res(xFileSListType(name = file.name, type = file.type, id = file.id, realFilePath = file.realFilePath, cacheFilePath = file.cacheFilePath, status = file.status, size = file.size, uri = file.uri));
            }
             catch (e: Throwable) {
                console.error(e);
                uni_hideLoading();
                uni_showToast(ShowToastOptions(title = "异常", icon = "none"));
                rej("异常");
            }
        }
        );
    }
}
