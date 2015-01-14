/**
 * @Title: ParWarGoodsTypeController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-14 下午1:34:05 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-14
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.basicdatas;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.basicdatas.ParWarGoodsTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParWarGoodsType;
import com.glacier.frame.service.basicdatas.ParWarGoodsTypeService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: ParWarGoodsTypeController 
 * @Description: TODO(仓库货品分类控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-14 下午1:34:05
 */
@Controller
@RequestMapping(value = "/warGoodsType")
public class ParWarGoodsTypeController {
	@Autowired
    private ParWarGoodsTypeService parWarGoodsTypeService;
    
    // 进入仓库货品信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warGoodsType_mgr/warGoodsType");
        return mav;
    } 

    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParWarGoodsTypeQueryDTO parWarGoodsTypeQueryDTO) {
        return parWarGoodsTypeService.listAsGrid(jqPager, parWarGoodsTypeQueryDTO);
    }
    
    // 进入仓库货品分类信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoReturnReasonDetail(String warGoodsTypeId) { 
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warGoodsType_mgr/warGoodsType_detail");
        if(StringUtils.isNotBlank(warGoodsTypeId)){
            mav.addObject("warGoodsTypeDate", parWarGoodsTypeService.getParWarGoodsType(warGoodsTypeId));
        }
        return mav;
    }
    
    // 进入仓库货品分类信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String warGoodsTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warGoodsType_mgr/warGoodsType_form");
        if(StringUtils.isNotBlank(warGoodsTypeId)){
            mav.addObject("warGoodsTypeDate", parWarGoodsTypeService.getParWarGoodsType(warGoodsTypeId));
        }
        return mav;
    }
    
    //增加仓库货品类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParWarGoodsType parWarGoodsType, BindingResult bindingResult) {
        return parWarGoodsTypeService.addParWarGoodsType(parWarGoodsType);
    }
    
    //修改仓库货品类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParWarGoodsType parWarGoodsType, BindingResult bindingResult) {
        return parWarGoodsTypeService.editParWarGoodsType(parWarGoodsType);
    }
    
    //删除仓库货品信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> warGoodsTypeIds) {
        return parWarGoodsTypeService.delParWarGoodsType(warGoodsTypeIds);
    }
}
