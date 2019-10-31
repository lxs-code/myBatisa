<%--
  Created by IntelliJ IDEA.
  User: 15193
  Date: 2019/10/16
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>文件上传</h1>

<form action="<%=request.getContextPath()%>/upload" method="post" enctype="multipart/form-data">
<input type="file" name="img">
<input type="submit" value="ok">

</form>






<form action="<%=request.getContextPath()%>/upload1" method="post" enctype="multipart/form-data">
    <input type="file" name="imgs">
    <input type="file" name="imgs">
    <input type="file" name="imgs">
    <input type="submit" value="ok">

</form>
</body>
</html>
