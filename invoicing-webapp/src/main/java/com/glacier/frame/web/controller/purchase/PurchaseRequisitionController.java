///**
// * @Title: PurchaseRequisitionController.java 
// * @Package com.glacier.frame.web.controller.purchase 
// * @author xichao.dong   
// * @email 406592176@qq.com
// * @date 2015-1-15 上午10:39:08 
// * @company (开发公司)    珠海市冰川软件有限公司
// * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
// * @version V1.0
// * @modify (修改) 
// *          <p>
//                第一次修改：
//                时间：2015-1-15
//                修改人：xichao.dong 
//                修改内容简介 ：
//            </p>              
// * @Review (审核人) ：xichao.dong
// * 
// */
//package com.glacier.frame.web.controller.purchase;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.glacier.core.controller.AbstractController;
//import com.glacier.frame.dto.query.purchase.PurchaseRequisitionQueryDTO;
//import com.glacier.frame.entity.basicdatas.GoodsList;
//import com.glacier.frame.entity.purchase.PurchaseRequisition;
//import com.glacier.frame.service.basicdatas.ParPurchaseTypeService;
//import com.glacier.frame.service.basicdatas.WarehouseService;
//import com.glacier.frame.service.purchase.PurchaseRequisitionService;
//import com.glacier.jqueryui.util.JqPager;
//
///**
// * @ClassName: GoodsListService 
// * @Description: TODO(货物档案信息业务层) 
// * @author junjie.zheng
// * @email 1203807137@qq.com
// * @date 2015-1-9 下午3:30:56
// */
//@Controller
//@RequestMapping(value = "/purchaseRequisition")
//public class PurchaseRequisitionController extends AbstractController{
//
//    @Autowired
//    private PurchaseRequisitionService purchaseRequisitionService;
//    
//    @Autowired
//    private WarehouseService warehouseService;
//    
//    @Autowired
//    private ParPurchaseTypeService purchaseTypeService;
//    
//    //进入采购申请信息列表展示页面
//    @RequestMapping(value = "/index.htm")
//    private Object intoIndexPmember() {
//        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseRequisition_mgr/purchaseRequisition");
//        return mav;
//    } 
//    
//    //获取表格结构的所有采购申请数据
//    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
//    @ResponseBody
//    private Object listActionAsGridByMenuId(JqPager jqPager, PurchaseRequisitionQueryDTO carTypeQueryDTO) {
//        return purchaseRequisitionService.listAsGrid(jqPager, carTypeQueryDTO);
//    }
//      
//    //进入采购申请信息Detail信息页面
//    @RequestMapping(value = "/intoDetail.htm")
//    private Object intoMemberGradeDetailPage(String purchaseRequisitionId) { 
//        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseRequisition_mgr/purchaseRequisition_detail");
//        if(StringUtils.isNotBlank(purchaseRequisitionId)){
//            mav.addObject("purchaseRequisitionDate", purchaseRequisitionService.getPurchaseRequisition(purchaseRequisitionId));
//        }
//        return mav;
//    }
//    
//    //进入采购申请信息Form表单页面
//    @RequestMapping(value = "/intoForm.htm")
//    private Object intoGradeFormPnews(String purchaseRequisitionId) {
//        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseRequisition_mgr/purchaseRequisition_form");
//        mav.addObject("warehouseDate", warehouseService.getWareHouseCombo());//仓库
//        mav.addObject("purchaseTypeDate", purchaseTypeService.getParPurchaseTypeCombo());//采购类型
//        if(StringUtils.isNotBlank(purchaseRequisitionId)){
//            mav.addObject("purchaseRequisitionDate", purchaseRequisitionService.getPurchaseRequisition(purchaseRequisitionId));
//        }
//        return mav;
//    }
//        
//    //根据仓库ID查询出所有货物信息展示页面
//    @RequestMapping(value = "/goodsDetail.htm")
//    private Object storageList() {
//        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseRequisition_mgr/purchaseGoods");
//        return mav;
//    }
//    
//    //增加采购申请信息
//    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
//    @ResponseBody
//    private Object addGrade(PurchaseRequisition purchaseRequisition, GoodsList goodsLists) {
//        System.out.println("purchaseRequisition==="+purchaseRequisition);
//        System.out.println("goodsLists==="+goodsLists);
//        return purchaseRequisitionService.addPurchaseRequisition(purchaseRequisition, goodsLists);
//    }
//    
//    //修改采购申请信息
//    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
//    @ResponseBody
//    private Object editGrade(@Valid PurchaseRequisition purchaseRequisition, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {// 后台校验的错误信息
//            return returnErrorBindingResult(bindingResult);
//        }
//        return purchaseRequisitionService.editPurchaseRequisition(purchaseRequisition);
//    }
//    
//    //批量删除采购申请信息
//    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
//    @ResponseBody
//    public Object delGrade(@RequestParam List<String> purReqIds,@RequestParam List<String> reqCodes) {
//        return purchaseRequisitionService.delPurchaseRequisition(purReqIds, reqCodes);
//    }
//}
//
