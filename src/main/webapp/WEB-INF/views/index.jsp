<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 3:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>index.jsp</h2>
<a href="findAll">list</a><br>
<a href="login-form">login</a><br>
<a href="main">main</a><br>
<a href="save-form">save</a><br>

로그인 회원 정보: ${loginMember}<br>
세션에 담은 memberId: ${sessionScope.loginMemberId}<br>
세션에 담은 id:${sessionScope.loginMemberId}
<%--로그아웃은 세션에 담은 데이터를 지우는 것이다.--%>
</body>
</html>
