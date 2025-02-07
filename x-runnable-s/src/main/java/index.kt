@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xRunnableS;
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
fun runWorker(callback: () -> Any?, resultCallback: (msg: Any?) -> Unit) {
    open class IntentRunable : Runnable {
        open var dataResult: Any?;
        constructor(data: Any?) : super() {
            this.dataResult = data;
        }
        override fun run() {
            resultCallback(this.dataResult);
        }
    }
    UTSAndroid.getDispatcher("io").async(fun(_) {
        var data: Any? = callback();
        UTSAndroid.getUniActivity()!!.runOnUiThread(IntentRunable(data));
    }
    , null);
}
