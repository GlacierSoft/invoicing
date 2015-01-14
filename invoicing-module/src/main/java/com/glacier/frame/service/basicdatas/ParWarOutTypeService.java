/**
 * @Title: ParWarOutTypeService.java 
 * @Package com.glacier.global.service.ParWarOutType
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2015-1-8
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.basicdatas; 
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils; 
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.ParWarOutTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParWarOutTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParWarOutType;
import com.glacier.frame.entity.basicdatas.ParWarOutTypeExample;
import com.glacier.frame.entity.basicdatas.ParWarOutTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParWarOutTypeService
 * @Description: TODO(出库业务类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-14
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParWarOutTypeService {

	@Autowired
	private ParWarOutTypeMapper parWarOutTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有出库业务类型信息) 
     * @param @param jqPager ParWarOutTypeQueryDTO warOutTypeQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParWarOutTypeQueryDTO warOutTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParWarOutTypeExample parWarOutTypeExample = new ParWarOutTypeExample(); 
        Criteria queryCriteria = parWarOutTypeExample.createCriteria();
        warOutTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parWarOutTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parWarOutTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parWarOutTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_war_out_type_"));
        }
        List<ParWarOutType>  parWarOutTypeList = parWarOutTypeMapper.selectByExample(parWarOutTypeExample); // 查询所有出库业务类型列表
        int total = parWarOutTypeMapper.countByExample(parWarOutTypeExample); // 查询总页数
        returnResult.setRows(parWarOutTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getWarOutTypeCombo 
     * @Description: TODO(根据出库业务类型Id查找出库业务类型信息或查询全部,用于Combo的数据绑定) 
     * @param  @param warOutTypeId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getWarOutTypeCombo(String warOutTypeId) {
    	ParWarOutTypeExample parClientExample = new ParWarOutTypeExample();
        if (StringUtils.isNotBlank(warOutTypeId)) {// 可以根据ID查找，如果参数Id为空，则查找所有的数据
        	parClientExample.createCriteria().andOutTypeIdEqualTo(warOutTypeId);
        }
        List<ParWarOutType> parWarOutTypes = parWarOutTypeMapper.selectByExample(parClientExample);
        return JackJson.fromObjectToJson(parWarOutTypes);
    }
    
    /**
	 * @Title: getParWarOutType 
	 * @Description: TODO(根据出库业务类型Id获取出库业务类型信息) 
	 * @param @param parWarOutTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParWarOutType(String parWarOutTypeId) {
    	ParWarOutType parWarOutType = parWarOutTypeMapper.selectByPrimaryKey(parWarOutTypeId);
        return parWarOutType;
    }
    
    /**
     * @Title: addParWarOutType 
     * @Description: TODO(新增出库业务类型) 
     * @param @param parWarOutType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarOutTypeList_add")
    public Object addParWarOutType(ParWarOutType parWarOutType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParWarOutTypeExample parWarOutTypeExample = new ParWarOutTypeExample();
        int count = 0;
        // 防止出库业务类型名称重复
        parWarOutTypeExample.createCriteria().andOutTypeNameEqualTo(parWarOutType.getOutTypeName());
        count = parWarOutTypeMapper.countByExample(parWarOutTypeExample);
        if (count > 0) {
            returnResult.setMsg("出库业务类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parWarOutType.setOutTypeId(RandomGUID.getRandomGUID());
        parWarOutType.setCreater(pricipalUser.getUserCnName());
        parWarOutType.setCreateTime(new Date());
        parWarOutType.setUpdater(pricipalUser.getUserCnName());
        parWarOutType.setUpdateTime(new Date());
        count = parWarOutTypeMapper.insert(parWarOutType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parWarOutType.getOutTypeName() + "] 出库业务类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，出库业务类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParWarOutType 
     * @Description: TODO(修改出库业务类型信息) 
     * @param @param parWarOutType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarOutTypeList_edit")
    public Object editParWarOutType(ParWarOutType parWarOutType) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParWarOutTypeExample parWarOutTypeExample = new ParWarOutTypeExample();
        int count = 0;
        //防止出库业务类型名称重复
        parWarOutTypeExample.createCriteria().andOutTypeNameEqualTo(parWarOutType.getOutTypeName()).andOutTypeIdNotEqualTo(parWarOutType.getOutTypeId());
        count = parWarOutTypeMapper.countByExample(parWarOutTypeExample);
        if (count > 0) {
            returnResult.setMsg("出库业务类型名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parWarOutType.setUpdater(pricipalUser.getUserCnName());
        parWarOutType.setUpdateTime(new Date());
        count = parWarOutTypeMapper.updateByPrimaryKeySelective(parWarOutType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parWarOutType.getOutTypeName() + "] 出库业务类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，出库业务类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParWarOutType 
     * @Description: TODO(删除出库业务类型) 
     * @param @param warOutTypeIds warOutTypeName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarOutTypeList_del")
    public Object delParWarOutType(List<String> warOutTypeIds, List<String> warOutTypeName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (warOutTypeIds.size() > 0) {
        	ParWarOutTypeExample parWarOutTypeExample = new ParWarOutTypeExample();
        	parWarOutTypeExample.createCriteria().andOutTypeIdIn(warOutTypeIds);
            count = parWarOutTypeMapper.deleteByExample(parWarOutTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(warOutTypeName, ",") + " ]出库业务类型信息");
            } else {
                returnResult.setMsg("发生未知错误，出库业务类型信息删除失败");
            }
        }
        return returnResult;
    }
}
