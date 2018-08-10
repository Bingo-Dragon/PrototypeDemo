/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: VigernereTest
 * Author:   bingo
 * Date:     2018/6/17 2:07
 * Description: Vigernere 加密算法测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import com.bingo.springmvc.util.VigernereEncryption;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 〈一句话功能简述〉<br>
 * 〈Vigernere 加密算法测试〉
 *
 * @author bingo
 * @create 2018/6/17
 * @since 1.0.0
 */


public class VigernereTest {

    @Test
    public void testVigernere (){
        String ciphertext ="";
        String plaintext = "";
        try {
            ciphertext = VigernereEncryption.vigernereEncryption("explanation", "leg");
            System.out.println("-----------bingo.com----------explanation加密值=" + ciphertext + "," + "当前类=VigernereTest.testVigernere()");
            plaintext = VigernereEncryption.vigernereDecrypt(ciphertext,"leg");
            System.out.println("-----------bingo.com-----------解密值=" + plaintext + "," + "当前类=VigernereTest.testVigernere()");


        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}