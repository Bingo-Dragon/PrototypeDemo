/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: IUserService
 * Author:   bingo
 * Date:     2018/6/9 14:52
 * Description: 用户信息service接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bingo.springmvc.service;

import com.bingo.springmvc.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.soap.Addressing;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户信息service接口〉
 *
 * @author bingo
 * @create 2018/6/9
 * @since 1.0.0
 */
public interface IUserService {

    /**
    * @Author:bingo
    * @Description:获取用户信息
    * @Date:15:05-2018/6/9
    * @return:User
    */

    public boolean checkName(String username);

    Map<String, Object> loginValid(String username, String password,HttpServletRequest request);

    void regist(User user);
}