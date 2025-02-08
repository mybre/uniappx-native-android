@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xOcrS;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Vibrator;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions;
import com.google.mlkit.vision.text.japanese.JapaneseTextRecognizerOptions;
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
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.extapi.chooseImage as uni_chooseImage;
import io.dcloud.uniapp.extapi.downloadFile as uni_downloadFile;
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading;
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading;
fun vibrator(duriation: Number): Boolean {
    try {
        val context = UTSAndroid.getAppContext() as Context;
        var vb = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator;
        if (vb!!.hasVibrator()) {
            vb!!.vibrate(duriation.toLong());
        } else {
            return false;
        }
    }
     catch (e: Throwable) {
        console.error(e);
    }
    return false;
}
fun chooseImageBuilder(callback: (str: UTSArray<String>, source: UTSArray<String>) -> Unit, langs: String?) {
    var zxd: Number = 0.50;
    uni_chooseImage(ChooseImageOptions(count = 1, success = fun(evt: ChooseImageSuccess) {
        uni_showLoading(ShowLoadingOptions(title = "...", mask = true));
        if (evt.tempFilePaths.length > 0) {
            val imgs = evt.tempFilePaths[0] as String;
            try {
                val decodedPath = UTSAndroid.convert2AbsFullPath(imgs);
                val file = File(decodedPath);
                var image = InputImage.fromFilePath(UTSAndroid.getAppContext() as Context, Uri.fromFile(file));
                var recognizer = TextRecognition.getClient(ChineseTextRecognizerOptions.Builder().build()) as TextRecognizer;
                if (langs == "ja") {
                    recognizer = TextRecognition.getClient(JapaneseTextRecognizerOptions.Builder().build()) as TextRecognizer;
                }
                recognizer.process(image!!).addOnSuccessListener(fun(TextList){
                    var str = utsArrayOf<String>();
                    var sour = utsArrayOf<String>();
                    for(block in resolveUTSKeyIterator(TextList.textBlocks)){
                        for(line in resolveUTSKeyIterator(block.lines)){
                            var texts = "";
                            for(element in resolveUTSKeyIterator(line.elements)){
                                if (element.getConfidence() >= zxd) {
                                    var elementText = element.text as String;
                                    var elementFrame = element.getBoundingBox();
                                    var rect = elementFrame as Rect;
                                    sour.push(JSON.stringify(object : UTSJSONObject() {
                                        var boundingBox = utsArrayOf(
                                            rect.left,
                                            rect.top,
                                            rect.width(),
                                            rect.height()
                                        )
                                        var text = elementText
                                    }));
                                    texts += elementText;
                                }
                            }
                            if (texts != "") {
                                str.push(texts);
                            }
                        }
                    }
                    uni_hideLoading();
                    vibrator(100);
                    callback(str as UTSArray<String>, sour as UTSArray<String>);
                }
                ).addOnFailureListener(fun(e){
                    callback(utsArrayOf<String>(), utsArrayOf<String>());
                }
                );
            }
             catch (e: IOException) {
                callback(utsArrayOf<String>(), utsArrayOf<String>());
            }
        }
    }
    , fail = fun(_) {
        callback(utsArrayOf<String>(), utsArrayOf<String>());
    }
    ));
}
fun downloadUrlImageBuilder(url: String, callback: (str: UTSArray<String>, source: UTSArray<String>) -> Unit, langs: String?) {
    var zxd: Number = 0.50;
    uni_downloadFile(DownloadFileOptions(url = url, success = fun(evt) {
        val contentResolver = UTSAndroid.getAppContext()!!.contentResolver;
        var decodedPath = UTSAndroid.convert2AbsFullPath(evt.tempFilePath);
        try {
            val file = File(decodedPath);
            var image = InputImage.fromFilePath(UTSAndroid.getAppContext() as Context, Uri.fromFile(file));
            var recognizer = TextRecognition.getClient(ChineseTextRecognizerOptions.Builder().build()) as TextRecognizer;
            if (langs == "ja") {
                recognizer = TextRecognition.getClient(JapaneseTextRecognizerOptions.Builder().build()) as TextRecognizer;
            }
            if (image != null) {
                val result = recognizer.process(image!!).addOnSuccessListener(fun(TextList){
                    var str = utsArrayOf<String>();
                    var sour = utsArrayOf<String>();
                    for(block in resolveUTSKeyIterator(TextList.textBlocks)){
                        for(line in resolveUTSKeyIterator(block.lines)){
                            var texts = "";
                            for(element in resolveUTSKeyIterator(line.elements)){
                                if (element.getConfidence() >= zxd) {
                                    var elementText = element.text as String;
                                    var elementFrame = element.getBoundingBox();
                                    var rect = elementFrame as Rect;
                                    sour.push(JSON.stringify(object : UTSJSONObject() {
                                        var boundingBox = utsArrayOf(
                                            rect.left,
                                            rect.top,
                                            rect.width(),
                                            rect.height()
                                        )
                                        var text = elementText
                                    }));
                                    texts += elementText;
                                }
                            }
                            if (texts != "") {
                                str.push(texts);
                            }
                        }
                    }
                    uni_hideLoading();
                    vibrator(100);
                    callback(str as UTSArray<String>, sour);
                }).addOnFailureListener(fun(e){
                    callback(utsArrayOf<String>(), utsArrayOf<String>());
                });
            } else {
                callback(utsArrayOf<String>(), utsArrayOf<String>());
            }
        }
         catch (e: IOException) {
            callback(utsArrayOf<String>(), utsArrayOf<String>());
        }
    }
    , fail = fun(_) {
        callback(utsArrayOf<String>(), utsArrayOf<String>());
    }
    ));
}
fun localFilePathImageBuilder(pathfile: String, callback: (str: UTSArray<String>, source: UTSArray<String>) -> Unit, langs: String?) {
    var zxd: Number = 0.50;
    try {
        var decodedPath = UTSAndroid.convert2AbsFullPath(pathfile);
        val file = File(decodedPath);
        var image = InputImage.fromFilePath(UTSAndroid.getAppContext() as Context, Uri.fromFile(file));
        var recognizer = TextRecognition.getClient(ChineseTextRecognizerOptions.Builder().build()) as TextRecognizer;
        if (langs == "ja") {
            recognizer = TextRecognition.getClient(JapaneseTextRecognizerOptions.Builder().build()) as TextRecognizer;
        }
        if (image != null) {
            val result = recognizer.process(image!!).addOnSuccessListener(fun(TextList){
                var str = utsArrayOf<String>();
                var sour = utsArrayOf<String>();
                for(block in resolveUTSKeyIterator(TextList.textBlocks)){
                    for(line in resolveUTSKeyIterator(block.lines)){
                        var texts = "";
                        for(element in resolveUTSKeyIterator(line.elements)){
                            if (element.getConfidence() >= zxd) {
                                var elementText = element.text as String;
                                var elementFrame = element.getBoundingBox();
                                var rect = elementFrame as Rect;
                                sour.push(JSON.stringify(object : UTSJSONObject() {
                                    var boundingBox = utsArrayOf(
                                        rect.left,
                                        rect.top,
                                        rect.width(),
                                        rect.height()
                                    )
                                    var text = elementText
                                }));
                                texts += elementText;
                            }
                        }
                        if (texts != "") {
                            str.push(texts);
                        }
                    }
                }
                callback(str as UTSArray<String>, sour);
            }).addOnFailureListener(fun(e){
                callback(utsArrayOf<String>(), utsArrayOf<String>());
            });
        } else {
            callback(utsArrayOf<String>(), utsArrayOf<String>());
        }
    }
     catch (e: IOException) {
        callback(utsArrayOf<String>(), utsArrayOf<String>());
    }
}
