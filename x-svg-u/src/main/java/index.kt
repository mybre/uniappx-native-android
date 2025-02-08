@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xSvgU;
import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.widget.ImageView;
import com.caverock.androidsvg.SVG;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.UniSDKEngine;
import io.dcloud.uniapp.appframe.PageProxy;
import io.dcloud.uniapp.dom.node.DomNode;
import io.dcloud.uniapp.dom.node.PageNode;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.interfaces.INodeData;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.ui.component.IComponentData;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import io.dcloud.uts.component.*;
import io.dcloud.uts.component.UTSComponent;
import io.dcloud.uts.component.UTSSize;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
open class XSvgUComponent : UTSComponent<ImageView> {
    constructor(proxy: PageProxy, componentData: IComponentData) : super(proxy, componentData) ;
    open var src: String = "";
    open var width: Number = 18;
    open var height: Number = 18;
    open var color: String = "#000000";
    override fun created() {}
    override fun NVBeforeLoad() {}
    override fun NVLoad(): ImageView {
        var imageview = ImageView(UTSAndroid.getAppContext()!! as Context);
        return imageview;
    }
    override fun NVLoaded() {}
    override fun NVLayouted() {}
    override fun NVBeforeUnload() {}
    override fun NVUnloaded() {}
    override fun unmounted() {}
    override fun NVMeasure(size: UTSSize): UTSSize {
        size.width = this.width.toFloat();
        size.height = this.height.toFloat();
        return size;
    }
    open fun setImage(newval: String) {
        var furl = UTSAndroid.convert2AbsFullPath(newval);
        var inputStream: InputStream? = null;
        var context = UTSAndroid.getAppContext()!! as Context;
        if (furl.indexOf("android_asset") == -1) {
            inputStream = FileInputStream(File(furl));
        } else {
            inputStream = UTSAndroid.getUniActivity()!!.getAssets().open(furl.replace("/android_asset/", ""));
        }
        if (inputStream == null) {
            return;
        }
        var svg = SVG.getFromInputStream(inputStream!!);
        var pictureDrawable = PictureDrawable(svg.renderToPicture());
        this.`$el`?.setImageDrawable(pictureDrawable);
    }
    override fun `$init`() {
        this.`$watch`<String>("src", fun(newValue, oldValue){
            if (newValue == "") {
                return;
            }
            this.setImage(newValue);
        }
        );
        this.`$watch`<Number>("width", fun(newValue, oldValue){
            this.setImage(this.src);
        }
        );
        this.`$watch`<Number>("height", fun(newValue, oldValue){
            this.setImage(this.src);
        }
        );
    }
    companion object {
        var name = "x-svg-u";
        init {
            io.dcloud.uniapp.UniSDKEngine.registerUniComponent("x-svg-u", XSvgUComponent::class.java, XSvgUElement::class.java);
        }
    }
}
open class XSvgUElement : DomNode {
    constructor(data: INodeData, pageNode: PageNode) : super(data, pageNode) ;
    open fun setImage(newval: String) {
        return (getComponent() as XSvgUComponent).setImage(newval);
    }
}
