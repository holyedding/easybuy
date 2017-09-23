<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"  isELIgnored="false"%>
<%
	String context = request.getContextPath();// /dt41_javaweb2
	String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+context+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=path %>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>
<body>
	<form action="FileUploadServlet" method="post" enctype="multipart/form-data">
	用户名<input type="text" value="" name="username"><br>
	照片上传<input type="file" name="upload"><br> 
	照片上传<input type="file" name="upload"><br>
	照片上传<input type="file" name="upload"><br>
	照片上传<input type="file" name="upload"><br>
	<input type="submit" value="提交">
	</form>
</body>
</html>