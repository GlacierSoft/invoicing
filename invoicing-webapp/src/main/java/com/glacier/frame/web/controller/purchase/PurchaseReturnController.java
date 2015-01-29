/**
 * @Title: PurchaseReturnController.java 
 * @Package com.glacier.frame.web.controller.purchase 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-16 下午4:25:24 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-16
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.purchase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.basic.util.JackJson;
import com.glacier.frame.dto.query.purchase.PurchaseReturnQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseReturn;
import com.glacier.frame.service.basicdatas.ParPurchaseReturnReasonService;
import com.glacier.frame.service.basicdatas.ParPurchaseReturnedTypeService;
import com.glacier.frame.service.basicdatas.SuppliersService;
import com.glacier.frame.service.basicdatas.WarehouseService;
import com.glacier.frame.service.purchase.PurchaseReturnService;
import com.glacier.frame.service.system.DepService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: PurchaseReturnController 
 * @Description: TODO(采购退货控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-16 下午4:25:24
 */
@Controller
@RequestMapping(value = "/purchaseReturn")
public class PurchaseReturnController {
	@Autowired
    private PurchaseReturnService purchaseReturnService;
	
	@Autowired
	private WarehouseService warehouseService;
	
	@Autowired
	private DepService depService;
	
	@Autowired
	private SuppliersService suppliersService;
	
	@Autowired
	private ParPurchaseReturnedTypeService returnedTypeService;
	
	@Autowired
	private ParPurchaseReturnReasonService returnReasonService;
	
	// 进入采购退货信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseReturn_mgr/purchaseReturn");
        return mav;
    } 
    
    //货物信息展示页
    @RequestMapping(value="/showGoods.htm")
    private Object goodsIndex() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseReturn_mgr/goods");
        return mav;
    }

    //附件上传页
    @RequestMapping(value="/upload.htm")
    private Object doUpload() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseReturn_mgr/upload");
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, PurchaseReturnQueryDTO purchaseReturnQueryDTO) {
        return purchaseReturnService.listAsGrid(jqPager, purchaseReturnQueryDTO);
    }
    
    // 进入采购退货信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoReturnReasonDetail(String purReturnId) { 
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseReturn_mgr/purchaseReturn_detail");
        if(StringUtils.isNotBlank(purReturnId)){
            mav.addObject("purchaseReturnDate", purchaseReturnService.getPurchaseReturn(purReturnId));
        }
        return mav;
    }
    
    // 进入采购退货信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String purReturnId) {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseReturn_mgr/purchaseReturn_form");
        //仓库信息获取
        mav.addObject("allWareHouseDate",warehouseService.getWareHouseCombo());
        //获取部门信息
        mav.addObject("allDepTreeNodeData", depService.getAllTreeDepNode(true));
        //获取供应商信息
        mav.addObject("allSuppliesTreeNodeData",suppliersService.getSuppliersCombo());
        //获取退货方式信息
        mav.addObject("allReturnTypeData",returnedTypeService.listAllGrid());
        //获取退货原因信息
        mav.addObject("allReturnReasonData",returnReasonService.listAllGrid());        
        //判断主键标志
        if(StringUtils.isNotBlank(purReturnId)){
            mav.addObject("purchaseReturnDate", purchaseReturnService.getPurchaseReturn(purReturnId));
        }
        return mav;
    }
    
    //增加采购退货信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid PurchaseReturn purchaseReturn, BindingResult bindingResult) {
        return purchaseReturnService.addPurchaseReturn(purchaseReturn);
    }
    
    //修改采购退货类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid PurchaseReturn purchaseReturn, BindingResult bindingResult) {
        return purchaseReturnService.editPurchaseReturn(purchaseReturn);
    }
    
    //删除采购退货信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> purReturnIds) {
        return purchaseReturnService.delPurchaseReturn(purReturnIds);
    }
    
    //附件上传
    @RequestMapping(value="/uploadFile",method=RequestMethod.POST)
    @ResponseBody
    public Object uploadFile(HttpServletResponse response,HttpServletRequest request) throws IOException{ 
       MultipartHttpServletRequest multipartRequest=(MultipartHttpServletRequest)request;
       Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();    
       //构建返回结果集
       List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
       //文件保存路径
       String extendPath=request.getSession().getServletContext().getRealPath("/")+File.separator+"uploadFiles";
       //文件命名
       SimpleDateFormat sf=new SimpleDateFormat("yyyyMM");
       String real_date=sf.format(new Date());
       extendPath+=File.separator+real_date+File.separator;
       //文件路径输出
       System.out.println("文件存放地址:"+extendPath);
       //创建文件夹
       File file=new File(extendPath);
       if(!file.exists()){
    	   file.mkdirs();
       }
       //文件存储
       String fileName=null;
       for(Map.Entry<String ,MultipartFile> entity : fileMap.entrySet()){
    	   //文件上传
    	   MultipartFile mf=entity.getValue();
    	   fileName=mf.getOriginalFilename();
    	   //文件名输出
    	   System.out.println("当前要存放的文件名称为:"+fileName);
    	   File uploadFile=new File(extendPath+fileName);
    	   try{
    		   FileCopyUtils.copy(mf.getBytes(),uploadFile ); 
    		}catch(IOException e){
    		   e.printStackTrace();
    	   }
    	   //文件存储
    	  Map<String,Object> map=new HashMap<String, Object>();
    	  map.put("name", fileName);
    	  map.put("address", extendPath+fileName);
    	  list.add(map); 
    	}
       return JackJson.fromObjectToJson(list);
    }
}
