<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	
	$.util.namespace('glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.param = {
		toolbarId : 'purchaseReturnDataGrid_toolbar',
		actions : {  
			batchDisable:{flag:'batchDisable',controlType:'multiple'}  
	         }
     };

	//初始化DataGrid
	glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.purchaseReturnDataGrid= $('#purchaseReturnDataGrid').datagrid({
		fit : true,//控件自动resize占满窗口大小
		iconCls : 'icon-save',//图标样式
		border : false,//是否存在边框
		fitColumns : true,//自动填充行
		nowrap : true,//禁止单元格中的文字自动换行
		autoRowHeight : false,//禁止设置自动行高以适应内容
		striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect : true,//限制单选
		checkOnSelect : false,//选择复选框的时候选择该行
		selectOnCheck : false,//选择的时候复选框打勾
		url : ctx + '/do/purchaseReturn/list.json?enabled=enable',
		sortName : 'createTime',//排序字段名称
		sortOrder : 'DESC',//升序还是降序
		remoteSort : true,//开启远程排序，默认为false
		idField : 'purReturnId',
		columns : [ [ {
			field : 'purReturnId',
			title : 'ID',
			checkbox : true
		}, {
			field : 'returnCode',
			title : '退货单号',
			width : 120,
			sortable : true
		},{
			field : 'auditState',
			title : '审核状态', 
			width : 120,
			sortable : true, 
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.auditState);
			}
		},{
			field : 'enabled',
			title : '启用/禁用', 
			width : 120,
			sortable : true, 
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.status);
			}
		},{
			field : 'storageDisplay',
			title : '仓库',
			sortable : true,
			width : 120
		},{
			field : 'supplierIdDisplay',
			title : '供应商',
			sortable : true,
			width : 120
		},{
			field : 'refundTotal',
			title : '退货金额',
			sortable : true,
			width : 120
		},{
			field : 'logSettlement',
			title : '结算方式', 
			width : 120,
			sortable : true, 
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.logSettlementId);
			}
		},{
			field : 'paymentState',
			title : '货款跟踪状态',
			sortable : true,
			width : 120,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.payState);
			}
		},{
			field : 'invState',
			title : '开票跟踪状态',
			sortable : true,
			width : 120,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.invState);
			}
		},{
			field : 'operatorDepDisplay',
			title : '经办部门',
			sortable : true,
			width : 200
		},{
			field : 'logCodeDisplay',
			title : '经办人',
			sortable : true,
			width : 120
		},{
			field : 'remark',
			title : '备注',
			sortable : true
		} ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pcarrierCarTypeSize : 10,//注意，pcarrierCarTypeSize必须在pcarrierCarTypeList存在
		pcarrierCarTypeList : [ 2, 10, 50, 100 ],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		toolbar : '#purchaseReturnDataGrid_toolbar',
		onCheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.param,this).check();
		},
		onCheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.param,this).check();
		},
		onUncheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.param,this).unCheck();
		},
		onUncheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.param,this).unCheck();
		},
		onSelect : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.param,this).select();
		},
		onUnselectAll : function(rows) {
			action_controller(
					glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.param,this).unSelect();
		},
		onLoadSuccess : function(index, record) {//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
			var rows=$(this).datagrid("getRows");
			if(rows.length==0){   
				var body = $(this).data().datagrid.dc.body2;
				body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
			}
		},
		onDblClickRow : function(rowIndex, rowData){ 
			info(rowData);
	 	}
	});
	
	function info(rowData){
		$("#layout_center_panel").panel("setTitle","采购退货合同详情"); 
		$("#layout_center_panel").panel("refresh",ctx +"/do/purchaseReturn/intoDetail.htm?purReturnId="+ rowData.purReturnId);
  	} 
	
	//批量禁用
	glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.batchDisablePurchaseReturn=function(){ 
		var rows =glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.purchaseReturnDataGrid.datagrid("getChecked");
		var purReturnIds = [];//启用的id标识 
		for ( var i = 0; i < rows.length; i++) {
			purReturnIds.push(rows[i].purReturnId);  
		 }
		if (purReturnIds.length > 0) {
		$.messager.confirm('请确认','是否要启用这些记录?',function(r){
            if (r){
            	 $.ajax({ 
            		type: "POST",
            	    url : ctx+ '/do/purchaseReturn/enableOrDisable.json?status=disable',
					data : {
						purReturnIds : purReturnIds.join(',') 
					},
					dataType : 'json',
					success : function(r) {
						if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
							$.messager.show({
								title : '提示',
								timeout : 3000,
								msg : r.msg
							});
							glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.purchaseReturnDataGrid.datagrid('reload');
						} else {
							$.messager.show({//后台验证弹出错误提示信息框
										title : '错误提示',
										width : 380,
										height : 120,
										msg : '<span style="color:red">'+ r.msg+ '<span>',
										timeout : 4500
							 });
						}
					}
				});
			}
		});
		}
	}  
	//下拉项的值
	$('#purchaseReturnSearchForm_enabled').combobox({
		valueField : 'value',
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		data : fields.status
	});
	
</script>

<!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="purchaseReturnPanel" data-options="region:'center',border:true">
		<table id="purchaseReturnDataGrid">
			<glacierui:toolbar panelEnName="BatchDisableRetList"
				toolbarId="purchaseReturnDataGrid_toolbar" menuEnName="batchDisableRet" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="purchaseReturnSearchForm">
			<table>
				<tr>
					<td>订购单号：</td>
					<td><input name="returnCode" style="width: 80px;"class="spinner" /></td>
					<td>供应商：</td>
					<td><input name="supplierIdDisplay" style="width: 80px;"class="spinner" /></td>
				    <td>仓库：</td>
					<td><input name="storageDisplay" style="width: 80px;"class="spinner" /></td>
					<td>状态：</td>
					<td><input id="purchaseReturnSearchForm_enabled" name="enabled" style="width: 80px;"/></td> 
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.purchaseReturnDataGrid.datagrid('load',glacier.serializeObject($('#purchaseReturnSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#purchaseReturnSearchForm input').val('');glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.purchaseReturnDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>