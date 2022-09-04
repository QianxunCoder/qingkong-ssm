<%--
  Created by IntelliJ IDEA.
  User: qingkong
  Date: 2021/12/19
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" import="java.util.*" %>
<%@include file="/common/common.jsp" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="${pageContext.request.contextPath}/js/jquery-3.6.0.min.js"></script>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <style>
        div.simpleLogo{
            padding: 32px 0px;
        }
        img.loginBackgroundImg{
            display: block;
            margin: 0px auto;
        }
        div.loginSmallDiv{
            background-color: white;
            position: absolute;
            right: 80px;
            top: 180px;
            width: 350px;
            height: 400px;
            padding: 60px 25px 80px 25px;
        }
        div.login_acount_text{
            color: #3C3C3C;
            font-size: 16px;
            font-weight: bold;
        }
        div.loginInput{
            border: 1px solid #CBCBCB;
            margin: 20px 0px;
        }
        div.loginInput span.loginInputIcon{
            margin: 0px;
            background-color: #CBCBCB;
            width: 40px;
            height: 40px;
            display:inline-block;
        }
        span.loginInputIcon span.glyphicon{
            font-size: 22px;
            position: relative;
            left: 9px;
            top: 9px;
            color: #606060;
        }
        div.loginInput input{
            display: inline-block;
            border: 0px solid transparent;
            width: 244px;
            height: 30px;
            position: relative;
            left: 6px;
            top: 6px;
        }
        body{
            font-size: 12px;
            font-family: Arial;
        }
        a{
            color:#999;
        }
        a:hover{
            text-decoration:none;
            color: #C40000;
        }
        button.redButton{
            color: white;
            background-color: #C40000;
            font-size: 14px;
            font-weight: bold;
        }
    </style>
    <title>登录</title>
</head>
<body>
<div id="loginDiv">
    <div class="simpleLogo">
        <img src="https://how2j.cn/tmall/img/site/simpleLogo.png">
    </div>
    <img src="https://how2j.cn/tmall/img/site/loginBackground.png" class="loginBackgroundImg" id="loginBackgroundImg">
    <div class="loginSmallDiv" id="loginSmallDiv">
        <div class="login_acount_text">账户登录</div>
        <div class="loginInput ">
                <span class="loginInputIcon ">
                    <span class=" glyphicon glyphicon-user"></span>
                </span>
            <input type="text" placeholder="手机/会员名/邮箱" name="name" id="name">
        </div>
        <div class="loginInput ">
                <span class="loginInputIcon ">
                    <span class=" glyphicon glyphicon-lock"></span>
                </span>
            <input type="password" placeholder="密码" name="password" id="password">
        </div>
        <div>
            <a href="#nowhere" class="notImplementLink">忘记登录密码</a>
            <a class="pull-right" href="#nowhere">免费注册</a>
        </div>
        <div style="margin-top:20px">
            <button type="button" class="btn btn-block redButton">登录</button>
        </div>
    </div>
</div>
<script>
    $(function (){
        $(".btn btn-block redButton").click(function () {
            var username = $("#name").val();
            var password = $("#password").val();
            $.ajax({
                url:  "${pageContext.request.contextPath}/login",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify({
                    "username": username,
                    "password": password
                }),
                success: function (result) {

                }
            })
        })
    })
</script>
</body>
</html>
