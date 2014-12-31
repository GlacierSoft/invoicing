<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="credit_mgr_credit_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>信用级别名称：</td>
			<td>
				<input type="hidden" name="creditId" value="${creditData.creditId}" />
				<input name="creditName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditData.creditName}" validType="customReg['^[\u0391-\uFFE5]{2,10}$','<fmt:message key="ParameterCredit.creditName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>开始积分：</td>
			<td><input name="creditBeginIntegral" class="easyui-numberspinner spinner" value="${creditData.creditBeginIntegral}" data-options="min:0,max:9999,required:true,missingMessage:'请输入信用级别开始积分,只能输入整数'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>结束积分：</td>
			<td><input name="creditEndIntegral" class="easyui-numberspinner spinner" value="${creditData.creditEndIntegral}" data-options="min:0,max:9999,required:true,missingMessage:'请输入信用级别结束积分,只能输入整数'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input name="creditNum" class="easyui-numberspinner spinner" value="${creditData.creditNum}" data-options="min:0,max:999,missingMessage:'请输入信用级别排序'" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
	    	<td>级别图标:</td>
	    	<td>
	    	<input class="ke-input-text" type="text" name=creditPhoto id="url" value="${creditData.creditPhoto}" readonly="readonly" />
	    	<input type="button" id="uploadButton" value="上传"/>
	    	</td>
	    </tr>
	    <tr>
			<td></td>
			<td>
			<div id="creditPhotoDiv" style="border: 1px #DDDDDD;">
				<img id="creditPhotoDivImg"  src="${creditData.creditPhoto}" style="width: 34px;height: 24px ;" />
			</div>
			</td>
		</tr>
	   
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${creditData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
		//图标上传。
	    KindEditor.ready(function(K) {
				var uploadbutton = K.uploadbutton({
					button : K('#uploadButton')[0],
					fieldName : 'imgFile',
					//url : ctx+'/member/uploadFile.htm?dir=image',
					url : ctx+'/resources/js/kindeditor/jsp/upload_json.jsp?dir=image',
						//'../php/upload_json.php?dir=file'
					afterUpload : function(data) {
						if (data.error === 0) {
							var url = K.formatUrl(data.url, 'domain');
							K('#url').val(url);
							//K('#url').html(url);
							$("#creditPhotoDivImg").attr("src",url);
						} else {
							alert(data.message);
						}
					},
					afterError : function(str) {
						alert('自定义错误信息: ' + str);
					}
				});
				uploadbutton.fileBox.change(function(e) {
					uploadbutton.submit();
				});
			});
</script>