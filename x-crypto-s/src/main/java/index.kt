@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.xCryptoS;
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
import uts.sdk.modules.utsXcryptoS.UniversalCryptoHelper;
fun md5(str: String): String {
    return UniversalCryptoHelper.md5(str);
}
fun base64Encode(str: String): String {
    return UniversalCryptoHelper.base64Encode(str);
}
fun base64Decode(str: String): String {
    return UniversalCryptoHelper.base64Decode(str);
}
fun sha256(str: String): String {
    return UniversalCryptoHelper.sha256(str);
}
fun hmacSha256(key: String, data: String): String {
    return UniversalCryptoHelper.hmacSha256(key, data);
}
fun sha1(str: String): String {
    return UniversalCryptoHelper.sha1(str);
}
fun aesEncrypt(key: String, data: String, mode: String = "ECB", iv: String? = null): String {
    console.log(mode, "-");
    return UniversalCryptoHelper.aesEncrypt(data, key, mode, iv);
}
fun aesDecrypt(key: String, data: String, mode: String = "ECB", iv: String? = null): String {
    return UniversalCryptoHelper.aesDecrypt(data, key, mode, iv);
}
fun desEncrypt(key: String, data: String, mode: String = "ECB", iv: String? = null): String {
    return UniversalCryptoHelper.desEncrypt(data, key, mode, iv);
}
fun desDecrypt(key: String, data: String, mode: String = "ECB", iv: String? = null): String {
    return UniversalCryptoHelper.desDecrypt(data, key, mode, iv);
}
fun rsaEncrypt(publicKey: String, data: String): String {
    return UniversalCryptoHelper.rsaEncrypt(data, publicKey);
}
fun rsaDecrypt(privateKey: String, data: String): String {
    return UniversalCryptoHelper.rsaDecrypt(data, privateKey);
}
fun rc4Encrypt(key: String, data: String): String {
    return UniversalCryptoHelper.rc4Encrypt(data, key);
}
fun rc4Decrypt(key: String, data: String): String {
    return UniversalCryptoHelper.rc4Decrypt(data, key);
}
