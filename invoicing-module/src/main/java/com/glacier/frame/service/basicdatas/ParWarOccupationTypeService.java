/**
 * @Title: ParWarOccupationTypeService.java 
 * @Package com.glacier.global.service.ParWarOccupationType
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
import com.glacier.frame.dao.basicdatas.ParWarOccupationTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParWarOccupationTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParWarOccupationType;
import com.glacier.frame.entity.basicdatas.ParWarOccupationTypeExample;
import com.glacier.frame.entity.basicdatas.ParWarOccupationTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParWarOccupationTypeService
 * @Description: TODO(锁定类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-14
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParWarOccupationTypeService {

	@Autowired
	private ParWarOccupationTypeMapper parWarOccupationTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有锁定类型信息) 
     * @param @param jqPager ParWarOccupationTypeQueryDTO warOccupationTypeQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParWarOccupationTypeQueryDTO warOccupationTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParWarOccupationTypeExample parWarOccupationTypeExample = new ParWarOccupationTypeExample(); 
        Criteria queryCriteria = parWarOccupationTypeExample.createCriteria();
        warOccupationTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parWarOccupationTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parWarOccupationTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parWarOccupationTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_war_occupation_type_"));
        }
        List<ParWarOccupationType>  parWarOccupationTypeList = parWarOccupationTypeMapper.selectByExample(parWarOccupationTypeExample); // 查询所有锁定类型列表
        int total = parWarOccupationTypeMapper.countByExample(parWarOccupationTypeExample); // 查询总页数
        returnResult.setRows(parWarOccupationTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getWarOccupationTypeCombo 
     * @Description: TODO(根据锁定类型Id查找锁定类型信息或查询全部,用于Combo的数据绑定) 
     * @param  @param warOccupationTypeId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getWarOccupationTypeCombo(String warOccupationTypeId) {
    	ParWarOccupationTypeExample parClientExample = new ParWarOccupationTypeExample();
        if (StringUtils.isNotBlank(warOccupationTypeId)) {// 可以根据ID查找，如果参数Id为空，则查找所有的数据
        	parClientExample.createCriteria().andOccupationTypeIdEqualTo(warOccupationTypeId);
        }
        List<ParWarOccupationType> parWarOccupationTypes = parWarOccupationTypeMapper.selectByExample(parClientExample);
        return JackJson.fromObjectToJson(parWarOccupationTypes);
    }
    
    /**
	 * @Title: getParWarOccupationType 
	 * @Description: TODO(根据锁定类型Id获取锁定类型信息) 
	 * @param @param parWarOccupationTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParWarOccupationType(String parWarOccupationTypeId) {
    	ParWarOccupationType parWarOccupationType = parWarOccupationTypeMapper.selectByPrimaryKey(parWarOccupationTypeId);
        return parWarOccupationType;
    }
    
    /**
     * @Title: addParWarOccupationType 
     * @Description: TODO(新增锁定类型) 
     * @param @param parWarOccupationType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarOccupationTypeList_add")
    public Object addParWarOccupationType(ParWarOccupationType parWarOccupationType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParWarOccupationTypeExample parWarOccupationTypeExample = new ParWarOccupationTypeExample();
        int count = 0;
        // 防止锁定类型名称重复
        parWarOccupationTypeExample.createCriteria().andOccupationTypeNameEqualTo(parWarOccupationType.getOccupationTypeName());
        count = parWarOccupationTypeMapper.countByExample(parWarOccupationTypeExample);
        if (count > 0) {
            returnResult.setMsg("锁定类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parWarOccupationType.setOccupationTypeId(RandomGUID.getRandomGUID());
        parWarOccupationType.setCreater(pricipalUser.getUserCnName());
        parWarOccupationType.setCreateTime(new Date());
        parWarOccupationType.setUpdater(pricipalUser.getUserCnName());
        parWarOccupationType.setUpdateTime(new Date());
        count = parWarOccupationTypeMapper.insert(parWarOccupationType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parWarOccupationType.getOccupationTypeName() + "] 锁定类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，锁定类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParWarOccupationType 
     * @Description: TODO(修改锁定类型信息) 
     * @param @param parWarOccupationType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarOccupationTypeList_edit")
    public Object editParWarOccupationType(ParWarOccupationType parWarOccupationType) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParWarOccupationTypeExample parWarOccupationTypeExample = new ParWarOccupationTypeExample();
        int count = 0;
        //防止锁定类型名称重复
        parWarOccupationTypeExample.createCriteria().andOccupationTypeNameEqualTo(parWarOccupationType.getOccupationTypeName()).andOccupationTypeIdNotEqualTo(parWarOccupationType.getOccupationTypeId());
        count = parWarOccupationTypeMapper.countByExample(parWarOccupationTypeExample);
        if (count > 0) {
            returnResult.setMsg("锁定类型名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parWarOccupationType.setUpdater(pricipalUser.getUserCnName());
        parWarOccupationType.setUpdateTime(new Date());
        count = parWarOccupationTypeMapper.updateByPrimaryKeySelective(parWarOccupationType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parWarOccupationType.getOccupationTypeName() + "] 锁定类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，锁定类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParWarOccupationType 
     * @Description: TODO(删除锁定类型) 
     * @param @param warOccupationTypeIds warOccupationTypeName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarOccupationTypeList_del")
    public Object delParWarOccupationType(List<String> warOccupationTypeIds, List<String> warOccupationTypeName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (warOccupationTypeIds.size() > 0) {
        	ParWarOccupationTypeExample parWarOccupationTypeExample = new ParWarOccupationTypeExample();
        	parWarOccupationTypeExample.createCriteria().andOccupationTypeIdIn(warOccupationTypeIds);
            count = parWarOccupationTypeMapper.deleteByExample(parWarOccupationTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(warOccupationTypeName, ",") + " ]锁定类型信息");
            } else {
                returnResult.setMsg("发生未知错误，锁定类型信息删除失败");
            }
        }
        return returnResult;
    }
}
