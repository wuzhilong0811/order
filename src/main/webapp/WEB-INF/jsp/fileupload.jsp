<%--
  Created by IntelliJ IDEA.
  User: 15274
  Date: 2019/9/3
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath }/file/doUpload" method="post" enctype="multipart/form-data">
        文件：<input type="file" name="file" value="文件">
        <input type="submit" value="提交">
    </form>
</body>
</html>
