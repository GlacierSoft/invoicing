<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<form style="padding:15px;">
	<table class="detailtable">
		<tr>
			<td>上级菜单：</td>
			<td class="forminputtable">
				<input class="spinner" value="${menuData.parentMenuCnName}" style="width:170px;height:18px;" readonly="readonly"/>
			</td>
			<td>图标样式：</td>
			<td><input id="menu_detail_iconCls" style="width:170px" class="spinner" value="${menuData.iconCls}" readonly="readonly"></select></td>
		</tr>
		<tr>
			<td>菜单名称：</td>
			<td>
				<input class="spinner"  style="width:170px" value="${menuData.menuEnName}" readonly="readonly"/>
			</td>
			<td>英文名称：</td>
			<td><input  class="spinner"  style="width:170px" value="${menuData.menuCnName}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>URL：</td>
			<td><input name="url" class="spinner" style="width:170px" value="${menuData.url}" readonly="readonly"/></td>
			<td>菜单排序：</td>
			<td><input name="orderNum" class="spinner" value="${menuData.orderNum}" style="width:170px" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${menuData.remark}</textarea></td>
		</tr>
	</table>
</form>
