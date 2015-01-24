<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="HandheldFriendly" content="True">
<meta name="MobileOptimized" content="320">
<meta name="viewport" content="initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>课程列表</title>

<script src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/app-style.css">

</head>
<body>
<div class="context_box">
	<div class="warp_box">
		<div class="article_title">课程列表</div>
		<div class="article">
		<p>周六：</p>
		<table>
			<tr>
				<th width="50%">8:00-10:00</th>
				<td>语文</td>
			</tr>
			<tr>
				<th>10：00-12:00</th>
				<td>英语</td>
			</tr>
			<tr>
				<th>14：00-16:00</th>
				<td>数学</td>
			</tr>
			<tr>
				<th>16：00-18:00</th>
				<td>书法</td>
			</tr>
		</table>
		<p>周日：</p>
		<table>
			<tr>
				<th width="50%">8:00-10:00</th>
				<td>语文</td>
			</tr>
			<tr>
				<th>10：00-12:00</th>
				<td>英语</td>
			</tr>
			<tr>
				<th>14：00-16:00</th>
				<td>数学</td>
			</tr>
			<tr>
				<th>16：00-18:00</th>
				<td>书法</td>
			</tr>
		</table>
		</div>
	</div>
	<jsp:include page="../include/footer.jsp"/>
</div>
</body>
</html>