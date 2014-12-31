<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.question_mgr.question');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制 
	glacier.basicdatas_mgr.question_mgr.question.param = {
			toolbarId : 'questionDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化角色DataGrid
	glacier.basicdatas_mgr.question_mgr.question.questionDataGrid = $('#questionDataGrid').datagrid({
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
		url: ctx + '/do/question/list.json',
		sortName: 'questionNum',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'questionId',
		columns:[[
			{
				field:'questionId',
				title:'ID',
				checkbox:true
			},{
				field:'questionDes',
				title:'问题描述',
				width:200,
				sortable:true
			},{
				field:'questionNum',
				title:'排序',
				width:120,
				sortable:true
			},{
				field:'createrDisplay',
				title:'创建人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:200
			},{
				field:'updaterDisplay',
				title:'更新人',
				sortable:true,
				width:100
			},{
				field:'updateTime',
				title:'更新时间',
				sortable:true,
				width:200
			},{
				field:'remark',
				title:'备注',
				width:140,
				sortable:true
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#questionDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//在用户勾选一行的时候触发事件
			action_controller(glacier.basicdatas_mgr.question_mgr.question.param,this).check();
		},
		onCheckAll:function(rows){//在用户勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.question_mgr.question.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//在用户取消勾选一行的时候触发
			action_controller(glacier.basicdatas_mgr.question_mgr.question.param,this).unCheck();
		},
		onUncheckAll:function(rows){//在用户取消勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.question_mgr.question.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//在用户选择一行的时候触发
			action_controller(glacier.basicdatas_mgr.question_mgr.question.param,this).select();
		},
		onUnselectAll:function(rows){//在用户取消勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.question_mgr.question.param,this).unSelect();
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
				title: "【"+rowData.questionDes+"】的密保问题详细信息",
				href : ctx + '/do/question/intoDetail.htm?questionId='+rowData.questionId,//从controller请求jsp页面进行渲染
				width : 540,
				height : 265,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.question_mgr.question.addQuestion = function(){
		glacier.basicAddOrEditDialog({
			title : '【密保问题】- 增加',
			width : 440,
			height : 260,
			queryUrl : ctx + '/do/question/intoForm.htm',
			submitUrl : ctx + '/do/question/add.json',
			successFun : function (){
				glacier.basicdatas_mgr.question_mgr.question.questionDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.question_mgr.question.editQuestion = function(){
		var row = glacier.basicdatas_mgr.question_mgr.question.questionDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【密保问题】- 编辑('+row.questionDes+')',
			width : 440,
			height : 260,
			queryUrl : ctx + '/do/question/intoForm.htm',
			submitUrl : ctx + '/do/question/edit.json',
			queryParams : {
				questionId : row.questionId
			},
			successFun : function (){
				glacier.basicdatas_mgr.question_mgr.question.questionDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.question_mgr.question.delQuestion = function(){
		var rows = glacier.basicdatas_mgr.question_mgr.question.questionDataGrid.datagrid("getChecked");
		var questionIds = [];//删除的id标识
		var questionDess = [];//日志记录引用名称
		for(var i =0;i<rows.length;i++){
			questionIds.push(rows[i].questionId);
			questionDess.push(rows[i].questionDes);
		}
		if(questionIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/question/del.json',
						   data: {questionIds:questionIds.join(','),questionDess:questionDess.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										width:380,
										height:150,
										msg:r.msg
									});
								   glacier.basicdatas_mgr.question_mgr.question.questionDataGrid.datagrid('reload');
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

<!-- 所有角色列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="questionGridPanel" data-options="region:'center',border:true" >
		<table id="questionDataGrid">
			<glacierui:toolbar panelEnName="QuestionList" toolbarId="questionDataGrid_toolbar" menuEnName="question"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>
