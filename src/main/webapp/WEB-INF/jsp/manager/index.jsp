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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
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
<div >
	<table id="content">
	
	</table>
</div>
</body>

<script type="text/javascript">
var tab ;
$(function(){
	
	tab = $("#content").datagrid({
		
		
		method: "get",
	    url:'queryAppointment', 
	    fit : true,
		fitColumns : true,
		border : false,
		striped:true,
		idField : 'id',
		pagination:true,
		rownumbers:true,
		pageNumber:1,
		pageSize : 20,
		pageList : [ 10, 20, 30, 40, 50 ],
		singleSelect:true,
	    columns:[[    
			{field:'id',title:'id',hidden:true},  
			{field:'babyName',title:'姓名',sortable:true,width:100},
			{field:'birthday',title:'出生日期',sortable:true,width:100},
	        {field:'telephone',title:'联系电话',sortable:true,width:100},    
	        {field:'createTime',title:'报名日期',sortable:true}
	
	    ]],
	    enableHeaderClickMenu: false,
	    enableHeaderContextMenu: false,
	    enableRowContextMenu: false,
	    toolbar:'#content'
	    
	
	});
});
</script>
</html>