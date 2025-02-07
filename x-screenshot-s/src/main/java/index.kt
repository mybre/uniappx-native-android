@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xScreenshotS;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
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
import java.io.File;
import java.io.FileOutputStream;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
fun savePhotoTocache(img: Bitmap): String {
    var context = UTSAndroid.getAppContext()!!;
    var filepath = context.getExternalCacheDir()?.getPath() ?: "";
    var fileid = Math.random().toString(16).substring(2, 11);
    var file = File(filepath, fileid + ".jpg");
    var fos = FileOutputStream(file);
    img.compress(Bitmap.CompressFormat.JPEG, 100, fos);
    return file.getPath();
}
fun getScreenImage(): String {
    var decorView: ViewGroup = UTSAndroid.getUniActivity()!!.window.decorView as ViewGroup;
    var rootview: View = decorView.getRootView();
    var bitmap = Bitmap.createBitmap(rootview.width, rootview.height, Bitmap.Config.ARGB_8888);
    var canvas = Canvas(bitmap);
    rootview.draw(canvas);
    return savePhotoTocache(bitmap);
}
fun getRootShotImage(callback: (str: String) -> Unit) {
    callback(getScreenImage());
}
fun getElementShotImage(ele: UniElement?, callback: (str: String) -> Unit) {
    if (ele == null) {
        callback("");
        return;
    }
    var view = ele.getAndroidView<android.view.View>() as View?;
    if (view == null) {
        callback("");
        return;
    }
    var rootview = view as View;
    var bitmap = Bitmap.createBitmap(rootview.width, rootview.height, Bitmap.Config.ARGB_8888);
    var canvas = Canvas(bitmap);
    rootview.draw(canvas);
    var imgpath: String = savePhotoTocache(bitmap);
    callback(imgpath);
}
