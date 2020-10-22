<%--
  Created by IntelliJ IDEA.
  User: james
  Date: 2020/10/19
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>emps</title>
</head>
<body>
    this is emps page.
    <c:if test="${e != null}">
        <table border="1" width="80%" align="center">
            <tr>
                <th>eid</th>
                <th>ename</th>
                <th>salary</th>
                <th>manage</th>
            </tr>

            <c:forEach var="o" items="${e}">
                <tr>
                    <td>${o.pid}</td>
                    <td>${o.pname}</td>
                    <td>${o.price}</td>
                    <td><a href="/SsmSpring_war/Emp/getBypid?pid=${o.pid}">update</a> <a href="/SsmSpring_war/Emp/Delete/${o.pid}">delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</body>
</html>
