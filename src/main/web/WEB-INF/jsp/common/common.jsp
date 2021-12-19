<%--
  Created by IntelliJ IDEA.
  User: qingkong
  Date: 2021/12/19
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %>
<html>
<head>
    <script src="../../../js/jquery-3.6.0.min.js"></script>
    <script src="../../../js/bootstrap.min.js"></script>
    <link href="../../../css/bootstrap.min.css" rel="stylesheet">
    <script>
        <%--通用的方法--%>
        function checkEmpty(id,name){
            var value = $("#" + id).val();
            if (value.length === 0){
                alert(name + "不能为空");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>

</body>
</html>
