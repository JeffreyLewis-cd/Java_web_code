<%--
  Created by IntelliJ IDEA.
  User: JiangFan6
  Date: 2018/6/7
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录成功！666-22222</h1>
<%
    String username=(String)session.getAttribute("username");
    if(null==username){
        request.setAttribute("msg","您还没有登录，不要冒充领导！");
        request.getRequestDispatcher("/session2/login.jsp").forward(request,response);
        return;
    }
%>
<p>欢迎 <%=session.getAttribute("username")%>领导！ </p>
</body>
</html>
