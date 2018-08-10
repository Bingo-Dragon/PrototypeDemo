/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UtilsTest
 * Author:   bingo
 * Date:     2018/7/12 23:11
 * Description: 工具类测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import org.junit.Test;

import static com.bingo.springmvc.util.FileUtils.getNewFileName;

/**
 * 〈一句话功能简述〉<br>
 * 〈工具类测试〉
 *
 * @author bingo
 * @create 2018/7/12
 * @since 1.0.0
 */
public class UtilsTest {

    @Test
    public void testFileUtils(){
       String newName =  getNewFileName("abc.text",5,true);
        System.out.println("-----------bingo.com-----------newName值=" + newName + "," + "当前类=UtilsTest.testFileUtils()");
    }


}