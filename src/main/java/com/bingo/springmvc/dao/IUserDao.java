/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: IUserDao
 * Author:   bingo
 * Date:     2018/6/9 15:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bingo.springmvc.dao;

import com.bingo.springmvc.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author bingo
 * @create 2018/6/9
 * @since 1.0.0
 */
public interface IUserDao {

    User checkLogin(@Param("username") String  username ,@Param("password") String password);

}