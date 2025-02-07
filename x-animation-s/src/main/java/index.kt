@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xAnimationS;
import android.view.View;
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
import uts.sdk.modules.utsXdxdAnimation.xdAnimation;
open class XDANIMATION_TRANSLATE_OPTIONS (
    open var ele: UniElement? = null,
    open var duration: Number? = null,
    open var delay: Number? = null,
    open var translation: Number? = null,
    open var from: Number? = null,
    open var len: Number? = null,
    open var loop: Number? = null,
    open var start: (() -> Unit)? = null,
    open var end: (() -> Unit)? = null,
) : UTSObject()
open class XDANIMATION_ROTATE_OPTIONS (
    open var ele: UniElement? = null,
    open var duration: Number? = null,
    open var delay: Number? = null,
    open var from: Number? = null,
    open var deg: Number? = null,
    open var loop: Number? = null,
    open var start: (() -> Unit)? = null,
    open var end: (() -> Unit)? = null,
) : UTSObject()
open class XDANIMATION_SCALE_OPTIONS (
    open var ele: UniElement? = null,
    open var duration: Number? = null,
    open var delay: Number? = null,
    open var direction: Number? = null,
    open var from: Number? = null,
    open var scale: Number? = null,
    open var loop: Number? = null,
    open var start: (() -> Unit)? = null,
    open var end: (() -> Unit)? = null,
) : UTSObject()
open class XDANIMATION_FLIP3D_OPTIONS (
    open var ele: UniElement? = null,
    open var duration: Number? = null,
    open var delay: Number? = null,
    open var axis: Number? = null,
    open var from: Number? = null,
    open var deg: Number? = null,
    open var loop: Number? = null,
    open var cameraDistance: Number? = null,
    open var scaleZ: Number? = null,
    open var start: (() -> Unit)? = null,
    open var end: (() -> Unit)? = null,
) : UTSObject()
open class xAnimationS {
    companion object {
        public fun translate(opts: XDANIMATION_TRANSLATE_OPTIONS) {
            if (opts.ele == null) {
                return;
            }
            var view = (opts.ele as UniElement).getAndroidView<android.view.View>()!! as View;
            var duration_s = (opts?.duration ?: 1000).toLong();
            var delay_s = (opts?.delay ?: 0).toLong();
            var translation_s = (opts?.translation ?: 0).toInt();
            var fromlen_s = (opts?.from ?: 360).toFloat();
            var len_s = (opts?.len ?: 360).toFloat();
            var loop_s = (opts?.loop ?: 0).toInt();
            xdAnimation.translate(view, duration_s, delay_s, translation_s, fromlen_s, len_s, loop_s, opts?.start, opts?.end);
        }
        public fun rotate(opts: XDANIMATION_ROTATE_OPTIONS) {
            if (opts.ele == null) {
                return;
            }
            var view = (opts.ele as UniElement).getAndroidView<android.view.View>()!! as View;
            var duration_s = (opts?.duration ?: 1000).toLong();
            var delay_s = (opts?.delay ?: 0).toLong();
            var from_s = (opts?.from ?: 0).toFloat();
            var deg_s = (opts?.deg ?: 360).toFloat();
            var loop_s = (opts?.loop ?: 0).toInt();
            xdAnimation.rotate(view, duration_s, delay_s, from_s, deg_s, loop_s, opts?.start, opts?.end);
        }
        public fun scale(opts: XDANIMATION_SCALE_OPTIONS) {
            if (opts.ele == null) {
                return;
            }
            var view = (opts.ele as UniElement).getAndroidView<android.view.View>()!! as View;
            var duration_s = (opts?.duration ?: 1000).toLong();
            var delay_s = (opts?.delay ?: 0).toLong();
            var direction_s = (opts?.direction ?: 2).toInt();
            var scale_s = (opts?.scale ?: 1).toFloat();
            var from_s = (opts?.from ?: 0).toFloat();
            var loop_s = (opts?.loop ?: 0).toInt();
            xdAnimation.scale(view, duration_s, delay_s, direction_s, from_s, scale_s, loop_s, opts?.start, opts?.end);
        }
        public fun flip3D(opts: XDANIMATION_FLIP3D_OPTIONS) {
            if (opts.ele == null) {
                return;
            }
            var view = (opts.ele as UniElement).getAndroidView<android.view.View>()!! as View;
            var duration_s = (opts?.duration ?: 1000).toLong();
            var delay_s = (opts?.delay ?: 0).toLong();
            var axis_s = (opts?.axis ?: 1).toInt();
            var from_s = (opts?.from ?: 0).toFloat();
            var deg_s = (opts?.deg ?: 360).toFloat();
            var loop_s = (opts?.loop ?: 0).toInt();
            var cameraDistance_s = (opts?.cameraDistance ?: 12).toFloat();
            var scaleZ_s = (opts?.scaleZ ?: 0.5).toFloat();
            xdAnimation.flip3D(view, duration_s, delay_s, axis_s, from_s, deg_s, loop_s, cameraDistance_s, scaleZ_s, opts?.start, opts?.end);
        }
        public fun clearAnimations(ele: UniElement?, reset: Boolean = true) {
            if (ele == null) {
                return;
            }
            var view = (ele as UniElement).getAndroidView<android.view.View>()!! as View;
            xdAnimation.clearAnimations(view, reset);
        }
    }
}
