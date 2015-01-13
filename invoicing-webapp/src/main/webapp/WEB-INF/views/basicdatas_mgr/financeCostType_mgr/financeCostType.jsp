<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.financeCostType_mgr.financeCostType');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制 
	glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.param = {
			toolbarId : 'financeCostTypeDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化费用类型DataGrid
	glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.financeCostTypeDataGrid = $('#financeCostTypeDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/financeCostType/list.json',
		sortName: 'sequenced',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'costTypeId',
		columns:[[
			{
				field:'costTypeId',
				title:'ID',
				checkbox:true
			},{
				field:'name',
				title:'费用类型名称',
				width:120,
				sortable:true
			},{
				field:'sequenced',
				title:'序号',
				width:120,
				sortable:true
			},{
				field:'enabled',
				title:'状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){
					return renderGridValue(value,fields.status);
				}
			},{
				field:'creater',
				title:'创建人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:200
			},{
				field:'updater',
				title:'更新人',
				sortable:true,
				width:100
			},{
				field:'updateTime',
				title:'更新时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#financeCostTypeDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//在用户勾选一行的时候触发事件
			action_controller(glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.param,this).check();
		},
		onCheckAll:function(rows){//在用户勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//在用户取消勾选一行的时候触发
			action_controller(glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.param,this).unCheck();
		},
		onUncheckAll:function(rows){//在用户取消勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//在用户选择一行的时候触发
			action_controller(glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.param,this).select();
		},
		onUnselectAll:function(rows){//在用户取消勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.param,this).unSelect();
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
				title: "费用类型详细信息",
				href : ctx + '/do/financeCostType/intoDetail.htm?costTypeId='+rowData.costTypeId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 250,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
			
		}
	});
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.addFinanceCostType = function(){
		glacier.basicAddOrEditDialog({
			title : '【费用类型】 - 增加',
			width : 420,
			height : 200,
			queryUrl : ctx + '/do/financeCostType/intoForm.htm',
			submitUrl : ctx + '/do/financeCostType/add.json',
			successFun : function (){
				glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.financeCostTypeDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.editFinanceCostType = function(){
		var row = glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.financeCostTypeDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【费用类型】 - 编辑',
			width : 420,
			height : 200,
			queryUrl : ctx + '/do/financeCostType/intoForm.htm',
			submitUrl : ctx + '/do/financeCostType/edit.json',
			queryParams : {
				costTypeId : row.costTypeId
			},
			successFun : function (){
				glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.financeCostTypeDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.delFinanceCostType = function(){
		var rows = glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.financeCostTypeDataGrid.datagrid("getChecked");
		var costTypeIds = [];//删除的id标识
		var names = [];//日志记录引用名称
		for(var i =0;i<rows.length;i++){
			costTypeIds.push(rows[i].costTypeId);
			names.push(rows[i].name);
		}
		if(costTypeIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/financeCostType/del.json',
						   data: {costTypeIds:costTypeIds.join(','),names:names.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.financeCostTypeDataGrid.datagrid('reload');
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

<!-- 所有费用类型列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="financeCostTypeGridPanel" data-options="region:'center',border:true" >
		<table id="financeCostTypeDataGrid">
			<glacierui:toolbar panelEnName="FinanceCostTypeList" toolbarId="financeCostTypeDataGrid_toolbar" menuEnName="financeCostType"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="financeCostTypeSearchForm">
			<table>
				<tr>
					<td>费用类型名称：</td>
					<td><input name="financeCostTypeName" style="width: 80px;"
						class="spinner" /></td> 
					<td>状态：</td>
					<td><input id="financeCostTypeSearchForm_status" name="enabled" style="width: 80px;"
						 class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,data : fields.status"/></td> 
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.financeCostTypeDataGrid.datagrid('load',glacier.serializeObject($('#financeCostTypeSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#financeCostTypeSearchForm input').val('');glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.financeCostTypeDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
