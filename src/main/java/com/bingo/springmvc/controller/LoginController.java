/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LoginController
 * Author:   bingo
 * Date:     2018/6/14 14:47
 * Description: 简单的登陆
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bingo.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.bingo.springmvc.entity.User;
import com.bingo.springmvc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈简单的登陆〉
 *
 * @author bingo
 * @create 2018/6/14
 * @since 1.0.0
 */

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private IUserService userService;

    /**
     * 若在下面的@RequestMapping前面加上@ResponseBody，
     * 若方法是String类型则直接返回的是字符串，不会跳转到该字符串的路径jsp文件
     *
     * 所以要想跳转到某一jsp页面，不能加上@ResponseBody
     * 这个@ResponseBody适合ajax返回的数据
     *
     */

        /**
     * 在控制层不加@ResponseBody的情况下，return值默认是转发到某路径,不会显示转发路径，显示的是未转发前的路径
     * 若要重定向，加上redirect:这里默认是当前命名空间的转发，要跳转到另一个control层，需要返回上一级../
     *
        eg:
        return "redirect:../index";

        注意：
        转发不会显示转发路径，显示的是未转发前的路径
     *  重定向显示的是跳转之后的路径
     */
        @RequestMapping("login")
        @ResponseBody
        public String login(HttpServletRequest request,HttpServletResponse response){
            Map<String, Object> map = userService.loginValid(request.getParameter("userinp"), request.getParameter("password"), request);
            return JSON.toJSONString(map,true);
        }


}