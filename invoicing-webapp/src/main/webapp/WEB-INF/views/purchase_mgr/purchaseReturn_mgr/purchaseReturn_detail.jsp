<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<style type="text/css">
	
#text_file:link { text-decoration: none;color: black}
#text_file:active { text-decoration:none}
#text_file:hover { text-decoration:none;color: black}
#text_file:visited { text-decoration: none;color: black}
	
</style> 

<script type="text/javascript">

$.util.namespace('glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturnDetail');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

//定义toolbar的操作，对操作进行控制
glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturnDetail.param = {
	toolbarId : 'purchaseReturnDetail_toolbar',
	actions : {
            edit:{flag:'edit',controlType:'single'},
            del:{flag:'del',controlType:'multiple'},
            state:{flag:'state',controlType:'single'}
         }
 };
</script>
<form id="purchaseReturn_detail_form" method="post" >
<table class="detailtable">
 <glacierui:toolbar panelEnName="PurchaseReturnList" toolbarId="purchaseReturnDataGrid_toolbar" menuEnName="purchaseReturn"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
					 <tr>
					     <td colspan="8">
					       <hr> 
					        <c:if test="${purchaseReturnDate.enabled == 'disable'}">   
					  			<div style="display:inline;margin-left:5px;color: red;margin-top: 10px;width: 40px;height: 18px;font-size: 5;border: solid;border-width: 2px;font-family: 微软雅黑">已禁用 </div> 
							</c:if>   
				    		<c:if test="${purchaseReturnDate.auditState == 'pass'}">   
					 		   <div style="display:inline;margin-left:5px;color: red;margin-top: 10px;width: 40px;height: 18px;font-size: 5;border: solid;border-width: 2px;font-family: 微软雅黑">已审核 </div> 
							</c:if> 
						      <div style="margin-left: 400px;display:inline;">
						        <font size="3" style="margin-top: 30px"><b>采购退货详情</b></font> 
						      </div>
						     <hr> 
					     </td>
					 </tr>
					<tr> 
				        <td style="padding-left:10px;">退款编号：</td>
						<td>
						     <input id="returnCode" name="returnCode" class="spinner" style="width:168px;" value="${purchaseReturnDate.returnCode}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">所属仓库：</td>
						<td>
							<input id="storage" name="storage" class="spinner" style="width:168px" value="${purchaseReturnDate.storageDisplay }"  readonly="readonly"/>
						</td> 
					    <td style="padding-left:10px;">供应商：</td>
						<td><input id="supplierId" name="supplierId" class="spinner" style="width:168px" value="${purchaseReturnDate.supplierIdDisplay }" readonly="readonly"/></td>
						 <td style="padding-left:10px;">供应地址：</td>
						<td><input id="supplierAdd" name="supplierAdd" class="spinner" style="width:168px" value="${purchaseReturnDate.supplierAdd}" readonly="readonly"/></td>
					  </tr>   
					  <tr>
					    <td style="padding-left:10px;">经办部门：</td>
						<td ><input  name="fax" class="spinner" style="width:168px" value="${purchaseReturnDate.operatorDepDisplay}" readonly="readonly"/></td>
				        <td style="padding-left:10px;">经办人：</td>
						<td >
						    <input id="logCode" name="logCode" class="spinner" style="width:168px;" value="${purchaseReturnDate.logCodeDisplay}" readonly="readonly"/>
						</td>
						<td style="padding-left:10px;">审核状态：</td>
						<td><input id="auditState" name="auditState"  class="spinner" style="width:168px" value="${purchaseReturnDate.auditState}" readonly="readonly"/></td>
				 	    <td style="padding-left:10px;">启用/禁用：</td>
					    <td><input id="enabled" name="enabled" class="spinner" style="width:168px" value="${purchaseReturnDate.enabled=='disable'?'禁用':'启用'}" readonly="readonly"/></td>
				    </tr>
				 	<tr>
					     <td style="padding-left:10px;">退货方式：</td>
						<td><input class="spinner" style="width:168px" value="${ purchaseReturnDate.returnedPurchaseTypeDisplay}" readonly="readonly"/></td>
					    <td style="padding-left:10px;">退货期限：</td>
						<td><input class="spinner" style="width:168px" value="<fmt:formatDate value='${purchaseReturnDate.returnDeadlines}' pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					     <td style="padding-left:10px;">退货原因：</td>
					     <td><input class="spinner" style="width:168px" value="${purchaseReturnDate.returnReasonDisplay}" readonly="readonly"/></td>
				 	     <td style="padding-left:10px;">退货说明：</td>
					    <td><input  id="returnPolicy" name="returnPolicy" class="spinner" style="width:168px" value="${purchaseReturnDate.returnPolicy }" readonly="readonly"/></td>
					 </tr> 
					 <tr> 
				        <td style="padding-left:10px;">退货金额：</td>
					    <td >
					      <input id="refundTotal" name="refundTotal" class="spinner" style="width:168px;" value="<fmt:formatNumber value='${purchaseReturnDate.refundTotal}' pattern="#,#00.00元"/>" readonly="readonly"/>
					    </td> 
				        <td style="padding-left:10px;">运费总额：</td>
						<td>
							<input id="logTotalAmount" name="logTotalAmount" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.logTotalAmount }' pattern="#,#00.00元"/>" readonly="readonly"/>
						</td>
					     <td style="padding-left:10px;">物流公司：</td>
						<td ><input name="logCompany" class="spinner" style="width:168px"  value='${purchaseReturnDate.logCompany}'  readonly="readonly"/></td>
					    <td style="padding-left:10px;">物流联系人：</td>
						<td><input id="logLinkman" name="logLinkman" class="spinner" style="width:168px" value="${purchaseReturnDate.logLinkman}"  readonly="readonly"/></td>
					 </tr>
					 <tr> 
				        <td style="padding-left:10px;">物流电话：</td>
						<td >
						    <input id="logPhone" name="logPhone" class="spinner" style="width:168px;" value="${purchaseReturnDate.logPhone}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">跟踪状态：</td>
						<td>
							<input id="paymentState" name="paymentState" class="spinner" style="width:168px" value="${purchaseReturnDate.paymentState }"  readonly="readonly"/>
						</td>  
					   <td style="padding-left:10px;">结算方式：</td>
					   <td><input id="logSettlement"  name="logSettlement" class="spinner" style="width:168px" value='${purchaseReturnDate.logSettlement}' readonly="readonly"/></td>
						<td style="padding-left:10px;">未付款金额：</td>
						<td>
							<input id="notPayAmo" name="notPayAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.notPayAmo }' pattern="#,#00.00元"/>" readonly="readonly"/>
						</td>
					 </tr> 
					  <tr> 
				        <td style="padding-left:10px;">已付款金额：</td>
						<td >
						    <input id="alrPayAmo" name="alrPayAmo" class="spinner" style="width:168px;" value="<fmt:formatNumber value='${purchaseReturnDate.alrPayAmo}' pattern="#,#00.00元"/>" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">开票状态：</td>
						<td>
							<input id="invState" name="invState" class="spinner" style="width:168px" value="${purchaseReturnDate.invState }"  readonly="readonly"/>
						</td> 
					    <td style="padding-left:10px;">未开票金额：</td>
						<td><input id="notInvAmo"  name="notInvAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.notInvAmo}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">已开票金额：</td>
						<td><input name="alrInvAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.alrInvAmo}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					</tr>
					<tr>
					  <td style="padding-left:10px;">创建人：</td>
					 <td><input class="spinner" style="width:168px"   value="${purchaseReturnDate.creater}" readonly="readonly"/></td> 
				      <td style="padding-left:10px;">创建时间：</td>
					 <td><input class="spinner" style="width:168px"    value="<fmt:formatDate value="${purchaseReturnDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
				     <td style="padding-left:10px;">更新人：</td>
					 <td><input class="spinner" style="width:168px"   value="${purchaseReturnDate.updater}" readonly="readonly"/></td>
				     <td style="padding-left:10px;">更新时间：</td>
					 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${purchaseReturnDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
				     <tr> 
					 	<td style="padding-left:10px;">备 注：</td>
						<td colspan="7"> <textarea   name="remark" class="spinner" style="width:920px;" readonly="readonly" >${purchaseReturnDate.remark}</textarea></td>
					 </tr> 
					  <tr>
					      <td style="padding-left:10px;">附件：</td>
					      <td colspan="7">
					          <c:if test="${empty purchaseReturnDate.accessory}"> 
					            <textarea   name="accessory" class="spinner" style="width:920px;" readonly="readonly" >暂无内容</textarea>
					          </c:if>
					          <c:if test="${!empty purchaseReturnDate.accessory}"> 
					                <label id="fileText" style="float: left;height:50px;"></label>
					                <a style="margin-top: 10px;margin-left: 5px;" href="javascript:doFiledown();" class="easyui-linkbutton" data-options="iconCls:'icon-hamburg-down'" >下载</a>
					          </c:if>
					      </td>
				  	  </tr>   
	              </table> 
	      <hr> 
	      <div style="margin-left: 410px">
	         <font size="3" style="margin-top: 30px"><b>货品详情</b></font> 
	      </div> 
	      <hr>     
  </form> 
   <div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="purchaseReturnDetailSearchForm">
		 <input type="hidden" name="orderId" value="${purchaseReturnDate.purReturnId }">
			<table>
				<tr>
					<td>货品名称：</td>
					<td><input name="goodsName" style="width: 80px;"class="spinner" /></td> 
					<td>交货期限：</td>
					<td><input name="deadline" class="easyui-datebox"
						style="width: 100px;" /> - <input name="deadlineEndTime"
						class="easyui-datebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturnDetail.purchaseReturnDetailDataGrid.datagrid('load',glacier.serializeObject($('#purchaseReturnDetailSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#purchaseReturnDetailSearchForm input').val('');glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturnDetail.purchaseReturnDetailDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="purchaseReturnPanel" style="height: auto;margin-bottom: 50px" data-options="region:'center',border:true">
		<table id="purchase_return_detail" style="height: auto">  
		</table> 
</div>  
  
  
  
 <SCRIPT>
 
 if('${purchaseReturnDate.accessory}'!=null&&'${purchaseReturnDate.accessory}'!=""){
	     var AllImgExt=".jpg|.jpeg|.gif|.bmp|.png|";//全部图片格式类型 
		 var filename='${purchaseReturnDate.accessory}'.substring('${purchaseReturnDate.accessory}'.lastIndexOf("/")+1,'${purchaseReturnDate.accessory}'.length);
		 var FileExt='${purchaseReturnDate.accessory}'.substr('${purchaseReturnDate.accessory}'.lastIndexOf(".")).toLowerCase();
		 if(AllImgExt.indexOf(FileExt+"|")!=-1){
				$("<img src='${purchaseReturnDate.accessory}'  width='50' height='50'/>").appendTo("#fileText");
			}else{
				$("<a href='#' style='padding-top:15px;line-height:50px;' id='text_file'>"+filename+"</a>").appendTo("#fileText");
		  }
 }
 
 function doFiledown(){
     location.href='${purchaseReturnDate.accessory}';  
 }
 
 $dg=$('#purchase_return_detail');

 glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturnDetail.purchaseReturnDetailDataGrid = $('#purchase_return_detail').datagrid({  
		fit : false,//控件自动resize占满窗口大小
		iconCls : 'icon-save',//图标样式
		border : true,//是否存在边框 
		fitColumns : true,//自动填充行
		nowrap : true,//禁止单元格中的文字自动换行
		autoRowHeight : false,//禁止设置自动行高以适应内容
		striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect : true,//限制单选
		checkOnSelect : false,//选择复选框的时候选择该行
		selectOnCheck : false,//选择的时候复选框打勾 
	    url: ctx + '/do/purchaseReturn/returnDetail.json?purReturnId=${purchaseReturnDate.purReturnId}',   
		sortName : 'goodsCode',//排序字段名称
		sortOrder : 'DESC',//升序还是降序
		remoteSort : true,//开启远程排序，默认为false
		idField : 'purReturnDetId', 
	    columns:[[    
	        {field :'purReturnDetId', title : 'ID', hidden:true}, 
	        {field:'goodsCode',title:'货品编码',width:100},    
	        {field:'goodsName',title:'名称',width:100},    
	        {field:'goodsModel',title:'规格型号',width:100},   
	        {field:'goodsNnit',title:'单位',width:100},  
	        {field:'placeOfOrigin',title:'产地',width:100}, 
	        {field:'primeCost',title:'原价',width:100}, 
	        {field:'cess',title:'税率',width:100}, 
	        {field:'deadline',title:'交货期限',width:100},
	        {field:'price',title:'单价',width:100},  
	        {field:'quantity',title:'数量',width:100},  
	        {field:'money',title:'金额',width:100},
	        {field:'notPayNum',title:'未付款数量',width:100},
	        {field:'alrPayNum',title:'已付款数量',width:100},
	        {field:'notInvNum',title:'未开票数量',width:100},
	        {field:'alrInvNum',title:'已开票数量',width:100},
	        {field:'remark',title:'备注',width:100}
	    ]], 
		rownumbers : true,//True 就会显示行号的列
		onLoadSuccess:function(){ 
			compute(); //添加统计行
		},
		onLoadSuccess:function(data){
		   	 compute();
		},
		onDblClickRow : function(rowIndex, rowData){
	        $.easyui.showDialog({
					title : '商品【' + rowData.goodsName + '】详细信息',
					href : ctx+ '/do/purchaseOrderDetail/intoDetail.htm?purOrderDetId='+ rowData.purOrderDetId,//从controller请求jsp页面进行渲染
					width : 560,
					height : 390,
					resizable : false,
					enableApplyButton : false,
					enableSaveButton : false
				});
			}
	});  
 
 
//底部统计
 function compute(){//计算函数 
 	//获取数据行
   var rows = $dg.datagrid('getRows'); 
   var moneyTotal = 0,
 	  quantityTotal = 0,
 	  alrArrNumTotal=0,
 	  notArrNumTotal=0,
 	  alrTerNumTotal=0,
 	  alrTerMoneyTotal=0;//计算总和
   if(rows.length >1){
 	    //新增一行显示统计信息
 	    var computeRow = $dg.datagrid('getData').rows[rows.length-1];//获取某一行数据
 	    var row=$dg.datagrid('getSelected');//获取当前选中的行 
 	    for (var i = 0; i < rows.length; i++) { 
    			moneyTotal += parseFloat(rows[i]['money']);
    			quantityTotal += parseInt(rows[i]['quantity']);
    			alrArrNumTotal += parseInt(rows[i]['alrArrNum']);
    			notArrNumTotal +=parseInt(rows[i]['notArrNum']);
    			alrTerNumTotal += parseInt(rows[i]['alrTerNum']);
    			alrTerMoneyTotal +=parseFloat(rows[i]['alrTerMoney']);  
 	    }
     	$dg.datagrid('appendRow', { 
 	    	goodsCode: '<b>统计：</b>', 
 	    	money: moneyTotal,
 	    	quantity: quantityTotal,
 	    	alrArrNum: alrArrNumTotal,
 	    	notArrNum: notArrNumTotal,
 	    	alrTerNum: alrTerNumTotal,
 	    	alrTerMoney: alrTerMoneyTotal 
 	       }
 	    );
   }  
 }
 
  
 
  //跟踪状态
    $("#paymentState").val(renderGridValue('${purchaseReturnDate.paymentState}',fields.payState));
    //结算方式
    $("#logSettlement").val(renderGridValue('${purchaseReturnDate.logSettlement}',fields.logSettlementId));
    //开票状态
    $("#invState").val(renderGridValue('${purchaseReturnDate.invState}',fields.invState));
    //审核状态
    $('#auditState').val(renderGridValue('${purchaseReturnDate.auditState}',fields.auditState)); 
  		
</script>  