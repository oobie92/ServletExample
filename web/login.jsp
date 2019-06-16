<%--
  Created by IntelliJ IDEA.
  User: Diego Mendez
  Date: 16/06/19
  Time: 04:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <title>Login</title>
</head>
<body>
<%!int i = 0;%>
<form method="get" action="./ServletLogin">
    <table>
        <tr>
            <td><label>User:</label></td>
            <td><input type="text" name="user"></td>
            <td><label>Password:</label></td>
            <td><input type="password" name="password"></td>
            <td><label>Enterprise:</label></td>
            <td><input type="text" name="enterprise"></td>
        </tr>
        <tr>
            <td><input type="submit" value="submit"></td>
        </tr>
    </table>
        <%
			for (i = 0; i < 10; i++) {
		%>
    <label>Hi <%=i%></label>
        <%
			}
		%>
</body>
</html>
