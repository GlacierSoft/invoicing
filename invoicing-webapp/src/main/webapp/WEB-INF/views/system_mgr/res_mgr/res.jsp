<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.system_mgr.res_mgr.res');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.system_mgr.res_mgr.res.menuParam = {
			toolbarId : 'menuTreeGridToolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'single'}
			}
	};
		
	//初始化资源菜单menuTreeGrid
	glacier.system_mgr.res_mgr.res.menuTreeGrid = $('#menuTreeGrid').treegrid({
		fit:true,//控件自动resize占满窗口大小
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		url : ctx + '/do/res/menu/list.json',//请求的URL
		idField : 'menuId',
		treeField : 'menuCnName',//定义树节点字段
		smooth: true,//该属性用以启用当前 easyui-treegrid 控件对平滑数据格式的支持,默认使用字段pid,可自定义
		enableHeaderClickMenu: false,//启用表头菜单
        enableHeaderContextMenu: true,//启用表头右键菜单
        enableRowContextMenu: false,//启用表行右键菜单
		rowTooltip: false, //表行数据提示
		toolbar : '#menuTreeGridToolbar',
		onSelect:function(rowData){//选择行事件触发
			action_controller(glacier.system_mgr.res_mgr.res.menuParam,this).select();
			if(rowData.url){//选中菜单的同时，根据菜单属性是否包含可用的URL进行对应的操作进行动态变更
				glacier.system_mgr.res_mgr.res.actionPropertyGrid.propertygrid('load',{
					menuId: rowData.menuId
				});
				glacier.system_mgr.res_mgr.res.panelDataGrid.datagrid('load',{
					menuId: rowData.menuId
				});
			}
		},
		onUnselectAll:function(rows){//取消选择行状态触发事件
			action_controller(glacier.system_mgr.res_mgr.res.menuParam,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$.fn.treegrid.extensions.onLoadSuccess.apply(this, arguments);//这句一定要加上
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow: function(row){
			$.easyui.showDialog({
				title: "【"+row.menuCnName+"】详细信息",
				href : ctx + '/do/res/menu/intoDetail.htm?menuId='+row.menuId,//从controller请求jsp页面进行渲染
				width : 550,
				height : 260,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		},
		frozenColumns : [ [{//冻结列，当表格宽度压缩展示不全时候，该列不会缩小
			field : 'menuId' , title : 'ID' , hidden:true
		},{
			field : 'menuCnName' , title : '菜单树' , width : 150
		}]],
		columns : [ [{
			field : 'menuEnName' , title : '英文名称' , width : 100
		},{
			field : 'url' , title : '菜单路径' , width : 200
		} ,{
			field : 'orderNum' , title : '排序' , width : 80
		},{
			field : 'iconCls' , title : '样式' , hidden:true
		}]]
	});
	
	//定义面板的toolbar的操作，对面板操作进行控制
	glacier.system_mgr.res_mgr.res.panelParam = {
			toolbarId : 'panelDataGridToolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	
	//初始化面板datagrid
	glacier.system_mgr.res_mgr.res.panelDataGrid = $('#panelDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		singleSelect:true,//限制单选
		url: ctx + '/do/res/panel/list.json',
		queryParams: {menuId: ''},//初始化的时候默认传递menuId为空的参数
		sortName: 'orderNum',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'panelId',
		toolbar : '#panelDataGridToolbar',
		columns:[[
			{
				field:'panelId' , title:'ID' , checkbox:true
			},{
				field:'panelCnName' , title:'面板中文' , width:80
			},{
				field:'panelEnName' , title:'面板英文' , width:80
			},{
				field : 'orderNum' , title : '排序' , width : 25
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 50,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true,
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.res_mgr.res.panelParam,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.res_mgr.res.panelParam,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.res_mgr.res.panelParam,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.res_mgr.res.panelParam,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.system_mgr.res_mgr.res.panelParam,this).select();
			glacier.system_mgr.res_mgr.res.actionPropertyGrid.propertygrid('load',{
				menuId: rowData.menuId,
				panelId:rowData.panelId
			});
		},
		onUnselectAll:function(rows){
			action_controller(glacier.system_mgr.res_mgr.res.panelParam,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('unselectAll');
			$(this).datagrid('uncheckAll');
		}
	});
	
	//定义动作的toolbar的操作，对动作操作进行控制
	glacier.system_mgr.res_mgr.res.actionParam = {
			toolbarId : 'actionDataGridToolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	
	//初始化操作propertygrid
	glacier.system_mgr.res_mgr.res.actionPropertyGrid = $('#actionDataGrid').propertygrid({
		fit:true,//控件自动resize占满窗口大小
		showGroup: true,
		scrollbarSize: 0,
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/res/action/list.json',
		queryParams: {menuId: ''},//初始化的时候默认传递menuId为空的参数
		sortName: 'orderNum',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'actionId',
		toolbar : '#actionDataGridToolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.res_mgr.res.actionParam,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.res_mgr.res.actionParam,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.res_mgr.res.actionParam,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.res_mgr.res.actionParam,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.system_mgr.res_mgr.res.actionParam,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.system_mgr.res_mgr.res.actionParam,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).propertygrid('clearSelections');//清空选择行与勾选行
			$(this).propertygrid('clearChecked');
		},
		columns:[[
			{
				field:'actionId' , title:'ID' , checkbox:true
			},{
				field:'actionCnName' , title:'操作名称' , width:80
			},{
				field:'actionEnName' , title:'英文名称' , width:80
			},{
				field:'iconCls', title:'样式' , width:25,
				formatter: function(value,row,index){
					if(value){return $.string.format('<span class="{0}" style="display:inline-block;width:16px;height:16px;"></span>',value);}
					return '';
					
				}
			},{
				field : 'method' , title : '调用方法' , width : 230
			},{
				field : 'orderNum' , title : '排序' , width : 25
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 50,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true
	});
	
	// 增加菜单
	glacier.system_mgr.res_mgr.res.addMenu = function(){
		glacier.system_mgr.res_mgr.res.newMenuDialog('【菜单管理】- 增加菜单',false,'/do/res/menu/add.json');
	};
	
	//编辑菜单
	glacier.system_mgr.res_mgr.res.editMenu = function(){
		glacier.system_mgr.res_mgr.res.newMenuDialog('【菜单管理】- 修改菜单',true,'/do/res/menu/edit.json');
	};
	
	//删除菜单
	glacier.system_mgr.res_mgr.res.delMenu = function(){
		var row = glacier.system_mgr.res_mgr.res.menuTreeGrid.treegrid("getSelected");
		$.messager.confirm('请确认', '是否要删除所选操作，删除后不可恢复!', function(r){
			if (r){
				$.ajax({
					   type: "POST",
					   url: ctx + '/do/res/menu/del.json',
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
							   glacier.system_mgr.res_mgr.res.menuTreeGrid.treegrid('reload');
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
	
	//增加面板
	glacier.system_mgr.res_mgr.res.addPanel = function(){
		glacier.system_mgr.res_mgr.res.newPanelDialog('【面板管理】- 增加面板',false,'/do/res/panel/add.json');
	};
	
	//修改面板
	glacier.system_mgr.res_mgr.res.editPanel = function(){
		glacier.system_mgr.res_mgr.res.newPanelDialog('【面板管理】- 修改面板',true,'/do/res/panel/edit.json');
	};
	
	//删除面板
	glacier.system_mgr.res_mgr.res.delPanel = function(){
		var row = glacier.system_mgr.res_mgr.res.panelDataGrid.datagrid("getSelected");
		$.messager.confirm('请确认', '是否要删除所选面板，删除后不可恢复!', function(r){
			if (r){
				$.ajax({
					   type: "POST",
					   url: ctx + '/do/res/panel/del.json',
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
							   glacier.system_mgr.res_mgr.res.panelDataGrid.datagrid('reload');
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
	
	//增加操作
	glacier.system_mgr.res_mgr.res.addAction = function(){
		glacier.system_mgr.res_mgr.res.newActionDialog('【操作管理】- 增加操作',false,'/do/res/action/add.json');
	};
	
	//修改操作
	glacier.system_mgr.res_mgr.res.editAction = function(){
		glacier.system_mgr.res_mgr.res.newActionDialog('【操作管理】- 修改操作',true,'/do/res/action/edit.json');
	};
	
	//删除操作
	glacier.system_mgr.res_mgr.res.delAction = function(){
		var rows = glacier.system_mgr.res_mgr.res.actionPropertyGrid.propertygrid("getChecked");
		var actionIds = [];//删除的id标识
		var actionCnNames = [];//日志记录引用名称
		for(var i=0;i<rows.length;i++){
			actionIds.push(rows[i].actionId);
			actionCnNames.push(rows[i].actionCnName);
		}
		if(actionIds.length > 0){
			$.messager.confirm('请确认', '是否要删除所选操作，删除后不可恢复!', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/res/action/del.json',
						   data: {actionIds:actionIds.join(','),actionCnNames:actionCnNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
									glacier.system_mgr.res_mgr.res.actionPropertyGrid.propertygrid('reload');
							   }else{
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg,
										icon:'error'
									});
							   }
						   }
					});
				}
			});
		}
	};
	
	/**
		打开新建或者编辑窗口
		title:要打开的窗口标题
		editModel: true or false ，是否复制当前选择行数据到form中
		url:点击保存按钮请求的url
	*/
	glacier.system_mgr.res_mgr.res.newMenuDialog = function(title,editModel,url){
			$.easyui.showDialog({
				href : ctx + '/do/res/menu/intoForm.htm',//从controller请求jsp页面进行渲染
				width : 530,
				height : 300,
				resizable: false,
				enableSaveButton : false,
				enableApplyButton : false,
				title : title,
				buttons : [ 
				 {
					text : '保存',
					iconCls : 'icon-save',
					handler : function(dia) {
							$('#menu_mgr_menu_form').form('submit', {
								url: ctx + url,
								success: function(r){
									$.messager.show(r.msg);
									glacier.system_mgr.res_mgr.res.menuTreeGrid.treegrid('reload');
								    dia.dialog("close");  
								}
							});
						}
				}],
				onLoad : function() {
					if(editModel){//编辑模式
						var row = glacier.system_mgr.res_mgr.res.menuTreeGrid.treegrid('getSelected');
						if(row){
							$('#menu_mgr_menu_form').form('load', row );
						}else{
							$.messager.show({//提示用户
								title : '提示',
								timeout:3000,
								msg : '请选择一行数据进行编辑'
							});
						}
					}
				}
		});
	};
	
	/**
		面板Dialog
		title:要打开的窗口标题
		editModel: true or false ，是否复制当前选择行数据到form中
		url:点击保存按钮请求的url
	*/
	glacier.system_mgr.res_mgr.res.newPanelDialog = function(title,editModel,url){
			$.easyui.showDialog({
				href : ctx + '/do/res/panel/intoForm.htm',//从controller请求jsp页面进行渲染
				width : 280,
				height : 200,
				resizable: false,
				enableSaveButton : false,
				enableApplyButton : false,
				title : title,
				buttons : [{
					text : '保存',
					iconCls : 'icon-save',
					handler : function(dia) {
						$('#res_mgr_panel_form').form('submit', {
							url: ctx + url,
							success: function(r){
								$.messager.show(r.msg);
								glacier.system_mgr.res_mgr.res.panelDataGrid.datagrid('reload');
							    dia.dialog("close");  
							}
						});
					}
				}],
				onLoad : function() {
					if(editModel){//如果是编辑模式则从选择行中获取数据填充到表单
						var row = glacier.system_mgr.res_mgr.res.panelDataGrid.datagrid("getSelected");
						if(row){
							$('#res_mgr_panel_form').form('load',row);
						}
					}else{
						var menuRow = glacier.system_mgr.res_mgr.res.menuTreeGrid.treegrid("getSelected");
						if(menuRow){//初始化所在菜单以及对应面板
							$("#res_mgr_panel_form_menuId").combotree('setValue', menuRow.menuId);
						}
					}
				}
		});
	};
	
	/**
		打开新建或者编辑窗口
		title:要打开的窗口标题
		editModel: true or false ，是否复制当前选择行数据到form中
		url:点击保存按钮请求的url
	*/
	glacier.system_mgr.res_mgr.res.newActionDialog = function(title,editModel,url){
			$.easyui.showDialog({
				href : ctx + '/do/res/action/intoForm.htm',//从controller请求jsp页面进行渲染
				width : 550,
				height : 350,
				resizable: false,
				enableSaveButton : false,
				enableApplyButton : false,
				title : title,
				buttons : [{
					text : '保存',
					iconCls : 'icon-save',
					handler : function(dia) {
						$('#res_mgr_action_form').form('submit', {
							url: ctx + url,
							success: function(r){
								$.messager.show(r.msg);
								glacier.system_mgr.res_mgr.res.actionPropertyGrid.propertygrid('reload');
							    dia.dialog("close");  
							}
						});
					}
				}],
				onLoad : function() {
					var menuRow = glacier.system_mgr.res_mgr.res.menuTreeGrid.treegrid("getSelected");
					if(menuRow){//初始化所在菜单以及对应面板
						$("#res_mgr_action_form_menuId").combotree('setValue', menuRow.menuId);
						$("#res_mgr_action_form_panelId").combobox('enable').combobox('reload',ctx + '/do/res/panel/getPanelsByMenuId.json?menuId='+menuRow.menuId);
						//如果面板已选中，自动初始化面板combobox
						var panelRow = glacier.system_mgr.res_mgr.res.panelDataGrid.datagrid("getSelected");
						if(panelRow){
							$("#res_mgr_action_form_panelId").combobox('setValue',panelRow.panelId)
						}
					}
					if(editModel){//如果是编辑模式则从选择行中获取数据填充到表单
						var row = glacier.system_mgr.res_mgr.res.actionPropertyGrid.propertygrid('getSelected');
						if(row){
							$('#res_mgr_action_form').form('load',row);
						}else{
							$.messager.show({//提示用户
								title : '提示',
								timeout:3000,
								msg : '请选择一行数据进行编辑'
							});
						}
					}else{
						
					}
				}
		});
	};
</script>
<div id="res_layout" class="easyui-layout" data-options="fit:true,border:false">  
    <div data-options="region:'center',title:'操作管理',border:true">
    	<table id="actionDataGrid">
    		<glacierui:toolbar panelEnName="ActionList" toolbarId="actionDataGridToolbar" menuEnName="res"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
    	</table>
    </div>
    <div data-options="region:'west',border:false,split:true" style="width:400px;">
    	<div class="easyui-layout" data-options="fit:true,border:false">
    		<div data-options="region:'center',title:'菜单管理',border:true">
    			<table id="menuTreeGrid">
		    		<glacierui:toolbar panelEnName="MenuTree" toolbarId="menuTreeGridToolbar" menuEnName="res"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		    	</table>
    		</div>
    		<div data-options="region:'south',title:'面板管理',border:true,split:true" style="height:260px;">
    			<table id="panelDataGrid">
		    		<glacierui:toolbar panelEnName="PanelList" toolbarId="panelDataGridToolbar" menuEnName="res"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		    	</table>
    		</div>
    	</div>
    </div>
</div>