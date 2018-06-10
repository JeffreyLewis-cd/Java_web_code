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
<%--登录表单，错误信息--%>
<h1>登录</h1>
<%
    /*读取cookie  uname*/
    String uname="";
    Cookie[] cs= request.getCookies();
    if(null !=cs){
        for(Cookie c:cs){
            if("uname".equals(c.getName())){
                uname=c.getValue();
            }
        }
    }
%>
<%
    String message="";
    String msg=(String)request.getAttribute("msg");
    if(msg!=null){
        message=msg;
    }
%>
<font color="red"><b><%=message%></b></font>
<form action="/day11_3/LoginServlet_url" method="post">
    用户名：<input type="text" name="username" value="<%=uname%>"/><br/>
    密码：<input type="password" name="password"><br/>
    <input type="submit" value="登录">
</form>

</body>
</html>
