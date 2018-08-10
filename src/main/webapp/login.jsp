<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path=request.getContextPath();
String basePath=request.getScheme()+"//"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="Keywords" content="登陆">
    <meta name="Description" content="网站介绍">
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/iconfont.css">
    <link rel="stylesheet" href="css/reg.css">
</head>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-validate.js"></script>
<script type="text/javascript" src="js/jquery.md5.js"></script>
<body>
<div id="ajax-hook"></div>
<div class="wrap">
    <div class="wpn">
        <div class="form-data pos">
            <a href=""><img src="images/logo.png" class="head-logo"></a>
            <div class="change-login">
                <p class="account_number on">账号登录</p>
                <p class="message">短信登录</p>
            </div>
            <div class="form1">
                <p class="p-input pos">
                    <label for="num">手机号/用户名/UID/邮箱</label>
                    <input type="text" id="num">
                    <span class="tel-warn num-err hide"><em>账号或密码错误，请重新输入</em><i class="icon-warn"></i></span>
                </p>
                <p class="p-input pos">
                    <label for="pass">请输入密码</label>
                    <input type="password" style="display:none"/>
                    <input type="password" id="pass" autocomplete="new-password">
                    <span class="tel-warn pass-err hide"><em>账号或密码错误，请重新输入</em><i class="icon-warn"></i></span>
                </p>
                <p class="p-input pos code hide">
                    <label for="veri">请输入验证码</label>
                    <input type="text" id="veri">
                    <img src="">
                    <span class="tel-warn img-err hide"><em>账号或密码错误，请重新输入</em><i class="icon-warn"></i></span>
                    <!-- <a href="javascript:;">换一换</a> -->
                </p>
            </div>
            <div class="form2 hide">
                <p class="p-input pos">
                    <label for="num2">手机号</label>
                    <input type="number" id="num2">
                    <span class="tel-warn num2-err hide"><em>账号或密码错误</em><i class="icon-warn"></i></span>
                </p>
                <p class="p-input pos">
                    <label for="veri-code">输入验证码</label>
                    <input type="number" id="veri-code">
                    <a href="javascript:;" class="send">发送验证码</a>
                    <span class="time hide"><em>120</em>s</span>
                    <span class="tel-warn error hide">验证码错误</span>
                </p>
            </div>
            <div class="r-forget cl">
                <a href="WEB-INF/views/demoRegister/reg.html" class="z">账号注册</a>
                <a href="WEB-INF/views/demoRegister/getpass.html" class="y">忘记密码</a>
            </div>
            <button class="lang-btn off log-btn" id ="btn_log">登录</button>
            <div class="third-party">
                <a href="#" class="log-qq icon-qq-round"></a>
                <a href="#" class="log-qq icon-weixin"></a>
                <a href="#" class="log-qq icon-sina1"></a>
            </div>
            <p class="right">Powered by bingo © 2018</p>
        </div>
    </div>
</div>
<script type="text/javascript" src="js/agree.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript" src="js/msgTip.js"></script>

</div>
</body>

</html>