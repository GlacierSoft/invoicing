<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.system_mgr.operalog_mgr.operalog');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.system_mgr.operalog_mgr.operalog.param = {
			toolbarId : 'operalogDataGrid_toolbar',
			actions : {
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	
	//初始化角色DataGrid
	glacier.system_mgr.operalog_mgr.operalog.operalogDataGrid = $('#operalogDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		//fitColumns:false,//自动填充行,出现滚动条
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/operalog/list.json',
		sortName: 'operaTime',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'operalogId',
		columns:[[
			{	
				field:'operalogId',
				title:'ID',
				checkbox:true
			},{
				field:'operaMenu',
				title:'操作菜单',
				width:120,
				sortable:true
			},{
				field:'operaPenal',
				title:'操作面板',
				width:120,
				sortable:true
			},{
				field:'operaMethod',
				title:'操作方法',
				width:80
			},{
				field:'operaResult',
				title:'操作结果',
				width:120,
				sortable:true
			},{
				field:'operaDesc',
				title:'返回内容',
				width:200,
				sortable:true
			},{
				field:'operaClass',
				title:'调用类',
				width:200,
				sortable:true
			},{
				field:'operaMd',
				title:'调用方法',
				width:120,
				sortable:true
			},{
				field:'operator',
				title:'操作人',
				width:120,
				sortable:true
			},{
				field:'operaTime',
				title:'创建时间',
				width:160,
				sortable:true
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#operalogDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.operalog_mgr.operalog.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.operalog_mgr.operalog.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.operalog_mgr.operalog.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.operalog_mgr.operalog.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.system_mgr.operalog_mgr.operalog.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.system_mgr.operalog_mgr.operalog.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked'); 
			var rows=$(this).datagrid("getRows");
			if(rows.length==0){   
				var body = $(this).data().datagrid.dc.body2;
				body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
			}
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: "【"+rowData.operaMenu+"】操作日志详细信息",
				href : ctx + '/do/operalog/intoDetail.htm?operalogId='+rowData.operalogId,//从controller请求jsp页面进行渲染
				width : 540,
				height : 270,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	

	//点击删除按钮触发方法
	glacier.system_mgr.operalog_mgr.operalog.delOperalog = function(){
		var rows = glacier.system_mgr.operalog_mgr.operalog.operalogDataGrid.datagrid("getChecked");
		var operalogIds = [];//删除的id标识
		var operaPenals = [];//日志记录引用名称
		for(var i=0;i<rows.length;i++){
			operalogIds.push(rows[i].operalogId);
			operaPenals.push(rows[i].operaPenal);
		}
		if(operalogIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/operalog/del.json',
						   data: {operalogIds:operalogIds.join(','),operaPenals:operaPenals.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.system_mgr.operalog_mgr.operalog.operalogDataGrid.datagrid('reload');
							   }else{
									$.messager.show({//后台验证弹出错误提示信息框
										title:'错误提示',
										width:380,
										height:120,
										msg: '<span style="color:red">'+r.msg+'<span>',
										timeout:4500
									});
								}
						   }
					});
				}
			});
		}
	};
	
</script>

<!-- 所有操作日志列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="operalogGridPanel" data-options="region:'center',border:true" >
		<table id="operalogDataGrid">
			<glacierui:toolbar panelEnName="OperalogList" toolbarId="operalogDataGrid_toolbar" menuEnName="operalog"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="operalogSearchForm">
			<table>
				<tr>
					<td>操作菜单：</td>
					<td><input name="operaMenu" style="width: 60px;" class="spinner"/></td>
					<td>操作面板：</td>
					<td><input name="operaPenal" style="width: 60px;" class="spinner"/></td>
					<td>操作方法：</td>
					<td><input name="operaMethod" style="width: 60px;" class="spinner"/></td>
					<td>调用方法：</td>
					<td><input name="operaMd" style="width: 60px;" class="spinner"/></td>
					<td>操作人：</td>
					<td><input name="operator" style="width: 60px;" class="spinner"/></td>
					<td>创建时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.system_mgr.operalog_mgr.operalog.operalogDataGrid.datagrid('load',glacier.serializeObject($('#operalogSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#operalogSearchForm input').val('');glacier.system_mgr.operalog_mgr.operalog.operalogDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>