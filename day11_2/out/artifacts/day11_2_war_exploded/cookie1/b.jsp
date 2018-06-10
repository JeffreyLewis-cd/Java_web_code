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

<h1>获取Cookie</h1>

<%

/*    Cookie[] cookies=request.getCookies();
    if(null != cookies){
        for( Cookie c:cookies){
            out.print(c.getName() + "=" +c.getValue() + "<br/>");
        }
    }*/

Cookie cookie1=new Cookie("aaa","AAA");
cookie1.setMaxAge(0);
response.addCookie(cookie1);

%>


</body>
</html>
