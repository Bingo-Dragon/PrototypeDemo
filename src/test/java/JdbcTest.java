/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: JdbcTest
 * Author:   bingo
 * Date:     2018/6/19 22:16
 * Description: jdbc测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static com.bingo.springmvc.util.FileUtils.getNewFileName;

/**
 * 〈一句话功能简述〉<br>
 * 〈jdbc测试〉
 *
 * @author bingo
 * @create 2018/6/19
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class JdbcTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public  void testConnection(){
        try {
            Connection conn = dataSource.getConnection();
            System.out.println("-----------bingo.com-----------conn值=" + conn + "," + "当前类=JdbcTest.testConnection()");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}