@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xWindowGrey;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
fun setWindowGrey() {
    var paint = Paint();
    var colorMatrix = ColorMatrix();
    colorMatrix.setSaturation(0.toFloat());
    var decorView = UTSAndroid.getUniActivity()!!.window.decorView as ViewGroup;
    paint.setColorFilter(ColorMatrixColorFilter(colorMatrix));
    decorView.setLayerType(View.LAYER_TYPE_HARDWARE, paint);
}
fun removeWindowGrey() {
    var paint = Paint();
    var colorMatrix = ColorMatrix();
    colorMatrix.setSaturation(1.toFloat());
    var decorView = UTSAndroid.getUniActivity()!!.window.decorView as ViewGroup;
    paint.setColorFilter(ColorMatrixColorFilter(colorMatrix));
    decorView.setLayerType(View.LAYER_TYPE_HARDWARE, paint);
}
