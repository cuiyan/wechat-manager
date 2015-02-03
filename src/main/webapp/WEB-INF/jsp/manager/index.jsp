<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>
<style type="text/css">
#top{
width: 100%;
background-color: green;
height:200px;
}
#navigation{
width: 20%;
float: left;
height: 800px;
background-color: #ccc;
}
#content{
width: 80%;
float: right;
height: 800px;
background-color: #eee;
}
</style>
</head>
<body>
<div id="top">
	<ul>
		<li>
		<a href="">活动管理</a>
		</li>
	</ul>
</div>
<div id="navigation">
	<ul>
		<li>
			<a id="queryAppointment" href="#">预约查看</a>
		</li>
	</ul>
</div>
<div id="content">
	欢迎使用后台管理系统
</div>
</body>

<script type="text/javascript">
// $("#queryAppointment").click(function(){
// 	$.ajax({
// 		url: "queryAppointment",
// 	   	success: function(msg){
	   		
// 	   }
// 	});
// });
</script>
</html>