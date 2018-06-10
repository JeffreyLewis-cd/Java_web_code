<%--
  Created by IntelliJ IDEA.
  User: JiangFan6
  Date: 2018/6/5
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>保存Cookie</h1>

<%
    Cookie cookie1=new Cookie("aaa","AAA");
    cookie1.setMaxAge(60*60);
    response.addCookie(cookie1);

    Cookie cookie2=new Cookie("bbb","BBB");
    response.addCookie(cookie2);



%>


</body>
</html>
