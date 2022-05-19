<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 3:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="post">
    <input type="text" name="memberId"><br>
    <input type="text" name="memberPassword"><br>
    <input type="text" name="memberName"><br>
    <input type="number" name="memberAge"><br>
    <input type="text" name="memberPhone"><br>
    <input type="submit" value="회원가입">
</form>
</body>
</html>
