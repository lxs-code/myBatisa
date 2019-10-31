<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 15193
  Date: 2019/10/14
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@include file="head.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>书本修改</h1>
<f:form modelAttribute="book" action="${zxc}/bk/edit" method="post">
    ID<f:input path="bookId"/>
    名称   <f:input path="bookName"/><br>
    价格 <f:input path="bookPrice"/><br>
    简介 <f:input path="bookBrief"/><br>

<input type="submit" value="修改">

</f:form>
</body>
</html>
