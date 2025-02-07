@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xClipboardS;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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
typealias errorFun = (err: String) -> Unit;
typealias setSuccessFun = () -> Unit;
val setClipboardData = fun(data: String, success: setSuccessFun?, error: errorFun?){
    var context = UTSAndroid.getAppContext()!!;
    var clipboard: ClipboardManager? = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager;
    var clip: ClipData? = ClipData.newPlainText("label", data);
    if (clip != null && clipboard != null) {
        clipboard.setPrimaryClip(clip);
        if (success != null) {
            success();
        }
    } else {
        if (error != null) {
            error("未知错误");
        }
    }
}
;
val getClipboardData = fun(success: (str: String) -> Unit, error: errorFun?){
    var context = UTSAndroid.getAppContext()!!;
    var clipboard: ClipboardManager? = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager;
    if (clipboard != null) {
        if (clipboard.hasText()) {
            if (success != null) {
                success(clipboard.getText().toString());
            }
        } else {
            if (error != null) {
                error("不是文本");
            }
        }
    } else {
        if (error != null) {
            error("未知错误");
        }
    }
}
;
