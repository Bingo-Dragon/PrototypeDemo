/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: DailyConstant
 * Author:   bingo
 * Date:     2018/6/17 1:06
 * Description: 上课实验常量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bingo.springmvc.constant;

/**
 * 〈一句话功能简述〉<br>
 * 〈上课实验常量〉
 *
 * @author bingo
 * @create 2018/6/17
 * @since 1.0.0
 */
public class DailyConstant {
    //输入验证规则：小写字母
    public static final String INPUT_REX = "[a-z]{1,500}";

    //状态码:错误
    public static final byte STATUS_ERROR = 0;
    //状态码:错误
    public static final byte STATUS_OK = 1;
    //状态码:错误
    public static final byte STATUS_FAILURE = 2;

    //数据流缓冲数组大小
    public static final int KB= 2048 ;


}