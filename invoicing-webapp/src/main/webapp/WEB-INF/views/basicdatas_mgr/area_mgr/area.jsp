<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.area_mgr.area');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制 
	glacier.basicdatas_mgr.area_mgr.area.areaParam = {
			toolbarId : 'areaTreeGridToolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'single'}
			}
	};
		
	//初始化地区areaTreeGrid
	glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid = $('#areaTreeGrid').treegrid({
		fit:true,//控件自动areaize占满窗口大小
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		url : ctx + '/do/area/list.json',//请求的URL
		idField : 'areaId',
		treeField : 'areaName',//定义树节点字段
		parentField : 'areaPid',//treegrid父节点
		smooth: true,//该属性用以启用当前 easyui-treegrid 控件对平滑数据格式的支持,默认使用字段pid,可自定义
		enableHeaderClickMenu: false,//启用表头菜单
        enableHeaderContextMenu: true,//启用表头右键菜单
        enableRowContextMenu: false,//启用表行右键菜单
		rowTooltip: false, //表行数据提示
		toolbar : '#areaTreeGridToolbar',
		onSelect:function(rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.area_mgr.area.areaParam,this).select();
		},
		onUnselectAll:function(rows){//取消选择行状态触发事件
			action_controller(glacier.basicdatas_mgr.area_mgr.area.areaParam,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$.fn.treegrid.extensions.onLoadSuccess.apply(this, arguments);//这句一定要加上
			$(this).treegrid('unselectAll');
		},
		onDblClickRow: function(row){
			glacier.basicdatas_mgr.area_mgr.area.areaDetails(row);
		},
		frozenColumns : [ [{//冻结列，当表格宽度压缩展示不全时候，该列不会缩小
			field : 'areaId' , title : 'ID' , hidden:true
		},{
			field : 'areaName' , title : '地区' , width : 250
		}]],
		columns : [ [{
			field : 'areaNum' , title : '排序' , width : 50
		},{
			field : 'createrDisplay' , title : '创建人' , width : 100
		},{
			field : 'createTime' , title : '创建时间' , width : 200
		},{
			field:'updaterDisplay', title:'更新人',	width:100
		},{
			field:'updateTime',	title:'更新时间',	width:200
		},{
			field : 'remark' , title : '备注' , width : 120
		}]]
	});
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.area_mgr.area.addArea = function(){
		glacier.basicAddOrEditDialog({
			title : '【地区管理】- 增加',
			width : 400,
			height : 280,
			queryUrl : ctx + '/do/area/intoForm.htm',
			submitUrl : ctx + '/do/area/add.json',
			successFun : function (){
				glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid.treegrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.area_mgr.area.editArea = function(){
		var row = glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid.treegrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【地区管理】- 编辑('+row.areaName+')',
			width : 400,
			height : 280,
			queryUrl : ctx + '/do/area/intoForm.htm',
			submitUrl : ctx + '/do/area/edit.json',
			queryParams : {
				areaId : row.areaId
			},
			successFun : function (){
				glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid.treegrid('reload');
			}
		});
	};
	//删除地区
	glacier.basicdatas_mgr.area_mgr.area.delArea = function(){
		var row = glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid.treegrid("getSelected");
		$.messager.confirm('请确认', '是否要删除所选地区，删除后不可恢复!', function(r){
			if (r){
				$.ajax({
					   type: "POST",
					   url: ctx + '/do/area/del.json',
					   data: row,
					   dataType:'json',
					   success: function(r){
						   if(r.success){//操作成功刷新列表
							   $.messager.show({
									title:'提示',
									msg:r.msg,
									icon:'info',
									showType:'fade'
								});
							   glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid.treegrid('reload');
						   }else{
							   $.messager.show({
									title:'提示',
									msg:r.msg,
									icon:'error',
									showType:'fade'
								});
						   }
					   }
				});
			}
		});
	};
	//双击查看地区详细信息
	glacier.basicdatas_mgr.area_mgr.area.areaDetails = function(row){
		$('<div/>').dialog({
			href : ctx + '/do/area/intoDetail.htm?areaId='+row.areaId,//从controller请求jsp页面进行渲染
			width : 520,
			height : 230,
			modal : true,
			resizable: false,
			title : "【"+row.areaName+"】的地区详细信息",
			onClose : function() {//提高浏览器性能，点击关闭窗口时候注销
				$(this).dialog('destroy');
			},
			onLoad : function() {
				$('#area_mgr_area_details').form('load', row);
			}
		});
	};
</script>

<!-- 所有地区列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
   		<div id="areaGridPanel" data-options="region:'center',border:true" >
   			<table id="areaTreeGrid">
	    		<glacierui:toolbar panelEnName="AreaTree" toolbarId="areaTreeGridToolbar" menuEnName="area"/><!-- 自定义标签：自动根据地区获取当前用户权限，动态注册方法 -->
	    	</table>
   		</div>
</div>
