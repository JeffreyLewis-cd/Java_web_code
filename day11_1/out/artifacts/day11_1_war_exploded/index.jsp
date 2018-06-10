<%--
  Created by IntelliJ IDEA.
  User: JiangFan6
  Date: 2018/6/4
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%--jsp指令，特殊的标签--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--java代码的片段--%>
<%
  String path=request.getContextPath();//获取项目名称
  String basePath=request.getScheme()+"://"+request.getServerName()+":"+
      request.getServerPort()+path+"/";
  /*http://localhost:8080/day11_1/*/


%>
<html>
  <head>
    <%--向页面输出basePath--%>
    <base href="<%=basePath%>">
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <%
    int a=99;
  %>
  <%
    out.println(a);
  %>
  <br/>
  <%=663
  %>

  <%!
    int a=100;
    public void func1(){
      System.out.println(a);
    }
  %>

  <%
    out.print(this.a++);
//    func1();
  %>
  </body>
</html>
