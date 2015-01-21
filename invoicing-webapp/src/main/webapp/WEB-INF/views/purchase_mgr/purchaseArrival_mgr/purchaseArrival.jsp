<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制 
	glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.param = {
			toolbarId : 'purchaseArrivalDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化采购到货DataGrid
	glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDataGrid = $('#purchaseArrivalDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:false,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/purchaseArrival/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'purArrivalId',
		columns:[[
			{
				field:'purArrivalId',
				title:'ID',
				checkbox:true
			},{
				field:'arrivalCode',
				title:'采购到货单号',
				width:120,
				sortable:true
			},{
				field:'arrivalDate',
				title:'到货日期',
				width:120,
				sortable:true
			},{
				field:'storage',
				title:'仓库',
				width:120,
				sortable:true
			},{
				field:'supplierId',
				title:'供应商',
				width:120,
				sortable:true
			},{
				field:'contractCode',
				title:'合同编号',
				width:120,
				sortable:true
			},{
				field:'linkman',
				title:'联系人',
				width:120,
				sortable:true
			},{
				field:'deliveryDead',
				title:'交货期限',
				width:120,
				sortable:true
			},{
				field:'totalAmount',
				title:'总金额',
				width:120,
				sortable:true
			},{
				field:'tailAfterStatus',
				title:'货品跟踪状态',
				width:120,
				sortable:true
			},{
				field:'payState',
				title:'货款跟踪状态',
				width:120,
				sortable:true
			},{
				field:'invState',
				title:'开票跟踪状态',
				width:120,
				sortable:true
			},{
				field:'userDisplay',
				title:'经办人',
				width:120,
				sortable:true
			},{
				field:'marketingDepartment',
				title:'经办部门',
				width:120,
				sortable:true
			},{
				field:'summary',
				title:'自动摘要',
				width:120,
				sortable:true
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
		toolbar:'#purchaseArrivalDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//在用户勾选一行的时候触发事件
			action_controller(glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.param,this).check();
		},
		onCheckAll:function(rows){//在用户勾选所有行的时候触发
			action_controller(glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//在用户取消勾选一行的时候触发
			action_controller(glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.param,this).unCheck();
		},
		onUncheckAll:function(rows){//在用户取消勾选所有行的时候触发
			action_controller(glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//在用户选择一行的时候触发
			action_controller(glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.param,this).select();
		},
		onUnselectAll:function(rows){//在用户取消勾选所有行的时候触发
			action_controller(glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.param,this).unSelect();
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
			$("#layout_center_panel").panel("setTitle","采购到货详细信息").panel('refresh',ctx + '/do/purchaseArrival/intoDetail.htm?purchaseId='+rowData.purArrivalId);
			/* $.easyui.showDialog({
				title: "采购到货详细信息",
				href : ctx + '/do/purchaseArrival/intoDetail.htm?purchaseId='+rowData.purArrivalId,//从controller请求jsp页面进行渲染
				width : 620,
				height : 500,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			}); */
		}
	});
	//点击增加按钮触发方法
	glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.addPurchaseArrival = function(){
		/* glacier.basicAddOrEditDialog({
			title : '【采购到货】 - 增加',
			width : 620,
			height : 500,
			queryUrl : ctx + '/do/purchaseArrival/intoForm.htm',
			submitUrl : ctx + '/do/purchaseArrival/add.json',
			successFun : function (){
				glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDataGrid.datagrid('reload');
			}
		}); */
		$("#layout_center_panel").panel("setTitle","新增采购到货").panel('refresh',ctx + '/do/purchaseArrival/intoForm.htm');
	};
	
	//点击编辑按钮触发方法
	glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.editPurchaseArrival = function(){
		var row = glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【采购到货】 - 编辑',
			width : 620,
			height : 500,
			queryUrl : ctx + '/do/purchaseArrival/intoForm.htm',
			submitUrl : ctx + '/do/purchaseArrival/edit.json',
			queryParams : {
				purchaseId : row.purArrivalId
			},
			successFun : function (){
				glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.delPurchaseArrival = function(){
		var rows = glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDataGrid.datagrid("getChecked");
		var purchaseArrivalIds = [];//删除的id标识
		var purchaseArrivals = [];//日志记录引用名称
		for(var i =0;i<rows.length;i++){
			purchaseArrivalIds.push(rows[i].purchaseArrivalId);
			purchaseArrivals.push(rows[i].purchaseArrivalName);
		}
		if(purchaseArrivalIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/purchaseArrival/del.json',
						   data: {purchaseArrivalIds:purchaseArrivalIds.join(','),purchaseArrivalNames:purchaseArrivals.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDataGrid.datagrid('reload');
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

<!-- 所有采购到货列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="creditGridPanel" data-options="region:'center',border:true" >
		<table id="purchaseArrivalDataGrid">
			<glacierui:toolbar panelEnName="PurchaseArrivalList" toolbarId="purchaseArrivalDataGrid_toolbar" menuEnName="purchaseArrival"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="purchaseArrivalSearchForm">
			<table>
				<tr>
					<td>采购到货单号：</td>
					<td><input name="purchaseArrivalName" style="width: 80px;"
						class="spinner" /></td> 
					<td>状态：</td>
					<td><input id="purchaseArrivalSearchForm_status" name="enabled" style="width: 80px;"
						 class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,data : fields.status"/></td> 
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDataGrid.datagrid('load',glacier.serializeObject($('#purchaseArrivalSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#purchaseArrivalSearchForm input').val('');glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
