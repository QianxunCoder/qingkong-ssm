<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" import="java.util.*" %>
<%@include file="common/common.jsp"%>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>首页</h1>
<button onclick="toLoginPage()">去登录</button>
<button>注册</button>
<script>
    function toLoginPage() {
        window.location.href = "${pageContext.request.contextPath}/login"
    }
</script>
</body>
</html>