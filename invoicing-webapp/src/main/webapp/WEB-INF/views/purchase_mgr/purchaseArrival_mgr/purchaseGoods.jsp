<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<table id="purchase_goods">  
</table>
<script type="text/javascript">
$('#purchase_goods').datagrid({  
	fit : false,//控件自动resize占满窗口大小
	iconCls : 'icon-save',//图标样式
	barrival : true,//是否存在边框 
	fitColumns : false,//自动填充行
	nowrap : true,//禁止单元格中的文字自动换行
	autoRowHeight : false,//禁止设置自动行高以适应内容
	striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	singleSelect : true,//限制单选
	checkOnSelect : false,//选择复选框的时候选择该行
	selectOnCheck : false,//选择的时候复选框打勾 
	url: ctx + '/do/goodsList/list.json?storageVal='+storageVal,
	sortName : 'goodsCode',//排序字段名称
	sortOrder : 'DESC',//升序还是降序
	remoteSort : true,//开启远程排序，默认为false
	idField : 'goodsCode', 
    columns:[[    
        {field:'goodsCode',title:'货品编码',width:100},    
        {field:'goodsName',title:'名称',width:100},    
        {field:'goodsTypeId',title:'货品分类',width:100},
        {field:'goodsModel',title:'规格型号',width:100},   
        {field:'brand',title:'品牌',width:100},  
        {field:'placeOfOrigin',title:'产地',width:100}, 
    ]],
    pagination : true,//True 就会在 datagrid 的底部显示分页栏
	pageSize : 10,//注意，pageSize必须在pageList存在
	pageList : [2,10,50,100],//从session中获取
	rownumbers:true,//True 就会显示行号的列
	onDblClickRow:function(rowIndex, rowData){

	}
});
</script>
