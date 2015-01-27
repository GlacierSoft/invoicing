<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		
		<link href="${ctx}/resources/uploadify/uploadify.css" rel="stylesheet" type="text/css" />
		<script src="${ctx}/resources/uploadify/jquery.uploadify.min.js" type="text/javascript"></script>
		
		<script type="text/javascript">
		 $(document).ready(function() {  
		     $("#uploadify").uploadify({  
		                    'auto'           : false,  
		                    'swf'            : ctx+'/resources/uploadify/uploadify.swf',  
		                    'uploader'       : ctx+'do/purchaseReturn/doUpload.htm',//后台处理的请求  
		                    'queueID'        : 'fileQueue',//与下面的id对应  
		                    'fileTypeDesc'   : 'rar文件或zip文件',  
		                    'fileTypeExts'   : '*.rar;*.zip', //控制可上传文件的扩展名，启用本项时需同时声明fileDesc  
		                    'multi'          : true,  
		                    'buttonText'     : '上传',
		                    'multi'     :   true,//是否允许多文件上传
		                    'onUploadSuccess' : function(file, data, response) {  
		                        alert( file.name + ' 上传成功！ ');  
		                    } 
		      });  
		    });  
		</script>
	</head>
	<body style="background-color: #C0D1E3; padding: 2px;">
		<input type="file" name="fileName" id="file_upload" />  
        <a href="javascript:$('#file_upload').uploadify('upload', '*')">上传文件</a> | <a href="javascript:$('#file_upload').uploadify('stop')">停止上传!</a>   
	</body>
</html>