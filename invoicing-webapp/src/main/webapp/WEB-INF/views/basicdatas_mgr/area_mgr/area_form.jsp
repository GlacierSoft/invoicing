<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="area_mgr_area_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>地区：</td>
			<td>
				<input id="area_mgr_area_form_areaId" type="hidden" name="areaId" value="${areaData.areaId}" />
				<input id="area_mgr_area_form_areaName" name="areaName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${areaData.areaName}" validType="customReg['^[\u0391-\uFFE5]{2,10}$','<fmt:message key="ParameterArea.areaName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>父级地区：</td>
			<td class="forminputtable">
				<input id="area_mgr_area_form_areaPid" name="areaPid" value="${areaData.areaPid}"/>
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input id="area_mgr_area_form_areaNum" name="areaNum" class="easyui-numberspinner spinner" value="${areaData.areaNum}" data-options="min:0,max:999,missingMessage:'请输入地区排序'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="area_mgr_area_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${areaData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	//初始化上级菜单
	$("#area_mgr_area_form_areaPid").combotree({
		data : $.parseJSON('${allAreaTreeNodeData}'),
		width:268,
		height:18,
	    missingMessage:'请选择上级地区',
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true
	});	
</script>