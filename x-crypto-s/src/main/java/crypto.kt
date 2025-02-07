package uts.sdk.modules.utsXcryptoS

import java.security.*
import java.security.spec.X509EncodedKeySpec
import java.security.spec.PKCS8EncodedKeySpec
import javax.crypto.*
import javax.crypto.spec.SecretKeySpec
import javax.crypto.spec.IvParameterSpec
import java.util.Base64
import java.nio.charset.Charset
import io.dcloud.uts.console

// 定义支持的输出长度枚举
enum class OutputLength(val length: Int) {
	LENGTH_16(8),  // 8 bytes = 16 hex chars
	LENGTH_32(16), // 16 bytes = 32 hex chars
	LENGTH_64(32)  // 32 bytes = 64 hex chars
}



class UniversalCryptoHelper {
	companion object {
		// MD5 Encryption ,32位加密
		fun md5(input: String): String {
		    val md = MessageDigest.getInstance("MD5")
		    val digest = md.digest(input.toByteArray())
		    return digest.joinToString("") { "%02x".format(it) }
		}
		
		// BASE64 Encoding and Decoding
		fun base64Encode(input: String): String = Base64.getEncoder().encodeToString(input.toByteArray())
		fun base64Decode(input: String): String = String(Base64.getDecoder().decode(input))
		
		// HMAC with SHA-256
		fun hmacSha256(key: String, data: String): String {
		    val secretKey = SecretKeySpec(key.toByteArray(), "HmacSHA256")
		    val mac = Mac.getInstance("HmacSHA256")
		    mac.init(secretKey)
		    val hash = mac.doFinal(data.toByteArray())
		    return hash.joinToString("") { "%02x".format(it) }
		}
		
		// SHA-1 and SHA-256 Hashing
		fun sha1(input: String): String {
		    val md = MessageDigest.getInstance("SHA-1")
		    val digest = md.digest(input.toByteArray())
		    return digest.joinToString("") { "%02x".format(it) }
		}
		
		fun sha256(input: String): String {
		    val md = MessageDigest.getInstance("SHA-256")
		    val digest = md.digest(input.toByteArray())
		    return digest.joinToString("") { "%02x".format(it) }
		}
		fun generateAesKey(key: String): ByteArray {
		    val fixedKey = key.padEnd(16, '0') // 填充到 16 字节（128 位）
		    return fixedKey.toByteArray().copyOf(16) // 截断或扩展为 16 字节
		}
		/**
		 * 返回编码为base64,cbc或者ecb,填充这pkcs5/pkdcs7,密钥和iv偏移均为16位
		 */
		fun aesEncrypt(input: String, key: String,mode:String,iv: String? = null): String {
			if(mode=="ECB"){
				val secretKey = SecretKeySpec(generateAesKey(key), "AES")
				val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
				cipher.init(Cipher.ENCRYPT_MODE, secretKey)
				val encrypted = cipher.doFinal(input.toByteArray())
				return Base64.getEncoder().encodeToString(encrypted)
			}
			// cbc
			val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
			val keySpec = SecretKeySpec(generateAesKey(key), "AES")
			
			val ivSpec = IvParameterSpec(iv!!.toByteArray())
			cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec)
			val encrypted = cipher.doFinal(input.toByteArray())
			return Base64.getEncoder().encodeToString(encrypted)
		}
		/**
		 * 加密文本为base64,cbc或者ecb,填充这pkcs5/pkdcs7,密钥和iv偏移均为16位,返回字符串.
		 */
		fun aesDecrypt(input: String, key: String,mode:String,iv: String? = null): String {
			if(mode=="ECB"){
				val secretKey = SecretKeySpec(generateAesKey(key), "AES")
				val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
				cipher.init(Cipher.DECRYPT_MODE, secretKey)
				val decrypted = cipher.doFinal(Base64.getDecoder().decode(input))
				return String(decrypted)
			}
		   // cbc
		   val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
		   val keySpec = SecretKeySpec(generateAesKey(key), "AES")
		   val ivSpec = IvParameterSpec(iv!!.toByteArray())
		   cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec)
		   val decodedBytes = Base64.getDecoder().decode(input)
		   val decrypted = cipher.doFinal(decodedBytes)
		   return String(decrypted)
			
		}
	
		fun generateDesKey(key: String): ByteArray {
		    // 确保密钥长度为24字节，不足时用0填充，过长时截断
		    val keyBytes = key.toByteArray()
		    val paddedKey = ByteArray(24)
		    if (keyBytes.size < 24) {
		        System.arraycopy(keyBytes, 0, paddedKey, 0, keyBytes.size)
		    } else {
		        System.arraycopy(keyBytes, 0, paddedKey, 0, 24)
		    }
		    return paddedKey
		}
		
		// DES Encryption and Decryption
		fun desEncrypt(input: String, key: String,mode:String,iv: String? = null): String {
		    val secretKey = SecretKeySpec(generateDesKey(key), "DESede")
			val cipher: Cipher = when (mode) {
				"ECB" -> Cipher.getInstance("DESede/ECB/PKCS5Padding")
				"CBC" -> Cipher.getInstance("DESede/CBC/PKCS5Padding")
				else -> throw IllegalArgumentException("Unsupported mode: $mode")
			}
		
			if (mode == "CBC" && iv == null) {
				throw IllegalArgumentException("IV must not be null for CBC mode")
			}
		
			if (mode == "CBC") {
				val ivSpec = IvParameterSpec(iv!!.toByteArray())
				cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec)
			} else {
				cipher.init(Cipher.ENCRYPT_MODE, secretKey)
			}
		
			val encrypted = cipher.doFinal(input.toByteArray())
			return Base64.getEncoder().encodeToString(encrypted)
		}
		
		fun desDecrypt(input: String, key: String,mode:String,iv: String? = null): String {
		    val secretKey = SecretKeySpec(generateDesKey(key), "DESede")
			val cipher: Cipher = when (mode) {
				"ECB" -> Cipher.getInstance("DESede/ECB/PKCS5Padding")
				"CBC" -> Cipher.getInstance("DESede/CBC/PKCS5Padding")
				else -> throw IllegalArgumentException("Unsupported mode: $mode")
			}
		
			if (mode == "CBC" && iv == null) {
				throw IllegalArgumentException("IV must not be null for CBC mode")
			}
		
			if (mode == "CBC") {
				val ivSpec = IvParameterSpec(iv!!.toByteArray())
				cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec)
			} else {
				cipher.init(Cipher.DECRYPT_MODE, secretKey)
			}
		
			val decrypted = cipher.doFinal(Base64.getDecoder().decode(input))
			return String(decrypted)
		}
		
		// RSA Key Pair Generation
		fun generateRsaKeyPair(): KeyPair {
		    val keyGen = KeyPairGenerator.getInstance("RSA")
		    keyGen.initialize(2048)
		    return keyGen.generateKeyPair()
		}
		
		// Convert String to PublicKey
		fun stringToPublicKey(publicKeyStr: String): PublicKey {
		   val keyBytes = Base64.getDecoder().decode(publicKeyStr.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""))
		   val keySpec = X509EncodedKeySpec(keyBytes)
		   val keyFactory = KeyFactory.getInstance("RSA")
		   return keyFactory.generatePublic(keySpec)
		}
		
		// Convert String to PrivateKey
		fun stringToPrivateKey(privateKeyStr: String): PrivateKey {
		    val keyBytes = Base64.getDecoder().decode(privateKeyStr.replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", ""))
			val keySpec = PKCS8EncodedKeySpec(keyBytes)
			val keyFactory = KeyFactory.getInstance("RSA")
			return keyFactory.generatePrivate(keySpec)
		}
		
		// 默认是PKCS1，填充：（OAEP）RSA/ECB/OAEPWithSHA-1AndMGF1Padding或者（PKCS1）RSA/ECB/PKCS1Padding
		fun rsaEncrypt(input: String, publicKeyStr: String): String {
		     val publicKey = stringToPublicKey(publicKeyStr)
			val cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding")
			cipher.init(Cipher.ENCRYPT_MODE, publicKey)
			val encrypted = cipher.doFinal(input.toByteArray())
			return Base64.getEncoder().encodeToString(encrypted)
		}
		// input是base64,PKCS1填充生成的加密内容
		fun rsaDecrypt(input: String, privateKeyStr: String): String {
		    val privateKey = stringToPrivateKey(privateKeyStr)
			val cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding")
			cipher.init(Cipher.DECRYPT_MODE, privateKey)
			val decrypted = cipher.doFinal(Base64.getDecoder().decode(input))
			return String(decrypted)
		}
		
		
		
		
		fun rc4Init(key: ByteArray): ByteArray {
		    val s = ByteArray(256) { it.toByte() }
		    var j = 0
		    
		    for (i in 0..255) {
		        j = (j + s[i].toInt() + key[i % key.size].toInt() and 0xFF) and 0xFF
		        val temp = s[i]
		        s[i] = s[j]
		        s[j] = temp
		    }
		    
		    return s
		}
		
		fun rc4Process(data: ByteArray, key: ByteArray, outputLength: OutputLength): ByteArray {
		    val s = rc4Init(key)
		    val result = ByteArray(outputLength.length) // 使用指定的字节长度
		    var i = 0
		    var j = 0
		    
		    for (n in result.indices) {
		        i = (i + 1) and 0xFF
		        j = (j + s[i].toInt() and 0xFF) and 0xFF
		        
		        val temp = s[i]
		        s[i] = s[j]
		        s[j] = temp
		        
		        val t = (s[i].toInt() + s[j].toInt() and 0xFF) and 0xFF
		        val k = s[t].toInt() and 0xFF
		        
		        result[n] = if (n < data.size) {
		            (data[n].toInt() xor k).toByte()
		        } else {
		            k.toByte()
		        }
		    }
		    
		    return result
		}
		//输出是hex字符串，密钥是8位字符
		fun rc4Encrypt(data: String, key: String): String {
		    val dataBytes = data.toByteArray()
		    val keyBytes = key.toByteArray()
		    val encrypted = rc4Process(dataBytes, keyBytes, OutputLength.LENGTH_16)
		    return encrypted.joinToString("") { "%02x".format(it) }
		}
		//输入encryptedHex是hex字符串,返回是string，密钥是8位字符
		fun rc4Decrypt(encryptedHex: String, key: String): String {
		    val encryptedBytes = encryptedHex.chunked(2)
		        .map { it.toInt(16).toByte() }
		        .toByteArray()
		    val keyBytes = key.toByteArray()
		    val decrypted = rc4Process(encryptedBytes, keyBytes, OutputLength.LENGTH_16)
		    return decrypted.toString(Charset.defaultCharset()).trim('\u0000')
		}
		
		
		
		
	}
}
