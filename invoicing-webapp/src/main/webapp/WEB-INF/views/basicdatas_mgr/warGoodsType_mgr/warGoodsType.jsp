<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.param = {
		toolbarId : 'warGoodsTypeDataGrid_toolbar',
		actions : {
	            edit:{flag:'edit',controlType:'single'},
	            del:{flag:'del',controlType:'multiple'},
	            state:{flag:'state',controlType:'single'}
	         }
     };

	//初始化DataGrid
	glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.warGoodsTypeDataGrid = $('#warGoodsTypeDataGrid').datagrid({
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
		url : ctx + '/do/warGoodsType/list.json',
		sortName : 'orderNum',//排序字段名称
		sortOrder : 'DESC',//升序还是降序
		remoteSort : true,//开启远程排序，默认为false
		idField : 'warGoodsTypeId',
		columns : [ [ {
			field : 'warGoodsTypeId',
			title : 'ID',
			checkbox : true
		}, {
			field : 'name',
			title : '仓库货品名称',
			width : 120,
			sortable : true
		},{
			field : 'orderNum',
			title : '序号',
			sortable : true,
			width : 120
		},{
			field : 'enabled',
			title : '是否启用',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.status);
			}
		},{
			field : 'creater',
			title : '创建人',
			sortable : true,
			width : 120
		},{
			field : 'createTime',
			title : '创建时间',
			sortable : true,
			width : 200
		},{
			field : 'updater',
			title : '更新人',
			sortable : true,
			width : 120
		}, {
			field : 'updateTime',
			title : '更新时间',
			sortable : true,
			width : 200
		},{
			field : 'remark',
			title : '备注',
			sortable : true
		} ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pcarrierCarTypeSize : 10,//注意，pcarrierCarTypeSize必须在pcarrierCarTypeList存在
		pcarrierCarTypeList : [ 2, 10, 50, 100 ],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		toolbar : '#warGoodsTypeDataGrid_toolbar',
		onCheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.param,this).check();
		},
		onCheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.param,this).check();
		},
		onUncheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.param,this).unCheck();
		},
		onUncheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.param,this).unCheck();
		},
		onSelect : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.param,this).select();
		},
		onUnselectAll : function(rows) {
			action_controller(
					glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.param,this).unSelect();
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
          $.easyui.showDialog({
				title : '【' + rowData.name + '】详细信息',
				href : ctx+ '/do/warGoodsType/intoDetail.htm?warGoodsTypeId='+ rowData.warGoodsTypeId,//从controller请求jsp页面进行渲染
				width : 540,
				height : 250,
				resizable : false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.addWarGoodsType= function(){
		glacier.basicAddOrEditDialog({
			title : '【退货原因】- 增加',
			width : 380,
			height : 200,
			queryUrl : ctx + '/do/warGoodsType/intoForm.htm',
			submitUrl : ctx + '/do/warGoodsType/add.json',
			successFun : function (){
				glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.warGoodsTypeDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.editWarGoodsType= function(){
		var row =glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.warGoodsTypeDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【退货原因】- 编辑',
			width : 380,
			height : 200,
			queryUrl : ctx + '/do/warGoodsType/intoForm.htm',
			submitUrl : ctx + '/do/warGoodsType/edit.json',
			queryParams : {
				warGoodsTypeId : row.warGoodsTypeId
			},
			successFun : function (){
				glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.warGoodsTypeDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.delWarGoodsType= function() {
		var rows =glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.warGoodsTypeDataGrid.datagrid("getChecked");
		var warGoodsTypeIds = [];//删除的id标识
		
		for ( var i = 0; i < rows.length; i++) {
			warGoodsTypeIds.push(rows[i].warGoodsTypeId);
		}
		if (warGoodsTypeIds.length > 0) {
			$.messager.confirm('请确认','是否要删除该记录',function(r){
                   if (r){
                   	 $.ajax({ 
                   		type: "POST",
                   	    url : ctx+ '/do/warGoodsType/del.json',
						data : {
							warGoodsTypeIds : warGoodsTypeIds.join(','),
						},
						dataType : 'json',
						success : function(r) {
							if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
								$.messager.show({
									title : '提示',
									timeout : 3000,
									msg : r.msg
								});
								glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.warGoodsTypeDataGrid.datagrid('reload');
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
	};
	
	//下拉项的值
	$('#warGoodsTypeSearchForm_enabled').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.status
	});
	
</script>

<!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="returnReasonPanel" data-options="region:'center',border:true">
		<table id="warGoodsTypeDataGrid">
			<glacierui:toolbar panelEnName="WarGoodsTypeList"
				toolbarId="warGoodsTypeDataGrid_toolbar" menuEnName="warGoodsType" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="warGoodsTypeSearchForm">
			<table>
				<tr>
					<td>仓库货品：</td>
					<td><input name="name" style="width: 80px;"
						class="spinner" /></td> 
					<td>状态：</td>
					<td><input id="warGoodsTypeSearchForm_enabled" name="enabled" style="width: 80px;"
						 /></td> 
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.warGoodsTypeDataGrid.datagrid('load',glacier.serializeObject($('#warGoodsTypeSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#warGoodsTypeSearchForm input').val('');glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.warGoodsTypeDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>