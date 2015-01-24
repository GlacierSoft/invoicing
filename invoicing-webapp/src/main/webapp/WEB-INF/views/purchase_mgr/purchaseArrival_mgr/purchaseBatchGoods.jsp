<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	
	$.util.namespace('glacier.basicdatas_mgr.goodsList_mgr.goodsList');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.basicdatas_mgr.goodsList_mgr.goodsList.param = {
		toolbarId : 'GoodsListDataGrid_toolbar',
		actions : { 
	         }
     };

	//初始化DataGrid
	glacier.basicdatas_mgr.goodsList_mgr.goodsList.goodsListDataGrid = $('#goodsListDataGrid').datagrid({
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
		url : ctx + '/do/goodsList/list.json?storageVal='+storageVal,
		sortName : 'createTime',//排序字段名称
		sortOrder : 'DESC',//升序还是降序
		remoteSort : true,//开启远程排序，默认为false
		idField : 'goodsId',
		columns : [ [
		   {field:'goodsId',title:'ID',width:100,checkbox:true},
           {field:'goodsCode',title:'货品编码',width:100},    
           {field:'goodsName',title:'名称',width:100},    
           {field:'goodsTypeId',title:'货品分类',width:100},
           {field:'specification',title:'规格型号',width:100}, 
           {field:'unit',title:'单位',width:100},
           {field:'origin',title:'产地',width:100},
           {field:'taxRate',title:'税率',width:100,hidden:true}
        ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pcarrierCarTypeSize : 10,//注意，pcarrierCarTypeSize必须在pcarrierCarTypeList存在
		pcarrierCarTypeList : [ 2, 10, 50, 100 ],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		toolbar : '#GoodsListDataGrid_toolbar',
		toolbar: [{
	        text: '添加商品档案', iconCls: 'icon-standard-pencil-add', handler: function () { 
	        	glacier.basicdatas_mgr.goodsList_mgr.goodsList.addGoodsList();
	          }
	        }],  
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
				title : '【' + rowData.goodsName + '】详细信息',
				href : ctx+ '/do/goodsList/intoDetail.htm?goodsId='+ rowData.goodsId,//从controller请求jsp页面进行渲染
				width : 600,
				height : 460,
				resizable : false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.goodsList_mgr.goodsList.addGoodsList= function(){
		glacier.basicAddOrEditDialog({
			title : '【货物档案】- 增加',
			width : 620,
			height : 420,
			queryUrl : ctx + '/do/goodsList/intoForm.htm',
			submitUrl : ctx + '/do/goodsList/add.json',
			successFun : function (){
				glacier.basicdatas_mgr.goodsList_mgr.goodsList.goodsListDataGrid.datagrid('reload');
			}
		});
	};  
	
	//下拉项的值
	$('#goodsListSearchForm_enabled').combobox({
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
	<div id="goodsListPanel" data-options="region:'center',border:true">
		<table id="goodsListDataGrid">
			  
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="goodsListSearchForm">
			<table>
				<tr>
					<td>商品名称：</td>
					<td><input name="goodsName" style="width: 80px;"class="spinner" /></td>
					 <td>货物类型：</td>
					<td><input name="goodsTypeId" style="width: 80px;"class="spinner" /></td>
					  
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.basicdatas_mgr.goodsList_mgr.goodsList.goodsListDataGrid.datagrid('load',glacier.serializeObject($('#goodsListSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#goodsListSearchForm input').val('');glacier.basicdatas_mgr.goodsList_mgr.goodsList.goodsListDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>