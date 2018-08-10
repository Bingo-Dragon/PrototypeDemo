/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: VigernereEncryption
 * Author:   bingo
 * Date:     2018/6/17 0:17
 * Description: Vigernere加密算法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bingo.springmvc.util;

import com.bingo.springmvc.constant.DailyConstant;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈Vigernere加密算法〉
 *
 * @author bingo
 * @create 2018/6/17
 * @since 1.0.0
 */
@Component
public class VigernereEncryption {

    public static String vigernereEncryption(String word ,String key) throws Exception {
        //返回加密密文
        String encryptionWord="";
        //只能是长度500以内的小写字母
        if(confrimStr(word)&&confrimStr(key)) {
            for (int i = 0;i< word.length();i++){
                int j = i%(key.length());
                //-97-97 = -194 将ascii转换为数字0-25,然后取26模，+97变字母
                char c = (char)(((int)word.charAt(i)+ (int)key.charAt(j)-194)%26+97);
                encryptionWord+=c;
            }
        }
        else{
            throw new Exception("只能输入500个以内小写字母");
        }
        return encryptionWord;
    }

    public static String vigernereDecrypt(String ciphertext ,String key) throws Exception{
        //返回解密明文
        String plaintext="";
        //只能是长度500以内的小写字母
        if(confrimStr(ciphertext)&&confrimStr(key)) {
            for (int i = 0;i< ciphertext.length();i++){
                int j = i%(key.length());
                //-97-97 = -194 将ascii转换为数字0-25,然后取26模，+97变字母
                char c = (char)((((int)ciphertext.charAt(i)+26)- key.charAt(j))%26+97);
                plaintext+=c;
            }
        }
        else{
            throw new Exception("只能输入500个以内小写字母");
        }
        return plaintext;
    }

    public static boolean confrimStr(String str){
        if(str.matches(DailyConstant.INPUT_REX)){
            return true;
        }
        else {
            return false;
        }
    }

}