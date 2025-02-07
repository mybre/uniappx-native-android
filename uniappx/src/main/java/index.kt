@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uni.UNIBEFAB40;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
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
import io.dcloud.uniapp.extapi.chooseImage as uni_chooseImage;
import io.dcloud.uniapp.extapi.chooseVideo as uni_chooseVideo;
import io.dcloud.uniapp.extapi.compressImage as uni_compressImage;
import io.dcloud.uniapp.extapi.exit as uni_exit;
import io.dcloud.uniapp.extapi.getDeviceInfo as uni_getDeviceInfo;
import io.dcloud.uniapp.extapi.getStorageSync as uni_getStorageSync;
import io.dcloud.uniapp.extapi.getSystemInfoSync as uni_getSystemInfoSync;
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading;
import io.dcloud.uniapp.extapi.loadFontFace as uni_loadFontFace;
import io.dcloud.uniapp.extapi.onOsThemeChange as uni_onOsThemeChange;
import io.dcloud.uniapp.extapi.request as uni_request;
import io.dcloud.uniapp.extapi.setAppTheme as uni_setAppTheme;
import io.dcloud.uniapp.extapi.setStorageSync as uni_setStorageSync;
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
import io.dcloud.uniapp.extapi.uploadFile as uni_uploadFile;
import uts.sdk.modules.xFileS.xFileSystem;
import uts.sdk.modules.xFileS.fileListType;
val runBlock1 = run {
    __uniConfig.getAppStyles = fun(): Map<String, Map<String, Map<String, Any>>> {
        return GenApp.styles;
    }
    ;
}
var firstBackTime: Number = 0;
open class GenApp : BaseApp {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onLaunch(fun(_: OnLaunchOptions) {
            var tonyixie = uni_getStorageSync("xTmui4.0Xieyi");
            uni_loadFontFace(LoadFontFaceOptions(global = true, family = "remixicon", source = "url('/static/remixicon.ttf')", success = fun(_) {
                uni_setStorageSync("loadedFontBytmx", "true");
                console.log("global loadFontFace uni.ttf success===");
            }
            , fail = fun(error) {
                uni_setStorageSync("loadedFontBytmx", "");
                console.warn("global loadFontFace uni.ttf fail--", error.errMsg);
            }
            ));
        }
        , __ins);
        onAppShow(fun(_: OnShowOptions) {
            console.log("App Show");
        }
        , __ins);
        onAppHide(fun() {
            console.log("App Hide");
        }
        , __ins);
        onLastPageBackPress(fun() {
            console.log("App LastPageBackPress");
            if (firstBackTime == 0) {
                uni_showToast(ShowToastOptions(title = "再按一次退出应用", position = "bottom"));
                firstBackTime = Date.now();
                setTimeout(fun(){
                    firstBackTime = 0;
                }, 2000);
            } else if (Date.now() - firstBackTime < 2000) {
                firstBackTime = Date.now();
                uni_exit(null);
            }
        }
        , __ins);
        onExit(fun() {
            console.log("App Exit");
        }
        , __ins);
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0,
                styles1,
                styles2,
                styles3,
                styles4,
                styles5,
                styles6,
                styles7,
                styles8,
                styles9,
                styles10,
                styles11,
                styles12,
                styles13,
                styles14,
                styles15,
                styles16,
                styles17,
                styles18,
                styles19,
                styles20,
                styles21,
                styles22,
                styles23,
                styles24,
                styles25,
                styles26,
                styles27
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("uni-padding-wrap" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingRight" to 15, "paddingBottom" to 0, "paddingLeft" to 15)), "uni-title" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 0, "paddingBottom" to 10, "paddingLeft" to 0)), "uni-title-text" to padStyleMapOf(utsMapOf("fontSize" to 15, "fontWeight" to "bold")), "uni-subtitle-text" to padStyleMapOf(utsMapOf("color" to "#888888", "fontSize" to 12, "fontWeight" to "bold", "marginTop" to 5)), "uni-common-mb" to padStyleMapOf(utsMapOf("marginBottom" to 15)), "uni-common-pb" to padStyleMapOf(utsMapOf("paddingBottom" to 15)), "uni-common-pl" to padStyleMapOf(utsMapOf("paddingLeft" to 15)), "uni-common-mt" to padStyleMapOf(utsMapOf("marginTop" to 15)), "uni-hello-text" to padStyleMapOf(utsMapOf("color" to "#7A7E83", "lineHeight" to "22px")), "uni-list" to padStyleMapOf(utsMapOf("backgroundColor" to "#FFFFFF", "position" to "relative", "display" to "flex", "flexDirection" to "column", "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "#c8c7cc")), "uni-list-cell" to padStyleMapOf(utsMapOf("position" to "relative", "display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center")), "uni-list-cell-padding" to padStyleMapOf(utsMapOf("paddingTop" to 16, "paddingRight" to 16, "paddingBottom" to 16, "paddingLeft" to 16)), "uni-list-cell-line" to padStyleMapOf(utsMapOf("borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "#c8c7cc")), "uni-list-cell-hover" to padStyleMapOf(utsMapOf("backgroundColor" to "#eeeeee")), "uni-list-cell-pd" to padStyleMapOf(utsMapOf("paddingTop" to 11, "paddingRight" to 15, "paddingBottom" to 11, "paddingLeft" to 0)), "uni-list-cell-left" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingRight" to 15, "paddingBottom" to 0, "paddingLeft" to 10)), "uni-list-cell-db" to padStyleMapOf(utsMapOf("flex" to 1)), "uni-list-cell-right" to padStyleMapOf(utsMapOf("flex" to 1)), "uni-list-cell-db-text" to padStyleMapOf(utsMapOf("width" to "100%")), "uni-label" to padStyleMapOf(utsMapOf("width" to 105)), "uni-input" to padStyleMapOf(utsMapOf("height" to 25, "paddingTop" to 8, "paddingRight" to 13, "paddingBottom" to 8, "paddingLeft" to 13, "fontSize" to 14, "backgroundImage" to "none", "backgroundColor" to "#FFFFFF", "flex" to 1, "boxSizing" to "content-box")), "uni-flex" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "uni-flex-item" to padStyleMapOf(utsMapOf("flex" to 1)), "uni-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "uni-column" to padStyleMapOf(utsMapOf("flexDirection" to "column")), "uni-bg-red" to padStyleMapOf(utsMapOf("backgroundImage" to "none", "backgroundColor" to "#F76260")), "uni-bg-green" to padStyleMapOf(utsMapOf("backgroundImage" to "none", "backgroundColor" to "#09BB07")), "uni-bg-blue" to padStyleMapOf(utsMapOf("backgroundImage" to "none", "backgroundColor" to "#007AFF")), "uni-btn-v" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0)), "uni-btn" to padStyleMapOf(utsMapOf("marginTop" to 10)), "uni-link" to padStyleMapOf(utsMapOf("color" to "#576B95", "fontSize" to 13)), "uni-center" to padStyleMapOf(utsMapOf("flexDirection" to "row", "justifyContent" to "center")), "uni-textarea" to padStyleMapOf(utsMapOf("paddingTop" to 9, "paddingRight" to 9, "paddingBottom" to 9, "paddingLeft" to 9, "lineHeight" to 1.6, "fontSize" to 14)), "uni-icon-size" to padStyleMapOf(utsMapOf("width" to 14, "height" to 14)), "uni-container" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "backgroundColor" to "#f8f8f8")), "uni-header-logo" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "flexDirection" to "column", "justifyContent" to "center", "alignItems" to "center", "marginTop" to 5)), "uni-header-image" to padStyleMapOf(utsMapOf("width" to 80, "height" to 80)), "uni-text-box" to padStyleMapOf(utsMapOf("marginBottom" to 20)), "hello-text" to padStyleMapOf(utsMapOf("color" to "#7A7E83", "fontSize" to 14, "lineHeight" to "20px")), "uni-panel" to padStyleMapOf(utsMapOf("marginBottom" to 12)), "text-disabled" to padStyleMapOf(utsMapOf("!color" to "#a0a0a0")), "uni-panel-h" to padStyleMapOf(utsMapOf("backgroundColor" to "#ffffff", "!flexDirection" to "row", "!justifyContent" to "space-between", "!alignItems" to "center", "paddingTop" to 12, "paddingRight" to 12, "paddingBottom" to 12, "paddingLeft" to 12)), "uni-panel-h-on" to padStyleMapOf(utsMapOf("backgroundColor" to "#f0f0f0")), "uni-panel-text" to padStyleMapOf(utsMapOf("color" to "#000000", "fontSize" to 14, "fontWeight" to "normal")), "uni-navigate-item" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center", "backgroundColor" to "#FFFFFF", "borderTopStyle" to "solid", "borderTopColor" to "#f0f0f0", "borderTopWidth" to 1, "paddingTop" to 12, "paddingRight" to 12, "paddingBottom" to 12, "paddingLeft" to 12, "justifyContent" to "space-between", "backgroundColor:active" to "#f8f8f8")), "is--active" to padStyleMapOf(utsMapOf("backgroundColor" to "#f8f8f8")), "uni-navigate-text" to padStyleMapOf(utsMapOf("color" to "#000000", "fontSize" to 14, "fontWeight" to "normal")), "left-win-active" to padStyleMapOf(utsMapOf("!color" to "#007AFF")), "page-scroll-view" to padStyleMapOf(utsMapOf("flex" to 1)), "overflow" to padStyleMapOf(utsMapOf("overflow" to "hidden")), "show" to padStyleMapOf(utsMapOf("visibility" to "visible")), "hidden" to padStyleMapOf(utsMapOf("visibility" to "hidden")), "none" to padStyleMapOf(utsMapOf("display" to "none")), "relative" to padStyleMapOf(utsMapOf("position" to "relative")), "absolute" to padStyleMapOf(utsMapOf("position" to "absolute")), "fixed" to padStyleMapOf(utsMapOf("position" to "fixed")), "fulled" to padStyleMapOf(utsMapOf("width" to "100%")), "fulled-height" to padStyleMapOf(utsMapOf("flex" to 1)), "zIndex-0" to padStyleMapOf(utsMapOf("zIndex" to 0)), "zIndex-n0" to padStyleMapOf(utsMapOf("zIndex" to 0)), "zIndex-1" to padStyleMapOf(utsMapOf("zIndex" to 1)), "zIndex-n1" to padStyleMapOf(utsMapOf("zIndex" to 2)), "zIndex-2" to padStyleMapOf(utsMapOf("zIndex" to 2)), "zIndex-n2" to padStyleMapOf(utsMapOf("zIndex" to 4)), "zIndex-3" to padStyleMapOf(utsMapOf("zIndex" to 3)), "zIndex-n3" to padStyleMapOf(utsMapOf("zIndex" to 6)), "zIndex-4" to padStyleMapOf(utsMapOf("zIndex" to 4)), "zIndex-n4" to padStyleMapOf(utsMapOf("zIndex" to 8)), "zIndex-5" to padStyleMapOf(utsMapOf("zIndex" to 5)), "zIndex-n5" to padStyleMapOf(utsMapOf("zIndex" to 10)), "zIndex-6" to padStyleMapOf(utsMapOf("zIndex" to 6)), "zIndex-n6" to padStyleMapOf(utsMapOf("zIndex" to 12)), "zIndex-7" to padStyleMapOf(utsMapOf("zIndex" to 7)), "zIndex-n7" to padStyleMapOf(utsMapOf("zIndex" to 14)), "zIndex-8" to padStyleMapOf(utsMapOf("zIndex" to 8)), "zIndex-n8" to padStyleMapOf(utsMapOf("zIndex" to 16)), "zIndex-9" to padStyleMapOf(utsMapOf("zIndex" to 9)), "zIndex-n9" to padStyleMapOf(utsMapOf("zIndex" to 18)), "zIndex-10" to padStyleMapOf(utsMapOf("zIndex" to 10)), "zIndex-n10" to padStyleMapOf(utsMapOf("zIndex" to 20)), "zIndex-11" to padStyleMapOf(utsMapOf("zIndex" to 11)), "zIndex-n11" to padStyleMapOf(utsMapOf("zIndex" to 22)), "zIndex-12" to padStyleMapOf(utsMapOf("zIndex" to 12)), "zIndex-n12" to padStyleMapOf(utsMapOf("zIndex" to 24)), "zIndex-13" to padStyleMapOf(utsMapOf("zIndex" to 13)), "zIndex-n13" to padStyleMapOf(utsMapOf("zIndex" to 26)), "zIndex-14" to padStyleMapOf(utsMapOf("zIndex" to 14)), "zIndex-n14" to padStyleMapOf(utsMapOf("zIndex" to 28)), "zIndex-15" to padStyleMapOf(utsMapOf("zIndex" to 15)), "zIndex-n15" to padStyleMapOf(utsMapOf("zIndex" to 30)), "zIndex-16" to padStyleMapOf(utsMapOf("zIndex" to 16)), "zIndex-n16" to padStyleMapOf(utsMapOf("zIndex" to 32)), "zIndex-17" to padStyleMapOf(utsMapOf("zIndex" to 17)), "zIndex-n17" to padStyleMapOf(utsMapOf("zIndex" to 34)), "zIndex-18" to padStyleMapOf(utsMapOf("zIndex" to 18)), "zIndex-n18" to padStyleMapOf(utsMapOf("zIndex" to 36)), "zIndex-19" to padStyleMapOf(utsMapOf("zIndex" to 19)), "zIndex-n19" to padStyleMapOf(utsMapOf("zIndex" to 38)), "zIndex-20" to padStyleMapOf(utsMapOf("zIndex" to 20)), "zIndex-n20" to padStyleMapOf(utsMapOf("zIndex" to 40)));
            }
        val styles1: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("zIndex-21" to padStyleMapOf(utsMapOf("zIndex" to 21)), "zIndex-n21" to padStyleMapOf(utsMapOf("zIndex" to 42)), "zIndex-22" to padStyleMapOf(utsMapOf("zIndex" to 22)), "zIndex-n22" to padStyleMapOf(utsMapOf("zIndex" to 44)), "zIndex-23" to padStyleMapOf(utsMapOf("zIndex" to 23)), "zIndex-n23" to padStyleMapOf(utsMapOf("zIndex" to 46)), "zIndex-24" to padStyleMapOf(utsMapOf("zIndex" to 24)), "zIndex-n24" to padStyleMapOf(utsMapOf("zIndex" to 48)), "zIndex-25" to padStyleMapOf(utsMapOf("zIndex" to 25)), "zIndex-n25" to padStyleMapOf(utsMapOf("zIndex" to 50)), "zIndex-26" to padStyleMapOf(utsMapOf("zIndex" to 26)), "zIndex-n26" to padStyleMapOf(utsMapOf("zIndex" to 52)), "text-overflow" to padStyleMapOf(utsMapOf("textOverflow" to "ellipsis")), "text-overflow-1" to padStyleMapOf(utsMapOf("textOverflow" to "ellipsis", "lines" to 1)), "text-overflow-2" to padStyleMapOf(utsMapOf("textOverflow" to "ellipsis", "lines" to 2)), "text-overflow-3" to padStyleMapOf(utsMapOf("textOverflow" to "ellipsis", "lines" to 3)), "text-overflow-4" to padStyleMapOf(utsMapOf("textOverflow" to "ellipsis", "lines" to 4)), "text-overflow-5" to padStyleMapOf(utsMapOf("textOverflow" to "ellipsis", "lines" to 5)), "text-size-xxs" to padStyleMapOf(utsMapOf("fontSize" to 10)), "text-size-xs" to padStyleMapOf(utsMapOf("fontSize" to 11)), "text-size-s" to padStyleMapOf(utsMapOf("fontSize" to 12)), "text-size-m" to padStyleMapOf(utsMapOf("fontSize" to 14)), "text-size-n" to padStyleMapOf(utsMapOf("fontSize" to 15)), "text-size-g" to padStyleMapOf(utsMapOf("fontSize" to 17)), "text-size-lg" to padStyleMapOf(utsMapOf("fontSize" to 18)), "text-size-xl" to padStyleMapOf(utsMapOf("fontSize" to 20)), "text-weight-s" to padStyleMapOf(utsMapOf("fontWeight" to "400")), "text-weight-n" to padStyleMapOf(utsMapOf("fontWeight" to "400")), "text-weight-b" to padStyleMapOf(utsMapOf("fontWeight" to "700")), "text-align-left" to padStyleMapOf(utsMapOf("textAlign" to "left")), "text-align-right" to padStyleMapOf(utsMapOf("textAlign" to "right")), "text-align-center" to padStyleMapOf(utsMapOf("textAlign" to "center")), "round-tl-0" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 0)), "round-tl-1" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 1)), "round-tl-2" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 2)), "round-tl-3" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 3)), "round-tl-4" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 4)), "round-tl-5" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 5)), "round-tl-6" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 6)), "round-tl-7" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 7)), "round-tl-8" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 8)), "round-tl-9" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 9)), "round-tl-10" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 10)), "round-tl-11" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 11)), "round-tl-12" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 12)), "round-tl-13" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 13)), "round-tl-14" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 14)), "round-tl-15" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 15)), "round-tl-16" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 16)), "round-tl-17" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 17)), "round-tl-18" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 18)), "round-tl-19" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 19)), "round-tl-20" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 20)), "round-tl-21" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 21)), "round-tl-22" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 22)), "round-tl-23" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 23)), "round-tl-24" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 24)), "round-tl-25" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 25)), "round-tl-26" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 26)), "round-tl-27" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 27)), "round-tl-28" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 28)), "round-tl-29" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 29)), "round-tl-30" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 30)), "round-tl-31" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 31)), "round-tl-32" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 32)), "round-tl-33" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 33)), "round-tl-34" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 34)), "round-tl-35" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 35)), "round-tl-36" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 36)), "round-tl-37" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 37)), "round-tl-38" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 38)), "round-tl-39" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 39)), "round-tl-40" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 40)), "round-tl-41" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 41)), "round-tl-42" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 42)), "round-tl-43" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 43)), "round-tl-44" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 44)), "round-tl-45" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 45)), "round-tl-46" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 46)), "round-tl-47" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 47)), "round-tl-48" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 48)), "round-tl-49" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 49)), "round-tl-50" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 50)), "round-tr-0" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 0)), "round-tr-1" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 1)), "round-tr-2" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 2)), "round-tr-3" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 3)), "round-tr-4" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 4)), "round-tr-5" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 5)), "round-tr-6" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 6)), "round-tr-7" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 7)), "round-tr-8" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 8)), "round-tr-9" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 9)), "round-tr-10" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 10)), "round-tr-11" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 11)), "round-tr-12" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 12)), "round-tr-13" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 13)), "round-tr-14" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 14)), "round-tr-15" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 15)), "round-tr-16" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 16)));
            }
        val styles2: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("round-tr-17" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 17)), "round-tr-18" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 18)), "round-tr-19" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 19)), "round-tr-20" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 20)), "round-tr-21" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 21)), "round-tr-22" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 22)), "round-tr-23" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 23)), "round-tr-24" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 24)), "round-tr-25" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 25)), "round-tr-26" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 26)), "round-tr-27" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 27)), "round-tr-28" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 28)), "round-tr-29" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 29)), "round-tr-30" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 30)), "round-tr-31" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 31)), "round-tr-32" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 32)), "round-tr-33" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 33)), "round-tr-34" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 34)), "round-tr-35" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 35)), "round-tr-36" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 36)), "round-tr-37" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 37)), "round-tr-38" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 38)), "round-tr-39" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 39)), "round-tr-40" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 40)), "round-tr-41" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 41)), "round-tr-42" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 42)), "round-tr-43" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 43)), "round-tr-44" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 44)), "round-tr-45" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 45)), "round-tr-46" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 46)), "round-tr-47" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 47)), "round-tr-48" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 48)), "round-tr-49" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 49)), "round-tr-50" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 50)), "round-bl-0" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 0)), "round-bl-1" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 1)), "round-bl-2" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 2)), "round-bl-3" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 3)), "round-bl-4" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 4)), "round-bl-5" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 5)), "round-bl-6" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 6)), "round-bl-7" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 7)), "round-bl-8" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 8)), "round-bl-9" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 9)), "round-bl-10" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 10)), "round-bl-11" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 11)), "round-bl-12" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 12)), "round-bl-13" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 13)), "round-bl-14" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 14)), "round-bl-15" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 15)), "round-bl-16" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 16)), "round-bl-17" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 17)), "round-bl-18" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 18)), "round-bl-19" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 19)), "round-bl-20" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 20)), "round-bl-21" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 21)), "round-bl-22" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 22)), "round-bl-23" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 23)), "round-bl-24" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 24)), "round-bl-25" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 25)), "round-bl-26" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 26)), "round-bl-27" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 27)), "round-bl-28" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 28)), "round-bl-29" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 29)), "round-bl-30" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 30)), "round-bl-31" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 31)), "round-bl-32" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 32)), "round-bl-33" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 33)), "round-bl-34" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 34)), "round-bl-35" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 35)), "round-bl-36" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 36)), "round-bl-37" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 37)), "round-bl-38" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 38)), "round-bl-39" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 39)), "round-bl-40" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 40)), "round-bl-41" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 41)), "round-bl-42" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 42)), "round-bl-43" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 43)), "round-bl-44" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 44)), "round-bl-45" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 45)), "round-bl-46" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 46)), "round-bl-47" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 47)), "round-bl-48" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 48)), "round-bl-49" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 49)), "round-bl-50" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 50)), "round-br-0" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 0)), "round-br-1" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 1)), "round-br-2" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 2)), "round-br-3" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 3)), "round-br-4" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 4)), "round-br-5" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 5)), "round-br-6" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 6)), "round-br-7" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 7)), "round-br-8" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 8)), "round-br-9" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 9)), "round-br-10" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 10)), "round-br-11" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 11)), "round-br-12" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 12)), "round-br-13" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 13)), "round-br-14" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 14)));
            }
        val styles3: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("round-br-15" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 15)), "round-br-16" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 16)), "round-br-17" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 17)), "round-br-18" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 18)), "round-br-19" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 19)), "round-br-20" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 20)), "round-br-21" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 21)), "round-br-22" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 22)), "round-br-23" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 23)), "round-br-24" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 24)), "round-br-25" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 25)), "round-br-26" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 26)), "round-br-27" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 27)), "round-br-28" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 28)), "round-br-29" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 29)), "round-br-30" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 30)), "round-br-31" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 31)), "round-br-32" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 32)), "round-br-33" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 33)), "round-br-34" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 34)), "round-br-35" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 35)), "round-br-36" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 36)), "round-br-37" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 37)), "round-br-38" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 38)), "round-br-39" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 39)), "round-br-40" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 40)), "round-br-41" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 41)), "round-br-42" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 42)), "round-br-43" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 43)), "round-br-44" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 44)), "round-br-45" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 45)), "round-br-46" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 46)), "round-br-47" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 47)), "round-br-48" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 48)), "round-br-49" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 49)), "round-br-50" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to 50)), "round-a-0" to padStyleMapOf(utsMapOf("borderRadius" to 0)), "round-a-1" to padStyleMapOf(utsMapOf("borderRadius" to 1)), "round-a-2" to padStyleMapOf(utsMapOf("borderRadius" to 2)), "round-a-3" to padStyleMapOf(utsMapOf("borderRadius" to 3)), "round-a-4" to padStyleMapOf(utsMapOf("borderRadius" to 4)), "round-a-5" to padStyleMapOf(utsMapOf("borderRadius" to 5)), "round-a-6" to padStyleMapOf(utsMapOf("borderRadius" to 6)), "round-a-7" to padStyleMapOf(utsMapOf("borderRadius" to 7)), "round-a-8" to padStyleMapOf(utsMapOf("borderRadius" to 8)), "round-a-9" to padStyleMapOf(utsMapOf("borderRadius" to 9)), "round-a-10" to padStyleMapOf(utsMapOf("borderRadius" to 10)), "round-a-11" to padStyleMapOf(utsMapOf("borderRadius" to 11)), "round-a-12" to padStyleMapOf(utsMapOf("borderRadius" to 12)), "round-a-13" to padStyleMapOf(utsMapOf("borderRadius" to 13)), "round-a-14" to padStyleMapOf(utsMapOf("borderRadius" to 14)), "round-a-15" to padStyleMapOf(utsMapOf("borderRadius" to 15)), "round-a-16" to padStyleMapOf(utsMapOf("borderRadius" to 16)), "round-a-17" to padStyleMapOf(utsMapOf("borderRadius" to 17)), "round-a-18" to padStyleMapOf(utsMapOf("borderRadius" to 18)), "round-a-19" to padStyleMapOf(utsMapOf("borderRadius" to 19)), "round-a-20" to padStyleMapOf(utsMapOf("borderRadius" to 20)), "round-a-21" to padStyleMapOf(utsMapOf("borderRadius" to 21)), "round-a-22" to padStyleMapOf(utsMapOf("borderRadius" to 22)), "round-a-23" to padStyleMapOf(utsMapOf("borderRadius" to 23)), "round-a-24" to padStyleMapOf(utsMapOf("borderRadius" to 24)), "round-a-25" to padStyleMapOf(utsMapOf("borderRadius" to 25)), "round-a-26" to padStyleMapOf(utsMapOf("borderRadius" to 26)), "round-a-27" to padStyleMapOf(utsMapOf("borderRadius" to 27)), "round-a-28" to padStyleMapOf(utsMapOf("borderRadius" to 28)), "round-a-29" to padStyleMapOf(utsMapOf("borderRadius" to 29)), "round-a-30" to padStyleMapOf(utsMapOf("borderRadius" to 30)), "round-a-31" to padStyleMapOf(utsMapOf("borderRadius" to 31)), "round-a-32" to padStyleMapOf(utsMapOf("borderRadius" to 32)), "round-a-33" to padStyleMapOf(utsMapOf("borderRadius" to 33)), "round-a-34" to padStyleMapOf(utsMapOf("borderRadius" to 34)), "round-a-35" to padStyleMapOf(utsMapOf("borderRadius" to 35)), "round-a-36" to padStyleMapOf(utsMapOf("borderRadius" to 36)), "round-a-37" to padStyleMapOf(utsMapOf("borderRadius" to 37)), "round-a-38" to padStyleMapOf(utsMapOf("borderRadius" to 38)), "round-a-39" to padStyleMapOf(utsMapOf("borderRadius" to 39)), "round-a-40" to padStyleMapOf(utsMapOf("borderRadius" to 40)), "round-a-41" to padStyleMapOf(utsMapOf("borderRadius" to 41)), "round-a-42" to padStyleMapOf(utsMapOf("borderRadius" to 42)), "round-a-43" to padStyleMapOf(utsMapOf("borderRadius" to 43)), "round-a-44" to padStyleMapOf(utsMapOf("borderRadius" to 44)), "round-a-45" to padStyleMapOf(utsMapOf("borderRadius" to 45)), "round-a-46" to padStyleMapOf(utsMapOf("borderRadius" to 46)), "round-a-47" to padStyleMapOf(utsMapOf("borderRadius" to 47)), "round-a-48" to padStyleMapOf(utsMapOf("borderRadius" to 48)), "round-a-49" to padStyleMapOf(utsMapOf("borderRadius" to 49)), "round-a-50" to padStyleMapOf(utsMapOf("borderRadius" to 50)), "round-t-0" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 0, "borderTopRightRadius" to 0)), "round-t-1" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 1, "borderTopRightRadius" to 1)), "round-t-2" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 2, "borderTopRightRadius" to 2)), "round-t-3" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 3, "borderTopRightRadius" to 3)), "round-t-4" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 4, "borderTopRightRadius" to 4)), "round-t-5" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 5, "borderTopRightRadius" to 5)), "round-t-6" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 6, "borderTopRightRadius" to 6)), "round-t-7" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 7, "borderTopRightRadius" to 7)), "round-t-8" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 8, "borderTopRightRadius" to 8)), "round-t-9" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 9, "borderTopRightRadius" to 9)), "round-t-10" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 10, "borderTopRightRadius" to 10)), "round-t-11" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 11, "borderTopRightRadius" to 11)), "round-t-12" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 12, "borderTopRightRadius" to 12)));
            }
        val styles4: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("round-t-13" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 13, "borderTopRightRadius" to 13)), "round-t-14" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 14, "borderTopRightRadius" to 14)), "round-t-15" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 15, "borderTopRightRadius" to 15)), "round-t-16" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 16, "borderTopRightRadius" to 16)), "round-t-17" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 17, "borderTopRightRadius" to 17)), "round-t-18" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 18, "borderTopRightRadius" to 18)), "round-t-19" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 19, "borderTopRightRadius" to 19)), "round-t-20" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 20, "borderTopRightRadius" to 20)), "round-t-21" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 21, "borderTopRightRadius" to 21)), "round-t-22" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 22, "borderTopRightRadius" to 22)), "round-t-23" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 23, "borderTopRightRadius" to 23)), "round-t-24" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 24, "borderTopRightRadius" to 24)), "round-t-25" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 25, "borderTopRightRadius" to 25)), "round-t-26" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 26, "borderTopRightRadius" to 26)), "round-t-27" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 27, "borderTopRightRadius" to 27)), "round-t-28" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 28, "borderTopRightRadius" to 28)), "round-t-29" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 29, "borderTopRightRadius" to 29)), "round-t-30" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 30, "borderTopRightRadius" to 30)), "round-t-31" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 31, "borderTopRightRadius" to 31)), "round-t-32" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 32, "borderTopRightRadius" to 32)), "round-t-33" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 33, "borderTopRightRadius" to 33)), "round-t-34" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 34, "borderTopRightRadius" to 34)), "round-t-35" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 35, "borderTopRightRadius" to 35)), "round-t-36" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 36, "borderTopRightRadius" to 36)), "round-t-37" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 37, "borderTopRightRadius" to 37)), "round-t-38" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 38, "borderTopRightRadius" to 38)), "round-t-39" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 39, "borderTopRightRadius" to 39)), "round-t-40" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 40, "borderTopRightRadius" to 40)), "round-t-41" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 41, "borderTopRightRadius" to 41)), "round-t-42" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 42, "borderTopRightRadius" to 42)), "round-t-43" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 43, "borderTopRightRadius" to 43)), "round-t-44" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 44, "borderTopRightRadius" to 44)), "round-t-45" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 45, "borderTopRightRadius" to 45)), "round-t-46" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 46, "borderTopRightRadius" to 46)), "round-t-47" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 47, "borderTopRightRadius" to 47)), "round-t-48" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 48, "borderTopRightRadius" to 48)), "round-t-49" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 49, "borderTopRightRadius" to 49)), "round-t-50" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 50, "borderTopRightRadius" to 50)), "round-b-0" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 0, "borderBottomRightRadius" to 0)), "round-b-1" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 1, "borderBottomRightRadius" to 1)), "round-b-2" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 2, "borderBottomRightRadius" to 2)), "round-b-3" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 3, "borderBottomRightRadius" to 3)), "round-b-4" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 4, "borderBottomRightRadius" to 4)), "round-b-5" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 5, "borderBottomRightRadius" to 5)), "round-b-6" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 6, "borderBottomRightRadius" to 6)), "round-b-7" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 7, "borderBottomRightRadius" to 7)), "round-b-8" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 8, "borderBottomRightRadius" to 8)), "round-b-9" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 9, "borderBottomRightRadius" to 9)), "round-b-10" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 10, "borderBottomRightRadius" to 10)), "round-b-11" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 11, "borderBottomRightRadius" to 11)), "round-b-12" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 12, "borderBottomRightRadius" to 12)), "round-b-13" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 13, "borderBottomRightRadius" to 13)), "round-b-14" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 14, "borderBottomRightRadius" to 14)), "round-b-15" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 15, "borderBottomRightRadius" to 15)), "round-b-16" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 16, "borderBottomRightRadius" to 16)), "round-b-17" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 17, "borderBottomRightRadius" to 17)), "round-b-18" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 18, "borderBottomRightRadius" to 18)), "round-b-19" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 19, "borderBottomRightRadius" to 19)), "round-b-20" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 20, "borderBottomRightRadius" to 20)), "round-b-21" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 21, "borderBottomRightRadius" to 21)), "round-b-22" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 22, "borderBottomRightRadius" to 22)), "round-b-23" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 23, "borderBottomRightRadius" to 23)), "round-b-24" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 24, "borderBottomRightRadius" to 24)), "round-b-25" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 25, "borderBottomRightRadius" to 25)), "round-b-26" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 26, "borderBottomRightRadius" to 26)), "round-b-27" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 27, "borderBottomRightRadius" to 27)), "round-b-28" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 28, "borderBottomRightRadius" to 28)), "round-b-29" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 29, "borderBottomRightRadius" to 29)), "round-b-30" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 30, "borderBottomRightRadius" to 30)), "round-b-31" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 31, "borderBottomRightRadius" to 31)), "round-b-32" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 32, "borderBottomRightRadius" to 32)), "round-b-33" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 33, "borderBottomRightRadius" to 33)), "round-b-34" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 34, "borderBottomRightRadius" to 34)), "round-b-35" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 35, "borderBottomRightRadius" to 35)), "round-b-36" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 36, "borderBottomRightRadius" to 36)), "round-b-37" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 37, "borderBottomRightRadius" to 37)), "round-b-38" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 38, "borderBottomRightRadius" to 38)), "round-b-39" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 39, "borderBottomRightRadius" to 39)), "round-b-40" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 40, "borderBottomRightRadius" to 40)), "round-b-41" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 41, "borderBottomRightRadius" to 41)), "round-b-42" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 42, "borderBottomRightRadius" to 42)), "round-b-43" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 43, "borderBottomRightRadius" to 43)), "round-b-44" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 44, "borderBottomRightRadius" to 44)), "round-b-45" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 45, "borderBottomRightRadius" to 45)), "round-b-46" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 46, "borderBottomRightRadius" to 46)), "round-b-47" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 47, "borderBottomRightRadius" to 47)), "round-b-48" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 48, "borderBottomRightRadius" to 48)), "round-b-49" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 49, "borderBottomRightRadius" to 49)), "round-b-50" to padStyleMapOf(utsMapOf("borderBottomLeftRadius" to 50, "borderBottomRightRadius" to 50)), "round-l-0" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 0, "borderBottomLeftRadius" to 0)), "round-l-1" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 1, "borderBottomLeftRadius" to 1)), "round-l-2" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 2, "borderBottomLeftRadius" to 2)), "round-l-3" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 3, "borderBottomLeftRadius" to 3)), "round-l-4" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 4, "borderBottomLeftRadius" to 4)), "round-l-5" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 5, "borderBottomLeftRadius" to 5)), "round-l-6" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 6, "borderBottomLeftRadius" to 6)), "round-l-7" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 7, "borderBottomLeftRadius" to 7)), "round-l-8" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 8, "borderBottomLeftRadius" to 8)), "round-l-9" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 9, "borderBottomLeftRadius" to 9)), "round-l-10" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 10, "borderBottomLeftRadius" to 10)));
            }
        val styles5: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("round-l-11" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 11, "borderBottomLeftRadius" to 11)), "round-l-12" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 12, "borderBottomLeftRadius" to 12)), "round-l-13" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 13, "borderBottomLeftRadius" to 13)), "round-l-14" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 14, "borderBottomLeftRadius" to 14)), "round-l-15" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 15, "borderBottomLeftRadius" to 15)), "round-l-16" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 16, "borderBottomLeftRadius" to 16)), "round-l-17" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 17, "borderBottomLeftRadius" to 17)), "round-l-18" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 18, "borderBottomLeftRadius" to 18)), "round-l-19" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 19, "borderBottomLeftRadius" to 19)), "round-l-20" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 20, "borderBottomLeftRadius" to 20)), "round-l-21" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 21, "borderBottomLeftRadius" to 21)), "round-l-22" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 22, "borderBottomLeftRadius" to 22)), "round-l-23" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 23, "borderBottomLeftRadius" to 23)), "round-l-24" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 24, "borderBottomLeftRadius" to 24)), "round-l-25" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 25, "borderBottomLeftRadius" to 25)), "round-l-26" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 26, "borderBottomLeftRadius" to 26)), "round-l-27" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 27, "borderBottomLeftRadius" to 27)), "round-l-28" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 28, "borderBottomLeftRadius" to 28)), "round-l-29" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 29, "borderBottomLeftRadius" to 29)), "round-l-30" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 30, "borderBottomLeftRadius" to 30)), "round-l-31" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 31, "borderBottomLeftRadius" to 31)), "round-l-32" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 32, "borderBottomLeftRadius" to 32)), "round-l-33" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 33, "borderBottomLeftRadius" to 33)), "round-l-34" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 34, "borderBottomLeftRadius" to 34)), "round-l-35" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 35, "borderBottomLeftRadius" to 35)), "round-l-36" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 36, "borderBottomLeftRadius" to 36)), "round-l-37" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 37, "borderBottomLeftRadius" to 37)), "round-l-38" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 38, "borderBottomLeftRadius" to 38)), "round-l-39" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 39, "borderBottomLeftRadius" to 39)), "round-l-40" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 40, "borderBottomLeftRadius" to 40)), "round-l-41" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 41, "borderBottomLeftRadius" to 41)), "round-l-42" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 42, "borderBottomLeftRadius" to 42)), "round-l-43" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 43, "borderBottomLeftRadius" to 43)), "round-l-44" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 44, "borderBottomLeftRadius" to 44)), "round-l-45" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 45, "borderBottomLeftRadius" to 45)), "round-l-46" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 46, "borderBottomLeftRadius" to 46)), "round-l-47" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 47, "borderBottomLeftRadius" to 47)), "round-l-48" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 48, "borderBottomLeftRadius" to 48)), "round-l-49" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 49, "borderBottomLeftRadius" to 49)), "round-l-50" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 50, "borderBottomLeftRadius" to 50)), "round-r-0" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 0, "borderBottomRightRadius" to 0)), "round-r-1" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 1, "borderBottomRightRadius" to 1)), "round-r-2" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 2, "borderBottomRightRadius" to 2)), "round-r-3" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 3, "borderBottomRightRadius" to 3)), "round-r-4" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 4, "borderBottomRightRadius" to 4)), "round-r-5" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 5, "borderBottomRightRadius" to 5)), "round-r-6" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 6, "borderBottomRightRadius" to 6)), "round-r-7" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 7, "borderBottomRightRadius" to 7)), "round-r-8" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 8, "borderBottomRightRadius" to 8)), "round-r-9" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 9, "borderBottomRightRadius" to 9)), "round-r-10" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 10, "borderBottomRightRadius" to 10)), "round-r-11" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 11, "borderBottomRightRadius" to 11)), "round-r-12" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 12, "borderBottomRightRadius" to 12)), "round-r-13" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 13, "borderBottomRightRadius" to 13)), "round-r-14" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 14, "borderBottomRightRadius" to 14)), "round-r-15" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 15, "borderBottomRightRadius" to 15)), "round-r-16" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 16, "borderBottomRightRadius" to 16)), "round-r-17" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 17, "borderBottomRightRadius" to 17)), "round-r-18" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 18, "borderBottomRightRadius" to 18)), "round-r-19" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 19, "borderBottomRightRadius" to 19)), "round-r-20" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 20, "borderBottomRightRadius" to 20)), "round-r-21" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 21, "borderBottomRightRadius" to 21)), "round-r-22" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 22, "borderBottomRightRadius" to 22)), "round-r-23" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 23, "borderBottomRightRadius" to 23)), "round-r-24" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 24, "borderBottomRightRadius" to 24)), "round-r-25" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 25, "borderBottomRightRadius" to 25)), "round-r-26" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 26, "borderBottomRightRadius" to 26)), "round-r-27" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 27, "borderBottomRightRadius" to 27)), "round-r-28" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 28, "borderBottomRightRadius" to 28)), "round-r-29" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 29, "borderBottomRightRadius" to 29)), "round-r-30" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 30, "borderBottomRightRadius" to 30)), "round-r-31" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 31, "borderBottomRightRadius" to 31)), "round-r-32" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 32, "borderBottomRightRadius" to 32)), "round-r-33" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 33, "borderBottomRightRadius" to 33)), "round-r-34" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 34, "borderBottomRightRadius" to 34)), "round-r-35" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 35, "borderBottomRightRadius" to 35)), "round-r-36" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 36, "borderBottomRightRadius" to 36)), "round-r-37" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 37, "borderBottomRightRadius" to 37)), "round-r-38" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 38, "borderBottomRightRadius" to 38)), "round-r-39" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 39, "borderBottomRightRadius" to 39)), "round-r-40" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 40, "borderBottomRightRadius" to 40)), "round-r-41" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 41, "borderBottomRightRadius" to 41)), "round-r-42" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 42, "borderBottomRightRadius" to 42)), "round-r-43" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 43, "borderBottomRightRadius" to 43)), "round-r-44" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 44, "borderBottomRightRadius" to 44)), "round-r-45" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 45, "borderBottomRightRadius" to 45)), "round-r-46" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 46, "borderBottomRightRadius" to 46)), "round-r-47" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 47, "borderBottomRightRadius" to 47)), "round-r-48" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 48, "borderBottomRightRadius" to 48)), "round-r-49" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 49, "borderBottomRightRadius" to 49)), "round-r-50" to padStyleMapOf(utsMapOf("borderTopRightRadius" to 50, "borderBottomRightRadius" to 50)), "round-0" to padStyleMapOf(utsMapOf("borderRadius" to 0)), "round-1" to padStyleMapOf(utsMapOf("borderRadius" to 1)), "round-2" to padStyleMapOf(utsMapOf("borderRadius" to 2)), "round-3" to padStyleMapOf(utsMapOf("borderRadius" to 3)), "round-4" to padStyleMapOf(utsMapOf("borderRadius" to 4)), "round-5" to padStyleMapOf(utsMapOf("borderRadius" to 5)), "round-6" to padStyleMapOf(utsMapOf("borderRadius" to 6)), "round-7" to padStyleMapOf(utsMapOf("borderRadius" to 7)), "round-8" to padStyleMapOf(utsMapOf("borderRadius" to 8)));
            }
        val styles6: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("round-9" to padStyleMapOf(utsMapOf("borderRadius" to 9)), "round-10" to padStyleMapOf(utsMapOf("borderRadius" to 10)), "round-11" to padStyleMapOf(utsMapOf("borderRadius" to 11)), "round-12" to padStyleMapOf(utsMapOf("borderRadius" to 12)), "round-13" to padStyleMapOf(utsMapOf("borderRadius" to 13)), "round-14" to padStyleMapOf(utsMapOf("borderRadius" to 14)), "round-15" to padStyleMapOf(utsMapOf("borderRadius" to 15)), "round-16" to padStyleMapOf(utsMapOf("borderRadius" to 16)), "round-17" to padStyleMapOf(utsMapOf("borderRadius" to 17)), "round-18" to padStyleMapOf(utsMapOf("borderRadius" to 18)), "round-19" to padStyleMapOf(utsMapOf("borderRadius" to 19)), "round-20" to padStyleMapOf(utsMapOf("borderRadius" to 20)), "round-21" to padStyleMapOf(utsMapOf("borderRadius" to 21)), "round-22" to padStyleMapOf(utsMapOf("borderRadius" to 22)), "round-23" to padStyleMapOf(utsMapOf("borderRadius" to 23)), "round-24" to padStyleMapOf(utsMapOf("borderRadius" to 24)), "round-25" to padStyleMapOf(utsMapOf("borderRadius" to 25)), "round-26" to padStyleMapOf(utsMapOf("borderRadius" to 26)), "line-0" to padStyleMapOf(utsMapOf("lineHeight" to 1)), "line-1" to padStyleMapOf(utsMapOf("lineHeight" to 1.1)), "line-2" to padStyleMapOf(utsMapOf("lineHeight" to 1.2)), "line-3" to padStyleMapOf(utsMapOf("lineHeight" to 1.3)), "line-4" to padStyleMapOf(utsMapOf("lineHeight" to 1.4)), "line-5" to padStyleMapOf(utsMapOf("lineHeight" to 1.5)), "line-6" to padStyleMapOf(utsMapOf("lineHeight" to 1.6)), "line-7" to padStyleMapOf(utsMapOf("lineHeight" to 1.7)), "line-8" to padStyleMapOf(utsMapOf("lineHeight" to 1.8)), "line-9" to padStyleMapOf(utsMapOf("lineHeight" to 1.9)), "line-10" to padStyleMapOf(utsMapOf("lineHeight" to 2)), "line-11" to padStyleMapOf(utsMapOf("lineHeight" to 2.1)), "line-12" to padStyleMapOf(utsMapOf("lineHeight" to 2.2)), "line-13" to padStyleMapOf(utsMapOf("lineHeight" to 2.3)), "line-14" to padStyleMapOf(utsMapOf("lineHeight" to 2.4)), "line-15" to padStyleMapOf(utsMapOf("lineHeight" to 2.5)), "line-16" to padStyleMapOf(utsMapOf("lineHeight" to 2.6)), "line-17" to padStyleMapOf(utsMapOf("lineHeight" to 2.7)), "line-18" to padStyleMapOf(utsMapOf("lineHeight" to 2.8)), "line-19" to padStyleMapOf(utsMapOf("lineHeight" to 2.9)), "line-20" to padStyleMapOf(utsMapOf("lineHeight" to 3)), "line-21" to padStyleMapOf(utsMapOf("lineHeight" to 3.1)), "opacity-0" to padStyleMapOf(utsMapOf("opacity" to 0)), "opacity-1" to padStyleMapOf(utsMapOf("opacity" to 0.1)), "opacity-2" to padStyleMapOf(utsMapOf("opacity" to 0.2)), "opacity-3" to padStyleMapOf(utsMapOf("opacity" to 0.3)), "opacity-4" to padStyleMapOf(utsMapOf("opacity" to 0.4)), "opacity-5" to padStyleMapOf(utsMapOf("opacity" to 0.5)), "opacity-6" to padStyleMapOf(utsMapOf("opacity" to 0.6)), "opacity-7" to padStyleMapOf(utsMapOf("opacity" to 0.7)), "opacity-8" to padStyleMapOf(utsMapOf("opacity" to 0.8)), "opacity-9" to padStyleMapOf(utsMapOf("opacity" to 0.9)), "opacity-10" to padStyleMapOf(utsMapOf("opacity" to 1)), "border-0" to padStyleMapOf(utsMapOf("borderWidth" to 0, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border" to padStyleMapOf(utsMapOf("borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-1" to padStyleMapOf(utsMapOf("borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-1-bk" to padStyleMapOf(utsMapOf("borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-2" to padStyleMapOf(utsMapOf("borderWidth" to 2, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-2-bk" to padStyleMapOf(utsMapOf("borderWidth" to 2, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-3" to padStyleMapOf(utsMapOf("borderWidth" to 3, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-3-bk" to padStyleMapOf(utsMapOf("borderWidth" to 3, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-4" to padStyleMapOf(utsMapOf("borderWidth" to 4, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-4-bk" to padStyleMapOf(utsMapOf("borderWidth" to 4, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-5" to padStyleMapOf(utsMapOf("borderWidth" to 5, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-5-bk" to padStyleMapOf(utsMapOf("borderWidth" to 5, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-l-1" to padStyleMapOf(utsMapOf("borderLeftWidth" to 1, "borderLeftStyle" to "solid", "borderLeftColor" to "#f5f5f5")), "border-l-2" to padStyleMapOf(utsMapOf("borderLeftWidth" to 2, "borderLeftStyle" to "solid", "borderLeftColor" to "#f5f5f5")), "border-l-3" to padStyleMapOf(utsMapOf("borderLeftWidth" to 3, "borderLeftStyle" to "solid", "borderLeftColor" to "#f5f5f5")), "border-l-4" to padStyleMapOf(utsMapOf("borderLeftWidth" to 4, "borderLeftStyle" to "solid", "borderLeftColor" to "#f5f5f5")), "border-l-5" to padStyleMapOf(utsMapOf("borderLeftWidth" to 5, "borderLeftStyle" to "solid", "borderLeftColor" to "#f5f5f5")), "border-r-1" to padStyleMapOf(utsMapOf("borderRightWidth" to 1, "borderRightStyle" to "solid", "borderRightColor" to "#f5f5f5")), "border-r-2" to padStyleMapOf(utsMapOf("borderRightWidth" to 2, "borderRightStyle" to "solid", "borderRightColor" to "#f5f5f5")), "border-r-3" to padStyleMapOf(utsMapOf("borderRightWidth" to 3, "borderRightStyle" to "solid", "borderRightColor" to "#f5f5f5")), "border-r-4" to padStyleMapOf(utsMapOf("borderRightWidth" to 4, "borderRightStyle" to "solid", "borderRightColor" to "#f5f5f5")), "border-r-5" to padStyleMapOf(utsMapOf("borderRightWidth" to 5, "borderRightStyle" to "solid", "borderRightColor" to "#f5f5f5")), "border-t-1" to padStyleMapOf(utsMapOf("borderTopWidth" to 1, "borderTopStyle" to "solid", "borderTopColor" to "#f5f5f5")), "border-t-2" to padStyleMapOf(utsMapOf("borderTopWidth" to 2, "borderTopStyle" to "solid", "borderTopColor" to "#f5f5f5")), "border-t-3" to padStyleMapOf(utsMapOf("borderTopWidth" to 3, "borderTopStyle" to "solid", "borderTopColor" to "#f5f5f5")), "border-t-4" to padStyleMapOf(utsMapOf("borderTopWidth" to 4, "borderTopStyle" to "solid", "borderTopColor" to "#f5f5f5")), "border-t-5" to padStyleMapOf(utsMapOf("borderTopWidth" to 5, "borderTopStyle" to "solid", "borderTopColor" to "#f5f5f5")), "border-b-1" to padStyleMapOf(utsMapOf("borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "#f5f5f5")), "border-b-2" to padStyleMapOf(utsMapOf("borderBottomWidth" to 2, "borderBottomStyle" to "solid", "borderBottomColor" to "#f5f5f5")), "border-b-3" to padStyleMapOf(utsMapOf("borderBottomWidth" to 3, "borderBottomStyle" to "solid", "borderBottomColor" to "#f5f5f5")), "border-b-4" to padStyleMapOf(utsMapOf("borderBottomWidth" to 4, "borderBottomStyle" to "solid", "borderBottomColor" to "#f5f5f5")), "border-b-5" to padStyleMapOf(utsMapOf("borderBottomWidth" to 5, "borderBottomStyle" to "solid", "borderBottomColor" to "#f5f5f5")), "border-a-1" to padStyleMapOf(utsMapOf("borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-a-2" to padStyleMapOf(utsMapOf("borderWidth" to 2, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-a-3" to padStyleMapOf(utsMapOf("borderWidth" to 3, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-a-4" to padStyleMapOf(utsMapOf("borderWidth" to 4, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "border-a-5" to padStyleMapOf(utsMapOf("borderWidth" to 5, "borderStyle" to "solid", "borderColor" to "#f5f5f5")), "pa-0" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingRight" to 0, "paddingBottom" to 0, "paddingLeft" to 0)), "pa-1" to padStyleMapOf(utsMapOf("paddingTop" to 1, "paddingRight" to 1, "paddingBottom" to 1, "paddingLeft" to 1)), "pa-2" to padStyleMapOf(utsMapOf("paddingTop" to 2, "paddingRight" to 2, "paddingBottom" to 2, "paddingLeft" to 2)), "pa-3" to padStyleMapOf(utsMapOf("paddingTop" to 3, "paddingRight" to 3, "paddingBottom" to 3, "paddingLeft" to 3)), "pa-4" to padStyleMapOf(utsMapOf("paddingTop" to 4, "paddingRight" to 4, "paddingBottom" to 4, "paddingLeft" to 4)), "pa-5" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingRight" to 5, "paddingBottom" to 5, "paddingLeft" to 5)), "pa-6" to padStyleMapOf(utsMapOf("paddingTop" to 6, "paddingRight" to 6, "paddingBottom" to 6, "paddingLeft" to 6)), "pa-7" to padStyleMapOf(utsMapOf("paddingTop" to 7, "paddingRight" to 7, "paddingBottom" to 7, "paddingLeft" to 7)), "pa-8" to padStyleMapOf(utsMapOf("paddingTop" to 8, "paddingRight" to 8, "paddingBottom" to 8, "paddingLeft" to 8)), "pa-9" to padStyleMapOf(utsMapOf("paddingTop" to 9, "paddingRight" to 9, "paddingBottom" to 9, "paddingLeft" to 9)), "pa-10" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "pa-11" to padStyleMapOf(utsMapOf("paddingTop" to 11, "paddingRight" to 11, "paddingBottom" to 11, "paddingLeft" to 11)));
            }
        val styles7: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("pa-12" to padStyleMapOf(utsMapOf("paddingTop" to 12, "paddingRight" to 12, "paddingBottom" to 12, "paddingLeft" to 12)), "pa-13" to padStyleMapOf(utsMapOf("paddingTop" to 13, "paddingRight" to 13, "paddingBottom" to 13, "paddingLeft" to 13)), "pa-14" to padStyleMapOf(utsMapOf("paddingTop" to 14, "paddingRight" to 14, "paddingBottom" to 14, "paddingLeft" to 14)), "pa-15" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "pa-16" to padStyleMapOf(utsMapOf("paddingTop" to 16, "paddingRight" to 16, "paddingBottom" to 16, "paddingLeft" to 16)), "pa-17" to padStyleMapOf(utsMapOf("paddingTop" to 17, "paddingRight" to 17, "paddingBottom" to 17, "paddingLeft" to 17)), "pa-18" to padStyleMapOf(utsMapOf("paddingTop" to 18, "paddingRight" to 18, "paddingBottom" to 18, "paddingLeft" to 18)), "pa-19" to padStyleMapOf(utsMapOf("paddingTop" to 19, "paddingRight" to 19, "paddingBottom" to 19, "paddingLeft" to 19)), "pa-20" to padStyleMapOf(utsMapOf("paddingTop" to 20, "paddingRight" to 20, "paddingBottom" to 20, "paddingLeft" to 20)), "pa-21" to padStyleMapOf(utsMapOf("paddingTop" to 21, "paddingRight" to 21, "paddingBottom" to 21, "paddingLeft" to 21)), "pa-22" to padStyleMapOf(utsMapOf("paddingTop" to 22, "paddingRight" to 22, "paddingBottom" to 22, "paddingLeft" to 22)), "pa-23" to padStyleMapOf(utsMapOf("paddingTop" to 23, "paddingRight" to 23, "paddingBottom" to 23, "paddingLeft" to 23)), "pa-24" to padStyleMapOf(utsMapOf("paddingTop" to 24, "paddingRight" to 24, "paddingBottom" to 24, "paddingLeft" to 24)), "pa-25" to padStyleMapOf(utsMapOf("paddingTop" to 25, "paddingRight" to 25, "paddingBottom" to 25, "paddingLeft" to 25)), "pa-26" to padStyleMapOf(utsMapOf("paddingTop" to 26, "paddingRight" to 26, "paddingBottom" to 26, "paddingLeft" to 26)), "pa-27" to padStyleMapOf(utsMapOf("paddingTop" to 27, "paddingRight" to 27, "paddingBottom" to 27, "paddingLeft" to 27)), "pa-28" to padStyleMapOf(utsMapOf("paddingTop" to 28, "paddingRight" to 28, "paddingBottom" to 28, "paddingLeft" to 28)), "pa-29" to padStyleMapOf(utsMapOf("paddingTop" to 29, "paddingRight" to 29, "paddingBottom" to 29, "paddingLeft" to 29)), "pa-30" to padStyleMapOf(utsMapOf("paddingTop" to 30, "paddingRight" to 30, "paddingBottom" to 30, "paddingLeft" to 30)), "pa-31" to padStyleMapOf(utsMapOf("paddingTop" to 31, "paddingRight" to 31, "paddingBottom" to 31, "paddingLeft" to 31)), "pa-32" to padStyleMapOf(utsMapOf("paddingTop" to 32, "paddingRight" to 32, "paddingBottom" to 32, "paddingLeft" to 32)), "pa-33" to padStyleMapOf(utsMapOf("paddingTop" to 33, "paddingRight" to 33, "paddingBottom" to 33, "paddingLeft" to 33)), "pa-34" to padStyleMapOf(utsMapOf("paddingTop" to 34, "paddingRight" to 34, "paddingBottom" to 34, "paddingLeft" to 34)), "pa-35" to padStyleMapOf(utsMapOf("paddingTop" to 35, "paddingRight" to 35, "paddingBottom" to 35, "paddingLeft" to 35)), "pa-36" to padStyleMapOf(utsMapOf("paddingTop" to 36, "paddingRight" to 36, "paddingBottom" to 36, "paddingLeft" to 36)), "pa-37" to padStyleMapOf(utsMapOf("paddingTop" to 37, "paddingRight" to 37, "paddingBottom" to 37, "paddingLeft" to 37)), "pa-38" to padStyleMapOf(utsMapOf("paddingTop" to 38, "paddingRight" to 38, "paddingBottom" to 38, "paddingLeft" to 38)), "pa-39" to padStyleMapOf(utsMapOf("paddingTop" to 39, "paddingRight" to 39, "paddingBottom" to 39, "paddingLeft" to 39)), "pa-40" to padStyleMapOf(utsMapOf("paddingTop" to 40, "paddingRight" to 40, "paddingBottom" to 40, "paddingLeft" to 40)), "pa-41" to padStyleMapOf(utsMapOf("paddingTop" to 41, "paddingRight" to 41, "paddingBottom" to 41, "paddingLeft" to 41)), "pa-42" to padStyleMapOf(utsMapOf("paddingTop" to 42, "paddingRight" to 42, "paddingBottom" to 42, "paddingLeft" to 42)), "pa-43" to padStyleMapOf(utsMapOf("paddingTop" to 43, "paddingRight" to 43, "paddingBottom" to 43, "paddingLeft" to 43)), "pa-44" to padStyleMapOf(utsMapOf("paddingTop" to 44, "paddingRight" to 44, "paddingBottom" to 44, "paddingLeft" to 44)), "pa-45" to padStyleMapOf(utsMapOf("paddingTop" to 45, "paddingRight" to 45, "paddingBottom" to 45, "paddingLeft" to 45)), "pa-46" to padStyleMapOf(utsMapOf("paddingTop" to 46, "paddingRight" to 46, "paddingBottom" to 46, "paddingLeft" to 46)), "pa-47" to padStyleMapOf(utsMapOf("paddingTop" to 47, "paddingRight" to 47, "paddingBottom" to 47, "paddingLeft" to 47)), "pa-48" to padStyleMapOf(utsMapOf("paddingTop" to 48, "paddingRight" to 48, "paddingBottom" to 48, "paddingLeft" to 48)), "pa-49" to padStyleMapOf(utsMapOf("paddingTop" to 49, "paddingRight" to 49, "paddingBottom" to 49, "paddingLeft" to 49)), "pa-50" to padStyleMapOf(utsMapOf("paddingTop" to 50, "paddingRight" to 50, "paddingBottom" to 50, "paddingLeft" to 50)), "pa-n1" to padStyleMapOf(utsMapOf("paddingTop" to 2, "paddingRight" to 2, "paddingBottom" to 2, "paddingLeft" to 2)), "pa-n2" to padStyleMapOf(utsMapOf("paddingTop" to 4, "paddingRight" to 4, "paddingBottom" to 4, "paddingLeft" to 4)), "pa-n3" to padStyleMapOf(utsMapOf("paddingTop" to 6, "paddingRight" to 6, "paddingBottom" to 6, "paddingLeft" to 6)), "pa-n4" to padStyleMapOf(utsMapOf("paddingTop" to 8, "paddingRight" to 8, "paddingBottom" to 8, "paddingLeft" to 8)), "pa-n5" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "pa-n6" to padStyleMapOf(utsMapOf("paddingTop" to 12, "paddingRight" to 12, "paddingBottom" to 12, "paddingLeft" to 12)), "pa-n7" to padStyleMapOf(utsMapOf("paddingTop" to 14, "paddingRight" to 14, "paddingBottom" to 14, "paddingLeft" to 14)), "pa-n8" to padStyleMapOf(utsMapOf("paddingTop" to 16, "paddingRight" to 16, "paddingBottom" to 16, "paddingLeft" to 16)), "pa-n9" to padStyleMapOf(utsMapOf("paddingTop" to 18, "paddingRight" to 18, "paddingBottom" to 18, "paddingLeft" to 18)), "pa-n10" to padStyleMapOf(utsMapOf("paddingTop" to 20, "paddingRight" to 20, "paddingBottom" to 20, "paddingLeft" to 20)), "pa-n11" to padStyleMapOf(utsMapOf("paddingTop" to 22, "paddingRight" to 22, "paddingBottom" to 22, "paddingLeft" to 22)), "pa-n12" to padStyleMapOf(utsMapOf("paddingTop" to 24, "paddingRight" to 24, "paddingBottom" to 24, "paddingLeft" to 24)), "pa-n13" to padStyleMapOf(utsMapOf("paddingTop" to 26, "paddingRight" to 26, "paddingBottom" to 26, "paddingLeft" to 26)), "pa-n14" to padStyleMapOf(utsMapOf("paddingTop" to 28, "paddingRight" to 28, "paddingBottom" to 28, "paddingLeft" to 28)), "pa-n15" to padStyleMapOf(utsMapOf("paddingTop" to 30, "paddingRight" to 30, "paddingBottom" to 30, "paddingLeft" to 30)), "pa-n16" to padStyleMapOf(utsMapOf("paddingTop" to 32, "paddingRight" to 32, "paddingBottom" to 32, "paddingLeft" to 32)), "pa-n17" to padStyleMapOf(utsMapOf("paddingTop" to 34, "paddingRight" to 34, "paddingBottom" to 34, "paddingLeft" to 34)), "pa-n18" to padStyleMapOf(utsMapOf("paddingTop" to 36, "paddingRight" to 36, "paddingBottom" to 36, "paddingLeft" to 36)), "pa-n19" to padStyleMapOf(utsMapOf("paddingTop" to 38, "paddingRight" to 38, "paddingBottom" to 38, "paddingLeft" to 38)), "pa-n20" to padStyleMapOf(utsMapOf("paddingTop" to 40, "paddingRight" to 40, "paddingBottom" to 40, "paddingLeft" to 40)), "pa-n21" to padStyleMapOf(utsMapOf("paddingTop" to 42, "paddingRight" to 42, "paddingBottom" to 42, "paddingLeft" to 42)), "pa-n22" to padStyleMapOf(utsMapOf("paddingTop" to 44, "paddingRight" to 44, "paddingBottom" to 44, "paddingLeft" to 44)), "pa-n23" to padStyleMapOf(utsMapOf("paddingTop" to 46, "paddingRight" to 46, "paddingBottom" to 46, "paddingLeft" to 46)), "pa-n24" to padStyleMapOf(utsMapOf("paddingTop" to 48, "paddingRight" to 48, "paddingBottom" to 48, "paddingLeft" to 48)), "pa-n25" to padStyleMapOf(utsMapOf("paddingTop" to 50, "paddingRight" to 50, "paddingBottom" to 50, "paddingLeft" to 50)), "pt-0" to padStyleMapOf(utsMapOf("paddingTop" to 0)), "pt-1" to padStyleMapOf(utsMapOf("paddingTop" to 1)), "pt-2" to padStyleMapOf(utsMapOf("paddingTop" to 2)), "pt-3" to padStyleMapOf(utsMapOf("paddingTop" to 3)), "pt-4" to padStyleMapOf(utsMapOf("paddingTop" to 4)), "pt-5" to padStyleMapOf(utsMapOf("paddingTop" to 5)), "pt-6" to padStyleMapOf(utsMapOf("paddingTop" to 6)), "pt-7" to padStyleMapOf(utsMapOf("paddingTop" to 7)), "pt-8" to padStyleMapOf(utsMapOf("paddingTop" to 8)), "pt-9" to padStyleMapOf(utsMapOf("paddingTop" to 9)), "pt-10" to padStyleMapOf(utsMapOf("paddingTop" to 10)), "pt-11" to padStyleMapOf(utsMapOf("paddingTop" to 11)), "pt-12" to padStyleMapOf(utsMapOf("paddingTop" to 12)), "pt-13" to padStyleMapOf(utsMapOf("paddingTop" to 13)), "pt-14" to padStyleMapOf(utsMapOf("paddingTop" to 14)), "pt-15" to padStyleMapOf(utsMapOf("paddingTop" to 15)), "pt-16" to padStyleMapOf(utsMapOf("paddingTop" to 16)), "pt-17" to padStyleMapOf(utsMapOf("paddingTop" to 17)), "pt-18" to padStyleMapOf(utsMapOf("paddingTop" to 18)), "pt-19" to padStyleMapOf(utsMapOf("paddingTop" to 19)), "pt-20" to padStyleMapOf(utsMapOf("paddingTop" to 20)), "pt-21" to padStyleMapOf(utsMapOf("paddingTop" to 21)), "pt-22" to padStyleMapOf(utsMapOf("paddingTop" to 22)), "pt-23" to padStyleMapOf(utsMapOf("paddingTop" to 23)), "pt-24" to padStyleMapOf(utsMapOf("paddingTop" to 24)), "pt-25" to padStyleMapOf(utsMapOf("paddingTop" to 25)), "pt-26" to padStyleMapOf(utsMapOf("paddingTop" to 26)), "pt-27" to padStyleMapOf(utsMapOf("paddingTop" to 27)), "pt-28" to padStyleMapOf(utsMapOf("paddingTop" to 28)), "pt-29" to padStyleMapOf(utsMapOf("paddingTop" to 29)), "pt-30" to padStyleMapOf(utsMapOf("paddingTop" to 30)), "pt-31" to padStyleMapOf(utsMapOf("paddingTop" to 31)), "pt-32" to padStyleMapOf(utsMapOf("paddingTop" to 32)), "pt-33" to padStyleMapOf(utsMapOf("paddingTop" to 33)), "pt-34" to padStyleMapOf(utsMapOf("paddingTop" to 34)), "pt-35" to padStyleMapOf(utsMapOf("paddingTop" to 35)));
            }
        val styles8: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("pt-36" to padStyleMapOf(utsMapOf("paddingTop" to 36)), "pt-37" to padStyleMapOf(utsMapOf("paddingTop" to 37)), "pt-38" to padStyleMapOf(utsMapOf("paddingTop" to 38)), "pt-39" to padStyleMapOf(utsMapOf("paddingTop" to 39)), "pt-40" to padStyleMapOf(utsMapOf("paddingTop" to 40)), "pt-41" to padStyleMapOf(utsMapOf("paddingTop" to 41)), "pt-42" to padStyleMapOf(utsMapOf("paddingTop" to 42)), "pt-43" to padStyleMapOf(utsMapOf("paddingTop" to 43)), "pt-44" to padStyleMapOf(utsMapOf("paddingTop" to 44)), "pt-45" to padStyleMapOf(utsMapOf("paddingTop" to 45)), "pt-46" to padStyleMapOf(utsMapOf("paddingTop" to 46)), "pt-47" to padStyleMapOf(utsMapOf("paddingTop" to 47)), "pt-48" to padStyleMapOf(utsMapOf("paddingTop" to 48)), "pt-49" to padStyleMapOf(utsMapOf("paddingTop" to 49)), "pt-50" to padStyleMapOf(utsMapOf("paddingTop" to 50)), "pt-n1" to padStyleMapOf(utsMapOf("paddingTop" to 2)), "pt-n2" to padStyleMapOf(utsMapOf("paddingTop" to 4)), "pt-n3" to padStyleMapOf(utsMapOf("paddingTop" to 6)), "pt-n4" to padStyleMapOf(utsMapOf("paddingTop" to 8)), "pt-n5" to padStyleMapOf(utsMapOf("paddingTop" to 10)), "pt-n6" to padStyleMapOf(utsMapOf("paddingTop" to 12)), "pt-n7" to padStyleMapOf(utsMapOf("paddingTop" to 14)), "pt-n8" to padStyleMapOf(utsMapOf("paddingTop" to 16)), "pt-n9" to padStyleMapOf(utsMapOf("paddingTop" to 18)), "pt-n10" to padStyleMapOf(utsMapOf("paddingTop" to 20)), "pt-n11" to padStyleMapOf(utsMapOf("paddingTop" to 22)), "pt-n12" to padStyleMapOf(utsMapOf("paddingTop" to 24)), "pt-n13" to padStyleMapOf(utsMapOf("paddingTop" to 26)), "pt-n14" to padStyleMapOf(utsMapOf("paddingTop" to 28)), "pt-n15" to padStyleMapOf(utsMapOf("paddingTop" to 30)), "pt-n16" to padStyleMapOf(utsMapOf("paddingTop" to 32)), "pt-n17" to padStyleMapOf(utsMapOf("paddingTop" to 34)), "pt-n18" to padStyleMapOf(utsMapOf("paddingTop" to 36)), "pt-n19" to padStyleMapOf(utsMapOf("paddingTop" to 38)), "pt-n20" to padStyleMapOf(utsMapOf("paddingTop" to 40)), "pt-n21" to padStyleMapOf(utsMapOf("paddingTop" to 42)), "pt-n22" to padStyleMapOf(utsMapOf("paddingTop" to 44)), "pt-n23" to padStyleMapOf(utsMapOf("paddingTop" to 46)), "pt-n24" to padStyleMapOf(utsMapOf("paddingTop" to 48)), "pt-n25" to padStyleMapOf(utsMapOf("paddingTop" to 50)), "pr-0" to padStyleMapOf(utsMapOf("paddingRight" to 0)), "pr-1" to padStyleMapOf(utsMapOf("paddingRight" to 1)), "pr-2" to padStyleMapOf(utsMapOf("paddingRight" to 2)), "pr-3" to padStyleMapOf(utsMapOf("paddingRight" to 3)), "pr-4" to padStyleMapOf(utsMapOf("paddingRight" to 4)), "pr-5" to padStyleMapOf(utsMapOf("paddingRight" to 5)), "pr-6" to padStyleMapOf(utsMapOf("paddingRight" to 6)), "pr-7" to padStyleMapOf(utsMapOf("paddingRight" to 7)), "pr-8" to padStyleMapOf(utsMapOf("paddingRight" to 8)), "pr-9" to padStyleMapOf(utsMapOf("paddingRight" to 9)), "pr-10" to padStyleMapOf(utsMapOf("paddingRight" to 10)), "pr-11" to padStyleMapOf(utsMapOf("paddingRight" to 11)), "pr-12" to padStyleMapOf(utsMapOf("paddingRight" to 12)), "pr-13" to padStyleMapOf(utsMapOf("paddingRight" to 13)), "pr-14" to padStyleMapOf(utsMapOf("paddingRight" to 14)), "pr-15" to padStyleMapOf(utsMapOf("paddingRight" to 15)), "pr-16" to padStyleMapOf(utsMapOf("paddingRight" to 16)), "pr-17" to padStyleMapOf(utsMapOf("paddingRight" to 17)), "pr-18" to padStyleMapOf(utsMapOf("paddingRight" to 18)), "pr-19" to padStyleMapOf(utsMapOf("paddingRight" to 19)), "pr-20" to padStyleMapOf(utsMapOf("paddingRight" to 20)), "pr-21" to padStyleMapOf(utsMapOf("paddingRight" to 21)), "pr-22" to padStyleMapOf(utsMapOf("paddingRight" to 22)), "pr-23" to padStyleMapOf(utsMapOf("paddingRight" to 23)), "pr-24" to padStyleMapOf(utsMapOf("paddingRight" to 24)), "pr-25" to padStyleMapOf(utsMapOf("paddingRight" to 25)), "pr-26" to padStyleMapOf(utsMapOf("paddingRight" to 26)), "pr-27" to padStyleMapOf(utsMapOf("paddingRight" to 27)), "pr-28" to padStyleMapOf(utsMapOf("paddingRight" to 28)), "pr-29" to padStyleMapOf(utsMapOf("paddingRight" to 29)), "pr-30" to padStyleMapOf(utsMapOf("paddingRight" to 30)), "pr-31" to padStyleMapOf(utsMapOf("paddingRight" to 31)), "pr-32" to padStyleMapOf(utsMapOf("paddingRight" to 32)), "pr-33" to padStyleMapOf(utsMapOf("paddingRight" to 33)), "pr-34" to padStyleMapOf(utsMapOf("paddingRight" to 34)), "pr-35" to padStyleMapOf(utsMapOf("paddingRight" to 35)), "pr-36" to padStyleMapOf(utsMapOf("paddingRight" to 36)), "pr-37" to padStyleMapOf(utsMapOf("paddingRight" to 37)), "pr-38" to padStyleMapOf(utsMapOf("paddingRight" to 38)), "pr-39" to padStyleMapOf(utsMapOf("paddingRight" to 39)), "pr-40" to padStyleMapOf(utsMapOf("paddingRight" to 40)), "pr-41" to padStyleMapOf(utsMapOf("paddingRight" to 41)), "pr-42" to padStyleMapOf(utsMapOf("paddingRight" to 42)), "pr-43" to padStyleMapOf(utsMapOf("paddingRight" to 43)), "pr-44" to padStyleMapOf(utsMapOf("paddingRight" to 44)), "pr-45" to padStyleMapOf(utsMapOf("paddingRight" to 45)), "pr-46" to padStyleMapOf(utsMapOf("paddingRight" to 46)), "pr-47" to padStyleMapOf(utsMapOf("paddingRight" to 47)), "pr-48" to padStyleMapOf(utsMapOf("paddingRight" to 48)), "pr-49" to padStyleMapOf(utsMapOf("paddingRight" to 49)), "pr-50" to padStyleMapOf(utsMapOf("paddingRight" to 50)), "pr-n1" to padStyleMapOf(utsMapOf("paddingRight" to 2)), "pr-n2" to padStyleMapOf(utsMapOf("paddingRight" to 4)), "pr-n3" to padStyleMapOf(utsMapOf("paddingRight" to 6)), "pr-n4" to padStyleMapOf(utsMapOf("paddingRight" to 8)), "pr-n5" to padStyleMapOf(utsMapOf("paddingRight" to 10)), "pr-n6" to padStyleMapOf(utsMapOf("paddingRight" to 12)), "pr-n7" to padStyleMapOf(utsMapOf("paddingRight" to 14)), "pr-n8" to padStyleMapOf(utsMapOf("paddingRight" to 16)), "pr-n9" to padStyleMapOf(utsMapOf("paddingRight" to 18)));
            }
        val styles9: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("pr-n10" to padStyleMapOf(utsMapOf("paddingRight" to 20)), "pr-n11" to padStyleMapOf(utsMapOf("paddingRight" to 22)), "pr-n12" to padStyleMapOf(utsMapOf("paddingRight" to 24)), "pr-n13" to padStyleMapOf(utsMapOf("paddingRight" to 26)), "pr-n14" to padStyleMapOf(utsMapOf("paddingRight" to 28)), "pr-n15" to padStyleMapOf(utsMapOf("paddingRight" to 30)), "pr-n16" to padStyleMapOf(utsMapOf("paddingRight" to 32)), "pr-n17" to padStyleMapOf(utsMapOf("paddingRight" to 34)), "pr-n18" to padStyleMapOf(utsMapOf("paddingRight" to 36)), "pr-n19" to padStyleMapOf(utsMapOf("paddingRight" to 38)), "pr-n20" to padStyleMapOf(utsMapOf("paddingRight" to 40)), "pr-n21" to padStyleMapOf(utsMapOf("paddingRight" to 42)), "pr-n22" to padStyleMapOf(utsMapOf("paddingRight" to 44)), "pr-n23" to padStyleMapOf(utsMapOf("paddingRight" to 46)), "pr-n24" to padStyleMapOf(utsMapOf("paddingRight" to 48)), "pr-n25" to padStyleMapOf(utsMapOf("paddingRight" to 50)), "pb-0" to padStyleMapOf(utsMapOf("paddingBottom" to 0)), "pb-1" to padStyleMapOf(utsMapOf("paddingBottom" to 1)), "pb-2" to padStyleMapOf(utsMapOf("paddingBottom" to 2)), "pb-3" to padStyleMapOf(utsMapOf("paddingBottom" to 3)), "pb-4" to padStyleMapOf(utsMapOf("paddingBottom" to 4)), "pb-5" to padStyleMapOf(utsMapOf("paddingBottom" to 5)), "pb-6" to padStyleMapOf(utsMapOf("paddingBottom" to 6)), "pb-7" to padStyleMapOf(utsMapOf("paddingBottom" to 7)), "pb-8" to padStyleMapOf(utsMapOf("paddingBottom" to 8)), "pb-9" to padStyleMapOf(utsMapOf("paddingBottom" to 9)), "pb-10" to padStyleMapOf(utsMapOf("paddingBottom" to 10)), "pb-11" to padStyleMapOf(utsMapOf("paddingBottom" to 11)), "pb-12" to padStyleMapOf(utsMapOf("paddingBottom" to 12)), "pb-13" to padStyleMapOf(utsMapOf("paddingBottom" to 13)), "pb-14" to padStyleMapOf(utsMapOf("paddingBottom" to 14)), "pb-15" to padStyleMapOf(utsMapOf("paddingBottom" to 15)), "pb-16" to padStyleMapOf(utsMapOf("paddingBottom" to 16)), "pb-17" to padStyleMapOf(utsMapOf("paddingBottom" to 17)), "pb-18" to padStyleMapOf(utsMapOf("paddingBottom" to 18)), "pb-19" to padStyleMapOf(utsMapOf("paddingBottom" to 19)), "pb-20" to padStyleMapOf(utsMapOf("paddingBottom" to 20)), "pb-21" to padStyleMapOf(utsMapOf("paddingBottom" to 21)), "pb-22" to padStyleMapOf(utsMapOf("paddingBottom" to 22)), "pb-23" to padStyleMapOf(utsMapOf("paddingBottom" to 23)), "pb-24" to padStyleMapOf(utsMapOf("paddingBottom" to 24)), "pb-25" to padStyleMapOf(utsMapOf("paddingBottom" to 25)), "pb-26" to padStyleMapOf(utsMapOf("paddingBottom" to 26)), "pb-27" to padStyleMapOf(utsMapOf("paddingBottom" to 27)), "pb-28" to padStyleMapOf(utsMapOf("paddingBottom" to 28)), "pb-29" to padStyleMapOf(utsMapOf("paddingBottom" to 29)), "pb-30" to padStyleMapOf(utsMapOf("paddingBottom" to 30)), "pb-31" to padStyleMapOf(utsMapOf("paddingBottom" to 31)), "pb-32" to padStyleMapOf(utsMapOf("paddingBottom" to 32)), "pb-33" to padStyleMapOf(utsMapOf("paddingBottom" to 33)), "pb-34" to padStyleMapOf(utsMapOf("paddingBottom" to 34)), "pb-35" to padStyleMapOf(utsMapOf("paddingBottom" to 35)), "pb-36" to padStyleMapOf(utsMapOf("paddingBottom" to 36)), "pb-37" to padStyleMapOf(utsMapOf("paddingBottom" to 37)), "pb-38" to padStyleMapOf(utsMapOf("paddingBottom" to 38)), "pb-39" to padStyleMapOf(utsMapOf("paddingBottom" to 39)), "pb-40" to padStyleMapOf(utsMapOf("paddingBottom" to 40)), "pb-41" to padStyleMapOf(utsMapOf("paddingBottom" to 41)), "pb-42" to padStyleMapOf(utsMapOf("paddingBottom" to 42)), "pb-43" to padStyleMapOf(utsMapOf("paddingBottom" to 43)), "pb-44" to padStyleMapOf(utsMapOf("paddingBottom" to 44)), "pb-45" to padStyleMapOf(utsMapOf("paddingBottom" to 45)), "pb-46" to padStyleMapOf(utsMapOf("paddingBottom" to 46)), "pb-47" to padStyleMapOf(utsMapOf("paddingBottom" to 47)), "pb-48" to padStyleMapOf(utsMapOf("paddingBottom" to 48)), "pb-49" to padStyleMapOf(utsMapOf("paddingBottom" to 49)), "pb-50" to padStyleMapOf(utsMapOf("paddingBottom" to 50)), "pb-n1" to padStyleMapOf(utsMapOf("paddingBottom" to 2)), "pb-n2" to padStyleMapOf(utsMapOf("paddingBottom" to 4)), "pb-n3" to padStyleMapOf(utsMapOf("paddingBottom" to 6)), "pb-n4" to padStyleMapOf(utsMapOf("paddingBottom" to 8)), "pb-n5" to padStyleMapOf(utsMapOf("paddingBottom" to 10)), "pb-n6" to padStyleMapOf(utsMapOf("paddingBottom" to 12)), "pb-n7" to padStyleMapOf(utsMapOf("paddingBottom" to 14)), "pb-n8" to padStyleMapOf(utsMapOf("paddingBottom" to 16)), "pb-n9" to padStyleMapOf(utsMapOf("paddingBottom" to 18)), "pb-n10" to padStyleMapOf(utsMapOf("paddingBottom" to 20)), "pb-n11" to padStyleMapOf(utsMapOf("paddingBottom" to 22)), "pb-n12" to padStyleMapOf(utsMapOf("paddingBottom" to 24)), "pb-n13" to padStyleMapOf(utsMapOf("paddingBottom" to 26)), "pb-n14" to padStyleMapOf(utsMapOf("paddingBottom" to 28)), "pb-n15" to padStyleMapOf(utsMapOf("paddingBottom" to 30)), "pb-n16" to padStyleMapOf(utsMapOf("paddingBottom" to 32)), "pb-n17" to padStyleMapOf(utsMapOf("paddingBottom" to 34)), "pb-n18" to padStyleMapOf(utsMapOf("paddingBottom" to 36)), "pb-n19" to padStyleMapOf(utsMapOf("paddingBottom" to 38)), "pb-n20" to padStyleMapOf(utsMapOf("paddingBottom" to 40)), "pb-n21" to padStyleMapOf(utsMapOf("paddingBottom" to 42)), "pb-n22" to padStyleMapOf(utsMapOf("paddingBottom" to 44)), "pb-n23" to padStyleMapOf(utsMapOf("paddingBottom" to 46)), "pb-n24" to padStyleMapOf(utsMapOf("paddingBottom" to 48)), "pb-n25" to padStyleMapOf(utsMapOf("paddingBottom" to 50)), "pl-0" to padStyleMapOf(utsMapOf("paddingLeft" to 0)), "pl-1" to padStyleMapOf(utsMapOf("paddingLeft" to 1)), "pl-2" to padStyleMapOf(utsMapOf("paddingLeft" to 2)), "pl-3" to padStyleMapOf(utsMapOf("paddingLeft" to 3)), "pl-4" to padStyleMapOf(utsMapOf("paddingLeft" to 4)), "pl-5" to padStyleMapOf(utsMapOf("paddingLeft" to 5)), "pl-6" to padStyleMapOf(utsMapOf("paddingLeft" to 6)), "pl-7" to padStyleMapOf(utsMapOf("paddingLeft" to 7)));
            }
        val styles10: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("pl-8" to padStyleMapOf(utsMapOf("paddingLeft" to 8)), "pl-9" to padStyleMapOf(utsMapOf("paddingLeft" to 9)), "pl-10" to padStyleMapOf(utsMapOf("paddingLeft" to 10)), "pl-11" to padStyleMapOf(utsMapOf("paddingLeft" to 11)), "pl-12" to padStyleMapOf(utsMapOf("paddingLeft" to 12)), "pl-13" to padStyleMapOf(utsMapOf("paddingLeft" to 13)), "pl-14" to padStyleMapOf(utsMapOf("paddingLeft" to 14)), "pl-15" to padStyleMapOf(utsMapOf("paddingLeft" to 15)), "pl-16" to padStyleMapOf(utsMapOf("paddingLeft" to 16)), "pl-17" to padStyleMapOf(utsMapOf("paddingLeft" to 17)), "pl-18" to padStyleMapOf(utsMapOf("paddingLeft" to 18)), "pl-19" to padStyleMapOf(utsMapOf("paddingLeft" to 19)), "pl-20" to padStyleMapOf(utsMapOf("paddingLeft" to 20)), "pl-21" to padStyleMapOf(utsMapOf("paddingLeft" to 21)), "pl-22" to padStyleMapOf(utsMapOf("paddingLeft" to 22)), "pl-23" to padStyleMapOf(utsMapOf("paddingLeft" to 23)), "pl-24" to padStyleMapOf(utsMapOf("paddingLeft" to 24)), "pl-25" to padStyleMapOf(utsMapOf("paddingLeft" to 25)), "pl-26" to padStyleMapOf(utsMapOf("paddingLeft" to 26)), "pl-27" to padStyleMapOf(utsMapOf("paddingLeft" to 27)), "pl-28" to padStyleMapOf(utsMapOf("paddingLeft" to 28)), "pl-29" to padStyleMapOf(utsMapOf("paddingLeft" to 29)), "pl-30" to padStyleMapOf(utsMapOf("paddingLeft" to 30)), "pl-31" to padStyleMapOf(utsMapOf("paddingLeft" to 31)), "pl-32" to padStyleMapOf(utsMapOf("paddingLeft" to 32)), "pl-33" to padStyleMapOf(utsMapOf("paddingLeft" to 33)), "pl-34" to padStyleMapOf(utsMapOf("paddingLeft" to 34)), "pl-35" to padStyleMapOf(utsMapOf("paddingLeft" to 35)), "pl-36" to padStyleMapOf(utsMapOf("paddingLeft" to 36)), "pl-37" to padStyleMapOf(utsMapOf("paddingLeft" to 37)), "pl-38" to padStyleMapOf(utsMapOf("paddingLeft" to 38)), "pl-39" to padStyleMapOf(utsMapOf("paddingLeft" to 39)), "pl-40" to padStyleMapOf(utsMapOf("paddingLeft" to 40)), "pl-41" to padStyleMapOf(utsMapOf("paddingLeft" to 41)), "pl-42" to padStyleMapOf(utsMapOf("paddingLeft" to 42)), "pl-43" to padStyleMapOf(utsMapOf("paddingLeft" to 43)), "pl-44" to padStyleMapOf(utsMapOf("paddingLeft" to 44)), "pl-45" to padStyleMapOf(utsMapOf("paddingLeft" to 45)), "pl-46" to padStyleMapOf(utsMapOf("paddingLeft" to 46)), "pl-47" to padStyleMapOf(utsMapOf("paddingLeft" to 47)), "pl-48" to padStyleMapOf(utsMapOf("paddingLeft" to 48)), "pl-49" to padStyleMapOf(utsMapOf("paddingLeft" to 49)), "pl-50" to padStyleMapOf(utsMapOf("paddingLeft" to 50)), "pl-n1" to padStyleMapOf(utsMapOf("paddingLeft" to 2)), "pl-n2" to padStyleMapOf(utsMapOf("paddingLeft" to 4)), "pl-n3" to padStyleMapOf(utsMapOf("paddingLeft" to 6)), "pl-n4" to padStyleMapOf(utsMapOf("paddingLeft" to 8)), "pl-n5" to padStyleMapOf(utsMapOf("paddingLeft" to 10)), "pl-n6" to padStyleMapOf(utsMapOf("paddingLeft" to 12)), "pl-n7" to padStyleMapOf(utsMapOf("paddingLeft" to 14)), "pl-n8" to padStyleMapOf(utsMapOf("paddingLeft" to 16)), "pl-n9" to padStyleMapOf(utsMapOf("paddingLeft" to 18)), "pl-n10" to padStyleMapOf(utsMapOf("paddingLeft" to 20)), "pl-n11" to padStyleMapOf(utsMapOf("paddingLeft" to 22)), "pl-n12" to padStyleMapOf(utsMapOf("paddingLeft" to 24)), "pl-n13" to padStyleMapOf(utsMapOf("paddingLeft" to 26)), "pl-n14" to padStyleMapOf(utsMapOf("paddingLeft" to 28)), "pl-n15" to padStyleMapOf(utsMapOf("paddingLeft" to 30)), "pl-n16" to padStyleMapOf(utsMapOf("paddingLeft" to 32)), "pl-n17" to padStyleMapOf(utsMapOf("paddingLeft" to 34)), "pl-n18" to padStyleMapOf(utsMapOf("paddingLeft" to 36)), "pl-n19" to padStyleMapOf(utsMapOf("paddingLeft" to 38)), "pl-n20" to padStyleMapOf(utsMapOf("paddingLeft" to 40)), "pl-n21" to padStyleMapOf(utsMapOf("paddingLeft" to 42)), "pl-n22" to padStyleMapOf(utsMapOf("paddingLeft" to 44)), "pl-n23" to padStyleMapOf(utsMapOf("paddingLeft" to 46)), "pl-n24" to padStyleMapOf(utsMapOf("paddingLeft" to 48)), "pl-n25" to padStyleMapOf(utsMapOf("paddingLeft" to 50)), "px-0" to padStyleMapOf(utsMapOf("paddingLeft" to 0, "paddingRight" to 0)), "px-1" to padStyleMapOf(utsMapOf("paddingLeft" to 1, "paddingRight" to 1)), "px-2" to padStyleMapOf(utsMapOf("paddingLeft" to 2, "paddingRight" to 2)), "px-3" to padStyleMapOf(utsMapOf("paddingLeft" to 3, "paddingRight" to 3)), "px-4" to padStyleMapOf(utsMapOf("paddingLeft" to 4, "paddingRight" to 4)), "px-5" to padStyleMapOf(utsMapOf("paddingLeft" to 5, "paddingRight" to 5)), "px-6" to padStyleMapOf(utsMapOf("paddingLeft" to 6, "paddingRight" to 6)), "px-7" to padStyleMapOf(utsMapOf("paddingLeft" to 7, "paddingRight" to 7)), "px-8" to padStyleMapOf(utsMapOf("paddingLeft" to 8, "paddingRight" to 8)), "px-9" to padStyleMapOf(utsMapOf("paddingLeft" to 9, "paddingRight" to 9)), "px-10" to padStyleMapOf(utsMapOf("paddingLeft" to 10, "paddingRight" to 10)), "px-11" to padStyleMapOf(utsMapOf("paddingLeft" to 11, "paddingRight" to 11)), "px-12" to padStyleMapOf(utsMapOf("paddingLeft" to 12, "paddingRight" to 12)), "px-13" to padStyleMapOf(utsMapOf("paddingLeft" to 13, "paddingRight" to 13)), "px-14" to padStyleMapOf(utsMapOf("paddingLeft" to 14, "paddingRight" to 14)), "px-15" to padStyleMapOf(utsMapOf("paddingLeft" to 15, "paddingRight" to 15)), "px-16" to padStyleMapOf(utsMapOf("paddingLeft" to 16, "paddingRight" to 16)), "px-17" to padStyleMapOf(utsMapOf("paddingLeft" to 17, "paddingRight" to 17)), "px-18" to padStyleMapOf(utsMapOf("paddingLeft" to 18, "paddingRight" to 18)), "px-19" to padStyleMapOf(utsMapOf("paddingLeft" to 19, "paddingRight" to 19)), "px-20" to padStyleMapOf(utsMapOf("paddingLeft" to 20, "paddingRight" to 20)), "px-21" to padStyleMapOf(utsMapOf("paddingLeft" to 21, "paddingRight" to 21)), "px-22" to padStyleMapOf(utsMapOf("paddingLeft" to 22, "paddingRight" to 22)), "px-23" to padStyleMapOf(utsMapOf("paddingLeft" to 23, "paddingRight" to 23)), "px-24" to padStyleMapOf(utsMapOf("paddingLeft" to 24, "paddingRight" to 24)), "px-25" to padStyleMapOf(utsMapOf("paddingLeft" to 25, "paddingRight" to 25)), "px-26" to padStyleMapOf(utsMapOf("paddingLeft" to 26, "paddingRight" to 26)), "px-27" to padStyleMapOf(utsMapOf("paddingLeft" to 27, "paddingRight" to 27)), "px-28" to padStyleMapOf(utsMapOf("paddingLeft" to 28, "paddingRight" to 28)), "px-29" to padStyleMapOf(utsMapOf("paddingLeft" to 29, "paddingRight" to 29)), "px-30" to padStyleMapOf(utsMapOf("paddingLeft" to 30, "paddingRight" to 30)), "px-31" to padStyleMapOf(utsMapOf("paddingLeft" to 31, "paddingRight" to 31)));
            }
        val styles11: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("px-32" to padStyleMapOf(utsMapOf("paddingLeft" to 32, "paddingRight" to 32)), "px-33" to padStyleMapOf(utsMapOf("paddingLeft" to 33, "paddingRight" to 33)), "px-34" to padStyleMapOf(utsMapOf("paddingLeft" to 34, "paddingRight" to 34)), "px-35" to padStyleMapOf(utsMapOf("paddingLeft" to 35, "paddingRight" to 35)), "px-36" to padStyleMapOf(utsMapOf("paddingLeft" to 36, "paddingRight" to 36)), "px-37" to padStyleMapOf(utsMapOf("paddingLeft" to 37, "paddingRight" to 37)), "px-38" to padStyleMapOf(utsMapOf("paddingLeft" to 38, "paddingRight" to 38)), "px-39" to padStyleMapOf(utsMapOf("paddingLeft" to 39, "paddingRight" to 39)), "px-40" to padStyleMapOf(utsMapOf("paddingLeft" to 40, "paddingRight" to 40)), "px-41" to padStyleMapOf(utsMapOf("paddingLeft" to 41, "paddingRight" to 41)), "px-42" to padStyleMapOf(utsMapOf("paddingLeft" to 42, "paddingRight" to 42)), "px-43" to padStyleMapOf(utsMapOf("paddingLeft" to 43, "paddingRight" to 43)), "px-44" to padStyleMapOf(utsMapOf("paddingLeft" to 44, "paddingRight" to 44)), "px-45" to padStyleMapOf(utsMapOf("paddingLeft" to 45, "paddingRight" to 45)), "px-46" to padStyleMapOf(utsMapOf("paddingLeft" to 46, "paddingRight" to 46)), "px-47" to padStyleMapOf(utsMapOf("paddingLeft" to 47, "paddingRight" to 47)), "px-48" to padStyleMapOf(utsMapOf("paddingLeft" to 48, "paddingRight" to 48)), "px-49" to padStyleMapOf(utsMapOf("paddingLeft" to 49, "paddingRight" to 49)), "px-50" to padStyleMapOf(utsMapOf("paddingLeft" to 50, "paddingRight" to 50)), "px-n1" to padStyleMapOf(utsMapOf("paddingLeft" to 2, "paddingRight" to 2)), "px-n2" to padStyleMapOf(utsMapOf("paddingLeft" to 4, "paddingRight" to 4)), "px-n3" to padStyleMapOf(utsMapOf("paddingLeft" to 6, "paddingRight" to 6)), "px-n4" to padStyleMapOf(utsMapOf("paddingLeft" to 8, "paddingRight" to 8)), "px-n5" to padStyleMapOf(utsMapOf("paddingLeft" to 10, "paddingRight" to 10)), "px-n6" to padStyleMapOf(utsMapOf("paddingLeft" to 12, "paddingRight" to 12)), "px-n7" to padStyleMapOf(utsMapOf("paddingLeft" to 14, "paddingRight" to 14)), "px-n8" to padStyleMapOf(utsMapOf("paddingLeft" to 16, "paddingRight" to 16)), "px-n9" to padStyleMapOf(utsMapOf("paddingLeft" to 18, "paddingRight" to 18)), "px-n10" to padStyleMapOf(utsMapOf("paddingLeft" to 20, "paddingRight" to 20)), "px-n11" to padStyleMapOf(utsMapOf("paddingLeft" to 22, "paddingRight" to 22)), "px-n12" to padStyleMapOf(utsMapOf("paddingLeft" to 24, "paddingRight" to 24)), "px-n13" to padStyleMapOf(utsMapOf("paddingLeft" to 26, "paddingRight" to 26)), "px-n14" to padStyleMapOf(utsMapOf("paddingLeft" to 28, "paddingRight" to 28)), "px-n15" to padStyleMapOf(utsMapOf("paddingLeft" to 30, "paddingRight" to 30)), "px-n16" to padStyleMapOf(utsMapOf("paddingLeft" to 32, "paddingRight" to 32)), "px-n17" to padStyleMapOf(utsMapOf("paddingLeft" to 34, "paddingRight" to 34)), "px-n18" to padStyleMapOf(utsMapOf("paddingLeft" to 36, "paddingRight" to 36)), "px-n19" to padStyleMapOf(utsMapOf("paddingLeft" to 38, "paddingRight" to 38)), "px-n20" to padStyleMapOf(utsMapOf("paddingLeft" to 40, "paddingRight" to 40)), "px-n21" to padStyleMapOf(utsMapOf("paddingLeft" to 42, "paddingRight" to 42)), "px-n22" to padStyleMapOf(utsMapOf("paddingLeft" to 44, "paddingRight" to 44)), "px-n23" to padStyleMapOf(utsMapOf("paddingLeft" to 46, "paddingRight" to 46)), "px-n24" to padStyleMapOf(utsMapOf("paddingLeft" to 48, "paddingRight" to 48)), "px-n25" to padStyleMapOf(utsMapOf("paddingLeft" to 50, "paddingRight" to 50)), "py-0" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingBottom" to 0)), "py-1" to padStyleMapOf(utsMapOf("paddingTop" to 1, "paddingBottom" to 1)), "py-2" to padStyleMapOf(utsMapOf("paddingTop" to 2, "paddingBottom" to 2)), "py-3" to padStyleMapOf(utsMapOf("paddingTop" to 3, "paddingBottom" to 3)), "py-4" to padStyleMapOf(utsMapOf("paddingTop" to 4, "paddingBottom" to 4)), "py-5" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingBottom" to 5)), "py-6" to padStyleMapOf(utsMapOf("paddingTop" to 6, "paddingBottom" to 6)), "py-7" to padStyleMapOf(utsMapOf("paddingTop" to 7, "paddingBottom" to 7)), "py-8" to padStyleMapOf(utsMapOf("paddingTop" to 8, "paddingBottom" to 8)), "py-9" to padStyleMapOf(utsMapOf("paddingTop" to 9, "paddingBottom" to 9)), "py-10" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingBottom" to 10)), "py-11" to padStyleMapOf(utsMapOf("paddingTop" to 11, "paddingBottom" to 11)), "py-12" to padStyleMapOf(utsMapOf("paddingTop" to 12, "paddingBottom" to 12)), "py-13" to padStyleMapOf(utsMapOf("paddingTop" to 13, "paddingBottom" to 13)), "py-14" to padStyleMapOf(utsMapOf("paddingTop" to 14, "paddingBottom" to 14)), "py-15" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingBottom" to 15)), "py-16" to padStyleMapOf(utsMapOf("paddingTop" to 16, "paddingBottom" to 16)), "py-17" to padStyleMapOf(utsMapOf("paddingTop" to 17, "paddingBottom" to 17)), "py-18" to padStyleMapOf(utsMapOf("paddingTop" to 18, "paddingBottom" to 18)), "py-19" to padStyleMapOf(utsMapOf("paddingTop" to 19, "paddingBottom" to 19)), "py-20" to padStyleMapOf(utsMapOf("paddingTop" to 20, "paddingBottom" to 20)), "py-21" to padStyleMapOf(utsMapOf("paddingTop" to 21, "paddingBottom" to 21)), "py-22" to padStyleMapOf(utsMapOf("paddingTop" to 22, "paddingBottom" to 22)), "py-23" to padStyleMapOf(utsMapOf("paddingTop" to 23, "paddingBottom" to 23)), "py-24" to padStyleMapOf(utsMapOf("paddingTop" to 24, "paddingBottom" to 24)), "py-25" to padStyleMapOf(utsMapOf("paddingTop" to 25, "paddingBottom" to 25)), "py-26" to padStyleMapOf(utsMapOf("paddingTop" to 26, "paddingBottom" to 26)), "py-27" to padStyleMapOf(utsMapOf("paddingTop" to 27, "paddingBottom" to 27)), "py-28" to padStyleMapOf(utsMapOf("paddingTop" to 28, "paddingBottom" to 28)), "py-29" to padStyleMapOf(utsMapOf("paddingTop" to 29, "paddingBottom" to 29)), "py-30" to padStyleMapOf(utsMapOf("paddingTop" to 30, "paddingBottom" to 30)), "py-31" to padStyleMapOf(utsMapOf("paddingTop" to 31, "paddingBottom" to 31)), "py-32" to padStyleMapOf(utsMapOf("paddingTop" to 32, "paddingBottom" to 32)), "py-33" to padStyleMapOf(utsMapOf("paddingTop" to 33, "paddingBottom" to 33)), "py-34" to padStyleMapOf(utsMapOf("paddingTop" to 34, "paddingBottom" to 34)), "py-35" to padStyleMapOf(utsMapOf("paddingTop" to 35, "paddingBottom" to 35)), "py-36" to padStyleMapOf(utsMapOf("paddingTop" to 36, "paddingBottom" to 36)), "py-37" to padStyleMapOf(utsMapOf("paddingTop" to 37, "paddingBottom" to 37)), "py-38" to padStyleMapOf(utsMapOf("paddingTop" to 38, "paddingBottom" to 38)), "py-39" to padStyleMapOf(utsMapOf("paddingTop" to 39, "paddingBottom" to 39)), "py-40" to padStyleMapOf(utsMapOf("paddingTop" to 40, "paddingBottom" to 40)), "py-41" to padStyleMapOf(utsMapOf("paddingTop" to 41, "paddingBottom" to 41)), "py-42" to padStyleMapOf(utsMapOf("paddingTop" to 42, "paddingBottom" to 42)), "py-43" to padStyleMapOf(utsMapOf("paddingTop" to 43, "paddingBottom" to 43)), "py-44" to padStyleMapOf(utsMapOf("paddingTop" to 44, "paddingBottom" to 44)), "py-45" to padStyleMapOf(utsMapOf("paddingTop" to 45, "paddingBottom" to 45)), "py-46" to padStyleMapOf(utsMapOf("paddingTop" to 46, "paddingBottom" to 46)), "py-47" to padStyleMapOf(utsMapOf("paddingTop" to 47, "paddingBottom" to 47)), "py-48" to padStyleMapOf(utsMapOf("paddingTop" to 48, "paddingBottom" to 48)), "py-49" to padStyleMapOf(utsMapOf("paddingTop" to 49, "paddingBottom" to 49)), "py-50" to padStyleMapOf(utsMapOf("paddingTop" to 50, "paddingBottom" to 50)), "py-n1" to padStyleMapOf(utsMapOf("paddingTop" to 2, "paddingBottom" to 2)), "py-n2" to padStyleMapOf(utsMapOf("paddingTop" to 4, "paddingBottom" to 4)), "py-n3" to padStyleMapOf(utsMapOf("paddingTop" to 6, "paddingBottom" to 6)), "py-n4" to padStyleMapOf(utsMapOf("paddingTop" to 8, "paddingBottom" to 8)), "py-n5" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingBottom" to 10)));
            }
        val styles12: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("py-n6" to padStyleMapOf(utsMapOf("paddingTop" to 12, "paddingBottom" to 12)), "py-n7" to padStyleMapOf(utsMapOf("paddingTop" to 14, "paddingBottom" to 14)), "py-n8" to padStyleMapOf(utsMapOf("paddingTop" to 16, "paddingBottom" to 16)), "py-n9" to padStyleMapOf(utsMapOf("paddingTop" to 18, "paddingBottom" to 18)), "py-n10" to padStyleMapOf(utsMapOf("paddingTop" to 20, "paddingBottom" to 20)), "py-n11" to padStyleMapOf(utsMapOf("paddingTop" to 22, "paddingBottom" to 22)), "py-n12" to padStyleMapOf(utsMapOf("paddingTop" to 24, "paddingBottom" to 24)), "py-n13" to padStyleMapOf(utsMapOf("paddingTop" to 26, "paddingBottom" to 26)), "py-n14" to padStyleMapOf(utsMapOf("paddingTop" to 28, "paddingBottom" to 28)), "py-n15" to padStyleMapOf(utsMapOf("paddingTop" to 30, "paddingBottom" to 30)), "py-n16" to padStyleMapOf(utsMapOf("paddingTop" to 32, "paddingBottom" to 32)), "py-n17" to padStyleMapOf(utsMapOf("paddingTop" to 34, "paddingBottom" to 34)), "py-n18" to padStyleMapOf(utsMapOf("paddingTop" to 36, "paddingBottom" to 36)), "py-n19" to padStyleMapOf(utsMapOf("paddingTop" to 38, "paddingBottom" to 38)), "py-n20" to padStyleMapOf(utsMapOf("paddingTop" to 40, "paddingBottom" to 40)), "py-n21" to padStyleMapOf(utsMapOf("paddingTop" to 42, "paddingBottom" to 42)), "py-n22" to padStyleMapOf(utsMapOf("paddingTop" to 44, "paddingBottom" to 44)), "py-n23" to padStyleMapOf(utsMapOf("paddingTop" to 46, "paddingBottom" to 46)), "py-n24" to padStyleMapOf(utsMapOf("paddingTop" to 48, "paddingBottom" to 48)), "py-n25" to padStyleMapOf(utsMapOf("paddingTop" to 50, "paddingBottom" to 50)), "ma-0" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginRight" to 0, "marginBottom" to 0, "marginLeft" to 0)), "ma-1" to padStyleMapOf(utsMapOf("marginTop" to 1, "marginRight" to 1, "marginBottom" to 1, "marginLeft" to 1)), "ma-2" to padStyleMapOf(utsMapOf("marginTop" to 2, "marginRight" to 2, "marginBottom" to 2, "marginLeft" to 2)), "ma-3" to padStyleMapOf(utsMapOf("marginTop" to 3, "marginRight" to 3, "marginBottom" to 3, "marginLeft" to 3)), "ma-4" to padStyleMapOf(utsMapOf("marginTop" to 4, "marginRight" to 4, "marginBottom" to 4, "marginLeft" to 4)), "ma-5" to padStyleMapOf(utsMapOf("marginTop" to 5, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 5)), "ma-6" to padStyleMapOf(utsMapOf("marginTop" to 6, "marginRight" to 6, "marginBottom" to 6, "marginLeft" to 6)), "ma-7" to padStyleMapOf(utsMapOf("marginTop" to 7, "marginRight" to 7, "marginBottom" to 7, "marginLeft" to 7)), "ma-8" to padStyleMapOf(utsMapOf("marginTop" to 8, "marginRight" to 8, "marginBottom" to 8, "marginLeft" to 8)), "ma-9" to padStyleMapOf(utsMapOf("marginTop" to 9, "marginRight" to 9, "marginBottom" to 9, "marginLeft" to 9)), "ma-10" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10)), "ma-11" to padStyleMapOf(utsMapOf("marginTop" to 11, "marginRight" to 11, "marginBottom" to 11, "marginLeft" to 11)), "ma-12" to padStyleMapOf(utsMapOf("marginTop" to 12, "marginRight" to 12, "marginBottom" to 12, "marginLeft" to 12)), "ma-13" to padStyleMapOf(utsMapOf("marginTop" to 13, "marginRight" to 13, "marginBottom" to 13, "marginLeft" to 13)), "ma-14" to padStyleMapOf(utsMapOf("marginTop" to 14, "marginRight" to 14, "marginBottom" to 14, "marginLeft" to 14)), "ma-15" to padStyleMapOf(utsMapOf("marginTop" to 15, "marginRight" to 15, "marginBottom" to 15, "marginLeft" to 15)), "ma-16" to padStyleMapOf(utsMapOf("marginTop" to 16, "marginRight" to 16, "marginBottom" to 16, "marginLeft" to 16)), "ma-17" to padStyleMapOf(utsMapOf("marginTop" to 17, "marginRight" to 17, "marginBottom" to 17, "marginLeft" to 17)), "ma-18" to padStyleMapOf(utsMapOf("marginTop" to 18, "marginRight" to 18, "marginBottom" to 18, "marginLeft" to 18)), "ma-19" to padStyleMapOf(utsMapOf("marginTop" to 19, "marginRight" to 19, "marginBottom" to 19, "marginLeft" to 19)), "ma-20" to padStyleMapOf(utsMapOf("marginTop" to 20, "marginRight" to 20, "marginBottom" to 20, "marginLeft" to 20)), "ma-21" to padStyleMapOf(utsMapOf("marginTop" to 21, "marginRight" to 21, "marginBottom" to 21, "marginLeft" to 21)), "ma-22" to padStyleMapOf(utsMapOf("marginTop" to 22, "marginRight" to 22, "marginBottom" to 22, "marginLeft" to 22)), "ma-23" to padStyleMapOf(utsMapOf("marginTop" to 23, "marginRight" to 23, "marginBottom" to 23, "marginLeft" to 23)), "ma-24" to padStyleMapOf(utsMapOf("marginTop" to 24, "marginRight" to 24, "marginBottom" to 24, "marginLeft" to 24)), "ma-25" to padStyleMapOf(utsMapOf("marginTop" to 25, "marginRight" to 25, "marginBottom" to 25, "marginLeft" to 25)), "ma-26" to padStyleMapOf(utsMapOf("marginTop" to 26, "marginRight" to 26, "marginBottom" to 26, "marginLeft" to 26)), "ma-27" to padStyleMapOf(utsMapOf("marginTop" to 27, "marginRight" to 27, "marginBottom" to 27, "marginLeft" to 27)), "ma-28" to padStyleMapOf(utsMapOf("marginTop" to 28, "marginRight" to 28, "marginBottom" to 28, "marginLeft" to 28)), "ma-29" to padStyleMapOf(utsMapOf("marginTop" to 29, "marginRight" to 29, "marginBottom" to 29, "marginLeft" to 29)), "ma-30" to padStyleMapOf(utsMapOf("marginTop" to 30, "marginRight" to 30, "marginBottom" to 30, "marginLeft" to 30)), "ma-31" to padStyleMapOf(utsMapOf("marginTop" to 31, "marginRight" to 31, "marginBottom" to 31, "marginLeft" to 31)), "ma-32" to padStyleMapOf(utsMapOf("marginTop" to 32, "marginRight" to 32, "marginBottom" to 32, "marginLeft" to 32)), "ma-33" to padStyleMapOf(utsMapOf("marginTop" to 33, "marginRight" to 33, "marginBottom" to 33, "marginLeft" to 33)), "ma-34" to padStyleMapOf(utsMapOf("marginTop" to 34, "marginRight" to 34, "marginBottom" to 34, "marginLeft" to 34)), "ma-35" to padStyleMapOf(utsMapOf("marginTop" to 35, "marginRight" to 35, "marginBottom" to 35, "marginLeft" to 35)), "ma-36" to padStyleMapOf(utsMapOf("marginTop" to 36, "marginRight" to 36, "marginBottom" to 36, "marginLeft" to 36)), "ma-37" to padStyleMapOf(utsMapOf("marginTop" to 37, "marginRight" to 37, "marginBottom" to 37, "marginLeft" to 37)), "ma-38" to padStyleMapOf(utsMapOf("marginTop" to 38, "marginRight" to 38, "marginBottom" to 38, "marginLeft" to 38)), "ma-39" to padStyleMapOf(utsMapOf("marginTop" to 39, "marginRight" to 39, "marginBottom" to 39, "marginLeft" to 39)), "ma-40" to padStyleMapOf(utsMapOf("marginTop" to 40, "marginRight" to 40, "marginBottom" to 40, "marginLeft" to 40)), "ma-41" to padStyleMapOf(utsMapOf("marginTop" to 41, "marginRight" to 41, "marginBottom" to 41, "marginLeft" to 41)), "ma-42" to padStyleMapOf(utsMapOf("marginTop" to 42, "marginRight" to 42, "marginBottom" to 42, "marginLeft" to 42)), "ma-43" to padStyleMapOf(utsMapOf("marginTop" to 43, "marginRight" to 43, "marginBottom" to 43, "marginLeft" to 43)), "ma-44" to padStyleMapOf(utsMapOf("marginTop" to 44, "marginRight" to 44, "marginBottom" to 44, "marginLeft" to 44)), "ma-45" to padStyleMapOf(utsMapOf("marginTop" to 45, "marginRight" to 45, "marginBottom" to 45, "marginLeft" to 45)), "ma-46" to padStyleMapOf(utsMapOf("marginTop" to 46, "marginRight" to 46, "marginBottom" to 46, "marginLeft" to 46)), "ma-47" to padStyleMapOf(utsMapOf("marginTop" to 47, "marginRight" to 47, "marginBottom" to 47, "marginLeft" to 47)), "ma-48" to padStyleMapOf(utsMapOf("marginTop" to 48, "marginRight" to 48, "marginBottom" to 48, "marginLeft" to 48)), "ma-49" to padStyleMapOf(utsMapOf("marginTop" to 49, "marginRight" to 49, "marginBottom" to 49, "marginLeft" to 49)), "ma-50" to padStyleMapOf(utsMapOf("marginTop" to 50, "marginRight" to 50, "marginBottom" to 50, "marginLeft" to 50)), "ma-n1" to padStyleMapOf(utsMapOf("marginTop" to 2, "marginRight" to 2, "marginBottom" to 2, "marginLeft" to 2)), "ma-n2" to padStyleMapOf(utsMapOf("marginTop" to 4, "marginRight" to 4, "marginBottom" to 4, "marginLeft" to 4)), "ma-n3" to padStyleMapOf(utsMapOf("marginTop" to 6, "marginRight" to 6, "marginBottom" to 6, "marginLeft" to 6)), "ma-n4" to padStyleMapOf(utsMapOf("marginTop" to 8, "marginRight" to 8, "marginBottom" to 8, "marginLeft" to 8)), "ma-n5" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10)), "ma-n6" to padStyleMapOf(utsMapOf("marginTop" to 12, "marginRight" to 12, "marginBottom" to 12, "marginLeft" to 12)), "ma-n7" to padStyleMapOf(utsMapOf("marginTop" to 14, "marginRight" to 14, "marginBottom" to 14, "marginLeft" to 14)), "ma-n8" to padStyleMapOf(utsMapOf("marginTop" to 16, "marginRight" to 16, "marginBottom" to 16, "marginLeft" to 16)), "ma-n9" to padStyleMapOf(utsMapOf("marginTop" to 18, "marginRight" to 18, "marginBottom" to 18, "marginLeft" to 18)), "ma-n10" to padStyleMapOf(utsMapOf("marginTop" to 20, "marginRight" to 20, "marginBottom" to 20, "marginLeft" to 20)), "ma-n11" to padStyleMapOf(utsMapOf("marginTop" to 22, "marginRight" to 22, "marginBottom" to 22, "marginLeft" to 22)), "ma-n12" to padStyleMapOf(utsMapOf("marginTop" to 24, "marginRight" to 24, "marginBottom" to 24, "marginLeft" to 24)), "ma-n13" to padStyleMapOf(utsMapOf("marginTop" to 26, "marginRight" to 26, "marginBottom" to 26, "marginLeft" to 26)), "ma-n14" to padStyleMapOf(utsMapOf("marginTop" to 28, "marginRight" to 28, "marginBottom" to 28, "marginLeft" to 28)), "ma-n15" to padStyleMapOf(utsMapOf("marginTop" to 30, "marginRight" to 30, "marginBottom" to 30, "marginLeft" to 30)), "ma-n16" to padStyleMapOf(utsMapOf("marginTop" to 32, "marginRight" to 32, "marginBottom" to 32, "marginLeft" to 32)), "ma-n17" to padStyleMapOf(utsMapOf("marginTop" to 34, "marginRight" to 34, "marginBottom" to 34, "marginLeft" to 34)), "ma-n18" to padStyleMapOf(utsMapOf("marginTop" to 36, "marginRight" to 36, "marginBottom" to 36, "marginLeft" to 36)), "ma-n19" to padStyleMapOf(utsMapOf("marginTop" to 38, "marginRight" to 38, "marginBottom" to 38, "marginLeft" to 38)), "ma-n20" to padStyleMapOf(utsMapOf("marginTop" to 40, "marginRight" to 40, "marginBottom" to 40, "marginLeft" to 40)), "ma-n21" to padStyleMapOf(utsMapOf("marginTop" to 42, "marginRight" to 42, "marginBottom" to 42, "marginLeft" to 42)), "ma-n22" to padStyleMapOf(utsMapOf("marginTop" to 44, "marginRight" to 44, "marginBottom" to 44, "marginLeft" to 44)), "ma-n23" to padStyleMapOf(utsMapOf("marginTop" to 46, "marginRight" to 46, "marginBottom" to 46, "marginLeft" to 46)), "ma-n24" to padStyleMapOf(utsMapOf("marginTop" to 48, "marginRight" to 48, "marginBottom" to 48, "marginLeft" to 48)), "ma-n25" to padStyleMapOf(utsMapOf("marginTop" to 50, "marginRight" to 50, "marginBottom" to 50, "marginLeft" to 50)), "mt-0" to padStyleMapOf(utsMapOf("marginTop" to 0)), "mt--0" to padStyleMapOf(utsMapOf("marginTop" to 0)), "mt-1" to padStyleMapOf(utsMapOf("marginTop" to 1)), "mt--1" to padStyleMapOf(utsMapOf("marginTop" to -1)));
            }
        val styles13: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("mt-2" to padStyleMapOf(utsMapOf("marginTop" to 2)), "mt--2" to padStyleMapOf(utsMapOf("marginTop" to -2)), "mt-3" to padStyleMapOf(utsMapOf("marginTop" to 3)), "mt--3" to padStyleMapOf(utsMapOf("marginTop" to -3)), "mt-4" to padStyleMapOf(utsMapOf("marginTop" to 4)), "mt--4" to padStyleMapOf(utsMapOf("marginTop" to -4)), "mt-5" to padStyleMapOf(utsMapOf("marginTop" to 5)), "mt--5" to padStyleMapOf(utsMapOf("marginTop" to -5)), "mt-6" to padStyleMapOf(utsMapOf("marginTop" to 6)), "mt--6" to padStyleMapOf(utsMapOf("marginTop" to -6)), "mt-7" to padStyleMapOf(utsMapOf("marginTop" to 7)), "mt--7" to padStyleMapOf(utsMapOf("marginTop" to -7)), "mt-8" to padStyleMapOf(utsMapOf("marginTop" to 8)), "mt--8" to padStyleMapOf(utsMapOf("marginTop" to -8)), "mt-9" to padStyleMapOf(utsMapOf("marginTop" to 9)), "mt--9" to padStyleMapOf(utsMapOf("marginTop" to -9)), "mt-10" to padStyleMapOf(utsMapOf("marginTop" to 10)), "mt--10" to padStyleMapOf(utsMapOf("marginTop" to -10)), "mt-11" to padStyleMapOf(utsMapOf("marginTop" to 11)), "mt--11" to padStyleMapOf(utsMapOf("marginTop" to -11)), "mt-12" to padStyleMapOf(utsMapOf("marginTop" to 12)), "mt--12" to padStyleMapOf(utsMapOf("marginTop" to -12)), "mt-13" to padStyleMapOf(utsMapOf("marginTop" to 13)), "mt--13" to padStyleMapOf(utsMapOf("marginTop" to -13)), "mt-14" to padStyleMapOf(utsMapOf("marginTop" to 14)), "mt--14" to padStyleMapOf(utsMapOf("marginTop" to -14)), "mt-15" to padStyleMapOf(utsMapOf("marginTop" to 15)), "mt--15" to padStyleMapOf(utsMapOf("marginTop" to -15)), "mt-16" to padStyleMapOf(utsMapOf("marginTop" to 16)), "mt--16" to padStyleMapOf(utsMapOf("marginTop" to -16)), "mt-17" to padStyleMapOf(utsMapOf("marginTop" to 17)), "mt--17" to padStyleMapOf(utsMapOf("marginTop" to -17)), "mt-18" to padStyleMapOf(utsMapOf("marginTop" to 18)), "mt--18" to padStyleMapOf(utsMapOf("marginTop" to -18)), "mt-19" to padStyleMapOf(utsMapOf("marginTop" to 19)), "mt--19" to padStyleMapOf(utsMapOf("marginTop" to -19)), "mt-20" to padStyleMapOf(utsMapOf("marginTop" to 20)), "mt--20" to padStyleMapOf(utsMapOf("marginTop" to -20)), "mt-21" to padStyleMapOf(utsMapOf("marginTop" to 21)), "mt--21" to padStyleMapOf(utsMapOf("marginTop" to -21)), "mt-22" to padStyleMapOf(utsMapOf("marginTop" to 22)), "mt--22" to padStyleMapOf(utsMapOf("marginTop" to -22)), "mt-23" to padStyleMapOf(utsMapOf("marginTop" to 23)), "mt--23" to padStyleMapOf(utsMapOf("marginTop" to -23)), "mt-24" to padStyleMapOf(utsMapOf("marginTop" to 24)), "mt--24" to padStyleMapOf(utsMapOf("marginTop" to -24)), "mt-25" to padStyleMapOf(utsMapOf("marginTop" to 25)), "mt--25" to padStyleMapOf(utsMapOf("marginTop" to -25)), "mt-26" to padStyleMapOf(utsMapOf("marginTop" to 26)), "mt--26" to padStyleMapOf(utsMapOf("marginTop" to -26)), "mt-27" to padStyleMapOf(utsMapOf("marginTop" to 27)), "mt--27" to padStyleMapOf(utsMapOf("marginTop" to -27)), "mt-28" to padStyleMapOf(utsMapOf("marginTop" to 28)), "mt--28" to padStyleMapOf(utsMapOf("marginTop" to -28)), "mt-29" to padStyleMapOf(utsMapOf("marginTop" to 29)), "mt--29" to padStyleMapOf(utsMapOf("marginTop" to -29)), "mt-30" to padStyleMapOf(utsMapOf("marginTop" to 30)), "mt--30" to padStyleMapOf(utsMapOf("marginTop" to -30)), "mt-31" to padStyleMapOf(utsMapOf("marginTop" to 31)), "mt--31" to padStyleMapOf(utsMapOf("marginTop" to -31)), "mt-32" to padStyleMapOf(utsMapOf("marginTop" to 32)), "mt--32" to padStyleMapOf(utsMapOf("marginTop" to -32)), "mt-33" to padStyleMapOf(utsMapOf("marginTop" to 33)), "mt--33" to padStyleMapOf(utsMapOf("marginTop" to -33)), "mt-34" to padStyleMapOf(utsMapOf("marginTop" to 34)), "mt--34" to padStyleMapOf(utsMapOf("marginTop" to -34)), "mt-35" to padStyleMapOf(utsMapOf("marginTop" to 35)), "mt--35" to padStyleMapOf(utsMapOf("marginTop" to -35)), "mt-36" to padStyleMapOf(utsMapOf("marginTop" to 36)), "mt--36" to padStyleMapOf(utsMapOf("marginTop" to -36)), "mt-37" to padStyleMapOf(utsMapOf("marginTop" to 37)), "mt--37" to padStyleMapOf(utsMapOf("marginTop" to -37)), "mt-38" to padStyleMapOf(utsMapOf("marginTop" to 38)), "mt--38" to padStyleMapOf(utsMapOf("marginTop" to -38)), "mt-39" to padStyleMapOf(utsMapOf("marginTop" to 39)), "mt--39" to padStyleMapOf(utsMapOf("marginTop" to -39)), "mt-40" to padStyleMapOf(utsMapOf("marginTop" to 40)), "mt--40" to padStyleMapOf(utsMapOf("marginTop" to -40)), "mt-41" to padStyleMapOf(utsMapOf("marginTop" to 41)), "mt--41" to padStyleMapOf(utsMapOf("marginTop" to -41)), "mt-42" to padStyleMapOf(utsMapOf("marginTop" to 42)), "mt--42" to padStyleMapOf(utsMapOf("marginTop" to -42)), "mt-43" to padStyleMapOf(utsMapOf("marginTop" to 43)), "mt--43" to padStyleMapOf(utsMapOf("marginTop" to -43)), "mt-44" to padStyleMapOf(utsMapOf("marginTop" to 44)), "mt--44" to padStyleMapOf(utsMapOf("marginTop" to -44)), "mt-45" to padStyleMapOf(utsMapOf("marginTop" to 45)), "mt--45" to padStyleMapOf(utsMapOf("marginTop" to -45)), "mt-46" to padStyleMapOf(utsMapOf("marginTop" to 46)), "mt--46" to padStyleMapOf(utsMapOf("marginTop" to -46)), "mt-47" to padStyleMapOf(utsMapOf("marginTop" to 47)), "mt--47" to padStyleMapOf(utsMapOf("marginTop" to -47)), "mt-48" to padStyleMapOf(utsMapOf("marginTop" to 48)), "mt--48" to padStyleMapOf(utsMapOf("marginTop" to -48)), "mt-49" to padStyleMapOf(utsMapOf("marginTop" to 49)), "mt--49" to padStyleMapOf(utsMapOf("marginTop" to -49)), "mt-50" to padStyleMapOf(utsMapOf("marginTop" to 50)), "mt--50" to padStyleMapOf(utsMapOf("marginTop" to -50)), "mt-n1" to padStyleMapOf(utsMapOf("marginTop" to 2)), "mt--n1" to padStyleMapOf(utsMapOf("marginTop" to -2)));
            }
        val styles14: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("mt-n2" to padStyleMapOf(utsMapOf("marginTop" to 4)), "mt--n2" to padStyleMapOf(utsMapOf("marginTop" to -4)), "mt-n3" to padStyleMapOf(utsMapOf("marginTop" to 6)), "mt--n3" to padStyleMapOf(utsMapOf("marginTop" to -6)), "mt-n4" to padStyleMapOf(utsMapOf("marginTop" to 8)), "mt--n4" to padStyleMapOf(utsMapOf("marginTop" to -8)), "mt-n5" to padStyleMapOf(utsMapOf("marginTop" to 10)), "mt--n5" to padStyleMapOf(utsMapOf("marginTop" to -10)), "mt-n6" to padStyleMapOf(utsMapOf("marginTop" to 12)), "mt--n6" to padStyleMapOf(utsMapOf("marginTop" to -12)), "mt-n7" to padStyleMapOf(utsMapOf("marginTop" to 14)), "mt--n7" to padStyleMapOf(utsMapOf("marginTop" to -14)), "mt-n8" to padStyleMapOf(utsMapOf("marginTop" to 16)), "mt--n8" to padStyleMapOf(utsMapOf("marginTop" to -16)), "mt-n9" to padStyleMapOf(utsMapOf("marginTop" to 18)), "mt--n9" to padStyleMapOf(utsMapOf("marginTop" to -18)), "mt-n10" to padStyleMapOf(utsMapOf("marginTop" to 20)), "mt--n10" to padStyleMapOf(utsMapOf("marginTop" to -20)), "mt-n11" to padStyleMapOf(utsMapOf("marginTop" to 22)), "mt--n11" to padStyleMapOf(utsMapOf("marginTop" to -22)), "mt-n12" to padStyleMapOf(utsMapOf("marginTop" to 24)), "mt--n12" to padStyleMapOf(utsMapOf("marginTop" to -24)), "mt-n13" to padStyleMapOf(utsMapOf("marginTop" to 26)), "mt--n13" to padStyleMapOf(utsMapOf("marginTop" to -26)), "mt-n14" to padStyleMapOf(utsMapOf("marginTop" to 28)), "mt--n14" to padStyleMapOf(utsMapOf("marginTop" to -28)), "mt-n15" to padStyleMapOf(utsMapOf("marginTop" to 30)), "mt--n15" to padStyleMapOf(utsMapOf("marginTop" to -30)), "mt-n16" to padStyleMapOf(utsMapOf("marginTop" to 32)), "mt--n16" to padStyleMapOf(utsMapOf("marginTop" to -32)), "mt-n17" to padStyleMapOf(utsMapOf("marginTop" to 34)), "mt--n17" to padStyleMapOf(utsMapOf("marginTop" to -34)), "mt-n18" to padStyleMapOf(utsMapOf("marginTop" to 36)), "mt--n18" to padStyleMapOf(utsMapOf("marginTop" to -36)), "mt-n19" to padStyleMapOf(utsMapOf("marginTop" to 38)), "mt--n19" to padStyleMapOf(utsMapOf("marginTop" to -38)), "mt-n20" to padStyleMapOf(utsMapOf("marginTop" to 40)), "mt--n20" to padStyleMapOf(utsMapOf("marginTop" to -40)), "mt-n21" to padStyleMapOf(utsMapOf("marginTop" to 42)), "mt--n21" to padStyleMapOf(utsMapOf("marginTop" to -42)), "mt-n22" to padStyleMapOf(utsMapOf("marginTop" to 44)), "mt--n22" to padStyleMapOf(utsMapOf("marginTop" to -44)), "mt-n23" to padStyleMapOf(utsMapOf("marginTop" to 46)), "mt--n23" to padStyleMapOf(utsMapOf("marginTop" to -46)), "mt-n24" to padStyleMapOf(utsMapOf("marginTop" to 48)), "mt--n24" to padStyleMapOf(utsMapOf("marginTop" to -48)), "mt-n25" to padStyleMapOf(utsMapOf("marginTop" to 50)), "mt--n25" to padStyleMapOf(utsMapOf("marginTop" to -50)), "mr-0" to padStyleMapOf(utsMapOf("marginRight" to 0)), "mr--0" to padStyleMapOf(utsMapOf("marginRight" to 0)), "mr-1" to padStyleMapOf(utsMapOf("marginRight" to 1)), "mr--1" to padStyleMapOf(utsMapOf("marginRight" to -1)), "mr-2" to padStyleMapOf(utsMapOf("marginRight" to 2)), "mr--2" to padStyleMapOf(utsMapOf("marginRight" to -2)), "mr-3" to padStyleMapOf(utsMapOf("marginRight" to 3)), "mr--3" to padStyleMapOf(utsMapOf("marginRight" to -3)), "mr-4" to padStyleMapOf(utsMapOf("marginRight" to 4)), "mr--4" to padStyleMapOf(utsMapOf("marginRight" to -4)), "mr-5" to padStyleMapOf(utsMapOf("marginRight" to 5)), "mr--5" to padStyleMapOf(utsMapOf("marginRight" to -5)), "mr-6" to padStyleMapOf(utsMapOf("marginRight" to 6)), "mr--6" to padStyleMapOf(utsMapOf("marginRight" to -6)), "mr-7" to padStyleMapOf(utsMapOf("marginRight" to 7)), "mr--7" to padStyleMapOf(utsMapOf("marginRight" to -7)), "mr-8" to padStyleMapOf(utsMapOf("marginRight" to 8)), "mr--8" to padStyleMapOf(utsMapOf("marginRight" to -8)), "mr-9" to padStyleMapOf(utsMapOf("marginRight" to 9)), "mr--9" to padStyleMapOf(utsMapOf("marginRight" to -9)), "mr-10" to padStyleMapOf(utsMapOf("marginRight" to 10)), "mr--10" to padStyleMapOf(utsMapOf("marginRight" to -10)), "mr-11" to padStyleMapOf(utsMapOf("marginRight" to 11)), "mr--11" to padStyleMapOf(utsMapOf("marginRight" to -11)), "mr-12" to padStyleMapOf(utsMapOf("marginRight" to 12)), "mr--12" to padStyleMapOf(utsMapOf("marginRight" to -12)), "mr-13" to padStyleMapOf(utsMapOf("marginRight" to 13)), "mr--13" to padStyleMapOf(utsMapOf("marginRight" to -13)), "mr-14" to padStyleMapOf(utsMapOf("marginRight" to 14)), "mr--14" to padStyleMapOf(utsMapOf("marginRight" to -14)), "mr-15" to padStyleMapOf(utsMapOf("marginRight" to 15)), "mr--15" to padStyleMapOf(utsMapOf("marginRight" to -15)), "mr-16" to padStyleMapOf(utsMapOf("marginRight" to 16)), "mr--16" to padStyleMapOf(utsMapOf("marginRight" to -16)), "mr-17" to padStyleMapOf(utsMapOf("marginRight" to 17)), "mr--17" to padStyleMapOf(utsMapOf("marginRight" to -17)), "mr-18" to padStyleMapOf(utsMapOf("marginRight" to 18)), "mr--18" to padStyleMapOf(utsMapOf("marginRight" to -18)), "mr-19" to padStyleMapOf(utsMapOf("marginRight" to 19)), "mr--19" to padStyleMapOf(utsMapOf("marginRight" to -19)), "mr-20" to padStyleMapOf(utsMapOf("marginRight" to 20)), "mr--20" to padStyleMapOf(utsMapOf("marginRight" to -20)), "mr-21" to padStyleMapOf(utsMapOf("marginRight" to 21)), "mr--21" to padStyleMapOf(utsMapOf("marginRight" to -21)), "mr-22" to padStyleMapOf(utsMapOf("marginRight" to 22)), "mr--22" to padStyleMapOf(utsMapOf("marginRight" to -22)), "mr-23" to padStyleMapOf(utsMapOf("marginRight" to 23)), "mr--23" to padStyleMapOf(utsMapOf("marginRight" to -23)), "mr-24" to padStyleMapOf(utsMapOf("marginRight" to 24)), "mr--24" to padStyleMapOf(utsMapOf("marginRight" to -24)), "mr-25" to padStyleMapOf(utsMapOf("marginRight" to 25)), "mr--25" to padStyleMapOf(utsMapOf("marginRight" to -25)));
            }
        val styles15: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("mr-26" to padStyleMapOf(utsMapOf("marginRight" to 26)), "mr--26" to padStyleMapOf(utsMapOf("marginRight" to -26)), "mr-27" to padStyleMapOf(utsMapOf("marginRight" to 27)), "mr--27" to padStyleMapOf(utsMapOf("marginRight" to -27)), "mr-28" to padStyleMapOf(utsMapOf("marginRight" to 28)), "mr--28" to padStyleMapOf(utsMapOf("marginRight" to -28)), "mr-29" to padStyleMapOf(utsMapOf("marginRight" to 29)), "mr--29" to padStyleMapOf(utsMapOf("marginRight" to -29)), "mr-30" to padStyleMapOf(utsMapOf("marginRight" to 30)), "mr--30" to padStyleMapOf(utsMapOf("marginRight" to -30)), "mr-31" to padStyleMapOf(utsMapOf("marginRight" to 31)), "mr--31" to padStyleMapOf(utsMapOf("marginRight" to -31)), "mr-32" to padStyleMapOf(utsMapOf("marginRight" to 32)), "mr--32" to padStyleMapOf(utsMapOf("marginRight" to -32)), "mr-33" to padStyleMapOf(utsMapOf("marginRight" to 33)), "mr--33" to padStyleMapOf(utsMapOf("marginRight" to -33)), "mr-34" to padStyleMapOf(utsMapOf("marginRight" to 34)), "mr--34" to padStyleMapOf(utsMapOf("marginRight" to -34)), "mr-35" to padStyleMapOf(utsMapOf("marginRight" to 35)), "mr--35" to padStyleMapOf(utsMapOf("marginRight" to -35)), "mr-36" to padStyleMapOf(utsMapOf("marginRight" to 36)), "mr--36" to padStyleMapOf(utsMapOf("marginRight" to -36)), "mr-37" to padStyleMapOf(utsMapOf("marginRight" to 37)), "mr--37" to padStyleMapOf(utsMapOf("marginRight" to -37)), "mr-38" to padStyleMapOf(utsMapOf("marginRight" to 38)), "mr--38" to padStyleMapOf(utsMapOf("marginRight" to -38)), "mr-39" to padStyleMapOf(utsMapOf("marginRight" to 39)), "mr--39" to padStyleMapOf(utsMapOf("marginRight" to -39)), "mr-40" to padStyleMapOf(utsMapOf("marginRight" to 40)), "mr--40" to padStyleMapOf(utsMapOf("marginRight" to -40)), "mr-41" to padStyleMapOf(utsMapOf("marginRight" to 41)), "mr--41" to padStyleMapOf(utsMapOf("marginRight" to -41)), "mr-42" to padStyleMapOf(utsMapOf("marginRight" to 42)), "mr--42" to padStyleMapOf(utsMapOf("marginRight" to -42)), "mr-43" to padStyleMapOf(utsMapOf("marginRight" to 43)), "mr--43" to padStyleMapOf(utsMapOf("marginRight" to -43)), "mr-44" to padStyleMapOf(utsMapOf("marginRight" to 44)), "mr--44" to padStyleMapOf(utsMapOf("marginRight" to -44)), "mr-45" to padStyleMapOf(utsMapOf("marginRight" to 45)), "mr--45" to padStyleMapOf(utsMapOf("marginRight" to -45)), "mr-46" to padStyleMapOf(utsMapOf("marginRight" to 46)), "mr--46" to padStyleMapOf(utsMapOf("marginRight" to -46)), "mr-47" to padStyleMapOf(utsMapOf("marginRight" to 47)), "mr--47" to padStyleMapOf(utsMapOf("marginRight" to -47)), "mr-48" to padStyleMapOf(utsMapOf("marginRight" to 48)), "mr--48" to padStyleMapOf(utsMapOf("marginRight" to -48)), "mr-49" to padStyleMapOf(utsMapOf("marginRight" to 49)), "mr--49" to padStyleMapOf(utsMapOf("marginRight" to -49)), "mr-50" to padStyleMapOf(utsMapOf("marginRight" to 50)), "mr--50" to padStyleMapOf(utsMapOf("marginRight" to -50)), "mr-n1" to padStyleMapOf(utsMapOf("marginRight" to 2)), "mr--n1" to padStyleMapOf(utsMapOf("marginRight" to -2)), "mr-n2" to padStyleMapOf(utsMapOf("marginRight" to 4)), "mr--n2" to padStyleMapOf(utsMapOf("marginRight" to -4)), "mr-n3" to padStyleMapOf(utsMapOf("marginRight" to 6)), "mr--n3" to padStyleMapOf(utsMapOf("marginRight" to -6)), "mr-n4" to padStyleMapOf(utsMapOf("marginRight" to 8)), "mr--n4" to padStyleMapOf(utsMapOf("marginRight" to -8)), "mr-n5" to padStyleMapOf(utsMapOf("marginRight" to 10)), "mr--n5" to padStyleMapOf(utsMapOf("marginRight" to -10)), "mr-n6" to padStyleMapOf(utsMapOf("marginRight" to 12)), "mr--n6" to padStyleMapOf(utsMapOf("marginRight" to -12)), "mr-n7" to padStyleMapOf(utsMapOf("marginRight" to 14)), "mr--n7" to padStyleMapOf(utsMapOf("marginRight" to -14)), "mr-n8" to padStyleMapOf(utsMapOf("marginRight" to 16)), "mr--n8" to padStyleMapOf(utsMapOf("marginRight" to -16)), "mr-n9" to padStyleMapOf(utsMapOf("marginRight" to 18)), "mr--n9" to padStyleMapOf(utsMapOf("marginRight" to -18)), "mr-n10" to padStyleMapOf(utsMapOf("marginRight" to 20)), "mr--n10" to padStyleMapOf(utsMapOf("marginRight" to -20)), "mr-n11" to padStyleMapOf(utsMapOf("marginRight" to 22)), "mr--n11" to padStyleMapOf(utsMapOf("marginRight" to -22)), "mr-n12" to padStyleMapOf(utsMapOf("marginRight" to 24)), "mr--n12" to padStyleMapOf(utsMapOf("marginRight" to -24)), "mr-n13" to padStyleMapOf(utsMapOf("marginRight" to 26)), "mr--n13" to padStyleMapOf(utsMapOf("marginRight" to -26)), "mr-n14" to padStyleMapOf(utsMapOf("marginRight" to 28)), "mr--n14" to padStyleMapOf(utsMapOf("marginRight" to -28)), "mr-n15" to padStyleMapOf(utsMapOf("marginRight" to 30)), "mr--n15" to padStyleMapOf(utsMapOf("marginRight" to -30)), "mr-n16" to padStyleMapOf(utsMapOf("marginRight" to 32)), "mr--n16" to padStyleMapOf(utsMapOf("marginRight" to -32)), "mr-n17" to padStyleMapOf(utsMapOf("marginRight" to 34)), "mr--n17" to padStyleMapOf(utsMapOf("marginRight" to -34)), "mr-n18" to padStyleMapOf(utsMapOf("marginRight" to 36)), "mr--n18" to padStyleMapOf(utsMapOf("marginRight" to -36)), "mr-n19" to padStyleMapOf(utsMapOf("marginRight" to 38)), "mr--n19" to padStyleMapOf(utsMapOf("marginRight" to -38)), "mr-n20" to padStyleMapOf(utsMapOf("marginRight" to 40)), "mr--n20" to padStyleMapOf(utsMapOf("marginRight" to -40)), "mr-n21" to padStyleMapOf(utsMapOf("marginRight" to 42)), "mr--n21" to padStyleMapOf(utsMapOf("marginRight" to -42)), "mr-n22" to padStyleMapOf(utsMapOf("marginRight" to 44)), "mr--n22" to padStyleMapOf(utsMapOf("marginRight" to -44)), "mr-n23" to padStyleMapOf(utsMapOf("marginRight" to 46)), "mr--n23" to padStyleMapOf(utsMapOf("marginRight" to -46)), "mr-n24" to padStyleMapOf(utsMapOf("marginRight" to 48)), "mr--n24" to padStyleMapOf(utsMapOf("marginRight" to -48)), "mr-n25" to padStyleMapOf(utsMapOf("marginRight" to 50)), "mr--n25" to padStyleMapOf(utsMapOf("marginRight" to -50)));
            }
        val styles16: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("mb-0" to padStyleMapOf(utsMapOf("marginBottom" to 0)), "mb--0" to padStyleMapOf(utsMapOf("marginBottom" to 0)), "mb-1" to padStyleMapOf(utsMapOf("marginBottom" to 1)), "mb--1" to padStyleMapOf(utsMapOf("marginBottom" to -1)), "mb-2" to padStyleMapOf(utsMapOf("marginBottom" to 2)), "mb--2" to padStyleMapOf(utsMapOf("marginBottom" to -2)), "mb-3" to padStyleMapOf(utsMapOf("marginBottom" to 3)), "mb--3" to padStyleMapOf(utsMapOf("marginBottom" to -3)), "mb-4" to padStyleMapOf(utsMapOf("marginBottom" to 4)), "mb--4" to padStyleMapOf(utsMapOf("marginBottom" to -4)), "mb-5" to padStyleMapOf(utsMapOf("marginBottom" to 5)), "mb--5" to padStyleMapOf(utsMapOf("marginBottom" to -5)), "mb-6" to padStyleMapOf(utsMapOf("marginBottom" to 6)), "mb--6" to padStyleMapOf(utsMapOf("marginBottom" to -6)), "mb-7" to padStyleMapOf(utsMapOf("marginBottom" to 7)), "mb--7" to padStyleMapOf(utsMapOf("marginBottom" to -7)), "mb-8" to padStyleMapOf(utsMapOf("marginBottom" to 8)), "mb--8" to padStyleMapOf(utsMapOf("marginBottom" to -8)), "mb-9" to padStyleMapOf(utsMapOf("marginBottom" to 9)), "mb--9" to padStyleMapOf(utsMapOf("marginBottom" to -9)), "mb-10" to padStyleMapOf(utsMapOf("marginBottom" to 10)), "mb--10" to padStyleMapOf(utsMapOf("marginBottom" to -10)), "mb-11" to padStyleMapOf(utsMapOf("marginBottom" to 11)), "mb--11" to padStyleMapOf(utsMapOf("marginBottom" to -11)), "mb-12" to padStyleMapOf(utsMapOf("marginBottom" to 12)), "mb--12" to padStyleMapOf(utsMapOf("marginBottom" to -12)), "mb-13" to padStyleMapOf(utsMapOf("marginBottom" to 13)), "mb--13" to padStyleMapOf(utsMapOf("marginBottom" to -13)), "mb-14" to padStyleMapOf(utsMapOf("marginBottom" to 14)), "mb--14" to padStyleMapOf(utsMapOf("marginBottom" to -14)), "mb-15" to padStyleMapOf(utsMapOf("marginBottom" to 15)), "mb--15" to padStyleMapOf(utsMapOf("marginBottom" to -15)), "mb-16" to padStyleMapOf(utsMapOf("marginBottom" to 16)), "mb--16" to padStyleMapOf(utsMapOf("marginBottom" to -16)), "mb-17" to padStyleMapOf(utsMapOf("marginBottom" to 17)), "mb--17" to padStyleMapOf(utsMapOf("marginBottom" to -17)), "mb-18" to padStyleMapOf(utsMapOf("marginBottom" to 18)), "mb--18" to padStyleMapOf(utsMapOf("marginBottom" to -18)), "mb-19" to padStyleMapOf(utsMapOf("marginBottom" to 19)), "mb--19" to padStyleMapOf(utsMapOf("marginBottom" to -19)), "mb-20" to padStyleMapOf(utsMapOf("marginBottom" to 20)), "mb--20" to padStyleMapOf(utsMapOf("marginBottom" to -20)), "mb-21" to padStyleMapOf(utsMapOf("marginBottom" to 21)), "mb--21" to padStyleMapOf(utsMapOf("marginBottom" to -21)), "mb-22" to padStyleMapOf(utsMapOf("marginBottom" to 22)), "mb--22" to padStyleMapOf(utsMapOf("marginBottom" to -22)), "mb-23" to padStyleMapOf(utsMapOf("marginBottom" to 23)), "mb--23" to padStyleMapOf(utsMapOf("marginBottom" to -23)), "mb-24" to padStyleMapOf(utsMapOf("marginBottom" to 24)), "mb--24" to padStyleMapOf(utsMapOf("marginBottom" to -24)), "mb-25" to padStyleMapOf(utsMapOf("marginBottom" to 25)), "mb--25" to padStyleMapOf(utsMapOf("marginBottom" to -25)), "mb-26" to padStyleMapOf(utsMapOf("marginBottom" to 26)), "mb--26" to padStyleMapOf(utsMapOf("marginBottom" to -26)), "mb-27" to padStyleMapOf(utsMapOf("marginBottom" to 27)), "mb--27" to padStyleMapOf(utsMapOf("marginBottom" to -27)), "mb-28" to padStyleMapOf(utsMapOf("marginBottom" to 28)), "mb--28" to padStyleMapOf(utsMapOf("marginBottom" to -28)), "mb-29" to padStyleMapOf(utsMapOf("marginBottom" to 29)), "mb--29" to padStyleMapOf(utsMapOf("marginBottom" to -29)), "mb-30" to padStyleMapOf(utsMapOf("marginBottom" to 30)), "mb--30" to padStyleMapOf(utsMapOf("marginBottom" to -30)), "mb-31" to padStyleMapOf(utsMapOf("marginBottom" to 31)), "mb--31" to padStyleMapOf(utsMapOf("marginBottom" to -31)), "mb-32" to padStyleMapOf(utsMapOf("marginBottom" to 32)), "mb--32" to padStyleMapOf(utsMapOf("marginBottom" to -32)), "mb-33" to padStyleMapOf(utsMapOf("marginBottom" to 33)), "mb--33" to padStyleMapOf(utsMapOf("marginBottom" to -33)), "mb-34" to padStyleMapOf(utsMapOf("marginBottom" to 34)), "mb--34" to padStyleMapOf(utsMapOf("marginBottom" to -34)), "mb-35" to padStyleMapOf(utsMapOf("marginBottom" to 35)), "mb--35" to padStyleMapOf(utsMapOf("marginBottom" to -35)), "mb-36" to padStyleMapOf(utsMapOf("marginBottom" to 36)), "mb--36" to padStyleMapOf(utsMapOf("marginBottom" to -36)), "mb-37" to padStyleMapOf(utsMapOf("marginBottom" to 37)), "mb--37" to padStyleMapOf(utsMapOf("marginBottom" to -37)), "mb-38" to padStyleMapOf(utsMapOf("marginBottom" to 38)), "mb--38" to padStyleMapOf(utsMapOf("marginBottom" to -38)), "mb-39" to padStyleMapOf(utsMapOf("marginBottom" to 39)), "mb--39" to padStyleMapOf(utsMapOf("marginBottom" to -39)), "mb-40" to padStyleMapOf(utsMapOf("marginBottom" to 40)), "mb--40" to padStyleMapOf(utsMapOf("marginBottom" to -40)), "mb-41" to padStyleMapOf(utsMapOf("marginBottom" to 41)), "mb--41" to padStyleMapOf(utsMapOf("marginBottom" to -41)), "mb-42" to padStyleMapOf(utsMapOf("marginBottom" to 42)), "mb--42" to padStyleMapOf(utsMapOf("marginBottom" to -42)), "mb-43" to padStyleMapOf(utsMapOf("marginBottom" to 43)), "mb--43" to padStyleMapOf(utsMapOf("marginBottom" to -43)), "mb-44" to padStyleMapOf(utsMapOf("marginBottom" to 44)), "mb--44" to padStyleMapOf(utsMapOf("marginBottom" to -44)), "mb-45" to padStyleMapOf(utsMapOf("marginBottom" to 45)), "mb--45" to padStyleMapOf(utsMapOf("marginBottom" to -45)), "mb-46" to padStyleMapOf(utsMapOf("marginBottom" to 46)), "mb--46" to padStyleMapOf(utsMapOf("marginBottom" to -46)), "mb-47" to padStyleMapOf(utsMapOf("marginBottom" to 47)), "mb--47" to padStyleMapOf(utsMapOf("marginBottom" to -47)), "mb-48" to padStyleMapOf(utsMapOf("marginBottom" to 48)), "mb--48" to padStyleMapOf(utsMapOf("marginBottom" to -48)), "mb-49" to padStyleMapOf(utsMapOf("marginBottom" to 49)), "mb--49" to padStyleMapOf(utsMapOf("marginBottom" to -49)));
            }
        val styles17: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("mb-50" to padStyleMapOf(utsMapOf("marginBottom" to 50)), "mb--50" to padStyleMapOf(utsMapOf("marginBottom" to -50)), "mb-n1" to padStyleMapOf(utsMapOf("marginBottom" to 2)), "mb--n1" to padStyleMapOf(utsMapOf("marginBottom" to -2)), "mb-n2" to padStyleMapOf(utsMapOf("marginBottom" to 4)), "mb--n2" to padStyleMapOf(utsMapOf("marginBottom" to -4)), "mb-n3" to padStyleMapOf(utsMapOf("marginBottom" to 6)), "mb--n3" to padStyleMapOf(utsMapOf("marginBottom" to -6)), "mb-n4" to padStyleMapOf(utsMapOf("marginBottom" to 8)), "mb--n4" to padStyleMapOf(utsMapOf("marginBottom" to -8)), "mb-n5" to padStyleMapOf(utsMapOf("marginBottom" to 10)), "mb--n5" to padStyleMapOf(utsMapOf("marginBottom" to -10)), "mb-n6" to padStyleMapOf(utsMapOf("marginBottom" to 12)), "mb--n6" to padStyleMapOf(utsMapOf("marginBottom" to -12)), "mb-n7" to padStyleMapOf(utsMapOf("marginBottom" to 14)), "mb--n7" to padStyleMapOf(utsMapOf("marginBottom" to -14)), "mb-n8" to padStyleMapOf(utsMapOf("marginBottom" to 16)), "mb--n8" to padStyleMapOf(utsMapOf("marginBottom" to -16)), "mb-n9" to padStyleMapOf(utsMapOf("marginBottom" to 18)), "mb--n9" to padStyleMapOf(utsMapOf("marginBottom" to -18)), "mb-n10" to padStyleMapOf(utsMapOf("marginBottom" to 20)), "mb--n10" to padStyleMapOf(utsMapOf("marginBottom" to -20)), "mb-n11" to padStyleMapOf(utsMapOf("marginBottom" to 22)), "mb--n11" to padStyleMapOf(utsMapOf("marginBottom" to -22)), "mb-n12" to padStyleMapOf(utsMapOf("marginBottom" to 24)), "mb--n12" to padStyleMapOf(utsMapOf("marginBottom" to -24)), "mb-n13" to padStyleMapOf(utsMapOf("marginBottom" to 26)), "mb--n13" to padStyleMapOf(utsMapOf("marginBottom" to -26)), "mb-n14" to padStyleMapOf(utsMapOf("marginBottom" to 28)), "mb--n14" to padStyleMapOf(utsMapOf("marginBottom" to -28)), "mb-n15" to padStyleMapOf(utsMapOf("marginBottom" to 30)), "mb--n15" to padStyleMapOf(utsMapOf("marginBottom" to -30)), "mb-n16" to padStyleMapOf(utsMapOf("marginBottom" to 32)), "mb--n16" to padStyleMapOf(utsMapOf("marginBottom" to -32)), "mb-n17" to padStyleMapOf(utsMapOf("marginBottom" to 34)), "mb--n17" to padStyleMapOf(utsMapOf("marginBottom" to -34)), "mb-n18" to padStyleMapOf(utsMapOf("marginBottom" to 36)), "mb--n18" to padStyleMapOf(utsMapOf("marginBottom" to -36)), "mb-n19" to padStyleMapOf(utsMapOf("marginBottom" to 38)), "mb--n19" to padStyleMapOf(utsMapOf("marginBottom" to -38)), "mb-n20" to padStyleMapOf(utsMapOf("marginBottom" to 40)), "mb--n20" to padStyleMapOf(utsMapOf("marginBottom" to -40)), "mb-n21" to padStyleMapOf(utsMapOf("marginBottom" to 42)), "mb--n21" to padStyleMapOf(utsMapOf("marginBottom" to -42)), "mb-n22" to padStyleMapOf(utsMapOf("marginBottom" to 44)), "mb--n22" to padStyleMapOf(utsMapOf("marginBottom" to -44)), "mb-n23" to padStyleMapOf(utsMapOf("marginBottom" to 46)), "mb--n23" to padStyleMapOf(utsMapOf("marginBottom" to -46)), "mb-n24" to padStyleMapOf(utsMapOf("marginBottom" to 48)), "mb--n24" to padStyleMapOf(utsMapOf("marginBottom" to -48)), "mb-n25" to padStyleMapOf(utsMapOf("marginBottom" to 50)), "mb--n25" to padStyleMapOf(utsMapOf("marginBottom" to -50)), "ml-0" to padStyleMapOf(utsMapOf("marginLeft" to 0)), "ml--0" to padStyleMapOf(utsMapOf("marginLeft" to 0)), "ml-1" to padStyleMapOf(utsMapOf("marginLeft" to 1)), "ml--1" to padStyleMapOf(utsMapOf("marginLeft" to -1)), "ml-2" to padStyleMapOf(utsMapOf("marginLeft" to 2)), "ml--2" to padStyleMapOf(utsMapOf("marginLeft" to -2)), "ml-3" to padStyleMapOf(utsMapOf("marginLeft" to 3)), "ml--3" to padStyleMapOf(utsMapOf("marginLeft" to -3)), "ml-4" to padStyleMapOf(utsMapOf("marginLeft" to 4)), "ml--4" to padStyleMapOf(utsMapOf("marginLeft" to -4)), "ml-5" to padStyleMapOf(utsMapOf("marginLeft" to 5)), "ml--5" to padStyleMapOf(utsMapOf("marginLeft" to -5)), "ml-6" to padStyleMapOf(utsMapOf("marginLeft" to 6)), "ml--6" to padStyleMapOf(utsMapOf("marginLeft" to -6)), "ml-7" to padStyleMapOf(utsMapOf("marginLeft" to 7)), "ml--7" to padStyleMapOf(utsMapOf("marginLeft" to -7)), "ml-8" to padStyleMapOf(utsMapOf("marginLeft" to 8)), "ml--8" to padStyleMapOf(utsMapOf("marginLeft" to -8)), "ml-9" to padStyleMapOf(utsMapOf("marginLeft" to 9)), "ml--9" to padStyleMapOf(utsMapOf("marginLeft" to -9)), "ml-10" to padStyleMapOf(utsMapOf("marginLeft" to 10)), "ml--10" to padStyleMapOf(utsMapOf("marginLeft" to -10)), "ml-11" to padStyleMapOf(utsMapOf("marginLeft" to 11)), "ml--11" to padStyleMapOf(utsMapOf("marginLeft" to -11)), "ml-12" to padStyleMapOf(utsMapOf("marginLeft" to 12)), "ml--12" to padStyleMapOf(utsMapOf("marginLeft" to -12)), "ml-13" to padStyleMapOf(utsMapOf("marginLeft" to 13)), "ml--13" to padStyleMapOf(utsMapOf("marginLeft" to -13)), "ml-14" to padStyleMapOf(utsMapOf("marginLeft" to 14)), "ml--14" to padStyleMapOf(utsMapOf("marginLeft" to -14)), "ml-15" to padStyleMapOf(utsMapOf("marginLeft" to 15)), "ml--15" to padStyleMapOf(utsMapOf("marginLeft" to -15)), "ml-16" to padStyleMapOf(utsMapOf("marginLeft" to 16)), "ml--16" to padStyleMapOf(utsMapOf("marginLeft" to -16)), "ml-17" to padStyleMapOf(utsMapOf("marginLeft" to 17)), "ml--17" to padStyleMapOf(utsMapOf("marginLeft" to -17)), "ml-18" to padStyleMapOf(utsMapOf("marginLeft" to 18)), "ml--18" to padStyleMapOf(utsMapOf("marginLeft" to -18)), "ml-19" to padStyleMapOf(utsMapOf("marginLeft" to 19)), "ml--19" to padStyleMapOf(utsMapOf("marginLeft" to -19)), "ml-20" to padStyleMapOf(utsMapOf("marginLeft" to 20)), "ml--20" to padStyleMapOf(utsMapOf("marginLeft" to -20)), "ml-21" to padStyleMapOf(utsMapOf("marginLeft" to 21)), "ml--21" to padStyleMapOf(utsMapOf("marginLeft" to -21)), "ml-22" to padStyleMapOf(utsMapOf("marginLeft" to 22)), "ml--22" to padStyleMapOf(utsMapOf("marginLeft" to -22)), "ml-23" to padStyleMapOf(utsMapOf("marginLeft" to 23)), "ml--23" to padStyleMapOf(utsMapOf("marginLeft" to -23)));
            }
        val styles18: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("ml-24" to padStyleMapOf(utsMapOf("marginLeft" to 24)), "ml--24" to padStyleMapOf(utsMapOf("marginLeft" to -24)), "ml-25" to padStyleMapOf(utsMapOf("marginLeft" to 25)), "ml--25" to padStyleMapOf(utsMapOf("marginLeft" to -25)), "ml-26" to padStyleMapOf(utsMapOf("marginLeft" to 26)), "ml--26" to padStyleMapOf(utsMapOf("marginLeft" to -26)), "ml-27" to padStyleMapOf(utsMapOf("marginLeft" to 27)), "ml--27" to padStyleMapOf(utsMapOf("marginLeft" to -27)), "ml-28" to padStyleMapOf(utsMapOf("marginLeft" to 28)), "ml--28" to padStyleMapOf(utsMapOf("marginLeft" to -28)), "ml-29" to padStyleMapOf(utsMapOf("marginLeft" to 29)), "ml--29" to padStyleMapOf(utsMapOf("marginLeft" to -29)), "ml-30" to padStyleMapOf(utsMapOf("marginLeft" to 30)), "ml--30" to padStyleMapOf(utsMapOf("marginLeft" to -30)), "ml-31" to padStyleMapOf(utsMapOf("marginLeft" to 31)), "ml--31" to padStyleMapOf(utsMapOf("marginLeft" to -31)), "ml-32" to padStyleMapOf(utsMapOf("marginLeft" to 32)), "ml--32" to padStyleMapOf(utsMapOf("marginLeft" to -32)), "ml-33" to padStyleMapOf(utsMapOf("marginLeft" to 33)), "ml--33" to padStyleMapOf(utsMapOf("marginLeft" to -33)), "ml-34" to padStyleMapOf(utsMapOf("marginLeft" to 34)), "ml--34" to padStyleMapOf(utsMapOf("marginLeft" to -34)), "ml-35" to padStyleMapOf(utsMapOf("marginLeft" to 35)), "ml--35" to padStyleMapOf(utsMapOf("marginLeft" to -35)), "ml-36" to padStyleMapOf(utsMapOf("marginLeft" to 36)), "ml--36" to padStyleMapOf(utsMapOf("marginLeft" to -36)), "ml-37" to padStyleMapOf(utsMapOf("marginLeft" to 37)), "ml--37" to padStyleMapOf(utsMapOf("marginLeft" to -37)), "ml-38" to padStyleMapOf(utsMapOf("marginLeft" to 38)), "ml--38" to padStyleMapOf(utsMapOf("marginLeft" to -38)), "ml-39" to padStyleMapOf(utsMapOf("marginLeft" to 39)), "ml--39" to padStyleMapOf(utsMapOf("marginLeft" to -39)), "ml-40" to padStyleMapOf(utsMapOf("marginLeft" to 40)), "ml--40" to padStyleMapOf(utsMapOf("marginLeft" to -40)), "ml-41" to padStyleMapOf(utsMapOf("marginLeft" to 41)), "ml--41" to padStyleMapOf(utsMapOf("marginLeft" to -41)), "ml-42" to padStyleMapOf(utsMapOf("marginLeft" to 42)), "ml--42" to padStyleMapOf(utsMapOf("marginLeft" to -42)), "ml-43" to padStyleMapOf(utsMapOf("marginLeft" to 43)), "ml--43" to padStyleMapOf(utsMapOf("marginLeft" to -43)), "ml-44" to padStyleMapOf(utsMapOf("marginLeft" to 44)), "ml--44" to padStyleMapOf(utsMapOf("marginLeft" to -44)), "ml-45" to padStyleMapOf(utsMapOf("marginLeft" to 45)), "ml--45" to padStyleMapOf(utsMapOf("marginLeft" to -45)), "ml-46" to padStyleMapOf(utsMapOf("marginLeft" to 46)), "ml--46" to padStyleMapOf(utsMapOf("marginLeft" to -46)), "ml-47" to padStyleMapOf(utsMapOf("marginLeft" to 47)), "ml--47" to padStyleMapOf(utsMapOf("marginLeft" to -47)), "ml-48" to padStyleMapOf(utsMapOf("marginLeft" to 48)), "ml--48" to padStyleMapOf(utsMapOf("marginLeft" to -48)), "ml-49" to padStyleMapOf(utsMapOf("marginLeft" to 49)), "ml--49" to padStyleMapOf(utsMapOf("marginLeft" to -49)), "ml-50" to padStyleMapOf(utsMapOf("marginLeft" to 50)), "ml--50" to padStyleMapOf(utsMapOf("marginLeft" to -50)), "ml-n1" to padStyleMapOf(utsMapOf("marginLeft" to 2)), "ml--n1" to padStyleMapOf(utsMapOf("marginLeft" to -2)), "ml-n2" to padStyleMapOf(utsMapOf("marginLeft" to 4)), "ml--n2" to padStyleMapOf(utsMapOf("marginLeft" to -4)), "ml-n3" to padStyleMapOf(utsMapOf("marginLeft" to 6)), "ml--n3" to padStyleMapOf(utsMapOf("marginLeft" to -6)), "ml-n4" to padStyleMapOf(utsMapOf("marginLeft" to 8)), "ml--n4" to padStyleMapOf(utsMapOf("marginLeft" to -8)), "ml-n5" to padStyleMapOf(utsMapOf("marginLeft" to 10)), "ml--n5" to padStyleMapOf(utsMapOf("marginLeft" to -10)), "ml-n6" to padStyleMapOf(utsMapOf("marginLeft" to 12)), "ml--n6" to padStyleMapOf(utsMapOf("marginLeft" to -12)), "ml-n7" to padStyleMapOf(utsMapOf("marginLeft" to 14)), "ml--n7" to padStyleMapOf(utsMapOf("marginLeft" to -14)), "ml-n8" to padStyleMapOf(utsMapOf("marginLeft" to 16)), "ml--n8" to padStyleMapOf(utsMapOf("marginLeft" to -16)), "ml-n9" to padStyleMapOf(utsMapOf("marginLeft" to 18)), "ml--n9" to padStyleMapOf(utsMapOf("marginLeft" to -18)), "ml-n10" to padStyleMapOf(utsMapOf("marginLeft" to 20)), "ml--n10" to padStyleMapOf(utsMapOf("marginLeft" to -20)), "ml-n11" to padStyleMapOf(utsMapOf("marginLeft" to 22)), "ml--n11" to padStyleMapOf(utsMapOf("marginLeft" to -22)), "ml-n12" to padStyleMapOf(utsMapOf("marginLeft" to 24)), "ml--n12" to padStyleMapOf(utsMapOf("marginLeft" to -24)), "ml-n13" to padStyleMapOf(utsMapOf("marginLeft" to 26)), "ml--n13" to padStyleMapOf(utsMapOf("marginLeft" to -26)), "ml-n14" to padStyleMapOf(utsMapOf("marginLeft" to 28)), "ml--n14" to padStyleMapOf(utsMapOf("marginLeft" to -28)), "ml-n15" to padStyleMapOf(utsMapOf("marginLeft" to 30)), "ml--n15" to padStyleMapOf(utsMapOf("marginLeft" to -30)), "ml-n16" to padStyleMapOf(utsMapOf("marginLeft" to 32)), "ml--n16" to padStyleMapOf(utsMapOf("marginLeft" to -32)), "ml-n17" to padStyleMapOf(utsMapOf("marginLeft" to 34)), "ml--n17" to padStyleMapOf(utsMapOf("marginLeft" to -34)), "ml-n18" to padStyleMapOf(utsMapOf("marginLeft" to 36)), "ml--n18" to padStyleMapOf(utsMapOf("marginLeft" to -36)), "ml-n19" to padStyleMapOf(utsMapOf("marginLeft" to 38)), "ml--n19" to padStyleMapOf(utsMapOf("marginLeft" to -38)), "ml-n20" to padStyleMapOf(utsMapOf("marginLeft" to 40)), "ml--n20" to padStyleMapOf(utsMapOf("marginLeft" to -40)), "ml-n21" to padStyleMapOf(utsMapOf("marginLeft" to 42)), "ml--n21" to padStyleMapOf(utsMapOf("marginLeft" to -42)), "ml-n22" to padStyleMapOf(utsMapOf("marginLeft" to 44)), "ml--n22" to padStyleMapOf(utsMapOf("marginLeft" to -44)), "ml-n23" to padStyleMapOf(utsMapOf("marginLeft" to 46)), "ml--n23" to padStyleMapOf(utsMapOf("marginLeft" to -46)));
            }
        val styles19: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("ml-n24" to padStyleMapOf(utsMapOf("marginLeft" to 48)), "ml--n24" to padStyleMapOf(utsMapOf("marginLeft" to -48)), "ml-n25" to padStyleMapOf(utsMapOf("marginLeft" to 50)), "ml--n25" to padStyleMapOf(utsMapOf("marginLeft" to -50)), "mx-0" to padStyleMapOf(utsMapOf("marginLeft" to 0, "marginRight" to 0)), "mx-1" to padStyleMapOf(utsMapOf("marginLeft" to 1, "marginRight" to 1)), "mx-2" to padStyleMapOf(utsMapOf("marginLeft" to 2, "marginRight" to 2)), "mx-3" to padStyleMapOf(utsMapOf("marginLeft" to 3, "marginRight" to 3)), "mx-4" to padStyleMapOf(utsMapOf("marginLeft" to 4, "marginRight" to 4)), "mx-5" to padStyleMapOf(utsMapOf("marginLeft" to 5, "marginRight" to 5)), "mx-6" to padStyleMapOf(utsMapOf("marginLeft" to 6, "marginRight" to 6)), "mx-7" to padStyleMapOf(utsMapOf("marginLeft" to 7, "marginRight" to 7)), "mx-8" to padStyleMapOf(utsMapOf("marginLeft" to 8, "marginRight" to 8)), "mx-9" to padStyleMapOf(utsMapOf("marginLeft" to 9, "marginRight" to 9)), "mx-10" to padStyleMapOf(utsMapOf("marginLeft" to 10, "marginRight" to 10)), "mx-11" to padStyleMapOf(utsMapOf("marginLeft" to 11, "marginRight" to 11)), "mx-12" to padStyleMapOf(utsMapOf("marginLeft" to 12, "marginRight" to 12)), "mx-13" to padStyleMapOf(utsMapOf("marginLeft" to 13, "marginRight" to 13)), "mx-14" to padStyleMapOf(utsMapOf("marginLeft" to 14, "marginRight" to 14)), "mx-15" to padStyleMapOf(utsMapOf("marginLeft" to 15, "marginRight" to 15)), "mx-16" to padStyleMapOf(utsMapOf("marginLeft" to 16, "marginRight" to 16)), "mx-17" to padStyleMapOf(utsMapOf("marginLeft" to 17, "marginRight" to 17)), "mx-18" to padStyleMapOf(utsMapOf("marginLeft" to 18, "marginRight" to 18)), "mx-19" to padStyleMapOf(utsMapOf("marginLeft" to 19, "marginRight" to 19)), "mx-20" to padStyleMapOf(utsMapOf("marginLeft" to 20, "marginRight" to 20)), "mx-21" to padStyleMapOf(utsMapOf("marginLeft" to 21, "marginRight" to 21)), "mx-22" to padStyleMapOf(utsMapOf("marginLeft" to 22, "marginRight" to 22)), "mx-23" to padStyleMapOf(utsMapOf("marginLeft" to 23, "marginRight" to 23)), "mx-24" to padStyleMapOf(utsMapOf("marginLeft" to 24, "marginRight" to 24)), "mx-25" to padStyleMapOf(utsMapOf("marginLeft" to 25, "marginRight" to 25)), "mx-26" to padStyleMapOf(utsMapOf("marginLeft" to 26, "marginRight" to 26)), "mx-27" to padStyleMapOf(utsMapOf("marginLeft" to 27, "marginRight" to 27)), "mx-28" to padStyleMapOf(utsMapOf("marginLeft" to 28, "marginRight" to 28)), "mx-29" to padStyleMapOf(utsMapOf("marginLeft" to 29, "marginRight" to 29)), "mx-30" to padStyleMapOf(utsMapOf("marginLeft" to 30, "marginRight" to 30)), "mx-31" to padStyleMapOf(utsMapOf("marginLeft" to 31, "marginRight" to 31)), "mx-32" to padStyleMapOf(utsMapOf("marginLeft" to 32, "marginRight" to 32)), "mx-33" to padStyleMapOf(utsMapOf("marginLeft" to 33, "marginRight" to 33)), "mx-34" to padStyleMapOf(utsMapOf("marginLeft" to 34, "marginRight" to 34)), "mx-35" to padStyleMapOf(utsMapOf("marginLeft" to 35, "marginRight" to 35)), "mx-36" to padStyleMapOf(utsMapOf("marginLeft" to 36, "marginRight" to 36)), "mx-37" to padStyleMapOf(utsMapOf("marginLeft" to 37, "marginRight" to 37)), "mx-38" to padStyleMapOf(utsMapOf("marginLeft" to 38, "marginRight" to 38)), "mx-39" to padStyleMapOf(utsMapOf("marginLeft" to 39, "marginRight" to 39)), "mx-40" to padStyleMapOf(utsMapOf("marginLeft" to 40, "marginRight" to 40)), "mx-41" to padStyleMapOf(utsMapOf("marginLeft" to 41, "marginRight" to 41)), "mx-42" to padStyleMapOf(utsMapOf("marginLeft" to 42, "marginRight" to 42)), "mx-43" to padStyleMapOf(utsMapOf("marginLeft" to 43, "marginRight" to 43)), "mx-44" to padStyleMapOf(utsMapOf("marginLeft" to 44, "marginRight" to 44)), "mx-45" to padStyleMapOf(utsMapOf("marginLeft" to 45, "marginRight" to 45)), "mx-46" to padStyleMapOf(utsMapOf("marginLeft" to 46, "marginRight" to 46)), "mx-47" to padStyleMapOf(utsMapOf("marginLeft" to 47, "marginRight" to 47)), "mx-48" to padStyleMapOf(utsMapOf("marginLeft" to 48, "marginRight" to 48)), "mx-49" to padStyleMapOf(utsMapOf("marginLeft" to 49, "marginRight" to 49)), "mx-50" to padStyleMapOf(utsMapOf("marginLeft" to 50, "marginRight" to 50)), "mx-n1" to padStyleMapOf(utsMapOf("marginLeft" to 2, "marginRight" to 2)), "mx-n2" to padStyleMapOf(utsMapOf("marginLeft" to 4, "marginRight" to 4)), "mx-n3" to padStyleMapOf(utsMapOf("marginLeft" to 6, "marginRight" to 6)), "mx-n4" to padStyleMapOf(utsMapOf("marginLeft" to 8, "marginRight" to 8)), "mx-n5" to padStyleMapOf(utsMapOf("marginLeft" to 10, "marginRight" to 10)), "mx-n6" to padStyleMapOf(utsMapOf("marginLeft" to 12, "marginRight" to 12)), "mx-n7" to padStyleMapOf(utsMapOf("marginLeft" to 14, "marginRight" to 14)), "mx-n8" to padStyleMapOf(utsMapOf("marginLeft" to 16, "marginRight" to 16)), "mx-n9" to padStyleMapOf(utsMapOf("marginLeft" to 18, "marginRight" to 18)), "mx-n10" to padStyleMapOf(utsMapOf("marginLeft" to 20, "marginRight" to 20)), "mx-n11" to padStyleMapOf(utsMapOf("marginLeft" to 22, "marginRight" to 22)), "mx-n12" to padStyleMapOf(utsMapOf("marginLeft" to 24, "marginRight" to 24)), "mx-n13" to padStyleMapOf(utsMapOf("marginLeft" to 26, "marginRight" to 26)), "mx-n14" to padStyleMapOf(utsMapOf("marginLeft" to 28, "marginRight" to 28)), "mx-n15" to padStyleMapOf(utsMapOf("marginLeft" to 30, "marginRight" to 30)), "mx-n16" to padStyleMapOf(utsMapOf("marginLeft" to 32, "marginRight" to 32)), "mx-n17" to padStyleMapOf(utsMapOf("marginLeft" to 34, "marginRight" to 34)), "mx-n18" to padStyleMapOf(utsMapOf("marginLeft" to 36, "marginRight" to 36)), "mx-n19" to padStyleMapOf(utsMapOf("marginLeft" to 38, "marginRight" to 38)), "mx-n20" to padStyleMapOf(utsMapOf("marginLeft" to 40, "marginRight" to 40)), "mx-n21" to padStyleMapOf(utsMapOf("marginLeft" to 42, "marginRight" to 42)), "mx-n22" to padStyleMapOf(utsMapOf("marginLeft" to 44, "marginRight" to 44)), "mx-n23" to padStyleMapOf(utsMapOf("marginLeft" to 46, "marginRight" to 46)), "mx-n24" to padStyleMapOf(utsMapOf("marginLeft" to 48, "marginRight" to 48)), "mx-n25" to padStyleMapOf(utsMapOf("marginLeft" to 50, "marginRight" to 50)), "my-0" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginBottom" to 0)), "my-1" to padStyleMapOf(utsMapOf("marginTop" to 1, "marginBottom" to 1)), "my-2" to padStyleMapOf(utsMapOf("marginTop" to 2, "marginBottom" to 2)), "my-3" to padStyleMapOf(utsMapOf("marginTop" to 3, "marginBottom" to 3)), "my-4" to padStyleMapOf(utsMapOf("marginTop" to 4, "marginBottom" to 4)), "my-5" to padStyleMapOf(utsMapOf("marginTop" to 5, "marginBottom" to 5)), "my-6" to padStyleMapOf(utsMapOf("marginTop" to 6, "marginBottom" to 6)), "my-7" to padStyleMapOf(utsMapOf("marginTop" to 7, "marginBottom" to 7)), "my-8" to padStyleMapOf(utsMapOf("marginTop" to 8, "marginBottom" to 8)), "my-9" to padStyleMapOf(utsMapOf("marginTop" to 9, "marginBottom" to 9)), "my-10" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginBottom" to 10)), "my-11" to padStyleMapOf(utsMapOf("marginTop" to 11, "marginBottom" to 11)), "my-12" to padStyleMapOf(utsMapOf("marginTop" to 12, "marginBottom" to 12)), "my-13" to padStyleMapOf(utsMapOf("marginTop" to 13, "marginBottom" to 13)), "my-14" to padStyleMapOf(utsMapOf("marginTop" to 14, "marginBottom" to 14)), "my-15" to padStyleMapOf(utsMapOf("marginTop" to 15, "marginBottom" to 15)), "my-16" to padStyleMapOf(utsMapOf("marginTop" to 16, "marginBottom" to 16)), "my-17" to padStyleMapOf(utsMapOf("marginTop" to 17, "marginBottom" to 17)), "my-18" to padStyleMapOf(utsMapOf("marginTop" to 18, "marginBottom" to 18)), "my-19" to padStyleMapOf(utsMapOf("marginTop" to 19, "marginBottom" to 19)));
            }
        val styles20: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("my-20" to padStyleMapOf(utsMapOf("marginTop" to 20, "marginBottom" to 20)), "my-21" to padStyleMapOf(utsMapOf("marginTop" to 21, "marginBottom" to 21)), "my-22" to padStyleMapOf(utsMapOf("marginTop" to 22, "marginBottom" to 22)), "my-23" to padStyleMapOf(utsMapOf("marginTop" to 23, "marginBottom" to 23)), "my-24" to padStyleMapOf(utsMapOf("marginTop" to 24, "marginBottom" to 24)), "my-25" to padStyleMapOf(utsMapOf("marginTop" to 25, "marginBottom" to 25)), "my-26" to padStyleMapOf(utsMapOf("marginTop" to 26, "marginBottom" to 26)), "my-27" to padStyleMapOf(utsMapOf("marginTop" to 27, "marginBottom" to 27)), "my-28" to padStyleMapOf(utsMapOf("marginTop" to 28, "marginBottom" to 28)), "my-29" to padStyleMapOf(utsMapOf("marginTop" to 29, "marginBottom" to 29)), "my-30" to padStyleMapOf(utsMapOf("marginTop" to 30, "marginBottom" to 30)), "my-31" to padStyleMapOf(utsMapOf("marginTop" to 31, "marginBottom" to 31)), "my-32" to padStyleMapOf(utsMapOf("marginTop" to 32, "marginBottom" to 32)), "my-33" to padStyleMapOf(utsMapOf("marginTop" to 33, "marginBottom" to 33)), "my-34" to padStyleMapOf(utsMapOf("marginTop" to 34, "marginBottom" to 34)), "my-35" to padStyleMapOf(utsMapOf("marginTop" to 35, "marginBottom" to 35)), "my-36" to padStyleMapOf(utsMapOf("marginTop" to 36, "marginBottom" to 36)), "my-37" to padStyleMapOf(utsMapOf("marginTop" to 37, "marginBottom" to 37)), "my-38" to padStyleMapOf(utsMapOf("marginTop" to 38, "marginBottom" to 38)), "my-39" to padStyleMapOf(utsMapOf("marginTop" to 39, "marginBottom" to 39)), "my-40" to padStyleMapOf(utsMapOf("marginTop" to 40, "marginBottom" to 40)), "my-41" to padStyleMapOf(utsMapOf("marginTop" to 41, "marginBottom" to 41)), "my-42" to padStyleMapOf(utsMapOf("marginTop" to 42, "marginBottom" to 42)), "my-43" to padStyleMapOf(utsMapOf("marginTop" to 43, "marginBottom" to 43)), "my-44" to padStyleMapOf(utsMapOf("marginTop" to 44, "marginBottom" to 44)), "my-45" to padStyleMapOf(utsMapOf("marginTop" to 45, "marginBottom" to 45)), "my-46" to padStyleMapOf(utsMapOf("marginTop" to 46, "marginBottom" to 46)), "my-47" to padStyleMapOf(utsMapOf("marginTop" to 47, "marginBottom" to 47)), "my-48" to padStyleMapOf(utsMapOf("marginTop" to 48, "marginBottom" to 48)), "my-49" to padStyleMapOf(utsMapOf("marginTop" to 49, "marginBottom" to 49)), "my-50" to padStyleMapOf(utsMapOf("marginTop" to 50, "marginBottom" to 50)), "my-n1" to padStyleMapOf(utsMapOf("marginTop" to 2, "marginBottom" to 2)), "my-n2" to padStyleMapOf(utsMapOf("marginTop" to 4, "marginBottom" to 4)), "my-n3" to padStyleMapOf(utsMapOf("marginTop" to 6, "marginBottom" to 6)), "my-n4" to padStyleMapOf(utsMapOf("marginTop" to 8, "marginBottom" to 8)), "my-n5" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginBottom" to 10)), "my-n6" to padStyleMapOf(utsMapOf("marginTop" to 12, "marginBottom" to 12)), "my-n7" to padStyleMapOf(utsMapOf("marginTop" to 14, "marginBottom" to 14)), "my-n8" to padStyleMapOf(utsMapOf("marginTop" to 16, "marginBottom" to 16)), "my-n9" to padStyleMapOf(utsMapOf("marginTop" to 18, "marginBottom" to 18)), "my-n10" to padStyleMapOf(utsMapOf("marginTop" to 20, "marginBottom" to 20)), "my-n11" to padStyleMapOf(utsMapOf("marginTop" to 22, "marginBottom" to 22)), "my-n12" to padStyleMapOf(utsMapOf("marginTop" to 24, "marginBottom" to 24)), "my-n13" to padStyleMapOf(utsMapOf("marginTop" to 26, "marginBottom" to 26)), "my-n14" to padStyleMapOf(utsMapOf("marginTop" to 28, "marginBottom" to 28)), "my-n15" to padStyleMapOf(utsMapOf("marginTop" to 30, "marginBottom" to 30)), "my-n16" to padStyleMapOf(utsMapOf("marginTop" to 32, "marginBottom" to 32)), "my-n17" to padStyleMapOf(utsMapOf("marginTop" to 34, "marginBottom" to 34)), "my-n18" to padStyleMapOf(utsMapOf("marginTop" to 36, "marginBottom" to 36)), "my-n19" to padStyleMapOf(utsMapOf("marginTop" to 38, "marginBottom" to 38)), "my-n20" to padStyleMapOf(utsMapOf("marginTop" to 40, "marginBottom" to 40)), "my-n21" to padStyleMapOf(utsMapOf("marginTop" to 42, "marginBottom" to 42)), "my-n22" to padStyleMapOf(utsMapOf("marginTop" to 44, "marginBottom" to 44)), "my-n23" to padStyleMapOf(utsMapOf("marginTop" to 46, "marginBottom" to 46)), "my-n24" to padStyleMapOf(utsMapOf("marginTop" to 48, "marginBottom" to 48)), "my-n25" to padStyleMapOf(utsMapOf("marginTop" to 50, "marginBottom" to 50)), "t-0" to padStyleMapOf(utsMapOf("top" to 0)), "t--0" to padStyleMapOf(utsMapOf("top" to 0)), "t-1" to padStyleMapOf(utsMapOf("top" to 1)), "t--1" to padStyleMapOf(utsMapOf("top" to -1)), "t-2" to padStyleMapOf(utsMapOf("top" to 2)), "t--2" to padStyleMapOf(utsMapOf("top" to -2)), "t-3" to padStyleMapOf(utsMapOf("top" to 3)), "t--3" to padStyleMapOf(utsMapOf("top" to -3)), "t-4" to padStyleMapOf(utsMapOf("top" to 4)), "t--4" to padStyleMapOf(utsMapOf("top" to -4)), "t-5" to padStyleMapOf(utsMapOf("top" to 5)), "t--5" to padStyleMapOf(utsMapOf("top" to -5)), "t-6" to padStyleMapOf(utsMapOf("top" to 6)), "t--6" to padStyleMapOf(utsMapOf("top" to -6)), "t-7" to padStyleMapOf(utsMapOf("top" to 7)), "t--7" to padStyleMapOf(utsMapOf("top" to -7)), "t-8" to padStyleMapOf(utsMapOf("top" to 8)), "t--8" to padStyleMapOf(utsMapOf("top" to -8)), "t-9" to padStyleMapOf(utsMapOf("top" to 9)), "t--9" to padStyleMapOf(utsMapOf("top" to -9)), "t-10" to padStyleMapOf(utsMapOf("top" to 10)), "t--10" to padStyleMapOf(utsMapOf("top" to -10)), "t-11" to padStyleMapOf(utsMapOf("top" to 11)), "t--11" to padStyleMapOf(utsMapOf("top" to -11)), "t-12" to padStyleMapOf(utsMapOf("top" to 12)), "t--12" to padStyleMapOf(utsMapOf("top" to -12)), "t-13" to padStyleMapOf(utsMapOf("top" to 13)), "t--13" to padStyleMapOf(utsMapOf("top" to -13)), "t-14" to padStyleMapOf(utsMapOf("top" to 14)), "t--14" to padStyleMapOf(utsMapOf("top" to -14)), "t-15" to padStyleMapOf(utsMapOf("top" to 15)), "t--15" to padStyleMapOf(utsMapOf("top" to -15)), "t-16" to padStyleMapOf(utsMapOf("top" to 16)), "t--16" to padStyleMapOf(utsMapOf("top" to -16)), "t-17" to padStyleMapOf(utsMapOf("top" to 17)), "t--17" to padStyleMapOf(utsMapOf("top" to -17)), "t-18" to padStyleMapOf(utsMapOf("top" to 18)), "t--18" to padStyleMapOf(utsMapOf("top" to -18)), "t-19" to padStyleMapOf(utsMapOf("top" to 19)), "t--19" to padStyleMapOf(utsMapOf("top" to -19)), "t-20" to padStyleMapOf(utsMapOf("top" to 20)), "t--20" to padStyleMapOf(utsMapOf("top" to -20)), "t-21" to padStyleMapOf(utsMapOf("top" to 21)), "t--21" to padStyleMapOf(utsMapOf("top" to -21)));
            }
        val styles21: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("t-22" to padStyleMapOf(utsMapOf("top" to 22)), "t--22" to padStyleMapOf(utsMapOf("top" to -22)), "t-23" to padStyleMapOf(utsMapOf("top" to 23)), "t--23" to padStyleMapOf(utsMapOf("top" to -23)), "t-24" to padStyleMapOf(utsMapOf("top" to 24)), "t--24" to padStyleMapOf(utsMapOf("top" to -24)), "t-25" to padStyleMapOf(utsMapOf("top" to 25)), "t--25" to padStyleMapOf(utsMapOf("top" to -25)), "t-26" to padStyleMapOf(utsMapOf("top" to 26)), "t--26" to padStyleMapOf(utsMapOf("top" to -26)), "t-27" to padStyleMapOf(utsMapOf("top" to 27)), "t--27" to padStyleMapOf(utsMapOf("top" to -27)), "t-28" to padStyleMapOf(utsMapOf("top" to 28)), "t--28" to padStyleMapOf(utsMapOf("top" to -28)), "t-29" to padStyleMapOf(utsMapOf("top" to 29)), "t--29" to padStyleMapOf(utsMapOf("top" to -29)), "t-30" to padStyleMapOf(utsMapOf("top" to 30)), "t--30" to padStyleMapOf(utsMapOf("top" to -30)), "t-31" to padStyleMapOf(utsMapOf("top" to 31)), "t--31" to padStyleMapOf(utsMapOf("top" to -31)), "t-32" to padStyleMapOf(utsMapOf("top" to 32)), "t--32" to padStyleMapOf(utsMapOf("top" to -32)), "t-33" to padStyleMapOf(utsMapOf("top" to 33)), "t--33" to padStyleMapOf(utsMapOf("top" to -33)), "t-34" to padStyleMapOf(utsMapOf("top" to 34)), "t--34" to padStyleMapOf(utsMapOf("top" to -34)), "t-35" to padStyleMapOf(utsMapOf("top" to 35)), "t--35" to padStyleMapOf(utsMapOf("top" to -35)), "t-36" to padStyleMapOf(utsMapOf("top" to 36)), "t--36" to padStyleMapOf(utsMapOf("top" to -36)), "t-37" to padStyleMapOf(utsMapOf("top" to 37)), "t--37" to padStyleMapOf(utsMapOf("top" to -37)), "t-38" to padStyleMapOf(utsMapOf("top" to 38)), "t--38" to padStyleMapOf(utsMapOf("top" to -38)), "t-39" to padStyleMapOf(utsMapOf("top" to 39)), "t--39" to padStyleMapOf(utsMapOf("top" to -39)), "t-40" to padStyleMapOf(utsMapOf("top" to 40)), "t--40" to padStyleMapOf(utsMapOf("top" to -40)), "t-41" to padStyleMapOf(utsMapOf("top" to 41)), "t--41" to padStyleMapOf(utsMapOf("top" to -41)), "t-42" to padStyleMapOf(utsMapOf("top" to 42)), "t--42" to padStyleMapOf(utsMapOf("top" to -42)), "t-43" to padStyleMapOf(utsMapOf("top" to 43)), "t--43" to padStyleMapOf(utsMapOf("top" to -43)), "t-44" to padStyleMapOf(utsMapOf("top" to 44)), "t--44" to padStyleMapOf(utsMapOf("top" to -44)), "t-45" to padStyleMapOf(utsMapOf("top" to 45)), "t--45" to padStyleMapOf(utsMapOf("top" to -45)), "t-46" to padStyleMapOf(utsMapOf("top" to 46)), "t--46" to padStyleMapOf(utsMapOf("top" to -46)), "t-47" to padStyleMapOf(utsMapOf("top" to 47)), "t--47" to padStyleMapOf(utsMapOf("top" to -47)), "t-48" to padStyleMapOf(utsMapOf("top" to 48)), "t--48" to padStyleMapOf(utsMapOf("top" to -48)), "t-49" to padStyleMapOf(utsMapOf("top" to 49)), "t--49" to padStyleMapOf(utsMapOf("top" to -49)), "t-50" to padStyleMapOf(utsMapOf("top" to 50)), "t--50" to padStyleMapOf(utsMapOf("top" to -50)), "t-n1" to padStyleMapOf(utsMapOf("top" to 2)), "t--n1" to padStyleMapOf(utsMapOf("top" to -2)), "t-n2" to padStyleMapOf(utsMapOf("top" to 4)), "t--n2" to padStyleMapOf(utsMapOf("top" to -4)), "t-n3" to padStyleMapOf(utsMapOf("top" to 6)), "t--n3" to padStyleMapOf(utsMapOf("top" to -6)), "t-n4" to padStyleMapOf(utsMapOf("top" to 8)), "t--n4" to padStyleMapOf(utsMapOf("top" to -8)), "t-n5" to padStyleMapOf(utsMapOf("top" to 10)), "t--n5" to padStyleMapOf(utsMapOf("top" to -10)), "t-n6" to padStyleMapOf(utsMapOf("top" to 12)), "t--n6" to padStyleMapOf(utsMapOf("top" to -12)), "t-n7" to padStyleMapOf(utsMapOf("top" to 14)), "t--n7" to padStyleMapOf(utsMapOf("top" to -14)), "t-n8" to padStyleMapOf(utsMapOf("top" to 16)), "t--n8" to padStyleMapOf(utsMapOf("top" to -16)), "t-n9" to padStyleMapOf(utsMapOf("top" to 18)), "t--n9" to padStyleMapOf(utsMapOf("top" to -18)), "t-n10" to padStyleMapOf(utsMapOf("top" to 20)), "t--n10" to padStyleMapOf(utsMapOf("top" to -20)), "t-n11" to padStyleMapOf(utsMapOf("top" to 22)), "t--n11" to padStyleMapOf(utsMapOf("top" to -22)), "t-n12" to padStyleMapOf(utsMapOf("top" to 24)), "t--n12" to padStyleMapOf(utsMapOf("top" to -24)), "t-n13" to padStyleMapOf(utsMapOf("top" to 26)), "t--n13" to padStyleMapOf(utsMapOf("top" to -26)), "t-n14" to padStyleMapOf(utsMapOf("top" to 28)), "t--n14" to padStyleMapOf(utsMapOf("top" to -28)), "t-n15" to padStyleMapOf(utsMapOf("top" to 30)), "t--n15" to padStyleMapOf(utsMapOf("top" to -30)), "t-n16" to padStyleMapOf(utsMapOf("top" to 32)), "t--n16" to padStyleMapOf(utsMapOf("top" to -32)), "t-n17" to padStyleMapOf(utsMapOf("top" to 34)), "t--n17" to padStyleMapOf(utsMapOf("top" to -34)), "t-n18" to padStyleMapOf(utsMapOf("top" to 36)), "t--n18" to padStyleMapOf(utsMapOf("top" to -36)), "t-n19" to padStyleMapOf(utsMapOf("top" to 38)), "t--n19" to padStyleMapOf(utsMapOf("top" to -38)), "t-n20" to padStyleMapOf(utsMapOf("top" to 40)), "t--n20" to padStyleMapOf(utsMapOf("top" to -40)), "t-n21" to padStyleMapOf(utsMapOf("top" to 42)), "t--n21" to padStyleMapOf(utsMapOf("top" to -42)));
            }
        val styles22: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("t-n22" to padStyleMapOf(utsMapOf("top" to 44)), "t--n22" to padStyleMapOf(utsMapOf("top" to -44)), "t-n23" to padStyleMapOf(utsMapOf("top" to 46)), "t--n23" to padStyleMapOf(utsMapOf("top" to -46)), "t-n24" to padStyleMapOf(utsMapOf("top" to 48)), "t--n24" to padStyleMapOf(utsMapOf("top" to -48)), "t-n25" to padStyleMapOf(utsMapOf("top" to 50)), "t--n25" to padStyleMapOf(utsMapOf("top" to -50)), "r-0" to padStyleMapOf(utsMapOf("right" to 0)), "r--0" to padStyleMapOf(utsMapOf("right" to 0)), "r-1" to padStyleMapOf(utsMapOf("right" to 1)), "r--1" to padStyleMapOf(utsMapOf("right" to -1)), "r-2" to padStyleMapOf(utsMapOf("right" to 2)), "r--2" to padStyleMapOf(utsMapOf("right" to -2)), "r-3" to padStyleMapOf(utsMapOf("right" to 3)), "r--3" to padStyleMapOf(utsMapOf("right" to -3)), "r-4" to padStyleMapOf(utsMapOf("right" to 4)), "r--4" to padStyleMapOf(utsMapOf("right" to -4)), "r-5" to padStyleMapOf(utsMapOf("right" to 5)), "r--5" to padStyleMapOf(utsMapOf("right" to -5)), "r-6" to padStyleMapOf(utsMapOf("right" to 6)), "r--6" to padStyleMapOf(utsMapOf("right" to -6)), "r-7" to padStyleMapOf(utsMapOf("right" to 7)), "r--7" to padStyleMapOf(utsMapOf("right" to -7)), "r-8" to padStyleMapOf(utsMapOf("right" to 8)), "r--8" to padStyleMapOf(utsMapOf("right" to -8)), "r-9" to padStyleMapOf(utsMapOf("right" to 9)), "r--9" to padStyleMapOf(utsMapOf("right" to -9)), "r-10" to padStyleMapOf(utsMapOf("right" to 10)), "r--10" to padStyleMapOf(utsMapOf("right" to -10)), "r-11" to padStyleMapOf(utsMapOf("right" to 11)), "r--11" to padStyleMapOf(utsMapOf("right" to -11)), "r-12" to padStyleMapOf(utsMapOf("right" to 12)), "r--12" to padStyleMapOf(utsMapOf("right" to -12)), "r-13" to padStyleMapOf(utsMapOf("right" to 13)), "r--13" to padStyleMapOf(utsMapOf("right" to -13)), "r-14" to padStyleMapOf(utsMapOf("right" to 14)), "r--14" to padStyleMapOf(utsMapOf("right" to -14)), "r-15" to padStyleMapOf(utsMapOf("right" to 15)), "r--15" to padStyleMapOf(utsMapOf("right" to -15)), "r-16" to padStyleMapOf(utsMapOf("right" to 16)), "r--16" to padStyleMapOf(utsMapOf("right" to -16)), "r-17" to padStyleMapOf(utsMapOf("right" to 17)), "r--17" to padStyleMapOf(utsMapOf("right" to -17)), "r-18" to padStyleMapOf(utsMapOf("right" to 18)), "r--18" to padStyleMapOf(utsMapOf("right" to -18)), "r-19" to padStyleMapOf(utsMapOf("right" to 19)), "r--19" to padStyleMapOf(utsMapOf("right" to -19)), "r-20" to padStyleMapOf(utsMapOf("right" to 20)), "r--20" to padStyleMapOf(utsMapOf("right" to -20)), "r-21" to padStyleMapOf(utsMapOf("right" to 21)), "r--21" to padStyleMapOf(utsMapOf("right" to -21)), "r-22" to padStyleMapOf(utsMapOf("right" to 22)), "r--22" to padStyleMapOf(utsMapOf("right" to -22)), "r-23" to padStyleMapOf(utsMapOf("right" to 23)), "r--23" to padStyleMapOf(utsMapOf("right" to -23)), "r-24" to padStyleMapOf(utsMapOf("right" to 24)), "r--24" to padStyleMapOf(utsMapOf("right" to -24)), "r-25" to padStyleMapOf(utsMapOf("right" to 25)), "r--25" to padStyleMapOf(utsMapOf("right" to -25)), "r-26" to padStyleMapOf(utsMapOf("right" to 26)), "r--26" to padStyleMapOf(utsMapOf("right" to -26)), "r-27" to padStyleMapOf(utsMapOf("right" to 27)), "r--27" to padStyleMapOf(utsMapOf("right" to -27)), "r-28" to padStyleMapOf(utsMapOf("right" to 28)), "r--28" to padStyleMapOf(utsMapOf("right" to -28)), "r-29" to padStyleMapOf(utsMapOf("right" to 29)), "r--29" to padStyleMapOf(utsMapOf("right" to -29)), "r-30" to padStyleMapOf(utsMapOf("right" to 30)), "r--30" to padStyleMapOf(utsMapOf("right" to -30)), "r-31" to padStyleMapOf(utsMapOf("right" to 31)), "r--31" to padStyleMapOf(utsMapOf("right" to -31)), "r-32" to padStyleMapOf(utsMapOf("right" to 32)), "r--32" to padStyleMapOf(utsMapOf("right" to -32)), "r-33" to padStyleMapOf(utsMapOf("right" to 33)), "r--33" to padStyleMapOf(utsMapOf("right" to -33)), "r-34" to padStyleMapOf(utsMapOf("right" to 34)), "r--34" to padStyleMapOf(utsMapOf("right" to -34)), "r-35" to padStyleMapOf(utsMapOf("right" to 35)), "r--35" to padStyleMapOf(utsMapOf("right" to -35)), "r-36" to padStyleMapOf(utsMapOf("right" to 36)), "r--36" to padStyleMapOf(utsMapOf("right" to -36)), "r-37" to padStyleMapOf(utsMapOf("right" to 37)), "r--37" to padStyleMapOf(utsMapOf("right" to -37)), "r-38" to padStyleMapOf(utsMapOf("right" to 38)), "r--38" to padStyleMapOf(utsMapOf("right" to -38)), "r-39" to padStyleMapOf(utsMapOf("right" to 39)), "r--39" to padStyleMapOf(utsMapOf("right" to -39)), "r-40" to padStyleMapOf(utsMapOf("right" to 40)), "r--40" to padStyleMapOf(utsMapOf("right" to -40)), "r-41" to padStyleMapOf(utsMapOf("right" to 41)), "r--41" to padStyleMapOf(utsMapOf("right" to -41)), "r-42" to padStyleMapOf(utsMapOf("right" to 42)), "r--42" to padStyleMapOf(utsMapOf("right" to -42)), "r-43" to padStyleMapOf(utsMapOf("right" to 43)), "r--43" to padStyleMapOf(utsMapOf("right" to -43)), "r-44" to padStyleMapOf(utsMapOf("right" to 44)), "r--44" to padStyleMapOf(utsMapOf("right" to -44)), "r-45" to padStyleMapOf(utsMapOf("right" to 45)), "r--45" to padStyleMapOf(utsMapOf("right" to -45)));
            }
        val styles23: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("r-46" to padStyleMapOf(utsMapOf("right" to 46)), "r--46" to padStyleMapOf(utsMapOf("right" to -46)), "r-47" to padStyleMapOf(utsMapOf("right" to 47)), "r--47" to padStyleMapOf(utsMapOf("right" to -47)), "r-48" to padStyleMapOf(utsMapOf("right" to 48)), "r--48" to padStyleMapOf(utsMapOf("right" to -48)), "r-49" to padStyleMapOf(utsMapOf("right" to 49)), "r--49" to padStyleMapOf(utsMapOf("right" to -49)), "r-50" to padStyleMapOf(utsMapOf("right" to 50)), "r--50" to padStyleMapOf(utsMapOf("right" to -50)), "r-n1" to padStyleMapOf(utsMapOf("right" to 2)), "r--n1" to padStyleMapOf(utsMapOf("right" to -2)), "r-n2" to padStyleMapOf(utsMapOf("right" to 4)), "r--n2" to padStyleMapOf(utsMapOf("right" to -4)), "r-n3" to padStyleMapOf(utsMapOf("right" to 6)), "r--n3" to padStyleMapOf(utsMapOf("right" to -6)), "r-n4" to padStyleMapOf(utsMapOf("right" to 8)), "r--n4" to padStyleMapOf(utsMapOf("right" to -8)), "r-n5" to padStyleMapOf(utsMapOf("right" to 10)), "r--n5" to padStyleMapOf(utsMapOf("right" to -10)), "r-n6" to padStyleMapOf(utsMapOf("right" to 12)), "r--n6" to padStyleMapOf(utsMapOf("right" to -12)), "r-n7" to padStyleMapOf(utsMapOf("right" to 14)), "r--n7" to padStyleMapOf(utsMapOf("right" to -14)), "r-n8" to padStyleMapOf(utsMapOf("right" to 16)), "r--n8" to padStyleMapOf(utsMapOf("right" to -16)), "r-n9" to padStyleMapOf(utsMapOf("right" to 18)), "r--n9" to padStyleMapOf(utsMapOf("right" to -18)), "r-n10" to padStyleMapOf(utsMapOf("right" to 20)), "r--n10" to padStyleMapOf(utsMapOf("right" to -20)), "r-n11" to padStyleMapOf(utsMapOf("right" to 22)), "r--n11" to padStyleMapOf(utsMapOf("right" to -22)), "r-n12" to padStyleMapOf(utsMapOf("right" to 24)), "r--n12" to padStyleMapOf(utsMapOf("right" to -24)), "r-n13" to padStyleMapOf(utsMapOf("right" to 26)), "r--n13" to padStyleMapOf(utsMapOf("right" to -26)), "r-n14" to padStyleMapOf(utsMapOf("right" to 28)), "r--n14" to padStyleMapOf(utsMapOf("right" to -28)), "r-n15" to padStyleMapOf(utsMapOf("right" to 30)), "r--n15" to padStyleMapOf(utsMapOf("right" to -30)), "r-n16" to padStyleMapOf(utsMapOf("right" to 32)), "r--n16" to padStyleMapOf(utsMapOf("right" to -32)), "r-n17" to padStyleMapOf(utsMapOf("right" to 34)), "r--n17" to padStyleMapOf(utsMapOf("right" to -34)), "r-n18" to padStyleMapOf(utsMapOf("right" to 36)), "r--n18" to padStyleMapOf(utsMapOf("right" to -36)), "r-n19" to padStyleMapOf(utsMapOf("right" to 38)), "r--n19" to padStyleMapOf(utsMapOf("right" to -38)), "r-n20" to padStyleMapOf(utsMapOf("right" to 40)), "r--n20" to padStyleMapOf(utsMapOf("right" to -40)), "r-n21" to padStyleMapOf(utsMapOf("right" to 42)), "r--n21" to padStyleMapOf(utsMapOf("right" to -42)), "r-n22" to padStyleMapOf(utsMapOf("right" to 44)), "r--n22" to padStyleMapOf(utsMapOf("right" to -44)), "r-n23" to padStyleMapOf(utsMapOf("right" to 46)), "r--n23" to padStyleMapOf(utsMapOf("right" to -46)), "r-n24" to padStyleMapOf(utsMapOf("right" to 48)), "r--n24" to padStyleMapOf(utsMapOf("right" to -48)), "r-n25" to padStyleMapOf(utsMapOf("right" to 50)), "r--n25" to padStyleMapOf(utsMapOf("right" to -50)), "b-0" to padStyleMapOf(utsMapOf("bottom" to 0)), "b--0" to padStyleMapOf(utsMapOf("bottom" to 0)), "b-1" to padStyleMapOf(utsMapOf("bottom" to 1)), "b--1" to padStyleMapOf(utsMapOf("bottom" to -1)), "b-2" to padStyleMapOf(utsMapOf("bottom" to 2)), "b--2" to padStyleMapOf(utsMapOf("bottom" to -2)), "b-3" to padStyleMapOf(utsMapOf("bottom" to 3)), "b--3" to padStyleMapOf(utsMapOf("bottom" to -3)), "b-4" to padStyleMapOf(utsMapOf("bottom" to 4)), "b--4" to padStyleMapOf(utsMapOf("bottom" to -4)), "b-5" to padStyleMapOf(utsMapOf("bottom" to 5)), "b--5" to padStyleMapOf(utsMapOf("bottom" to -5)), "b-6" to padStyleMapOf(utsMapOf("bottom" to 6)), "b--6" to padStyleMapOf(utsMapOf("bottom" to -6)), "b-7" to padStyleMapOf(utsMapOf("bottom" to 7)), "b--7" to padStyleMapOf(utsMapOf("bottom" to -7)), "b-8" to padStyleMapOf(utsMapOf("bottom" to 8)), "b--8" to padStyleMapOf(utsMapOf("bottom" to -8)), "b-9" to padStyleMapOf(utsMapOf("bottom" to 9)), "b--9" to padStyleMapOf(utsMapOf("bottom" to -9)), "b-10" to padStyleMapOf(utsMapOf("bottom" to 10)), "b--10" to padStyleMapOf(utsMapOf("bottom" to -10)), "b-11" to padStyleMapOf(utsMapOf("bottom" to 11)), "b--11" to padStyleMapOf(utsMapOf("bottom" to -11)), "b-12" to padStyleMapOf(utsMapOf("bottom" to 12)), "b--12" to padStyleMapOf(utsMapOf("bottom" to -12)), "b-13" to padStyleMapOf(utsMapOf("bottom" to 13)), "b--13" to padStyleMapOf(utsMapOf("bottom" to -13)), "b-14" to padStyleMapOf(utsMapOf("bottom" to 14)), "b--14" to padStyleMapOf(utsMapOf("bottom" to -14)), "b-15" to padStyleMapOf(utsMapOf("bottom" to 15)), "b--15" to padStyleMapOf(utsMapOf("bottom" to -15)), "b-16" to padStyleMapOf(utsMapOf("bottom" to 16)), "b--16" to padStyleMapOf(utsMapOf("bottom" to -16)), "b-17" to padStyleMapOf(utsMapOf("bottom" to 17)), "b--17" to padStyleMapOf(utsMapOf("bottom" to -17)), "b-18" to padStyleMapOf(utsMapOf("bottom" to 18)), "b--18" to padStyleMapOf(utsMapOf("bottom" to -18)), "b-19" to padStyleMapOf(utsMapOf("bottom" to 19)), "b--19" to padStyleMapOf(utsMapOf("bottom" to -19)));
            }
        val styles24: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("b-20" to padStyleMapOf(utsMapOf("bottom" to 20)), "b--20" to padStyleMapOf(utsMapOf("bottom" to -20)), "b-21" to padStyleMapOf(utsMapOf("bottom" to 21)), "b--21" to padStyleMapOf(utsMapOf("bottom" to -21)), "b-22" to padStyleMapOf(utsMapOf("bottom" to 22)), "b--22" to padStyleMapOf(utsMapOf("bottom" to -22)), "b-23" to padStyleMapOf(utsMapOf("bottom" to 23)), "b--23" to padStyleMapOf(utsMapOf("bottom" to -23)), "b-24" to padStyleMapOf(utsMapOf("bottom" to 24)), "b--24" to padStyleMapOf(utsMapOf("bottom" to -24)), "b-25" to padStyleMapOf(utsMapOf("bottom" to 25)), "b--25" to padStyleMapOf(utsMapOf("bottom" to -25)), "b-26" to padStyleMapOf(utsMapOf("bottom" to 26)), "b--26" to padStyleMapOf(utsMapOf("bottom" to -26)), "b-27" to padStyleMapOf(utsMapOf("bottom" to 27)), "b--27" to padStyleMapOf(utsMapOf("bottom" to -27)), "b-28" to padStyleMapOf(utsMapOf("bottom" to 28)), "b--28" to padStyleMapOf(utsMapOf("bottom" to -28)), "b-29" to padStyleMapOf(utsMapOf("bottom" to 29)), "b--29" to padStyleMapOf(utsMapOf("bottom" to -29)), "b-30" to padStyleMapOf(utsMapOf("bottom" to 30)), "b--30" to padStyleMapOf(utsMapOf("bottom" to -30)), "b-31" to padStyleMapOf(utsMapOf("bottom" to 31)), "b--31" to padStyleMapOf(utsMapOf("bottom" to -31)), "b-32" to padStyleMapOf(utsMapOf("bottom" to 32)), "b--32" to padStyleMapOf(utsMapOf("bottom" to -32)), "b-33" to padStyleMapOf(utsMapOf("bottom" to 33)), "b--33" to padStyleMapOf(utsMapOf("bottom" to -33)), "b-34" to padStyleMapOf(utsMapOf("bottom" to 34)), "b--34" to padStyleMapOf(utsMapOf("bottom" to -34)), "b-35" to padStyleMapOf(utsMapOf("bottom" to 35)), "b--35" to padStyleMapOf(utsMapOf("bottom" to -35)), "b-36" to padStyleMapOf(utsMapOf("bottom" to 36)), "b--36" to padStyleMapOf(utsMapOf("bottom" to -36)), "b-37" to padStyleMapOf(utsMapOf("bottom" to 37)), "b--37" to padStyleMapOf(utsMapOf("bottom" to -37)), "b-38" to padStyleMapOf(utsMapOf("bottom" to 38)), "b--38" to padStyleMapOf(utsMapOf("bottom" to -38)), "b-39" to padStyleMapOf(utsMapOf("bottom" to 39)), "b--39" to padStyleMapOf(utsMapOf("bottom" to -39)), "b-40" to padStyleMapOf(utsMapOf("bottom" to 40)), "b--40" to padStyleMapOf(utsMapOf("bottom" to -40)), "b-41" to padStyleMapOf(utsMapOf("bottom" to 41)), "b--41" to padStyleMapOf(utsMapOf("bottom" to -41)), "b-42" to padStyleMapOf(utsMapOf("bottom" to 42)), "b--42" to padStyleMapOf(utsMapOf("bottom" to -42)), "b-43" to padStyleMapOf(utsMapOf("bottom" to 43)), "b--43" to padStyleMapOf(utsMapOf("bottom" to -43)), "b-44" to padStyleMapOf(utsMapOf("bottom" to 44)), "b--44" to padStyleMapOf(utsMapOf("bottom" to -44)), "b-45" to padStyleMapOf(utsMapOf("bottom" to 45)), "b--45" to padStyleMapOf(utsMapOf("bottom" to -45)), "b-46" to padStyleMapOf(utsMapOf("bottom" to 46)), "b--46" to padStyleMapOf(utsMapOf("bottom" to -46)), "b-47" to padStyleMapOf(utsMapOf("bottom" to 47)), "b--47" to padStyleMapOf(utsMapOf("bottom" to -47)), "b-48" to padStyleMapOf(utsMapOf("bottom" to 48)), "b--48" to padStyleMapOf(utsMapOf("bottom" to -48)), "b-49" to padStyleMapOf(utsMapOf("bottom" to 49)), "b--49" to padStyleMapOf(utsMapOf("bottom" to -49)), "b-50" to padStyleMapOf(utsMapOf("bottom" to 50)), "b--50" to padStyleMapOf(utsMapOf("bottom" to -50)), "b-n1" to padStyleMapOf(utsMapOf("bottom" to 2)), "b--n1" to padStyleMapOf(utsMapOf("bottom" to -2)), "b-n2" to padStyleMapOf(utsMapOf("bottom" to 4)), "b--n2" to padStyleMapOf(utsMapOf("bottom" to -4)), "b-n3" to padStyleMapOf(utsMapOf("bottom" to 6)), "b--n3" to padStyleMapOf(utsMapOf("bottom" to -6)), "b-n4" to padStyleMapOf(utsMapOf("bottom" to 8)), "b--n4" to padStyleMapOf(utsMapOf("bottom" to -8)), "b-n5" to padStyleMapOf(utsMapOf("bottom" to 10)), "b--n5" to padStyleMapOf(utsMapOf("bottom" to -10)), "b-n6" to padStyleMapOf(utsMapOf("bottom" to 12)), "b--n6" to padStyleMapOf(utsMapOf("bottom" to -12)), "b-n7" to padStyleMapOf(utsMapOf("bottom" to 14)), "b--n7" to padStyleMapOf(utsMapOf("bottom" to -14)), "b-n8" to padStyleMapOf(utsMapOf("bottom" to 16)), "b--n8" to padStyleMapOf(utsMapOf("bottom" to -16)), "b-n9" to padStyleMapOf(utsMapOf("bottom" to 18)), "b--n9" to padStyleMapOf(utsMapOf("bottom" to -18)), "b-n10" to padStyleMapOf(utsMapOf("bottom" to 20)), "b--n10" to padStyleMapOf(utsMapOf("bottom" to -20)), "b-n11" to padStyleMapOf(utsMapOf("bottom" to 22)), "b--n11" to padStyleMapOf(utsMapOf("bottom" to -22)), "b-n12" to padStyleMapOf(utsMapOf("bottom" to 24)), "b--n12" to padStyleMapOf(utsMapOf("bottom" to -24)), "b-n13" to padStyleMapOf(utsMapOf("bottom" to 26)), "b--n13" to padStyleMapOf(utsMapOf("bottom" to -26)), "b-n14" to padStyleMapOf(utsMapOf("bottom" to 28)), "b--n14" to padStyleMapOf(utsMapOf("bottom" to -28)), "b-n15" to padStyleMapOf(utsMapOf("bottom" to 30)), "b--n15" to padStyleMapOf(utsMapOf("bottom" to -30)), "b-n16" to padStyleMapOf(utsMapOf("bottom" to 32)), "b--n16" to padStyleMapOf(utsMapOf("bottom" to -32)), "b-n17" to padStyleMapOf(utsMapOf("bottom" to 34)), "b--n17" to padStyleMapOf(utsMapOf("bottom" to -34)), "b-n18" to padStyleMapOf(utsMapOf("bottom" to 36)), "b--n18" to padStyleMapOf(utsMapOf("bottom" to -36)), "b-n19" to padStyleMapOf(utsMapOf("bottom" to 38)), "b--n19" to padStyleMapOf(utsMapOf("bottom" to -38)));
            }
        val styles25: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("b-n20" to padStyleMapOf(utsMapOf("bottom" to 40)), "b--n20" to padStyleMapOf(utsMapOf("bottom" to -40)), "b-n21" to padStyleMapOf(utsMapOf("bottom" to 42)), "b--n21" to padStyleMapOf(utsMapOf("bottom" to -42)), "b-n22" to padStyleMapOf(utsMapOf("bottom" to 44)), "b--n22" to padStyleMapOf(utsMapOf("bottom" to -44)), "b-n23" to padStyleMapOf(utsMapOf("bottom" to 46)), "b--n23" to padStyleMapOf(utsMapOf("bottom" to -46)), "b-n24" to padStyleMapOf(utsMapOf("bottom" to 48)), "b--n24" to padStyleMapOf(utsMapOf("bottom" to -48)), "b-n25" to padStyleMapOf(utsMapOf("bottom" to 50)), "b--n25" to padStyleMapOf(utsMapOf("bottom" to -50)), "l-0" to padStyleMapOf(utsMapOf("left" to 0)), "l--0" to padStyleMapOf(utsMapOf("left" to 0)), "l-1" to padStyleMapOf(utsMapOf("left" to 1)), "l--1" to padStyleMapOf(utsMapOf("left" to -1)), "l-2" to padStyleMapOf(utsMapOf("left" to 2)), "l--2" to padStyleMapOf(utsMapOf("left" to -2)), "l-3" to padStyleMapOf(utsMapOf("left" to 3)), "l--3" to padStyleMapOf(utsMapOf("left" to -3)), "l-4" to padStyleMapOf(utsMapOf("left" to 4)), "l--4" to padStyleMapOf(utsMapOf("left" to -4)), "l-5" to padStyleMapOf(utsMapOf("left" to 5)), "l--5" to padStyleMapOf(utsMapOf("left" to -5)), "l-6" to padStyleMapOf(utsMapOf("left" to 6)), "l--6" to padStyleMapOf(utsMapOf("left" to -6)), "l-7" to padStyleMapOf(utsMapOf("left" to 7)), "l--7" to padStyleMapOf(utsMapOf("left" to -7)), "l-8" to padStyleMapOf(utsMapOf("left" to 8)), "l--8" to padStyleMapOf(utsMapOf("left" to -8)), "l-9" to padStyleMapOf(utsMapOf("left" to 9)), "l--9" to padStyleMapOf(utsMapOf("left" to -9)), "l-10" to padStyleMapOf(utsMapOf("left" to 10)), "l--10" to padStyleMapOf(utsMapOf("left" to -10)), "l-11" to padStyleMapOf(utsMapOf("left" to 11)), "l--11" to padStyleMapOf(utsMapOf("left" to -11)), "l-12" to padStyleMapOf(utsMapOf("left" to 12)), "l--12" to padStyleMapOf(utsMapOf("left" to -12)), "l-13" to padStyleMapOf(utsMapOf("left" to 13)), "l--13" to padStyleMapOf(utsMapOf("left" to -13)), "l-14" to padStyleMapOf(utsMapOf("left" to 14)), "l--14" to padStyleMapOf(utsMapOf("left" to -14)), "l-15" to padStyleMapOf(utsMapOf("left" to 15)), "l--15" to padStyleMapOf(utsMapOf("left" to -15)), "l-16" to padStyleMapOf(utsMapOf("left" to 16)), "l--16" to padStyleMapOf(utsMapOf("left" to -16)), "l-17" to padStyleMapOf(utsMapOf("left" to 17)), "l--17" to padStyleMapOf(utsMapOf("left" to -17)), "l-18" to padStyleMapOf(utsMapOf("left" to 18)), "l--18" to padStyleMapOf(utsMapOf("left" to -18)), "l-19" to padStyleMapOf(utsMapOf("left" to 19)), "l--19" to padStyleMapOf(utsMapOf("left" to -19)), "l-20" to padStyleMapOf(utsMapOf("left" to 20)), "l--20" to padStyleMapOf(utsMapOf("left" to -20)), "l-21" to padStyleMapOf(utsMapOf("left" to 21)), "l--21" to padStyleMapOf(utsMapOf("left" to -21)), "l-22" to padStyleMapOf(utsMapOf("left" to 22)), "l--22" to padStyleMapOf(utsMapOf("left" to -22)), "l-23" to padStyleMapOf(utsMapOf("left" to 23)), "l--23" to padStyleMapOf(utsMapOf("left" to -23)), "l-24" to padStyleMapOf(utsMapOf("left" to 24)), "l--24" to padStyleMapOf(utsMapOf("left" to -24)), "l-25" to padStyleMapOf(utsMapOf("left" to 25)), "l--25" to padStyleMapOf(utsMapOf("left" to -25)), "l-26" to padStyleMapOf(utsMapOf("left" to 26)), "l--26" to padStyleMapOf(utsMapOf("left" to -26)), "l-27" to padStyleMapOf(utsMapOf("left" to 27)), "l--27" to padStyleMapOf(utsMapOf("left" to -27)), "l-28" to padStyleMapOf(utsMapOf("left" to 28)), "l--28" to padStyleMapOf(utsMapOf("left" to -28)), "l-29" to padStyleMapOf(utsMapOf("left" to 29)), "l--29" to padStyleMapOf(utsMapOf("left" to -29)), "l-30" to padStyleMapOf(utsMapOf("left" to 30)), "l--30" to padStyleMapOf(utsMapOf("left" to -30)), "l-31" to padStyleMapOf(utsMapOf("left" to 31)), "l--31" to padStyleMapOf(utsMapOf("left" to -31)), "l-32" to padStyleMapOf(utsMapOf("left" to 32)), "l--32" to padStyleMapOf(utsMapOf("left" to -32)), "l-33" to padStyleMapOf(utsMapOf("left" to 33)), "l--33" to padStyleMapOf(utsMapOf("left" to -33)), "l-34" to padStyleMapOf(utsMapOf("left" to 34)), "l--34" to padStyleMapOf(utsMapOf("left" to -34)), "l-35" to padStyleMapOf(utsMapOf("left" to 35)), "l--35" to padStyleMapOf(utsMapOf("left" to -35)), "l-36" to padStyleMapOf(utsMapOf("left" to 36)), "l--36" to padStyleMapOf(utsMapOf("left" to -36)), "l-37" to padStyleMapOf(utsMapOf("left" to 37)), "l--37" to padStyleMapOf(utsMapOf("left" to -37)), "l-38" to padStyleMapOf(utsMapOf("left" to 38)), "l--38" to padStyleMapOf(utsMapOf("left" to -38)), "l-39" to padStyleMapOf(utsMapOf("left" to 39)), "l--39" to padStyleMapOf(utsMapOf("left" to -39)), "l-40" to padStyleMapOf(utsMapOf("left" to 40)), "l--40" to padStyleMapOf(utsMapOf("left" to -40)), "l-41" to padStyleMapOf(utsMapOf("left" to 41)), "l--41" to padStyleMapOf(utsMapOf("left" to -41)), "l-42" to padStyleMapOf(utsMapOf("left" to 42)), "l--42" to padStyleMapOf(utsMapOf("left" to -42)), "l-43" to padStyleMapOf(utsMapOf("left" to 43)), "l--43" to padStyleMapOf(utsMapOf("left" to -43)));
            }
        val styles26: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("l-44" to padStyleMapOf(utsMapOf("left" to 44)), "l--44" to padStyleMapOf(utsMapOf("left" to -44)), "l-45" to padStyleMapOf(utsMapOf("left" to 45)), "l--45" to padStyleMapOf(utsMapOf("left" to -45)), "l-46" to padStyleMapOf(utsMapOf("left" to 46)), "l--46" to padStyleMapOf(utsMapOf("left" to -46)), "l-47" to padStyleMapOf(utsMapOf("left" to 47)), "l--47" to padStyleMapOf(utsMapOf("left" to -47)), "l-48" to padStyleMapOf(utsMapOf("left" to 48)), "l--48" to padStyleMapOf(utsMapOf("left" to -48)), "l-49" to padStyleMapOf(utsMapOf("left" to 49)), "l--49" to padStyleMapOf(utsMapOf("left" to -49)), "l-50" to padStyleMapOf(utsMapOf("left" to 50)), "l--50" to padStyleMapOf(utsMapOf("left" to -50)), "l-n1" to padStyleMapOf(utsMapOf("left" to 2)), "l--n1" to padStyleMapOf(utsMapOf("left" to -2)), "l-n2" to padStyleMapOf(utsMapOf("left" to 4)), "l--n2" to padStyleMapOf(utsMapOf("left" to -4)), "l-n3" to padStyleMapOf(utsMapOf("left" to 6)), "l--n3" to padStyleMapOf(utsMapOf("left" to -6)), "l-n4" to padStyleMapOf(utsMapOf("left" to 8)), "l--n4" to padStyleMapOf(utsMapOf("left" to -8)), "l-n5" to padStyleMapOf(utsMapOf("left" to 10)), "l--n5" to padStyleMapOf(utsMapOf("left" to -10)), "l-n6" to padStyleMapOf(utsMapOf("left" to 12)), "l--n6" to padStyleMapOf(utsMapOf("left" to -12)), "l-n7" to padStyleMapOf(utsMapOf("left" to 14)), "l--n7" to padStyleMapOf(utsMapOf("left" to -14)), "l-n8" to padStyleMapOf(utsMapOf("left" to 16)), "l--n8" to padStyleMapOf(utsMapOf("left" to -16)), "l-n9" to padStyleMapOf(utsMapOf("left" to 18)), "l--n9" to padStyleMapOf(utsMapOf("left" to -18)), "l-n10" to padStyleMapOf(utsMapOf("left" to 20)), "l--n10" to padStyleMapOf(utsMapOf("left" to -20)), "l-n11" to padStyleMapOf(utsMapOf("left" to 22)), "l--n11" to padStyleMapOf(utsMapOf("left" to -22)), "l-n12" to padStyleMapOf(utsMapOf("left" to 24)), "l--n12" to padStyleMapOf(utsMapOf("left" to -24)), "l-n13" to padStyleMapOf(utsMapOf("left" to 26)), "l--n13" to padStyleMapOf(utsMapOf("left" to -26)), "l-n14" to padStyleMapOf(utsMapOf("left" to 28)), "l--n14" to padStyleMapOf(utsMapOf("left" to -28)), "l-n15" to padStyleMapOf(utsMapOf("left" to 30)), "l--n15" to padStyleMapOf(utsMapOf("left" to -30)), "l-n16" to padStyleMapOf(utsMapOf("left" to 32)), "l--n16" to padStyleMapOf(utsMapOf("left" to -32)), "l-n17" to padStyleMapOf(utsMapOf("left" to 34)), "l--n17" to padStyleMapOf(utsMapOf("left" to -34)), "l-n18" to padStyleMapOf(utsMapOf("left" to 36)), "l--n18" to padStyleMapOf(utsMapOf("left" to -36)), "l-n19" to padStyleMapOf(utsMapOf("left" to 38)), "l--n19" to padStyleMapOf(utsMapOf("left" to -38)), "l-n20" to padStyleMapOf(utsMapOf("left" to 40)), "l--n20" to padStyleMapOf(utsMapOf("left" to -40)), "l-n21" to padStyleMapOf(utsMapOf("left" to 42)), "l--n21" to padStyleMapOf(utsMapOf("left" to -42)), "l-n22" to padStyleMapOf(utsMapOf("left" to 44)), "l--n22" to padStyleMapOf(utsMapOf("left" to -44)), "l-n23" to padStyleMapOf(utsMapOf("left" to 46)), "l--n23" to padStyleMapOf(utsMapOf("left" to -46)), "l-n24" to padStyleMapOf(utsMapOf("left" to 48)), "l--n24" to padStyleMapOf(utsMapOf("left" to -48)), "l-n25" to padStyleMapOf(utsMapOf("left" to 50)), "l--n25" to padStyleMapOf(utsMapOf("left" to -50)), "flex" to padStyleMapOf(utsMapOf("display" to "flex")), "flex-col" to padStyleMapOf(utsMapOf("flexDirection" to "column")), "flex-wrap" to padStyleMapOf(utsMapOf("flexFlow" to "row wrap")), "flex-shrink" to padStyleMapOf(utsMapOf("flexShrink" to 0)), "flex-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "flex-reverse" to padStyleMapOf(utsMapOf("flexDirection" to "row-reverse")), "flex-row-top-start" to padStyleMapOf(utsMapOf("justifyContent" to "flex-start", "alignItems" to "flex-start", "display" to "flex")), "flex-row-top-center" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "flex-start", "display" to "flex")), "flex-row-top-end" to padStyleMapOf(utsMapOf("justifyContent" to "flex-end", "alignItems" to "flex-start", "display" to "flex")), "flex-row-center-start" to padStyleMapOf(utsMapOf("justifyContent" to "flex-start", "alignItems" to "center", "display" to "flex")), "flex-row-center-center" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "center", "display" to "flex")), "flex-row-center-end" to padStyleMapOf(utsMapOf("justifyContent" to "flex-end", "alignItems" to "center", "display" to "flex")), "flex-row-bottom-start" to padStyleMapOf(utsMapOf("justifyContent" to "flex-start", "alignItems" to "flex-end", "display" to "flex")), "flex-row-bottom-center" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "flex-end", "display" to "flex")), "flex-row-bottom-end" to padStyleMapOf(utsMapOf("justifyContent" to "flex-end", "alignItems" to "flex-end", "display" to "flex")), "flex-row-center-between" to padStyleMapOf(utsMapOf("justifyContent" to "space-between", "alignItems" to "center", "display" to "flex")), "flex-col-top-start" to padStyleMapOf(utsMapOf("justifyContent" to "flex-start", "alignItems" to "flex-start", "display" to "flex")), "flex-col-top-center" to padStyleMapOf(utsMapOf("justifyContent" to "flex-start", "alignItems" to "center", "display" to "flex")), "flex-col-top-end" to padStyleMapOf(utsMapOf("justifyContent" to "flex-start", "alignItems" to "flex-end", "display" to "flex")), "flex-col-center-start" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "flex-start", "display" to "flex")), "flex-col-center-center" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "center", "display" to "flex")), "flex-col-center-end" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "flex-end", "display" to "flex")), "flex-col-bottom-start" to padStyleMapOf(utsMapOf("justifyContent" to "flex-end", "alignItems" to "flex-start", "display" to "flex")), "flex-col-bottom-center" to padStyleMapOf(utsMapOf("justifyContent" to "flex-end", "alignItems" to "center", "display" to "flex")), "flex-col-bottom-end" to padStyleMapOf(utsMapOf("justifyContent" to "flex-end", "alignItems" to "flex-end", "display" to "flex")), "flex-start" to padStyleMapOf(utsMapOf("justifyContent" to "flex-start", "alignItems" to "center", "display" to "flex")), "flex-end" to padStyleMapOf(utsMapOf("justifyContent" to "flex-end", "alignItems" to "center", "display" to "flex")), "flex-center" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "center", "display" to "flex")), "flex-between" to padStyleMapOf(utsMapOf("justifyContent" to "space-between")), "flex-col-full" to padStyleMapOf(utsMapOf("flexDirection" to "column", "alignItems" to "stretch")), "flex-around" to padStyleMapOf(utsMapOf("justifyContent" to "space-around")), "flex-0" to padStyleMapOf(utsMapOf("flex" to 0)), "flex-1" to padStyleMapOf(utsMapOf("flex" to 1)), "flex-2" to padStyleMapOf(utsMapOf("flex" to 2)), "flex-3" to padStyleMapOf(utsMapOf("flex" to 3)), "flex-4" to padStyleMapOf(utsMapOf("flex" to 4)));
            }
        val styles27: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("flex-5" to padStyleMapOf(utsMapOf("flex" to 5)), "flex-6" to padStyleMapOf(utsMapOf("flex" to 6)), "flex-7" to padStyleMapOf(utsMapOf("flex" to 7)), "flex-8" to padStyleMapOf(utsMapOf("flex" to 8)), "flex-9" to padStyleMapOf(utsMapOf("flex" to 9)), "flex-10" to padStyleMapOf(utsMapOf("flex" to 10)), "flex-11" to padStyleMapOf(utsMapOf("flex" to 11)), "flex-12" to padStyleMapOf(utsMapOf("flex" to 12)), "text-red" to padStyleMapOf(utsMapOf("color" to "#f44336")), "red" to padStyleMapOf(utsMapOf("backgroundColor" to "#f44336")), "text-pink" to padStyleMapOf(utsMapOf("color" to "#e91e63")), "pink" to padStyleMapOf(utsMapOf("backgroundColor" to "#e91e63")), "text-purple" to padStyleMapOf(utsMapOf("color" to "#9c27b0")), "purple" to padStyleMapOf(utsMapOf("backgroundColor" to "#9c27b0")), "text-deep-purple" to padStyleMapOf(utsMapOf("color" to "#673ab7")), "deep-purple" to padStyleMapOf(utsMapOf("backgroundColor" to "#673ab7")), "text-indigo" to padStyleMapOf(utsMapOf("color" to "#3f51b5")), "indigo" to padStyleMapOf(utsMapOf("backgroundColor" to "#3f51b5")), "text-blue" to padStyleMapOf(utsMapOf("color" to "#2196f3")), "blue" to padStyleMapOf(utsMapOf("backgroundColor" to "#2196f3")), "text-light-blue" to padStyleMapOf(utsMapOf("color" to "#03a9f4")), "light-blue" to padStyleMapOf(utsMapOf("backgroundColor" to "#03a9f4")), "text-cyan" to padStyleMapOf(utsMapOf("color" to "#00bcd4")), "cyan" to padStyleMapOf(utsMapOf("backgroundColor" to "#00bcd4")), "text-teal" to padStyleMapOf(utsMapOf("color" to "#009688")), "teal" to padStyleMapOf(utsMapOf("backgroundColor" to "#009688")), "text-green" to padStyleMapOf(utsMapOf("color" to "#4caf50")), "green" to padStyleMapOf(utsMapOf("backgroundColor" to "#4caf50")), "text-light-green" to padStyleMapOf(utsMapOf("color" to "#8bc34a")), "light-green" to padStyleMapOf(utsMapOf("backgroundColor" to "#8bc34a")), "text-lime" to padStyleMapOf(utsMapOf("color" to "#cddc39")), "lime" to padStyleMapOf(utsMapOf("backgroundColor" to "#cddc39")), "text-yellow" to padStyleMapOf(utsMapOf("color" to "#ffeb3b")), "yellow" to padStyleMapOf(utsMapOf("backgroundColor" to "#ffeb3b")), "text-amber" to padStyleMapOf(utsMapOf("color" to "#ffc107")), "amber" to padStyleMapOf(utsMapOf("backgroundColor" to "#ffc107")), "text-orange" to padStyleMapOf(utsMapOf("color" to "#ff9800")), "orange" to padStyleMapOf(utsMapOf("backgroundColor" to "#ff9800")), "text-deep-orange" to padStyleMapOf(utsMapOf("color" to "#ff5722")), "deep-orange" to padStyleMapOf(utsMapOf("backgroundColor" to "#ff5722")), "text-brown" to padStyleMapOf(utsMapOf("color" to "#795548")), "brown" to padStyleMapOf(utsMapOf("backgroundColor" to "#795548")), "text-blue-grey" to padStyleMapOf(utsMapOf("color" to "#607d8b")), "blue-grey" to padStyleMapOf(utsMapOf("backgroundColor" to "#607d8b")), "text-grey" to padStyleMapOf(utsMapOf("color" to "#9e9e9e")), "grey" to padStyleMapOf(utsMapOf("backgroundColor" to "#9e9e9e")), "text-black" to padStyleMapOf(utsMapOf("color" to "#000000")), "black" to padStyleMapOf(utsMapOf("backgroundColor" to "#000000")), "text-white" to padStyleMapOf(utsMapOf("color" to "#ffffff")), "white" to padStyleMapOf(utsMapOf("backgroundColor" to "#ffffff")), "text-lighten-5" to padStyleMapOf(utsMapOf("color" to "#fafafa")), "lighten-5" to padStyleMapOf(utsMapOf("backgroundColor" to "#fafafa")), "text-lighten-4" to padStyleMapOf(utsMapOf("color" to "#f5f5f5")), "lighten-4" to padStyleMapOf(utsMapOf("backgroundColor" to "#f5f5f5")), "text-lighten-3" to padStyleMapOf(utsMapOf("color" to "#eeeeee")), "lighten-3" to padStyleMapOf(utsMapOf("backgroundColor" to "#eeeeee")), "text-lighten-2" to padStyleMapOf(utsMapOf("color" to "#e0e0e0")), "lighten-2" to padStyleMapOf(utsMapOf("backgroundColor" to "#e0e0e0")), "text-lighten-1" to padStyleMapOf(utsMapOf("color" to "#bdbdbd")), "lighten-1" to padStyleMapOf(utsMapOf("backgroundColor" to "#bdbdbd")), "text-darken-1" to padStyleMapOf(utsMapOf("color" to "#757575")), "darken-1" to padStyleMapOf(utsMapOf("backgroundColor" to "#757575")), "text-darken-2" to padStyleMapOf(utsMapOf("color" to "#616161")), "darken-2" to padStyleMapOf(utsMapOf("backgroundColor" to "#616161")), "text-darken-3" to padStyleMapOf(utsMapOf("color" to "#424242")), "darken-3" to padStyleMapOf(utsMapOf("backgroundColor" to "#424242")), "text-darken-4" to padStyleMapOf(utsMapOf("color" to "#212121")), "darken-4" to padStyleMapOf(utsMapOf("backgroundColor" to "#212121")), "text-darken-5" to padStyleMapOf(utsMapOf("color" to "#131313")), "darken-5" to padStyleMapOf(utsMapOf("backgroundColor" to "#131313")), "text-darken-6" to padStyleMapOf(utsMapOf("color" to "#0a0a0a")), "darken-6" to padStyleMapOf(utsMapOf("backgroundColor" to "#0a0a0a")));
            }
    }
}
val GenAppClass = CreateVueAppComponent(GenApp::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "app", name = "", inheritAttrs = true, inject = Map(), props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = Map(), styles = GenApp.styles);
}
, fun(instance): GenApp {
    return GenApp(instance);
}
);
typealias callbackFunType = (x: Number) -> Number;
var kSplineTableSize: Number = 11;
var kSampleStepSize = (1.0 as Number) / (kSplineTableSize - 1.0);
fun A(aA1: Number, aA2: Number): Number {
    return 1.0 - 3.0 * aA2 + 3.0 * aA1;
}
fun B(aA1: Number, aA2: Number): Number {
    return 3.0 * aA2 - 6.0 * aA1;
}
fun C(aA1: Number): Number {
    return 3.0 * aA1;
}
fun calcBezier(aT: Number, aA1: Number, aA2: Number): Number {
    return ((A(aA1, aA2) * aT + B(aA1, aA2)) * aT + C(aA1)) * aT;
}
fun getSlope(aT: Number, aA1: Number, aA2: Number): Number {
    return 3.0 * A(aA1, aA2) * aT * aT + 2.0 * B(aA1, aA2) * aT + C(aA1);
}
fun binarySubdivide(aX: Number, reassignedAA: Number, reassignedAB: Number, mX1: Number, mX2: Number): Number {
    var aB = reassignedAB;
    var aA = reassignedAA;
    var currentX: Number = 0;
    var currentT: Number = 0;
    var i: Number = 0;
    do {
        currentT = aA + (aB - aA) / 2.0;
        currentX = calcBezier(currentT, mX1, mX2) - aX;
        if (currentX > 0.0) {
            aB = currentT;
        } else {
            aA = currentT;
        }
    }
    while (Math.abs(currentX) > 0.0000001 && ++i < 10)
    return currentT;
}
fun newtonRaphsonIterate(aX: Number, aGuessT: Number, mX1: Number, mX2: Number): Number {
    var pat = aGuessT;
    run {
        var i: Number = 0;
        while(i < 4){
            var currentSlope = getSlope(aGuessT, mX1, mX2);
            if (currentSlope == 0.0) {
                return aGuessT;
            }
            var currentX = calcBezier(aGuessT, mX1, mX2) - aX;
            pat -= currentX / currentSlope;
            ++i;
        }
    }
    return pat;
}
fun bezier(mX1: Number, mY1: Number, mX2: Number, mY2: Number): callbackFunType? {
    if (!(0 <= mX1 && mX1 <= 1 && 0 <= mX2 && mX2 <= 1)) {
        return null;
    }
    var sampleValues: UTSArray<Number> = utsArrayOf();
    if (mX1 != mY1 || mX2 != mY2) {
        run {
            var i: Number = 0;
            while(i < kSplineTableSize){
                sampleValues.push(calcBezier(i * kSampleStepSize, mX1, mX2));
                ++i;
            }
        }
    }
    fun getTForX(aX: Number): Number {
        var intervalStart: Number = 0;
        var currentSample: Number = 1;
        var lastSample = kSplineTableSize - 1;
        while(currentSample != lastSample && sampleValues[currentSample] <= aX){
            intervalStart += kSampleStepSize;
            ++currentSample;
        }
        --currentSample;
        var dist = (aX - sampleValues[currentSample]) / (sampleValues[currentSample + 1] - sampleValues[currentSample]);
        var guessForT: Number = intervalStart + dist * kSampleStepSize;
        var initialSlope = getSlope(guessForT, mX1, mX2);
        if (initialSlope >= 0.001) {
            return newtonRaphsonIterate(aX, guessForT, mX1, mX2);
        } else if (initialSlope == 0.0) {
            return guessForT;
        }
        return binarySubdivide(aX, intervalStart, intervalStart + kSampleStepSize, mX1, mX2);
    }
    return fun(x: Number): Number {
        if (mX1 == mY1 && mX2 == mY2) {
            return x;
        }
        if (x == 0 || x == 1) {
            return x;
        }
        return calcBezier(getTForX(x), mY1, mY2);
    }
    ;
}
val xProvitae = reactive(XPRIVATECONFIG(scrollTop = -1, windowInnerWidth = 0, windowInnerHeight = 0, windowWidth = 0, windowHeight = 0, pageStyle = Map<String, xPageStyle>()));
val colors = Map<String, String>(utsArrayOf(
    utsArrayOf(
        "primary",
        "#0579FF"
    ),
    utsArrayOf(
        "success",
        "#07d73d"
    ),
    utsArrayOf(
        "danger",
        "#ff6411"
    ),
    utsArrayOf(
        "warn",
        "#ffa61e"
    ),
    utsArrayOf(
        "error",
        "#f10226"
    ),
    utsArrayOf(
        "info",
        "#F2F2F2"
    ),
    utsArrayOf(
        "kleinblue",
        "#002FA7"
    ),
    utsArrayOf(
        "chinesered",
        "#FF0000"
    ),
    utsArrayOf(
        "internationalorange",
        "#FF4F00"
    ),
    utsArrayOf(
        "egyptianvlue",
        "#1034A6"
    ),
    utsArrayOf(
        "parisviolet",
        "#6C3082"
    ),
    utsArrayOf(
        "moroccanblue",
        "#1256A7"
    ),
    utsArrayOf(
        "brazilgreen",
        "#009B3A"
    ),
    utsArrayOf(
        "britishracinggreen",
        "#004225"
    ),
    utsArrayOf(
        "indianyellow",
        "#E3A857"
    ),
    utsArrayOf(
        "australiangold",
        "#FFDF00"
    ),
    utsArrayOf(
        "venetianred",
        "#C80815"
    ),
    utsArrayOf(
        "majorelleblue",
        "#6050DC"
    ),
    utsArrayOf(
        "tuscanred",
        "#7C3030"
    ),
    utsArrayOf(
        "naplesyellow",
        "#FADA5E"
    ),
    utsArrayOf(
        "capumortuum",
        "#592720"
    ),
    utsArrayOf(
        "mayablue",
        "#73C2FB"
    ),
    utsArrayOf(
        "persianrose",
        "#FE28A2"
    ),
    utsArrayOf(
        "tyrianpurple",
        "#66023C"
    ),
    utsArrayOf(
        "saharasand",
        "#F1E788"
    ),
    utsArrayOf(
        "burmeseruby",
        "#B00A0A"
    ),
    utsArrayOf(
        "transparent",
        "rgba(0,0,0,0)"
    ),
    utsArrayOf(
        "aliceblue",
        "#F0F8FF"
    ),
    utsArrayOf(
        "antiquewhite",
        "#FAEBD7"
    ),
    utsArrayOf(
        "aqua",
        "#00FFFF"
    ),
    utsArrayOf(
        "aquamarine",
        "#7FFFD4"
    ),
    utsArrayOf(
        "azure",
        "#F0FFFF"
    ),
    utsArrayOf(
        "beige",
        "#F5F5DC"
    ),
    utsArrayOf(
        "bisque",
        "#FFE4C4"
    ),
    utsArrayOf(
        "black",
        "#000000"
    ),
    utsArrayOf(
        "blanchedalmond",
        "#FFEBCD"
    ),
    utsArrayOf(
        "blue",
        "#0000FF"
    ),
    utsArrayOf(
        "blueviolet",
        "#8A2BE2"
    ),
    utsArrayOf(
        "brown",
        "#A52A2A"
    ),
    utsArrayOf(
        "burlywood",
        "#DEB887"
    ),
    utsArrayOf(
        "cadetblue",
        "#5F9EA0"
    ),
    utsArrayOf(
        "chartreuse",
        "#7FFF00"
    ),
    utsArrayOf(
        "chocolate",
        "#D2691E"
    ),
    utsArrayOf(
        "coral",
        "#FF7F50"
    ),
    utsArrayOf(
        "cornflowerblue",
        "#6495ED"
    ),
    utsArrayOf(
        "cornsilk",
        "#FFF8DC"
    ),
    utsArrayOf(
        "crimson",
        "#DC143C"
    ),
    utsArrayOf(
        "cyan",
        "#00FFFF"
    ),
    utsArrayOf(
        "darkblue",
        "#00008B"
    ),
    utsArrayOf(
        "darkcyan",
        "#008B8B"
    ),
    utsArrayOf(
        "darkgoldenrod",
        "#B8860B"
    ),
    utsArrayOf(
        "darkgray",
        "#A9A9A9"
    ),
    utsArrayOf(
        "darkgreen",
        "#006400"
    ),
    utsArrayOf(
        "darkkhaki",
        "#BDB76B"
    ),
    utsArrayOf(
        "darkmagenta",
        "#8B008B"
    ),
    utsArrayOf(
        "darkolivegreen",
        "#556B2F"
    ),
    utsArrayOf(
        "darkorange",
        "#FF8C00"
    ),
    utsArrayOf(
        "darkorchid",
        "#9932CC"
    ),
    utsArrayOf(
        "darkred",
        "#8B0000"
    ),
    utsArrayOf(
        "darksalmon",
        "#E9967A"
    ),
    utsArrayOf(
        "darkseagreen",
        "#8FBC8F"
    ),
    utsArrayOf(
        "darkslateblue",
        "#483D8B"
    ),
    utsArrayOf(
        "darkslategray",
        "#2F4F4F"
    ),
    utsArrayOf(
        "darkturquoise",
        "#00CED1"
    ),
    utsArrayOf(
        "darkviolet",
        "#9400D3"
    ),
    utsArrayOf(
        "deeppink",
        "#FF1493"
    ),
    utsArrayOf(
        "deepskyblue",
        "#00BFFF"
    ),
    utsArrayOf(
        "dimgray",
        "#696969"
    ),
    utsArrayOf(
        "dodgerblue",
        "#1E90FF"
    ),
    utsArrayOf(
        "firebrick",
        "#B22222"
    ),
    utsArrayOf(
        "floralwhite",
        "#FFFAF0"
    ),
    utsArrayOf(
        "forestgreen",
        "#228B22"
    ),
    utsArrayOf(
        "fuchsia",
        "#FF00FF"
    ),
    utsArrayOf(
        "gainsboro",
        "#DCDCDC"
    ),
    utsArrayOf(
        "ghostwhite",
        "#F8F8FF"
    ),
    utsArrayOf(
        "gold",
        "#FFD700"
    ),
    utsArrayOf(
        "goldenrod",
        "#DAA520"
    ),
    utsArrayOf(
        "gray",
        "#808080"
    ),
    utsArrayOf(
        "green",
        "#008000"
    ),
    utsArrayOf(
        "greenyellow",
        "#ADFF2F"
    ),
    utsArrayOf(
        "honeydew",
        "#F0FFF0"
    ),
    utsArrayOf(
        "hotpink",
        "#FF69B4"
    ),
    utsArrayOf(
        "indianred",
        "#CD5C5C"
    ),
    utsArrayOf(
        "indigo",
        "#4B0082"
    ),
    utsArrayOf(
        "ivory",
        "#FFFFF0"
    ),
    utsArrayOf(
        "khaki",
        "#F0E68C"
    ),
    utsArrayOf(
        "lavender",
        "#E6E6FA"
    ),
    utsArrayOf(
        "lavenderblush",
        "#FFF0F5"
    ),
    utsArrayOf(
        "lawngreen",
        "#7CFC00"
    ),
    utsArrayOf(
        "lemonchiffon",
        "#FFFACD"
    ),
    utsArrayOf(
        "lightblue",
        "#ADD8E6"
    ),
    utsArrayOf(
        "lightcoral",
        "#F08080"
    ),
    utsArrayOf(
        "lightcyan",
        "#E0FFFF"
    ),
    utsArrayOf(
        "lightgoldenrodyellow",
        "#FAFAD2"
    ),
    utsArrayOf(
        "lightgray",
        "#D3D3D3"
    ),
    utsArrayOf(
        "lightgreen",
        "#90EE90"
    ),
    utsArrayOf(
        "lightpink",
        "#FFB6C1"
    ),
    utsArrayOf(
        "lightsalmon",
        "#FFA07A"
    ),
    utsArrayOf(
        "lightseagreen",
        "#20B2AA"
    ),
    utsArrayOf(
        "lightskyblue",
        "#87CEFA"
    ),
    utsArrayOf(
        "lightslategray",
        "#778899"
    ),
    utsArrayOf(
        "lightsteelblue",
        "#B0C4DE"
    ),
    utsArrayOf(
        "lightyellow",
        "#FFFFE0"
    ),
    utsArrayOf(
        "lime",
        "#00FF00"
    ),
    utsArrayOf(
        "limegreen",
        "#32CD32"
    ),
    utsArrayOf(
        "linen",
        "#FAF0E6"
    ),
    utsArrayOf(
        "magenta",
        "#FF00FF"
    ),
    utsArrayOf(
        "maroon",
        "#800000"
    ),
    utsArrayOf(
        "mediumaquamarine",
        "#66CDAA"
    ),
    utsArrayOf(
        "mediumblue",
        "#0000CD"
    ),
    utsArrayOf(
        "mediumorchid",
        "#BA55D3"
    ),
    utsArrayOf(
        "mediumpurple",
        "#9370DB"
    ),
    utsArrayOf(
        "mediumseagreen",
        "#3CB371"
    ),
    utsArrayOf(
        "mediumslateblue",
        "#7B68EE"
    ),
    utsArrayOf(
        "mediumspringgreen",
        "#00FA9A"
    ),
    utsArrayOf(
        "mediumturquoise",
        "#48D1CC"
    ),
    utsArrayOf(
        "mediumvioletred",
        "#C71585"
    ),
    utsArrayOf(
        "midnightblue",
        "#191970"
    ),
    utsArrayOf(
        "mintcream",
        "#F5FFFA"
    ),
    utsArrayOf(
        "mistyrose",
        "#FFE4E1"
    ),
    utsArrayOf(
        "moccasin",
        "#FFE4B5"
    ),
    utsArrayOf(
        "navajowhite",
        "#FFDEAD"
    ),
    utsArrayOf(
        "navy",
        "#000080"
    ),
    utsArrayOf(
        "oldlace",
        "#FDF5E6"
    ),
    utsArrayOf(
        "olive",
        "#808000"
    ),
    utsArrayOf(
        "olivedrab",
        "#6B8E23"
    ),
    utsArrayOf(
        "orange",
        "#FFA500"
    ),
    utsArrayOf(
        "orangered",
        "#FF4500"
    ),
    utsArrayOf(
        "orchid",
        "#DA70D6"
    ),
    utsArrayOf(
        "palegoldenrod",
        "#EEE8AA"
    ),
    utsArrayOf(
        "palegreen",
        "#98FB98"
    ),
    utsArrayOf(
        "paleturquoise",
        "#AFEEEE"
    ),
    utsArrayOf(
        "palevioletred",
        "#DB7093"
    ),
    utsArrayOf(
        "papayawhip",
        "#FFEFD5"
    ),
    utsArrayOf(
        "peachpuff",
        "#FFDAB9"
    ),
    utsArrayOf(
        "peru",
        "#CD853F"
    ),
    utsArrayOf(
        "pink",
        "#FFC0CB"
    ),
    utsArrayOf(
        "plum",
        "#DDA0DD"
    ),
    utsArrayOf(
        "powderblue",
        "#B0E0E6"
    ),
    utsArrayOf(
        "purple",
        "#800080"
    ),
    utsArrayOf(
        "rebeccapurple",
        "#663399"
    ),
    utsArrayOf(
        "red",
        "#FF0000"
    ),
    utsArrayOf(
        "rosybrown",
        "#BC8F8F"
    ),
    utsArrayOf(
        "royalblue",
        "#4169E1"
    ),
    utsArrayOf(
        "saddlebrown",
        "#8B4513"
    ),
    utsArrayOf(
        "salmon",
        "#FA8072"
    ),
    utsArrayOf(
        "sandybrown",
        "#F4A460"
    ),
    utsArrayOf(
        "seagreen",
        "#2E8B57"
    ),
    utsArrayOf(
        "seashell",
        "#FFF5EE"
    ),
    utsArrayOf(
        "sienna",
        "#A0522D"
    ),
    utsArrayOf(
        "silver",
        "#C0C0C0"
    ),
    utsArrayOf(
        "skyblue",
        "#87CEEB"
    ),
    utsArrayOf(
        "slateblue",
        "#6A5ACD"
    ),
    utsArrayOf(
        "slategray",
        "#708090"
    ),
    utsArrayOf(
        "snow",
        "#FFFAFA"
    ),
    utsArrayOf(
        "springgreen",
        "#00FF7F"
    ),
    utsArrayOf(
        "steelblue",
        "#4682B4"
    ),
    utsArrayOf(
        "tan",
        "#D2B48C"
    ),
    utsArrayOf(
        "teal",
        "#008080"
    ),
    utsArrayOf(
        "thistle",
        "#D8BFD8"
    ),
    utsArrayOf(
        "tomato",
        "#FF6347"
    ),
    utsArrayOf(
        "turquoise",
        "#40E0D0"
    ),
    utsArrayOf(
        "violet",
        "#EE82EE"
    ),
    utsArrayOf(
        "wheat",
        "#F5DEB3"
    ),
    utsArrayOf(
        "white",
        "#FFFFFF"
    ),
    utsArrayOf(
        "whitesmoke",
        "#F5F5F5"
    ),
    utsArrayOf(
        "yellow",
        "#FFFF00"
    ),
    utsArrayOf(
        "yellowgreen",
        "#9ACD32"
    )
));
open class XRECT_OPTS (
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    open var fillColor: String? = null,
    open var borderWidth: Number? = null,
    open var borderColor: String? = null,
    open var opacity: Number? = null,
    open var scaleX: Number? = null,
    open var scaleY: Number? = null,
    open var rotate: Number? = null,
    open var globalCompositeOperation: XCANVAS_GLOBALOPERATION? = null,
) : UTSObject()
fun getUid(rdix: Number = 1, length: Number = 12): String {
    var ix = "";
    ix = Math.floor(Math.random() * rdix * Math.floor(Math.random() * Date.now())).toString(10).substring(0, length as Int);
    return ix;
}
fun isValidColor(color: String): Boolean {
    val hexRegex = UTSRegExp("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}|[A-Fa-f0-9]{8})\$", "");
    val rgbRegex = UTSRegExp("^rgb\\((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\s*,\\s*(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\s*,\\s*(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\)\$", "");
    val rgbaRegex = UTSRegExp("^rgba\\((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\s*,\\s*(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\s*,\\s*(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\s*,\\s*((1(\\.0{1,2})?)|(0(\\.\\d{1,2})?))\\)\$", "");
    val hslRegex = UTSRegExp("^hsl\\((\\d{1,3}), (\\d{1,3})%, (\\d{1,3})%\\)\$", "");
    val hslaRegex = UTSRegExp("^hsla\\(\\s*((\\d{1,2}|[1-2]\\d{2}|3[0-5]\\d)(\\.\\d+)?|\\d+(\\.\\d+)?)\\s*,\\s*((\\d{1,2}|\\d{0,1}\\d{1}\\d{1}|[1-2]\\d{2}|3[0-5]\\d)(\\.\\d+)?|\\d+(\\.\\d+)?)%\\s*,\\s*((\\d{1,2}|\\d{0,1}\\d{1}\\d{1}|[1-2]\\d{2}|3[0-5]\\d)(\\.\\d+)?|\\d+(\\.\\d+)?)%\\s*,\\s*((1|0(\\.\\d{1,2})?|(\\.\\d{1,2})))\\)\$", "i");
    if (color == "") {
        return false;
    } else if (color === "inherit" || color === "transparent") {
        return false;
    } else if (color === "currentColor") {
        return false;
    } else if (hexRegex.test(color) || rgbRegex.test(color) || rgbaRegex.test(color) || hslRegex.test(color) || hslaRegex.test(color)) {
        return true;
    }
    return false;
}
val xConfig = reactive(XCONFIG(theme = Map<String, String>(utsArrayOf()), color = "#0085d0", dark = "light", designSize = 750, unit = "px", language = "zh-Hans", fontScale = 1, navigationBarTextStyleDark = "#ffffff", navigationBarTextStyleLight = "#000000", navigationBarBackgroundColorDark = "#000000", navigationBarBackgroundColorLight = "#f5f5f5", backgroundColorContentDark = "#000000", backgroundColorContentLight = "#f5f5f5", tabarBackgroundColorDark = "#0a0a0a", tabarBackgroundColorLight = "#FFFFFF", sheetDarkColor = "#141414", sheetDarkBorderColor = utsArrayOf(
    "#232323"
), inputDarkColor = "#272727", borderDarkColor = "#1c1c1c", inputRadius = "6", inputFocusBorder = utsArrayOf(), buttonRadius = "6", tagRadius = "3", cellRadius = "12", sheetRadius = utsArrayOf(
    "6"
), sheetMargin = utsArrayOf(
    "14",
    "0",
    "14",
    "14"
), sheetPadding = utsArrayOf(
    "14"
), drawerRadius = "6", modalRadius = "18", switchRadius = "32", progressRadius = "32", unRadioAndCheckBoxColor = "#cfcfcf", radioButtonRadius = "10", animationFun = "cubic-bezier(.42,.38,.15,.93)", cardRound = "6", closeIcon = "close-circle-fill"));
fun getDefaultColor(sColor: String): String {
    if (sColor == "") {
        return "";
    }
    var sc = sColor.toLocaleLowerCase().trim().replace(" ", "");
    if (isValidColor(sc)) {
        return sc;
    }
    var colorhtme = xConfig.theme.get(sc);
    var sco = if (colorhtme == null) {
        colors.get(sc);
    } else {
        colorhtme;
    }
    ;
    if (UTSAndroid.`typeof`( sco) == "string") {
        return sco as String;
    }
    return colors.get("primary")!!;
}
fun hexToRgb(sColors: String): UTSJSONObject {
    if (sColors == "") {
        return object : UTSJSONObject() {
            var r: Number = 0
            var g: Number = 0
            var b: Number = 0
            var a: Number = 0
        };
    }
    var reg = UTSRegExp("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}|[A-Fa-f0-9]{8})\$", "");
    var sColor: String = sColors.toLowerCase();
    if (sColor != "" && reg.test(sColor)) {
        if (sColor.length == 4) {
            var sColorNew = "#";
            run {
                var i: Number = 1;
                while(i < 4){
                    sColorNew += sColor.slice(i, i + 1).concat(sColor.slice(i, i + 1));
                    i += 1;
                }
            }
            sColor = sColorNew;
        }
        var sColorChange: UTSArray<Number> = utsArrayOf();
        sColorChange.push(parseInt(sColor.substring(1, 3), 16));
        sColorChange.push(parseInt(sColor.substring(3, 5), 16));
        sColorChange.push(parseInt(sColor.substring(5, 7), 16));
        if (sColor.length == 9) {
            sColorChange.push(parseInt(sColor.substring(7, 9), 16) / 255);
        }
        return object : UTSJSONObject() {
            var r = sColorChange[0]
            var g = sColorChange[1]
            var b = sColorChange[2]
            var a = if (sColorChange.length == 4) {
                sColorChange[3];
            } else {
                1;
            }
        };
    } else if (UTSRegExp("^(rgb|RGB|rgba|RGBA)", "").test(sColor)) {
        var arr: UTSArray<String> = sColor.replace(UTSRegExp("(?:\\(|\\)|rgba|rgb|RGB|RGBA)*", "g"), "").split(",");
        var p: UTSArray<Number> = arr.map(fun(kVal: String): Number {
            return parseInt(kVal);
        });
        if (p.length < 3) {
            return object : UTSJSONObject() {
                var r: Number = 0
                var g: Number = 0
                var b: Number = 0
                var a: Number = 1
            };
        }
        if (p.length == 3) {
            arr.push("1");
        }
        return object : UTSJSONObject() {
            var r = p[0]
            var g = p[1]
            var b = p[2]
            var a = parseFloat(arr[3])
        };
    } else {
        return object : UTSJSONObject() {
            var r: Number = 0
            var g: Number = 0
            var b: Number = 0
            var a: Number = 1
        };
    }
}
fun rgbToHsl(rgb: UTSJSONObject): UTSJSONObject {
    var r = rgb.getNumber("r");
    r = r as Number / 255;
    var g = rgb.getNumber("g");
    g = g as Number / 255;
    var b = rgb.getNumber("b");
    b = b as Number / 255;
    var a = rgb.getNumber("a");
    var max = Math.max(r, g, b);
    var min = Math.min(r, g, b);
    var maxmindiff = max - min;
    var maxmindiffAdd = max + min;
    maxmindiff = maxmindiff.toDouble();
    maxmindiffAdd = maxmindiffAdd.toDouble();
    var h = 60 * (4 + (r - g) / maxmindiff);
    var sdy = 2 - max - min;
    sdy = sdy.toDouble();
    var s = (max - min) / sdy;
    var l = (max + min) / 2;
    if (max === r) {
        h = (60 * (g - b)) / maxmindiff;
    } else if (max === g) {
        h = 60 * (2 + (b - r) / maxmindiff);
    }
    if (h < 0) {
        h += 360;
    }
    if (max === min) {
        s = 0;
    } else if (l < 0.5) {
        s = (max - min) / maxmindiffAdd;
    }
    return UTSJSONObject(Map<String, Any?>(utsArrayOf(
        utsArrayOf(
            "h",
            h
        ),
        utsArrayOf(
            "s",
            (s * 100)
        ),
        utsArrayOf(
            "l",
            (l * 100)
        ),
        utsArrayOf(
            "a",
            a
        )
    )));
}
fun hslToRgb(hsl: UTSJSONObject): UTSJSONObject {
    var h = hsl.getNumber("h")!!;
    var s = hsl.getNumber("s")!!;
    var l = hsl.getNumber("l")!!;
    var a = hsl.getNumber("a")!!;
    h = h / 360;
    s = s / 100;
    l = l / 100;
    var r = l;
    var g = l;
    var b = l;
    fun hue2rgb(pxx: Number, q: Number, txs: Number): Number {
        var t = txs;
        var p = pxx;
        if (t < 0) {
            t += 1;
        }
        if (t > 1) {
            t -= 1;
        }
        if (t < (1 as Number) / 6) {
            return p + (q - p) * 6 * t;
        }
        if (t < 0.5) {
            return q;
        }
        if (t < (2 as Number) / 3) {
            return p + (q - p) * ((2 as Number) / 3 - t) * 6;
        }
        return p;
    }
    if (s > 0) {
        var q = l * (1 + s);
        if (l >= 0.5) {
            q = l + s - l * s;
        }
        var p = 2 * l - q;
        r = hue2rgb(p, q, h + (1 as Number) / 3);
        g = hue2rgb(p, q, h);
        b = hue2rgb(p, q, h - (1 as Number) / 3);
    }
    r = Math.round(r * 255);
    g = Math.round(g * 255);
    b = Math.round(b * 255);
    return UTSJSONObject(Map<String, Any?>(utsArrayOf(
        utsArrayOf(
            "r",
            r
        ),
        utsArrayOf(
            "g",
            g
        ),
        utsArrayOf(
            "b",
            b
        ),
        utsArrayOf(
            "a",
            a
        )
    )));
}
fun hslaToRgbCss(hsl: UTSJSONObject): String {
    var rgb = hslToRgb(hsl);
    var r = rgb.getNumber("r")!!;
    var g = rgb.getNumber("g")!!;
    var b = rgb.getNumber("b")!!;
    var a = rgb.getNumber("a")!!;
    return "rgba(" + r + "," + g + "," + b + "," + a + ")";
}
fun getLuminance(color: UTSJSONObject, type: String = "rgba"): Number {
    var colordefault: UTSJSONObject = if (type == "rgba") {
        color;
    } else {
        hslToRgb(color);
    }
    ;
    val r = colordefault.getNumber("r")!!;
    val g = colordefault.getNumber("g")!!;
    val b = colordefault.getNumber("b")!!;
    val rs = r / 255;
    val gs = g / 255;
    val bs = b / 255;
    val rl = Math.pow(if (rs <= 0.03928) {
        rs / 12.92;
    } else {
        ((rs + 0.055) / 1.055);
    }
    , 2.4);
    val gl = Math.pow(if (gs <= 0.03928) {
        gs / 12.92;
    } else {
        ((gs + 0.055) / 1.055);
    }
    , 2.4);
    val bl = Math.pow(if (bs <= 0.03928) {
        bs / 12.92;
    } else {
        ((bs + 0.055) / 1.055);
    }
    , 2.4);
    return 0.2126 * rl + 0.7152 * gl + 0.0722 * bl;
}
fun colorAddDeepen(sColor: String): String {
    var rgb = hexToRgb(getDefaultColor(sColor));
    var hsl = rgbToHsl(rgb);
    var l = hsl.getNumber("l")!! - 5;
    l = Math.max(0, Math.min(l, 100));
    return hslaToRgbCss(UTSJSONObject(Map<String, Any?>(utsArrayOf(
        utsArrayOf(
            "h",
            hsl.getNumber("h")
        ),
        utsArrayOf(
            "s",
            hsl.getNumber("s")
        ),
        utsArrayOf(
            "l",
            l
        ),
        utsArrayOf(
            "a",
            hsl.getNumber("a")!!
        )
    ))));
}
fun getDefaultColorObj(color: String, hoverColor: String): UTSJSONObject {
    var hsla: UTSJSONObject = rgbToHsl(hexToRgb(getDefaultColor(color)));
    var hoverHsla: UTSJSONObject = rgbToHsl(hexToRgb(getDefaultColor(hoverColor)));
    var shadow = hslaToRgbCss(object : UTSJSONObject() {
        var h = hsla.getNumber("h")!!
        var s = if (hsla.getNumber("s")!! == 0) {
            0;
        } else {
            60;
        }
        var l: Number = 40
        var a: Number = 0.4
    });
    var shadowHOver = hslaToRgbCss(object : UTSJSONObject() {
        var h = hoverHsla.getNumber("h")!!
        var s = if (hoverHsla.getNumber("s")!! == 0) {
            0;
        } else {
            60;
        }
        var l: Number = 40
        var a: Number = 0.4
    });
    if (hsla.getNumber("h")!! == 0 && hsla.getNumber("s")!! == 0) {
        shadow = "transparent";
    }
    if (hoverHsla.getNumber("h")!! == 0 && hoverHsla.getNumber("s")!! == 0) {
        shadowHOver = "transparent";
    }
    var lightnum = getLuminance(hoverHsla, "hsla");
    var o: UTSJSONObject = object : UTSJSONObject() {
        var `default` = UTSJSONObject(Map<String, Any?>(utsArrayOf(
            utsArrayOf(
                "background",
                hslaToRgbCss(hsla)
            ),
            utsArrayOf(
                "borderColor",
                hslaToRgbCss(object : UTSJSONObject() {
                    var h = hsla.getNumber("h")!!
                    var s = hsla.getNumber("s")!!
                    var a = hsla.getNumber("a")!!
                    var l = Math.min(Math.max(0, hsla.getNumber("l")!! - 3), hsla.getNumber("l")!!)
                })
            ),
            utsArrayOf(
                "fontColor",
                if (lightnum < 0.6 && hsla.getNumber("a")!! > 0.1) {
                    "#ffffff";
                } else {
                    "#000000";
                }
            ),
            utsArrayOf(
                "shadow",
                shadow
            )
        )))
        var active = object : UTSJSONObject() {
            var background = hslaToRgbCss(object : UTSJSONObject() {
                var h = hoverHsla.getNumber("h")!!
                var s = hoverHsla.getNumber("s")!!
                var a = hoverHsla.getNumber("a")!!
                var l = Math.min(Math.max(0, hoverHsla.getNumber("l")!! - 5), hoverHsla.getNumber("l")!!)
            })
            var borderColor = hslaToRgbCss(object : UTSJSONObject() {
                var h = hoverHsla.getNumber("h")!!
                var s = hoverHsla.getNumber("s")!!
                var a = hoverHsla.getNumber("a")!!
                var l = Math.max(Math.max(0, hoverHsla.getNumber("l")!! - 10), hoverHsla.getNumber("l")!!)
            })
            var fontColor = if (lightnum < 0.6 && hoverHsla.getNumber("a")!! > 0.1) {
                "#ffffff";
            } else {
                "#000000";
            }
            var shadow = shadowHOver
        }
    };
    return o;
}
fun getTextColorObj(color: String, hoverColor: String, isCoverDark: Boolean?): UTSJSONObject {
    var dark = if (isCoverDark == null) {
        false;
    } else {
        isCoverDark;
    }
    ;
    var hsla: UTSJSONObject = rgbToHsl(hexToRgb(getDefaultColor(color)));
    var hsla2: UTSJSONObject = rgbToHsl(hexToRgb(getDefaultColor(color)));
    var hoverHsla: UTSJSONObject = rgbToHsl(hexToRgb(getDefaultColor(hoverColor)));
    var bgcolor = hslaToRgbCss(object : UTSJSONObject() {
        var h = hoverHsla.getNumber("h")!!
        var s = hoverHsla.getNumber("s")!!
        var a = hoverHsla.getNumber("a")!!
        var l = if (dark == true) {
            20;
        } else {
            95;
        }
    });
    if (dark) {
        var p = hsla2;
        p.set("l", 20);
        p.set("s", if (p.getNumber("s") != 0) {
            0;
        } else {
            20;
        }
        );
        bgcolor = hslaToRgbCss(p);
    }
    var lightnum = getLuminance(hoverHsla, "hsla");
    var o: UTSJSONObject = object : UTSJSONObject() {
        var `default` = object : UTSJSONObject() {
            var background = "transparent"
            var borderColor = "transparent"
            var fontColor = if (lightnum < 0.3 && hsla.getNumber("a")!! > 0.1) {
                hslaToRgbCss(hsla);
            } else {
                hslaToRgbCss(object : UTSJSONObject() {
                    var h = hsla.getNumber("h")!!
                    var s = hsla.getNumber("s")!!
                    var a = hsla.getNumber("a")!!
                    var l: Number = 30
                });
            }
            var shadow = "transparent"
        }
        var active = object : UTSJSONObject() {
            var background = bgcolor
            var borderColor = "transparent"
            var fontColor = if (lightnum < 0.3 && hoverHsla.getNumber("a")!! > 0.1) {
                hslaToRgbCss(hoverHsla);
            } else {
                hslaToRgbCss(object : UTSJSONObject() {
                    var h = hoverHsla.getNumber("h")!!
                    var s = hoverHsla.getNumber("s")!!
                    var a = hoverHsla.getNumber("a")!!
                    var l: Number = 30
                });
            }
            var shadow = "transparent"
        }
    };
    return o;
}
fun getThinColorObj(color: String, hoverColor: String, isCoverDark: Boolean?): UTSJSONObject {
    var dark = if (isCoverDark == null) {
        false;
    } else {
        isCoverDark;
    }
    ;
    var hsla: UTSJSONObject = rgbToHsl(hexToRgb(getDefaultColor(color)));
    var hoverHsla: UTSJSONObject = rgbToHsl(hexToRgb(getDefaultColor(hoverColor)));
    var fontcolor = if (getLuminance(hsla, "hsla") < 0.3 && hsla.getNumber("a")!! > 0.1) {
        hslaToRgbCss(hsla);
    } else {
        hslaToRgbCss(object : UTSJSONObject() {
            var h = hsla.getNumber("h")!!
            var s = hsla.getNumber("s")!!
            var a = hsla.getNumber("a")!!
            var l: Number = 30
        });
    }
    ;
    var bordercolor = hslaToRgbCss(object : UTSJSONObject() {
        var h = hoverHsla.getNumber("h")!!
        var s = hoverHsla.getNumber("s")!!
        var a = hoverHsla.getNumber("a")!!
        var l = if (dark == true) {
            21;
        } else {
            92;
        }
    });
    var bgcolor = hslaToRgbCss(object : UTSJSONObject() {
        var h = hoverHsla.getNumber("h")!!
        var s = hoverHsla.getNumber("s")!!
        var a = hoverHsla.getNumber("a")!!
        var l = if (dark == true) {
            20;
        } else {
            95;
        }
    });
    var lightnum = getLuminance(hoverHsla, "hsla");
    if (dark) {
        var p = hsla;
        p.set("l", 98);
        fontcolor = hslaToRgbCss(p);
        p.set("l", 20);
        p.set("s", if (p.getNumber("s") != 0) {
            5;
        } else {
            20;
        }
        );
        bgcolor = hslaToRgbCss(p);
        p.set("l", 22);
        bordercolor = hslaToRgbCss(p);
    }
    var o: UTSJSONObject = object : UTSJSONObject() {
        var `default` = object : UTSJSONObject() {
            var background = bgcolor
            var borderColor = bordercolor
            var fontColor = fontcolor
            var shadow = "transparent"
        }
        var active = object : UTSJSONObject() {
            var background = hslaToRgbCss(object : UTSJSONObject() {
                var h = hoverHsla.getNumber("h")!!
                var s = if (dark) {
                    10;
                } else {
                    50;
                }
                var a = hoverHsla.getNumber("a")!!
                var l = if (dark == true) {
                    15;
                } else {
                    88;
                }
            })
            var borderColor = hslaToRgbCss(object : UTSJSONObject() {
                var h = hoverHsla.getNumber("h")!!
                var s = hoverHsla.getNumber("s")!!
                var a: Number = 0
                var l = if (dark == true) {
                    18;
                } else {
                    80;
                }
            })
            var fontColor = if (lightnum < 0.3 && hoverHsla.getNumber("a")!! > 0.1) {
                hslaToRgbCss(hoverHsla);
            } else {
                hslaToRgbCss(object : UTSJSONObject() {
                    var h = hoverHsla.getNumber("h")!!
                    var s = hoverHsla.getNumber("s")!!
                    var a = hoverHsla.getNumber("a")!!
                    var l: Number = 64
                });
            }
            var shadow = "transparent"
        }
    };
    return o;
}
fun getOutlineColorObj(color: String, hoverColor: String): UTSJSONObject {
    var hsla: UTSJSONObject = rgbToHsl(hexToRgb(getDefaultColor(color)));
    var hoverHsla: UTSJSONObject = rgbToHsl(hexToRgb(getDefaultColor(hoverColor)));
    var lightnum = getLuminance(hoverHsla, "hsla");
    var o: UTSJSONObject = object : UTSJSONObject() {
        var `default` = object : UTSJSONObject() {
            var background = "transparent"
            var borderColor = hslaToRgbCss(object : UTSJSONObject() {
                var h = hoverHsla.getNumber("h")!!
                var s = hoverHsla.getNumber("s")!!
                var a: Number = 1
                var l: Number = 75
            })
            var fontColor = if (lightnum < 0.6 && hsla.getNumber("a")!! > 0.1) {
                hslaToRgbCss(hsla);
            } else {
                hslaToRgbCss(object : UTSJSONObject() {
                    var h = hsla.getNumber("h")!!
                    var s = hsla.getNumber("s")!!
                    var a = hsla.getNumber("a")!!
                    var l: Number = 30
                });
            }
            var shadow = "transparent"
        }
        var active = object : UTSJSONObject() {
            var background = "transparent"
            var borderColor = hslaToRgbCss(object : UTSJSONObject() {
                var h = hoverHsla.getNumber("h")!!
                var s = hoverHsla.getNumber("s")!!
                var a: Number = 1
                var l: Number = 70
            })
            var fontColor = if (lightnum < 0.6 && hoverHsla.getNumber("a")!! > 0.1) {
                hslaToRgbCss(hoverHsla);
            } else {
                hslaToRgbCss(object : UTSJSONObject() {
                    var h = hoverHsla.getNumber("h")!!
                    var s = hoverHsla.getNumber("s")!!
                    var a = hoverHsla.getNumber("a")!!
                    var l: Number = 30
                });
            }
            var shadow = "transparent"
        }
    };
    return o;
}
fun setTextColorLightByDark(color: String): String {
    var realColor = getDefaultColor(color);
    var hsla = rgbToHsl(hexToRgb(realColor));
    var l = hsla.getNumber("l")!!;
    var s = hsla.getNumber("s")!!;
    if (l < 30) {
        if (s > 0) {
            hsla.set("l", 50);
        } else {
            hsla.set("l", 100);
        }
    }
    return hslaToRgbCss(hsla);
}
fun setBgColorLightByDark(color: String): String {
    var realColor = getDefaultColor(color);
    var hsla = rgbToHsl(hexToRgb(realColor));
    var l = hsla.getNumber("l")!!;
    var s = hsla.getNumber("s")!!;
    if (s == 0 && l > 50) {
        hsla.set("l", 100 - l);
    }
    if (s > 0) {
        if (l > 50) {
            hsla.set("l", 100 - l);
        }
    }
    return hslaToRgbCss(hsla);
}
fun isBlackAndWhite(color: String): Boolean {
    var realColor = getDefaultColor(color);
    var hsla = rgbToHsl(hexToRgb(realColor));
    var s = hsla.getNumber("s")!!;
    return s == 0;
}
fun isColorStyle(kVal: String): Boolean {
    return kVal.indexOf("background") > -1 || kVal.indexOf("color") > -1 || kVal.indexOf("Color") > -1;
}
fun getAttrCurrent(name: String, progress: Number, from: String, to: String): String {
    fun interpolate(startValue: Number, endValue: Number, progress: Number): Number {
        return startValue + (endValue - startValue) * progress;
    }
    var ns = parseFloat(from);
    var ne = parseFloat(to);
    if (isColorStyle(name)) {
        var startRgba = hexToRgb(if (from == "") {
            "rgba(0,0,0,0,0)";
        } else {
            from;
        }
        );
        var dndRgba = hexToRgb(to);
        var r = interpolate(startRgba.getNumber("r")!!, dndRgba.getNumber("r")!!, progress);
        var g = interpolate(startRgba.getNumber("g")!!, dndRgba.getNumber("g")!!, progress);
        var b = interpolate(startRgba.getNumber("b")!!, dndRgba.getNumber("b")!!, progress);
        var a = interpolate(startRgba.getNumber("a")!!, dndRgba.getNumber("a")!!, progress);
        return "rgba(" + r.toFixed(0) + "," + g.toFixed(0) + "," + b.toFixed(0) + "," + a.toFixed(1) + ")";
    }
    if (isNaN(ne)) {
        return "0";
    }
    ns = if (isNaN(ns)) {
        0;
    } else {
        (ns as Number);
    }
    ;
    return (ns + ne * progress).toFixed(2);
}
open class xRectNode {
    open var zIndex: Number = 0;
    open var id: String;
    open var width: Number;
    open var height: Number;
    open var x: Number;
    open var y: Number;
    open var fillColor: String;
    open var borderWidth: Number;
    open var borderColor: String;
    open var opacity: Number = 1;
    open var scaleX: Number = 1;
    open var scaleY: Number = 1;
    open var rotate: Number = 0;
    open var parent: xCanvas? = null;
    open var tween: xTween? = null;
    open var layer: xLayerNode? = null;
    open var animates = Map<String, XCANVAS_ANIMATION_CILDRENS>();
    open var animatesByattrname = Map<XCANVAS_ANIMATION_ATTRS, String>();
    open var events: Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL_SELF>> = Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL_SELF>>();
    open var globalCompositeOperation: XCANVAS_GLOBALOPERATION = "source-over";
    open var palyAniEnd: Boolean = true;
    constructor(ops: XRECT_OPTS){
        this.id = getUid(1, 10);
        this.width = ops.width;
        this.height = ops.height;
        this.x = ops.x;
        this.y = ops.y;
        this.fillColor = ops?.fillColor ?: "";
        this.borderColor = ops?.borderColor ?: "";
        this.borderWidth = ops?.borderWidth ?: 0;
        this.opacity = ops?.opacity ?: 1;
        this.scaleX = ops?.scaleX ?: 1;
        this.scaleY = ops?.scaleY ?: 1;
        this.rotate = ops?.rotate ?: 0;
        this.globalCompositeOperation = ops?.globalCompositeOperation ?: "source-over";
    }
    open fun draw(list: UTSArray<xTweenEventCallFunType>) {
        var aniend = true;
        var anis = list.filter(fun(el: xTweenEventCallFunType): Boolean {
            return this.animates.has(el.id);
        }
        );
        if (anis.length == 0) {
            this._drawer(1);
        } else {
            run {
                var i: Number = 0;
                while(i < anis.length){
                    var anisItem = anis[i];
                    this._drawer(anisItem.progress);
                    if (anisItem.progress != 1) {
                        aniend = false;
                    }
                    i++;
                }
            }
        }
        this.palyAniEnd = aniend;
    }
    open fun setParentAndXtween(parent: xCanvas, layer: xLayerNode, tweens: xTween) {
        this.parent = parent;
        this.tween = tweens;
        this.layer = layer;
    }
    private fun _getAniByAttrColor(name: XCANVAS_ANIMATION_ATTRS, progress: Number): String {
        var from = "";
        var aniId = this.animatesByattrname.get(name);
        var ani: XCANVAS_ANIMATION_CILDRENS? = null;
        if (aniId != null) {
            ani = this.animates.get(aniId);
        }
        if (name == "fillColor") {
            from = this.fillColor;
        } else if (name == "borderColor") {
            from = this.borderColor;
        }
        if (ani != null) {
            var item = ani!!;
            if (item.opts.from != "") {
                from = item.opts.from;
            }
            from = getAttrCurrent(name, progress, from, ani.opts.to);
        }
        return from;
    }
    private fun _getAniByAttr(name: XCANVAS_ANIMATION_ATTRS, progress: Number): Number {
        var from = "";
        var aniId = this.animatesByattrname.get(name);
        var ani: XCANVAS_ANIMATION_CILDRENS? = null;
        if (aniId != null) {
            ani = this.animates.get(aniId);
        }
        if (name == "x") {
            from = this.x.toString(10);
        } else if (name == "y") {
            from = this.y.toString(10);
        } else if (name == "width") {
            from = this.width.toString(10);
        } else if (name == "height") {
            from = this.height.toString(10);
        } else if (name == "borderWidth") {
            from = this.borderWidth.toString(10);
        } else if (name == "opacity") {
            from = this.opacity.toString(10);
        } else if (name == "scaleX") {
            from = this.scaleX.toString(10);
        } else if (name == "scaleY") {
            from = this.scaleY.toString(10);
        } else if (name == "rotate") {
            from = this.rotate.toString(10);
        }
        if (ani != null) {
            var item = ani!!;
            if (item.opts.from != "") {
                from = item.opts.from;
            }
            from = getAttrCurrent(name, progress, from, ani.opts.to);
        }
        return parseFloat(from);
    }
    private fun _drawer(progress: Number) {
        var ctx = this.parent!!.ctx;
        ctx.save();
        var x = this._getAniByAttr("x", progress);
        var y = this._getAniByAttr("y", progress);
        var scalex = this._getAniByAttr("scaleX", progress);
        var scaley = this._getAniByAttr("scaleY", progress);
        var width = this._getAniByAttr("width", progress);
        var height = this._getAniByAttr("height", progress);
        var rotate = this._getAniByAttr("rotate", progress);
        var widthScale = width * scalex;
        var heightScale = height * scaley;
        var diffWidth = (widthScale - width) / 2;
        var diffHeight = (heightScale - width) / 2;
        x = x - diffWidth + this.layer!!.x;
        y = y - diffHeight + this.layer!!.y;
        var opacity = this._getAniByAttr("opacity", progress);
        ctx.globalAlpha = opacity;
        ctx.globalCompositeOperation = this.globalCompositeOperation;
        ctx.translate(x + widthScale / 2, y + heightScale / 2);
        ctx.rotate(rotate * Math.PI / 180);
        x = -(widthScale / 2);
        y = -(heightScale / 2);
        if (this.fillColor != "") {
            var fillColor = this._getAniByAttrColor("fillColor", progress);
            ctx.fillStyle = fillColor;
            ctx.fillRect(x, y, widthScale, heightScale);
        }
        if (this.borderColor != "" && this.borderWidth != 0) {
            var borderWidth = this._getAniByAttr("borderWidth", progress);
            var borderColor = this._getAniByAttrColor("borderColor", progress);
            ctx.strokeStyle = borderColor;
            ctx.lineWidth = borderWidth;
            var oofsetx = borderWidth / 2;
            ctx.beginPath();
            ctx.rect(x + oofsetx, y + oofsetx, widthScale - borderWidth, heightScale - borderWidth);
            ctx.closePath();
            ctx.stroke();
        }
        ctx.restore();
        ctx.globalCompositeOperation = "source-over";
        ctx.globalAlpha = 1;
    }
    open fun addAnimation(opts: XCANVAS_ANIMATION) {
        var tw = this.tween!!;
        var dur = (opts?.duration ?: 300) as Number;
        var ani = xTweenAnimate(ease = (opts?.ease ?: "") as String, duration = dur);
        var realOpts = XCANVAS_ANIMATION_SELF(attr = opts.attr, from = (opts?.from ?: "") as String, to = opts.to, duration = dur);
        var id = tw.addAnimate(ani);
        this.animates.set(id, XCANVAS_ANIMATION_CILDRENS(opts = realOpts, xAnimation = ani));
        this.animatesByattrname.set(opts.attr, id);
    }
    open fun addEventListener(evetname: XCANVAS_EVENTS, call: (eventSelf: XCANVAS_EVENTS_TARGET, globallEvent: XCANVAS_EVENTS_TARGET) -> Unit) {
        var evtId = getUid(1, 10);
        var item = this.events.get(evetname);
        if (item == null) {
            this.events.set(evetname, utsArrayOf<XCANVAS_EVENTS_ALL_SELF>());
        }
        item = this.events.get(evetname);
        if (item != null) {
            item!!.push(XCANVAS_EVENTS_ALL_SELF(id = evtId, event = call));
        }
    }
    open fun removeEventListener(eventid: String, evetname: XCANVAS_EVENTS) {
        var item = this.events.get(evetname);
        if (item != null) {
            run {
                var i: Number = 0;
                while(i < item!!.length){
                    var eitem = item!![i];
                    if (eitem.id == eventid) {
                        item!!.splice(i, 1);
                        break;
                    }
                    i++;
                }
            }
        }
    }
    open fun buildEvents(evetname: XCANVAS_EVENTS, evtDetail: XCANVAS_EVENTS_TARGET) {
        var item = this.events.get(evetname);
        if (item != null) {
            var events = item!!;
            var movex = if (evtDetail.touchMovePos.x == 0) {
                0;
            } else {
                (evtDetail.touchMovePos.x - this.x);
            }
            ;
            var movey = if (evtDetail.touchMovePos.y == 0) {
                0;
            } else {
                (evtDetail.touchMovePos.y - this.y);
            }
            ;
            var obj = XCANVAS_EVENTS_TARGET(x = evtDetail.x - this.x, y = evtDetail.y - this.y, touchStartPos = XCANVAS_EVENTS_POS(x = evtDetail.touchStartPos.x - this.x, y = evtDetail.touchStartPos.y - this.y), touchEndPos = XCANVAS_EVENTS_POS(x = evtDetail.touchEndPos.x - this.x, y = evtDetail.touchEndPos.y - this.y), touchMovePos = XCANVAS_EVENTS_POS(x = movex, y = movey), touchMoveLen = evtDetail.touchMoveLen, touchEedLen = evtDetail.touchEedLen, event = evetname);
            if (this.isPointInsideRectangle(obj.x, obj.y, 0, 0, this.width, this.height)) {
                run {
                    var i: Number = 0;
                    while(i < events.length){
                        events[i].event(obj, evtDetail);
                        i++;
                    }
                }
            }
        }
    }
    open fun isPointInsideRectangle(px: Number, py: Number, rx: Number, ry: Number, rw: Number, rh: Number): Boolean {
        val isXInside = px >= rx && px <= rx + rw;
        val isYInside = py >= ry && py <= ry + rh;
        return isXInside && isYInside;
    }
}
fun getUid1(rdix: Number = 1, length: Number = 12): String {
    var ix = "";
    ix = Math.floor(Math.random() * rdix * Math.floor(Math.random() * Date.now())).toString(10).substring(0, length as Int);
    return ix;
}
open class xTween {
    private var frameId: Number? = null;
    open var isRuning: Boolean = false;
    open var isStoping: Boolean = true;
    open var frmae: Number = 0;
    open var isRendering = false;
    private var _callListFun: UTSArray<xTweenEventCallFunType> = utsArrayOf();
    private var _frema_starttimes: Number = 0;
    private var enters: (listAni: UTSArray<xTweenEventCallFunType>, tims: Number) -> Unit = fun(listAni: UTSArray<xTweenEventCallFunType>, tims: Number){};
    private var complete: () -> Unit = fun(){};
    private var easingList = Map<String, UTSArray<Number>>(utsArrayOf(
        utsArrayOf(
            "linear",
            utsArrayOf(
                0.250,
                0.250,
                0.750,
                0.750
            )
        ),
        utsArrayOf(
            "ease",
            utsArrayOf(
                0.250,
                0.100,
                0.250,
                1.000
            )
        ),
        utsArrayOf(
            "easeIn",
            utsArrayOf(
                0.420,
                0.000,
                1.000,
                1.000
            )
        ),
        utsArrayOf(
            "easeOut",
            utsArrayOf(
                0.000,
                0.000,
                0.580,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOut",
            utsArrayOf(
                0.420,
                0.000,
                0.580,
                1.000
            )
        ),
        utsArrayOf(
            "easeInQuad",
            utsArrayOf(
                0.550,
                0.085,
                0.680,
                0.530
            )
        ),
        utsArrayOf(
            "easeOutQuad",
            utsArrayOf(
                0.250,
                0.460,
                0.450,
                0.940
            )
        ),
        utsArrayOf(
            "easeInOutQuad",
            utsArrayOf(
                0.455,
                0.030,
                0.515,
                0.955
            )
        ),
        utsArrayOf(
            "easeInCubic",
            utsArrayOf(
                0.550,
                0.055,
                0.675,
                0.190
            )
        ),
        utsArrayOf(
            "easeOutCubic",
            utsArrayOf(
                0.215,
                0.610,
                0.355,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutCubic",
            utsArrayOf(
                0.645,
                0.045,
                0.355,
                1.000
            )
        ),
        utsArrayOf(
            "easeInQuart",
            utsArrayOf(
                0.895,
                0.030,
                0.685,
                0.220
            )
        ),
        utsArrayOf(
            "easeOutQuart",
            utsArrayOf(
                0.165,
                0.840,
                0.440,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutQuart",
            utsArrayOf(
                0.770,
                0.000,
                0.175,
                1.000
            )
        ),
        utsArrayOf(
            "easeInQuint",
            utsArrayOf(
                0.755,
                0.050,
                0.855,
                0.060
            )
        ),
        utsArrayOf(
            "easeOutQuint",
            utsArrayOf(
                0.230,
                1.000,
                0.320,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutQuint",
            utsArrayOf(
                0.860,
                0.000,
                0.070,
                1.000
            )
        ),
        utsArrayOf(
            "easeInSine",
            utsArrayOf(
                0.470,
                0.000,
                0.745,
                0.715
            )
        ),
        utsArrayOf(
            "easeOutSine",
            utsArrayOf(
                0.390,
                0.575,
                0.565,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutSine",
            utsArrayOf(
                0.445,
                0.050,
                0.550,
                0.950
            )
        ),
        utsArrayOf(
            "easeInExpo",
            utsArrayOf(
                0.950,
                0.050,
                0.795,
                0.035
            )
        ),
        utsArrayOf(
            "easeOutExpo",
            utsArrayOf(
                0.190,
                1.000,
                0.220,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutExpo",
            utsArrayOf(
                1.000,
                0.000,
                0.000,
                1.000
            )
        ),
        utsArrayOf(
            "easeInCirc",
            utsArrayOf(
                0.600,
                0.040,
                0.980,
                0.335
            )
        ),
        utsArrayOf(
            "easeOutCirc",
            utsArrayOf(
                0.075,
                0.820,
                0.165,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutBack",
            utsArrayOf(
                0.680,
                -0.550,
                0.265,
                1.550
            )
        ),
        utsArrayOf(
            "tmxEase",
            utsArrayOf(
                0.42,
                0.38,
                0.15,
                0.93
            )
        )
    ));
    constructor(){}
    open fun startRender(): xTween {
        this.isRendering = true;
        if (this.frameId == null) {
            this._run(this);
        }
        return this;
    }
    open fun destroy() {
        if (this.frameId != null) {
            cancelAnimationFrame(this.frameId!!);
        }
        this.frameId = null;
        this.isRendering = false;
    }
    open fun getFrame(): Number {
        return this.frmae;
    }
    open fun setComplete(call: () -> Unit): xTween {
        this.complete = call;
        return this;
    }
    open fun setEnter(call: (listAni: UTSArray<xTweenEventCallFunType>, tims: Number) -> Unit): xTween {
        this.enters = call;
        return this;
    }
    open fun addAnimate(opts: xTweenAnimate): String {
        var uid = getUid1();
        var call: xTweenEventCall = fun(item: xTweenEventCallFunType){};
        this._callListFun.push(xTweenEventCallFunType(id = uid, ease = this._getEasing(opts?.ease ?: "linear"), duration = opts.duration, status = 1, progress = 0, oldProgeress = 0, startTime = 0, autoRemove = if (opts?.autoRemove != null) {
            (opts!!.autoRemove as Boolean);
        } else {
            true;
        }
        , complete = if (opts?.complete != null) {
            opts!!.complete!!;
        } else {
            call;
        }
        , enter = if (opts?.enter != null) {
            opts!!.enter!!;
        } else {
            call;
        }
        , start = if (opts?.start != null) {
            opts!!.start!!;
        } else {
            call;
        }
        , pause = if (opts?.pause != null) {
            opts!!.pause!!;
        } else {
            call;
        }
        , loop = if (opts?.loop != null) {
            opts!!.loop!!;
        } else {
            1;
        }
        , tyty = if (opts?.tyty != null) {
            opts!!.tyty!!;
        } else {
            false;
        }
        , step = if (opts?.step != null) {
            opts!!.step!!;
        } else {
            1;
        }
        , _finishLoop = 0, reverse = false));
        return uid;
    }
    open fun removeAnimate(uid: String? = null): xTween {
        if (uid == null) {
            this._callListFun = utsArrayOf<xTweenEventCallFunType>();
        } else {
            var index = this._getCallIndex(uid as String);
            if (index > -1) {
                this._callListFun.splice(index, 1);
            }
        }
        return this;
    }
    open fun play(uid: String? = null) {
        if (uid != null && uid != "") {
            var index = this._getCallIndex(uid!! as String);
            if (index > -1) {
                var item = this._callListFun[index];
                if (item.status == 1) {
                    this._by_run_set_status(item, 1);
                    this._by_run_item_callFun(item, 0);
                }
                this._by_run_set_status(item, 4);
            }
        } else {
            run {
                var i: Number = 0;
                while(i < this._callListFun.length){
                    var item = this._callListFun[i];
                    if (item.status == 1) {
                        this._by_run_set_status(item, 1);
                        this._by_run_item_callFun(item, 0);
                    }
                    this._by_run_set_status(item, 4);
                    i++;
                }
            }
        }
        this._setGlobaleStatus(1);
    }
    open fun getAnimationListLen(): Number {
        return this._callListFun.length;
    }
    open fun pause(uid: String? = null): xTween {
        if (uid != null && uid != "") {
            var index = this._getCallIndex(uid!! as String);
            if (index > -1) {
                var item = this._callListFun[index];
                this._by_run_set_status(item, if (this._isLoopPauseing(item)) {
                    6;
                } else {
                    3;
                }
                );
                this._by_run_item_callFun(item, item.progress);
            }
        } else {
            run {
                var i: Number = 0;
                while(i < this._callListFun.length){
                    var item = this._callListFun[i];
                    this._by_run_set_status(item, if (this._isLoopPauseing(item)) {
                        6;
                    } else {
                        3;
                    }
                    );
                    this._by_run_item_callFun(item, item.progress);
                    i++;
                }
            }
            this._setGlobaleStatus(2);
        }
        return this;
    }
    open fun stop(uid: String? = null): xTween {
        if (uid != null && uid != "") {
            var index = this._getCallIndex(uid!! as String);
            if (index > -1) {
                var item = this._callListFun[index];
                this._by_run_set_status(item, 2);
                this._by_run_item_callFun(item, 1);
            }
        } else {
            run {
                var i: Number = 0;
                while(i < this._callListFun.length){
                    var item = this._callListFun[i];
                    this._by_run_set_status(item, 2);
                    this._by_run_item_callFun(item, 1);
                    i++;
                }
            }
            this._callListFun = this._callListFun.filter(fun(el: xTweenEventCallFunType): Boolean {
                return !el.autoRemove;
            }
            );
            this.enters(this._callListFun, 0);
        }
        return this;
    }
    private fun _getEasing(args: Any): xTweenCallbackFunType? {
        var kFun: xTweenCallbackFunType? = fun(x: Number): Number {
            return x;
        }
        ;
        if (UTSAndroid.`typeof`( args) == "string") {
            var animateNumber = this.easingList.get(args as String);
            if (animateNumber != null) {
                var ease = animateNumber!! as UTSArray<Number>;
                kFun = bezier(ease[0], ease[1], ease[2], ease[3]);
            }
        } else if (UTSArray.isArray(args)) {
            var argsar = args as UTSArray<Number>;
            if (argsar.length == 4) {
                kFun = bezier(argsar[0], argsar[1], argsar[2], argsar[3]);
            }
        } else {
            var animateNumber = this.easingList.get("linear");
            if (animateNumber != null) {
                var ease = animateNumber!! as UTSArray<Number>;
                kFun = bezier(ease[0], ease[1], ease[2], ease[3]);
            }
        }
        return kFun;
    }
    private fun _getCallIndex(uid: String): Number {
        var index: Number = -1;
        run {
            var i: Number = 0;
            while(i < this._callListFun.length){
                var item = this._callListFun[i];
                if (item.id == uid) {
                    index = i;
                    break;
                }
                i++;
            }
        }
        return index;
    }
    private fun _isLoopPauseing(item: xTweenEventCallFunType): Boolean {
        if (item.loop == -1) {
            return true;
        }
        if (item._finishLoop < item.loop) {
            return true;
        }
        return false;
    }
    private fun _by_run_set_status(item: xTweenEventCallFunType, status: xTweenStatus) {
        if (status == 1) {
            item.progress = 0;
            item.startTime = 0;
            item._finishLoop = 0;
        } else if (status == 2) {
            item.progress = 1;
            item.oldProgeress = 0;
            item.startTime = 0;
            item._finishLoop = item.loop;
        } else if (status == 3) {
            item.startTime = 0;
            item.oldProgeress = item.progress;
        } else if (status == 5) {
            item.progress = 0;
            item.oldProgeress = 0;
            item.startTime = 0;
        } else if (status == 6) {
            item.oldProgeress = item.progress;
            item.startTime = 0;
        }
        item.status = status;
    }
    private fun _by_run_item_callFun(item: xTweenEventCallFunType, progress: Number) {
        if (item.status == 1) {
            item.start(item);
        }
        if (item.status == 2) {
            item.enter(item);
            item.complete(item);
            if (item.autoRemove) {
                var index = this._getCallIndex(item.id);
                if (index > -1) {
                    this._callListFun.splice(index, 1);
                }
            }
        }
        if (item.status == 3) {
            item.pause(item);
        }
        if (item.status == 4 || item.status == 5) {
            item.enter(item);
        }
    }
    private fun _setGlobaleStatus(type: Number) {
        if (type == 1) {
            this.isRuning = true;
            this.isStoping = false;
        } else if (type == 2) {
            this.isRuning = false;
            this.isStoping = true;
        }
    }
    private fun _run(_this: xTween) {
        if (!_this.isRendering) {
            return;
        }
        _this.frameId = requestAnimationFrame(fun(times: Number){
            _this.enters(_this._callListFun, times);
            if (_this._frema_starttimes == 0) {
                _this._frema_starttimes = times;
            }
            var isAllCompelted = true;
            run {
                var i: Number = 0;
                while(i < _this._callListFun.length){
                    var item = _this._callListFun[i];
                    var isFinishStatus: Number = 1;
                    if (item.status == 4 || item.status == 5) {
                        if (item.startTime == 0) {
                            item.startTime = times;
                        }
                        if (_this.frmae > 0) {
                            var progress = Math.min((times - item.startTime) / item.duration + item.oldProgeress, 1);
                            var eas = item.ease!!;
                            item.progress = eas(progress);
                            if (progress == isFinishStatus) {
                                item._finishLoop += 1;
                                if (item.loop > 0) {
                                    if (item.loop == item._finishLoop) {
                                        _this._by_run_set_status(item, 2);
                                        _this._by_run_item_callFun(item, isFinishStatus);
                                    } else {
                                        _this._by_run_set_status(item, 5);
                                    }
                                } else if (item.loop == -1) {
                                    _this._by_run_set_status(item, 5);
                                }
                                if (item.tyty) {
                                    item.reverse = !item.reverse;
                                }
                            }
                            _this._by_run_item_callFun(item, item.progress);
                        }
                    }
                    if (item.progress != 2) {
                        isAllCompelted = false;
                    }
                    i++;
                }
            }
            if (isAllCompelted && _this.isRuning) {
                _this.complete();
                _this._setGlobaleStatus(2);
            }
            _this.frmae = Math.ceil((1000 as Number) / (times - _this._frema_starttimes));
            _this._frema_starttimes = times;
            _this._run(_this);
        }
        );
    }
}
fun getDarkMode(): String {
    var dark = getOsTheme();
    var model = "light" as String;
    if (dark == "dark" || dark == "light") {
        model = dark;
    }
    var customSetings = uni_getStorageSync("tmuiXuiOsThemeSet");
    if (customSetings != null && customSetings != "auto" && customSetings != "") {
        var dsd = customSetings as String;
        if (dark == "dark" || dark == "light") {
            model = dsd as String;
        }
    }
    return model;
}
open class xLineNode {
    open var id: String;
    open var zIndex: Number = 0;
    open var x: Number;
    open var y: Number;
    open var tx: Number;
    open var ty: Number;
    open var globaX: Number = 0;
    open var globaY: Number = 0;
    open var borderWidth: Number;
    open var borderColor: String;
    open var opacity: Number = 1;
    open var parent: xCanvas? = null;
    open var tween: xTween? = null;
    open var layer: xLayerNode? = null;
    open var animates = Map<String, XCANVAS_ANIMATION_CILDRENS>();
    open var animatesByattrname = Map<XCANVAS_ANIMATION_ATTRS, String>();
    open var events: Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL_SELF>> = Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL_SELF>>();
    open var globalCompositeOperation: XCANVAS_GLOBALOPERATION = "source-over";
    open var palyAniEnd: Boolean = true;
    constructor(ops: XLINE_OPTS){
        this.id = getUid(1, 10);
        this.x = ops.x;
        this.y = ops.y;
        this.tx = ops.tx;
        this.ty = ops.ty;
        this.borderColor = ops?.borderColor ?: "";
        this.borderWidth = ops?.borderWidth ?: 0;
        this.opacity = ops?.opacity ?: 1;
        this.globalCompositeOperation = ops?.globalCompositeOperation ?: "source-over";
    }
    open fun draw(list: UTSArray<xTweenEventCallFunType>) {
        var aniend = true;
        var anis = list.filter(fun(el: xTweenEventCallFunType): Boolean {
            return this.animates.has(el.id);
        }
        );
        if (anis.length == 0) {
            this._drawer(1);
        } else {
            run {
                var i: Number = 0;
                while(i < anis.length){
                    var anisItem = anis[i];
                    this._drawer(anisItem.progress);
                    if (anisItem.progress != 1) {
                        aniend = false;
                    }
                    i++;
                }
            }
        }
        this.palyAniEnd = aniend;
    }
    open fun setParentAndXtween(parent: xCanvas, layer: xLayerNode, tweens: xTween) {
        this.parent = parent;
        this.tween = tweens;
        this.layer = layer;
    }
    private fun _getAniByAttrColor(name: XCANVAS_ANIMATION_ATTRS, progress: Number): String {
        var from = "";
        var aniId = this.animatesByattrname.get(name);
        var ani: XCANVAS_ANIMATION_CILDRENS? = null;
        if (aniId != null) {
            ani = this.animates.get(aniId);
        }
        if (name == "borderColor") {
            from = this.borderColor;
        }
        if (ani != null) {
            var item = ani!!;
            if (item.opts.from != "") {
                from = item.opts.from;
            }
            from = getAttrCurrent(name, progress, from, ani.opts.to);
        }
        return from;
    }
    private fun _getAniByAttr(name: XCANVAS_ANIMATION_ATTRS, progress: Number): Number {
        var from = "";
        var aniId = this.animatesByattrname.get(name);
        var ani: XCANVAS_ANIMATION_CILDRENS? = null;
        if (aniId != null) {
            ani = this.animates.get(aniId);
        }
        if (name == "x") {
            from = this.x.toString(10);
        } else if (name == "y") {
            from = this.y.toString(10);
        } else if (name == "borderWidth") {
            from = this.borderWidth.toString(10);
        } else if (name == "opacity") {
            from = this.opacity.toString(10);
        } else if (name == "tx") {
            from = this.tx.toString(10);
        } else if (name == "ty") {
            from = this.ty.toString(10);
        }
        if (ani != null) {
            var item = ani!!;
            if (item.opts.from != "") {
                from = item.opts.from;
            }
            from = getAttrCurrent(name, progress, from, ani.opts.to);
        }
        return parseFloat(from);
    }
    private fun _drawer(progress: Number) {
        var ctx = this.parent!!.ctx;
        ctx.save();
        var x = this._getAniByAttr("x", progress);
        var y = this._getAniByAttr("y", progress);
        var tx = this._getAniByAttr("tx", progress);
        var ty = this._getAniByAttr("ty", progress);
        x = x + this.layer!!.x;
        y = y + this.layer!!.y;
        tx = tx + this.layer!!.x;
        ty = ty + this.layer!!.y;
        this.globaX = x;
        this.globaY = y;
        var opacity = this._getAniByAttr("opacity", progress);
        ctx.globalAlpha = opacity;
        ctx.globalCompositeOperation = this.globalCompositeOperation;
        if (this.borderWidth != 0) {
            var borderWidth = this._getAniByAttr("borderWidth", progress);
            var borderColor = this._getAniByAttrColor("borderColor", progress);
            ctx.strokeStyle = borderColor;
            ctx.lineWidth = borderWidth;
            ctx.beginPath();
            ctx.moveTo(x, y);
            ctx.lineTo(tx, ty);
            ctx.closePath();
            ctx.stroke();
        }
        ctx.restore();
        ctx.globalAlpha = 1;
        ctx.globalCompositeOperation = "source-over";
    }
    open fun addAnimation(opts: XCANVAS_ANIMATION) {
        var tw = this.tween!!;
        var dur = (opts?.duration ?: 300) as Number;
        var ani = xTweenAnimate(ease = (opts?.ease ?: "") as String, duration = dur);
        var realOpts = XCANVAS_ANIMATION_SELF(attr = opts.attr, from = (opts?.from ?: "") as String, to = opts.to, duration = dur);
        var id = tw.addAnimate(ani);
        this.animates.set(id, XCANVAS_ANIMATION_CILDRENS(opts = realOpts, xAnimation = ani));
        this.animatesByattrname.set(opts.attr, id);
    }
    open fun addEventListener(evetname: XCANVAS_EVENTS, call: (eventSelf: XCANVAS_EVENTS_TARGET, globallEvent: XCANVAS_EVENTS_TARGET) -> Unit) {
        var evtId = getUid(1, 10);
        var item = this.events.get(evetname);
        if (item == null) {
            this.events.set(evetname, utsArrayOf<XCANVAS_EVENTS_ALL_SELF>());
        }
        item = this.events.get(evetname);
        if (item != null) {
            item!!.push(XCANVAS_EVENTS_ALL_SELF(id = evtId, event = call));
        }
    }
    open fun removeEventListener(eventid: String, evetname: XCANVAS_EVENTS) {
        var item = this.events.get(evetname);
        if (item != null) {
            run {
                var i: Number = 0;
                while(i < item!!.length){
                    var eitem = item!![i];
                    if (eitem.id == eventid) {
                        item!!.splice(i, 1);
                        break;
                    }
                    i++;
                }
            }
        }
    }
    open fun buildEvents(evetname: XCANVAS_EVENTS, evtDetail: XCANVAS_EVENTS_TARGET) {
        var item = this.events.get(evetname);
        if (item != null) {
            var events = item!!;
            var movex = if (evtDetail.touchMovePos.x == 0) {
                0;
            } else {
                (evtDetail.touchMovePos.x - this.x);
            }
            ;
            var movey = if (evtDetail.touchMovePos.y == 0) {
                0;
            } else {
                (evtDetail.touchMovePos.y - this.y);
            }
            ;
            var obj = XCANVAS_EVENTS_TARGET(x = evtDetail.x - this.x, y = evtDetail.y - this.y, touchStartPos = XCANVAS_EVENTS_POS(x = evtDetail.touchStartPos.x - this.x, y = evtDetail.touchStartPos.y - this.y), touchEndPos = XCANVAS_EVENTS_POS(x = evtDetail.touchEndPos.x - this.x, y = evtDetail.touchEndPos.y - this.y), touchMovePos = XCANVAS_EVENTS_POS(x = movex, y = movey), touchMoveLen = evtDetail.touchMoveLen, touchEedLen = evtDetail.touchEedLen, event = evetname);
            if (this.isPointInsideRectangle(this.parent!!.touch_end_x, this.parent!!.touch_end_y, this.globaX, this.globaY, this.tx + this.globaX, this.ty + this.globaY)) {
                run {
                    var i: Number = 0;
                    while(i < events.length){
                        events[i].event(obj, evtDetail);
                        i++;
                    }
                }
            }
        }
    }
    open fun isPointInsideRectangle(x: Number, y: Number, x1: Number, y1: Number, x2: Number, y2: Number): Boolean {
        var lineWidth = this.borderWidth;
        var ABx = x2 - x1;
        var ABy = y2 - y1;
        var APx = x - x1;
        var APy = y - y1;
        var crossProduct = Math.abs(ABx * APy - ABy * APx);
        var dotProduct = ABx * APx + ABy * APy;
        if (crossProduct === 0) {
            if (dotProduct < 0) {
                return false;
            }
            var ABLengthSquared = ABx * ABx + ABy * ABy;
            if (dotProduct > ABLengthSquared) {
                return false;
            }
            var distanceSquared = crossProduct * crossProduct / ABLengthSquared;
            return distanceSquared <= (lineWidth * lineWidth) / 4;
        }
        return false;
    }
}
open class xCanvas {
    open var canvas: UniCanvasElement;
    open var ctx: CanvasRenderingContext2D;
    open var width: Number;
    open var height: Number;
    open var boxWidth: Number;
    open var boxHeight: Number;
    open var dpr: Number = 1;
    open var layerGroup: UTSArray<xLayerNode> = utsArrayOf();
    open var tween: xTween;
    open var touch_x: Number = 0;
    open var touch_y: Number = 0;
    open var touch_move_x: Number = 0;
    open var touch_move_y: Number = 0;
    open var touch_end_x: Number = 0;
    open var touch_end_y: Number = 0;
    open var touch_end_len_x: Number = 0;
    open var touch_end_len_y: Number = 0;
    open var touch_move_len_x: Number = 0;
    open var touch_move_len_y: Number = 0;
    open var touchStartTime: Number = 0;
    open var touchEndTime: Number = 0;
    open var touchTimeTid: Number = 0;
    open var events: Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL>> = Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL>>();
    open var palyAniEnd: Boolean = true;
    constructor(dom: UniCanvasElement){
        val dpr = uni_getDeviceInfo(null).devicePixelRatio ?: 1;
        dom.width = dom.offsetWidth * dpr;
        dom.height = dom.offsetHeight * dpr;
        this.dpr = dpr;
        this.canvas = dom;
        this.ctx = dom.getContext("2d")!!;
        this.ctx.resetTransform();
        this.ctx.globalAlpha = 1;
        this.ctx.scale(dpr, dpr);
        this.width = dom.width;
        this.height = dom.height;
        this.tween = xTween();
        this.boxWidth = dom.offsetWidth;
        this.boxHeight = dom.offsetHeight;
    }
    open fun addLayer(layer: UTSArray<xLayerNode>) {
        run {
            var i: Number = 0;
            while(i < layer.length){
                var item = layer[i];
                item.setParentAndXtween(this, this.tween);
                i++;
            }
        }
        this.layerGroup.push(*layer.toTypedArray());
    }
    open fun removeLayer(layer: xLayerNode) {
        var index: Number = -1;
        run {
            var i: Number = 0;
            while(i < this.layerGroup.length){
                var item = this.layerGroup[i];
                if (item.id == layer.id) {
                    index = i;
                    break;
                }
                i++;
            }
        }
        if (index > -1) {
            this.layerGroup.splice(index, 1);
        }
    }
    open fun getRender(): CanvasRenderingContext2D {
        return this.ctx;
    }
    open fun getShapes(): UTSArray<Any> {
        var shapes: UTSArray<Any> = utsArrayOf();
        run {
            var i: Number = 0;
            while(i < this.layerGroup.length){
                run {
                    var j: Number = 0;
                    while(j < this.layerGroup[i].shapes.length){
                        shapes.push(this.layerGroup[i].shapes[j]);
                        j++;
                    }
                }
                i++;
            }
        }
        shapes.sort(fun(a, b): Number {
            var aZindex: Number = 0;
            var bZindex: Number = 0;
            return aZindex - bZindex;
        }
        );
        return shapes;
    }
    open fun draw() {
        var _this = this;
        this.tween.pause();
        this.tween.destroy();
        this.tween!!.setEnter(fun(animations: UTSArray<xTweenEventCallFunType>, times: Number){
            this.ctx.clearRect(0, 0, this.width, this.height);
            var aniend = true;
            run {
                var i: Number = 0;
                while(i < _this.layerGroup.length){
                    var layer = _this.layerGroup[i];
                    layer.draw(animations);
                    if (!layer.palyAniEnd) {
                        aniend = false;
                    }
                    i++;
                }
            }
            _this.palyAniEnd = aniend;
            if (aniend) {
                _this.tween.destroy();
                console.log("渲染完毕");
            }
        }
        );
        if (this.tween.isRendering) {
            this.tween.stop();
            this.tween.destroy();
        }
        this.tween.startRender();
        this.tween!!.play();
    }
    open fun destroy() {
        this.tween.pause();
        this.tween.destroy();
    }
    open fun clear() {
        this.ctx.clearRect(0, 0, this.width, this.height);
    }
    open fun touchStart(detail: XCANVAS_EVENTS_DETAIL) {
        this.buildEvents("down");
    }
    open fun touchMove(detail: XCANVAS_EVENTS_DETAIL) {
        this.buildEvents("move");
    }
    open fun touchEnd(detail: XCANVAS_EVENTS_DETAIL) {
        this.buildEvents("up");
    }
    open fun click(detail: XCANVAS_EVENTS_DETAIL) {
        this.buildEvents("click");
    }
    open fun longpress(detail: XCANVAS_EVENTS_DETAIL) {
        this.buildEvents("longpress");
    }
    open fun dbclick(detail: XCANVAS_EVENTS_DETAIL) {
        this.buildEvents("dbclick");
    }
    open fun setEvent(evetname: XCANVAS_EVENTS, detail: XCANVAS_EVENTS_DETAIL) {
        clearTimeout(this.touchTimeTid);
        var bound = this.canvas.getBoundingClientRect()!!;
        var x = detail.x - bound.x;
        var y = detail.y - bound.y;
        if (evetname == "down") {
            this.touchStartTime = Date.now();
            this.touch_x = x;
            this.touch_y = y;
            this.touchStart(detail);
            var _this = this;
            this.touchTimeTid = setTimeout(fun(){
                if (_this.touch_move_x == 0 && _this.touch_move_y == 0) {
                    _this.longpress(detail);
                }
            }
            , 800);
        }
        if (evetname == "move") {
            this.touch_move_len_x = this.touch_move_x - x;
            this.touch_move_len_y = this.touch_move_y - y;
            this.touch_move_x = x;
            this.touch_move_y = y;
            this.touchMove(detail);
        }
        if (evetname == "up") {
            this.touchEnd(detail);
            var nowdate = Date.now();
            var diffTime = Math.abs(this.touchStartTime - nowdate);
            var diif_x = this.touch_x - x;
            var diif_y = this.touch_y - y;
            var diffTimeDbclick = Math.abs(this.touchEndTime - nowdate);
            this.touch_end_x = x;
            this.touch_end_y = y;
            this.touch_end_len_x = diif_x;
            this.touch_end_len_y = diif_y;
            if (diffTime > 50 && diffTime < 250 && Math.abs(diif_x) == 0 && Math.abs(diif_y) == 0) {
                this.click(detail);
            }
            if (diffTimeDbclick < 300 && this.touchEndTime != 0 && diffTimeDbclick > 50) {
                this.dbclick(detail);
                this.touchEndTime = 0;
            } else {
                this.touchEndTime = Date.now();
            }
            this.touch_move_x = 0;
            this.touch_move_y = 0;
        }
    }
    open fun addEventListener(evetname: XCANVAS_EVENTS, call: (event: XCANVAS_EVENTS_TARGET) -> Unit) {
        var evtId = getUid(1, 10);
        var item = this.events.get(evetname);
        if (item == null) {
            this.events.set(evetname, utsArrayOf<XCANVAS_EVENTS_ALL>());
        }
        item = this.events.get(evetname);
        if (item != null) {
            item!!.push(XCANVAS_EVENTS_ALL(id = evtId, event = call));
        }
    }
    open fun removeEventListener(eventid: String, evetname: XCANVAS_EVENTS) {
        var item = this.events.get(evetname);
        if (item != null) {
            run {
                var i: Number = 0;
                while(i < item!!.length){
                    var eitem = item!![i];
                    if (eitem.id == eventid) {
                        item!!.splice(i, 1);
                        break;
                    }
                    i++;
                }
            }
        }
    }
    private fun buildEvents(evetname: XCANVAS_EVENTS) {
        var item = this.events.get(evetname);
        var allShapes = this.getShapes();
        console.log(allShapes);
        var obj = XCANVAS_EVENTS_TARGET(x = this.touch_x, y = this.touch_y, touchStartPos = XCANVAS_EVENTS_POS(x = this.touch_x, y = this.touch_x), touchEndPos = XCANVAS_EVENTS_POS(x = this.touch_end_x, y = this.touch_end_y), touchMovePos = XCANVAS_EVENTS_POS(x = this.touch_move_x, y = this.touch_move_y), touchMoveLen = XCANVAS_EVENTS_POS(x = this.touch_move_len_x, y = this.touch_move_len_y), touchEedLen = XCANVAS_EVENTS_POS(x = this.touch_end_len_x, y = this.touch_end_len_y), event = evetname);
        if (item != null) {
            var events = item!!;
            run {
                var i: Number = 0;
                while(i < events.length){
                    events[i].event(obj);
                    i++;
                }
            }
        }
    }
}
open class DRAWER_TEXT_LINES (
    @JsonNotNull
    open var str: String,
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    @JsonNotNull
    open var bottom: Number,
) : UTSObject()
open class xTextNode {
    open var id: String;
    open var zIndex: Number = 0;
    open var content: String;
    open var x: Number;
    open var y: Number;
    open var maxWidth: Number;
    open var textAlign: String;
    open var textBaseline: String;
    open var fillColor: String;
    open var fontSize: Number;
    open var fontFamily: String;
    open var borderWidth: Number;
    open var borderColor: String;
    open var opacity: Number = 1;
    open var parent: xCanvas? = null;
    open var tween: xTween? = null;
    open var layer: xLayerNode? = null;
    open var animates = Map<String, XCANVAS_ANIMATION_CILDRENS>();
    open var animatesByattrname = Map<XCANVAS_ANIMATION_ATTRS, String>();
    open var events: Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL_SELF>> = Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL_SELF>>();
    open var palyAniEnd: Boolean = true;
    constructor(ops: XTEXT_OPTS){
        this.id = getUid(1, 10);
        this.x = ops.x;
        this.y = ops.y;
        this.content = ops.content;
        this.borderColor = ops?.borderColor ?: "";
        this.fillColor = ops?.fillColor ?: "#000000";
        this.borderWidth = ops?.borderWidth ?: 0;
        this.opacity = ops?.opacity ?: 1;
        this.maxWidth = ops?.maxWidth ?: 0;
        this.fontSize = ops?.fontSize ?: 10;
        this.fontFamily = ops?.fontFamily ?: "Aril";
        this.textAlign = ops?.textAlign ?: "left";
        this.textBaseline = ops?.textBaseline ?: "top";
    }
    open fun draw(list: UTSArray<xTweenEventCallFunType>) {
        var aniend = true;
        var anis = list.filter(fun(el: xTweenEventCallFunType): Boolean {
            return this.animates.has(el.id);
        }
        );
        if (anis.length == 0) {
            this._drawer(1);
        } else {
            run {
                var i: Number = 0;
                while(i < anis.length){
                    var anisItem = anis[i];
                    this._drawer(anisItem.progress);
                    if (anisItem.progress != 1) {
                        aniend = false;
                    }
                    i++;
                }
            }
        }
        this.palyAniEnd = aniend;
    }
    open fun setParentAndXtween(parent: xCanvas, layer: xLayerNode, tweens: xTween) {
        this.parent = parent;
        this.tween = tweens;
        this.layer = layer;
    }
    private fun _getAniByAttrColor(name: XCANVAS_ANIMATION_ATTRS, progress: Number): String {
        var from = "";
        var aniId = this.animatesByattrname.get(name);
        var ani: XCANVAS_ANIMATION_CILDRENS? = null;
        if (aniId != null) {
            ani = this.animates.get(aniId);
        }
        if (name == "fillColor") {
            from = this.fillColor;
        } else if (name == "borderColor") {
            from = this.borderColor;
        }
        if (ani != null) {
            var item = ani!!;
            if (item.opts.from != "") {
                from = item.opts.from;
            }
            from = getAttrCurrent(name, progress, from, ani.opts.to);
        }
        return from;
    }
    private fun _getAniByAttr(name: XCANVAS_ANIMATION_ATTRS, progress: Number): Number {
        var from = "";
        var aniId = this.animatesByattrname.get(name);
        var ani: XCANVAS_ANIMATION_CILDRENS? = null;
        if (aniId != null) {
            ani = this.animates.get(aniId);
        }
        if (name == "x") {
            from = this.x.toString(10);
        } else if (name == "y") {
            from = this.y.toString(10);
        } else if (name == "borderWidth") {
            from = this.borderWidth.toString(10);
        } else if (name == "opacity") {
            from = this.opacity.toString(10);
        } else if (name == "fontSize") {
            from = this.fontSize.toString(10);
        }
        if (ani != null) {
            var item = ani!!;
            if (item.opts.from != "") {
                from = item.opts.from;
            }
            from = getAttrCurrent(name, progress, from, ani.opts.to);
        }
        return parseFloat(from);
    }
    private fun _textTextWidth(str: String): UTSArray<DRAWER_TEXT_LINES> {
        var maxWidth = this.maxWidth;
        if (maxWidth == 0) {
            maxWidth = this.parent!!.boxWidth;
        }
        var words = str.split("");
        var lines = utsArrayOf<DRAWER_TEXT_LINES>();
        var fontSize = this.fontSize;
        var lineHeight = fontSize / 2;
        var strbase = "";
        var y = this.y;
        var nowwidth: Number = 0;
        run {
            var i: Number = 0;
            while(i < words.length){
                var itemText = words[i];
                nowwidth += fontSize;
                strbase += itemText;
                if (UTSRegExp("^[A-Za-z0-9!-~\\s]\$", "").test(itemText)) {
                    var wordWidth = this.parent!!.ctx.measureText(itemText).width;
                    nowwidth = if (nowwidth == 0) {
                        0;
                    } else {
                        (nowwidth - fontSize + wordWidth);
                    }
                    ;
                }
                if (nowwidth > maxWidth - fontSize) {
                    lines.push(DRAWER_TEXT_LINES(x = this.x, y = y, bottom = y + fontSize, str = strbase));
                    strbase = "";
                    nowwidth = 0;
                    y += fontSize + lineHeight;
                }
                i++;
            }
        }
        if (strbase != "") {
            lines.push(DRAWER_TEXT_LINES(x = this.x, y = y, bottom = y + fontSize, str = strbase));
        }
        return lines;
    }
    private fun _drawer(progress: Number) {
        var ctx = this.parent!!.ctx;
        ctx.save();
        var x = this._getAniByAttr("x", progress);
        var y = this._getAniByAttr("y", progress);
        var fontSize = this._getAniByAttr("fontSize", progress);
        var fillColor = this._getAniByAttrColor("fillColor", progress);
        x = x + this.layer!!.x;
        y = y + this.layer!!.y;
        var opacity = this._getAniByAttr("opacity", progress);
        ctx.globalAlpha = opacity;
        ctx.fillStyle = fillColor;
        ctx.font = "" + fontSize + "px " + this.fontFamily;
        ctx.textAlign = this.textAlign;
        ctx.textBaseline = this.textBaseline;
        var strs = this._textTextWidth(this.content);
        run {
            var i: Number = 0;
            while(i < strs.length){
                var item = strs[i];
                ctx.fillText(item.str, item.x, item.y);
                i++;
            }
        }
        if (this.borderWidth != 0) {
            var borderWidth = this._getAniByAttr("borderWidth", progress);
            var borderColor = this._getAniByAttrColor("borderColor", progress);
            ctx.strokeStyle = borderColor;
            ctx.lineWidth = borderWidth;
            ctx.beginPath();
            if (this.maxWidth <= 0) {
                ctx.strokeText(this.content, x, y);
            } else {
                ctx.strokeText(this.content, x, y, this.maxWidth);
            }
            ctx.closePath();
            ctx.stroke();
        }
        ctx.restore();
        ctx.globalAlpha = 1;
    }
    open fun addAnimation(opts: XCANVAS_ANIMATION) {
        var tw = this.tween!!;
        var dur = (opts?.duration ?: 300) as Number;
        var ani = xTweenAnimate(ease = (opts?.ease ?: "") as String, duration = dur);
        var realOpts = XCANVAS_ANIMATION_SELF(attr = opts.attr, from = (opts?.from ?: "") as String, to = opts.to, duration = dur);
        var id = tw.addAnimate(ani);
        this.animates.set(id, XCANVAS_ANIMATION_CILDRENS(opts = realOpts, xAnimation = ani));
        this.animatesByattrname.set(opts.attr, id);
    }
    open fun addEventListener(evetname: XCANVAS_EVENTS, call: (eventSelf: XCANVAS_EVENTS_TARGET, globallEvent: XCANVAS_EVENTS_TARGET) -> Unit) {
        var evtId = getUid(1, 10);
        var item = this.events.get(evetname);
        if (item == null) {
            this.events.set(evetname, utsArrayOf<XCANVAS_EVENTS_ALL_SELF>());
        }
        item = this.events.get(evetname);
        if (item != null) {
            item!!.push(XCANVAS_EVENTS_ALL_SELF(id = evtId, event = call));
        }
    }
    open fun removeEventListener(eventid: String, evetname: XCANVAS_EVENTS) {
        var item = this.events.get(evetname);
        if (item != null) {
            run {
                var i: Number = 0;
                while(i < item!!.length){
                    var eitem = item!![i];
                    if (eitem.id == eventid) {
                        item!!.splice(i, 1);
                        break;
                    }
                    i++;
                }
            }
        }
    }
    open fun buildEvents(evetname: XCANVAS_EVENTS, evtDetail: XCANVAS_EVENTS_TARGET) {
        var item = this.events.get(evetname);
        if (item != null) {
            var events = item!!;
            var movex = if (evtDetail.touchMovePos.x == 0) {
                0;
            } else {
                (evtDetail.touchMovePos.x - this.x);
            }
            ;
            var movey = if (evtDetail.touchMovePos.y == 0) {
                0;
            } else {
                (evtDetail.touchMovePos.y - this.y);
            }
            ;
            var obj = XCANVAS_EVENTS_TARGET(x = evtDetail.x - this.x, y = evtDetail.y - this.y, touchStartPos = XCANVAS_EVENTS_POS(x = evtDetail.touchStartPos.x - this.x, y = evtDetail.touchStartPos.y - this.y), touchEndPos = XCANVAS_EVENTS_POS(x = evtDetail.touchEndPos.x - this.x, y = evtDetail.touchEndPos.y - this.y), touchMovePos = XCANVAS_EVENTS_POS(x = movex, y = movey), touchMoveLen = evtDetail.touchMoveLen, touchEedLen = evtDetail.touchEedLen, event = evetname);
            var maxWidth = this.maxWidth;
            if (maxWidth == 0) {
                maxWidth = this.parent!!.boxWidth;
            }
            var lines = this._textTextWidth(this.content);
            var y: Number = 0;
            if (lines.length > 0) {
                y = lines[lines.length - 1].bottom;
            }
            if (this.isPointInsideRectangle(obj.x, obj.y, 0, 0, maxWidth - this.x, y - this.y)) {
                run {
                    var i: Number = 0;
                    while(i < events.length){
                        events[i].event(obj, evtDetail);
                        i++;
                    }
                }
            }
        }
    }
    open fun isPointInsideRectangle(px: Number, py: Number, rx: Number, ry: Number, rw: Number, rh: Number): Boolean {
        val isXInside = px >= rx && px <= rx + rw;
        val isYInside = py >= ry && py <= ry + rh;
        return isXInside && isYInside;
    }
}
open class xArcNode {
    open var id: String;
    open var zIndex: Number = 0;
    open var radius: Number;
    open var startAngle: Number;
    open var endAngle: Number;
    open var x: Number;
    open var y: Number;
    open var globaX: Number = 0;
    open var globaY: Number = 0;
    open var fillColor: String;
    open var borderWidth: Number;
    open var borderColor: String;
    open var opacity: Number = 1;
    open var scaleX: Number = 1;
    open var scaleY: Number = 1;
    open var rotate: Number = 0;
    open var parent: xCanvas? = null;
    open var tween: xTween? = null;
    open var layer: xLayerNode? = null;
    private var angle = Math.PI / 180;
    open var animates = Map<String, XCANVAS_ANIMATION_CILDRENS>();
    open var animatesByattrname = Map<XCANVAS_ANIMATION_ATTRS, String>();
    open var events: Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL_SELF>> = Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL_SELF>>();
    open var globalCompositeOperation: XCANVAS_GLOBALOPERATION = "source-over";
    open var palyAniEnd: Boolean = true;
    constructor(ops: XARC_OPTS){
        this.id = getUid(1, 10);
        this.radius = ops.radius;
        this.x = ops.x;
        this.y = ops.y;
        this.fillColor = ops?.fillColor ?: "";
        this.borderColor = ops?.borderColor ?: "";
        this.borderWidth = ops?.borderWidth ?: 0;
        this.opacity = ops?.opacity ?: 1;
        this.scaleX = ops?.scaleX ?: 1;
        this.scaleY = ops?.scaleY ?: 1;
        this.rotate = ops?.rotate ?: 0;
        this.startAngle = ops?.startAngle ?: 0;
        this.endAngle = ops?.endAngle ?: 0;
        this.globalCompositeOperation = ops?.globalCompositeOperation ?: "source-over";
    }
    open fun draw(list: UTSArray<xTweenEventCallFunType>) {
        var aniend = true;
        var anis = list.filter(fun(el: xTweenEventCallFunType): Boolean {
            return this.animates.has(el.id);
        }
        );
        if (anis.length == 0) {
            this._drawer(1);
        } else {
            run {
                var i: Number = 0;
                while(i < anis.length){
                    var anisItem = anis[i];
                    this._drawer(anisItem.progress);
                    if (anisItem.progress != 1) {
                        aniend = false;
                    }
                    i++;
                }
            }
        }
        this.palyAniEnd = aniend;
    }
    open fun setParentAndXtween(parent: xCanvas, layer: xLayerNode, tweens: xTween) {
        this.parent = parent;
        this.tween = tweens;
        this.layer = layer;
    }
    private fun _getAniByAttrColor(name: XCANVAS_ANIMATION_ATTRS, progress: Number): String {
        var from = "";
        var aniId = this.animatesByattrname.get(name);
        var ani: XCANVAS_ANIMATION_CILDRENS? = null;
        if (aniId != null) {
            ani = this.animates.get(aniId);
        }
        if (name == "fillColor") {
            from = this.fillColor;
        } else if (name == "borderColor") {
            from = this.borderColor;
        }
        if (ani != null) {
            var item = ani!!;
            if (item.opts.from != "") {
                from = item.opts.from;
            }
            from = getAttrCurrent(name, progress, from, ani.opts.to);
        }
        return from;
    }
    private fun _getAniByAttr(name: XCANVAS_ANIMATION_ATTRS, progress: Number): Number {
        var from = "";
        var aniId = this.animatesByattrname.get(name);
        var ani: XCANVAS_ANIMATION_CILDRENS? = null;
        if (aniId != null) {
            ani = this.animates.get(aniId);
        }
        if (name == "x") {
            from = this.x.toString(10);
        } else if (name == "y") {
            from = this.y.toString(10);
        } else if (name == "radius") {
            from = this.radius.toString(10);
        } else if (name == "startAngle") {
            from = this.startAngle.toString(10);
        } else if (name == "endAngle") {
            from = this.endAngle.toString(10);
        } else if (name == "borderWidth") {
            from = this.borderWidth.toString(10);
        } else if (name == "opacity") {
            from = this.opacity.toString(10);
        } else if (name == "scaleX") {
            from = this.scaleX.toString(10);
        } else if (name == "scaleY") {
            from = this.scaleY.toString(10);
        } else if (name == "rotate") {
            from = this.rotate.toString(10);
        }
        if (ani != null) {
            var item = ani!!;
            if (item.opts.from != "") {
                from = item.opts.from;
            }
            from = getAttrCurrent(name, progress, from, ani.opts.to);
        }
        return parseFloat(from);
    }
    private fun _drawer(progress: Number) {
        var ctx = this.parent!!.ctx;
        ctx.save();
        var x = this._getAniByAttr("x", progress);
        var y = this._getAniByAttr("y", progress);
        var scalex = this._getAniByAttr("scaleX", progress);
        var scaley = this._getAniByAttr("scaleY", progress);
        var radius = this._getAniByAttr("radius", progress);
        var startAngle = this._getAniByAttr("startAngle", progress);
        var endAngle = this._getAniByAttr("endAngle", progress);
        var widthScale = radius * scalex;
        var heightScale = radius * scaley;
        var diffWidth = (widthScale - radius) / 2;
        var diffHeight = (heightScale - radius) / 2;
        x = x - diffWidth + this.layer!!.x;
        y = y - diffHeight + this.layer!!.y;
        this.globaX = x;
        this.globaY = y;
        var opacity = this._getAniByAttr("opacity", progress);
        ctx.globalAlpha = opacity;
        ctx.globalCompositeOperation = this.globalCompositeOperation;
        ctx.beginPath();
        if (this.fillColor != "") {
            var fillColor = this._getAniByAttrColor("fillColor", progress);
            ctx.fillStyle = fillColor;
            ctx.arc(x, y, radius, startAngle * this.angle, endAngle * this.angle, false);
            ctx.fill();
        }
        if (this.borderColor != "" && this.borderWidth != 0) {
            var borderWidth = this._getAniByAttr("borderWidth", progress);
            var borderColor = this._getAniByAttrColor("borderColor", progress);
            ctx.strokeStyle = borderColor;
            ctx.lineWidth = borderWidth;
            var oofsetx = borderWidth / 2;
            ctx.arc(x + oofsetx, y + oofsetx, radius, startAngle * this.angle, endAngle * this.angle, false);
            ctx.stroke();
        }
        ctx.closePath();
        ctx.restore();
        ctx.globalAlpha = 1;
        ctx.globalCompositeOperation = "source-over";
    }
    open fun addAnimation(opts: XCANVAS_ANIMATION) {
        var tw = this.tween!!;
        var dur = (opts?.duration ?: 300) as Number;
        var ani = xTweenAnimate(ease = (opts?.ease ?: "") as String, duration = dur);
        var realOpts = XCANVAS_ANIMATION_SELF(attr = opts.attr, from = (opts?.from ?: "") as String, to = opts.to, duration = dur);
        var id = tw.addAnimate(ani);
        this.animates.set(id, XCANVAS_ANIMATION_CILDRENS(opts = realOpts, xAnimation = ani));
        this.animatesByattrname.set(opts.attr, id);
    }
    open fun addEventListener(evetname: XCANVAS_EVENTS, call: (eventSelf: XCANVAS_EVENTS_TARGET, globallEvent: XCANVAS_EVENTS_TARGET) -> Unit) {
        var evtId = getUid(1, 10);
        var item = this.events.get(evetname);
        if (item == null) {
            this.events.set(evetname, utsArrayOf<XCANVAS_EVENTS_ALL_SELF>());
        }
        item = this.events.get(evetname);
        if (item != null) {
            item!!.push(XCANVAS_EVENTS_ALL_SELF(id = evtId, event = call));
        }
    }
    open fun removeEventListener(eventid: String, evetname: XCANVAS_EVENTS) {
        var item = this.events.get(evetname);
        if (item != null) {
            run {
                var i: Number = 0;
                while(i < item!!.length){
                    var eitem = item!![i];
                    if (eitem.id == eventid) {
                        item!!.splice(i, 1);
                        break;
                    }
                    i++;
                }
            }
        }
    }
    open fun buildEvents(evetname: XCANVAS_EVENTS, evtDetail: XCANVAS_EVENTS_TARGET) {
        var item = this.events.get(evetname);
        if (item != null) {
            var events = item!!;
            var movex = if (evtDetail.touchMovePos.x == 0) {
                0;
            } else {
                (evtDetail.touchMovePos.x - this.x);
            }
            ;
            var movey = if (evtDetail.touchMovePos.y == 0) {
                0;
            } else {
                (evtDetail.touchMovePos.y - this.y);
            }
            ;
            var obj = XCANVAS_EVENTS_TARGET(x = evtDetail.x - this.x, y = evtDetail.y - this.y, touchStartPos = XCANVAS_EVENTS_POS(x = evtDetail.touchStartPos.x - this.x, y = evtDetail.touchStartPos.y - this.y), touchEndPos = XCANVAS_EVENTS_POS(x = evtDetail.touchEndPos.x - this.x, y = evtDetail.touchEndPos.y - this.y), touchMovePos = XCANVAS_EVENTS_POS(x = movex, y = movey), touchMoveLen = evtDetail.touchMoveLen, touchEedLen = evtDetail.touchEedLen, event = evetname);
            if (this.isPointInsideRectangle(this.parent!!.touch_end_x, this.parent!!.touch_end_y, this.globaX, this.globaY, this.radius, this.startAngle * this.angle, this.endAngle * this.angle)) {
                run {
                    var i: Number = 0;
                    while(i < events.length){
                        events[i].event(obj, evtDetail);
                        i++;
                    }
                }
            }
        }
    }
    open fun isPointInsideRectangle(x: Number, y: Number, centerX: Number, centerY: Number, radius: Number, startAngle: Number, endAngle: Number): Boolean {
        var distanceSq = Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2);
        var radiusSq = Math.pow(radius, 2);
        if (distanceSq > radiusSq) {
            return false;
        }
        var angle = Math.atan2(y - centerY, x - centerX);
        if (angle < 0) {
            angle += 2 * Math.PI;
        }
        if (startAngle > endAngle) {
            return angle >= startAngle || angle <= endAngle;
        }
        return angle >= startAngle && angle <= endAngle;
    }
}
open class xLayerNode {
    open var id: String;
    open var shapes: UTSArray<Any> = utsArrayOf();
    open var parent: xCanvas? = null;
    open var tween: xTween? = null;
    open var x: Number = 0;
    open var y: Number = 0;
    open var palyAniEnd: Boolean = true;
    open var events: Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL_SELF>> = Map<XCANVAS_EVENTS, UTSArray<XCANVAS_EVENTS_ALL_SELF>>();
    open var zIndex: Number = 0;
    constructor(){
        this.id = getUid(1, 12);
    }
    open fun addEventListener(evetname: XCANVAS_EVENTS, call: (eventSelf: XCANVAS_EVENTS_TARGET, globallEvent: XCANVAS_EVENTS_TARGET) -> Unit) {
        var evtId = getUid(1, 10);
        var item = this.events.get(evetname);
        if (item == null) {
            this.events.set(evetname, utsArrayOf<XCANVAS_EVENTS_ALL_SELF>());
        }
        item = this.events.get(evetname);
        if (item != null) {
            item!!.push(XCANVAS_EVENTS_ALL_SELF(id = evtId, event = call));
        }
    }
    open fun removeEventListener(eventid: String, evetname: XCANVAS_EVENTS) {
        var item = this.events.get(evetname);
        if (item != null) {
            run {
                var i: Number = 0;
                while(i < item!!.length){
                    var eitem = item!![i];
                    if (eitem.id == eventid) {
                        item!!.splice(i, 1);
                        break;
                    }
                    i++;
                }
            }
        }
    }
    open fun buildEvents(evetname: XCANVAS_EVENTS, evtDetail: XCANVAS_EVENTS_TARGET) {
        var item = this.events.get(evetname);
        var _this = this;
        var movex = if (evtDetail.touchMovePos.x == 0) {
            0;
        } else {
            (evtDetail.touchMovePos.x - this.x);
        }
        ;
        var movey = if (evtDetail.touchMovePos.y == 0) {
            0;
        } else {
            (evtDetail.touchMovePos.y - this.y);
        }
        ;
        var obj = XCANVAS_EVENTS_TARGET(x = evtDetail.x - this.x, y = evtDetail.y - this.y, touchStartPos = XCANVAS_EVENTS_POS(x = evtDetail.touchStartPos.x - this.x, y = evtDetail.touchStartPos.y - this.y), touchEndPos = XCANVAS_EVENTS_POS(x = evtDetail.touchEndPos.x - this.x, y = evtDetail.touchEndPos.y - this.y), touchMovePos = XCANVAS_EVENTS_POS(x = movex - this.x, y = movey), touchMoveLen = evtDetail.touchMoveLen, touchEedLen = evtDetail.touchEedLen, event = evetname);
        run {
            var i: Number = 0;
            while(i < _this.shapes.length){
                var item = _this.shapes[i];
                if (item is xRectNode) {
                    var rect = item as xRectNode;
                    rect.buildEvents(evetname, obj);
                } else if (item is xLineNode) {
                    var rect = item as xLineNode;
                    rect.buildEvents(evetname, obj);
                } else if (item is xTextNode) {
                    var rect = item as xTextNode;
                    rect.buildEvents(evetname, obj);
                } else if (item is xArcNode) {
                    var rect = item as xArcNode;
                    rect.buildEvents(evetname, obj);
                }
                i++;
            }
        }
        if (item != null) {
            var events = item!!;
            run {
                var i: Number = 0;
                while(i < events.length){
                    events[i].event(obj, evtDetail);
                    i++;
                }
            }
        }
    }
    open fun getBound() {}
    open fun setPotion(x: Number, y: Number) {
        this.x = x;
        this.y = y;
    }
    open fun setParentAndXtween(parent: xCanvas, tweens: xTween) {
        this.parent = parent;
        this.tween = tweens;
    }
    open fun addShape(shape: UTSArray<Any>) {
        run {
            var i: Number = 0;
            while(i < shape.length){
                var item = shape[i];
                if (item is xRectNode) {
                    var rect = item as xRectNode;
                    rect.setParentAndXtween(this.parent!!, this, this.tween!!);
                } else if (item is xLineNode) {
                    var rect = item as xLineNode;
                    rect.setParentAndXtween(this.parent!!, this, this.tween!!);
                } else if (item is xTextNode) {
                    var rect = item as xTextNode;
                    rect.setParentAndXtween(this.parent!!, this, this.tween!!);
                } else if (item is xArcNode) {
                    var rect = item as xArcNode;
                    rect.setParentAndXtween(this.parent!!, this, this.tween!!);
                }
                i++;
            }
        }
        this.shapes.push(*shape.toTypedArray());
    }
    open fun draw(list: UTSArray<xTweenEventCallFunType>) {
        var aniend = true;
        run {
            var i: Number = 0;
            while(i < this.shapes.length){
                var item = this.shapes[i];
                if (item is xRectNode) {
                    var rect = item as xRectNode;
                    rect.draw(list);
                    if (!item.palyAniEnd) {
                        aniend = false;
                    }
                } else if (item is xLineNode) {
                    var rect = item as xLineNode;
                    rect.draw(list);
                    if (!item.palyAniEnd) {
                        aniend = false;
                    }
                } else if (item is xTextNode) {
                    var rect = item as xTextNode;
                    rect.draw(list);
                    if (!item.palyAniEnd) {
                        aniend = false;
                    }
                } else if (item is xArcNode) {
                    var rect = item as xArcNode;
                    rect.draw(list);
                    if (!item.palyAniEnd) {
                        aniend = false;
                    }
                }
                i++;
            }
        }
        this.palyAniEnd = aniend;
    }
}
fun isCustomTheme(): Boolean {
    var issettheme = false;
    var customSetings = uni_getStorageSync("tmuiXuiOsThemeSet");
    if (customSetings != null) {
        var str = customSetings as String;
        if (str == "dark" || str == "light" || str == "auto") {
            issettheme = true;
        }
    }
    return issettheme;
}
fun getOsTheme(): String {
    var defaultModel = "light" as String;
    var str = uni_getSystemInfoSync().osTheme;
    if (str != null) {
        defaultModel = str;
    }
    return defaultModel;
}
fun WebObserveTheme() {
    uni_onOsThemeChange(fun(res: OsThemeChangeResult){
        var customSetings = uni_getStorageSync("tmuiXuiOsThemeSet");
        if (customSetings != "auto") {
            return;
        }
        xConfig.dark = res.osTheme;
        setThemeDarkModel();
    }
    );
}
val getThemePrimary = fun(): String {
    return getDefaultColor(xConfig.color) as String;
}
;
val setThemePrimary = fun(scolor: String): String {
    xConfig.color = getDefaultColor(scolor);
    return xConfig.color as String;
}
;
fun setThemeDarkModel() {
    setBgBodyColor();
}
val setDarkModel = fun(value: String){
    uni_setStorageSync("tmuiXuiOsThemeSet", value);
    var darkmodl = getDarkMode();
    xConfig.dark = darkmodl;
    setThemeDarkModel();
}
;
val getDarkModel = fun(): String {
    var darkmodl = uni_getStorageSync("tmuiXuiOsThemeSet");
    var m = if (darkmodl == null) {
        "dark";
    } else {
        darkmodl;
    }
    ;
    return m as String;
}
;
val xTabbarConfig = reactive(XTABBARCONFIG(tabbarActiveIndex = 0, tabaarHeight = 60, list = utsArrayOf<TABBAR_ITEM_INFO>()));
val setConfig = fun(config: Any?){
    if (config == null) {
        return;
    }
    var cfg = config!! as UTSJSONObject;
    if (cfg.getString("color") != null && cfg.getString("color") != "") {
        xConfig.color = cfg.getString("color")!!;
    }
    if (cfg.getAny("theme") != null) {
        var theme = cfg.getAny("theme")!! as Map<String, String>;
        xConfig.theme = theme;
    }
    if (cfg.getString("dark") != null && cfg.getString("dark") != "") {
        xConfig.dark = cfg.getString("dark")!!;
    }
    if (cfg.getNumber("designSize") != null) {
        xConfig.designSize = cfg.getNumber("designSize")!!;
    }
    if (cfg.getString("unit") != null && cfg.getString("unit") != "") {
        xConfig.unit = cfg.getString("unit")!! as String;
    }
    if (cfg.getString("language") != null && cfg.getString("language") != "") {
        xConfig.language = cfg.getString("language")!!;
    }
    if (cfg.getNumber("fontScale") != null) {
        xConfig.fontScale = cfg.getNumber("fontScale")!!;
    }
    if (cfg.getString("navigationBarTextStyleDark") != null) {
        xConfig.navigationBarTextStyleDark = cfg.getString("navigationBarTextStyleDark")!!;
    }
    if (cfg.getString("navigationBarTextStyleLight") != null) {
        xConfig.navigationBarTextStyleLight = cfg.getString("navigationBarTextStyleLight")!!;
    }
    if (cfg.getString("navigationBarBackgroundColorDark") != null) {
        xConfig.navigationBarBackgroundColorDark = cfg.getString("navigationBarBackgroundColorDark")!!;
    }
    if (cfg.getString("navigationBarBackgroundColorLight") != null) {
        xConfig.navigationBarBackgroundColorLight = cfg.getString("navigationBarBackgroundColorLight")!!;
    }
    if (cfg.getString("backgroundColorContentDark") != null) {
        xConfig.backgroundColorContentDark = cfg.getString("backgroundColorContentDark")!!;
    }
    if (cfg.getString("backgroundColorContentLight") != null) {
        xConfig.backgroundColorContentLight = cfg.getString("backgroundColorContentLight")!!;
    }
    if (cfg.getString("tabarBackgroundColorDark") != null) {
        xConfig.tabarBackgroundColorDark = cfg.getString("tabarBackgroundColorDark")!!;
    }
    if (cfg.getString("tabarBackgroundColorLight") != null) {
        xConfig.tabarBackgroundColorLight = cfg.getString("tabarBackgroundColorLight")!!;
    }
    if (cfg.getString("sheetDarkColor") != null) {
        xConfig.sheetDarkColor = cfg.getString("sheetDarkColor")!!;
    }
    if (cfg.getArray<String>("sheetDarkBorderColor") != null) {
        xConfig.sheetDarkBorderColor = cfg.getArray<String>("sheetDarkBorderColor")!!;
    }
    if (cfg.getString("inputDarkColor") != null) {
        xConfig.inputDarkColor = cfg.getString("inputDarkColor")!!;
    }
    if (cfg.getString("sheetDarkColor") != null) {
        xConfig.borderDarkColor = cfg.getString("borderDarkColor")!!;
    }
    if (cfg.getString("inputRadius") != null) {
        xConfig.inputRadius = cfg.getString("inputRadius")!!;
    }
    if (cfg.getArray<String>("inputFocusBorder") != null) {
        xConfig.inputFocusBorder = cfg.getArray<String>("inputFocusBorder")!!;
    }
    if (cfg.getString("buttonRadius") != null) {
        xConfig.buttonRadius = cfg.getString("buttonRadius")!!;
    }
    if (cfg.getString("tagRadius") != null) {
        xConfig.tagRadius = cfg.getString("tagRadius")!!;
    }
    if (cfg.getString("cellRadius") != null) {
        xConfig.cellRadius = cfg.getString("cellRadius")!!;
    }
    if (cfg.getArray<String>("sheetRadius") != null) {
        xConfig.sheetRadius = cfg.getArray<String>("sheetRadius")!!;
    }
    if (cfg.getArray<String>("sheetMargin") != null) {
        xConfig.sheetMargin = cfg.getArray<String>("sheetMargin")!!;
    }
    if (cfg.getArray<String>("sheetPadding") != null) {
        xConfig.sheetPadding = cfg.getArray<String>("sheetPadding")!!;
    }
    if (cfg.getString("drawerRadius") != null) {
        xConfig.drawerRadius = cfg.getString("drawerRadius")!!;
    }
    if (cfg.getString("modalRadius") != null) {
        xConfig.modalRadius = cfg.getString("modalRadius")!!;
    }
    if (cfg.getString("switchRadius") != null) {
        xConfig.switchRadius = cfg.getString("switchRadius")!!;
    }
    if (cfg.getString("progressRadius") != null) {
        xConfig.progressRadius = cfg.getString("progressRadius")!!;
    }
    if (cfg.getString("unRadioAndCheckBoxColor") != null) {
        xConfig.unRadioAndCheckBoxColor = cfg.getString("unRadioAndCheckBoxColor")!!;
    }
    if (cfg.getString("radioButtonRadius") != null) {
        xConfig.radioButtonRadius = cfg.getString("radioButtonRadius")!!;
    }
    if (cfg.getString("animationFun") != null) {
        xConfig.animationFun = cfg.getString("animationFun")!!;
    }
    if (cfg.getString("cardRound") != null) {
        xConfig.cardRound = cfg.getString("cardRound")!!;
    }
    if (cfg.getString("closeIcon") != null) {
        xConfig.closeIcon = cfg.getString("closeIcon")!!;
    }
}
;
fun checkIsCssUnit(str: String, unit: String): String {
    var s = str;
    if (s.indexOf("px") > -1 || s.indexOf("%") > -1 || s.indexOf("auto") > -1) {
        return str;
    }
    if (unit == "rpx") {
        return s + "rpx";
    }
    return str + unit;
}
fun fillArrayCssValue(kVal: UTSArray<String>): UTSArray<String> {
    var ar: UTSArray<String> = kVal.map(fun(el: String): String {
        return checkIsCssUnit(el, xConfig.unit);
    }
    );
    if (ar.length == 0) {
        return utsArrayOf();
    }
    if (ar.length == 1) {
        return utsArrayOf(
            ar[0],
            ar[0],
            ar[0],
            ar[0]
        );
    }
    if (ar.length == 2) {
        return utsArrayOf(
            ar[1],
            ar[0],
            ar[1],
            ar[0]
        );
    }
    if (ar.length == 3) {
        return utsArrayOf(
            ar[1],
            ar[2],
            "0px",
            ar[0]
        );
    }
    return utsArrayOf(
        ar[1],
        ar[2],
        ar[3],
        ar[0]
    );
}
fun fillArrayCssValueByround(kVal: UTSArray<String>): UTSArray<String> {
    var ar: UTSArray<String> = kVal.map(fun(el: String): String {
        return checkIsCssUnit(el, xConfig.unit);
    }
    );
    if (ar.length == 0) {
        return utsArrayOf();
    }
    if (ar.length == 1) {
        return utsArrayOf(
            ar[0],
            ar[0],
            ar[0],
            ar[0]
        );
    }
    if (ar.length == 2) {
        return utsArrayOf(
            ar[1],
            ar[0],
            ar[1],
            ar[0]
        );
    }
    if (ar.length == 3) {
        return utsArrayOf(
            ar[0],
            ar[1],
            ar[0],
            "0px"
        );
    }
    return utsArrayOf(
        ar[0],
        ar[1],
        ar[2],
        ar[3]
    );
}
fun fillArrayCssValueBycolor(kVal: UTSArray<String>): UTSArray<String> {
    var ar: UTSArray<String> = kVal.map(fun(el: String): String {
        return getDefaultColor(el);
    }
    );
    if (ar.length == 0) {
        return utsArrayOf();
    }
    if (ar.length == 1) {
        return utsArrayOf(
            ar[0],
            ar[0],
            ar[0],
            ar[0]
        );
    }
    if (ar.length == 2) {
        return utsArrayOf(
            ar[1],
            ar[0],
            ar[1],
            ar[0]
        );
    }
    if (ar.length == 3) {
        return utsArrayOf(
            ar[1],
            ar[2],
            "0px",
            ar[0]
        );
    }
    return utsArrayOf(
        ar[1],
        ar[2],
        ar[3],
        ar[0]
    );
}
fun getUnit(n: String?): String {
    if (n == null || n == "") {
        return xConfig.unit;
    }
    var unit = n.replace(UTSRegExp("[\\d|\\-|\\+|\\.]", "g"), "");
    if (unit == "") {
        unit = xConfig.unit;
    }
    return unit;
}
typealias NAVIGATE_TYPE = String;
open class CHECKBOX_ITEM_INFO (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var nowvalue: String,
    @JsonNotNull
    open var value: String,
    @JsonNotNull
    open var unvalue: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return CHECKBOX_ITEM_INFOReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class CHECKBOX_ITEM_INFOReactiveObject : CHECKBOX_ITEM_INFO, IUTSReactive<CHECKBOX_ITEM_INFO> {
    override var __v_raw: CHECKBOX_ITEM_INFO;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: CHECKBOX_ITEM_INFO, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(id = __v_raw.id, nowvalue = __v_raw.nowvalue, value = __v_raw.value, unvalue = __v_raw.unvalue) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): CHECKBOX_ITEM_INFOReactiveObject {
        return CHECKBOX_ITEM_INFOReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var nowvalue: String
        get() {
            return trackReactiveGet(__v_raw, "nowvalue", __v_raw.nowvalue, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("nowvalue")) {
                return;
            }
            val oldValue = __v_raw.nowvalue;
            __v_raw.nowvalue = value;
            triggerReactiveSet(__v_raw, "nowvalue", oldValue, value);
        }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var unvalue: String
        get() {
            return trackReactiveGet(__v_raw, "unvalue", __v_raw.unvalue, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("unvalue")) {
                return;
            }
            val oldValue = __v_raw.unvalue;
            __v_raw.unvalue = value;
            triggerReactiveSet(__v_raw, "unvalue", oldValue, value);
        }
}
open class SLIDER_TREE_ITEM_INFO (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var title: String,
    open var children: UTSArray<SLIDER_TREE_ITEM_INFO>? = null,
    open var disabled: Boolean? = null,
    open var selected: UTSArray<String>? = null,
) : UTSObject()
open class TABBAR_ITEM_INFO (
    open var title: String? = null,
    open var icon: String? = null,
    open var selectedIcon: String? = null,
    open var disabled: Boolean? = null,
    open var color: String? = null,
    open var selectedColor: String? = null,
    open var openType: NAVIGATE_TYPE? = null,
    open var url: String? = null,
    open var dotType: String? = null,
    open var dotLabel: String? = null,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return TABBAR_ITEM_INFOReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class TABBAR_ITEM_INFOReactiveObject : TABBAR_ITEM_INFO, IUTSReactive<TABBAR_ITEM_INFO> {
    override var __v_raw: TABBAR_ITEM_INFO;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: TABBAR_ITEM_INFO, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(title = __v_raw.title, icon = __v_raw.icon, selectedIcon = __v_raw.selectedIcon, disabled = __v_raw.disabled, color = __v_raw.color, selectedColor = __v_raw.selectedColor, openType = __v_raw.openType, url = __v_raw.url, dotType = __v_raw.dotType, dotLabel = __v_raw.dotLabel) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): TABBAR_ITEM_INFOReactiveObject {
        return TABBAR_ITEM_INFOReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var title: String?
        get() {
            return trackReactiveGet(__v_raw, "title", __v_raw.title, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("title")) {
                return;
            }
            val oldValue = __v_raw.title;
            __v_raw.title = value;
            triggerReactiveSet(__v_raw, "title", oldValue, value);
        }
    override var icon: String?
        get() {
            return trackReactiveGet(__v_raw, "icon", __v_raw.icon, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("icon")) {
                return;
            }
            val oldValue = __v_raw.icon;
            __v_raw.icon = value;
            triggerReactiveSet(__v_raw, "icon", oldValue, value);
        }
    override var selectedIcon: String?
        get() {
            return trackReactiveGet(__v_raw, "selectedIcon", __v_raw.selectedIcon, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("selectedIcon")) {
                return;
            }
            val oldValue = __v_raw.selectedIcon;
            __v_raw.selectedIcon = value;
            triggerReactiveSet(__v_raw, "selectedIcon", oldValue, value);
        }
    override var disabled: Boolean?
        get() {
            return trackReactiveGet(__v_raw, "disabled", __v_raw.disabled, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("disabled")) {
                return;
            }
            val oldValue = __v_raw.disabled;
            __v_raw.disabled = value;
            triggerReactiveSet(__v_raw, "disabled", oldValue, value);
        }
    override var color: String?
        get() {
            return trackReactiveGet(__v_raw, "color", __v_raw.color, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("color")) {
                return;
            }
            val oldValue = __v_raw.color;
            __v_raw.color = value;
            triggerReactiveSet(__v_raw, "color", oldValue, value);
        }
    override var selectedColor: String?
        get() {
            return trackReactiveGet(__v_raw, "selectedColor", __v_raw.selectedColor, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("selectedColor")) {
                return;
            }
            val oldValue = __v_raw.selectedColor;
            __v_raw.selectedColor = value;
            triggerReactiveSet(__v_raw, "selectedColor", oldValue, value);
        }
    override var openType: NAVIGATE_TYPE?
        get() {
            return trackReactiveGet(__v_raw, "openType", __v_raw.openType, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("openType")) {
                return;
            }
            val oldValue = __v_raw.openType;
            __v_raw.openType = value;
            triggerReactiveSet(__v_raw, "openType", oldValue, value);
        }
    override var url: String?
        get() {
            return trackReactiveGet(__v_raw, "url", __v_raw.url, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("url")) {
                return;
            }
            val oldValue = __v_raw.url;
            __v_raw.url = value;
            triggerReactiveSet(__v_raw, "url", oldValue, value);
        }
    override var dotType: String?
        get() {
            return trackReactiveGet(__v_raw, "dotType", __v_raw.dotType, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("dotType")) {
                return;
            }
            val oldValue = __v_raw.dotType;
            __v_raw.dotType = value;
            triggerReactiveSet(__v_raw, "dotType", oldValue, value);
        }
    override var dotLabel: String?
        get() {
            return trackReactiveGet(__v_raw, "dotLabel", __v_raw.dotLabel, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("dotLabel")) {
                return;
            }
            val oldValue = __v_raw.dotLabel;
            __v_raw.dotLabel = value;
            triggerReactiveSet(__v_raw, "dotLabel", oldValue, value);
        }
}
open class XUPLOADFILE_INFO (
    open var count: Number? = null,
    open var sourceType: UTSArray<String>? = null,
    open var sizeType: UTSArray<String>? = null,
    open var hostUrl: String? = null,
    open var name: String? = null,
    open var header: UTSJSONObject? = null,
    open var formData: UTSJSONObject? = null,
    open var multipart: Boolean? = null,
    open var autoUpload: Boolean? = null,
    open var statusCode: Number? = null,
    open var compress: Boolean? = null,
    open var quality: Number? = null,
    open var compressedHeight: Number? = null,
    open var compressedWidth: Number? = null,
) : UTSObject()
typealias XUPLOADFILE_FILE_STATUS = Number;
open class XUPLOADFILE_FILE_INFO (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var size: Number,
    @JsonNotNull
    open var path: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var extension: String,
    @JsonNotNull
    open var progress: Number,
    @JsonNotNull
    open var statusText: String,
    @JsonNotNull
    open var status: XUPLOADFILE_FILE_STATUS,
    @JsonNotNull
    open var response: String,
    open var model: String? = null,
) : UTSObject()
typealias XUPLOADFILE_EVENT_NAME = String;
open class XUPLOADFILE_FILE_VALUE (
    open var id: String? = null,
    open var response: String? = null,
    @JsonNotNull
    open var url: String,
) : UTSObject()
open class PICKER_ITEM_INFO (
    @JsonNotNull
    open var title: String,
    open var id: String? = null,
    open var children: UTSArray<PICKER_ITEM_INFO>? = null,
    open var disabled: Boolean? = null,
) : UTSObject()
open class X_PICKER_X_ITEM (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var title: String,
    @JsonNotNull
    open var children: UTSArray<X_PICKER_X_ITEM>,
    @JsonNotNull
    open var disabled: Boolean = false,
) : UTSObject()
open class CASCADER_ITEM_INFO (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var title: String,
    open var children: UTSArray<CASCADER_ITEM_INFO>? = null,
    open var disabled: Boolean? = null,
    open var selected: UTSArray<String>? = null,
) : UTSObject()
typealias FORM_RULE_TYPE = String;
open class FORM_RULE (
    open var type: FORM_RULE_TYPE? = null,
    open var valid: ((`val`: Any?) -> Boolean)? = null,
    open var errorMessage: String? = null,
    open var max: Number? = null,
    open var min: Number? = null,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return FORM_RULEReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class FORM_RULEReactiveObject : FORM_RULE, IUTSReactive<FORM_RULE> {
    override var __v_raw: FORM_RULE;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: FORM_RULE, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(type = __v_raw.type, valid = __v_raw.valid, errorMessage = __v_raw.errorMessage, max = __v_raw.max, min = __v_raw.min) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): FORM_RULEReactiveObject {
        return FORM_RULEReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var type: FORM_RULE_TYPE?
        get() {
            return trackReactiveGet(__v_raw, "type", __v_raw.type, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("type")) {
                return;
            }
            val oldValue = __v_raw.type;
            __v_raw.type = value;
            triggerReactiveSet(__v_raw, "type", oldValue, value);
        }
    override var errorMessage: String?
        get() {
            return trackReactiveGet(__v_raw, "errorMessage", __v_raw.errorMessage, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("errorMessage")) {
                return;
            }
            val oldValue = __v_raw.errorMessage;
            __v_raw.errorMessage = value;
            triggerReactiveSet(__v_raw, "errorMessage", oldValue, value);
        }
    override var max: Number?
        get() {
            return trackReactiveGet(__v_raw, "max", __v_raw.max, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("max")) {
                return;
            }
            val oldValue = __v_raw.max;
            __v_raw.max = value;
            triggerReactiveSet(__v_raw, "max", oldValue, value);
        }
    override var min: Number?
        get() {
            return trackReactiveGet(__v_raw, "min", __v_raw.min, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("min")) {
                return;
            }
            val oldValue = __v_raw.min;
            __v_raw.min = value;
            triggerReactiveSet(__v_raw, "min", oldValue, value);
        }
}
open class FORM_SUBMIT_OBJECT (
    @JsonNotNull
    open var errorMessage: String,
    @JsonNotNull
    open var valid: Boolean = false,
    @JsonNotNull
    open var key: String,
    open var value: Any? = null,
) : UTSObject()
open class FORM_SUBMIT_RESULT (
    @JsonNotNull
    open var valid: Boolean = false,
    @JsonNotNull
    open var errorMessage: String,
    @JsonNotNull
    open var key: String,
    @JsonNotNull
    open var formData: UTSArray<FORM_SUBMIT_OBJECT>,
) : UTSObject()
open class XANIMATE_OPIONS (
    open var ele: String? = null,
    open var duration: Number? = null,
    open var timingFunction: String? = null,
    open var loop: Number? = null,
    open var tyty: Boolean? = null,
    open var isDescPlay: Boolean? = null,
    open var bezier: UTSArray<Number>? = null,
    open var complete: (() -> Unit)? = null,
    open var start: (() -> Unit)? = null,
    open var frame: ((propress: Number) -> Unit)? = null,
) : UTSObject()
typealias xRequestMethond = String;
open class xRequestOptions (
    open var successStatusCode: Number? = null,
    open var url: String? = null,
    open var data: Any? = null,
    open var header: UTSJSONObject? = null,
    open var method: xRequestMethond? = null,
    open var timeout: Number? = null,
    open var firstIpv4: Boolean? = null,
    open var showLoadToast: Boolean? = null,
    open var showSuccessToast: Boolean? = null,
    open var showErrorToast: Boolean? = null,
) : UTSObject()
open class xRequestOptionsCallBack (
    @JsonNotNull
    open var successStatusCode: Number,
    @JsonNotNull
    open var url: String,
    @JsonNotNull
    open var data: Any,
    @JsonNotNull
    open var header: UTSJSONObject,
    @JsonNotNull
    open var method: xRequestMethond,
    @JsonNotNull
    open var timeout: Number,
    @JsonNotNull
    open var firstIpv4: Boolean = false,
    @JsonNotNull
    open var showLoadToast: Boolean = false,
    @JsonNotNull
    open var showSuccessToast: Boolean = false,
    @JsonNotNull
    open var showErrorToast: Boolean = false,
) : UTSObject()
open class xRequestResult (
    open var data: Any? = null,
    @JsonNotNull
    open var statusCode: Number,
    @JsonNotNull
    open var header: Any,
    @JsonNotNull
    open var cookies: UTSArray<String>,
) : UTSObject()
open class xRequestHistoryType (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var loading: Boolean = false,
    @JsonNotNull
    open var loaded: Boolean = false,
    @JsonNotNull
    open var status: String,
    @JsonNotNull
    open var time: Number,
    @JsonNotNull
    open var api: String,
    @JsonNotNull
    open var result: Any,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return xRequestHistoryTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class xRequestHistoryTypeReactiveObject : xRequestHistoryType, IUTSReactive<xRequestHistoryType> {
    override var __v_raw: xRequestHistoryType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: xRequestHistoryType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(id = __v_raw.id, loading = __v_raw.loading, loaded = __v_raw.loaded, status = __v_raw.status, time = __v_raw.time, api = __v_raw.api, result = __v_raw.result) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): xRequestHistoryTypeReactiveObject {
        return xRequestHistoryTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var loading: Boolean
        get() {
            return trackReactiveGet(__v_raw, "loading", __v_raw.loading, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("loading")) {
                return;
            }
            val oldValue = __v_raw.loading;
            __v_raw.loading = value;
            triggerReactiveSet(__v_raw, "loading", oldValue, value);
        }
    override var loaded: Boolean
        get() {
            return trackReactiveGet(__v_raw, "loaded", __v_raw.loaded, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("loaded")) {
                return;
            }
            val oldValue = __v_raw.loaded;
            __v_raw.loaded = value;
            triggerReactiveSet(__v_raw, "loaded", oldValue, value);
        }
    override var status: String
        get() {
            return trackReactiveGet(__v_raw, "status", __v_raw.status, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("status")) {
                return;
            }
            val oldValue = __v_raw.status;
            __v_raw.status = value;
            triggerReactiveSet(__v_raw, "status", oldValue, value);
        }
    override var time: Number
        get() {
            return trackReactiveGet(__v_raw, "time", __v_raw.time, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("time")) {
                return;
            }
            val oldValue = __v_raw.time;
            __v_raw.time = value;
            triggerReactiveSet(__v_raw, "time", oldValue, value);
        }
    override var api: String
        get() {
            return trackReactiveGet(__v_raw, "api", __v_raw.api, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("api")) {
                return;
            }
            val oldValue = __v_raw.api;
            __v_raw.api = value;
            triggerReactiveSet(__v_raw, "api", oldValue, value);
        }
    override var result: Any
        get() {
            return trackReactiveGet(__v_raw, "result", __v_raw.result, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("result")) {
                return;
            }
            val oldValue = __v_raw.result;
            __v_raw.result = value;
            triggerReactiveSet(__v_raw, "result", oldValue, value);
        }
}
open class XTABBARCONFIG (
    @JsonNotNull
    open var tabbarActiveIndex: Number,
    @JsonNotNull
    open var tabaarHeight: Number,
    @JsonNotNull
    open var list: UTSArray<TABBAR_ITEM_INFO>,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return XTABBARCONFIGReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class XTABBARCONFIGReactiveObject : XTABBARCONFIG, IUTSReactive<XTABBARCONFIG> {
    override var __v_raw: XTABBARCONFIG;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: XTABBARCONFIG, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(tabbarActiveIndex = __v_raw.tabbarActiveIndex, tabaarHeight = __v_raw.tabaarHeight, list = __v_raw.list) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): XTABBARCONFIGReactiveObject {
        return XTABBARCONFIGReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var tabbarActiveIndex: Number
        get() {
            return trackReactiveGet(__v_raw, "tabbarActiveIndex", __v_raw.tabbarActiveIndex, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("tabbarActiveIndex")) {
                return;
            }
            val oldValue = __v_raw.tabbarActiveIndex;
            __v_raw.tabbarActiveIndex = value;
            triggerReactiveSet(__v_raw, "tabbarActiveIndex", oldValue, value);
        }
    override var tabaarHeight: Number
        get() {
            return trackReactiveGet(__v_raw, "tabaarHeight", __v_raw.tabaarHeight, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("tabaarHeight")) {
                return;
            }
            val oldValue = __v_raw.tabaarHeight;
            __v_raw.tabaarHeight = value;
            triggerReactiveSet(__v_raw, "tabaarHeight", oldValue, value);
        }
    override var list: UTSArray<TABBAR_ITEM_INFO>
        get() {
            return trackReactiveGet(__v_raw, "list", __v_raw.list, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("list")) {
                return;
            }
            val oldValue = __v_raw.list;
            __v_raw.list = value;
            triggerReactiveSet(__v_raw, "list", oldValue, value);
        }
}
open class X_REQUEST_PRIVATE_CALL_FUN_TYPE (
    @JsonNotNull
    open var history: UTSArray<xRequestHistoryType>,
    @JsonNotNull
    open var authPass: Boolean = false,
    @JsonNotNull
    open var hostUrl: String,
    open var header: UTSJSONObject? = null,
    @JsonNotNull
    open var dev: Boolean = false,
    @JsonNotNull
    open var showLoadToast: Boolean = false,
    @JsonNotNull
    open var showSuccessToast: Boolean = false,
    @JsonNotNull
    open var showErrorToast: Boolean = false,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return X_REQUEST_PRIVATE_CALL_FUN_TYPEReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class X_REQUEST_PRIVATE_CALL_FUN_TYPEReactiveObject : X_REQUEST_PRIVATE_CALL_FUN_TYPE, IUTSReactive<X_REQUEST_PRIVATE_CALL_FUN_TYPE> {
    override var __v_raw: X_REQUEST_PRIVATE_CALL_FUN_TYPE;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: X_REQUEST_PRIVATE_CALL_FUN_TYPE, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(history = __v_raw.history, authPass = __v_raw.authPass, hostUrl = __v_raw.hostUrl, header = __v_raw.header, dev = __v_raw.dev, showLoadToast = __v_raw.showLoadToast, showSuccessToast = __v_raw.showSuccessToast, showErrorToast = __v_raw.showErrorToast) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): X_REQUEST_PRIVATE_CALL_FUN_TYPEReactiveObject {
        return X_REQUEST_PRIVATE_CALL_FUN_TYPEReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var history: UTSArray<xRequestHistoryType>
        get() {
            return trackReactiveGet(__v_raw, "history", __v_raw.history, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("history")) {
                return;
            }
            val oldValue = __v_raw.history;
            __v_raw.history = value;
            triggerReactiveSet(__v_raw, "history", oldValue, value);
        }
    override var authPass: Boolean
        get() {
            return trackReactiveGet(__v_raw, "authPass", __v_raw.authPass, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("authPass")) {
                return;
            }
            val oldValue = __v_raw.authPass;
            __v_raw.authPass = value;
            triggerReactiveSet(__v_raw, "authPass", oldValue, value);
        }
    override var hostUrl: String
        get() {
            return trackReactiveGet(__v_raw, "hostUrl", __v_raw.hostUrl, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("hostUrl")) {
                return;
            }
            val oldValue = __v_raw.hostUrl;
            __v_raw.hostUrl = value;
            triggerReactiveSet(__v_raw, "hostUrl", oldValue, value);
        }
    override var header: UTSJSONObject?
        get() {
            return trackReactiveGet(__v_raw, "header", __v_raw.header, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("header")) {
                return;
            }
            val oldValue = __v_raw.header;
            __v_raw.header = value;
            triggerReactiveSet(__v_raw, "header", oldValue, value);
        }
    override var dev: Boolean
        get() {
            return trackReactiveGet(__v_raw, "dev", __v_raw.dev, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("dev")) {
                return;
            }
            val oldValue = __v_raw.dev;
            __v_raw.dev = value;
            triggerReactiveSet(__v_raw, "dev", oldValue, value);
        }
    override var showLoadToast: Boolean
        get() {
            return trackReactiveGet(__v_raw, "showLoadToast", __v_raw.showLoadToast, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("showLoadToast")) {
                return;
            }
            val oldValue = __v_raw.showLoadToast;
            __v_raw.showLoadToast = value;
            triggerReactiveSet(__v_raw, "showLoadToast", oldValue, value);
        }
    override var showSuccessToast: Boolean
        get() {
            return trackReactiveGet(__v_raw, "showSuccessToast", __v_raw.showSuccessToast, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("showSuccessToast")) {
                return;
            }
            val oldValue = __v_raw.showSuccessToast;
            __v_raw.showSuccessToast = value;
            triggerReactiveSet(__v_raw, "showSuccessToast", oldValue, value);
        }
    override var showErrorToast: Boolean
        get() {
            return trackReactiveGet(__v_raw, "showErrorToast", __v_raw.showErrorToast, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("showErrorToast")) {
                return;
            }
            val oldValue = __v_raw.showErrorToast;
            __v_raw.showErrorToast = value;
            triggerReactiveSet(__v_raw, "showErrorToast", oldValue, value);
        }
}
open class xPageStyle (
    @JsonNotNull
    open var path: String,
    @JsonNotNull
    open var backgroundColorContent: String,
    @JsonNotNull
    open var navigationBarBackgroundColor: String,
    @JsonNotNull
    open var navigationBarTextStyle: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return xPageStyleReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class xPageStyleReactiveObject : xPageStyle, IUTSReactive<xPageStyle> {
    override var __v_raw: xPageStyle;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: xPageStyle, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(path = __v_raw.path, backgroundColorContent = __v_raw.backgroundColorContent, navigationBarBackgroundColor = __v_raw.navigationBarBackgroundColor, navigationBarTextStyle = __v_raw.navigationBarTextStyle) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): xPageStyleReactiveObject {
        return xPageStyleReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var path: String
        get() {
            return trackReactiveGet(__v_raw, "path", __v_raw.path, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("path")) {
                return;
            }
            val oldValue = __v_raw.path;
            __v_raw.path = value;
            triggerReactiveSet(__v_raw, "path", oldValue, value);
        }
    override var backgroundColorContent: String
        get() {
            return trackReactiveGet(__v_raw, "backgroundColorContent", __v_raw.backgroundColorContent, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("backgroundColorContent")) {
                return;
            }
            val oldValue = __v_raw.backgroundColorContent;
            __v_raw.backgroundColorContent = value;
            triggerReactiveSet(__v_raw, "backgroundColorContent", oldValue, value);
        }
    override var navigationBarBackgroundColor: String
        get() {
            return trackReactiveGet(__v_raw, "navigationBarBackgroundColor", __v_raw.navigationBarBackgroundColor, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("navigationBarBackgroundColor")) {
                return;
            }
            val oldValue = __v_raw.navigationBarBackgroundColor;
            __v_raw.navigationBarBackgroundColor = value;
            triggerReactiveSet(__v_raw, "navigationBarBackgroundColor", oldValue, value);
        }
    override var navigationBarTextStyle: String
        get() {
            return trackReactiveGet(__v_raw, "navigationBarTextStyle", __v_raw.navigationBarTextStyle, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("navigationBarTextStyle")) {
                return;
            }
            val oldValue = __v_raw.navigationBarTextStyle;
            __v_raw.navigationBarTextStyle = value;
            triggerReactiveSet(__v_raw, "navigationBarTextStyle", oldValue, value);
        }
}
open class XPRIVATECONFIG (
    @JsonNotNull
    open var scrollTop: Number,
    @JsonNotNull
    open var windowInnerWidth: Number,
    @JsonNotNull
    open var windowInnerHeight: Number,
    @JsonNotNull
    open var windowWidth: Number,
    @JsonNotNull
    open var windowHeight: Number,
    @JsonNotNull
    open var pageStyle: Map<String, xPageStyle>,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return XPRIVATECONFIGReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class XPRIVATECONFIGReactiveObject : XPRIVATECONFIG, IUTSReactive<XPRIVATECONFIG> {
    override var __v_raw: XPRIVATECONFIG;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: XPRIVATECONFIG, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(scrollTop = __v_raw.scrollTop, windowInnerWidth = __v_raw.windowInnerWidth, windowInnerHeight = __v_raw.windowInnerHeight, windowWidth = __v_raw.windowWidth, windowHeight = __v_raw.windowHeight, pageStyle = __v_raw.pageStyle) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): XPRIVATECONFIGReactiveObject {
        return XPRIVATECONFIGReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var scrollTop: Number
        get() {
            return trackReactiveGet(__v_raw, "scrollTop", __v_raw.scrollTop, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("scrollTop")) {
                return;
            }
            val oldValue = __v_raw.scrollTop;
            __v_raw.scrollTop = value;
            triggerReactiveSet(__v_raw, "scrollTop", oldValue, value);
        }
    override var windowInnerWidth: Number
        get() {
            return trackReactiveGet(__v_raw, "windowInnerWidth", __v_raw.windowInnerWidth, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("windowInnerWidth")) {
                return;
            }
            val oldValue = __v_raw.windowInnerWidth;
            __v_raw.windowInnerWidth = value;
            triggerReactiveSet(__v_raw, "windowInnerWidth", oldValue, value);
        }
    override var windowInnerHeight: Number
        get() {
            return trackReactiveGet(__v_raw, "windowInnerHeight", __v_raw.windowInnerHeight, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("windowInnerHeight")) {
                return;
            }
            val oldValue = __v_raw.windowInnerHeight;
            __v_raw.windowInnerHeight = value;
            triggerReactiveSet(__v_raw, "windowInnerHeight", oldValue, value);
        }
    override var windowWidth: Number
        get() {
            return trackReactiveGet(__v_raw, "windowWidth", __v_raw.windowWidth, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("windowWidth")) {
                return;
            }
            val oldValue = __v_raw.windowWidth;
            __v_raw.windowWidth = value;
            triggerReactiveSet(__v_raw, "windowWidth", oldValue, value);
        }
    override var windowHeight: Number
        get() {
            return trackReactiveGet(__v_raw, "windowHeight", __v_raw.windowHeight, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("windowHeight")) {
                return;
            }
            val oldValue = __v_raw.windowHeight;
            __v_raw.windowHeight = value;
            triggerReactiveSet(__v_raw, "windowHeight", oldValue, value);
        }
    override var pageStyle: Map<String, xPageStyle>
        get() {
            return trackReactiveGet(__v_raw, "pageStyle", __v_raw.pageStyle, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("pageStyle")) {
                return;
            }
            val oldValue = __v_raw.pageStyle;
            __v_raw.pageStyle = value;
            triggerReactiveSet(__v_raw, "pageStyle", oldValue, value);
        }
}
open class XCONFIG (
    @JsonNotNull
    open var theme: Map<String, String>,
    @JsonNotNull
    open var color: String,
    @JsonNotNull
    open var dark: String,
    @JsonNotNull
    open var designSize: Number,
    @JsonNotNull
    open var unit: String,
    @JsonNotNull
    open var language: String,
    @JsonNotNull
    open var fontScale: Number,
    @JsonNotNull
    open var navigationBarTextStyleDark: String,
    @JsonNotNull
    open var navigationBarTextStyleLight: String,
    @JsonNotNull
    open var navigationBarBackgroundColorDark: String,
    @JsonNotNull
    open var navigationBarBackgroundColorLight: String,
    @JsonNotNull
    open var backgroundColorContentDark: String,
    @JsonNotNull
    open var backgroundColorContentLight: String,
    @JsonNotNull
    open var tabarBackgroundColorDark: String,
    @JsonNotNull
    open var tabarBackgroundColorLight: String,
    @JsonNotNull
    open var sheetDarkColor: String,
    @JsonNotNull
    open var sheetDarkBorderColor: UTSArray<String>,
    @JsonNotNull
    open var inputDarkColor: String,
    @JsonNotNull
    open var borderDarkColor: String,
    @JsonNotNull
    open var inputRadius: String,
    @JsonNotNull
    open var inputFocusBorder: UTSArray<String>,
    @JsonNotNull
    open var buttonRadius: String,
    @JsonNotNull
    open var tagRadius: String,
    @JsonNotNull
    open var cellRadius: String,
    @JsonNotNull
    open var sheetRadius: UTSArray<String>,
    @JsonNotNull
    open var sheetMargin: UTSArray<String>,
    @JsonNotNull
    open var sheetPadding: UTSArray<String>,
    @JsonNotNull
    open var drawerRadius: String,
    @JsonNotNull
    open var modalRadius: String,
    @JsonNotNull
    open var switchRadius: String,
    @JsonNotNull
    open var progressRadius: String,
    @JsonNotNull
    open var unRadioAndCheckBoxColor: String,
    @JsonNotNull
    open var radioButtonRadius: String,
    @JsonNotNull
    open var animationFun: String,
    @JsonNotNull
    open var cardRound: String,
    @JsonNotNull
    open var closeIcon: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return XCONFIGReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class XCONFIGReactiveObject : XCONFIG, IUTSReactive<XCONFIG> {
    override var __v_raw: XCONFIG;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: XCONFIG, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(theme = __v_raw.theme, color = __v_raw.color, dark = __v_raw.dark, designSize = __v_raw.designSize, unit = __v_raw.unit, language = __v_raw.language, fontScale = __v_raw.fontScale, navigationBarTextStyleDark = __v_raw.navigationBarTextStyleDark, navigationBarTextStyleLight = __v_raw.navigationBarTextStyleLight, navigationBarBackgroundColorDark = __v_raw.navigationBarBackgroundColorDark, navigationBarBackgroundColorLight = __v_raw.navigationBarBackgroundColorLight, backgroundColorContentDark = __v_raw.backgroundColorContentDark, backgroundColorContentLight = __v_raw.backgroundColorContentLight, tabarBackgroundColorDark = __v_raw.tabarBackgroundColorDark, tabarBackgroundColorLight = __v_raw.tabarBackgroundColorLight, sheetDarkColor = __v_raw.sheetDarkColor, sheetDarkBorderColor = __v_raw.sheetDarkBorderColor, inputDarkColor = __v_raw.inputDarkColor, borderDarkColor = __v_raw.borderDarkColor, inputRadius = __v_raw.inputRadius, inputFocusBorder = __v_raw.inputFocusBorder, buttonRadius = __v_raw.buttonRadius, tagRadius = __v_raw.tagRadius, cellRadius = __v_raw.cellRadius, sheetRadius = __v_raw.sheetRadius, sheetMargin = __v_raw.sheetMargin, sheetPadding = __v_raw.sheetPadding, drawerRadius = __v_raw.drawerRadius, modalRadius = __v_raw.modalRadius, switchRadius = __v_raw.switchRadius, progressRadius = __v_raw.progressRadius, unRadioAndCheckBoxColor = __v_raw.unRadioAndCheckBoxColor, radioButtonRadius = __v_raw.radioButtonRadius, animationFun = __v_raw.animationFun, cardRound = __v_raw.cardRound, closeIcon = __v_raw.closeIcon) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): XCONFIGReactiveObject {
        return XCONFIGReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var theme: Map<String, String>
        get() {
            return trackReactiveGet(__v_raw, "theme", __v_raw.theme, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("theme")) {
                return;
            }
            val oldValue = __v_raw.theme;
            __v_raw.theme = value;
            triggerReactiveSet(__v_raw, "theme", oldValue, value);
        }
    override var color: String
        get() {
            return trackReactiveGet(__v_raw, "color", __v_raw.color, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("color")) {
                return;
            }
            val oldValue = __v_raw.color;
            __v_raw.color = value;
            triggerReactiveSet(__v_raw, "color", oldValue, value);
        }
    override var dark: String
        get() {
            return trackReactiveGet(__v_raw, "dark", __v_raw.dark, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("dark")) {
                return;
            }
            val oldValue = __v_raw.dark;
            __v_raw.dark = value;
            triggerReactiveSet(__v_raw, "dark", oldValue, value);
        }
    override var designSize: Number
        get() {
            return trackReactiveGet(__v_raw, "designSize", __v_raw.designSize, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("designSize")) {
                return;
            }
            val oldValue = __v_raw.designSize;
            __v_raw.designSize = value;
            triggerReactiveSet(__v_raw, "designSize", oldValue, value);
        }
    override var unit: String
        get() {
            return trackReactiveGet(__v_raw, "unit", __v_raw.unit, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("unit")) {
                return;
            }
            val oldValue = __v_raw.unit;
            __v_raw.unit = value;
            triggerReactiveSet(__v_raw, "unit", oldValue, value);
        }
    override var language: String
        get() {
            return trackReactiveGet(__v_raw, "language", __v_raw.language, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("language")) {
                return;
            }
            val oldValue = __v_raw.language;
            __v_raw.language = value;
            triggerReactiveSet(__v_raw, "language", oldValue, value);
        }
    override var fontScale: Number
        get() {
            return trackReactiveGet(__v_raw, "fontScale", __v_raw.fontScale, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("fontScale")) {
                return;
            }
            val oldValue = __v_raw.fontScale;
            __v_raw.fontScale = value;
            triggerReactiveSet(__v_raw, "fontScale", oldValue, value);
        }
    override var navigationBarTextStyleDark: String
        get() {
            return trackReactiveGet(__v_raw, "navigationBarTextStyleDark", __v_raw.navigationBarTextStyleDark, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("navigationBarTextStyleDark")) {
                return;
            }
            val oldValue = __v_raw.navigationBarTextStyleDark;
            __v_raw.navigationBarTextStyleDark = value;
            triggerReactiveSet(__v_raw, "navigationBarTextStyleDark", oldValue, value);
        }
    override var navigationBarTextStyleLight: String
        get() {
            return trackReactiveGet(__v_raw, "navigationBarTextStyleLight", __v_raw.navigationBarTextStyleLight, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("navigationBarTextStyleLight")) {
                return;
            }
            val oldValue = __v_raw.navigationBarTextStyleLight;
            __v_raw.navigationBarTextStyleLight = value;
            triggerReactiveSet(__v_raw, "navigationBarTextStyleLight", oldValue, value);
        }
    override var navigationBarBackgroundColorDark: String
        get() {
            return trackReactiveGet(__v_raw, "navigationBarBackgroundColorDark", __v_raw.navigationBarBackgroundColorDark, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("navigationBarBackgroundColorDark")) {
                return;
            }
            val oldValue = __v_raw.navigationBarBackgroundColorDark;
            __v_raw.navigationBarBackgroundColorDark = value;
            triggerReactiveSet(__v_raw, "navigationBarBackgroundColorDark", oldValue, value);
        }
    override var navigationBarBackgroundColorLight: String
        get() {
            return trackReactiveGet(__v_raw, "navigationBarBackgroundColorLight", __v_raw.navigationBarBackgroundColorLight, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("navigationBarBackgroundColorLight")) {
                return;
            }
            val oldValue = __v_raw.navigationBarBackgroundColorLight;
            __v_raw.navigationBarBackgroundColorLight = value;
            triggerReactiveSet(__v_raw, "navigationBarBackgroundColorLight", oldValue, value);
        }
    override var backgroundColorContentDark: String
        get() {
            return trackReactiveGet(__v_raw, "backgroundColorContentDark", __v_raw.backgroundColorContentDark, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("backgroundColorContentDark")) {
                return;
            }
            val oldValue = __v_raw.backgroundColorContentDark;
            __v_raw.backgroundColorContentDark = value;
            triggerReactiveSet(__v_raw, "backgroundColorContentDark", oldValue, value);
        }
    override var backgroundColorContentLight: String
        get() {
            return trackReactiveGet(__v_raw, "backgroundColorContentLight", __v_raw.backgroundColorContentLight, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("backgroundColorContentLight")) {
                return;
            }
            val oldValue = __v_raw.backgroundColorContentLight;
            __v_raw.backgroundColorContentLight = value;
            triggerReactiveSet(__v_raw, "backgroundColorContentLight", oldValue, value);
        }
    override var tabarBackgroundColorDark: String
        get() {
            return trackReactiveGet(__v_raw, "tabarBackgroundColorDark", __v_raw.tabarBackgroundColorDark, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("tabarBackgroundColorDark")) {
                return;
            }
            val oldValue = __v_raw.tabarBackgroundColorDark;
            __v_raw.tabarBackgroundColorDark = value;
            triggerReactiveSet(__v_raw, "tabarBackgroundColorDark", oldValue, value);
        }
    override var tabarBackgroundColorLight: String
        get() {
            return trackReactiveGet(__v_raw, "tabarBackgroundColorLight", __v_raw.tabarBackgroundColorLight, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("tabarBackgroundColorLight")) {
                return;
            }
            val oldValue = __v_raw.tabarBackgroundColorLight;
            __v_raw.tabarBackgroundColorLight = value;
            triggerReactiveSet(__v_raw, "tabarBackgroundColorLight", oldValue, value);
        }
    override var sheetDarkColor: String
        get() {
            return trackReactiveGet(__v_raw, "sheetDarkColor", __v_raw.sheetDarkColor, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("sheetDarkColor")) {
                return;
            }
            val oldValue = __v_raw.sheetDarkColor;
            __v_raw.sheetDarkColor = value;
            triggerReactiveSet(__v_raw, "sheetDarkColor", oldValue, value);
        }
    override var sheetDarkBorderColor: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "sheetDarkBorderColor", __v_raw.sheetDarkBorderColor, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("sheetDarkBorderColor")) {
                return;
            }
            val oldValue = __v_raw.sheetDarkBorderColor;
            __v_raw.sheetDarkBorderColor = value;
            triggerReactiveSet(__v_raw, "sheetDarkBorderColor", oldValue, value);
        }
    override var inputDarkColor: String
        get() {
            return trackReactiveGet(__v_raw, "inputDarkColor", __v_raw.inputDarkColor, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("inputDarkColor")) {
                return;
            }
            val oldValue = __v_raw.inputDarkColor;
            __v_raw.inputDarkColor = value;
            triggerReactiveSet(__v_raw, "inputDarkColor", oldValue, value);
        }
    override var borderDarkColor: String
        get() {
            return trackReactiveGet(__v_raw, "borderDarkColor", __v_raw.borderDarkColor, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("borderDarkColor")) {
                return;
            }
            val oldValue = __v_raw.borderDarkColor;
            __v_raw.borderDarkColor = value;
            triggerReactiveSet(__v_raw, "borderDarkColor", oldValue, value);
        }
    override var inputRadius: String
        get() {
            return trackReactiveGet(__v_raw, "inputRadius", __v_raw.inputRadius, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("inputRadius")) {
                return;
            }
            val oldValue = __v_raw.inputRadius;
            __v_raw.inputRadius = value;
            triggerReactiveSet(__v_raw, "inputRadius", oldValue, value);
        }
    override var inputFocusBorder: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "inputFocusBorder", __v_raw.inputFocusBorder, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("inputFocusBorder")) {
                return;
            }
            val oldValue = __v_raw.inputFocusBorder;
            __v_raw.inputFocusBorder = value;
            triggerReactiveSet(__v_raw, "inputFocusBorder", oldValue, value);
        }
    override var buttonRadius: String
        get() {
            return trackReactiveGet(__v_raw, "buttonRadius", __v_raw.buttonRadius, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("buttonRadius")) {
                return;
            }
            val oldValue = __v_raw.buttonRadius;
            __v_raw.buttonRadius = value;
            triggerReactiveSet(__v_raw, "buttonRadius", oldValue, value);
        }
    override var tagRadius: String
        get() {
            return trackReactiveGet(__v_raw, "tagRadius", __v_raw.tagRadius, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("tagRadius")) {
                return;
            }
            val oldValue = __v_raw.tagRadius;
            __v_raw.tagRadius = value;
            triggerReactiveSet(__v_raw, "tagRadius", oldValue, value);
        }
    override var cellRadius: String
        get() {
            return trackReactiveGet(__v_raw, "cellRadius", __v_raw.cellRadius, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("cellRadius")) {
                return;
            }
            val oldValue = __v_raw.cellRadius;
            __v_raw.cellRadius = value;
            triggerReactiveSet(__v_raw, "cellRadius", oldValue, value);
        }
    override var sheetRadius: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "sheetRadius", __v_raw.sheetRadius, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("sheetRadius")) {
                return;
            }
            val oldValue = __v_raw.sheetRadius;
            __v_raw.sheetRadius = value;
            triggerReactiveSet(__v_raw, "sheetRadius", oldValue, value);
        }
    override var sheetMargin: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "sheetMargin", __v_raw.sheetMargin, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("sheetMargin")) {
                return;
            }
            val oldValue = __v_raw.sheetMargin;
            __v_raw.sheetMargin = value;
            triggerReactiveSet(__v_raw, "sheetMargin", oldValue, value);
        }
    override var sheetPadding: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "sheetPadding", __v_raw.sheetPadding, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("sheetPadding")) {
                return;
            }
            val oldValue = __v_raw.sheetPadding;
            __v_raw.sheetPadding = value;
            triggerReactiveSet(__v_raw, "sheetPadding", oldValue, value);
        }
    override var drawerRadius: String
        get() {
            return trackReactiveGet(__v_raw, "drawerRadius", __v_raw.drawerRadius, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("drawerRadius")) {
                return;
            }
            val oldValue = __v_raw.drawerRadius;
            __v_raw.drawerRadius = value;
            triggerReactiveSet(__v_raw, "drawerRadius", oldValue, value);
        }
    override var modalRadius: String
        get() {
            return trackReactiveGet(__v_raw, "modalRadius", __v_raw.modalRadius, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("modalRadius")) {
                return;
            }
            val oldValue = __v_raw.modalRadius;
            __v_raw.modalRadius = value;
            triggerReactiveSet(__v_raw, "modalRadius", oldValue, value);
        }
    override var switchRadius: String
        get() {
            return trackReactiveGet(__v_raw, "switchRadius", __v_raw.switchRadius, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("switchRadius")) {
                return;
            }
            val oldValue = __v_raw.switchRadius;
            __v_raw.switchRadius = value;
            triggerReactiveSet(__v_raw, "switchRadius", oldValue, value);
        }
    override var progressRadius: String
        get() {
            return trackReactiveGet(__v_raw, "progressRadius", __v_raw.progressRadius, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("progressRadius")) {
                return;
            }
            val oldValue = __v_raw.progressRadius;
            __v_raw.progressRadius = value;
            triggerReactiveSet(__v_raw, "progressRadius", oldValue, value);
        }
    override var unRadioAndCheckBoxColor: String
        get() {
            return trackReactiveGet(__v_raw, "unRadioAndCheckBoxColor", __v_raw.unRadioAndCheckBoxColor, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("unRadioAndCheckBoxColor")) {
                return;
            }
            val oldValue = __v_raw.unRadioAndCheckBoxColor;
            __v_raw.unRadioAndCheckBoxColor = value;
            triggerReactiveSet(__v_raw, "unRadioAndCheckBoxColor", oldValue, value);
        }
    override var radioButtonRadius: String
        get() {
            return trackReactiveGet(__v_raw, "radioButtonRadius", __v_raw.radioButtonRadius, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("radioButtonRadius")) {
                return;
            }
            val oldValue = __v_raw.radioButtonRadius;
            __v_raw.radioButtonRadius = value;
            triggerReactiveSet(__v_raw, "radioButtonRadius", oldValue, value);
        }
    override var animationFun: String
        get() {
            return trackReactiveGet(__v_raw, "animationFun", __v_raw.animationFun, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("animationFun")) {
                return;
            }
            val oldValue = __v_raw.animationFun;
            __v_raw.animationFun = value;
            triggerReactiveSet(__v_raw, "animationFun", oldValue, value);
        }
    override var cardRound: String
        get() {
            return trackReactiveGet(__v_raw, "cardRound", __v_raw.cardRound, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("cardRound")) {
                return;
            }
            val oldValue = __v_raw.cardRound;
            __v_raw.cardRound = value;
            triggerReactiveSet(__v_raw, "cardRound", oldValue, value);
        }
    override var closeIcon: String
        get() {
            return trackReactiveGet(__v_raw, "closeIcon", __v_raw.closeIcon, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("closeIcon")) {
                return;
            }
            val oldValue = __v_raw.closeIcon;
            __v_raw.closeIcon = value;
            triggerReactiveSet(__v_raw, "closeIcon", oldValue, value);
        }
}
typealias xTweenStatus = Number;
typealias xTweenCallbackFunType = (x: Number) -> Number;
open class xTweenEventCallFunType (
    @JsonNotNull
    open var id: String,
    open var ease: xTweenCallbackFunType? = null,
    @JsonNotNull
    open var status: xTweenStatus,
    @JsonNotNull
    open var duration: Number,
    @JsonNotNull
    open var progress: Number,
    @JsonNotNull
    open var oldProgeress: Number,
    @JsonNotNull
    open var startTime: Number,
    @JsonNotNull
    open var autoRemove: Boolean = false,
    @JsonNotNull
    open var complete: xTweenEventCall,
    @JsonNotNull
    open var enter: xTweenEventCall,
    @JsonNotNull
    open var start: xTweenEventCall,
    @JsonNotNull
    open var pause: xTweenEventCall,
    @JsonNotNull
    open var loop: Number,
    @JsonNotNull
    open var tyty: Boolean = false,
    @JsonNotNull
    open var step: Number,
    @JsonNotNull
    open var _finishLoop: Number,
    @JsonNotNull
    open var reverse: Boolean = false,
) : UTSObject()
typealias xTweenEventCall = (item: xTweenEventCallFunType) -> Unit;
open class xTweenAnimate (
    open var complete: xTweenEventCall? = null,
    open var enter: xTweenEventCall? = null,
    open var start: xTweenEventCall? = null,
    open var pause: xTweenEventCall? = null,
    open var ease: Any? = null,
    @JsonNotNull
    open var duration: Number,
    open var autoRemove: Boolean? = null,
    open var loop: Number? = null,
    open var tyty: Boolean? = null,
    open var step: Number? = null,
) : UTSObject()
open class XLINE_OPTS (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    @JsonNotNull
    open var tx: Number,
    @JsonNotNull
    open var ty: Number,
    open var borderWidth: Number? = null,
    open var borderColor: String? = null,
    open var opacity: Number? = null,
    open var globalCompositeOperation: XCANVAS_GLOBALOPERATION? = null,
) : UTSObject()
open class XTEXT_OPTS (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    @JsonNotNull
    open var content: String,
    open var fillColor: String? = null,
    open var fontSize: Number? = null,
    open var fontFamily: String? = null,
    open var maxWidth: Number? = null,
    open var textAlign: String? = null,
    open var textBaseline: String? = null,
    open var borderWidth: Number? = null,
    open var borderColor: String? = null,
    open var opacity: Number? = null,
) : UTSObject()
open class XARC_OPTS (
    @JsonNotNull
    open var radius: Number,
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    open var startAngle: Number? = null,
    open var endAngle: Number? = null,
    open var fillColor: String? = null,
    open var borderWidth: Number? = null,
    open var borderColor: String? = null,
    open var opacity: Number? = null,
    open var scaleX: Number? = null,
    open var scaleY: Number? = null,
    open var rotate: Number? = null,
    open var globalCompositeOperation: XCANVAS_GLOBALOPERATION? = null,
) : UTSObject()
typealias XCANVAS_ANIMATION_ATTRS = String;
typealias XCANVAS_GLOBALOPERATION = String;
open class XCANVAS_ANIMATION_SELF (
    @JsonNotNull
    open var attr: XCANVAS_ANIMATION_ATTRS,
    @JsonNotNull
    open var from: String,
    @JsonNotNull
    open var to: String,
    @JsonNotNull
    open var duration: Number,
) : UTSObject()
open class XCANVAS_ANIMATION (
    @JsonNotNull
    open var attr: XCANVAS_ANIMATION_ATTRS,
    open var from: String? = null,
    @JsonNotNull
    open var to: String,
    open var duration: Number? = null,
    open var ease: Any? = null,
) : UTSObject()
open class XCANVAS_ANIMATION_CILDRENS (
    @JsonNotNull
    open var opts: XCANVAS_ANIMATION_SELF,
    @JsonNotNull
    open var xAnimation: xTweenAnimate,
) : UTSObject()
typealias XCANVAS_EVENTS = String;
open class XCANVAS_EVENTS_DETAIL (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
) : UTSObject()
open class XCANVAS_EVENTS_POS (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
) : UTSObject()
open class XCANVAS_EVENTS_TARGET (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    @JsonNotNull
    open var touchStartPos: XCANVAS_EVENTS_POS,
    @JsonNotNull
    open var touchEndPos: XCANVAS_EVENTS_POS,
    @JsonNotNull
    open var touchMovePos: XCANVAS_EVENTS_POS,
    @JsonNotNull
    open var touchMoveLen: XCANVAS_EVENTS_POS,
    @JsonNotNull
    open var touchEedLen: XCANVAS_EVENTS_POS,
    @JsonNotNull
    open var event: XCANVAS_EVENTS,
) : UTSObject()
typealias XCANVAS_EVENTS_TARGET_CALL = (event: XCANVAS_EVENTS_TARGET) -> Unit;
typealias XCANVAS_EVENTS_TARGET_CALL_SELF = (eventSelf: XCANVAS_EVENTS_TARGET, eventGlobal: XCANVAS_EVENTS_TARGET) -> Unit;
open class XCANVAS_EVENTS_ALL (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var event: XCANVAS_EVENTS_TARGET_CALL,
) : UTSObject()
open class XCANVAS_EVENTS_ALL_SELF (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var event: XCANVAS_EVENTS_TARGET_CALL_SELF,
) : UTSObject()
fun setBgBodyColor() {
    var dark = xConfig.dark;
    uni_setAppTheme(SetAppThemeOptions(theme = dark, success = fun(_: SetAppThemeSuccessResult) {}, fail = fun(result: IAppThemeFail) {
        console.log(result);
    }
    ));
}
val xRequestCall = reactive(X_REQUEST_PRIVATE_CALL_FUN_TYPE(history = utsArrayOf<xRequestHistoryType>(), authPass = true, hostUrl = "", dev = false, header = null, showLoadToast = true, showSuccessToast = true, showErrorToast = true));
typealias xRequestEventType = String;
typealias funType = (arg: Any) -> UTSPromise<Any>;
open class funCall (
    @JsonNotNull
    open var `fun`: funType,
    @JsonNotNull
    open var type: xRequestEventType,
) : UTSObject()
fun getUid2(rdix: Number = 1, length: Number = 12): String {
    var ix = "";
    ix = Math.floor(Math.random() * rdix * Math.floor(Math.random() * Date.now())).toString(10).substring(0, length as Int);
    return ix;
}
open class xRequest {
    private var auth = true;
    private var selfOpts = xRequestOptionsCallBack(successStatusCode = 200, url = "", data = UTSJSONObject(), header = object : UTSJSONObject() {
        var `content-type` = "application/json"
    }, method = "GET", timeout = 6000, firstIpv4 = false, showLoadToast = xRequestCall.showLoadToast, showSuccessToast = xRequestCall.showSuccessToast, showErrorToast = xRequestCall.showErrorToast);
    private var _lisentEventList = utsArrayOf<funCall>();
    private var status = null as xRequestEventType?;
    private var result = xRequestResult(data = null, statusCode = 0, header = UTSJSONObject() as Any, cookies = utsArrayOf<String>());
    private var reqtask = null as RequestTask?;
    constructor(opts: xRequestOptions? = null){
        this.setOptions(opts);
    }
    open fun setOptions(opts: xRequestOptions? = null): xRequestOptionsCallBack {
        if (opts == null) {
            return this.selfOpts;
        }
        var headerTmep = opts.header;
        headerTmep = if (opts.header == null) {
            this.selfOpts.header;
        } else {
            opts.header!!;
        }
        ;
        var dataTmep = opts?.data ?: (UTSJSONObject());
        if (xRequestCall.header != null) {
            var obj = xRequestCall.header as UTSJSONObject;
            var newObj = headerTmep!! as UTSJSONObject;
            for(key in resolveUTSKeyIterator(newObj)){
                obj.set(key, newObj.get(key));
            }
            headerTmep = obj;
        }
        var firstIpv4 = opts.firstIpv4;
        var method = opts.method;
        var timeout = opts.timeout;
        var successStatusCode = opts.successStatusCode;
        var url = opts.url;
        var showLoadToast = opts.showLoadToast;
        var showSuccessToast = opts.showSuccessToast;
        var showErrorToast = opts.showErrorToast;
        firstIpv4 = if (opts.firstIpv4 == null) {
            false;
        } else {
            opts.firstIpv4!!;
        }
        ;
        method = if (opts.method == null) {
            this.selfOpts.method;
        } else {
            opts.method!!;
        }
        ;
        timeout = if (opts.timeout == null) {
            this.selfOpts.timeout;
        } else {
            opts.timeout!!;
        }
        ;
        successStatusCode = if (opts.successStatusCode == null) {
            this.selfOpts.successStatusCode;
        } else {
            opts.successStatusCode!!;
        }
        ;
        url = if (opts.url == null) {
            this.selfOpts.url;
        } else {
            opts.url!!;
        }
        ;
        showLoadToast = if (opts.showLoadToast == null) {
            xRequestCall.showLoadToast;
        } else {
            opts.showLoadToast!!;
        }
        ;
        showSuccessToast = if (opts.showSuccessToast == null) {
            xRequestCall.showSuccessToast;
        } else {
            opts.showSuccessToast!!;
        }
        ;
        showErrorToast = if (opts.showErrorToast == null) {
            xRequestCall.showErrorToast;
        } else {
            opts.showErrorToast!!;
        }
        ;
        this.selfOpts.firstIpv4 = firstIpv4!!;
        this.selfOpts.method = method!! as xRequestMethond;
        this.selfOpts.timeout = timeout!!;
        this.selfOpts.successStatusCode = successStatusCode!!;
        this.selfOpts.data = dataTmep!!;
        this.selfOpts.header = headerTmep!!;
        this.selfOpts.url = url!! as String;
        this.selfOpts.showLoadToast = showLoadToast!! as Boolean;
        this.selfOpts.showSuccessToast = showSuccessToast!! as Boolean;
        this.selfOpts.showErrorToast = showErrorToast!! as Boolean;
        return this.selfOpts;
    }
    open fun addEventListener(event: xRequestEventType = "success", kFun: (arg: Any) -> UTSPromise<Any>): xRequest {
        this._lisentEventList.push(funCall(type = event, `fun` = kFun));
        return this;
    }
    open fun abort(): Boolean {
        if (this.reqtask != null) {
            this.reqtask!!.abort();
            return true;
        }
        return false;
    }
    private fun _callFun_build(): UTSPromise<UTSArray<Any>> {
        if (this.status == null) {
            return UTSPromise.resolve(utsArrayOf<Any>(true));
        }
        var kFun = this._lisentEventList.filter(fun(el): Boolean {
            return el.type == this.status!!;
        }
        );
        var funCalls = kFun.map(fun(el): funType {
            return el.`fun`;
        }
        );
        if (funCalls.length == 0) {
            if (this.status == "auth" || this.status == "before") {
                return UTSPromise.resolve(utsArrayOf<Any>(true));
            }
            return UTSPromise.resolve(utsArrayOf<Any>(this.result));
        }
        return this._buildPromise(funCalls);
    }
    private fun _buildPromise(lst: UTSArray<funType>): UTSPromise<UTSArray<Any>> {
        var _this = this;
        var len = lst.length;
        var i: Number = 0;
        var p = utsArrayOf<Any>();
        fun customPromiseAll(evt: funType): UTSPromise<Any> {
            return wrapUTSPromise(suspend w@{
                    if (i >= len) {
                        return@w UTSPromise.resolve(p);
                    }
                    var arg: Any = _this.selfOpts;
                    if (_this.status != "auth" && _this.status != "before") {
                        arg = _this.result as xRequestResult;
                    }
                    var v = await(evt(arg));
                    if ((_this.status == "auth") && UTSAndroid.`typeof`( v) != "boolean") {
                        v = true;
                    }
                    if ((_this.status == "before") && UTSAndroid.`typeof`( v) != "boolean") {
                        var beforeOpts = JSON.stringify(v);
                        _this.setOptions(JSON.parse<xRequestOptions>(beforeOpts!!)!!);
                        v = true;
                    }
                    if ((_this.status == "before") && UTSAndroid.`typeof`( v) == "boolean") {
                        var iabort = v as Boolean;
                        if (!iabort) {
                            p.push(v);
                            return@w UTSPromise.resolve(p);
                        }
                    }
                    if ((_this.status == "after") && UTSAndroid.`typeof`( v) == "object") {
                        _this.result = v as xRequestResult;
                    }
                    if (_this.status == "success" || _this.status == "timeout" || _this.status == "error" || _this.status == "abort" || _this.status == "complete") {
                        v = _this.result;
                    }
                    i += 1;
                    p.push(v);
                    if (i >= len) {
                        return@w UTSPromise.resolve(p);
                    }
                    return@w await(customPromiseAll(lst[i]));
            });
        }
        return UTSPromise(fun(res, rej){
            customPromiseAll(lst[i]).then(fun(){
                res(p);
            }
            );
        }
        );
    }
    private fun _setDevReqStatus(id: String) {
        if (!xRequestCall.dev) {
            return;
        }
        var eventType = this.status;
        var index: Number = -1;
        run {
            var i: Number = 0;
            while(i < xRequestCall.history.length){
                var item = xRequestCall.history[i];
                if (id == item.id) {
                    index = i;
                    break;
                }
                i++;
            }
        }
        if (index > -1 && eventType != null) {
            xRequestCall.history[index].status = eventType;
            if (eventType == "complete" || eventType == "abort" || eventType == "auth") {
                xRequestCall.history[index].loaded = true;
                xRequestCall.history[index].loading = false;
            }
            if (eventType == "before") {
                xRequestCall.history[index].loading = true;
            }
            if (eventType == "success") {
                xRequestCall.history[index].time = Date.now() - xRequestCall.history[index].time;
            }
            if (eventType == "complete" || eventType == "success") {
                xRequestCall.history[index].result = this.result;
            }
        }
    }
    open fun request(opts: xRequestOptions? = null): UTSPromise<xRequestResult> {
        return wrapUTSPromise(suspend w@{
                var _this = this;
                this.setOptions(opts);
                var requestId = getUid2();
                if (xRequestCall.dev) {
                    xRequestCall.history.push(xRequestHistoryType(id = requestId, loading = true, loaded = false, status = "", time = Date.now(), api = this.selfOpts.url, result = UTSJSONObject() as Any));
                }
                if (_this.selfOpts.showLoadToast) {
                    uni_showLoading(ShowLoadingOptions(title = "..."));
                }
                val url = xRequestCall.hostUrl + this.selfOpts.url;
                if (url == "" || xRequestCall.hostUrl == "") {
                    this.status = "error";
                    this._setDevReqStatus(requestId);
                    await(this._callFun_build());
                    console.warn("未填写请求接口");
                    uni_hideLoading();
                    if (_this.selfOpts.showErrorToast) {
                        return@w UTSPromise<xRequestResult>(fun(tres, trej){
                            uni_showToast(ShowToastOptions(title = "未填请求域名", icon = "error", complete = fun(_) {
                                trej(_this.result);
                            }
                            ));
                        }
                        );
                    }
                    return@w UTSPromise.reject(_this.result);
                }
                if (xRequestCall.authPass == false) {
                    this.status = "auth";
                    console.warn("授权失败，中断请求");
                    this._setDevReqStatus(requestId);
                    await(this._callFun_build());
                    uni_hideLoading();
                    return@w UTSPromise.reject(this.selfOpts);
                }
                this.status = "before";
                this._setDevReqStatus(requestId);
                var jg2 = await(this._callFun_build());
                var isAbor = (jg2 as UTSArray<Boolean>).some(fun(el): Boolean {
                    return !el;
                }
                );
                if (isAbor) {
                    console.warn("事件before中断了请求");
                    this.status = "abort";
                    this._setDevReqStatus(requestId);
                    await(this._callFun_build());
                    uni_hideLoading();
                    return@w UTSPromise.reject(this.result);
                }
                return@w UTSPromise(fun(res, rej){
                    _this.reqtask = uni_request<Any>(RequestOptions(url = url, data = _this.selfOpts.data, header = _this.selfOpts.header, method = _this.selfOpts.method, timeout = _this.selfOpts.timeout, firstIpv4 = _this.selfOpts.firstIpv4, sslVerify = false, withCredentials = false, success = fun(rst) {
                        _this.result = xRequestResult(data = rst.data, statusCode = rst.statusCode, header = rst.header, cookies = rst.cookies as UTSArray<String>);
                        _this.status = "after";
                        _this._setDevReqStatus(requestId);
                        _this._callFun_build().then(fun(v){
                            if (_this.selfOpts.successStatusCode != rst.statusCode) {
                                _this.status = "error";
                                _this.result.statusCode = rst.statusCode;
                                _this._setDevReqStatus(requestId);
                                _this._callFun_build().then(fun(){
                                    uni_hideLoading();
                                    if (_this.selfOpts.showErrorToast) {
                                        uni_showToast(ShowToastOptions(title = "服务器错误：" + rst.statusCode.toString(10), icon = "error", complete = fun(_) {
                                            rej(_this.result);
                                        }));
                                    } else {
                                        rej(_this.result);
                                    }
                                }
                                );
                                return;
                            }
                            var jgtss = v as UTSArray<xRequestResult>;
                            var formartv = _this.result as xRequestResult;
                            if (jgtss.length > 0) {
                                formartv = jgtss[jgtss.length - 1];
                            }
                            _this.result = formartv;
                            _this.status = "success";
                            _this._setDevReqStatus(requestId);
                            _this._callFun_build().then(fun(){
                                uni_hideLoading();
                                if (_this.selfOpts.showSuccessToast) {
                                    var d = formartv.data;
                                    var msg = "请求成功";
                                    if (UTSAndroid.`typeof`( d) == "object" && d != null && !UTSArray.isArray(d)) {
                                        try {
                                            var s = d as UTSJSONObject;
                                            msg = if (s.getString("msg") != null) {
                                                s.getString("msg")!!;
                                            } else {
                                                msg;
                                            }
                                            ;
                                        }
                                         catch (e: Throwable) {
                                            console.error("服务没有返回msg字段");
                                        }
                                    }
                                    uni_showToast(ShowToastOptions(title = msg, icon = "none", complete = fun(_) {
                                        res(_this.result);
                                    }));
                                } else {
                                    res(_this.result);
                                }
                            }
                            );
                        }
                        );
                    }
                    , fail = fun(er) {
                        if (er.errCode == 5) {
                            _this.status = "timeout";
                        } else {
                            _this.status = "error";
                        }
                        _this.result.statusCode = er.errCode;
                        _this._setDevReqStatus(requestId);
                        _this._callFun_build().then(fun(){
                            uni_hideLoading();
                            if (_this.selfOpts.showErrorToast) {
                                uni_showToast(ShowToastOptions(title = "服务器错误：" + er.errCode.toString(), icon = "error", complete = fun(_) {
                                    rej(_this.result);
                                }));
                            } else {
                                rej(_this.result);
                            }
                        }
                        );
                    }
                    , complete = fun(_) {
                        _this.status = "complete";
                        _this._setDevReqStatus(requestId);
                        _this._callFun_build();
                    }
                    ));
                }
                );
        });
    }
    companion object {
        fun setAuth(isPass: Boolean) {
            xRequestCall.authPass = isPass;
        }
        fun setHeader(header: UTSJSONObject? = null): UTSJSONObject? {
            if (xRequestCall.header == null) {
                xRequestCall.header = header;
            } else {
                var obj = xRequestCall.header as UTSJSONObject;
                var newObj = header!! as UTSJSONObject;
                for(key in resolveUTSKeyIterator(newObj)){
                    obj.set(key, newObj.get(key));
                }
                xRequestCall.header = obj;
            }
            return xRequestCall.header;
        }
        fun setHostUrl(url: String?) {
            xRequestCall.hostUrl = if (url == null) {
                "";
            } else {
                url!!;
            }
            ;
        }
        fun setDev(dev: Boolean = false) {
            xRequestCall.dev = dev;
            if (dev) {
                console.warn("tmui4.0提醒：" + "\u4F60\u5F00\u542F\u4E86\u8BF7\u6C42\u8C03\u8BD5\u6A21\u5F0F");
            } else {
                console.warn("tmui4.0提醒：" + "\u4F60\u5173\u95ED\u4E86\u8BF7\u6C42\u8C03\u8BD5\u6A21\u5F0F");
            }
        }
        fun getHistory(): UTSArray<xRequestHistoryType> {
            return xRequestCall.history.slice(0);
        }
        fun setShowToast(showLoadToast: Boolean = true, showSuccessToast: Boolean = true, showErrorToast: Boolean = true) {
            xRequestCall.showLoadToast = showLoadToast;
            xRequestCall.showSuccessToast = showSuccessToast;
            xRequestCall.showErrorToast = showErrorToast;
        }
    }
}
open class ATTRGERTS (
    @JsonNotNull
    open var from: String,
    @JsonNotNull
    open var to: String,
    @JsonNotNull
    open var unit: String,
    @JsonNotNull
    open var now: String,
    @JsonNotNull
    open var progress: Number,
    @JsonNotNull
    open var name: String,
) : UTSObject()
typealias callbackFunType1 = (x: Number) -> Number;
open class xAnimate {
    open var easingList = Map<String, UTSArray<Number>>(utsArrayOf(
        utsArrayOf(
            "linear",
            utsArrayOf(
                0.250,
                0.250,
                0.750,
                0.750
            )
        ),
        utsArrayOf(
            "ease",
            utsArrayOf(
                0.250,
                0.100,
                0.250,
                1.000
            )
        ),
        utsArrayOf(
            "easeIn",
            utsArrayOf(
                0.420,
                0.000,
                1.000,
                1.000
            )
        ),
        utsArrayOf(
            "easeOut",
            utsArrayOf(
                0.000,
                0.000,
                0.580,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOut",
            utsArrayOf(
                0.420,
                0.000,
                0.580,
                1.000
            )
        ),
        utsArrayOf(
            "easeInQuad",
            utsArrayOf(
                0.550,
                0.085,
                0.680,
                0.530
            )
        ),
        utsArrayOf(
            "easeOutQuad",
            utsArrayOf(
                0.250,
                0.460,
                0.450,
                0.940
            )
        ),
        utsArrayOf(
            "easeInOutQuad",
            utsArrayOf(
                0.455,
                0.030,
                0.515,
                0.955
            )
        ),
        utsArrayOf(
            "easeInCubic",
            utsArrayOf(
                0.550,
                0.055,
                0.675,
                0.190
            )
        ),
        utsArrayOf(
            "easeOutCubic",
            utsArrayOf(
                0.215,
                0.610,
                0.355,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutCubic",
            utsArrayOf(
                0.645,
                0.045,
                0.355,
                1.000
            )
        ),
        utsArrayOf(
            "easeInQuart",
            utsArrayOf(
                0.895,
                0.030,
                0.685,
                0.220
            )
        ),
        utsArrayOf(
            "easeOutQuart",
            utsArrayOf(
                0.165,
                0.840,
                0.440,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutQuart",
            utsArrayOf(
                0.770,
                0.000,
                0.175,
                1.000
            )
        ),
        utsArrayOf(
            "easeInQuint",
            utsArrayOf(
                0.755,
                0.050,
                0.855,
                0.060
            )
        ),
        utsArrayOf(
            "easeOutQuint",
            utsArrayOf(
                0.230,
                1.000,
                0.320,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutQuint",
            utsArrayOf(
                0.860,
                0.000,
                0.070,
                1.000
            )
        ),
        utsArrayOf(
            "easeInSine",
            utsArrayOf(
                0.470,
                0.000,
                0.745,
                0.715
            )
        ),
        utsArrayOf(
            "easeOutSine",
            utsArrayOf(
                0.390,
                0.575,
                0.565,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutSine",
            utsArrayOf(
                0.445,
                0.050,
                0.550,
                0.950
            )
        ),
        utsArrayOf(
            "easeInExpo",
            utsArrayOf(
                0.950,
                0.050,
                0.795,
                0.035
            )
        ),
        utsArrayOf(
            "easeOutExpo",
            utsArrayOf(
                0.190,
                1.000,
                0.220,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutExpo",
            utsArrayOf(
                1.000,
                0.000,
                0.000,
                1.000
            )
        ),
        utsArrayOf(
            "easeInCirc",
            utsArrayOf(
                0.600,
                0.040,
                0.980,
                0.335
            )
        ),
        utsArrayOf(
            "easeOutCirc",
            utsArrayOf(
                0.075,
                0.820,
                0.165,
                1.000
            )
        ),
        utsArrayOf(
            "easeInOutBack",
            utsArrayOf(
                0.680,
                -0.550,
                0.265,
                1.550
            )
        )
    ));
    private var tid = null as Number?;
    open var element = null as UniElement?;
    open var timingFunction = "linear";
    open var duration: Number = 500;
    open var ele = "";
    open var running = false;
    open var pauseing = false;
    open var progress: Number = 0;
    open var reverse = false;
    open var tyty = false;
    open var _tyty = false;
    open var loop: Number = 1;
    private var _loop: Number = 0;
    private var _isStopping = true;
    private var attrIndex: Number = 0;
    private var completeCallBack = fun(){};
    private var startCallBack = fun(){};
    private var doCallBack = fun(propress: Number){};
    private var tagetsAttr = utsArrayOf<ATTRGERTS>();
    private var startTime: Number = 0;
    private var easing = null as callbackFunType1?;
    private var isDescPlay = false;
    private var enterCallFun = fun(){};
    private var ChoreographerDemo = null as Choreographer?;
    private var FrameCallbackCallFun = null as FrameCallback?;
    constructor(ele: UniElement?, options: XANIMATE_OPIONS){
        this.element = ele;
        this.duration = if (options.duration == null) {
            this.duration;
        } else {
            options.duration!!;
        }
        ;
        this.loop = if (options.loop == null) {
            this.loop;
        } else {
            options.loop!!;
        }
        ;
        this.tyty = if (options.tyty == null) {
            this.tyty;
        } else {
            options.tyty!!;
        }
        ;
        this.isDescPlay = if (options.isDescPlay == null) {
            this.isDescPlay;
        } else {
            options.isDescPlay!!;
        }
        ;
        var easingName = if (options.timingFunction == null) {
            "linear";
        } else {
            options.timingFunction!!;
        }
        ;
        var ecall = this.easingList.get(easingName);
        if (ecall != null) {
            var ecallps = ecall!!;
            this.easing = bezier(ecallps[0], ecallps[1], ecallps[2], ecallps[3]);
        }
        if (options.bezier != null) {
            var ecallps = options.bezier!!;
            this.easing = bezier(ecallps[0], ecallps[1], ecallps[2], ecallps[3]);
        }
        if (options.complete != null) {
            this.completeCallBack = options.complete!!;
        }
        if (options.start != null) {
            this.startCallBack = options.start!!;
        }
        if (options.frame != null) {
            this.doCallBack = options.frame!!;
        }
    }
    private fun getUnit(n: String?): String {
        if (n == null) {
            return "px";
        }
        var unit = n.replace(UTSRegExp("[\\d|\\-|\\+]", "g"), "");
        if (unit == ".") {
            unit = "";
        }
        return unit;
    }
    open fun setAniReverse(n: Boolean? = null) {
        if (n != null) {
            this.reverse = n!!;
        } else {
            this.reverse = !this.reverse;
        }
    }
    open fun setLoops(n: Number? = null) {
        if (n != null) {
            this.loop = n!!;
        }
    }
    open fun setDurations(n: Number? = null) {
        if (n != null) {
            this.duration = n!!;
        }
    }
    open fun setTytys(n: Boolean? = null) {
        if (n != null) {
            this.tyty = n!!;
        }
    }
    open fun attr(name: String, from: String, to: String, only: Boolean = true): xAnimate {
        var unit = if (this.isColorStyle(name)) {
            "";
        } else {
            this.getUnit(from);
        }
        ;
        var from_n = if (this.isColorStyle(name)) {
            getDefaultColor(from);
        } else {
            parseFloat(from).toString(10);
        }
        ;
        var to_n = if (this.isColorStyle(name)) {
            getDefaultColor(to);
        } else {
            parseFloat(to).toString(10);
        }
        ;
        var index = this.tagetsAttr.findIndex(fun(item: ATTRGERTS): Boolean {
            return item.name == name;
        }
        );
        if (!only) {
            index = -1;
        }
        if (index == -1) {
            this.tagetsAttr.push(ATTRGERTS(from = from_n.toString(), to = to_n.toString(), unit = unit, progress = 0, now = from_n, name = name));
        } else {
            this.tagetsAttr[index] = ATTRGERTS(from = from_n.toString(), to = to_n.toString(), unit = unit, progress = 0, now = from_n, name = name);
        }
        return this;
    }
    private fun interpolate(startValue: Number, endValue: Number, progress: Number): Number {
        return startValue + (endValue - startValue) * progress;
    }
    private fun isColorStyle(kVal: String): Boolean {
        return kVal.indexOf("background") > -1 || kVal.indexOf("color") > -1;
    }
    private fun _setAttr(name: String, current: Number, unit: String, progress: Number, item: ATTRGERTS) {
        if (this.element == null) {
            return;
        }
        if (name == "scaleX") {
            this.element!!.style!!.setProperty("transform", "scaleX(" + current + ")");
        } else if (name == "scaleY") {
            this.element!!.style!!.setProperty("transform", "scaleY(" + current + ")");
        } else if (name == "scale") {
            this.element!!.style!!.setProperty("transform", "scale(" + current + ")");
        } else if (name == "rotateX") {
            this.element!!.style!!.setProperty("transform", "rotateX(" + (current.toString(10) + unit) + ")");
        } else if (name == "rotateY") {
            this.element!!.style!!.setProperty("transform", "rotateY(" + (current.toString(10) + unit) + ")");
        } else if (name == "rotate") {
            this.element!!.style!!.setProperty("transform", "rotate(" + (current.toString(10) + unit) + ")");
        } else if (name == "translateX") {
            this.element!!.style!!.setProperty("transform", "translateX(" + (current.toString(10) + unit) + ")");
        } else if (name == "translateY") {
            this.element!!.style!!.setProperty("transform", "translateY(" + (current.toString(10) + unit) + ")");
        } else if (name == "translate") {
            this.element!!.style!!.setProperty("transform", "translate(" + (current.toString(10) + unit) + "," + (current.toString(10) + unit) + ")");
        } else if (this.isColorStyle(name)) {
            var startRgba = hexToRgb(item.from);
            var dndRgba = hexToRgb(item.to);
            var r = this.interpolate(startRgba.getNumber("r")!!, dndRgba.getNumber("r")!!, progress);
            var g = this.interpolate(startRgba.getNumber("g")!!, dndRgba.getNumber("g")!!, progress);
            var b = this.interpolate(startRgba.getNumber("b")!!, dndRgba.getNumber("b")!!, progress);
            var a = this.interpolate(startRgba.getNumber("a")!!, dndRgba.getNumber("a")!!, progress);
            this.element!!.style!!.setProperty(name, "rgba(" + r.toFixed(0) + "," + g.toFixed(0) + "," + b.toFixed(0) + "," + a.toFixed(1) + ")");
        } else {
            this.element!!.style!!.setProperty(name, current.toFixed(2) + unit);
        }
    }
    private fun _run_web() {}
    private fun _run_weapp() {}
    private fun _run_andriod() {
        var _this = this;
        _this.startTime = 0;
        if (this.ChoreographerDemo == null) {
            this.ChoreographerDemo = Choreographer.getInstance();
        } else {
            if (this.FrameCallbackCallFun != null) {
                _this.ChoreographerDemo!!.removeFrameCallback(this.FrameCallbackCallFun!!);
            }
        }
        open class frameCallback : Choreographer.FrameCallback {
            override fun doFrame(frameTimeNanos: Long) {
                if (_this.startTime <= 0) {
                    _this.startTime = Date.now();
                }
                val progress = Math.min((Date.now() - _this.startTime) / _this.duration + _this.progress, 1);
                if (_this.element != null) {
                    if (!_this.isDescPlay) {
                        run {
                            var i: Number = 0;
                            while(i < _this.tagetsAttr.length){
                                var item = _this.tagetsAttr[i];
                                if (!_this.isColorStyle(item.name)) {
                                    var fromN = parseFloat(item.from);
                                    var toN = parseFloat(item.to);
                                    var easeInt: Number = 1;
                                    if (_this.easing != null) {
                                        var eas = _this.easing!!;
                                        easeInt = eas(progress);
                                    }
                                    var current = fromN + (toN - fromN) * (if (easeInt == 1) {
                                        progress;
                                    } else {
                                        easeInt;
                                    });
                                    if (_this.reverse || _this._tyty) {
                                        current = toN + (fromN - toN) * (if (easeInt == 1) {
                                            progress;
                                        } else {
                                            easeInt;
                                        }
                                        );
                                    }
                                    if (_this.element != null) {
                                        _this._setAttr(item.name, current, item.unit, progress, item);
                                    }
                                } else {
                                    if (_this.element != null) {
                                        _this._setAttr(item.name, 0, item.unit, progress, item);
                                    }
                                }
                                i++;
                            }
                        }
                    } else {
                        if (_this.attrIndex < _this.tagetsAttr.length) {
                            var item = _this.tagetsAttr[_this.attrIndex];
                            item.progress = progress;
                            if (!_this.isColorStyle(item.name)) {
                                var fromN = parseFloat(item.from);
                                var toN = parseFloat(item.to);
                                var easeInt: Number = 1;
                                if (_this.easing != null) {
                                    var eas = _this.easing!!;
                                    easeInt = eas(progress);
                                }
                                var current = fromN + (toN - fromN) * (if (easeInt == 1) {
                                    progress;
                                } else {
                                    easeInt;
                                });
                                if (_this.reverse || _this._tyty) {
                                    current = toN + (fromN - toN) * (if (easeInt == 1) {
                                        progress;
                                    } else {
                                        easeInt;
                                    }
                                    );
                                }
                                if (_this.element != null) {
                                    _this._setAttr(item.name, current, item.unit, progress, item);
                                }
                            } else {
                                if (_this.element != null) {
                                    _this._setAttr(item.name, 0, item.unit, progress, item);
                                }
                            }
                        }
                    }
                }
                if (progress >= 1 || _this._isStopping) {
                    if (_this.isDescPlay && _this.attrIndex < _this.tagetsAttr.length) {
                        _this.attrIndex += 1;
                        _this.progress = 0;
                        _this._run_andriod();
                        return;
                    }
                    _this.progress = 0;
                    if (_this.tyty) {
                        _this._tyty = !_this._tyty;
                    }
                    if (_this.loop == -1) {
                        _this._run_andriod();
                        return;
                    } else {
                        _this._loop += 1;
                        if (_this._loop < _this.loop) {
                            _this._run_andriod();
                            return;
                        }
                    }
                    _this.running = false;
                    _this.completeCallBack();
                    return;
                }
                if (_this.pauseing) {
                    _this.running = false;
                    console.log(_this.pauseing, "动画暂停");
                    _this.progress = progress;
                    return;
                }
                if (progress < 1 && _this.running) {
                    _this.doCallBack(progress);
                    _this.ChoreographerDemo!!.postFrameCallback(this);
                }
            }
        }
        _this.startCallBack();
        this.FrameCallbackCallFun = frameCallback();
        _this.ChoreographerDemo!!.postFrameCallback(this.FrameCallbackCallFun!!);
    }
    private fun __run_web() {}
    private fun __run_andriod() {
        var _this = this;
        if (this.ChoreographerDemo == null) {
            this.ChoreographerDemo = Choreographer.getInstance();
        } else {
            if (this.FrameCallbackCallFun != null) {
                _this.ChoreographerDemo!!.removeFrameCallback(this.FrameCallbackCallFun!!);
            }
        }
        open class frameCallback : Choreographer.FrameCallback {
            override fun doFrame(frameTimeNanos: Long) {
                _this.enterCallFun();
                if (_this._isStopping) {
                    _this.running = false;
                    return;
                }
                if (_this.running) {
                    _this.ChoreographerDemo!!.postFrameCallback(this);
                }
            }
        }
        this.FrameCallbackCallFun = frameCallback();
        _this.ChoreographerDemo!!.postFrameCallback(this.FrameCallbackCallFun!!);
    }
    private fun __run_ios() {}
    open fun play(): xAnimate {
        if (this.running) {
            return this;
        }
        this.running = true;
        this._isStopping = false;
        this.pauseing = false;
        this._loop = 0;
        this.attrIndex = 0;
        this._run_andriod();
        return this;
    }
    open fun stop(): xAnimate {
        var _this = this;
        this._isStopping = true;
        this.progress = 0;
        this.attrIndex = _this.tagetsAttr.length;
        if (this.ChoreographerDemo == null) {
            this.ChoreographerDemo = Choreographer.getInstance();
        } else {
            if (this.FrameCallbackCallFun != null) {
                this.ChoreographerDemo!!.removeFrameCallback(this.FrameCallbackCallFun!!);
            }
        }
        return this;
    }
    open fun pause(): xAnimate {
        this.pauseing = true;
        return this;
    }
    open fun enterFrame(evt: () -> Unit) {
        this.stop();
        this.enterCallFun = evt;
        this.running = true;
        this._isStopping = false;
        this.__run_andriod();
    }
}
open class CONFIG (
    @JsonNotNull
    open var count: Number,
    @JsonNotNull
    open var sourceType: UTSArray<String>,
    @JsonNotNull
    open var sizeType: UTSArray<String>,
    @JsonNotNull
    open var hostUrl: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var header: UTSJSONObject,
    @JsonNotNull
    open var formData: UTSJSONObject,
    @JsonNotNull
    open var multipart: Boolean = false,
    @JsonNotNull
    open var autoUpload: Boolean = false,
    @JsonNotNull
    open var statusCode: Number,
    @JsonNotNull
    open var compress: Boolean = false,
    open var quality: Number? = null,
    open var compressedHeight: Number? = null,
    open var compressedWidth: Number? = null,
) : UTSObject()
open class xUploadMedia {
    open var model = "photo";
    open var videoOps = object : UTSJSONObject() {
        var pageOrientation = "auto"
        var albumMode = "system"
        var sourceType = utsArrayOf<String>("album", "camera")
        var compressed = true
        var maxDuration: Number = 60
        var camera = "back"
    };
    open var config = CONFIG(count = 9, sourceType = utsArrayOf(
        "album",
        "camera"
    ), sizeType = utsArrayOf(
        "original",
        "compressed"
    ), hostUrl = "", name = "file", header = UTSJSONObject(), multipart = false, formData = UTSJSONObject(), autoUpload = true, statusCode = 200, compress = true, quality = 80, compressedHeight = null, compressedWidth = null);
    open var fileList: UTSArray<XUPLOADFILE_FILE_INFO> = utsArrayOf();
    open var currentIndex: Number = 0;
    open var uploading = false;
    open var uploadObj = null as UploadTask?;
    constructor(opts: XUPLOADFILE_INFO = XUPLOADFILE_INFO()){
        this.chuliConfigArgs(opts);
    }
    open var chooseBefore = fun(res: UTSArray<String>): UTSPromise<UTSArray<String>> {
        return UTSPromise.resolve(res);
    }
    ;
    open var complete = fun(res: UTSArray<XUPLOADFILE_FILE_INFO>): UTSPromise<UTSArray<XUPLOADFILE_FILE_INFO>> {
        return UTSPromise.resolve(res);
    }
    ;
    open var change = fun(res: UTSArray<XUPLOADFILE_FILE_INFO>): UTSPromise<UTSArray<XUPLOADFILE_FILE_INFO>> {
        return UTSPromise.resolve(res);
    }
    ;
    open var beforeComplete = fun(res: XUPLOADFILE_FILE_INFO): XUPLOADFILE_FILE_INFO {
        return res;
    }
    ;
    open var myChangeSync = fun(res: UTSArray<XUPLOADFILE_FILE_INFO>) {};
    open var beforeUpload = fun(res: XUPLOADFILE_FILE_INFO): UTSPromise<XUPLOADFILE_FILE_INFO> {
        return UTSPromise.resolve(res);
    }
    ;
    open var events: Map<XUPLOADFILE_EVENT_NAME, (res: Any) -> UTSPromise<Any>> = Map();
    private fun chuliConfigArgs(opts: XUPLOADFILE_INFO): CONFIG {
        this.config = CONFIG(count = if (opts.count == null) {
            this.config.count;
        } else {
            opts.count as Number;
        }
        , statusCode = if (opts.statusCode == null) {
            this.config.statusCode;
        } else {
            opts.statusCode as Number;
        }
        , sourceType = if (opts.sourceType == null) {
            this.config.sourceType;
        } else {
            opts.sourceType as UTSArray<String>;
        }
        , sizeType = if (opts.sizeType == null) {
            this.config.sizeType;
        } else {
            opts.sizeType as UTSArray<String>;
        }
        , hostUrl = if (opts.hostUrl == null) {
            this.config.hostUrl;
        } else {
            opts.hostUrl as String;
        }
        , name = if (opts.name == null) {
            this.config.name;
        } else {
            opts.name as String;
        }
        , header = if (opts.header == null) {
            this.config.header;
        } else {
            opts.header as UTSJSONObject;
        }
        , formData = if (opts.formData == null) {
            this.config.formData;
        } else {
            opts.formData as UTSJSONObject;
        }
        , multipart = if (opts.multipart == null) {
            this.config.multipart;
        } else {
            opts.multipart as Boolean;
        }
        , autoUpload = if (opts.autoUpload == null) {
            this.config.autoUpload;
        } else {
            opts.autoUpload as Boolean;
        }
        , compress = if (opts.compress == null) {
            this.config.compress;
        } else {
            opts.compress as Boolean;
        }
        , quality = if (opts.quality == null) {
            this.config.quality;
        } else {
            opts.quality as Number;
        }
        , compressedHeight = opts.compressedHeight, compressedWidth = opts.compressedWidth);
        return this.config;
    }
    open fun stop() {
        if (this.uploadObj == null) {
            return;
        }
        this.currentIndex = 0;
        this.uploading = false;
        this.uploadObj!!.abort();
        this.uploadObj = null;
        console.info("xUploadMedia:中断上传");
    }
    open fun chooseMedia() {
        if (this.fileList.length == this.config.count) {
            uni_showToast(ShowToastOptions(title = "已超最大上传数量", mask = true, icon = "none"));
            console.warn("xUploadMedia:已经超过最大上传数量");
            return;
        }
        if (this.model == "photo") {
            uni_chooseImage(ChooseImageOptions(count = Math.max(this.config.count - this.fileList.length, 0), sourceType = this.config.sourceType, sizeType = this.config.sizeType, success = fun(res){
                var temps = utsArrayOf<UTSJSONObject>();
                var items = res.tempFiles;
                run {
                    var i: Number = 0;
                    while(i < res.tempFiles.length){
                        temps.push(object : UTSJSONObject() {
                            var path = items[i].path
                            var size = items[i].size
                        });
                        i++;
                    }
                }
                var chooseBefore = this.events.get("chooseBefore");
                if (chooseBefore != null) {
                    if (UTSArray.isArray(temps)) {
                        chooseBefore(res.tempFilePaths).then(fun(){
                            this.addNewFile(temps);
                            if (this.config.autoUpload && !this.uploading) {
                                this.start();
                            }
                        }).`catch`(fun(er){
                            console.error(er);
                            uni_showModal(ShowModalOptions(title = "系统异常", content = er as String, showCancel = false));
                        });
                    } else {
                        var tps = res.tempFilePaths as UTSJSONObject;
                        chooseBefore(utsArrayOf<UTSJSONObject>(tps)).then(fun(){
                            this.addNewFile(temps);
                            if (this.config.autoUpload && !this.uploading) {
                                this.start();
                            }
                        }).`catch`(fun(er){
                            console.error(er);
                            uni_showModal(ShowModalOptions(title = "系统异常", content = er as String, showCancel = false));
                        });
                    }
                } else {
                    if (UTSArray.isArray(temps)) {
                        this.addNewFile(temps);
                        if (this.config.autoUpload && !this.uploading) {
                            this.start();
                        }
                    } else {
                        var tps = res.tempFilePaths as UTSJSONObject;
                        this.addNewFile(utsArrayOf<UTSJSONObject>(tps));
                        if (this.config.autoUpload && !this.uploading) {
                            this.start();
                        }
                    }
                }
            }, fail = fun(err){
                this.chooseBefore(utsArrayOf<String>());
                console.warn("xUploadMedia:", err);
            }));
        } else if (this.model == "video") {
            var pageOrientation = this.videoOps.getString("pageOrientation");
            pageOrientation = if (pageOrientation == null) {
                "auto";
            } else {
                pageOrientation;
            }
            ;
            var albumMode = this.videoOps.getString("albumMode");
            albumMode = if (albumMode == null) {
                "system";
            } else {
                albumMode;
            }
            ;
            var sourceType = this.videoOps.getArray<String>("sourceType");
            sourceType = if (sourceType == null) {
                (utsArrayOf<String>("album", "camera"));
            } else {
                sourceType;
            }
            ;
            var compressed = this.videoOps.getBoolean("compressed");
            compressed = if (compressed == null) {
                true;
            } else {
                compressed;
            }
            ;
            var maxDuration = this.videoOps.getNumber("maxDuration");
            maxDuration = if (maxDuration == null) {
                60;
            } else {
                maxDuration;
            }
            ;
            var camera = this.videoOps.getString("camera");
            camera = if (camera == null) {
                "back";
            } else {
                camera;
            }
            ;
            uni_chooseVideo(ChooseVideoOptions(pageOrientation = pageOrientation, albumMode = albumMode, sourceType = sourceType, compressed = compressed, maxDuration = maxDuration, camera = camera, success = fun(res){
                var temps = utsArrayOf<UTSJSONObject>(object : UTSJSONObject() {
                    var path = res.tempFilePath
                    var size = res.size
                });
                var chooseBefore = this.events.get("chooseBefore");
                if (chooseBefore != null) {
                    chooseBefore(utsArrayOf<String>(res.tempFilePath)).then(fun(){
                        this.addNewFile(temps);
                        if (this.config.autoUpload && !this.uploading) {
                            this.start();
                        }
                    }).`catch`(fun(er){
                        console.error(er);
                        uni_showModal(ShowModalOptions(title = "系统异常", content = er as String, showCancel = false));
                    });
                } else {
                    this.addNewFile(temps);
                    if (this.config.autoUpload && !this.uploading) {
                        this.start();
                    }
                }
            }
            , fail = fun(err){
                this.chooseBefore(utsArrayOf<String>());
                console.warn("xUploadMedia:", err);
            }
            ));
        }
    }
    open fun addListenEvent(eventName: XUPLOADFILE_EVENT_NAME, callback: (res: Any) -> UTSPromise<Any>) {
        this.events.set(eventName, callback);
    }
    open fun <T : UTSArray<*>> addListenEventsss(eventName: XUPLOADFILE_EVENT_NAME, callback: (res: T) -> UTSPromise<T>) {
        if (eventName == "chooseBefore") {
            this.chooseBefore = fun(res2: UTSArray<String>): UTSPromise<UTSArray<String>> {
                return callback(res2 as UTSArray<*> as T) as UTSPromise<UTSArray<String>>;
            };
        } else if (eventName == "complete") {
            this.complete = fun(res2: UTSArray<XUPLOADFILE_FILE_INFO>): UTSPromise<UTSArray<XUPLOADFILE_FILE_INFO>> {
                return callback(res2 as UTSArray<*> as T) as UTSPromise<UTSArray<XUPLOADFILE_FILE_INFO>>;
            };
        } else if (eventName == "change") {
            this.change = fun(res2: UTSArray<XUPLOADFILE_FILE_INFO>): UTSPromise<UTSArray<XUPLOADFILE_FILE_INFO>> {
                return callback(res2 as UTSArray<*> as T) as UTSPromise<UTSArray<XUPLOADFILE_FILE_INFO>>;
            }
            ;
        }
    }
    open fun setConfig(opts: XUPLOADFILE_INFO) {
        this.chuliConfigArgs(opts);
    }
    open fun setVideoOps(config: UTSJSONObject, model: String) {
        this.videoOps = config;
        this.model = model;
    }
    open fun setChangeSync(callBack: (res: UTSArray<XUPLOADFILE_FILE_INFO>) -> Unit) {
        this.myChangeSync = fun(res2: UTSArray<XUPLOADFILE_FILE_INFO>) {
            callBack(res2);
        }
        ;
    }
    open fun delFile(id: String): Boolean {
        var index = this.fileList.findIndex(fun(item: XUPLOADFILE_FILE_INFO): Boolean {
            return item.id == id;
        }
        );
        if (index >= 0) {
            var item = this.fileList[index];
            if (item.status == 1) {
                item.status = 4;
                item.statusText = "取消上传";
                this.stop();
            }
            this.fileList.splice(index, 1);
            this.myChangeSync(this.fileList);
            return true;
        }
        return false;
    }
    open fun clear() {
        this.fileList = utsArrayOf<XUPLOADFILE_FILE_INFO>();
        this.myChangeSync(this.fileList);
    }
    private fun addNewFile(files: UTSArray<UTSJSONObject>) {
        if (files.length == 0) {
            return;
        }
        var t = this;
        if (this.model == "photo") {
            var i: Number = 0;
            fun compress() {
                if (i >= files.length) {
                    return;
                }
                var item = files[i]!! as UTSJSONObject;
                uni_compressImage(CompressImageOptions(src = item.getString("path")!!, quality = t.config.quality, compressedHeight = t.config.compressedHeight, compressedWidth = t.config.compressedWidth, success = fun(res: CompressImageSuccess){
                    item.set("path", res.tempFilePath);
                    i += 1;
                    compress();
                }
                , fail = fun(err){
                    i += 1;
                    compress();
                }
                ));
            }
            if (this.config.compress) {
                compress();
            }
        }
        files.forEach(fun(item: UTSJSONObject){
            var id = getUid1();
            var name = "";
            var size: Number = 0;
            var items = item as UTSJSONObject;
            name = items.getString("path")!!;
            size = items.getNumber("size")!!;
            this.fileList.push(XUPLOADFILE_FILE_INFO(id = id, type = "", size = size, extension = name.substring(name.lastIndexOf(".") + 1), statusText = "待上传", status = 0, path = name, progress = 0, response = "", name = name.substring(name.lastIndexOf("/") + 1), model = this.model));
        }
        );
        this.myChangeSync(this.fileList);
    }
    open fun addFile(files: UTSArray<XUPLOADFILE_FILE_VALUE>) {
        var ids = this.fileList.map(fun(el: XUPLOADFILE_FILE_INFO): String {
            return el.id;
        }
        );
        var i: Number = 0;
        files.forEach(fun(el: XUPLOADFILE_FILE_VALUE){
            var oldId = if (el.id == null) {
                "";
            } else {
                el.id!! as String;
            }
            ;
            if (!ids.includes(oldId)) {
                var id = getUid1();
                var name = el.url;
                this.fileList.push(XUPLOADFILE_FILE_INFO(id = id, type = "", size = 0, extension = name.substring(name.lastIndexOf(".") + 1), statusText = "上传成功", status = 2, path = name, progress = 100, response = if (el.response == null) {
                    "";
                } else {
                    el.response!! as String;
                }
                , name = name.substring(name.lastIndexOf("/") + 1)));
                ++i;
            }
        }
        );
        if (i > 0) {
            this.myChangeSync(this.fileList);
        }
    }
    open fun _addFilesByself(files: UTSArray<XUPLOADFILE_FILE_INFO>) {
        this.fileList = files.slice(0);
    }
    private fun getWaitUploadFilesNumber(): Number {
        var num: Number = 0;
        this.fileList.forEach(fun(item: XUPLOADFILE_FILE_INFO){
            if (item.status == 0 || item.status == 3 || item.status == 4) {
                num += 1;
            }
        }
        );
        return num;
    }
    open fun start() {
        if (this.uploading) {
            return;
        }
        this.uploading = true;
        this.currentIndex = 0;
        this.uploadFile();
    }
    private fun uploadFile() {
        if (this.currentIndex >= this.fileList.length) {
            this.uploadObj = null;
            this.uploading = false;
            this.complete(this.fileList);
            this.myChangeSync(this.fileList);
            var complete = this.events.get("complete");
            if (complete != null) {
                complete(this.fileList.slice(0));
            }
            return;
        }
        this.beforeUpload(this.fileList[this.currentIndex]).then(fun(beforeUploadFileRes: XUPLOADFILE_FILE_INFO){
            this.fileList[this.currentIndex] = beforeUploadFileRes;
            var nowitemStatus = this.fileList[this.currentIndex].status;
            if (nowitemStatus == 1 || nowitemStatus == 2 || nowitemStatus == 5) {
                this.uploadObj = null;
                this.uploading = false;
                this.currentIndex += 1;
                this.uploadFile();
                return;
            }
            this.fileList[this.currentIndex].status = 1;
            this.fileList[this.currentIndex].statusText = "上传中";
            this.myChangeSync(this.fileList);
            this.uploadObj = uni_uploadFile(UploadFileOptions(url = this.config.hostUrl, filePath = this.fileList[this.currentIndex].path, name = this.config.name, formData = this.config.formData, header = this.config.header, success = fun(uploadFileRes){
                if (uploadFileRes.statusCode != 200) {
                    this.fileList[this.currentIndex].status = 3;
                    this.fileList[this.currentIndex].statusText = "上传失败";
                    this.currentIndex += 1;
                    this.uploadFile();
                    this.myChangeSync(this.fileList);
                    return;
                }
                this.fileList[this.currentIndex].status = 2;
                this.fileList[this.currentIndex].response = uploadFileRes.data;
                this.fileList[this.currentIndex].statusText = "上传成功";
                var itemtemp = this.fileList.slice(0)[this.currentIndex];
                var calllItem = this.beforeComplete(itemtemp);
                this.fileList[this.currentIndex] = calllItem;
                this.currentIndex += 1;
                this.uploadFile();
                this.myChangeSync(this.fileList);
            }
            , fail = fun(_){
                this.fileList[this.currentIndex].status = 3;
                this.fileList[this.currentIndex].statusText = "上传失败";
                this.currentIndex += 1;
                this.uploadFile();
            }
            , complete = fun(_){
                this.myChangeSync(this.fileList);
            }
            ));
            this.uploadObj?.onProgressUpdate(fun(res){
                this.fileList[this.currentIndex].progress = res.progress;
                this.myChangeSync(this.fileList);
            }
            );
        }
        );
    }
}
val xui = definePlugin(VuePlugin(install = fun(app: VueApp) {
    var darkModel = getDarkMode();
    if (isCustomTheme()) {
        xConfig.dark = darkModel;
    } else {
        if (xConfig.dark == "auto") {
            uni_setStorageSync("tmuiXuiOsThemeSet", darkModel);
            xConfig.dark = darkModel;
        } else {
            uni_setStorageSync("tmuiXuiOsThemeSet", xConfig.dark);
        }
    }
    WebObserveTheme();
    setThemeDarkModel();
}
));
open class xStore {
    companion object {
        var xConfig = uni.UNIBEFAB40.xConfig;
        var setConfig = uni.UNIBEFAB40.setConfig;
        var getDarkModel = uni.UNIBEFAB40.getDarkModel;
        var setDarkModel = uni.UNIBEFAB40.setDarkModel;
        var getThemePrimary = uni.UNIBEFAB40.getThemePrimary;
        var setThemePrimary = uni.UNIBEFAB40.setThemePrimary;
        var xProvitae = uni.UNIBEFAB40.xProvitae;
        var xTabbarConfig = uni.UNIBEFAB40.xTabbarConfig;
    }
}
val fonts: UTSJSONObject = object : UTSJSONObject() {
    var `24-hours-fill` = "ea01"
    var `24-hours-line` = "ea02"
    var `4k-fill` = "ea03"
    var `4k-line` = "ea04"
    var `a-b` = "ea05"
    var `account-box-fill` = "ea06"
    var `account-box-line` = "ea07"
    var `account-circle-fill` = "ea08"
    var `account-circle-line` = "ea09"
    var `account-pin-box-fill` = "ea0a"
    var `account-pin-box-line` = "ea0b"
    var `account-pin-circle-fill` = "ea0c"
    var `account-pin-circle-line` = "ea0d"
    var `add-box-fill` = "ea0e"
    var `add-box-line` = "ea0f"
    var `add-circle-fill` = "ea10"
    var `add-circle-line` = "ea11"
    var `add-fill` = "ea12"
    var `add-line` = "ea13"
    var `admin-fill` = "ea14"
    var `admin-line` = "ea15"
    var `advertisement-fill` = "ea16"
    var `advertisement-line` = "ea17"
    var `airplay-fill` = "ea18"
    var `airplay-line` = "ea19"
    var `alarm-fill` = "ea1a"
    var `alarm-line` = "ea1b"
    var `alarm-warning-fill` = "ea1c"
    var `alarm-warning-line` = "ea1d"
    var `album-fill` = "ea1e"
    var `album-line` = "ea1f"
    var `alert-fill` = "ea20"
    var `alert-line` = "ea21"
    var `aliens-fill` = "ea22"
    var `aliens-line` = "ea23"
    var `align-bottom` = "ea24"
    var `align-center` = "ea25"
    var `align-justify` = "ea26"
    var `align-left` = "ea27"
    var `align-right` = "ea28"
    var `align-top` = "ea29"
    var `align-vertically` = "ea2a"
    var `alipay-fill` = "ea2b"
    var `alipay-line` = "ea2c"
    var `amazon-fill` = "ea2d"
    var `amazon-line` = "ea2e"
    var `anchor-fill` = "ea2f"
    var `anchor-line` = "ea30"
    var `ancient-gate-fill` = "ea31"
    var `ancient-gate-line` = "ea32"
    var `ancient-pavilion-fill` = "ea33"
    var `ancient-pavilion-line` = "ea34"
    var `android-fill` = "ea35"
    var `android-line` = "ea36"
    var `angularjs-fill` = "ea37"
    var `angularjs-line` = "ea38"
    var `anticlockwise-2-fill` = "ea39"
    var `anticlockwise-2-line` = "ea3a"
    var `anticlockwise-fill` = "ea3b"
    var `anticlockwise-line` = "ea3c"
    var `app-store-fill` = "ea3d"
    var `app-store-line` = "ea3e"
    var `apple-fill` = "ea3f"
    var `apple-line` = "ea40"
    var `apps-2-fill` = "ea41"
    var `apps-2-line` = "ea42"
    var `apps-fill` = "ea43"
    var `apps-line` = "ea44"
    var `archive-drawer-fill` = "ea45"
    var `archive-drawer-line` = "ea46"
    var `archive-fill` = "ea47"
    var `archive-line` = "ea48"
    var `arrow-down-circle-fill` = "ea49"
    var `arrow-down-circle-line` = "ea4a"
    var `arrow-down-fill` = "ea4b"
    var `arrow-down-line` = "ea4c"
    var `arrow-down-s-fill` = "ea4d"
    var `arrow-down-s-line` = "ea4e"
    var `arrow-drop-down-fill` = "ea4f"
    var `arrow-drop-down-line` = "ea50"
    var `arrow-drop-left-fill` = "ea51"
    var `arrow-drop-left-line` = "ea52"
    var `arrow-drop-right-fill` = "ea53"
    var `arrow-drop-right-line` = "ea54"
    var `arrow-drop-up-fill` = "ea55"
    var `arrow-drop-up-line` = "ea56"
    var `arrow-go-back-fill` = "ea57"
    var `arrow-go-back-line` = "ea58"
    var `arrow-go-forward-fill` = "ea59"
    var `arrow-go-forward-line` = "ea5a"
    var `arrow-left-circle-fill` = "ea5b"
    var `arrow-left-circle-line` = "ea5c"
    var `arrow-left-down-fill` = "ea5d"
    var `arrow-left-down-line` = "ea5e"
    var `arrow-left-fill` = "ea5f"
    var `arrow-left-line` = "ea60"
    var `arrow-left-right-fill` = "ea61"
    var `arrow-left-right-line` = "ea62"
    var `arrow-left-s-fill` = "ea63"
    var `arrow-left-s-line` = "ea64"
    var `arrow-left-up-fill` = "ea65"
    var `arrow-left-up-line` = "ea66"
    var `arrow-right-circle-fill` = "ea67"
    var `arrow-right-circle-line` = "ea68"
    var `arrow-right-down-fill` = "ea69"
    var `arrow-right-down-line` = "ea6a"
    var `arrow-right-fill` = "ea6b"
    var `arrow-right-line` = "ea6c"
    var `arrow-right-s-fill` = "ea6d"
    var `arrow-right-s-line` = "ea6e"
    var `arrow-right-up-fill` = "ea6f"
    var `arrow-right-up-line` = "ea70"
    var `arrow-up-circle-fill` = "ea71"
    var `arrow-up-circle-line` = "ea72"
    var `arrow-up-down-fill` = "ea73"
    var `arrow-up-down-line` = "ea74"
    var `arrow-up-fill` = "ea75"
    var `arrow-up-line` = "ea76"
    var `arrow-up-s-fill` = "ea77"
    var `arrow-up-s-line` = "ea78"
    var `artboard-2-fill` = "ea79"
    var `artboard-2-line` = "ea7a"
    var `artboard-fill` = "ea7b"
    var `artboard-line` = "ea7c"
    var `article-fill` = "ea7d"
    var `article-line` = "ea7e"
    var `aspect-ratio-fill` = "ea7f"
    var `aspect-ratio-line` = "ea80"
    var asterisk = "ea81"
    var `at-fill` = "ea82"
    var `at-line` = "ea83"
    var `attachment-2` = "ea84"
    var `attachment-fill` = "ea85"
    var `attachment-line` = "ea86"
    var `auction-fill` = "ea87"
    var `auction-line` = "ea88"
    var `award-fill` = "ea89"
    var `award-line` = "ea8a"
    var `baidu-fill` = "ea8b"
    var `baidu-line` = "ea8c"
    var `ball-pen-fill` = "ea8d"
    var `ball-pen-line` = "ea8e"
    var `bank-card-2-fill` = "ea8f"
    var `bank-card-2-line` = "ea90"
    var `bank-card-fill` = "ea91"
    var `bank-card-line` = "ea92"
    var `bank-fill` = "ea93"
    var `bank-line` = "ea94"
    var `bar-chart-2-fill` = "ea95"
    var `bar-chart-2-line` = "ea96"
    var `bar-chart-box-fill` = "ea97"
    var `bar-chart-box-line` = "ea98"
    var `bar-chart-fill` = "ea99"
    var `bar-chart-grouped-fill` = "ea9a"
    var `bar-chart-grouped-line` = "ea9b"
    var `bar-chart-horizontal-fill` = "ea9c"
    var `bar-chart-horizontal-line` = "ea9d"
    var `bar-chart-line` = "ea9e"
    var `barcode-box-fill` = "ea9f"
    var `barcode-box-line` = "eaa0"
    var `barcode-fill` = "eaa1"
    var `barcode-line` = "eaa2"
    var `barricade-fill` = "eaa3"
    var `barricade-line` = "eaa4"
    var `base-station-fill` = "eaa5"
    var `base-station-line` = "eaa6"
    var `basketball-fill` = "eaa7"
    var `basketball-line` = "eaa8"
    var `battery-2-charge-fill` = "eaa9"
    var `battery-2-charge-line` = "eaaa"
    var `battery-2-fill` = "eaab"
    var `battery-2-line` = "eaac"
    var `battery-charge-fill` = "eaad"
    var `battery-charge-line` = "eaae"
    var `battery-fill` = "eaaf"
    var `battery-line` = "eab0"
    var `battery-low-fill` = "eab1"
    var `battery-low-line` = "eab2"
    var `battery-saver-fill` = "eab3"
    var `battery-saver-line` = "eab4"
    var `battery-share-fill` = "eab5"
    var `battery-share-line` = "eab6"
    var `bear-smile-fill` = "eab7"
    var `bear-smile-line` = "eab8"
    var `behance-fill` = "eab9"
    var `behance-line` = "eaba"
    var `bell-fill` = "eabb"
    var `bell-line` = "eabc"
    var `bike-fill` = "eabd"
    var `bike-line` = "eabe"
    var `bilibili-fill` = "eabf"
    var `bilibili-line` = "eac0"
    var `bill-fill` = "eac1"
    var `bill-line` = "eac2"
    var `billiards-fill` = "eac3"
    var `billiards-line` = "eac4"
    var `bit-coin-fill` = "eac5"
    var `bit-coin-line` = "eac6"
    var `blaze-fill` = "eac7"
    var `blaze-line` = "eac8"
    var `bluetooth-connect-fill` = "eac9"
    var `bluetooth-connect-line` = "eaca"
    var `bluetooth-fill` = "eacb"
    var `bluetooth-line` = "eacc"
    var `blur-off-fill` = "eacd"
    var `blur-off-line` = "eace"
    var `body-scan-fill` = "eacf"
    var `body-scan-line` = "ead0"
    var bold = "ead1"
    var `book-2-fill` = "ead2"
    var `book-2-line` = "ead3"
    var `book-3-fill` = "ead4"
    var `book-3-line` = "ead5"
    var `book-fill` = "ead6"
    var `book-line` = "ead7"
    var `book-marked-fill` = "ead8"
    var `book-marked-line` = "ead9"
    var `book-open-fill` = "eada"
    var `book-open-line` = "eadb"
    var `book-read-fill` = "eadc"
    var `book-read-line` = "eadd"
    var `booklet-fill` = "eade"
    var `booklet-line` = "eadf"
    var `bookmark-2-fill` = "eae0"
    var `bookmark-2-line` = "eae1"
    var `bookmark-3-fill` = "eae2"
    var `bookmark-3-line` = "eae3"
    var `bookmark-fill` = "eae4"
    var `bookmark-line` = "eae5"
    var `boxing-fill` = "eae6"
    var `boxing-line` = "eae7"
    var `braces-fill` = "eae8"
    var `braces-line` = "eae9"
    var `brackets-fill` = "eaea"
    var `brackets-line` = "eaeb"
    var `briefcase-2-fill` = "eaec"
    var `briefcase-2-line` = "eaed"
    var `briefcase-3-fill` = "eaee"
    var `briefcase-3-line` = "eaef"
    var `briefcase-4-fill` = "eaf0"
    var `briefcase-4-line` = "eaf1"
    var `briefcase-5-fill` = "eaf2"
    var `briefcase-5-line` = "eaf3"
    var `briefcase-fill` = "eaf4"
    var `briefcase-line` = "eaf5"
    var `bring-forward` = "eaf6"
    var `bring-to-front` = "eaf7"
    var `broadcast-fill` = "eaf8"
    var `broadcast-line` = "eaf9"
    var `brush-2-fill` = "eafa"
    var `brush-2-line` = "eafb"
    var `brush-3-fill` = "eafc"
    var `brush-3-line` = "eafd"
    var `brush-4-fill` = "eafe"
    var `brush-4-line` = "eaff"
    var `brush-fill` = "eb00"
    var `brush-line` = "eb01"
    var `bubble-chart-fill` = "eb02"
    var `bubble-chart-line` = "eb03"
    var `bug-2-fill` = "eb04"
    var `bug-2-line` = "eb05"
    var `bug-fill` = "eb06"
    var `bug-line` = "eb07"
    var `building-2-fill` = "eb08"
    var `building-2-line` = "eb09"
    var `building-3-fill` = "eb0a"
    var `building-3-line` = "eb0b"
    var `building-4-fill` = "eb0c"
    var `building-4-line` = "eb0d"
    var `building-fill` = "eb0e"
    var `building-line` = "eb0f"
    var `bus-2-fill` = "eb10"
    var `bus-2-line` = "eb11"
    var `bus-fill` = "eb12"
    var `bus-line` = "eb13"
    var `bus-wifi-fill` = "eb14"
    var `bus-wifi-line` = "eb15"
    var `cactus-fill` = "eb16"
    var `cactus-line` = "eb17"
    var `cake-2-fill` = "eb18"
    var `cake-2-line` = "eb19"
    var `cake-3-fill` = "eb1a"
    var `cake-3-line` = "eb1b"
    var `cake-fill` = "eb1c"
    var `cake-line` = "eb1d"
    var `calculator-fill` = "eb1e"
    var `calculator-line` = "eb1f"
    var `calendar-2-fill` = "eb20"
    var `calendar-2-line` = "eb21"
    var `calendar-check-fill` = "eb22"
    var `calendar-check-line` = "eb23"
    var `calendar-event-fill` = "eb24"
    var `calendar-event-line` = "eb25"
    var `calendar-fill` = "eb26"
    var `calendar-line` = "eb27"
    var `calendar-todo-fill` = "eb28"
    var `calendar-todo-line` = "eb29"
    var `camera-2-fill` = "eb2a"
    var `camera-2-line` = "eb2b"
    var `camera-3-fill` = "eb2c"
    var `camera-3-line` = "eb2d"
    var `camera-fill` = "eb2e"
    var `camera-lens-fill` = "eb2f"
    var `camera-lens-line` = "eb30"
    var `camera-line` = "eb31"
    var `camera-off-fill` = "eb32"
    var `camera-off-line` = "eb33"
    var `camera-switch-fill` = "eb34"
    var `camera-switch-line` = "eb35"
    var `capsule-fill` = "eb36"
    var `capsule-line` = "eb37"
    var `car-fill` = "eb38"
    var `car-line` = "eb39"
    var `car-washing-fill` = "eb3a"
    var `car-washing-line` = "eb3b"
    var `caravan-fill` = "eb3c"
    var `caravan-line` = "eb3d"
    var `cast-fill` = "eb3e"
    var `cast-line` = "eb3f"
    var `cellphone-fill` = "eb40"
    var `cellphone-line` = "eb41"
    var `celsius-fill` = "eb42"
    var `celsius-line` = "eb43"
    var `centos-fill` = "eb44"
    var `centos-line` = "eb45"
    var `character-recognition-fill` = "eb46"
    var `character-recognition-line` = "eb47"
    var `charging-pile-2-fill` = "eb48"
    var `charging-pile-2-line` = "eb49"
    var `charging-pile-fill` = "eb4a"
    var `charging-pile-line` = "eb4b"
    var `chat-1-fill` = "eb4c"
    var `chat-1-line` = "eb4d"
    var `chat-2-fill` = "eb4e"
    var `chat-2-line` = "eb4f"
    var `chat-3-fill` = "eb50"
    var `chat-3-line` = "eb51"
    var `chat-4-fill` = "eb52"
    var `chat-4-line` = "eb53"
    var `chat-check-fill` = "eb54"
    var `chat-check-line` = "eb55"
    var `chat-delete-fill` = "eb56"
    var `chat-delete-line` = "eb57"
    var `chat-download-fill` = "eb58"
    var `chat-download-line` = "eb59"
    var `chat-follow-up-fill` = "eb5a"
    var `chat-follow-up-line` = "eb5b"
    var `chat-forward-fill` = "eb5c"
    var `chat-forward-line` = "eb5d"
    var `chat-heart-fill` = "eb5e"
    var `chat-heart-line` = "eb5f"
    var `chat-history-fill` = "eb60"
    var `chat-history-line` = "eb61"
    var `chat-new-fill` = "eb62"
    var `chat-new-line` = "eb63"
    var `chat-off-fill` = "eb64"
    var `chat-off-line` = "eb65"
    var `chat-poll-fill` = "eb66"
    var `chat-poll-line` = "eb67"
    var `chat-private-fill` = "eb68"
    var `chat-private-line` = "eb69"
    var `chat-quote-fill` = "eb6a"
    var `chat-quote-line` = "eb6b"
    var `chat-settings-fill` = "eb6c"
    var `chat-settings-line` = "eb6d"
    var `chat-smile-2-fill` = "eb6e"
    var `chat-smile-2-line` = "eb6f"
    var `chat-smile-3-fill` = "eb70"
    var `chat-smile-3-line` = "eb71"
    var `chat-smile-fill` = "eb72"
    var `chat-smile-line` = "eb73"
    var `chat-upload-fill` = "eb74"
    var `chat-upload-line` = "eb75"
    var `chat-voice-fill` = "eb76"
    var `chat-voice-line` = "eb77"
    var `check-double-fill` = "eb78"
    var `check-double-line` = "eb79"
    var `check-fill` = "eb7a"
    var `check-line` = "eb7b"
    var `checkbox-blank-circle-fill` = "eb7c"
    var `checkbox-blank-circle-line` = "eb7d"
    var `checkbox-blank-fill` = "eb7e"
    var `checkbox-blank-line` = "eb7f"
    var `checkbox-circle-fill` = "eb80"
    var `checkbox-circle-line` = "eb81"
    var `checkbox-fill` = "eb82"
    var `checkbox-indeterminate-fill` = "eb83"
    var `checkbox-indeterminate-line` = "eb84"
    var `checkbox-line` = "eb85"
    var `checkbox-multiple-blank-fill` = "eb86"
    var `checkbox-multiple-blank-line` = "eb87"
    var `checkbox-multiple-fill` = "eb88"
    var `checkbox-multiple-line` = "eb89"
    var `china-railway-fill` = "eb8a"
    var `china-railway-line` = "eb8b"
    var `chrome-fill` = "eb8c"
    var `chrome-line` = "eb8d"
    var `clapperboard-fill` = "eb8e"
    var `clapperboard-line` = "eb8f"
    var `clipboard-fill` = "eb90"
    var `clipboard-line` = "eb91"
    var `clockwise-2-fill` = "eb92"
    var `clockwise-2-line` = "eb93"
    var `clockwise-fill` = "eb94"
    var `clockwise-line` = "eb95"
    var `close-circle-fill` = "eb96"
    var `close-circle-line` = "eb97"
    var `close-fill` = "eb98"
    var `close-line` = "eb99"
    var `closed-captioning-fill` = "eb9a"
    var `closed-captioning-line` = "eb9b"
    var `cloud-fill` = "eb9c"
    var `cloud-line` = "eb9d"
    var `cloud-off-fill` = "eb9e"
    var `cloud-off-line` = "eb9f"
    var `cloud-windy-fill` = "eba0"
    var `cloud-windy-line` = "eba1"
    var `cloudy-2-fill` = "eba2"
    var `cloudy-2-line` = "eba3"
    var `cloudy-fill` = "eba4"
    var `cloudy-line` = "eba5"
    var `code-box-fill` = "eba6"
    var `code-box-line` = "eba7"
    var `code-fill` = "eba8"
    var `code-line` = "eba9"
    var `code-s-fill` = "ebaa"
    var `code-s-line` = "ebab"
    var `code-s-slash-fill` = "ebac"
    var `code-s-slash-line` = "ebad"
    var `code-view` = "ebae"
    var `codepen-fill` = "ebaf"
    var `codepen-line` = "ebb0"
    var `coin-fill` = "ebb1"
    var `coin-line` = "ebb2"
    var `coins-fill` = "ebb3"
    var `coins-line` = "ebb4"
    var `collage-fill` = "ebb5"
    var `collage-line` = "ebb6"
    var `command-fill` = "ebb7"
    var `command-line` = "ebb8"
    var `community-fill` = "ebb9"
    var `community-line` = "ebba"
    var `compass-2-fill` = "ebbb"
    var `compass-2-line` = "ebbc"
    var `compass-3-fill` = "ebbd"
    var `compass-3-line` = "ebbe"
    var `compass-4-fill` = "ebbf"
    var `compass-4-line` = "ebc0"
    var `compass-discover-fill` = "ebc1"
    var `compass-discover-line` = "ebc2"
    var `compass-fill` = "ebc3"
    var `compass-line` = "ebc4"
    var `compasses-2-fill` = "ebc5"
    var `compasses-2-line` = "ebc6"
    var `compasses-fill` = "ebc7"
    var `compasses-line` = "ebc8"
    var `computer-fill` = "ebc9"
    var `computer-line` = "ebca"
    var `contacts-book-2-fill` = "ebcb"
    var `contacts-book-2-line` = "ebcc"
    var `contacts-book-fill` = "ebcd"
    var `contacts-book-line` = "ebce"
    var `contacts-book-upload-fill` = "ebcf"
    var `contacts-book-upload-line` = "ebd0"
    var `contacts-fill` = "ebd1"
    var `contacts-line` = "ebd2"
    var `contrast-2-fill` = "ebd3"
    var `contrast-2-line` = "ebd4"
    var `contrast-drop-2-fill` = "ebd5"
    var `contrast-drop-2-line` = "ebd6"
    var `contrast-drop-fill` = "ebd7"
    var `contrast-drop-line` = "ebd8"
    var `contrast-fill` = "ebd9"
    var `contrast-line` = "ebda"
    var `copper-coin-fill` = "ebdb"
    var `copper-coin-line` = "ebdc"
    var `copper-diamond-fill` = "ebdd"
    var `copper-diamond-line` = "ebde"
    var `copyleft-fill` = "ebdf"
    var `copyleft-line` = "ebe0"
    var `copyright-fill` = "ebe1"
    var `copyright-line` = "ebe2"
    var `coreos-fill` = "ebe3"
    var `coreos-line` = "ebe4"
    var `coupon-2-fill` = "ebe5"
    var `coupon-2-line` = "ebe6"
    var `coupon-3-fill` = "ebe7"
    var `coupon-3-line` = "ebe8"
    var `coupon-4-fill` = "ebe9"
    var `coupon-4-line` = "ebea"
    var `coupon-5-fill` = "ebeb"
    var `coupon-5-line` = "ebec"
    var `coupon-fill` = "ebed"
    var `coupon-line` = "ebee"
    var `cpu-fill` = "ebef"
    var `cpu-line` = "ebf0"
    var `creative-commons-by-fill` = "ebf1"
    var `creative-commons-by-line` = "ebf2"
    var `creative-commons-fill` = "ebf3"
    var `creative-commons-line` = "ebf4"
    var `creative-commons-nc-fill` = "ebf5"
    var `creative-commons-nc-line` = "ebf6"
    var `creative-commons-nd-fill` = "ebf7"
    var `creative-commons-nd-line` = "ebf8"
    var `creative-commons-sa-fill` = "ebf9"
    var `creative-commons-sa-line` = "ebfa"
    var `creative-commons-zero-fill` = "ebfb"
    var `creative-commons-zero-line` = "ebfc"
    var `criminal-fill` = "ebfd"
    var `criminal-line` = "ebfe"
    var `crop-2-fill` = "ebff"
    var `crop-2-line` = "ec00"
    var `crop-fill` = "ec01"
    var `crop-line` = "ec02"
    var `css3-fill` = "ec03"
    var `css3-line` = "ec04"
    var `cup-fill` = "ec05"
    var `cup-line` = "ec06"
    var `currency-fill` = "ec07"
    var `currency-line` = "ec08"
    var `cursor-fill` = "ec09"
    var `cursor-line` = "ec0a"
    var `customer-service-2-fill` = "ec0b"
    var `customer-service-2-line` = "ec0c"
    var `customer-service-fill` = "ec0d"
    var `customer-service-line` = "ec0e"
    var `dashboard-2-fill` = "ec0f"
    var `dashboard-2-line` = "ec10"
    var `dashboard-3-fill` = "ec11"
    var `dashboard-3-line` = "ec12"
    var `dashboard-fill` = "ec13"
    var `dashboard-line` = "ec14"
    var `database-2-fill` = "ec15"
    var `database-2-line` = "ec16"
    var `database-fill` = "ec17"
    var `database-line` = "ec18"
    var `delete-back-2-fill` = "ec19"
    var `delete-back-2-line` = "ec1a"
    var `delete-back-fill` = "ec1b"
    var `delete-back-line` = "ec1c"
    var `delete-bin-2-fill` = "ec1d"
    var `delete-bin-2-line` = "ec1e"
    var `delete-bin-3-fill` = "ec1f"
    var `delete-bin-3-line` = "ec20"
    var `delete-bin-4-fill` = "ec21"
    var `delete-bin-4-line` = "ec22"
    var `delete-bin-5-fill` = "ec23"
    var `delete-bin-5-line` = "ec24"
    var `delete-bin-6-fill` = "ec25"
    var `delete-bin-6-line` = "ec26"
    var `delete-bin-7-fill` = "ec27"
    var `delete-bin-7-line` = "ec28"
    var `delete-bin-fill` = "ec29"
    var `delete-bin-line` = "ec2a"
    var `delete-column` = "ec2b"
    var `delete-row` = "ec2c"
    var `device-fill` = "ec2d"
    var `device-line` = "ec2e"
    var `device-recover-fill` = "ec2f"
    var `device-recover-line` = "ec30"
    var `dingding-fill` = "ec31"
    var `dingding-line` = "ec32"
    var `direction-fill` = "ec33"
    var `direction-line` = "ec34"
    var `disc-fill` = "ec35"
    var `disc-line` = "ec36"
    var `discord-fill` = "ec37"
    var `discord-line` = "ec38"
    var `discuss-fill` = "ec39"
    var `discuss-line` = "ec3a"
    var `dislike-fill` = "ec3b"
    var `dislike-line` = "ec3c"
    var `disqus-fill` = "ec3d"
    var `disqus-line` = "ec3e"
    var `divide-fill` = "ec3f"
    var `divide-line` = "ec40"
    var `donut-chart-fill` = "ec41"
    var `donut-chart-line` = "ec42"
    var `door-closed-fill` = "ec43"
    var `door-closed-line` = "ec44"
    var `door-fill` = "ec45"
    var `door-line` = "ec46"
    var `door-lock-box-fill` = "ec47"
    var `door-lock-box-line` = "ec48"
    var `door-lock-fill` = "ec49"
    var `door-lock-line` = "ec4a"
    var `door-open-fill` = "ec4b"
    var `door-open-line` = "ec4c"
    var `dossier-fill` = "ec4d"
    var `dossier-line` = "ec4e"
    var `douban-fill` = "ec4f"
    var `douban-line` = "ec50"
    var `double-quotes-l` = "ec51"
    var `double-quotes-r` = "ec52"
    var `download-2-fill` = "ec53"
    var `download-2-line` = "ec54"
    var `download-cloud-2-fill` = "ec55"
    var `download-cloud-2-line` = "ec56"
    var `download-cloud-fill` = "ec57"
    var `download-cloud-line` = "ec58"
    var `download-fill` = "ec59"
    var `download-line` = "ec5a"
    var `draft-fill` = "ec5b"
    var `draft-line` = "ec5c"
    var `drag-drop-fill` = "ec5d"
    var `drag-drop-line` = "ec5e"
    var `drag-move-2-fill` = "ec5f"
    var `drag-move-2-line` = "ec60"
    var `drag-move-fill` = "ec61"
    var `drag-move-line` = "ec62"
    var `dribbble-fill` = "ec63"
    var `dribbble-line` = "ec64"
    var `drive-fill` = "ec65"
    var `drive-line` = "ec66"
    var `drizzle-fill` = "ec67"
    var `drizzle-line` = "ec68"
    var `drop-fill` = "ec69"
    var `drop-line` = "ec6a"
    var `dropbox-fill` = "ec6b"
    var `dropbox-line` = "ec6c"
    var `dual-sim-1-fill` = "ec6d"
    var `dual-sim-1-line` = "ec6e"
    var `dual-sim-2-fill` = "ec6f"
    var `dual-sim-2-line` = "ec70"
    var `dv-fill` = "ec71"
    var `dv-line` = "ec72"
    var `dvd-fill` = "ec73"
    var `dvd-line` = "ec74"
    var `e-bike-2-fill` = "ec75"
    var `e-bike-2-line` = "ec76"
    var `e-bike-fill` = "ec77"
    var `e-bike-line` = "ec78"
    var `earth-fill` = "ec79"
    var `earth-line` = "ec7a"
    var `earthquake-fill` = "ec7b"
    var `earthquake-line` = "ec7c"
    var `edge-fill` = "ec7d"
    var `edge-line` = "ec7e"
    var `edit-2-fill` = "ec7f"
    var `edit-2-line` = "ec80"
    var `edit-box-fill` = "ec81"
    var `edit-box-line` = "ec82"
    var `edit-circle-fill` = "ec83"
    var `edit-circle-line` = "ec84"
    var `edit-fill` = "ec85"
    var `edit-line` = "ec86"
    var `eject-fill` = "ec87"
    var `eject-line` = "ec88"
    var `emotion-2-fill` = "ec89"
    var `emotion-2-line` = "ec8a"
    var `emotion-fill` = "ec8b"
    var `emotion-happy-fill` = "ec8c"
    var `emotion-happy-line` = "ec8d"
    var `emotion-laugh-fill` = "ec8e"
    var `emotion-laugh-line` = "ec8f"
    var `emotion-line` = "ec90"
    var `emotion-normal-fill` = "ec91"
    var `emotion-normal-line` = "ec92"
    var `emotion-sad-fill` = "ec93"
    var `emotion-sad-line` = "ec94"
    var `emotion-unhappy-fill` = "ec95"
    var `emotion-unhappy-line` = "ec96"
    var `empathize-fill` = "ec97"
    var `empathize-line` = "ec98"
    var `emphasis-cn` = "ec99"
    var emphasis = "ec9a"
    var `english-input` = "ec9b"
    var `equalizer-fill` = "ec9c"
    var `equalizer-line` = "ec9d"
    var `eraser-fill` = "ec9e"
    var `eraser-line` = "ec9f"
    var `error-warning-fill` = "eca0"
    var `error-warning-line` = "eca1"
    var `evernote-fill` = "eca2"
    var `evernote-line` = "eca3"
    var `exchange-box-fill` = "eca4"
    var `exchange-box-line` = "eca5"
    var `exchange-cny-fill` = "eca6"
    var `exchange-cny-line` = "eca7"
    var `exchange-dollar-fill` = "eca8"
    var `exchange-dollar-line` = "eca9"
    var `exchange-fill` = "ecaa"
    var `exchange-funds-fill` = "ecab"
    var `exchange-funds-line` = "ecac"
    var `exchange-line` = "ecad"
    var `external-link-fill` = "ecae"
    var `external-link-line` = "ecaf"
    var `eye-2-fill` = "ecb0"
    var `eye-2-line` = "ecb1"
    var `eye-close-fill` = "ecb2"
    var `eye-close-line` = "ecb3"
    var `eye-fill` = "ecb4"
    var `eye-line` = "ecb5"
    var `eye-off-fill` = "ecb6"
    var `eye-off-line` = "ecb7"
    var `facebook-box-fill` = "ecb8"
    var `facebook-box-line` = "ecb9"
    var `facebook-circle-fill` = "ecba"
    var `facebook-circle-line` = "ecbb"
    var `facebook-fill` = "ecbc"
    var `facebook-line` = "ecbd"
    var `fahrenheit-fill` = "ecbe"
    var `fahrenheit-line` = "ecbf"
    var `feedback-fill` = "ecc0"
    var `feedback-line` = "ecc1"
    var `file-2-fill` = "ecc2"
    var `file-2-line` = "ecc3"
    var `file-3-fill` = "ecc4"
    var `file-3-line` = "ecc5"
    var `file-4-fill` = "ecc6"
    var `file-4-line` = "ecc7"
    var `file-add-fill` = "ecc8"
    var `file-add-line` = "ecc9"
    var `file-chart-2-fill` = "ecca"
    var `file-chart-2-line` = "eccb"
    var `file-chart-fill` = "eccc"
    var `file-chart-line` = "eccd"
    var `file-cloud-fill` = "ecce"
    var `file-cloud-line` = "eccf"
    var `file-code-fill` = "ecd0"
    var `file-code-line` = "ecd1"
    var `file-copy-2-fill` = "ecd2"
    var `file-copy-2-line` = "ecd3"
    var `file-copy-fill` = "ecd4"
    var `file-copy-line` = "ecd5"
    var `file-damage-fill` = "ecd6"
    var `file-damage-line` = "ecd7"
    var `file-download-fill` = "ecd8"
    var `file-download-line` = "ecd9"
    var `file-edit-fill` = "ecda"
    var `file-edit-line` = "ecdb"
    var `file-excel-2-fill` = "ecdc"
    var `file-excel-2-line` = "ecdd"
    var `file-excel-fill` = "ecde"
    var `file-excel-line` = "ecdf"
    var `file-fill` = "ece0"
    var `file-forbid-fill` = "ece1"
    var `file-forbid-line` = "ece2"
    var `file-gif-fill` = "ece3"
    var `file-gif-line` = "ece4"
    var `file-history-fill` = "ece5"
    var `file-history-line` = "ece6"
    var `file-hwp-fill` = "ece7"
    var `file-hwp-line` = "ece8"
    var `file-info-fill` = "ece9"
    var `file-info-line` = "ecea"
    var `file-line` = "eceb"
    var `file-list-2-fill` = "ecec"
    var `file-list-2-line` = "eced"
    var `file-list-3-fill` = "ecee"
    var `file-list-3-line` = "ecef"
    var `file-list-fill` = "ecf0"
    var `file-list-line` = "ecf1"
    var `file-lock-fill` = "ecf2"
    var `file-lock-line` = "ecf3"
    var `file-marked-fill` = "ecf4"
    var `file-marked-line` = "ecf5"
    var `file-music-fill` = "ecf6"
    var `file-music-line` = "ecf7"
    var `file-paper-2-fill` = "ecf8"
    var `file-paper-2-line` = "ecf9"
    var `file-paper-fill` = "ecfa"
    var `file-paper-line` = "ecfb"
    var `file-pdf-fill` = "ecfc"
    var `file-pdf-line` = "ecfd"
    var `file-ppt-2-fill` = "ecfe"
    var `file-ppt-2-line` = "ecff"
    var `file-ppt-fill` = "ed00"
    var `file-ppt-line` = "ed01"
    var `file-reduce-fill` = "ed02"
    var `file-reduce-line` = "ed03"
    var `file-search-fill` = "ed04"
    var `file-search-line` = "ed05"
    var `file-settings-fill` = "ed06"
    var `file-settings-line` = "ed07"
    var `file-shield-2-fill` = "ed08"
    var `file-shield-2-line` = "ed09"
    var `file-shield-fill` = "ed0a"
    var `file-shield-line` = "ed0b"
    var `file-shred-fill` = "ed0c"
    var `file-shred-line` = "ed0d"
    var `file-text-fill` = "ed0e"
    var `file-text-line` = "ed0f"
    var `file-transfer-fill` = "ed10"
    var `file-transfer-line` = "ed11"
    var `file-unknow-fill` = "ed12"
    var `file-unknow-line` = "ed13"
    var `file-upload-fill` = "ed14"
    var `file-upload-line` = "ed15"
    var `file-user-fill` = "ed16"
    var `file-user-line` = "ed17"
    var `file-warning-fill` = "ed18"
    var `file-warning-line` = "ed19"
    var `file-word-2-fill` = "ed1a"
    var `file-word-2-line` = "ed1b"
    var `file-word-fill` = "ed1c"
    var `file-word-line` = "ed1d"
    var `file-zip-fill` = "ed1e"
    var `file-zip-line` = "ed1f"
    var `film-fill` = "ed20"
    var `film-line` = "ed21"
    var `filter-2-fill` = "ed22"
    var `filter-2-line` = "ed23"
    var `filter-3-fill` = "ed24"
    var `filter-3-line` = "ed25"
    var `filter-fill` = "ed26"
    var `filter-line` = "ed27"
    var `filter-off-fill` = "ed28"
    var `filter-off-line` = "ed29"
    var `find-replace-fill` = "ed2a"
    var `find-replace-line` = "ed2b"
    var `finder-fill` = "ed2c"
    var `finder-line` = "ed2d"
    var `fingerprint-2-fill` = "ed2e"
    var `fingerprint-2-line` = "ed2f"
    var `fingerprint-fill` = "ed30"
    var `fingerprint-line` = "ed31"
    var `fire-fill` = "ed32"
    var `fire-line` = "ed33"
    var `firefox-fill` = "ed34"
    var `firefox-line` = "ed35"
    var `first-aid-kit-fill` = "ed36"
    var `first-aid-kit-line` = "ed37"
    var `flag-2-fill` = "ed38"
    var `flag-2-line` = "ed39"
    var `flag-fill` = "ed3a"
    var `flag-line` = "ed3b"
    var `flashlight-fill` = "ed3c"
    var `flashlight-line` = "ed3d"
    var `flask-fill` = "ed3e"
    var `flask-line` = "ed3f"
    var `flight-land-fill` = "ed40"
    var `flight-land-line` = "ed41"
    var `flight-takeoff-fill` = "ed42"
    var `flight-takeoff-line` = "ed43"
    var `flood-fill` = "ed44"
    var `flood-line` = "ed45"
    var `flow-chart` = "ed46"
    var `flutter-fill` = "ed47"
    var `flutter-line` = "ed48"
    var `focus-2-fill` = "ed49"
    var `focus-2-line` = "ed4a"
    var `focus-3-fill` = "ed4b"
    var `focus-3-line` = "ed4c"
    var `focus-fill` = "ed4d"
    var `focus-line` = "ed4e"
    var `foggy-fill` = "ed4f"
    var `foggy-line` = "ed50"
    var `folder-2-fill` = "ed51"
    var `folder-2-line` = "ed52"
    var `folder-3-fill` = "ed53"
    var `folder-3-line` = "ed54"
    var `folder-4-fill` = "ed55"
    var `folder-4-line` = "ed56"
    var `folder-5-fill` = "ed57"
    var `folder-5-line` = "ed58"
    var `folder-add-fill` = "ed59"
    var `folder-add-line` = "ed5a"
    var `folder-chart-2-fill` = "ed5b"
    var `folder-chart-2-line` = "ed5c"
    var `folder-chart-fill` = "ed5d"
    var `folder-chart-line` = "ed5e"
    var `folder-download-fill` = "ed5f"
    var `folder-download-line` = "ed60"
    var `folder-fill` = "ed61"
    var `folder-forbid-fill` = "ed62"
    var `folder-forbid-line` = "ed63"
    var `folder-history-fill` = "ed64"
    var `folder-history-line` = "ed65"
    var `folder-info-fill` = "ed66"
    var `folder-info-line` = "ed67"
    var `folder-keyhole-fill` = "ed68"
    var `folder-keyhole-line` = "ed69"
    var `folder-line` = "ed6a"
    var `folder-lock-fill` = "ed6b"
    var `folder-lock-line` = "ed6c"
    var `folder-music-fill` = "ed6d"
    var `folder-music-line` = "ed6e"
    var `folder-open-fill` = "ed6f"
    var `folder-open-line` = "ed70"
    var `folder-received-fill` = "ed71"
    var `folder-received-line` = "ed72"
    var `folder-reduce-fill` = "ed73"
    var `folder-reduce-line` = "ed74"
    var `folder-settings-fill` = "ed75"
    var `folder-settings-line` = "ed76"
    var `folder-shared-fill` = "ed77"
    var `folder-shared-line` = "ed78"
    var `folder-shield-2-fill` = "ed79"
    var `folder-shield-2-line` = "ed7a"
    var `folder-shield-fill` = "ed7b"
    var `folder-shield-line` = "ed7c"
    var `folder-transfer-fill` = "ed7d"
    var `folder-transfer-line` = "ed7e"
    var `folder-unknow-fill` = "ed7f"
    var `folder-unknow-line` = "ed80"
    var `folder-upload-fill` = "ed81"
    var `folder-upload-line` = "ed82"
    var `folder-user-fill` = "ed83"
    var `folder-user-line` = "ed84"
    var `folder-warning-fill` = "ed85"
    var `folder-warning-line` = "ed86"
    var `folder-zip-fill` = "ed87"
    var `folder-zip-line` = "ed88"
    var `folders-fill` = "ed89"
    var `folders-line` = "ed8a"
    var `font-color` = "ed8b"
    var `font-size-2` = "ed8c"
    var `font-size` = "ed8d"
    var `football-fill` = "ed8e"
    var `football-line` = "ed8f"
    var `footprint-fill` = "ed90"
    var `footprint-line` = "ed91"
    var `forbid-2-fill` = "ed92"
    var `forbid-2-line` = "ed93"
    var `forbid-fill` = "ed94"
    var `forbid-line` = "ed95"
    var `format-clear` = "ed96"
    var `fridge-fill` = "ed97"
    var `fridge-line` = "ed98"
    var `fullscreen-exit-fill` = "ed99"
    var `fullscreen-exit-line` = "ed9a"
    var `fullscreen-fill` = "ed9b"
    var `fullscreen-line` = "ed9c"
    var `function-fill` = "ed9d"
    var `function-line` = "ed9e"
    var functions = "ed9f"
    var `funds-box-fill` = "eda0"
    var `funds-box-line` = "eda1"
    var `funds-fill` = "eda2"
    var `funds-line` = "eda3"
    var `gallery-fill` = "eda4"
    var `gallery-line` = "eda5"
    var `gallery-upload-fill` = "eda6"
    var `gallery-upload-line` = "eda7"
    var `game-fill` = "eda8"
    var `game-line` = "eda9"
    var `gamepad-fill` = "edaa"
    var `gamepad-line` = "edab"
    var `gas-station-fill` = "edac"
    var `gas-station-line` = "edad"
    var `gatsby-fill` = "edae"
    var `gatsby-line` = "edaf"
    var `genderless-fill` = "edb0"
    var `genderless-line` = "edb1"
    var `ghost-2-fill` = "edb2"
    var `ghost-2-line` = "edb3"
    var `ghost-fill` = "edb4"
    var `ghost-line` = "edb5"
    var `ghost-smile-fill` = "edb6"
    var `ghost-smile-line` = "edb7"
    var `gift-2-fill` = "edb8"
    var `gift-2-line` = "edb9"
    var `gift-fill` = "edba"
    var `gift-line` = "edbb"
    var `git-branch-fill` = "edbc"
    var `git-branch-line` = "edbd"
    var `git-commit-fill` = "edbe"
    var `git-commit-line` = "edbf"
    var `git-merge-fill` = "edc0"
    var `git-merge-line` = "edc1"
    var `git-pull-request-fill` = "edc2"
    var `git-pull-request-line` = "edc3"
    var `git-repository-commits-fill` = "edc4"
    var `git-repository-commits-line` = "edc5"
    var `git-repository-fill` = "edc6"
    var `git-repository-line` = "edc7"
    var `git-repository-private-fill` = "edc8"
    var `git-repository-private-line` = "edc9"
    var `github-fill` = "edca"
    var `github-line` = "edcb"
    var `gitlab-fill` = "edcc"
    var `gitlab-line` = "edcd"
    var `global-fill` = "edce"
    var `global-line` = "edcf"
    var `globe-fill` = "edd0"
    var `globe-line` = "edd1"
    var `goblet-fill` = "edd2"
    var `goblet-line` = "edd3"
    var `google-fill` = "edd4"
    var `google-line` = "edd5"
    var `google-play-fill` = "edd6"
    var `google-play-line` = "edd7"
    var `government-fill` = "edd8"
    var `government-line` = "edd9"
    var `gps-fill` = "edda"
    var `gps-line` = "eddb"
    var `gradienter-fill` = "eddc"
    var `gradienter-line` = "eddd"
    var `grid-fill` = "edde"
    var `grid-line` = "eddf"
    var `group-2-fill` = "ede0"
    var `group-2-line` = "ede1"
    var `group-fill` = "ede2"
    var `group-line` = "ede3"
    var `guide-fill` = "ede4"
    var `guide-line` = "ede5"
    var `h-1` = "ede6"
    var `h-2` = "ede7"
    var `h-3` = "ede8"
    var `h-4` = "ede9"
    var `h-5` = "edea"
    var `h-6` = "edeb"
    var `hail-fill` = "edec"
    var `hail-line` = "eded"
    var `hammer-fill` = "edee"
    var `hammer-line` = "edef"
    var `hand-coin-fill` = "edf0"
    var `hand-coin-line` = "edf1"
    var `hand-heart-fill` = "edf2"
    var `hand-heart-line` = "edf3"
    var `hand-sanitizer-fill` = "edf4"
    var `hand-sanitizer-line` = "edf5"
    var `handbag-fill` = "edf6"
    var `handbag-line` = "edf7"
    var `hard-drive-2-fill` = "edf8"
    var `hard-drive-2-line` = "edf9"
    var `hard-drive-fill` = "edfa"
    var `hard-drive-line` = "edfb"
    var hashtag = "edfc"
    var `haze-2-fill` = "edfd"
    var `haze-2-line` = "edfe"
    var `haze-fill` = "edff"
    var `haze-line` = "ee00"
    var `hd-fill` = "ee01"
    var `hd-line` = "ee02"
    var heading = "ee03"
    var `headphone-fill` = "ee04"
    var `headphone-line` = "ee05"
    var `health-book-fill` = "ee06"
    var `health-book-line` = "ee07"
    var `heart-2-fill` = "ee08"
    var `heart-2-line` = "ee09"
    var `heart-3-fill` = "ee0a"
    var `heart-3-line` = "ee0b"
    var `heart-add-fill` = "ee0c"
    var `heart-add-line` = "ee0d"
    var `heart-fill` = "ee0e"
    var `heart-line` = "ee0f"
    var `heart-pulse-fill` = "ee10"
    var `heart-pulse-line` = "ee11"
    var `hearts-fill` = "ee12"
    var `hearts-line` = "ee13"
    var `heavy-showers-fill` = "ee14"
    var `heavy-showers-line` = "ee15"
    var `history-fill` = "ee16"
    var `history-line` = "ee17"
    var `home-2-fill` = "ee18"
    var `home-2-line` = "ee19"
    var `home-3-fill` = "ee1a"
    var `home-3-line` = "ee1b"
    var `home-4-fill` = "ee1c"
    var `home-4-line` = "ee1d"
    var `home-5-fill` = "ee1e"
    var `home-5-line` = "ee1f"
    var `home-6-fill` = "ee20"
    var `home-6-line` = "ee21"
    var `home-7-fill` = "ee22"
    var `home-7-line` = "ee23"
    var `home-8-fill` = "ee24"
    var `home-8-line` = "ee25"
    var `home-fill` = "ee26"
    var `home-gear-fill` = "ee27"
    var `home-gear-line` = "ee28"
    var `home-heart-fill` = "ee29"
    var `home-heart-line` = "ee2a"
    var `home-line` = "ee2b"
    var `home-smile-2-fill` = "ee2c"
    var `home-smile-2-line` = "ee2d"
    var `home-smile-fill` = "ee2e"
    var `home-smile-line` = "ee2f"
    var `home-wifi-fill` = "ee30"
    var `home-wifi-line` = "ee31"
    var `honor-of-kings-fill` = "ee32"
    var `honor-of-kings-line` = "ee33"
    var `honour-fill` = "ee34"
    var `honour-line` = "ee35"
    var `hospital-fill` = "ee36"
    var `hospital-line` = "ee37"
    var `hotel-bed-fill` = "ee38"
    var `hotel-bed-line` = "ee39"
    var `hotel-fill` = "ee3a"
    var `hotel-line` = "ee3b"
    var `hotspot-fill` = "ee3c"
    var `hotspot-line` = "ee3d"
    var `hq-fill` = "ee3e"
    var `hq-line` = "ee3f"
    var `html5-fill` = "ee40"
    var `html5-line` = "ee41"
    var `ie-fill` = "ee42"
    var `ie-line` = "ee43"
    var `image-2-fill` = "ee44"
    var `image-2-line` = "ee45"
    var `image-add-fill` = "ee46"
    var `image-add-line` = "ee47"
    var `image-edit-fill` = "ee48"
    var `image-edit-line` = "ee49"
    var `image-fill` = "ee4a"
    var `image-line` = "ee4b"
    var `inbox-archive-fill` = "ee4c"
    var `inbox-archive-line` = "ee4d"
    var `inbox-fill` = "ee4e"
    var `inbox-line` = "ee4f"
    var `inbox-unarchive-fill` = "ee50"
    var `inbox-unarchive-line` = "ee51"
    var `increase-decrease-fill` = "ee52"
    var `increase-decrease-line` = "ee53"
    var `indent-decrease` = "ee54"
    var `indent-increase` = "ee55"
    var `indeterminate-circle-fill` = "ee56"
    var `indeterminate-circle-line` = "ee57"
    var `information-fill` = "ee58"
    var `information-line` = "ee59"
    var `infrared-thermometer-fill` = "ee5a"
    var `infrared-thermometer-line` = "ee5b"
    var `ink-bottle-fill` = "ee5c"
    var `ink-bottle-line` = "ee5d"
    var `input-cursor-move` = "ee5e"
    var `input-method-fill` = "ee5f"
    var `input-method-line` = "ee60"
    var `insert-column-left` = "ee61"
    var `insert-column-right` = "ee62"
    var `insert-row-bottom` = "ee63"
    var `insert-row-top` = "ee64"
    var `instagram-fill` = "ee65"
    var `instagram-line` = "ee66"
    var `install-fill` = "ee67"
    var `install-line` = "ee68"
    var `invision-fill` = "ee69"
    var `invision-line` = "ee6a"
    var italic = "ee6b"
    var `kakao-talk-fill` = "ee6c"
    var `kakao-talk-line` = "ee6d"
    var `key-2-fill` = "ee6e"
    var `key-2-line` = "ee6f"
    var `key-fill` = "ee70"
    var `key-line` = "ee71"
    var `keyboard-box-fill` = "ee72"
    var `keyboard-box-line` = "ee73"
    var `keyboard-fill` = "ee74"
    var `keyboard-line` = "ee75"
    var `keynote-fill` = "ee76"
    var `keynote-line` = "ee77"
    var `knife-blood-fill` = "ee78"
    var `knife-blood-line` = "ee79"
    var `knife-fill` = "ee7a"
    var `knife-line` = "ee7b"
    var `landscape-fill` = "ee7c"
    var `landscape-line` = "ee7d"
    var `layout-2-fill` = "ee7e"
    var `layout-2-line` = "ee7f"
    var `layout-3-fill` = "ee80"
    var `layout-3-line` = "ee81"
    var `layout-4-fill` = "ee82"
    var `layout-4-line` = "ee83"
    var `layout-5-fill` = "ee84"
    var `layout-5-line` = "ee85"
    var `layout-6-fill` = "ee86"
    var `layout-6-line` = "ee87"
    var `layout-bottom-2-fill` = "ee88"
    var `layout-bottom-2-line` = "ee89"
    var `layout-bottom-fill` = "ee8a"
    var `layout-bottom-line` = "ee8b"
    var `layout-column-fill` = "ee8c"
    var `layout-column-line` = "ee8d"
    var `layout-fill` = "ee8e"
    var `layout-grid-fill` = "ee8f"
    var `layout-grid-line` = "ee90"
    var `layout-left-2-fill` = "ee91"
    var `layout-left-2-line` = "ee92"
    var `layout-left-fill` = "ee93"
    var `layout-left-line` = "ee94"
    var `layout-line` = "ee95"
    var `layout-masonry-fill` = "ee96"
    var `layout-masonry-line` = "ee97"
    var `layout-right-2-fill` = "ee98"
    var `layout-right-2-line` = "ee99"
    var `layout-right-fill` = "ee9a"
    var `layout-right-line` = "ee9b"
    var `layout-row-fill` = "ee9c"
    var `layout-row-line` = "ee9d"
    var `layout-top-2-fill` = "ee9e"
    var `layout-top-2-line` = "ee9f"
    var `layout-top-fill` = "eea0"
    var `layout-top-line` = "eea1"
    var `leaf-fill` = "eea2"
    var `leaf-line` = "eea3"
    var `lifebuoy-fill` = "eea4"
    var `lifebuoy-line` = "eea5"
    var `lightbulb-fill` = "eea6"
    var `lightbulb-flash-fill` = "eea7"
    var `lightbulb-flash-line` = "eea8"
    var `lightbulb-line` = "eea9"
    var `line-chart-fill` = "eeaa"
    var `line-chart-line` = "eeab"
    var `line-fill` = "eeac"
    var `line-height` = "eead"
    var `line-line` = "eeae"
    var `link-m` = "eeaf"
    var `link-unlink-m` = "eeb0"
    var `link-unlink` = "eeb1"
    var link = "eeb2"
    var `linkedin-box-fill` = "eeb3"
    var `linkedin-box-line` = "eeb4"
    var `linkedin-fill` = "eeb5"
    var `linkedin-line` = "eeb6"
    var `links-fill` = "eeb7"
    var `links-line` = "eeb8"
    var `list-check-2` = "eeb9"
    var `list-check` = "eeba"
    var `list-ordered` = "eebb"
    var `list-settings-fill` = "eebc"
    var `list-settings-line` = "eebd"
    var `list-unordered` = "eebe"
    var `live-fill` = "eebf"
    var `live-line` = "eec0"
    var `loader-2-fill` = "eec1"
    var `loader-2-line` = "eec2"
    var `loader-3-fill` = "eec3"
    var `loader-3-line` = "eec4"
    var `loader-4-fill` = "eec5"
    var `loader-4-line` = "eec6"
    var `loader-5-fill` = "eec7"
    var `loader-5-line` = "eec8"
    var `loader-fill` = "eec9"
    var `loader-line` = "eeca"
    var `lock-2-fill` = "eecb"
    var `lock-2-line` = "eecc"
    var `lock-fill` = "eecd"
    var `lock-line` = "eece"
    var `lock-password-fill` = "eecf"
    var `lock-password-line` = "eed0"
    var `lock-unlock-fill` = "eed1"
    var `lock-unlock-line` = "eed2"
    var `login-box-fill` = "eed3"
    var `login-box-line` = "eed4"
    var `login-circle-fill` = "eed5"
    var `login-circle-line` = "eed6"
    var `logout-box-fill` = "eed7"
    var `logout-box-line` = "eed8"
    var `logout-box-r-fill` = "eed9"
    var `logout-box-r-line` = "eeda"
    var `logout-circle-fill` = "eedb"
    var `logout-circle-line` = "eedc"
    var `logout-circle-r-fill` = "eedd"
    var `logout-circle-r-line` = "eede"
    var `luggage-cart-fill` = "eedf"
    var `luggage-cart-line` = "eee0"
    var `luggage-deposit-fill` = "eee1"
    var `luggage-deposit-line` = "eee2"
    var `lungs-fill` = "eee3"
    var `lungs-line` = "eee4"
    var `mac-fill` = "eee5"
    var `mac-line` = "eee6"
    var `macbook-fill` = "eee7"
    var `macbook-line` = "eee8"
    var `magic-fill` = "eee9"
    var `magic-line` = "eeea"
    var `mail-add-fill` = "eeeb"
    var `mail-add-line` = "eeec"
    var `mail-check-fill` = "eeed"
    var `mail-check-line` = "eeee"
    var `mail-close-fill` = "eeef"
    var `mail-close-line` = "eef0"
    var `mail-download-fill` = "eef1"
    var `mail-download-line` = "eef2"
    var `mail-fill` = "eef3"
    var `mail-forbid-fill` = "eef4"
    var `mail-forbid-line` = "eef5"
    var `mail-line` = "eef6"
    var `mail-lock-fill` = "eef7"
    var `mail-lock-line` = "eef8"
    var `mail-open-fill` = "eef9"
    var `mail-open-line` = "eefa"
    var `mail-send-fill` = "eefb"
    var `mail-send-line` = "eefc"
    var `mail-settings-fill` = "eefd"
    var `mail-settings-line` = "eefe"
    var `mail-star-fill` = "eeff"
    var `mail-star-line` = "ef00"
    var `mail-unread-fill` = "ef01"
    var `mail-unread-line` = "ef02"
    var `mail-volume-fill` = "ef03"
    var `mail-volume-line` = "ef04"
    var `map-2-fill` = "ef05"
    var `map-2-line` = "ef06"
    var `map-fill` = "ef07"
    var `map-line` = "ef08"
    var `map-pin-2-fill` = "ef09"
    var `map-pin-2-line` = "ef0a"
    var `map-pin-3-fill` = "ef0b"
    var `map-pin-3-line` = "ef0c"
    var `map-pin-4-fill` = "ef0d"
    var `map-pin-4-line` = "ef0e"
    var `map-pin-5-fill` = "ef0f"
    var `map-pin-5-line` = "ef10"
    var `map-pin-add-fill` = "ef11"
    var `map-pin-add-line` = "ef12"
    var `map-pin-fill` = "ef13"
    var `map-pin-line` = "ef14"
    var `map-pin-range-fill` = "ef15"
    var `map-pin-range-line` = "ef16"
    var `map-pin-time-fill` = "ef17"
    var `map-pin-time-line` = "ef18"
    var `map-pin-user-fill` = "ef19"
    var `map-pin-user-line` = "ef1a"
    var `mark-pen-fill` = "ef1b"
    var `mark-pen-line` = "ef1c"
    var `markdown-fill` = "ef1d"
    var `markdown-line` = "ef1e"
    var `markup-fill` = "ef1f"
    var `markup-line` = "ef20"
    var `mastercard-fill` = "ef21"
    var `mastercard-line` = "ef22"
    var `mastodon-fill` = "ef23"
    var `mastodon-line` = "ef24"
    var `medal-2-fill` = "ef25"
    var `medal-2-line` = "ef26"
    var `medal-fill` = "ef27"
    var `medal-line` = "ef28"
    var `medicine-bottle-fill` = "ef29"
    var `medicine-bottle-line` = "ef2a"
    var `medium-fill` = "ef2b"
    var `medium-line` = "ef2c"
    var `men-fill` = "ef2d"
    var `men-line` = "ef2e"
    var `mental-health-fill` = "ef2f"
    var `mental-health-line` = "ef30"
    var `menu-2-fill` = "ef31"
    var `menu-2-line` = "ef32"
    var `menu-3-fill` = "ef33"
    var `menu-3-line` = "ef34"
    var `menu-4-fill` = "ef35"
    var `menu-4-line` = "ef36"
    var `menu-5-fill` = "ef37"
    var `menu-5-line` = "ef38"
    var `menu-add-fill` = "ef39"
    var `menu-add-line` = "ef3a"
    var `menu-fill` = "ef3b"
    var `menu-fold-fill` = "ef3c"
    var `menu-fold-line` = "ef3d"
    var `menu-line` = "ef3e"
    var `menu-unfold-fill` = "ef3f"
    var `menu-unfold-line` = "ef40"
    var `merge-cells-horizontal` = "ef41"
    var `merge-cells-vertical` = "ef42"
    var `message-2-fill` = "ef43"
    var `message-2-line` = "ef44"
    var `message-3-fill` = "ef45"
    var `message-3-line` = "ef46"
    var `message-fill` = "ef47"
    var `message-line` = "ef48"
    var `messenger-fill` = "ef49"
    var `messenger-line` = "ef4a"
    var `meteor-fill` = "ef4b"
    var `meteor-line` = "ef4c"
    var `mic-2-fill` = "ef4d"
    var `mic-2-line` = "ef4e"
    var `mic-fill` = "ef4f"
    var `mic-line` = "ef50"
    var `mic-off-fill` = "ef51"
    var `mic-off-line` = "ef52"
    var `mickey-fill` = "ef53"
    var `mickey-line` = "ef54"
    var `microscope-fill` = "ef55"
    var `microscope-line` = "ef56"
    var `microsoft-fill` = "ef57"
    var `microsoft-line` = "ef58"
    var `mind-map` = "ef59"
    var `mini-program-fill` = "ef5a"
    var `mini-program-line` = "ef5b"
    var `mist-fill` = "ef5c"
    var `mist-line` = "ef5d"
    var `money-cny-box-fill` = "ef5e"
    var `money-cny-box-line` = "ef5f"
    var `money-cny-circle-fill` = "ef60"
    var `money-cny-circle-line` = "ef61"
    var `money-dollar-box-fill` = "ef62"
    var `money-dollar-box-line` = "ef63"
    var `money-dollar-circle-fill` = "ef64"
    var `money-dollar-circle-line` = "ef65"
    var `money-euro-box-fill` = "ef66"
    var `money-euro-box-line` = "ef67"
    var `money-euro-circle-fill` = "ef68"
    var `money-euro-circle-line` = "ef69"
    var `money-pound-box-fill` = "ef6a"
    var `money-pound-box-line` = "ef6b"
    var `money-pound-circle-fill` = "ef6c"
    var `money-pound-circle-line` = "ef6d"
    var `moon-clear-fill` = "ef6e"
    var `moon-clear-line` = "ef6f"
    var `moon-cloudy-fill` = "ef70"
    var `moon-cloudy-line` = "ef71"
    var `moon-fill` = "ef72"
    var `moon-foggy-fill` = "ef73"
    var `moon-foggy-line` = "ef74"
    var `moon-line` = "ef75"
    var `more-2-fill` = "ef76"
    var `more-2-line` = "ef77"
    var `more-fill` = "ef78"
    var `more-line` = "ef79"
    var `motorbike-fill` = "ef7a"
    var `motorbike-line` = "ef7b"
    var `mouse-fill` = "ef7c"
    var `mouse-line` = "ef7d"
    var `movie-2-fill` = "ef7e"
    var `movie-2-line` = "ef7f"
    var `movie-fill` = "ef80"
    var `movie-line` = "ef81"
    var `music-2-fill` = "ef82"
    var `music-2-line` = "ef83"
    var `music-fill` = "ef84"
    var `music-line` = "ef85"
    var `mv-fill` = "ef86"
    var `mv-line` = "ef87"
    var `navigation-fill` = "ef88"
    var `navigation-line` = "ef89"
    var `netease-cloud-music-fill` = "ef8a"
    var `netease-cloud-music-line` = "ef8b"
    var `netflix-fill` = "ef8c"
    var `netflix-line` = "ef8d"
    var `newspaper-fill` = "ef8e"
    var `newspaper-line` = "ef8f"
    var `node-tree` = "ef90"
    var `notification-2-fill` = "ef91"
    var `notification-2-line` = "ef92"
    var `notification-3-fill` = "ef93"
    var `notification-3-line` = "ef94"
    var `notification-4-fill` = "ef95"
    var `notification-4-line` = "ef96"
    var `notification-badge-fill` = "ef97"
    var `notification-badge-line` = "ef98"
    var `notification-fill` = "ef99"
    var `notification-line` = "ef9a"
    var `notification-off-fill` = "ef9b"
    var `notification-off-line` = "ef9c"
    var `npmjs-fill` = "ef9d"
    var `npmjs-line` = "ef9e"
    var `number-0` = "ef9f"
    var `number-1` = "efa0"
    var `number-2` = "efa1"
    var `number-3` = "efa2"
    var `number-4` = "efa3"
    var `number-5` = "efa4"
    var `number-6` = "efa5"
    var `number-7` = "efa6"
    var `number-8` = "efa7"
    var `number-9` = "efa8"
    var `numbers-fill` = "efa9"
    var `numbers-line` = "efaa"
    var `nurse-fill` = "efab"
    var `nurse-line` = "efac"
    var `oil-fill` = "efad"
    var `oil-line` = "efae"
    var omega = "efaf"
    var `open-arm-fill` = "efb0"
    var `open-arm-line` = "efb1"
    var `open-source-fill` = "efb2"
    var `open-source-line` = "efb3"
    var `opera-fill` = "efb4"
    var `opera-line` = "efb5"
    var `order-play-fill` = "efb6"
    var `order-play-line` = "efb7"
    var `organization-chart` = "efb8"
    var `outlet-2-fill` = "efb9"
    var `outlet-2-line` = "efba"
    var `outlet-fill` = "efbb"
    var `outlet-line` = "efbc"
    var `page-separator` = "efbd"
    var `pages-fill` = "efbe"
    var `pages-line` = "efbf"
    var `paint-brush-fill` = "efc0"
    var `paint-brush-line` = "efc1"
    var `paint-fill` = "efc2"
    var `paint-line` = "efc3"
    var `palette-fill` = "efc4"
    var `palette-line` = "efc5"
    var `pantone-fill` = "efc6"
    var `pantone-line` = "efc7"
    var paragraph = "efc8"
    var `parent-fill` = "efc9"
    var `parent-line` = "efca"
    var `parentheses-fill` = "efcb"
    var `parentheses-line` = "efcc"
    var `parking-box-fill` = "efcd"
    var `parking-box-line` = "efce"
    var `parking-fill` = "efcf"
    var `parking-line` = "efd0"
    var `passport-fill` = "efd1"
    var `passport-line` = "efd2"
    var `patreon-fill` = "efd3"
    var `patreon-line` = "efd4"
    var `pause-circle-fill` = "efd5"
    var `pause-circle-line` = "efd6"
    var `pause-fill` = "efd7"
    var `pause-line` = "efd8"
    var `pause-mini-fill` = "efd9"
    var `pause-mini-line` = "efda"
    var `paypal-fill` = "efdb"
    var `paypal-line` = "efdc"
    var `pen-nib-fill` = "efdd"
    var `pen-nib-line` = "efde"
    var `pencil-fill` = "efdf"
    var `pencil-line` = "efe0"
    var `pencil-ruler-2-fill` = "efe1"
    var `pencil-ruler-2-line` = "efe2"
    var `pencil-ruler-fill` = "efe3"
    var `pencil-ruler-line` = "efe4"
    var `percent-fill` = "efe5"
    var `percent-line` = "efe6"
    var `phone-camera-fill` = "efe7"
    var `phone-camera-line` = "efe8"
    var `phone-fill` = "efe9"
    var `phone-find-fill` = "efea"
    var `phone-find-line` = "efeb"
    var `phone-line` = "efec"
    var `phone-lock-fill` = "efed"
    var `phone-lock-line` = "efee"
    var `picture-in-picture-2-fill` = "efef"
    var `picture-in-picture-2-line` = "eff0"
    var `picture-in-picture-exit-fill` = "eff1"
    var `picture-in-picture-exit-line` = "eff2"
    var `picture-in-picture-fill` = "eff3"
    var `picture-in-picture-line` = "eff4"
    var `pie-chart-2-fill` = "eff5"
    var `pie-chart-2-line` = "eff6"
    var `pie-chart-box-fill` = "eff7"
    var `pie-chart-box-line` = "eff8"
    var `pie-chart-fill` = "eff9"
    var `pie-chart-line` = "effa"
    var `pin-distance-fill` = "effb"
    var `pin-distance-line` = "effc"
    var `ping-pong-fill` = "effd"
    var `ping-pong-line` = "effe"
    var `pinterest-fill` = "efff"
    var `pinterest-line` = "f000"
    var `pinyin-input` = "f001"
    var `pixelfed-fill` = "f002"
    var `pixelfed-line` = "f003"
    var `plane-fill` = "f004"
    var `plane-line` = "f005"
    var `plant-fill` = "f006"
    var `plant-line` = "f007"
    var `play-circle-fill` = "f008"
    var `play-circle-line` = "f009"
    var `play-fill` = "f00a"
    var `play-line` = "f00b"
    var `play-list-2-fill` = "f00c"
    var `play-list-2-line` = "f00d"
    var `play-list-add-fill` = "f00e"
    var `play-list-add-line` = "f00f"
    var `play-list-fill` = "f010"
    var `play-list-line` = "f011"
    var `play-mini-fill` = "f012"
    var `play-mini-line` = "f013"
    var `playstation-fill` = "f014"
    var `playstation-line` = "f015"
    var `plug-2-fill` = "f016"
    var `plug-2-line` = "f017"
    var `plug-fill` = "f018"
    var `plug-line` = "f019"
    var `polaroid-2-fill` = "f01a"
    var `polaroid-2-line` = "f01b"
    var `polaroid-fill` = "f01c"
    var `polaroid-line` = "f01d"
    var `police-car-fill` = "f01e"
    var `police-car-line` = "f01f"
    var `price-tag-2-fill` = "f020"
    var `price-tag-2-line` = "f021"
    var `price-tag-3-fill` = "f022"
    var `price-tag-3-line` = "f023"
    var `price-tag-fill` = "f024"
    var `price-tag-line` = "f025"
    var `printer-cloud-fill` = "f026"
    var `printer-cloud-line` = "f027"
    var `printer-fill` = "f028"
    var `printer-line` = "f029"
    var `product-hunt-fill` = "f02a"
    var `product-hunt-line` = "f02b"
    var `profile-fill` = "f02c"
    var `profile-line` = "f02d"
    var `projector-2-fill` = "f02e"
    var `projector-2-line` = "f02f"
    var `projector-fill` = "f030"
    var `projector-line` = "f031"
    var `psychotherapy-fill` = "f032"
    var `psychotherapy-line` = "f033"
    var `pulse-fill` = "f034"
    var `pulse-line` = "f035"
    var `pushpin-2-fill` = "f036"
    var `pushpin-2-line` = "f037"
    var `pushpin-fill` = "f038"
    var `pushpin-line` = "f039"
    var `qq-fill` = "f03a"
    var `qq-line` = "f03b"
    var `qr-code-fill` = "f03c"
    var `qr-code-line` = "f03d"
    var `qr-scan-2-fill` = "f03e"
    var `qr-scan-2-line` = "f03f"
    var `qr-scan-fill` = "f040"
    var `qr-scan-line` = "f041"
    var `question-answer-fill` = "f042"
    var `question-answer-line` = "f043"
    var `question-fill` = "f044"
    var `question-line` = "f045"
    var `question-mark` = "f046"
    var `questionnaire-fill` = "f047"
    var `questionnaire-line` = "f048"
    var `quill-pen-fill` = "f049"
    var `quill-pen-line` = "f04a"
    var `radar-fill` = "f04b"
    var `radar-line` = "f04c"
    var `radio-2-fill` = "f04d"
    var `radio-2-line` = "f04e"
    var `radio-button-fill` = "f04f"
    var `radio-button-line` = "f050"
    var `radio-fill` = "f051"
    var `radio-line` = "f052"
    var `rainbow-fill` = "f053"
    var `rainbow-line` = "f054"
    var `rainy-fill` = "f055"
    var `rainy-line` = "f056"
    var `reactjs-fill` = "f057"
    var `reactjs-line` = "f058"
    var `record-circle-fill` = "f059"
    var `record-circle-line` = "f05a"
    var `record-mail-fill` = "f05b"
    var `record-mail-line` = "f05c"
    var `recycle-fill` = "f05d"
    var `recycle-line` = "f05e"
    var `red-packet-fill` = "f05f"
    var `red-packet-line` = "f060"
    var `reddit-fill` = "f061"
    var `reddit-line` = "f062"
    var `refresh-fill` = "f063"
    var `refresh-line` = "f064"
    var `refund-2-fill` = "f065"
    var `refund-2-line` = "f066"
    var `refund-fill` = "f067"
    var `refund-line` = "f068"
    var `registered-fill` = "f069"
    var `registered-line` = "f06a"
    var `remixicon-fill` = "f06b"
    var `remixicon-line` = "f06c"
    var `remote-control-2-fill` = "f06d"
    var `remote-control-2-line` = "f06e"
    var `remote-control-fill` = "f06f"
    var `remote-control-line` = "f070"
    var `repeat-2-fill` = "f071"
    var `repeat-2-line` = "f072"
    var `repeat-fill` = "f073"
    var `repeat-line` = "f074"
    var `repeat-one-fill` = "f075"
    var `repeat-one-line` = "f076"
    var `reply-all-fill` = "f077"
    var `reply-all-line` = "f078"
    var `reply-fill` = "f079"
    var `reply-line` = "f07a"
    var `reserved-fill` = "f07b"
    var `reserved-line` = "f07c"
    var `rest-time-fill` = "f07d"
    var `rest-time-line` = "f07e"
    var `restart-fill` = "f07f"
    var `restart-line` = "f080"
    var `restaurant-2-fill` = "f081"
    var `restaurant-2-line` = "f082"
    var `restaurant-fill` = "f083"
    var `restaurant-line` = "f084"
    var `rewind-fill` = "f085"
    var `rewind-line` = "f086"
    var `rewind-mini-fill` = "f087"
    var `rewind-mini-line` = "f088"
    var `rhythm-fill` = "f089"
    var `rhythm-line` = "f08a"
    var `riding-fill` = "f08b"
    var `riding-line` = "f08c"
    var `road-map-fill` = "f08d"
    var `road-map-line` = "f08e"
    var `roadster-fill` = "f08f"
    var `roadster-line` = "f090"
    var `robot-fill` = "f091"
    var `robot-line` = "f092"
    var `rocket-2-fill` = "f093"
    var `rocket-2-line` = "f094"
    var `rocket-fill` = "f095"
    var `rocket-line` = "f096"
    var `rotate-lock-fill` = "f097"
    var `rotate-lock-line` = "f098"
    var `rounded-corner` = "f099"
    var `route-fill` = "f09a"
    var `route-line` = "f09b"
    var `router-fill` = "f09c"
    var `router-line` = "f09d"
    var `rss-fill` = "f09e"
    var `rss-line` = "f09f"
    var `ruler-2-fill` = "f0a0"
    var `ruler-2-line` = "f0a1"
    var `ruler-fill` = "f0a2"
    var `ruler-line` = "f0a3"
    var `run-fill` = "f0a4"
    var `run-line` = "f0a5"
    var `safari-fill` = "f0a6"
    var `safari-line` = "f0a7"
    var `safe-2-fill` = "f0a8"
    var `safe-2-line` = "f0a9"
    var `safe-fill` = "f0aa"
    var `safe-line` = "f0ab"
    var `sailboat-fill` = "f0ac"
    var `sailboat-line` = "f0ad"
    var `save-2-fill` = "f0ae"
    var `save-2-line` = "f0af"
    var `save-3-fill` = "f0b0"
    var `save-3-line` = "f0b1"
    var `save-fill` = "f0b2"
    var `save-line` = "f0b3"
    var `scales-2-fill` = "f0b4"
    var `scales-2-line` = "f0b5"
    var `scales-3-fill` = "f0b6"
    var `scales-3-line` = "f0b7"
    var `scales-fill` = "f0b8"
    var `scales-line` = "f0b9"
    var `scan-2-fill` = "f0ba"
    var `scan-2-line` = "f0bb"
    var `scan-fill` = "f0bc"
    var `scan-line` = "f0bd"
    var `scissors-2-fill` = "f0be"
    var `scissors-2-line` = "f0bf"
    var `scissors-cut-fill` = "f0c0"
    var `scissors-cut-line` = "f0c1"
    var `scissors-fill` = "f0c2"
    var `scissors-line` = "f0c3"
    var `screenshot-2-fill` = "f0c4"
    var `screenshot-2-line` = "f0c5"
    var `screenshot-fill` = "f0c6"
    var `screenshot-line` = "f0c7"
    var `sd-card-fill` = "f0c8"
    var `sd-card-line` = "f0c9"
    var `sd-card-mini-fill` = "f0ca"
    var `sd-card-mini-line` = "f0cb"
    var `search-2-fill` = "f0cc"
    var `search-2-line` = "f0cd"
    var `search-eye-fill` = "f0ce"
    var `search-eye-line` = "f0cf"
    var `search-fill` = "f0d0"
    var `search-line` = "f0d1"
    var `secure-payment-fill` = "f0d2"
    var `secure-payment-line` = "f0d3"
    var `seedling-fill` = "f0d4"
    var `seedling-line` = "f0d5"
    var `send-backward` = "f0d6"
    var `send-plane-2-fill` = "f0d7"
    var `send-plane-2-line` = "f0d8"
    var `send-plane-fill` = "f0d9"
    var `send-plane-line` = "f0da"
    var `send-to-back` = "f0db"
    var `sensor-fill` = "f0dc"
    var `sensor-line` = "f0dd"
    var separator = "f0de"
    var `server-fill` = "f0df"
    var `server-line` = "f0e0"
    var `service-fill` = "f0e1"
    var `service-line` = "f0e2"
    var `settings-2-fill` = "f0e3"
    var `settings-2-line` = "f0e4"
    var `settings-3-fill` = "f0e5"
    var `settings-3-line` = "f0e6"
    var `settings-4-fill` = "f0e7"
    var `settings-4-line` = "f0e8"
    var `settings-5-fill` = "f0e9"
    var `settings-5-line` = "f0ea"
    var `settings-6-fill` = "f0eb"
    var `settings-6-line` = "f0ec"
    var `settings-fill` = "f0ed"
    var `settings-line` = "f0ee"
    var `shape-2-fill` = "f0ef"
    var `shape-2-line` = "f0f0"
    var `shape-fill` = "f0f1"
    var `shape-line` = "f0f2"
    var `share-box-fill` = "f0f3"
    var `share-box-line` = "f0f4"
    var `share-circle-fill` = "f0f5"
    var `share-circle-line` = "f0f6"
    var `share-fill` = "f0f7"
    var `share-forward-2-fill` = "f0f8"
    var `share-forward-2-line` = "f0f9"
    var `share-forward-box-fill` = "f0fa"
    var `share-forward-box-line` = "f0fb"
    var `share-forward-fill` = "f0fc"
    var `share-forward-line` = "f0fd"
    var `share-line` = "f0fe"
    var `shield-check-fill` = "f0ff"
    var `shield-check-line` = "f100"
    var `shield-cross-fill` = "f101"
    var `shield-cross-line` = "f102"
    var `shield-fill` = "f103"
    var `shield-flash-fill` = "f104"
    var `shield-flash-line` = "f105"
    var `shield-keyhole-fill` = "f106"
    var `shield-keyhole-line` = "f107"
    var `shield-line` = "f108"
    var `shield-star-fill` = "f109"
    var `shield-star-line` = "f10a"
    var `shield-user-fill` = "f10b"
    var `shield-user-line` = "f10c"
    var `ship-2-fill` = "f10d"
    var `ship-2-line` = "f10e"
    var `ship-fill` = "f10f"
    var `ship-line` = "f110"
    var `shirt-fill` = "f111"
    var `shirt-line` = "f112"
    var `shopping-bag-2-fill` = "f113"
    var `shopping-bag-2-line` = "f114"
    var `shopping-bag-3-fill` = "f115"
    var `shopping-bag-3-line` = "f116"
    var `shopping-bag-fill` = "f117"
    var `shopping-bag-line` = "f118"
    var `shopping-basket-2-fill` = "f119"
    var `shopping-basket-2-line` = "f11a"
    var `shopping-basket-fill` = "f11b"
    var `shopping-basket-line` = "f11c"
    var `shopping-cart-2-fill` = "f11d"
    var `shopping-cart-2-line` = "f11e"
    var `shopping-cart-fill` = "f11f"
    var `shopping-cart-line` = "f120"
    var `showers-fill` = "f121"
    var `showers-line` = "f122"
    var `shuffle-fill` = "f123"
    var `shuffle-line` = "f124"
    var `shut-down-fill` = "f125"
    var `shut-down-line` = "f126"
    var `side-bar-fill` = "f127"
    var `side-bar-line` = "f128"
    var `signal-tower-fill` = "f129"
    var `signal-tower-line` = "f12a"
    var `signal-wifi-1-fill` = "f12b"
    var `signal-wifi-1-line` = "f12c"
    var `signal-wifi-2-fill` = "f12d"
    var `signal-wifi-2-line` = "f12e"
    var `signal-wifi-3-fill` = "f12f"
    var `signal-wifi-3-line` = "f130"
    var `signal-wifi-error-fill` = "f131"
    var `signal-wifi-error-line` = "f132"
    var `signal-wifi-fill` = "f133"
    var `signal-wifi-line` = "f134"
    var `signal-wifi-off-fill` = "f135"
    var `signal-wifi-off-line` = "f136"
    var `sim-card-2-fill` = "f137"
    var `sim-card-2-line` = "f138"
    var `sim-card-fill` = "f139"
    var `sim-card-line` = "f13a"
    var `single-quotes-l` = "f13b"
    var `single-quotes-r` = "f13c"
    var `sip-fill` = "f13d"
    var `sip-line` = "f13e"
    var `skip-back-fill` = "f13f"
    var `skip-back-line` = "f140"
    var `skip-back-mini-fill` = "f141"
    var `skip-back-mini-line` = "f142"
    var `skip-forward-fill` = "f143"
    var `skip-forward-line` = "f144"
    var `skip-forward-mini-fill` = "f145"
    var `skip-forward-mini-line` = "f146"
    var `skull-2-fill` = "f147"
    var `skull-2-line` = "f148"
    var `skull-fill` = "f149"
    var `skull-line` = "f14a"
    var `skype-fill` = "f14b"
    var `skype-line` = "f14c"
    var `slack-fill` = "f14d"
    var `slack-line` = "f14e"
    var `slice-fill` = "f14f"
    var `slice-line` = "f150"
    var `slideshow-2-fill` = "f151"
    var `slideshow-2-line` = "f152"
    var `slideshow-3-fill` = "f153"
    var `slideshow-3-line` = "f154"
    var `slideshow-4-fill` = "f155"
    var `slideshow-4-line` = "f156"
    var `slideshow-fill` = "f157"
    var `slideshow-line` = "f158"
    var `smartphone-fill` = "f159"
    var `smartphone-line` = "f15a"
    var `snapchat-fill` = "f15b"
    var `snapchat-line` = "f15c"
    var `snowy-fill` = "f15d"
    var `snowy-line` = "f15e"
    var `sort-asc` = "f15f"
    var `sort-desc` = "f160"
    var `sound-module-fill` = "f161"
    var `sound-module-line` = "f162"
    var `soundcloud-fill` = "f163"
    var `soundcloud-line` = "f164"
    var `space-ship-fill` = "f165"
    var `space-ship-line` = "f166"
    var space = "f167"
    var `spam-2-fill` = "f168"
    var `spam-2-line` = "f169"
    var `spam-3-fill` = "f16a"
    var `spam-3-line` = "f16b"
    var `spam-fill` = "f16c"
    var `spam-line` = "f16d"
    var `speaker-2-fill` = "f16e"
    var `speaker-2-line` = "f16f"
    var `speaker-3-fill` = "f170"
    var `speaker-3-line` = "f171"
    var `speaker-fill` = "f172"
    var `speaker-line` = "f173"
    var `spectrum-fill` = "f174"
    var `spectrum-line` = "f175"
    var `speed-fill` = "f176"
    var `speed-line` = "f177"
    var `speed-mini-fill` = "f178"
    var `speed-mini-line` = "f179"
    var `split-cells-horizontal` = "f17a"
    var `split-cells-vertical` = "f17b"
    var `spotify-fill` = "f17c"
    var `spotify-line` = "f17d"
    var `spy-fill` = "f17e"
    var `spy-line` = "f17f"
    var `stack-fill` = "f180"
    var `stack-line` = "f181"
    var `stack-overflow-fill` = "f182"
    var `stack-overflow-line` = "f183"
    var `stackshare-fill` = "f184"
    var `stackshare-line` = "f185"
    var `star-fill` = "f186"
    var `star-half-fill` = "f187"
    var `star-half-line` = "f188"
    var `star-half-s-fill` = "f189"
    var `star-half-s-line` = "f18a"
    var `star-line` = "f18b"
    var `star-s-fill` = "f18c"
    var `star-s-line` = "f18d"
    var `star-smile-fill` = "f18e"
    var `star-smile-line` = "f18f"
    var `steam-fill` = "f190"
    var `steam-line` = "f191"
    var `steering-2-fill` = "f192"
    var `steering-2-line` = "f193"
    var `steering-fill` = "f194"
    var `steering-line` = "f195"
    var `stethoscope-fill` = "f196"
    var `stethoscope-line` = "f197"
    var `sticky-note-2-fill` = "f198"
    var `sticky-note-2-line` = "f199"
    var `sticky-note-fill` = "f19a"
    var `sticky-note-line` = "f19b"
    var `stock-fill` = "f19c"
    var `stock-line` = "f19d"
    var `stop-circle-fill` = "f19e"
    var `stop-circle-line` = "f19f"
    var `stop-fill` = "f1a0"
    var `stop-line` = "f1a1"
    var `stop-mini-fill` = "f1a2"
    var `stop-mini-line` = "f1a3"
    var `store-2-fill` = "f1a4"
    var `store-2-line` = "f1a5"
    var `store-3-fill` = "f1a6"
    var `store-3-line` = "f1a7"
    var `store-fill` = "f1a8"
    var `store-line` = "f1a9"
    var `strikethrough-2` = "f1aa"
    var strikethrough = "f1ab"
    var `subscript-2` = "f1ac"
    var subscript = "f1ad"
    var `subtract-fill` = "f1ae"
    var `subtract-line` = "f1af"
    var `subway-fill` = "f1b0"
    var `subway-line` = "f1b1"
    var `subway-wifi-fill` = "f1b2"
    var `subway-wifi-line` = "f1b3"
    var `suitcase-2-fill` = "f1b4"
    var `suitcase-2-line` = "f1b5"
    var `suitcase-3-fill` = "f1b6"
    var `suitcase-3-line` = "f1b7"
    var `suitcase-fill` = "f1b8"
    var `suitcase-line` = "f1b9"
    var `sun-cloudy-fill` = "f1ba"
    var `sun-cloudy-line` = "f1bb"
    var `sun-fill` = "f1bc"
    var `sun-foggy-fill` = "f1bd"
    var `sun-foggy-line` = "f1be"
    var `sun-line` = "f1bf"
    var `superscript-2` = "f1c0"
    var superscript = "f1c1"
    var `surgical-mask-fill` = "f1c2"
    var `surgical-mask-line` = "f1c3"
    var `surround-sound-fill` = "f1c4"
    var `surround-sound-line` = "f1c5"
    var `survey-fill` = "f1c6"
    var `survey-line` = "f1c7"
    var `swap-box-fill` = "f1c8"
    var `swap-box-line` = "f1c9"
    var `swap-fill` = "f1ca"
    var `swap-line` = "f1cb"
    var `switch-fill` = "f1cc"
    var `switch-line` = "f1cd"
    var `sword-fill` = "f1ce"
    var `sword-line` = "f1cf"
    var `syringe-fill` = "f1d0"
    var `syringe-line` = "f1d1"
    var `t-box-fill` = "f1d2"
    var `t-box-line` = "f1d3"
    var `t-shirt-2-fill` = "f1d4"
    var `t-shirt-2-line` = "f1d5"
    var `t-shirt-air-fill` = "f1d6"
    var `t-shirt-air-line` = "f1d7"
    var `t-shirt-fill` = "f1d8"
    var `t-shirt-line` = "f1d9"
    var `table-2` = "f1da"
    var `table-alt-fill` = "f1db"
    var `table-alt-line` = "f1dc"
    var `table-fill` = "f1dd"
    var `table-line` = "f1de"
    var `tablet-fill` = "f1df"
    var `tablet-line` = "f1e0"
    var `takeaway-fill` = "f1e1"
    var `takeaway-line` = "f1e2"
    var `taobao-fill` = "f1e3"
    var `taobao-line` = "f1e4"
    var `tape-fill` = "f1e5"
    var `tape-line` = "f1e6"
    var `task-fill` = "f1e7"
    var `task-line` = "f1e8"
    var `taxi-fill` = "f1e9"
    var `taxi-line` = "f1ea"
    var `taxi-wifi-fill` = "f1eb"
    var `taxi-wifi-line` = "f1ec"
    var `team-fill` = "f1ed"
    var `team-line` = "f1ee"
    var `telegram-fill` = "f1ef"
    var `telegram-line` = "f1f0"
    var `temp-cold-fill` = "f1f1"
    var `temp-cold-line` = "f1f2"
    var `temp-hot-fill` = "f1f3"
    var `temp-hot-line` = "f1f4"
    var `terminal-box-fill` = "f1f5"
    var `terminal-box-line` = "f1f6"
    var `terminal-fill` = "f1f7"
    var `terminal-line` = "f1f8"
    var `terminal-window-fill` = "f1f9"
    var `terminal-window-line` = "f1fa"
    var `test-tube-fill` = "f1fb"
    var `test-tube-line` = "f1fc"
    var `text-direction-l` = "f1fd"
    var `text-direction-r` = "f1fe"
    var `text-spacing` = "f1ff"
    var `text-wrap` = "f200"
    var text = "f201"
    var `thermometer-fill` = "f202"
    var `thermometer-line` = "f203"
    var `thumb-down-fill` = "f204"
    var `thumb-down-line` = "f205"
    var `thumb-up-fill` = "f206"
    var `thumb-up-line` = "f207"
    var `thunderstorms-fill` = "f208"
    var `thunderstorms-line` = "f209"
    var `ticket-2-fill` = "f20a"
    var `ticket-2-line` = "f20b"
    var `ticket-fill` = "f20c"
    var `ticket-line` = "f20d"
    var `time-fill` = "f20e"
    var `time-line` = "f20f"
    var `timer-2-fill` = "f210"
    var `timer-2-line` = "f211"
    var `timer-fill` = "f212"
    var `timer-flash-fill` = "f213"
    var `timer-flash-line` = "f214"
    var `timer-line` = "f215"
    var `todo-fill` = "f216"
    var `todo-line` = "f217"
    var `toggle-fill` = "f218"
    var `toggle-line` = "f219"
    var `tools-fill` = "f21a"
    var `tools-line` = "f21b"
    var `tornado-fill` = "f21c"
    var `tornado-line` = "f21d"
    var `trademark-fill` = "f21e"
    var `trademark-line` = "f21f"
    var `traffic-light-fill` = "f220"
    var `traffic-light-line` = "f221"
    var `train-fill` = "f222"
    var `train-line` = "f223"
    var `train-wifi-fill` = "f224"
    var `train-wifi-line` = "f225"
    var `translate-2` = "f226"
    var translate = "f227"
    var `travesti-fill` = "f228"
    var `travesti-line` = "f229"
    var `treasure-map-fill` = "f22a"
    var `treasure-map-line` = "f22b"
    var `trello-fill` = "f22c"
    var `trello-line` = "f22d"
    var `trophy-fill` = "f22e"
    var `trophy-line` = "f22f"
    var `truck-fill` = "f230"
    var `truck-line` = "f231"
    var `tumblr-fill` = "f232"
    var `tumblr-line` = "f233"
    var `tv-2-fill` = "f234"
    var `tv-2-line` = "f235"
    var `tv-fill` = "f236"
    var `tv-line` = "f237"
    var `twitch-fill` = "f238"
    var `twitch-line` = "f239"
    var `twitter-fill` = "f23a"
    var `twitter-line` = "f23b"
    var `typhoon-fill` = "f23c"
    var `typhoon-line` = "f23d"
    var `u-disk-fill` = "f23e"
    var `u-disk-line` = "f23f"
    var `ubuntu-fill` = "f240"
    var `ubuntu-line` = "f241"
    var `umbrella-fill` = "f242"
    var `umbrella-line` = "f243"
    var underline = "f244"
    var `uninstall-fill` = "f245"
    var `uninstall-line` = "f246"
    var `unsplash-fill` = "f247"
    var `unsplash-line` = "f248"
    var `upload-2-fill` = "f249"
    var `upload-2-line` = "f24a"
    var `upload-cloud-2-fill` = "f24b"
    var `upload-cloud-2-line` = "f24c"
    var `upload-cloud-fill` = "f24d"
    var `upload-cloud-line` = "f24e"
    var `upload-fill` = "f24f"
    var `upload-line` = "f250"
    var `usb-fill` = "f251"
    var `usb-line` = "f252"
    var `user-2-fill` = "f253"
    var `user-2-line` = "f254"
    var `user-3-fill` = "f255"
    var `user-3-line` = "f256"
    var `user-4-fill` = "f257"
    var `user-4-line` = "f258"
    var `user-5-fill` = "f259"
    var `user-5-line` = "f25a"
    var `user-6-fill` = "f25b"
    var `user-6-line` = "f25c"
    var `user-add-fill` = "f25d"
    var `user-add-line` = "f25e"
    var `user-fill` = "f25f"
    var `user-follow-fill` = "f260"
    var `user-follow-line` = "f261"
    var `user-heart-fill` = "f262"
    var `user-heart-line` = "f263"
    var `user-line` = "f264"
    var `user-location-fill` = "f265"
    var `user-location-line` = "f266"
    var `user-received-2-fill` = "f267"
    var `user-received-2-line` = "f268"
    var `user-received-fill` = "f269"
    var `user-received-line` = "f26a"
    var `user-search-fill` = "f26b"
    var `user-search-line` = "f26c"
    var `user-settings-fill` = "f26d"
    var `user-settings-line` = "f26e"
    var `user-shared-2-fill` = "f26f"
    var `user-shared-2-line` = "f270"
    var `user-shared-fill` = "f271"
    var `user-shared-line` = "f272"
    var `user-smile-fill` = "f273"
    var `user-smile-line` = "f274"
    var `user-star-fill` = "f275"
    var `user-star-line` = "f276"
    var `user-unfollow-fill` = "f277"
    var `user-unfollow-line` = "f278"
    var `user-voice-fill` = "f279"
    var `user-voice-line` = "f27a"
    var `video-add-fill` = "f27b"
    var `video-add-line` = "f27c"
    var `video-chat-fill` = "f27d"
    var `video-chat-line` = "f27e"
    var `video-download-fill` = "f27f"
    var `video-download-line` = "f280"
    var `video-fill` = "f281"
    var `video-line` = "f282"
    var `video-upload-fill` = "f283"
    var `video-upload-line` = "f284"
    var `vidicon-2-fill` = "f285"
    var `vidicon-2-line` = "f286"
    var `vidicon-fill` = "f287"
    var `vidicon-line` = "f288"
    var `vimeo-fill` = "f289"
    var `vimeo-line` = "f28a"
    var `vip-crown-2-fill` = "f28b"
    var `vip-crown-2-line` = "f28c"
    var `vip-crown-fill` = "f28d"
    var `vip-crown-line` = "f28e"
    var `vip-diamond-fill` = "f28f"
    var `vip-diamond-line` = "f290"
    var `vip-fill` = "f291"
    var `vip-line` = "f292"
    var `virus-fill` = "f293"
    var `virus-line` = "f294"
    var `visa-fill` = "f295"
    var `visa-line` = "f296"
    var `voice-recognition-fill` = "f297"
    var `voice-recognition-line` = "f298"
    var `voiceprint-fill` = "f299"
    var `voiceprint-line` = "f29a"
    var `volume-down-fill` = "f29b"
    var `volume-down-line` = "f29c"
    var `volume-mute-fill` = "f29d"
    var `volume-mute-line` = "f29e"
    var `volume-off-vibrate-fill` = "f29f"
    var `volume-off-vibrate-line` = "f2a0"
    var `volume-up-fill` = "f2a1"
    var `volume-up-line` = "f2a2"
    var `volume-vibrate-fill` = "f2a3"
    var `volume-vibrate-line` = "f2a4"
    var `vuejs-fill` = "f2a5"
    var `vuejs-line` = "f2a6"
    var `walk-fill` = "f2a7"
    var `walk-line` = "f2a8"
    var `wallet-2-fill` = "f2a9"
    var `wallet-2-line` = "f2aa"
    var `wallet-3-fill` = "f2ab"
    var `wallet-3-line` = "f2ac"
    var `wallet-fill` = "f2ad"
    var `wallet-line` = "f2ae"
    var `water-flash-fill` = "f2af"
    var `water-flash-line` = "f2b0"
    var `webcam-fill` = "f2b1"
    var `webcam-line` = "f2b2"
    var `wechat-2-fill` = "f2b3"
    var `wechat-2-line` = "f2b4"
    var `wechat-fill` = "f2b5"
    var `wechat-line` = "f2b6"
    var `wechat-pay-fill` = "f2b7"
    var `wechat-pay-line` = "f2b8"
    var `weibo-fill` = "f2b9"
    var `weibo-line` = "f2ba"
    var `whatsapp-fill` = "f2bb"
    var `whatsapp-line` = "f2bc"
    var `wheelchair-fill` = "f2bd"
    var `wheelchair-line` = "f2be"
    var `wifi-fill` = "f2bf"
    var `wifi-line` = "f2c0"
    var `wifi-off-fill` = "f2c1"
    var `wifi-off-line` = "f2c2"
    var `window-2-fill` = "f2c3"
    var `window-2-line` = "f2c4"
    var `window-fill` = "f2c5"
    var `window-line` = "f2c6"
    var `windows-fill` = "f2c7"
    var `windows-line` = "f2c8"
    var `windy-fill` = "f2c9"
    var `windy-line` = "f2ca"
    var `wireless-charging-fill` = "f2cb"
    var `wireless-charging-line` = "f2cc"
    var `women-fill` = "f2cd"
    var `women-line` = "f2ce"
    var `wubi-input` = "f2cf"
    var `xbox-fill` = "f2d0"
    var `xbox-line` = "f2d1"
    var `xing-fill` = "f2d2"
    var `xing-line` = "f2d3"
    var `youtube-fill` = "f2d4"
    var `youtube-line` = "f2d5"
    var `zcool-fill` = "f2d6"
    var `zcool-line` = "f2d7"
    var `zhihu-fill` = "f2d8"
    var `zhihu-line` = "f2d9"
    var `zoom-in-fill` = "f2da"
    var `zoom-in-line` = "f2db"
    var `zoom-out-fill` = "f2dc"
    var `zoom-out-line` = "f2dd"
    var `zzz-fill` = "f2de"
    var `zzz-line` = "f2df"
    var `arrow-down-double-fill` = "f2e0"
    var `arrow-down-double-line` = "f2e1"
    var `arrow-left-double-fill` = "f2e2"
    var `arrow-left-double-line` = "f2e3"
    var `arrow-right-double-fill` = "f2e4"
    var `arrow-right-double-line` = "f2e5"
    var `arrow-turn-back-fill` = "f2e6"
    var `arrow-turn-back-line` = "f2e7"
    var `arrow-turn-forward-fill` = "f2e8"
    var `arrow-turn-forward-line` = "f2e9"
    var `arrow-up-double-fill` = "f2ea"
    var `arrow-up-double-line` = "f2eb"
    var `bard-fill` = "f2ec"
    var `bard-line` = "f2ed"
    var `bootstrap-fill` = "f2ee"
    var `bootstrap-line` = "f2ef"
    var `box-1-fill` = "f2f0"
    var `box-1-line` = "f2f1"
    var `box-2-fill` = "f2f2"
    var `box-2-line` = "f2f3"
    var `box-3-fill` = "f2f4"
    var `box-3-line` = "f2f5"
    var `brain-fill` = "f2f6"
    var `brain-line` = "f2f7"
    var `candle-fill` = "f2f8"
    var `candle-line` = "f2f9"
    var `cash-fill` = "f2fa"
    var `cash-line` = "f2fb"
    var `contract-left-fill` = "f2fc"
    var `contract-left-line` = "f2fd"
    var `contract-left-right-fill` = "f2fe"
    var `contract-left-right-line` = "f2ff"
    var `contract-right-fill` = "f300"
    var `contract-right-line` = "f301"
    var `contract-up-down-fill` = "f302"
    var `contract-up-down-line` = "f303"
    var `copilot-fill` = "f304"
    var `copilot-line` = "f305"
    var `corner-down-left-fill` = "f306"
    var `corner-down-left-line` = "f307"
    var `corner-down-right-fill` = "f308"
    var `corner-down-right-line` = "f309"
    var `corner-left-down-fill` = "f30a"
    var `corner-left-down-line` = "f30b"
    var `corner-left-up-fill` = "f30c"
    var `corner-left-up-line` = "f30d"
    var `corner-right-down-fill` = "f30e"
    var `corner-right-down-line` = "f30f"
    var `corner-right-up-fill` = "f310"
    var `corner-right-up-line` = "f311"
    var `corner-up-left-double-fill` = "f312"
    var `corner-up-left-double-line` = "f313"
    var `corner-up-left-fill` = "f314"
    var `corner-up-left-line` = "f315"
    var `corner-up-right-double-fill` = "f316"
    var `corner-up-right-double-line` = "f317"
    var `corner-up-right-fill` = "f318"
    var `corner-up-right-line` = "f319"
    var `cross-fill` = "f31a"
    var `cross-line` = "f31b"
    var `edge-new-fill` = "f31c"
    var `edge-new-line` = "f31d"
    var `equal-fill` = "f31e"
    var `equal-line` = "f31f"
    var `expand-left-fill` = "f320"
    var `expand-left-line` = "f321"
    var `expand-left-right-fill` = "f322"
    var `expand-left-right-line` = "f323"
    var `expand-right-fill` = "f324"
    var `expand-right-line` = "f325"
    var `expand-up-down-fill` = "f326"
    var `expand-up-down-line` = "f327"
    var `flickr-fill` = "f328"
    var `flickr-line` = "f329"
    var `forward-10-fill` = "f32a"
    var `forward-10-line` = "f32b"
    var `forward-15-fill` = "f32c"
    var `forward-15-line` = "f32d"
    var `forward-30-fill` = "f32e"
    var `forward-30-line` = "f32f"
    var `forward-5-fill` = "f330"
    var `forward-5-line` = "f331"
    var `graduation-cap-fill` = "f332"
    var `graduation-cap-line` = "f333"
    var `home-office-fill` = "f334"
    var `home-office-line` = "f335"
    var `hourglass-2-fill` = "f336"
    var `hourglass-2-line` = "f337"
    var `hourglass-fill` = "f338"
    var `hourglass-line` = "f339"
    var `javascript-fill` = "f33a"
    var `javascript-line` = "f33b"
    var `loop-left-fill` = "f33c"
    var `loop-left-line` = "f33d"
    var `loop-right-fill` = "f33e"
    var `loop-right-line` = "f33f"
    var `memories-fill` = "f340"
    var `memories-line` = "f341"
    var `meta-fill` = "f342"
    var `meta-line` = "f343"
    var `microsoft-loop-fill` = "f344"
    var `microsoft-loop-line` = "f345"
    var `nft-fill` = "f346"
    var `nft-line` = "f347"
    var `notion-fill` = "f348"
    var `notion-line` = "f349"
    var `openai-fill` = "f34a"
    var `openai-line` = "f34b"
    var overline = "f34c"
    var `p2p-fill` = "f34d"
    var `p2p-line` = "f34e"
    var `presentation-fill` = "f34f"
    var `presentation-line` = "f350"
    var `replay-10-fill` = "f351"
    var `replay-10-line` = "f352"
    var `replay-15-fill` = "f353"
    var `replay-15-line` = "f354"
    var `replay-30-fill` = "f355"
    var `replay-30-line` = "f356"
    var `replay-5-fill` = "f357"
    var `replay-5-line` = "f358"
    var `school-fill` = "f359"
    var `school-line` = "f35a"
    var `shining-2-fill` = "f35b"
    var `shining-2-line` = "f35c"
    var `shining-fill` = "f35d"
    var `shining-line` = "f35e"
    var sketching = "f35f"
    var `skip-down-fill` = "f360"
    var `skip-down-line` = "f361"
    var `skip-left-fill` = "f362"
    var `skip-left-line` = "f363"
    var `skip-right-fill` = "f364"
    var `skip-right-line` = "f365"
    var `skip-up-fill` = "f366"
    var `skip-up-line` = "f367"
    var `slow-down-fill` = "f368"
    var `slow-down-line` = "f369"
    var `sparkling-2-fill` = "f36a"
    var `sparkling-2-line` = "f36b"
    var `sparkling-fill` = "f36c"
    var `sparkling-line` = "f36d"
    var `speak-fill` = "f36e"
    var `speak-line` = "f36f"
    var `speed-up-fill` = "f370"
    var `speed-up-line` = "f371"
    var `tiktok-fill` = "f372"
    var `tiktok-line` = "f373"
    var `token-swap-fill` = "f374"
    var `token-swap-line` = "f375"
    var `unpin-fill` = "f376"
    var `unpin-line` = "f377"
    var `wechat-channels-fill` = "f378"
    var `wechat-channels-line` = "f379"
    var `wordpress-fill` = "f37a"
    var `wordpress-line` = "f37b"
    var `blender-fill` = "f37c"
    var `blender-line` = "f37d"
    var `emoji-sticker-fill` = "f37e"
    var `emoji-sticker-line` = "f37f"
    var `git-close-pull-request-fill` = "f380"
    var `git-close-pull-request-line` = "f381"
    var `instance-fill` = "f382"
    var `instance-line` = "f383"
    var `megaphone-fill` = "f384"
    var `megaphone-line` = "f385"
    var `pass-expired-fill` = "f386"
    var `pass-expired-line` = "f387"
    var `pass-pending-fill` = "f388"
    var `pass-pending-line` = "f389"
    var `pass-valid-fill` = "f38a"
    var `pass-valid-line` = "f38b"
    var `ai-generate` = "f38c"
    var `calendar-close-fill` = "f38d"
    var `calendar-close-line` = "f38e"
    var draggable = "f38f"
    var `font-family` = "f390"
    var `font-mono` = "f391"
    var `font-sans-serif` = "f392"
    var `font-sans` = "f393"
    var `hard-drive-3-fill` = "f394"
    var `hard-drive-3-line` = "f395"
    var `kick-fill` = "f396"
    var `kick-line` = "f397"
    var `list-check-3` = "f398"
    var `list-indefinite` = "f399"
    var `list-ordered-2` = "f39a"
    var `list-radio` = "f39b"
    var `openbase-fill` = "f39c"
    var `openbase-line` = "f39d"
    var `planet-fill` = "f39e"
    var `planet-line` = "f39f"
    var `prohibited-fill` = "f3a0"
    var `prohibited-line` = "f3a1"
    var `quote-text` = "f3a2"
    var `seo-fill` = "f3a3"
    var `seo-line` = "f3a4"
    var `slash-commands` = "f3a5"
    var `archive-2-fill` = "f3a6"
    var `archive-2-line` = "f3a7"
    var `inbox-2-fill` = "f3a8"
    var `inbox-2-line` = "f3a9"
    var `shake-hands-fill` = "f3aa"
    var `shake-hands-line` = "f3ab"
    var `supabase-fill` = "f3ac"
    var `supabase-line` = "f3ad"
    var `water-percent-fill` = "f3ae"
    var `water-percent-line` = "f3af"
    var `yuque-fill` = "f3b0"
    var `yuque-line` = "f3b1"
    var `crosshair-2-fill` = "f3b2"
    var `crosshair-2-line` = "f3b3"
    var `crosshair-fill` = "f3b4"
    var `crosshair-line` = "f3b5"
    var `file-close-fill` = "f3b6"
    var `file-close-line` = "f3b7"
    var `infinity-fill` = "f3b8"
    var `infinity-line` = "f3b9"
    var `rfid-fill` = "f3ba"
    var `rfid-line` = "f3bb"
    var `slash-commands-2` = "f3bc"
    var `user-forbid-fill` = "f3bd"
    var `user-forbid-line` = "f3be"
    var `beer-fill` = "f3bf"
    var `beer-line` = "f3c0"
    var `circle-fill` = "f3c1"
    var `circle-line` = "f3c2"
    var `dropdown-list` = "f3c3"
    var `file-image-fill` = "f3c4"
    var `file-image-line` = "f3c5"
    var `file-pdf-2-fill` = "f3c6"
    var `file-pdf-2-line` = "f3c7"
    var `file-video-fill` = "f3c8"
    var `file-video-line` = "f3c9"
    var `folder-image-fill` = "f3ca"
    var `folder-image-line` = "f3cb"
    var `folder-video-fill` = "f3cc"
    var `folder-video-line` = "f3cd"
    var `hexagon-fill` = "f3ce"
    var `hexagon-line` = "f3cf"
    var `menu-search-fill` = "f3d0"
    var `menu-search-line` = "f3d1"
    var `octagon-fill` = "f3d2"
    var `octagon-line` = "f3d3"
    var `pentagon-fill` = "f3d4"
    var `pentagon-line` = "f3d5"
    var `rectangle-fill` = "f3d6"
    var `rectangle-line` = "f3d7"
    var `robot-2-fill` = "f3d8"
    var `robot-2-line` = "f3d9"
    var `shapes-fill` = "f3da"
    var `shapes-line` = "f3db"
    var `square-fill` = "f3dc"
    var `square-line` = "f3dd"
    var `tent-fill` = "f3de"
    var `tent-line` = "f3df"
    var `threads-fill` = "f3e0"
    var `threads-line` = "f3e1"
    var `tree-fill` = "f3e2"
    var `tree-line` = "f3e3"
    var `triangle-fill` = "f3e4"
    var `triangle-line` = "f3e5"
    var `twitter-x-fill` = "f3e6"
    var `twitter-x-line` = "f3e7"
    var `verified-badge-fill` = "f3e8"
    var `verified-badge-line` = "f3e9"
    var `armchair-fill` = "f3ea"
    var `armchair-line` = "f3eb"
    var `bnb-fill` = "f3ec"
    var `bnb-line` = "f3ed"
    var `bread-fill` = "f3ee"
    var `bread-line` = "f3ef"
    var `btc-fill` = "f3f0"
    var `btc-line` = "f3f1"
    var `calendar-schedule-fill` = "f3f2"
    var `calendar-schedule-line` = "f3f3"
    var `dice-1-fill` = "f3f4"
    var `dice-1-line` = "f3f5"
    var `dice-2-fill` = "f3f6"
    var `dice-2-line` = "f3f7"
    var `dice-3-fill` = "f3f8"
    var `dice-3-line` = "f3f9"
    var `dice-4-fill` = "f3fa"
    var `dice-4-line` = "f3fb"
    var `dice-5-fill` = "f3fc"
    var `dice-5-line` = "f3fd"
    var `dice-6-fill` = "f3fe"
    var `dice-6-line` = "f3ff"
    var `dice-fill` = "f400"
    var `dice-line` = "f401"
    var `drinks-fill` = "f402"
    var `drinks-line` = "f403"
    var `equalizer-2-fill` = "f404"
    var `equalizer-2-line` = "f405"
    var `equalizer-3-fill` = "f406"
    var `equalizer-3-line` = "f407"
    var `eth-fill` = "f408"
    var `eth-line` = "f409"
    var `flower-fill` = "f40a"
    var `flower-line` = "f40b"
    var `glasses-2-fill` = "f40c"
    var `glasses-2-line` = "f40d"
    var `glasses-fill` = "f40e"
    var `glasses-line` = "f40f"
    var `goggles-fill` = "f410"
    var `goggles-line` = "f411"
    var `image-circle-fill` = "f412"
    var `image-circle-line` = "f413"
    var `info-i` = "f414"
    var `money-rupee-circle-fill` = "f415"
    var `money-rupee-circle-line` = "f416"
    var `news-fill` = "f417"
    var `news-line` = "f418"
    var `robot-3-fill` = "f419"
    var `robot-3-line` = "f41a"
    var `share-2-fill` = "f41b"
    var `share-2-line` = "f41c"
    var `sofa-fill` = "f41d"
    var `sofa-line` = "f41e"
    var `svelte-fill` = "f41f"
    var `svelte-line` = "f420"
    var `vk-fill` = "f421"
    var `vk-line` = "f422"
    var `xrp-fill` = "f423"
    var `xrp-line` = "f424"
    var `xtz-fill` = "f425"
    var `xtz-line` = "f426"
    var `archive-stack-fill` = "f427"
    var `archive-stack-line` = "f428"
    var `bowl-fill` = "f429"
    var `bowl-line` = "f42a"
    var `calendar-view` = "f42b"
    var `carousel-view` = "f42c"
    var `code-block` = "f42d"
    var `color-filter-fill` = "f42e"
    var `color-filter-line` = "f42f"
    var `contacts-book-3-fill` = "f430"
    var `contacts-book-3-line` = "f431"
    var `contract-fill` = "f432"
    var `contract-line` = "f433"
    var `drinks-2-fill` = "f434"
    var `drinks-2-line` = "f435"
    var `export-fill` = "f436"
    var `export-line` = "f437"
    var `file-check-fill` = "f438"
    var `file-check-line` = "f439"
    var `focus-mode` = "f43a"
    var `folder-6-fill` = "f43b"
    var `folder-6-line` = "f43c"
    var `folder-check-fill` = "f43d"
    var `folder-check-line` = "f43e"
    var `folder-close-fill` = "f43f"
    var `folder-close-line` = "f440"
    var `folder-cloud-fill` = "f441"
    var `folder-cloud-line` = "f442"
    var `gallery-view-2` = "f443"
    var `gallery-view` = "f444"
    var hand = "f445"
    var `import-fill` = "f446"
    var `import-line` = "f447"
    var `information-2-fill` = "f448"
    var `information-2-line` = "f449"
    var `kanban-view-2` = "f44a"
    var `kanban-view` = "f44b"
    var `list-view` = "f44c"
    var `lock-star-fill` = "f44d"
    var `lock-star-line` = "f44e"
    var `puzzle-2-fill` = "f44f"
    var `puzzle-2-line` = "f450"
    var `puzzle-fill` = "f451"
    var `puzzle-line` = "f452"
    var `ram-2-fill` = "f453"
    var `ram-2-line` = "f454"
    var `ram-fill` = "f455"
    var `ram-line` = "f456"
    var `receipt-fill` = "f457"
    var `receipt-line` = "f458"
    var `shadow-fill` = "f459"
    var `shadow-line` = "f45a"
    var `sidebar-fold-fill` = "f45b"
    var `sidebar-fold-line` = "f45c"
    var `sidebar-unfold-fill` = "f45d"
    var `sidebar-unfold-line` = "f45e"
    var `slideshow-view` = "f45f"
    var `sort-alphabet-asc` = "f460"
    var `sort-alphabet-desc` = "f461"
    var `sort-number-asc` = "f462"
    var `sort-number-desc` = "f463"
    var `stacked-view` = "f464"
    var `sticky-note-add-fill` = "f465"
    var `sticky-note-add-line` = "f466"
    var `swap-2-fill` = "f467"
    var `swap-2-line` = "f468"
    var `swap-3-fill` = "f469"
    var `swap-3-line` = "f46a"
    var `table-3` = "f46b"
    var `table-view` = "f46c"
    var `text-block` = "f46d"
    var `text-snippet` = "f46e"
    var `timeline-view` = "f46f"
    var `blogger-fill` = "f470"
    var `blogger-line` = "f471"
    var `chat-thread-fill` = "f472"
    var `chat-thread-line` = "f473"
    var `discount-percent-fill` = "f474"
    var `discount-percent-line` = "f475"
    var `exchange-2-fill` = "f476"
    var `exchange-2-line` = "f477"
    var `git-fork-fill` = "f478"
    var `git-fork-line` = "f479"
    var `input-field` = "f47a"
    var `progress-1-fill` = "f47b"
    var `progress-1-line` = "f47c"
    var `progress-2-fill` = "f47d"
    var `progress-2-line` = "f47e"
    var `progress-3-fill` = "f47f"
    var `progress-3-line` = "f480"
    var `progress-4-fill` = "f481"
    var `progress-4-line` = "f482"
    var `progress-5-fill` = "f483"
    var `progress-5-line` = "f484"
    var `progress-6-fill` = "f485"
    var `progress-6-line` = "f486"
    var `progress-7-fill` = "f487"
    var `progress-7-line` = "f488"
    var `progress-8-fill` = "f489"
    var `progress-8-line` = "f48a"
    var `remix-run-fill` = "f48b"
    var `remix-run-line` = "f48c"
    var `signpost-fill` = "f48d"
    var `signpost-line` = "f48e"
    var `time-zone-fill` = "f48f"
    var `time-zone-line` = "f490"
    var `arrow-down-wide-fill` = "f491"
    var `arrow-down-wide-line` = "f492"
    var `arrow-left-wide-fill` = "f493"
    var `arrow-left-wide-line` = "f494"
    var `arrow-right-wide-fill` = "f495"
    var `arrow-right-wide-line` = "f496"
    var `arrow-up-wide-fill` = "f497"
    var `arrow-up-wide-line` = "f498"
    var `bluesky-fill` = "f499"
    var `bluesky-line` = "f49a"
    var `expand-height-fill` = "f49b"
    var `expand-height-line` = "f49c"
    var `expand-width-fill` = "f49d"
    var `expand-width-line` = "f49e"
    var `forward-end-fill` = "f49f"
    var `forward-end-line` = "f4a0"
    var `forward-end-mini-fill` = "f4a1"
    var `forward-end-mini-line` = "f4a2"
    var `friendica-fill` = "f4a3"
    var `friendica-line` = "f4a4"
    var `git-pr-draft-fill` = "f4a5"
    var `git-pr-draft-line` = "f4a6"
    var `play-reverse-fill` = "f4a7"
    var `play-reverse-line` = "f4a8"
    var `play-reverse-mini-fill` = "f4a9"
    var `play-reverse-mini-line` = "f4aa"
    var `rewind-start-fill` = "f4ab"
    var `rewind-start-line` = "f4ac"
    var `rewind-start-mini-fill` = "f4ad"
    var `rewind-start-mini-line` = "f4ae"
    var `scroll-to-bottom-fill` = "f4af"
    var `scroll-to-bottom-line` = "f4b0"
    var `add-large-fill` = "f4b1"
    var `add-large-line` = "f4b2"
    var `aed-electrodes-fill` = "f4b3"
    var `aed-electrodes-line` = "f4b4"
    var `aed-fill` = "f4b5"
    var `aed-line` = "f4b6"
    var `alibaba-cloud-fill` = "f4b7"
    var `alibaba-cloud-line` = "f4b8"
    var `align-item-bottom-fill` = "f4b9"
    var `align-item-bottom-line` = "f4ba"
    var `align-item-horizontal-center-fill` = "f4bb"
    var `align-item-horizontal-center-line` = "f4bc"
    var `align-item-left-fill` = "f4bd"
    var `align-item-left-line` = "f4be"
    var `align-item-right-fill` = "f4bf"
    var `align-item-right-line` = "f4c0"
    var `align-item-top-fill` = "f4c1"
    var `align-item-top-line` = "f4c2"
    var `align-item-vertical-center-fill` = "f4c3"
    var `align-item-vertical-center-line` = "f4c4"
    var `apps-2-add-fill` = "f4c5"
    var `apps-2-add-line` = "f4c6"
    var `close-large-fill` = "f4c7"
    var `close-large-line` = "f4c8"
    var `collapse-diagonal-2-fill` = "f4c9"
    var `collapse-diagonal-2-line` = "f4ca"
    var `collapse-diagonal-fill` = "f4cb"
    var `collapse-diagonal-line` = "f4cc"
    var `dashboard-horizontal-fill` = "f4cd"
    var `dashboard-horizontal-line` = "f4ce"
    var `expand-diagonal-2-fill` = "f4cf"
    var `expand-diagonal-2-line` = "f4d0"
    var `expand-diagonal-fill` = "f4d1"
    var `expand-diagonal-line` = "f4d2"
    var `firebase-fill` = "f4d3"
    var `firebase-line` = "f4d4"
    var `flip-horizontal-2-fill` = "f4d5"
    var `flip-horizontal-2-line` = "f4d6"
    var `flip-horizontal-fill` = "f4d7"
    var `flip-horizontal-line` = "f4d8"
    var `flip-vertical-2-fill` = "f4d9"
    var `flip-vertical-2-line` = "f4da"
    var `flip-vertical-fill` = "f4db"
    var `flip-vertical-line` = "f4dc"
    var formula = "f4dd"
    var `function-add-fill` = "f4de"
    var `function-add-line` = "f4df"
    var `goblet-2-fill` = "f4e0"
    var `goblet-2-line` = "f4e1"
    var `golf-ball-fill` = "f4e2"
    var `golf-ball-line` = "f4e3"
    var `group-3-fill` = "f4e4"
    var `group-3-line` = "f4e5"
    var `heart-add-2-fill` = "f4e6"
    var `heart-add-2-line` = "f4e7"
    var `id-card-fill` = "f4e8"
    var `id-card-line` = "f4e9"
    var `information-off-fill` = "f4ea"
    var `information-off-line` = "f4eb"
    var `java-fill` = "f4ec"
    var `java-line` = "f4ed"
    var `layout-grid-2-fill` = "f4ee"
    var `layout-grid-2-line` = "f4ef"
    var `layout-horizontal-fill` = "f4f0"
    var `layout-horizontal-line` = "f4f1"
    var `layout-vertical-fill` = "f4f2"
    var `layout-vertical-line` = "f4f3"
    var `menu-fold-2-fill` = "f4f4"
    var `menu-fold-2-line` = "f4f5"
    var `menu-fold-3-fill` = "f4f6"
    var `menu-fold-3-line` = "f4f7"
    var `menu-fold-4-fill` = "f4f8"
    var `menu-fold-4-line` = "f4f9"
    var `menu-unfold-2-fill` = "f4fa"
    var `menu-unfold-2-line` = "f4fb"
    var `menu-unfold-3-fill` = "f4fc"
    var `menu-unfold-3-line` = "f4fd"
    var `menu-unfold-4-fill` = "f4fe"
    var `menu-unfold-4-line` = "f4ff"
    var `mobile-download-fill` = "f500"
    var `mobile-download-line` = "f501"
    var `nextjs-fill` = "f502"
    var `nextjs-line` = "f503"
    var `nodejs-fill` = "f504"
    var `nodejs-line` = "f505"
    var `pause-large-fill` = "f506"
    var `pause-large-line` = "f507"
    var `play-large-fill` = "f508"
    var `play-large-line` = "f509"
    var `play-reverse-large-fill` = "f50a"
    var `play-reverse-large-line` = "f50b"
    var `police-badge-fill` = "f50c"
    var `police-badge-line` = "f50d"
    var `prohibited-2-fill` = "f50e"
    var `prohibited-2-line` = "f50f"
    var `shopping-bag-4-fill` = "f510"
    var `shopping-bag-4-line` = "f511"
    var `snowflake-fill` = "f512"
    var `snowflake-line` = "f513"
    var `square-root` = "f514"
    var `stop-large-fill` = "f515"
    var `stop-large-line` = "f516"
    var `tailwind-css-fill` = "f517"
    var `tailwind-css-line` = "f518"
    var `tooth-fill` = "f519"
    var `tooth-line` = "f51a"
    var `video-off-fill` = "f51b"
    var `video-off-line` = "f51c"
    var `video-on-fill` = "f51d"
    var `video-on-line` = "f51e"
    var `webhook-fill` = "f51f"
    var `webhook-line` = "f520"
    var `weight-fill` = "f521"
    var `weight-line` = "f522"
    var `book-shelf-fill` = "f523"
    var `book-shelf-line` = "f524"
    var `brain-2-fill` = "f525"
    var `brain-2-line` = "f526"
    var `chat-search-fill` = "f527"
    var `chat-search-line` = "f528"
    var `chat-unread-fill` = "f529"
    var `chat-unread-line` = "f52a"
    var `collapse-horizontal-fill` = "f52b"
    var `collapse-horizontal-line` = "f52c"
    var `collapse-vertical-fill` = "f52d"
    var `collapse-vertical-line` = "f52e"
    var `dna-fill` = "f52f"
    var `dna-line` = "f530"
    var `dropper-fill` = "f531"
    var `dropper-line` = "f532"
    var `expand-diagonal-s-2-fill` = "f533"
    var `expand-diagonal-s-2-line` = "f534"
    var `expand-diagonal-s-fill` = "f535"
    var `expand-diagonal-s-line` = "f536"
    var `expand-horizontal-fill` = "f537"
    var `expand-horizontal-line` = "f538"
    var `expand-horizontal-s-fill` = "f539"
    var `expand-horizontal-s-line` = "f53a"
    var `expand-vertical-fill` = "f53b"
    var `expand-vertical-line` = "f53c"
    var `expand-vertical-s-fill` = "f53d"
    var `expand-vertical-s-line` = "f53e"
    var `gemini-fill` = "f53f"
    var `gemini-line` = "f540"
    var `reset-left-fill` = "f541"
    var `reset-left-line` = "f542"
    var `reset-right-fill` = "f543"
    var `reset-right-line` = "f544"
    var `stairs-fill` = "f545"
    var `stairs-line` = "f546"
    var `telegram-2-fill` = "f547"
    var `telegram-2-line` = "f548"
    var `triangular-flag-fill` = "f549"
    var `triangular-flag-line` = "f54a"
    var `user-minus-fill` = "f54b"
    var `user-minus-line` = "f54c"
    var `account-box-2-fill` = "f54d"
    var `account-box-2-line` = "f54e"
    var `account-circle-2-fill` = "f54f"
    var `account-circle-2-line` = "f550"
    var `alarm-snooze-fill` = "f551"
    var `alarm-snooze-line` = "f552"
    var `arrow-down-box-fill` = "f553"
    var `arrow-down-box-line` = "f554"
    var `arrow-left-box-fill` = "f555"
    var `arrow-left-box-line` = "f556"
    var `arrow-left-down-box-fill` = "f557"
    var `arrow-left-down-box-line` = "f558"
    var `arrow-left-up-box-fill` = "f559"
    var `arrow-left-up-box-line` = "f55a"
    var `arrow-right-box-fill` = "f55b"
    var `arrow-right-box-line` = "f55c"
    var `arrow-right-down-box-fill` = "f55d"
    var `arrow-right-down-box-line` = "f55e"
    var `arrow-right-up-box-fill` = "f55f"
    var `arrow-right-up-box-line` = "f560"
    var `arrow-up-box-fill` = "f561"
    var `arrow-up-box-line` = "f562"
    var `bar-chart-box-ai-fill` = "f563"
    var `bar-chart-box-ai-line` = "f564"
    var `brush-ai-fill` = "f565"
    var `brush-ai-line` = "f566"
    var `camera-ai-fill` = "f567"
    var `camera-ai-line` = "f568"
    var `chat-ai-fill` = "f569"
    var `chat-ai-line` = "f56a"
    var `chat-smile-ai-fill` = "f56b"
    var `chat-smile-ai-line` = "f56c"
    var `chat-voice-ai-fill` = "f56d"
    var `chat-voice-ai-line` = "f56e"
    var `code-ai-fill` = "f56f"
    var `code-ai-line` = "f570"
    var `color-filter-ai-fill` = "f571"
    var `color-filter-ai-line` = "f572"
    var `custom-size` = "f573"
    var `fediverse-fill` = "f574"
    var `fediverse-line` = "f575"
    var `flag-off-fill` = "f576"
    var `flag-off-line` = "f577"
    var `home-9-fill` = "f578"
    var `home-9-line` = "f579"
    var `image-ai-fill` = "f57a"
    var `image-ai-line` = "f57b"
    var `image-circle-ai-fill` = "f57c"
    var `image-circle-ai-line` = "f57d"
    var `info-card-fill` = "f57e"
    var `info-card-line` = "f57f"
    var `landscape-ai-fill` = "f580"
    var `landscape-ai-line` = "f581"
    var `letter-spacing-2` = "f582"
    var `line-height-2` = "f583"
    var `mail-ai-fill` = "f584"
    var `mail-ai-line` = "f585"
    var `mic-2-ai-fill` = "f586"
    var `mic-2-ai-line` = "f587"
    var `mic-ai-fill` = "f588"
    var `mic-ai-line` = "f589"
    var `movie-ai-fill` = "f58a"
    var `movie-ai-line` = "f58b"
    var `music-ai-fill` = "f58c"
    var `music-ai-line` = "f58d"
    var `notification-snooze-fill` = "f58e"
    var `notification-snooze-line` = "f58f"
    var `php-fill` = "f590"
    var `php-line` = "f591"
    var `pix-fill` = "f592"
    var `pix-line` = "f593"
    var `pulse-ai-fill` = "f594"
    var `pulse-ai-line` = "f595"
    var `quill-pen-ai-fill` = "f596"
    var `quill-pen-ai-line` = "f597"
    var `speak-ai-fill` = "f598"
    var `speak-ai-line` = "f599"
    var `star-off-fill` = "f59a"
    var `star-off-line` = "f59b"
    var `translate-ai-2` = "f59c"
    var `translate-ai` = "f59d"
    var `user-community-fill` = "f59e"
    var `user-community-line` = "f59f"
    var `vercel-fill` = "f5a0"
    var `vercel-line` = "f5a1"
    var `video-ai-fill` = "f5a2"
    var `video-ai-line` = "f5a3"
    var `video-on-ai-fill` = "f5a4"
    var `video-on-ai-line` = "f5a5"
    var `voice-ai-fill` = "f5a6"
    var `voice-ai-line` = "f5a7"
    var `ai-generate-2` = "f5a8"
    var `ai-generate-text` = "f5a9"
    var `anthropic-fill` = "f5aa"
    var `anthropic-line` = "f5ab"
    var `apps-2-ai-fill` = "f5ac"
    var `apps-2-ai-line` = "f5ad"
    var `camera-lens-ai-fill` = "f5ae"
    var `camera-lens-ai-line` = "f5af"
    var `clapperboard-ai-fill` = "f5b0"
    var `clapperboard-ai-line` = "f5b1"
    var `claude-fill` = "f5b2"
    var `claude-line` = "f5b3"
    var `closed-captioning-ai-fill` = "f5b4"
    var `closed-captioning-ai-line` = "f5b5"
    var `dvd-ai-fill` = "f5b6"
    var `dvd-ai-line` = "f5b7"
    var `film-ai-fill` = "f5b8"
    var `film-ai-line` = "f5b9"
    var `font-size-ai` = "f5ba"
    var `mixtral-fill` = "f5bb"
    var `mixtral-line` = "f5bc"
    var `movie-2-ai-fill` = "f5bd"
    var `movie-2-ai-line` = "f5be"
    var `mv-ai-fill` = "f5bf"
    var `mv-ai-line` = "f5c0"
    var `perplexity-fill` = "f5c1"
    var `perplexity-line` = "f5c2"
    var `poker-clubs-fill` = "f5c3"
    var `poker-clubs-line` = "f5c4"
    var `poker-diamonds-fill` = "f5c5"
    var `poker-diamonds-line` = "f5c6"
    var `poker-hearts-fill` = "f5c7"
    var `poker-hearts-line` = "f5c8"
    var `poker-spades-fill` = "f5c9"
    var `poker-spades-line` = "f5ca"
    var `safe-3-fill` = "f5cb"
    var `safe-3-line` = "f5cc"
};
val GenUniModulesTmxUiComponentsXIconXIconClass = CreateVueComponent(GenUniModulesTmxUiComponentsXIconXIcon::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXIconXIcon.inheritAttrs, inject = GenUniModulesTmxUiComponentsXIconXIcon.inject, props = GenUniModulesTmxUiComponentsXIconXIcon.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXIconXIcon.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXIconXIcon.emits, components = GenUniModulesTmxUiComponentsXIconXIcon.components, styles = GenUniModulesTmxUiComponentsXIconXIcon.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXIconXIcon {
    return GenUniModulesTmxUiComponentsXIconXIcon(instance);
}
);
open class ITEMINFO (
    @JsonNotNull
    open var text: String,
    @JsonNotNull
    open var color: String,
    @JsonNotNull
    open var isHeightLight: Boolean = false,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ITEMINFOReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ITEMINFOReactiveObject : ITEMINFO, IUTSReactive<ITEMINFO> {
    override var __v_raw: ITEMINFO;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ITEMINFO, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(text = __v_raw.text, color = __v_raw.color, isHeightLight = __v_raw.isHeightLight) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ITEMINFOReactiveObject {
        return ITEMINFOReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var text: String
        get() {
            return trackReactiveGet(__v_raw, "text", __v_raw.text, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("text")) {
                return;
            }
            val oldValue = __v_raw.text;
            __v_raw.text = value;
            triggerReactiveSet(__v_raw, "text", oldValue, value);
        }
    override var color: String
        get() {
            return trackReactiveGet(__v_raw, "color", __v_raw.color, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("color")) {
                return;
            }
            val oldValue = __v_raw.color;
            __v_raw.color = value;
            triggerReactiveSet(__v_raw, "color", oldValue, value);
        }
    override var isHeightLight: Boolean
        get() {
            return trackReactiveGet(__v_raw, "isHeightLight", __v_raw.isHeightLight, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("isHeightLight")) {
                return;
            }
            val oldValue = __v_raw.isHeightLight;
            __v_raw.isHeightLight = value;
            triggerReactiveSet(__v_raw, "isHeightLight", oldValue, value);
        }
}
val GenUniModulesTmxUiComponentsXTextXTextClass = CreateVueComponent(GenUniModulesTmxUiComponentsXTextXText::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXTextXText.inheritAttrs, inject = GenUniModulesTmxUiComponentsXTextXText.inject, props = GenUniModulesTmxUiComponentsXTextXText.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXTextXText.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXTextXText.emits, components = GenUniModulesTmxUiComponentsXTextXText.components, styles = GenUniModulesTmxUiComponentsXTextXText.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXTextXText {
    return GenUniModulesTmxUiComponentsXTextXText(instance);
}
);
open class FORMITEM_R (
    @JsonNotNull
    open var key: String,
    open var value: Any? = null,
) : UTSObject()
open class FORM_ITEM (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var ele: XFormItemComponentPublicInstance,
    @JsonNotNull
    open var top: Number,
    @JsonNotNull
    open var name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return FORM_ITEMReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class FORM_ITEMReactiveObject : FORM_ITEM, IUTSReactive<FORM_ITEM> {
    override var __v_raw: FORM_ITEM;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: FORM_ITEM, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(id = __v_raw.id, ele = __v_raw.ele, top = __v_raw.top, name = __v_raw.name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): FORM_ITEMReactiveObject {
        return FORM_ITEMReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var ele: XFormItemComponentPublicInstance
        get() {
            return trackReactiveGet(__v_raw, "ele", __v_raw.ele, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("ele")) {
                return;
            }
            val oldValue = __v_raw.ele;
            __v_raw.ele = value;
            triggerReactiveSet(__v_raw, "ele", oldValue, value);
        }
    override var top: Number
        get() {
            return trackReactiveGet(__v_raw, "top", __v_raw.top, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("top")) {
                return;
            }
            val oldValue = __v_raw.top;
            __v_raw.top = value;
            triggerReactiveSet(__v_raw, "top", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
}
fun getDefaultRule(rule: FORM_RULE): FORM_RULE_SELF {
    var type: FORM_RULE_TYPE = rule?.type ?: "";
    var errorMessage: String = rule?.errorMessage ?: "请正确填写/选择";
    var max: Number = rule?.max ?: -1;
    var min: Number = rule?.min ?: 1;
    var selfvaild: FORM_VAILD_FUN? = rule.valid;
    var validfaun: FORM_VAILD_FUN? = selfvaild;
    return FORM_RULE_SELF(type = type, errorMessage = errorMessage, max = max, min = min, valid = validfaun);
}
fun vaild(kVal: Any?, rule: FORM_RULE_SELF): Boolean {
    if (rule.type != "") {
        return vaildBytType(kVal, rule);
    }
    if (kVal == null) {
        return false;
    }
    if (UTSAndroid.`typeof`( kVal) === "string") {
        var vallen = (kVal as String).trim().split("").length;
        if (rule.max == -1) {
            return vallen >= rule.min;
        }
        return vallen >= rule.min && vallen <= rule.max;
    }
    if (UTSArray.isArray(kVal)) {
        var vallen = (kVal as UTSArray<Any>).length;
        if (rule.max == -1) {
            return vallen >= rule.min;
        }
        return vallen >= rule.min && vallen <= rule.max;
    }
    if (UTSAndroid.`typeof`( kVal) === "boolean") {
        return kVal as Boolean;
    }
    if (UTSAndroid.`typeof`( kVal) === "number") {
        if (isNaN(kVal as Number)) {
            return false;
        }
        var vallen = kVal as Number;
        if (rule.max == -1) {
            return vallen >= rule.min;
        }
        return vallen >= rule.min && vallen <= rule.max;
    }
    if (UTSAndroid.`typeof`( kVal) == "Int") {
        var vallen = kVal as Int;
        if (rule.max == -1) {
            return vallen >= rule.min.toInt();
        }
        return vallen >= rule.min.toInt() && vallen <= rule.max.toInt();
    }
    if (UTSAndroid.`typeof`( kVal) == "Float") {
        var vallen = kVal as Float;
        if (rule.max == -1) {
            return vallen >= rule.min.toFloat();
        }
        return vallen >= rule.min.toFloat() && vallen <= rule.max.toFloat();
    }
    if (UTSAndroid.`typeof`( kVal) == "Double") {
        var vallen = kVal as Double;
        if (rule.max == -1) {
            return vallen >= rule.min.toDouble();
        }
        return vallen >= rule.min.toDouble() && vallen <= rule.max.toDouble();
    }
    if (UTSAndroid.`typeof`( kVal) == "Long") {
        var vallen = kVal as Long;
        if (rule.max == -1) {
            return vallen >= rule.min.toLong();
        }
        return vallen >= rule.min.toLong() && vallen <= rule.max.toLong();
    }
    return false;
}
fun formVaild(kVal: Any?, rule: FORM_RULE): Boolean {
    var rulereal = getDefaultRule(rule);
    var selfVaildFun = rulereal?.valid ?: null;
    var isPass = true;
    isPass = if (selfVaildFun == null) {
        vaild(kVal, rulereal);
    } else {
        selfVaildFun(kVal);
    }
    ;
    return isPass;
}
typealias labelDirType = String;
val GenUniModulesTmxUiComponentsXFormXFormClass = CreateVueComponent(GenUniModulesTmxUiComponentsXFormXForm::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenUniModulesTmxUiComponentsXFormXForm.name, inheritAttrs = GenUniModulesTmxUiComponentsXFormXForm.inheritAttrs, inject = GenUniModulesTmxUiComponentsXFormXForm.inject, props = GenUniModulesTmxUiComponentsXFormXForm.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXFormXForm.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXFormXForm.emits, components = GenUniModulesTmxUiComponentsXFormXForm.components, styles = GenUniModulesTmxUiComponentsXFormXForm.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXFormXForm {
    return GenUniModulesTmxUiComponentsXFormXForm(instance);
}
);
typealias XFormComponentPublicInstance = GenUniModulesTmxUiComponentsXFormXForm;
typealias FORM_VAILD_FUN = (`val`: Any?) -> Boolean;
open class FORM_RULE_SELF (
    @JsonNotNull
    open var type: FORM_RULE_TYPE,
    open var valid: FORM_VAILD_FUN? = null,
    @JsonNotNull
    open var errorMessage: String,
    @JsonNotNull
    open var max: Number,
    @JsonNotNull
    open var min: Number,
) : UTSObject()
val GenUniModulesTmxUiComponentsXFormItemXFormItemClass = CreateVueComponent(GenUniModulesTmxUiComponentsXFormItemXFormItem::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXFormItemXFormItem.inheritAttrs, inject = GenUniModulesTmxUiComponentsXFormItemXFormItem.inject, props = GenUniModulesTmxUiComponentsXFormItemXFormItem.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXFormItemXFormItem.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXFormItemXFormItem.emits, components = GenUniModulesTmxUiComponentsXFormItemXFormItem.components, styles = GenUniModulesTmxUiComponentsXFormItemXFormItem.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXFormItemXFormItem {
    return GenUniModulesTmxUiComponentsXFormItemXFormItem(instance);
}
);
typealias XFormItemComponentPublicInstance = GenUniModulesTmxUiComponentsXFormItemXFormItem;
fun vaildBytType(kVal: Any?, rule: FORM_RULE_SELF): Boolean {
    if (kVal == null) {
        return false;
    }
    if (rule.type == "string") {
        var vallen = (kVal as String).trim().split("").length;
        if (rule.max == -1) {
            return vallen >= rule.min;
        }
        return vallen >= rule.min && vallen <= rule.max;
    }
    if (rule.type == "array") {
        var vallen = (kVal as UTSArray<Any>).length;
        if (rule.max == -1) {
            return vallen >= rule.min;
        }
        return vallen >= rule.min && vallen <= rule.max;
    }
    if (rule.type == "boolean") {
        return kVal as Boolean;
    }
    if (rule.type == "number") {
        var v: Number = 0;
        if (UTSAndroid.`typeof`( kVal) != "number" && UTSAndroid.`typeof`( kVal) != "string") {
            return false;
        }
        if (UTSAndroid.`typeof`( kVal) == "Int") {
            var vallen = kVal as Int;
            v = vallen + 0;
        }
        if (UTSAndroid.`typeof`( kVal) == "Float") {
            var vallen = kVal as Float;
            v = vallen + 0;
        }
        if (UTSAndroid.`typeof`( kVal) == "Double") {
            var vallen = kVal as Double;
            v = vallen + 0;
        }
        if (UTSAndroid.`typeof`( kVal) == "Long") {
            var vallen = kVal as Long;
            v = vallen + 0;
        }
        if (UTSAndroid.`typeof`( kVal) == "number") {
            v = kVal as Number;
        } else if (UTSAndroid.`typeof`( kVal) == "string") {
            var pv = kVal as String;
            var vazhi = parseFloat(pv);
            if (isNaN(vazhi)) {
                return false;
            }
            v = vazhi;
        }
        var vallen = v;
        if (rule.max == -1) {
            return vallen >= rule.min;
        }
        return vallen >= rule.min && vallen <= rule.max;
    }
    if (rule.type == "phone") {
        var vallen = "";
        if (UTSAndroid.`typeof`( kVal) == "string") {
            vallen = kVal as String;
        } else if (UTSAndroid.`typeof`( kVal) == "number") {
            vallen = (kVal as Number).toString(10);
        }
        var reg = UTSRegExp("^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}\$", "");
        return reg.test(vallen);
    }
    if (rule.type == "email") {
        var vallen = kVal as String;
        var reg = UTSRegExp("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\$", "");
        return reg.test(vallen);
    }
    if (rule.type == "UTSJSON") {
        var vallen = kVal as UTSJSONObject;
        var mapkeys = vallen.toMap();
        var len = mapkeys.size;
        if (rule.max == -1) {
            return len >= rule.min;
        }
        return len >= rule.min && len <= rule.max;
    }
    if (rule.type == "date" && (UTSAndroid.`typeof`( kVal) == "string")) {
        var vallen = kVal as String;
        var date = Date(vallen);
        var times = date.getTime();
        if (isNaN(times)) {
            return false;
        }
        var len = times;
        if (rule.max == -1) {
            return len >= rule.min;
        }
        return len >= rule.min && len <= rule.max;
    }
    return false;
}
val GenUniModulesTmxUiComponentsXButtonXButtonClass = CreateVueComponent(GenUniModulesTmxUiComponentsXButtonXButton::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXButtonXButton.inheritAttrs, inject = GenUniModulesTmxUiComponentsXButtonXButton.inject, props = GenUniModulesTmxUiComponentsXButtonXButton.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXButtonXButton.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXButtonXButton.emits, components = GenUniModulesTmxUiComponentsXButtonXButton.components, styles = GenUniModulesTmxUiComponentsXButtonXButton.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXButtonXButton {
    return GenUniModulesTmxUiComponentsXButtonXButton(instance);
}
);
val GenPagesIndexIndexClass = CreateVueComponent(GenPagesIndexIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesIndexIndex.inheritAttrs, inject = GenPagesIndexIndex.inject, props = GenPagesIndexIndex.props, propsNeedCastKeys = GenPagesIndexIndex.propsNeedCastKeys, emits = GenPagesIndexIndex.emits, components = GenPagesIndexIndex.components, styles = GenPagesIndexIndex.styles);
}
, fun(instance): GenPagesIndexIndex {
    return GenPagesIndexIndex(instance);
}
);
val GenUniModulesTmxUiComponentsXSheetXSheetClass = CreateVueComponent(GenUniModulesTmxUiComponentsXSheetXSheet::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXSheetXSheet.inheritAttrs, inject = GenUniModulesTmxUiComponentsXSheetXSheet.inject, props = GenUniModulesTmxUiComponentsXSheetXSheet.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXSheetXSheet.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXSheetXSheet.emits, components = GenUniModulesTmxUiComponentsXSheetXSheet.components, styles = GenUniModulesTmxUiComponentsXSheetXSheet.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXSheetXSheet {
    return GenUniModulesTmxUiComponentsXSheetXSheet(instance);
}
);
typealias IMG_MODEL = String;
open class IMG_SIZE_INFO_PLACE (
    @JsonNotNull
    open var width: String,
    @JsonNotNull
    open var height: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return IMG_SIZE_INFO_PLACEReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class IMG_SIZE_INFO_PLACEReactiveObject : IMG_SIZE_INFO_PLACE, IUTSReactive<IMG_SIZE_INFO_PLACE> {
    override var __v_raw: IMG_SIZE_INFO_PLACE;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: IMG_SIZE_INFO_PLACE, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(width = __v_raw.width, height = __v_raw.height) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): IMG_SIZE_INFO_PLACEReactiveObject {
        return IMG_SIZE_INFO_PLACEReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var width: String
        get() {
            return trackReactiveGet(__v_raw, "width", __v_raw.width, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("width")) {
                return;
            }
            val oldValue = __v_raw.width;
            __v_raw.width = value;
            triggerReactiveSet(__v_raw, "width", oldValue, value);
        }
    override var height: String
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
}
val GenUniModulesTmxUiComponentsXImageXImageClass = CreateVueComponent(GenUniModulesTmxUiComponentsXImageXImage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXImageXImage.inheritAttrs, inject = GenUniModulesTmxUiComponentsXImageXImage.inject, props = GenUniModulesTmxUiComponentsXImageXImage.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXImageXImage.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXImageXImage.emits, components = GenUniModulesTmxUiComponentsXImageXImage.components, styles = GenUniModulesTmxUiComponentsXImageXImage.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXImageXImage {
    return GenUniModulesTmxUiComponentsXImageXImage(instance);
}
);
val GenPagesUtsapiOcrClass = CreateVueComponent(GenPagesUtsapiOcr::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiOcr.inheritAttrs, inject = GenPagesUtsapiOcr.inject, props = GenPagesUtsapiOcr.props, propsNeedCastKeys = GenPagesUtsapiOcr.propsNeedCastKeys, emits = GenPagesUtsapiOcr.emits, components = GenPagesUtsapiOcr.components, styles = GenPagesUtsapiOcr.styles);
}
, fun(instance): GenPagesUtsapiOcr {
    return GenPagesUtsapiOcr(instance);
}
);
open class xCellItemType (
    @JsonNotNull
    open var icon: String,
    @JsonNotNull
    open var title: String,
    @JsonNotNull
    open var desc: String,
    @JsonNotNull
    open var label: String,
    @JsonNotNull
    open var bottom: Boolean = false,
    @JsonNotNull
    open var link: Boolean = false,
    @JsonNotNull
    open var url: String,
    @JsonNotNull
    open var iconColor: String,
    @JsonNotNull
    open var labelColor: String,
    @JsonNotNull
    open var card: Boolean = false,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return xCellItemTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class xCellItemTypeReactiveObject : xCellItemType, IUTSReactive<xCellItemType> {
    override var __v_raw: xCellItemType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: xCellItemType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(icon = __v_raw.icon, title = __v_raw.title, desc = __v_raw.desc, label = __v_raw.label, bottom = __v_raw.bottom, link = __v_raw.link, url = __v_raw.url, iconColor = __v_raw.iconColor, labelColor = __v_raw.labelColor, card = __v_raw.card) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): xCellItemTypeReactiveObject {
        return xCellItemTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var icon: String
        get() {
            return trackReactiveGet(__v_raw, "icon", __v_raw.icon, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("icon")) {
                return;
            }
            val oldValue = __v_raw.icon;
            __v_raw.icon = value;
            triggerReactiveSet(__v_raw, "icon", oldValue, value);
        }
    override var title: String
        get() {
            return trackReactiveGet(__v_raw, "title", __v_raw.title, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("title")) {
                return;
            }
            val oldValue = __v_raw.title;
            __v_raw.title = value;
            triggerReactiveSet(__v_raw, "title", oldValue, value);
        }
    override var desc: String
        get() {
            return trackReactiveGet(__v_raw, "desc", __v_raw.desc, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("desc")) {
                return;
            }
            val oldValue = __v_raw.desc;
            __v_raw.desc = value;
            triggerReactiveSet(__v_raw, "desc", oldValue, value);
        }
    override var label: String
        get() {
            return trackReactiveGet(__v_raw, "label", __v_raw.label, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("label")) {
                return;
            }
            val oldValue = __v_raw.label;
            __v_raw.label = value;
            triggerReactiveSet(__v_raw, "label", oldValue, value);
        }
    override var bottom: Boolean
        get() {
            return trackReactiveGet(__v_raw, "bottom", __v_raw.bottom, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("bottom")) {
                return;
            }
            val oldValue = __v_raw.bottom;
            __v_raw.bottom = value;
            triggerReactiveSet(__v_raw, "bottom", oldValue, value);
        }
    override var link: Boolean
        get() {
            return trackReactiveGet(__v_raw, "link", __v_raw.link, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("link")) {
                return;
            }
            val oldValue = __v_raw.link;
            __v_raw.link = value;
            triggerReactiveSet(__v_raw, "link", oldValue, value);
        }
    override var url: String
        get() {
            return trackReactiveGet(__v_raw, "url", __v_raw.url, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("url")) {
                return;
            }
            val oldValue = __v_raw.url;
            __v_raw.url = value;
            triggerReactiveSet(__v_raw, "url", oldValue, value);
        }
    override var iconColor: String
        get() {
            return trackReactiveGet(__v_raw, "iconColor", __v_raw.iconColor, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("iconColor")) {
                return;
            }
            val oldValue = __v_raw.iconColor;
            __v_raw.iconColor = value;
            triggerReactiveSet(__v_raw, "iconColor", oldValue, value);
        }
    override var labelColor: String
        get() {
            return trackReactiveGet(__v_raw, "labelColor", __v_raw.labelColor, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("labelColor")) {
                return;
            }
            val oldValue = __v_raw.labelColor;
            __v_raw.labelColor = value;
            triggerReactiveSet(__v_raw, "labelColor", oldValue, value);
        }
    override var card: Boolean
        get() {
            return trackReactiveGet(__v_raw, "card", __v_raw.card, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("card")) {
                return;
            }
            val oldValue = __v_raw.card;
            __v_raw.card = value;
            triggerReactiveSet(__v_raw, "card", oldValue, value);
        }
}
val GenUniModulesTmxUiComponentsXCellXCellClass = CreateVueComponent(GenUniModulesTmxUiComponentsXCellXCell::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXCellXCell.inheritAttrs, inject = GenUniModulesTmxUiComponentsXCellXCell.inject, props = GenUniModulesTmxUiComponentsXCellXCell.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXCellXCell.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXCellXCell.emits, components = GenUniModulesTmxUiComponentsXCellXCell.components, styles = GenUniModulesTmxUiComponentsXCellXCell.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXCellXCell {
    return GenUniModulesTmxUiComponentsXCellXCell(instance);
}
);
val GenPagesUtsapiIndexClass = CreateVueComponent(GenPagesUtsapiIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiIndex.inheritAttrs, inject = GenPagesUtsapiIndex.inject, props = GenPagesUtsapiIndex.props, propsNeedCastKeys = GenPagesUtsapiIndex.propsNeedCastKeys, emits = GenPagesUtsapiIndex.emits, components = GenPagesUtsapiIndex.components, styles = GenPagesUtsapiIndex.styles);
}
, fun(instance): GenPagesUtsapiIndex {
    return GenPagesUtsapiIndex(instance);
}
);
typealias XFILESUPLOAD_BEFORE_CALLBACK = (list: UTSArray<fileListType>) -> UTSPromise<UTSArray<fileListType>>;
val GenUniModulesTmxUiComponentsXUploadFileXUploadFileClass = CreateVueComponent(GenUniModulesTmxUiComponentsXUploadFileXUploadFile::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXUploadFileXUploadFile.inheritAttrs, inject = GenUniModulesTmxUiComponentsXUploadFileXUploadFile.inject, props = GenUniModulesTmxUiComponentsXUploadFileXUploadFile.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXUploadFileXUploadFile.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXUploadFileXUploadFile.emits, components = GenUniModulesTmxUiComponentsXUploadFileXUploadFile.components, styles = GenUniModulesTmxUiComponentsXUploadFileXUploadFile.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXUploadFileXUploadFile {
    return GenUniModulesTmxUiComponentsXUploadFileXUploadFile(instance);
}
);
typealias XUploadFileComponentPublicInstance = GenUniModulesTmxUiComponentsXUploadFileXUploadFile;
val GenPagesIndexUploadFileClass = CreateVueComponent(GenPagesIndexUploadFile::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesIndexUploadFile.inheritAttrs, inject = GenPagesIndexUploadFile.inject, props = GenPagesIndexUploadFile.props, propsNeedCastKeys = GenPagesIndexUploadFile.propsNeedCastKeys, emits = GenPagesIndexUploadFile.emits, components = GenPagesIndexUploadFile.components, styles = GenPagesIndexUploadFile.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesIndexUploadFile.setup(props as GenPagesIndexUploadFile);
    }
    );
}
, fun(instance): GenPagesIndexUploadFile {
    return GenPagesIndexUploadFile(instance);
}
);
val GenUniModulesTmxUiComponentsXInputXInputClass = CreateVueComponent(GenUniModulesTmxUiComponentsXInputXInput::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXInputXInput.inheritAttrs, inject = GenUniModulesTmxUiComponentsXInputXInput.inject, props = GenUniModulesTmxUiComponentsXInputXInput.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXInputXInput.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXInputXInput.emits, components = GenUniModulesTmxUiComponentsXInputXInput.components, styles = GenUniModulesTmxUiComponentsXInputXInput.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXInputXInput {
    return GenUniModulesTmxUiComponentsXInputXInput(instance);
}
);
val GenPagesUtsapiQrcodeClass = CreateVueComponent(GenPagesUtsapiQrcode::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiQrcode.inheritAttrs, inject = GenPagesUtsapiQrcode.inject, props = GenPagesUtsapiQrcode.props, propsNeedCastKeys = GenPagesUtsapiQrcode.propsNeedCastKeys, emits = GenPagesUtsapiQrcode.emits, components = GenPagesUtsapiQrcode.components, styles = GenPagesUtsapiQrcode.styles);
}
, fun(instance): GenPagesUtsapiQrcode {
    return GenPagesUtsapiQrcode(instance);
}
);
val GenPagesUtsapiXloadingsClass = CreateVueComponent(GenPagesUtsapiXloadings::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiXloadings.inheritAttrs, inject = GenPagesUtsapiXloadings.inject, props = GenPagesUtsapiXloadings.props, propsNeedCastKeys = GenPagesUtsapiXloadings.propsNeedCastKeys, emits = GenPagesUtsapiXloadings.emits, components = GenPagesUtsapiXloadings.components, styles = GenPagesUtsapiXloadings.styles);
}
, fun(instance): GenPagesUtsapiXloadings {
    return GenPagesUtsapiXloadings(instance);
}
);
val GenPagesUtsapiXtoastClass = CreateVueComponent(GenPagesUtsapiXtoast::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiXtoast.inheritAttrs, inject = GenPagesUtsapiXtoast.inject, props = GenPagesUtsapiXtoast.props, propsNeedCastKeys = GenPagesUtsapiXtoast.propsNeedCastKeys, emits = GenPagesUtsapiXtoast.emits, components = GenPagesUtsapiXtoast.components, styles = GenPagesUtsapiXtoast.styles);
}
, fun(instance): GenPagesUtsapiXtoast {
    return GenPagesUtsapiXtoast(instance);
}
);
val GenPagesUtsapiXmodalClass = CreateVueComponent(GenPagesUtsapiXmodal::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiXmodal.inheritAttrs, inject = GenPagesUtsapiXmodal.inject, props = GenPagesUtsapiXmodal.props, propsNeedCastKeys = GenPagesUtsapiXmodal.propsNeedCastKeys, emits = GenPagesUtsapiXmodal.emits, components = GenPagesUtsapiXmodal.components, styles = GenPagesUtsapiXmodal.styles);
}
, fun(instance): GenPagesUtsapiXmodal {
    return GenPagesUtsapiXmodal(instance);
}
);
val GenPagesUtsapiXshareClass = CreateVueComponent(GenPagesUtsapiXshare::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiXshare.inheritAttrs, inject = GenPagesUtsapiXshare.inject, props = GenPagesUtsapiXshare.props, propsNeedCastKeys = GenPagesUtsapiXshare.propsNeedCastKeys, emits = GenPagesUtsapiXshare.emits, components = GenPagesUtsapiXshare.components, styles = GenPagesUtsapiXshare.styles);
}
, fun(instance): GenPagesUtsapiXshare {
    return GenPagesUtsapiXshare(instance);
}
);
val GenUniModulesTmxUiComponentsXNavbarXNavbarClass = CreateVueComponent(GenUniModulesTmxUiComponentsXNavbarXNavbar::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXNavbarXNavbar.inheritAttrs, inject = GenUniModulesTmxUiComponentsXNavbarXNavbar.inject, props = GenUniModulesTmxUiComponentsXNavbarXNavbar.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXNavbarXNavbar.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXNavbarXNavbar.emits, components = GenUniModulesTmxUiComponentsXNavbarXNavbar.components, styles = GenUniModulesTmxUiComponentsXNavbarXNavbar.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenUniModulesTmxUiComponentsXNavbarXNavbar.setup(props as GenUniModulesTmxUiComponentsXNavbarXNavbar);
    }
    );
}
, fun(instance): GenUniModulesTmxUiComponentsXNavbarXNavbar {
    return GenUniModulesTmxUiComponentsXNavbarXNavbar(instance);
}
);
val GenUniModulesTmxUiComponentsXColXColClass = CreateVueComponent(GenUniModulesTmxUiComponentsXColXCol::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXColXCol.inheritAttrs, inject = GenUniModulesTmxUiComponentsXColXCol.inject, props = GenUniModulesTmxUiComponentsXColXCol.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXColXCol.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXColXCol.emits, components = GenUniModulesTmxUiComponentsXColXCol.components, styles = GenUniModulesTmxUiComponentsXColXCol.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXColXCol {
    return GenUniModulesTmxUiComponentsXColXCol(instance);
}
);
val GenUniModulesTmxUiComponentsXRowXRowClass = CreateVueComponent(GenUniModulesTmxUiComponentsXRowXRow::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXRowXRow.inheritAttrs, inject = GenUniModulesTmxUiComponentsXRowXRow.inject, props = GenUniModulesTmxUiComponentsXRowXRow.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXRowXRow.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXRowXRow.emits, components = GenUniModulesTmxUiComponentsXRowXRow.components, styles = GenUniModulesTmxUiComponentsXRowXRow.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXRowXRow {
    return GenUniModulesTmxUiComponentsXRowXRow(instance);
}
);
val GenPagesUtsapiScanClass = CreateVueComponent(GenPagesUtsapiScan::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiScan.inheritAttrs, inject = GenPagesUtsapiScan.inject, props = GenPagesUtsapiScan.props, propsNeedCastKeys = GenPagesUtsapiScan.propsNeedCastKeys, emits = GenPagesUtsapiScan.emits, components = GenPagesUtsapiScan.components, styles = GenPagesUtsapiScan.styles);
}
, fun(instance): GenPagesUtsapiScan {
    return GenPagesUtsapiScan(instance);
}
);
val GenPagesUtsapiOtherClass = CreateVueComponent(GenPagesUtsapiOther::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiOther.inheritAttrs, inject = GenPagesUtsapiOther.inject, props = GenPagesUtsapiOther.props, propsNeedCastKeys = GenPagesUtsapiOther.propsNeedCastKeys, emits = GenPagesUtsapiOther.emits, components = GenPagesUtsapiOther.components, styles = GenPagesUtsapiOther.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesUtsapiOther.setup(props as GenPagesUtsapiOther);
    }
    );
}
, fun(instance): GenPagesUtsapiOther {
    return GenPagesUtsapiOther(instance);
}
);
open class GenUniModulesTmxUiComponentsXCheckboxXCheckboxSlotDataLabel (
    @JsonNotNull
    open var checked: Boolean = false,
    @JsonNotNull
    open var value: String,
) : SlotData()
open class XCHECKBOX_LISTITEM_TYPE (
    @JsonNotNull
    open var ele: XCheckboxComponentPublicInstance,
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var data: CHECKBOX_ITEM_INFO,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return XCHECKBOX_LISTITEM_TYPEReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class XCHECKBOX_LISTITEM_TYPEReactiveObject : XCHECKBOX_LISTITEM_TYPE, IUTSReactive<XCHECKBOX_LISTITEM_TYPE> {
    override var __v_raw: XCHECKBOX_LISTITEM_TYPE;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: XCHECKBOX_LISTITEM_TYPE, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(ele = __v_raw.ele, id = __v_raw.id, data = __v_raw.data) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): XCHECKBOX_LISTITEM_TYPEReactiveObject {
        return XCHECKBOX_LISTITEM_TYPEReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var ele: XCheckboxComponentPublicInstance
        get() {
            return trackReactiveGet(__v_raw, "ele", __v_raw.ele, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("ele")) {
                return;
            }
            val oldValue = __v_raw.ele;
            __v_raw.ele = value;
            triggerReactiveSet(__v_raw, "ele", oldValue, value);
        }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var data: CHECKBOX_ITEM_INFO
        get() {
            return trackReactiveGet(__v_raw, "data", __v_raw.data, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("data")) {
                return;
            }
            val oldValue = __v_raw.data;
            __v_raw.data = value;
            triggerReactiveSet(__v_raw, "data", oldValue, value);
        }
}
val GenUniModulesTmxUiComponentsXCheckboxXCheckboxClass = CreateVueComponent(GenUniModulesTmxUiComponentsXCheckboxXCheckbox::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXCheckboxXCheckbox.inheritAttrs, inject = GenUniModulesTmxUiComponentsXCheckboxXCheckbox.inject, props = GenUniModulesTmxUiComponentsXCheckboxXCheckbox.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXCheckboxXCheckbox.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXCheckboxXCheckbox.emits, components = GenUniModulesTmxUiComponentsXCheckboxXCheckbox.components, styles = GenUniModulesTmxUiComponentsXCheckboxXCheckbox.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXCheckboxXCheckbox {
    return GenUniModulesTmxUiComponentsXCheckboxXCheckbox(instance);
}
);
typealias XCheckboxComponentPublicInstance = GenUniModulesTmxUiComponentsXCheckboxXCheckbox;
val GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroupClass = CreateVueComponent(GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup.name, inheritAttrs = GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup.inheritAttrs, inject = GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup.inject, props = GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup.emits, components = GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup.components, styles = GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup.styles);
}
, fun(instance): GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup {
    return GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup(instance);
}
);
typealias XCheckboxGroupComponentPublicInstance = GenUniModulesTmxUiComponentsXCheckboxGroupXCheckboxGroup;
val GenPagesUtsapiXcamreaClass = CreateVueComponent(GenPagesUtsapiXcamrea::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiXcamrea.inheritAttrs, inject = GenPagesUtsapiXcamrea.inject, props = GenPagesUtsapiXcamrea.props, propsNeedCastKeys = GenPagesUtsapiXcamrea.propsNeedCastKeys, emits = GenPagesUtsapiXcamrea.emits, components = GenPagesUtsapiXcamrea.components, styles = GenPagesUtsapiXcamrea.styles);
}
, fun(instance): GenPagesUtsapiXcamrea {
    return GenPagesUtsapiXcamrea(instance);
}
);
val GenUniModulesTmxUiComponentsXLinkXLinkClass = CreateVueComponent(GenUniModulesTmxUiComponentsXLinkXLink::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesTmxUiComponentsXLinkXLink.inheritAttrs, inject = GenUniModulesTmxUiComponentsXLinkXLink.inject, props = GenUniModulesTmxUiComponentsXLinkXLink.props, propsNeedCastKeys = GenUniModulesTmxUiComponentsXLinkXLink.propsNeedCastKeys, emits = GenUniModulesTmxUiComponentsXLinkXLink.emits, components = GenUniModulesTmxUiComponentsXLinkXLink.components, styles = GenUniModulesTmxUiComponentsXLinkXLink.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenUniModulesTmxUiComponentsXLinkXLink.setup(props as GenUniModulesTmxUiComponentsXLinkXLink);
    }
    );
}
, fun(instance): GenUniModulesTmxUiComponentsXLinkXLink {
    return GenUniModulesTmxUiComponentsXLinkXLink(instance);
}
);
val GenPagesUtsapiXcryptoClass = CreateVueComponent(GenPagesUtsapiXcrypto::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiXcrypto.inheritAttrs, inject = GenPagesUtsapiXcrypto.inject, props = GenPagesUtsapiXcrypto.props, propsNeedCastKeys = GenPagesUtsapiXcrypto.propsNeedCastKeys, emits = GenPagesUtsapiXcrypto.emits, components = GenPagesUtsapiXcrypto.components, styles = GenPagesUtsapiXcrypto.styles);
}
, fun(instance): GenPagesUtsapiXcrypto {
    return GenPagesUtsapiXcrypto(instance);
}
);
val GenPagesUtsapiXtipsClass = CreateVueComponent(GenPagesUtsapiXtips::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiXtips.inheritAttrs, inject = GenPagesUtsapiXtips.inject, props = GenPagesUtsapiXtips.props, propsNeedCastKeys = GenPagesUtsapiXtips.propsNeedCastKeys, emits = GenPagesUtsapiXtips.emits, components = GenPagesUtsapiXtips.components, styles = GenPagesUtsapiXtips.styles);
}
, fun(instance): GenPagesUtsapiXtips {
    return GenPagesUtsapiXtips(instance);
}
);
val GenPagesUtsapiScreenshotClass = CreateVueComponent(GenPagesUtsapiScreenshot::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiScreenshot.inheritAttrs, inject = GenPagesUtsapiScreenshot.inject, props = GenPagesUtsapiScreenshot.props, propsNeedCastKeys = GenPagesUtsapiScreenshot.propsNeedCastKeys, emits = GenPagesUtsapiScreenshot.emits, components = GenPagesUtsapiScreenshot.components, styles = GenPagesUtsapiScreenshot.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesUtsapiScreenshot.setup(props as GenPagesUtsapiScreenshot);
    }
    );
}
, fun(instance): GenPagesUtsapiScreenshot {
    return GenPagesUtsapiScreenshot(instance);
}
);
val GenPagesUtsapiClipboardClass = CreateVueComponent(GenPagesUtsapiClipboard::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiClipboard.inheritAttrs, inject = GenPagesUtsapiClipboard.inject, props = GenPagesUtsapiClipboard.props, propsNeedCastKeys = GenPagesUtsapiClipboard.propsNeedCastKeys, emits = GenPagesUtsapiClipboard.emits, components = GenPagesUtsapiClipboard.components, styles = GenPagesUtsapiClipboard.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesUtsapiClipboard.setup(props as GenPagesUtsapiClipboard);
    }
    );
}
, fun(instance): GenPagesUtsapiClipboard {
    return GenPagesUtsapiClipboard(instance);
}
);
val GenPagesUtsapiXAnimationSClass = CreateVueComponent(GenPagesUtsapiXAnimationS::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUtsapiXAnimationS.inheritAttrs, inject = GenPagesUtsapiXAnimationS.inject, props = GenPagesUtsapiXAnimationS.props, propsNeedCastKeys = GenPagesUtsapiXAnimationS.propsNeedCastKeys, emits = GenPagesUtsapiXAnimationS.emits, components = GenPagesUtsapiXAnimationS.components, styles = GenPagesUtsapiXAnimationS.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesUtsapiXAnimationS.setup(props as GenPagesUtsapiXAnimationS);
    }
    );
}
, fun(instance): GenPagesUtsapiXAnimationS {
    return GenPagesUtsapiXAnimationS(instance);
}
);
fun createApp(): UTSJSONObject {
    val app = createSSRApp(GenAppClass);
    app.use(xui);
    return UTSJSONObject(Map<String, Any?>(utsArrayOf(
        utsArrayOf(
            "app",
            app
        )
    )));
}
fun main(app: IApp) {
    definePageRoutes();
    defineAppConfig();
    (createApp()["app"] as VueApp).mount(app, GenUniApp());
}
open class UniAppConfig : io.dcloud.uniapp.appframe.AppConfig {
    override var name: String = "tmui4";
    override var appid: String = "__UNI__BEFAB40";
    override var versionName: String = "1.1.7";
    override var versionCode: String = "117";
    override var uniCompilerVersion: String = "4.45";
    override var defaultAppTheme: String = "light";
    constructor() : super() {}
}
fun definePageRoutes() {
    __uniRoutes.push(UniPageRoute(path = "pages/index/index", component = GenPagesIndexIndexClass, meta = UniPageMeta(isQuit = true), style = utsMapOf("navigationBarTitleText" to "TMUI4.0", "navigationStyle" to "custom")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/ocr", component = GenPagesUtsapiOcrClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "文本识别 xOcrS", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/index", component = GenPagesUtsapiIndexClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "原生插件", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/index/upload-file", component = GenPagesIndexUploadFileClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "文件选择 xUploadFile", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/qrcode", component = GenPagesUtsapiQrcodeClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "二维码生成", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/xloadings", component = GenPagesUtsapiXloadingsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "全屏加载 xLoadingS")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/xtoast", component = GenPagesUtsapiXtoastClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "消息提示  xToastS")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/xmodal", component = GenPagesUtsapiXmodalClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "对话框 xModalS")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/xshare", component = GenPagesUtsapiXshareClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "分享 xShare")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/scan", component = GenPagesUtsapiScanClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "扫码 Scan", "enablePullDownRefresh" to false, "navigationStyle" to "custom")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/other", component = GenPagesUtsapiOtherClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "杂项插件")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/xcamrea", component = GenPagesUtsapiXcamreaClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "相机 xCamreaU")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/xcrypto", component = GenPagesUtsapiXcryptoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "加密 xCrypto")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/xtips", component = GenPagesUtsapiXtipsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "xtips")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/screenshot", component = GenPagesUtsapiScreenshotClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "屏幕截图 xScreenshotS")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/clipboard", component = GenPagesUtsapiClipboardClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "剪切板 xClipboardS")));
    __uniRoutes.push(UniPageRoute(path = "pages/utsapi/xAnimationS", component = GenPagesUtsapiXAnimationSClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "原生动画 xAnimationS")));
}
val __uniLaunchPage: Map<String, Any?> = utsMapOf("url" to "pages/index/index", "style" to utsMapOf("navigationBarTitleText" to "TMUI4.0", "navigationStyle" to "custom"));
fun defineAppConfig() {
    __uniConfig.entryPagePath = "/pages/index/index";
    __uniConfig.globalStyle = utsMapOf("navigationBarTextStyle" to "@navTxtStyle", "navigationBarBackgroundColor" to "@navBgColor", "backgroundColorContent" to "@backgroundColor", "backgroundColor" to "@backgroundColor", "navigationBarTitleText" to "tmui4.0", "pageOrientation" to "auto");
    __uniConfig.getTabBarConfig = fun(): Map<String, Any>? {
        return null;
    }
    ;
    __uniConfig.tabBar = __uniConfig.getTabBarConfig();
    __uniConfig.conditionUrl = "";
    __uniConfig.uniIdRouter = utsMapOf();
    __uniConfig.themeConfig = utsMapOf("light" to utsMapOf("navBgColor" to "#f5f5f5", "navTxtStyle" to "black", "backgroundColor" to "#f5f5f5", "backgroundTextStyle" to "#333333", "tabBgColor" to "#FFFFFF", "tabBorderStyle" to "#cccccc", "tabFontColor" to "#979797", "tabSelectedColor" to "#0073FF"), "dark" to utsMapOf("navBgColor" to "#000000", "navTxtStyle" to "white", "backgroundColor" to "#000000", "backgroundTextStyle" to "#ffffff", "tabBgColor" to "#000000", "tabBorderStyle" to "#222222", "tabFontColor" to "#d0d0d0", "tabSelectedColor" to "#0073FF"));
    __uniConfig.ready = true;
}
open class GenUniApp : UniAppImpl() {
    open val vm: GenApp?
        get() {
            return getAppVm() as GenApp?;
        }
    open val `$vm`: GenApp?
        get() {
            return getAppVm() as GenApp?;
        }
}
fun getApp(): GenUniApp {
    return getUniApp() as GenUniApp;
}
