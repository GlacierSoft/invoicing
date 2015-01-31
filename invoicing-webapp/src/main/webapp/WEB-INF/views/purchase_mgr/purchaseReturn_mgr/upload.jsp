<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<!--跟路径  -->
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!--样式引入  -->
<link href="<%=basePath %>resources/ajaxFileUpload/ajaxfileupload.css" rel="stylesheet" type="text/css" />
<!--脚本引入  -->
<script src="<%=basePath %>resources/ajaxFileUpload/ajaxfileupload.js" type="text/javascript"></script>
	
	<%=basePath %>
<div id="wrapper">
    <div id="content">
    	<img id="loading" src="<%=basePath %>resources/ajaxFileUpload/loading.gif" style="display:none;">
		<form name="form" action="" method="POST" enctype="multipart/form-data">
		<table cellpadding="0" cellspacing="0" class="tableForm">
			<thead>
				<tr>
					<th>Please select a file and click Upload button</th>
				</tr>
			</thead>
			<tbody>	
				<tr>
					<td><input id="fileToUpload" type="file" size="45" name="fileToUpload" class="input"></td>
			    </tr>
			</tbody>
			<tfoot>
				<tr>
					<td><button class="button" id="buttonUpload" onclick="return ajaxFileUpload();">Upload</button></td>
				</tr>
			</tfoot>
		</table>
		</form>    	
    </div>  
</div>


<script type="text/javascript">

function ajaxFileUpload()
{
	$("#loading")
	.ajaxStart(function(){
		$(this).show();
	})
	.ajaxComplete(function(){
		$(this).hide();
	});

	$.ajaxFileUpload
	(
		{
			url:ctx+'/do/purchaseReturn/uploadFile',
			secureuri:false,
			fileElementId:'fileToUpload',
			dataType: 'json',
			success: function (data, status)
			{
				alert("哈哈哈！！！");
			},
			error: function (data, status, e)
			{
				alert(data+"=================="+status+"==============="+e);
				alert(e);
			}
		}
	)
	
	return false;

}
</script>

