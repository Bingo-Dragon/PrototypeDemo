/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   bingo
 * Date:     2018/6/9 15:07
 * Description: 用户信息实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bingo.springmvc.service.impl;

import com.bingo.springmvc.constant.DailyConstant;
import com.bingo.springmvc.dao.IUserDao;
import com.bingo.springmvc.entity.User;
import com.bingo.springmvc.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户信息实现类〉
 *
 * @author bingo
 * @create 2018/6/9
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;
   Logger logger =  LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public boolean checkName(String username) {
        return false;
    }

    @Override
    public Map<String, Object> loginValid(String username, String password, HttpServletRequest request){
        Map<String, Object> map=new HashMap<>(1);
        User user = null;
        if(username!=null && password!=null){
             user = iUserDao.checkLogin(username,password);
             logger.info("username:{} and password:{}",username,password);
        }
        if(user!=null){
            map.put("code",0);
            request.getSession().setAttribute("user", user);
        }
        else{
            map.put("code",DailyConstant.STATUS_FAILURE);
        }
        return map;
    }

    @Override
    public void regist(User user) {

    }


}