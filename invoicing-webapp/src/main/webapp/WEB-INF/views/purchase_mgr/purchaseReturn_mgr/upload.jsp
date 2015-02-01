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

<style type="text/css">
body{ font-size:14px;}
input{ vertical-align:middle; margin:0; padding:0}
.file-box{ position:relative;width:340px}
.txt{ height:22px; border:1px solid #cdcdcd; width:180px;}
.btn{ background-color:#FFF; border:1px solid #CDCDCD;height:24px; width:70px;}
.file{ position:absolute; top:0; right:80px; height:24px; filter:alpha(opacity:0);opacity: 0;width:260px }
</style>
	
  <div style="margin-top: 50px;">
	<div class="file-box">
	  <form action="" method="post" enctype="multipart/form-data">
	 	
	 	<input type='text' name='textfield' id='textfield' class='txt' />  
	 	
	 	<input type='button' class='btn' value='浏览...' />
		
	    <input type="file" name="fileToUpload" class="file"  id="fileToUpload"  size="45"   onchange="document.getElementById('textfield').value=this.value" >
		
		<input type="button" name="submit" class="btn" value="上传"  onclick="return ajaxFileUpload();"/> 
		
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
			data:{name:'logan', id:'id'},
			dataType: 'json',
			success: function (data, status)
			{
				$.messager.alert('附件提示','上传成功！','info');
				
			},
			error: function (data, status, e)
			{
				$.messager.alert('上传提示','上传失败，请联系管理员！','info');
			}
		}
	)
	
	return false;

}
</script>

