<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>main.jsp</h2>
    로그인 회원 정보: ${loginMember}<br>
    세션에 담은 memberId: ${sessionScope.loginMemberId}<br>
    세션에 담은 id:${sessionScope.loginMemberId}<br>
    <a href="/">index로 이동</a>
</body>
</html>
