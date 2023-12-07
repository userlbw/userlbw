<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/11/27
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% List<String> l=new ArrayList<String>();
    l.add("111");
    l.add("222");
    l.add("333");
    for(String s:l){
%>
    <p><%=s%></p>
<%} %>

</body>
</html>
