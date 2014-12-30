/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 */
package com.glacier.basic.util;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @ClassName: DESUtils 
 * @Description: TODO(DES加密解密负责类) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:14:04
 */
@SuppressWarnings("restriction")
public class DESUtils {
    private static Key key;

    private static String KEY_STR = "GlacierSecureKey";
    static {
        try {
            KeyGenerator generator = KeyGenerator.getInstance("DES");
            generator.init(new SecureRandom(KEY_STR.getBytes()));
            key = generator.generateKey();
            generator = null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 对str进行DES加密
     * 
     * @param str
     * @return
     */
    public static String getEncryptString(String str) {
        BASE64Encoder base64en = new BASE64Encoder();
        try {
            byte[] strBytes = str.getBytes("UTF8");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptStrBytes = cipher.doFinal(strBytes);
            return base64en.encode(encryptStrBytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 对str进行DES解密
     * 
     * @param str
     * @return
     */
    public static String getDecryptString(String str) {
        BASE64Decoder base64De = new BASE64Decoder();
        try {
            byte[] strBytes = base64De.decodeBuffer(str);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decryptStrBytes = cipher.doFinal(strBytes);
            return new String(decryptStrBytes, "UTF8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    
    public static void main(String[] args) {
        //System.out.println(DESUtils.getEncryptString("rems"));
        //System.out.println(DESUtils.getEncryptString("rems123456"));
        //System.out.println(DESUtils.getEncryptString("glacier"));
        //System.out.println(DESUtils.getEncryptString("3628802"));
        //System.out.println(DESUtils.getEncryptString("jdbc:mysql://localhost:3306/authority?useUnicode=true&amp;characterEncoding=UTF-8"));
        //System.out.println(DESUtils.getDecryptString("xW6OiZLo8/kovRmik6fHk1TAEBPOodYYVPBt5+JZ+5v8jHKiOq3+LJwgIT9O7zCkaW0d7GKIidPVPnmwI8p1dKaO9rq1yKpyIKoAz3E4IcA="));
        System.out.println(DESUtils.getEncryptString("2on5oyl3ox"));
        System.out.println(DESUtils.getEncryptString("m3jkhy1mx1h10lzi5mxkkiij4jyz4wkjx03j5250"));
    }
}
