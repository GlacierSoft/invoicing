<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
	<div style="margin-top: 10px;"></div>
	<input type="file" name="file" id="file_upload"/>
	<div id="some_file_queue"></div>
	<p>
       <a href="javascript:$('#file_upload').uploadify('upload', '*')" style="border-radius:10px;" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">上传</a> 
       <a href="javascript:$('#file_upload').uploadify('cancel')" style="margin-left: 30px;border-radius:10px;"  class="easyui-linkbutton" data-options="iconCls:'icon-undo'">撤销</a>
    </p>   


<script type="text/javascript">
   $(function() {
	  
	  $('#file_upload').uploadify({
    	  'auto': false,
    	  'multi': true,
    	  'method':'post',
    	  'buttonCursor' : 'arrow',
    	  'progressData' : 'percentage',
    	  'queueID'  : 'some_file_queue',
    	  'fileTypeDesc' : 'Image Files',
          'fileTypeExts' : '*.gif; *.jpg; *.png',
          'buttonText': '浏览文件',
          'fileSizeLimit' : '10MB',
          'fileObjName' : 'file',
          'queueSizeLimit' : 5,
          'cancelImg':ctx+'/resources/uploadify/uploadify-cancel.png',
          'swf'      : ctx+'/resources/uploadify/uploadify.swf',
          'uploader' : ctx+'/do/purchaseReturn/uploadFile',
          'overrideEvents': ['onSelectError', 'onDialogClose'],
          'onSelectError':function(file, errorCode, errorMsg){
              switch(errorCode) {
                  case -100:
                      alert("上传的文件数量已经超出系统限制的"+$('#file_upload').uploadify('settings','queueSizeLimit')+"个文件！");
                      break;
                  case -110:
                      alert("文件 ["+file.name+"] 大小超出系统限制的"+$('#file_upload').uploadify('settings','fileSizeLimit')+"大小！");
                      break;
                  case -120:
                      alert("文件 ["+file.name+"] 大小异常！");
                      break;
                  case -130:
                      alert("文件 ["+file.name+"] 类型不正确！");
                      break;
              }
          },
          'onFallback':function(){
              alert("您未安装FLASH控件，无法上传图片！请安装FLASH控件后再试。");
          },
          'onUploadSuccess':function(file, data, response) {  
              alert( file.name + ' 上传成功！ ');  
          }
      });
      
      
   });
</script>

