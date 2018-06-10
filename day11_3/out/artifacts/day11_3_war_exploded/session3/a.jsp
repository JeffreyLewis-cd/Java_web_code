<%--
  Created by IntelliJ IDEA.
  User: JiangFan6
  Date: 2018/6/8
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/day11_3/AServlet;JSESSIONID=<%=session.getId()%>">点击这里1</a>
<a href="/day11_3/AServlet;JSESSIONID=<%=session.getId()%>">点击这里2</a>
<a href="/day11_3/AServlet;JSESSIONID=<%=session.getId()%>">点击这里3</a>
<%
    out.println(response.encodeRedirectURL("/day11_3/AServlet"));
%>

</body>
</html>
