<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.variables_mgr.variables');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制 
	glacier.basicdatas_mgr.variables_mgr.variables.param = {
			toolbarId : 'variablesDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化系统变量DataGrid
	glacier.basicdatas_mgr.variables_mgr.variables.variablesDataGrid = $('#variablesDataGrid').datagrid({
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
		url: ctx + '/do/variables/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'variablesId',
		columns:[[
			{
				field:'variablesId',
				title:'ID',
				checkbox:true
			},{
				field:'variableName',
				title:'变量名',
				width:200,
				sortable:true
			},{
				field:'parameterValues',
				title:'参数值',
				width:200,
				sortable:true
			},{
				field:'specification',
				title:'参数说明',
				width:200,
				sortable:true
			},{
				field:'inputTip',
				title:'输入提示',
				width:200,
				sortable:true
			},{
				field:'formType',
				title:'表单类型',
				width:200,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如input显示输入框，textarea显示文本框
					return renderGridValue(value,fields.formType);
				}
			},{
				field:'createrDisplay',
				title:'创建人',
				sortable:true,
				width:120
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:230
			},{
				field:'updaterDisplay',
				title:'更新人',
				sortable:true,
				width:120
			},{
				field:'updateTime',
				title:'更新时间',
				sortable:true,
				width:230
			},{
				field:'remark',
				title:'备注',
				width:120,
				sortable:true
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pvariablesSize : 10,//注意，pvariablesSize必须在pvariablesList存在
		pvariablesList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#variablesDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.variables_mgr.variables.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.basicdatas_mgr.variables_mgr.variables.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.variables_mgr.variables.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.basicdatas_mgr.variables_mgr.variables.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.variables_mgr.variables.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.basicdatas_mgr.variables_mgr.variables.param,this).unSelect();
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
				title: "【"+rowData.variableName+"】的系统变量详细信息",
				href : ctx + '/do/variables/intoDetail.htm?variablesId='+rowData.variablesId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 310,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.variables_mgr.variables.addVariables = function(){
		glacier.basicAddOrEditDialog({
			title : '【系统变量】- 增加',
			width : 400,
			height : 330,
			queryUrl : ctx + '/do/variables/intoForm.htm',
			submitUrl : ctx + '/do/variables/add.json',
			successFun : function (){
				glacier.basicdatas_mgr.variables_mgr.variables.variablesDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.variables_mgr.variables.editVariables = function(){
		var row = glacier.basicdatas_mgr.variables_mgr.variables.variablesDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【系统变量】- 编辑('+row.variableName+')',
			width : 400,
			height : 330,
			queryUrl : ctx + '/do/variables/intoForm.htm',
			submitUrl : ctx + '/do/variables/edit.json',
			queryParams : {
				variablesId : row.variablesId
			},
			successFun : function (){
				glacier.basicdatas_mgr.variables_mgr.variables.variablesDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.variables_mgr.variables.delVariables = function(){
		var rows = glacier.basicdatas_mgr.variables_mgr.variables.variablesDataGrid.datagrid("getChecked");
		var variablesIds = [];//删除的id标识
		var variableNames = [];//系统变量
		for(var i=0;i<rows.length;i++){
			variablesIds.push(rows[i].variablesId);
			variableNames.push(rows[i].variableName);
		}
		if(variablesIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/variables/del.json',
						   data: {variablesIds:variablesIds.join(','),variableNames:variableNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.basicdatas_mgr.variables_mgr.variables.variablesDataGrid.datagrid('reload');
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
	//系统变量资料模糊查询
	glacier.basicdatas_mgr.variables_mgr.variables.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.basicdatas_mgr.variables_mgr.variables.variablesDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有系统变量列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="variablesGridPanel" data-options="region:'center',border:true" >
		<table id="variablesDataGrid">
			<glacierui:toolbar panelEnName="VariablesList" toolbarId="variablesDataGrid_toolbar" menuEnName="variables"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>