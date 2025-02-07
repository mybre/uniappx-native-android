@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xCallPhone;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
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
fun makePhone(tel: String) {
    var phone = "tel:" + tel;
    var ac = UTSAndroid.getUniActivity() as Activity;
    var permissionCheck = utsArrayOf(
        "android.permission.CALL_PHONE"
    );
    fun callphone() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            var intent = Intent(Intent.ACTION_DIAL, Uri.parse(phone));
            ac.startActivity(intent);
        } else {
            var intent = Intent(Intent.ACTION_CALL, Uri.parse(phone));
            ac.startActivity(intent);
        }
    }
    if (UTSAndroid.checkSystemPermissionGranted(UTSAndroid.getUniActivity()!!, permissionCheck)) {
        callphone();
    } else {
        console.log("当前不具备指定权限");
        UTSAndroid.requestSystemPermission(UTSAndroid.getUniActivity()!!, permissionCheck, fun(_: Boolean, _: UTSArray<String>) {
            callphone();
        }
        , fun(_: Boolean, _: UTSArray<String>) {});
    }
}
