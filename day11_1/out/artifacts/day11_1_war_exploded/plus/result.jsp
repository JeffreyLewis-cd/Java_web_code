<%--
  Created by IntelliJ IDEA.
  User: JiangFan6
  Date: 2018/6/4
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="padding:50px">
<%
    Integer result =(Integer) request.getAttribute("result");

%>
<%="     "+result
%>

</body>
</html>
