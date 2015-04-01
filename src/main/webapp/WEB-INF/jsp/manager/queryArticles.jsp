<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<div id="content">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/simditor.css" />

<style type="text/css">
    #articleForm{
        margin:0;
        padding:10px 30px;
    }
    .ftitle{
        font-size:14px;
        font-weight:bold;
        padding:5px 0;
        margin-bottom:10px;
        border-bottom:1px solid #ccc;
    }
    .fitem{
        margin-bottom:5px;
    }
    .fitem label{
        display:inline-block;
        width:80px;
    }
    .fitem input{
        width:160px;
    }
</style>
<table class="easyui-datagrid"   id="queryArticles" >
</table>
<div id="toolbar">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="addArticle();">增加</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">修改</a>
</div>
<%--添加文章 begin --%>
<div id="addArticle" class="easyui-dialog"  closed="true" buttons="#dlg-buttons"  style="width:800px;height:620px;padding:10px">
	<div class="ftitle">增加文章</div>
	<form id="articleForm" method="post" novalidate>
		<div class="fitem">
            <label>标题：</label>
            <input name="title" class="easyui-textbox" required="true">
        </div>
        <div>
        	内容：<textarea id="editor" name="content" placeholder="这里输入内容" autofocus></textarea>
        </div>
	</form>
</div>
<div id="dlg-buttons">
       <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveArticle()" style="width:90px">保存</a>
       <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#addArticle').dialog('close')" style="width:90px">取消</a>
</div>
<%--添加文章 end --%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/module.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/hotkeys.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/uploader.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/simditor.min.js"></script>
<script>
	var tab=$("#queryArticles").datagrid({
		url:"${pageContext.request.contextPath}/manager/queryArticles",//加载的URL
		pagination:true,//显示分页
		pageSize:5,//分页大小
		pageList:[5,10,15,20],//每页的个数
		fit:true,//自动补全
		fitColumns:true,
		rownumbers:true,
		toolbar:'#toolbar',
		columns:[[      //每个列具体内容
	              {field:'title',title:'文章标题',width:100},   
	              {field:'content',title:'文章内容',width:100},
	              {field:'author',title:'作者',width:100},
	              {field:'createTime',title:'创建时间',width:100,formatter:function(value){
	            	  var date = new Date(value);
	                  return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate();
	              }}
	          ]]
	});

    var url;
    function addArticle(){
        $('#addArticle').dialog('open').dialog('setTitle','');
        $('#articleForm').form('clear');
        url = 'saveArticle';
    }
    function editUser(){
        var row = $('#dg').datagrid('getSelected');
        if (row){
            $('#dlg').dialog('open').dialog('setTitle','Edit User');
            $('#fm').form('load',row);
            url = 'update_user.php?id='+row.id;
        }
    }
    
    function saveArticle(){
        $('#articleForm').form('submit',{
            url: url,
            onSubmit: function(){
                return $(this).form('validate');
            },
            success: function(result){
                var result = eval('('+result+')');
                if (result.errorMsg){
                    $.messager.show({
                        title: 'Error',
                        msg: result.errorMsg
                    });
                } else {
                    $('#addArticle').dialog('close');        // close the dialog
                    $('#queryArticles').datagrid('reload');    // reload the user data
                }
            }
        });
    }
    function destroyUser(){
        var row = $('#dg').datagrid('getSelected');
        if (row){
            $.messager.confirm('Confirm','Are you sure you want to destroy this user?',function(r){
                if (r){
                    $.post('destroy_user.php',{id:row.id},function(result){
                        if (result.success){
                            $('#dg').datagrid('reload');    // reload the user data
                        } else {
                            $.messager.show({    // show error message
                                title: 'Error',
                                msg: result.errorMsg
                            });
                        }
                    },'json');
                }
            });
        }
    }
//文本编辑器
var editor = new Simditor({
	textarea: $('#editor')
});

    
</script>
</div>

