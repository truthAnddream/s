<%--
  Created by IntelliJ IDEA.
  User: zty
  Date: 2020/10/21
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/SsmSpring_war/Emp/UpdateEmp" method="post">
pid:<input type="text" value="${p.pid}" name="pid" /><p/>
    pname:<input type="text" value="${p.pname}" name="pname" /><p/>
    price:<input type="text" value="${p.price}" name="price" /><p/>
    <input type="submit" value="提交" />
</form>
</body>
</html>
