<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>预约信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/appointment/getinfodo">
姓名：<input type="text" name="babyName" id="babyName"><br>
年龄：<input type="text" name="birthday" id="birthday"><br>
联系电话<input type="text" name="telephone" id="telephone"><br>
获取途径<br>
<input type="checkbox" name="listenWay">网页<br>
<!-- <input type="checkbox" name="listenWay">朋友推荐<br> -->
<!-- <input type="checkbox" name="listenWay">广告<br> -->
备注：<input type="text" name="remark" id="remark"><br>
<input type="submit" value="提交">
</form>
</body>
</html>