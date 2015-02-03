<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
</head>
<body>
	<form id="fm" method="post">
		<div>用户名：<input type="text" id="userName" name="userName"/></div>
		<div>密码：<input type="password" id="password" name="password"/></div>
		<input type="button" value="登陆" id="submitBtn"/>
	</form>
</body>

<script type="text/javascript">
	$("#submitBtn").click(function(){
		var userNameVal = $("#userName").val();
		var passwordVal = $("#password").val();
		if(userNameVal==""){
			alert("请输入用户名");
			return false;
		}
		if(passwordVal==""){
			alert("请输入密码");
			return false;
		}
		$.ajax({
			type:"POST",
		   	url: "manager-logindo",
		   	data:"userName="+userNameVal+"&userPwd="+passwordVal,
		   	success: function(msg){
		   		var msgObj = JSON.parse(msg);
		   		if(msgObj.type=="ERROR"){
		   			alert(msgObj.reason);
		   			return false;
		   		}
		   		if(msgObj.type=="SUCCESS"){
		   			window.location.href="${pageContext.request.contextPath}/manager/index";
		   		}
		   }
		});
	});
</script>
</html>