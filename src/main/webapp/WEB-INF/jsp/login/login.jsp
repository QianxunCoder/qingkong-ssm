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
    <title>登录</title>
</head>
<body>
账户名：<input type="text" id="username"/>
密码：<input type="password" id="password"/>
<input type="submit" id="login_submit" value="登录">
<script>
    $(function (){
        $("#login_submit").click(function () {
            var username = $("#username").val();
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
