<%--
  Created by IntelliJ IDEA.
  User: JiangFan6
  Date: 2018/6/7
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>获取session中的数据</h1>

<%
    String s=(String)session.getAttribute("aaa");
%>

<%=s%>

</body>
</html>
