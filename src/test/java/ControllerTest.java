/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ControllerTest
 * Author:   bingo
 * Date:     2018/6/19 23:42
 * Description: 控制层测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import com.bingo.springmvc.controller.LoginController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static com.bingo.springmvc.util.FileUtils.getNewFileName;

/**
 * 〈一句话功能简述〉<br>
 * 〈控制层测试〉
 *
 * @author bingo
 * @create 2018/6/19
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class ControllerTest {

    private MockMvc mockMvc;
    @Autowired
    private LoginController loginController;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();
    }

    @Test
    public void testController() throws Exception {
        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post("/login/login").param("username","bingo"));
        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println("=====客户端获得反馈数据:" + result);
    }

    @Test
    public  void testGetnewFileName(){
        String newName = getNewFileName("acb.text",5,true);
        System.out.println("-----------bingo.com-----------newName值=" + newName + "," + "当前类=JdbcTest.testGetnewFileName()");
    }
}