<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="HandheldFriendly" content="True">
<meta name="MobileOptimized" content="320">
<meta name="viewport"
	content="initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>预约免费体验</title>

<script src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/base.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/app-style.css">

</head>
<body>
	<div class="context_box">
		<div class="warp_box">
			<div class="article_title">预约免费体验</div>
			<form action="getinfodo" method="post">
				<ul>
					<li>
					<p>&nbsp;&nbsp;宝贝姓名:</p>
					<input type="text" name="babyName" id="babyName" placeholder="请输入您的宝贝姓名" class="form-control"></li>
					<li>
					<p>&nbsp;&nbsp;宝贝生日:</p>
					<input type="date" name="birthday" id="birthday" placeholder="宝贝生日" class="form-control" value="2015-01-01"></li>
					<li>
					<p>&nbsp;&nbsp;联系电话:</p>
					<input type="text" name="telephone" id="telephone" placeholder="请输入您的联系电话" class="form-control"></li>
					<li>
					<p>&nbsp;&nbsp;获取途径:</p>
					<p>
					&nbsp;&nbsp;<input type="checkbox" name="listenWay">&nbsp;&nbsp;参加棒贝活动</p>
					<p>&nbsp;&nbsp;<input type="checkbox" name="listenWay">&nbsp;&nbsp;微信</p>
					<p>&nbsp;&nbsp;<input type="checkbox" name="listenWay">&nbsp;&nbsp;棒贝官网</p>
					<p>&nbsp;&nbsp;<input type="checkbox" name="listenWay">&nbsp;&nbsp;团购</p>
					<p>&nbsp;&nbsp;<input type="checkbox" name="listenWay">&nbsp;&nbsp;路过</p>
					</li>
					<li>
					<p>&nbsp;&nbsp;其他信息:</p>
					<input type="text" name="remark" id="remark" placeholder="请留下您想对我们说的话" class="form-control"></li>
					<li><button class="submit_btn">提交</button></li>
				</ul>
			</form>
		</div>
	<jsp:include page="../include/footer.jsp"/>
	</div>

</body>
</html>