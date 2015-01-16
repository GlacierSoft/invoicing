<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
	   <tr>
		    <td>商品编号:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.goodsCode}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">商品名称：</td> 
			<td class="forminputtable" ><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  --> 
				<input class="spinner" style="width:168px"  value="${purOrderDetailData.goodsName}" readonly="readonly"/>
			</td> 
		</tr> 
		<tr>
			 <td>规格型号:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.goodsModel}" readonly="readonly"/>
		    </td>
			<td style="padding-left: 16px">单位:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.goodsUnit}" readonly="readonly"/>
		    </td>
		</tr> 
		<tr>
		    <td>数量:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.quantity}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">单价:</td>
			<td>
				 <input class="spinner" style="width:168px" value="<fmt:formatNumber value='${purOrderDetailData.price}' pattern="#,#00.00元"/>" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>品牌:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.brand}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">产地:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.placeOfOrigin}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>原价:</td>
			<td>
				 <input class="spinner" style="width:168px" value="<fmt:formatNumber value='${purOrderDetailData.primeCost}' pattern="#,#00.00元"/>"    readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">折扣率:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.discount}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>税率:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.cess}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">金额:</td>
			<td>
				 <input class="spinner" style="width:168px" value="<fmt:formatNumber value='${purOrderDetailData.money}' pattern="#,#00.00元"/>"  readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>交货期限:</td>
			<td>
				 <input class="spinner" style="width:168px" value="<fmt:formatDate value="${purOrderDetailData.deadline}" pattern="yyyy-MM-dd"/>"  readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">未到货数量:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.notArrNum}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>已到货数量:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.alrArrNum}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">已终止数量:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${purOrderDetailData.alrTerNum}" readonly="readonly"/>
		    </td>
		</tr><tr> 
		    <td>未终止金额:</td>
			<td>
				 <input class="spinner" style="width:168px" value="<fmt:formatNumber value='${purOrderDetailData.notTerMoney}' pattern="#,#00.00元"/>"  readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">已终止金额:</td>
			<td>
				 <input class="spinner" style="width:168px" value="<fmt:formatNumber value='${purOrderDetailData.alrTerMoney}' pattern="#,#00.00元"/>"  readonly="readonly"/>
		    </td>
		</tr> 
		<tr>  
			<td>备注:</td>
			<td colspan="3">
				 <input class="spinner" style="width:426px"  value="${purOrderDetailData.remark}" readonly="readonly"/>
		    </td>
		</tr>
		 
	</table>
</form> 
