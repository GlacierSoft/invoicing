/**
 * @Title: ParWarDeployTypeService.java 
 * @Package com.glacier.global.service.ParWarDeployType
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
import com.glacier.frame.dao.basicdatas.ParWarDeployTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParWarDeployTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParWarDeployType;
import com.glacier.frame.entity.basicdatas.ParWarDeployTypeExample;
import com.glacier.frame.entity.basicdatas.ParWarDeployTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParWarDeployTypeService
 * @Description: TODO(调拨类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-14
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParWarDeployTypeService {

	@Autowired
	private ParWarDeployTypeMapper parWarDeployTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有调拨类型信息) 
     * @param @param jqPager ParWarDeployTypeQueryDTO warDeployTypeQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParWarDeployTypeQueryDTO warDeployTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParWarDeployTypeExample parWarDeployTypeExample = new ParWarDeployTypeExample(); 
        Criteria queryCriteria = parWarDeployTypeExample.createCriteria();
        warDeployTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parWarDeployTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parWarDeployTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parWarDeployTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_war_deploy_type_"));
        }
        List<ParWarDeployType>  parWarDeployTypeList = parWarDeployTypeMapper.selectByExample(parWarDeployTypeExample); // 查询所有调拨类型列表
        int total = parWarDeployTypeMapper.countByExample(parWarDeployTypeExample); // 查询总页数
        returnResult.setRows(parWarDeployTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getWarDeployTypeCombo 
     * @Description: TODO(根据调拨类型Id查找调拨类型信息或查询全部,用于Combo的数据绑定) 
     * @param  @param warDeployTypeId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getWarDeployTypeCombo(String warDeployTypeId) {
    	ParWarDeployTypeExample parClientExample = new ParWarDeployTypeExample();
        if (StringUtils.isNotBlank(warDeployTypeId)) {// 可以根据ID查找，如果参数Id为空，则查找所有的数据
        	parClientExample.createCriteria().andDeployTypeIdEqualTo(warDeployTypeId);
        }
        List<ParWarDeployType> parWarDeployTypes = parWarDeployTypeMapper.selectByExample(parClientExample);
        return JackJson.fromObjectToJson(parWarDeployTypes);
    }
    
    /**
	 * @Title: getParWarDeployType 
	 * @Description: TODO(根据调拨类型Id获取调拨类型信息) 
	 * @param @param parWarDeployTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParWarDeployType(String parWarDeployTypeId) {
    	ParWarDeployType parWarDeployType = parWarDeployTypeMapper.selectByPrimaryKey(parWarDeployTypeId);
        return parWarDeployType;
    }
    
    /**
     * @Title: addParWarDeployType 
     * @Description: TODO(新增调拨类型) 
     * @param @param parWarDeployType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarDeployTypeList_add")
    public Object addParWarDeployType(ParWarDeployType parWarDeployType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParWarDeployTypeExample parWarDeployTypeExample = new ParWarDeployTypeExample();
        int count = 0;
        // 防止调拨类型名称重复
        parWarDeployTypeExample.createCriteria().andDeployTypeNameEqualTo(parWarDeployType.getDeployTypeName());
        count = parWarDeployTypeMapper.countByExample(parWarDeployTypeExample);
        if (count > 0) {
            returnResult.setMsg("调拨类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parWarDeployType.setDeployTypeId(RandomGUID.getRandomGUID());
        parWarDeployType.setCreater(pricipalUser.getUserCnName());
        parWarDeployType.setCreateTime(new Date());
        parWarDeployType.setUpdater(pricipalUser.getUserCnName());
        parWarDeployType.setUpdateTime(new Date());
        count = parWarDeployTypeMapper.insert(parWarDeployType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parWarDeployType.getDeployTypeName() + "] 调拨类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，调拨类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParWarDeployType 
     * @Description: TODO(修改调拨类型信息) 
     * @param @param parWarDeployType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarDeployTypeList_edit")
    public Object editParWarDeployType(ParWarDeployType parWarDeployType) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParWarDeployTypeExample parWarDeployTypeExample = new ParWarDeployTypeExample();
        int count = 0;
        //防止调拨类型名称重复
        parWarDeployTypeExample.createCriteria().andDeployTypeNameEqualTo(parWarDeployType.getDeployTypeName()).andDeployTypeIdNotEqualTo(parWarDeployType.getDeployTypeId());
        count = parWarDeployTypeMapper.countByExample(parWarDeployTypeExample);
        if (count > 0) {
            returnResult.setMsg("调拨类型名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parWarDeployType.setUpdater(pricipalUser.getUserCnName());
        parWarDeployType.setUpdateTime(new Date());
        count = parWarDeployTypeMapper.updateByPrimaryKeySelective(parWarDeployType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parWarDeployType.getDeployTypeName() + "] 调拨类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，调拨类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParWarDeployType 
     * @Description: TODO(删除调拨类型) 
     * @param @param warDeployTypeIds warDeployTypeName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarDeployTypeList_del")
    public Object delParWarDeployType(List<String> warDeployTypeIds, List<String> warDeployTypeName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (warDeployTypeIds.size() > 0) {
        	ParWarDeployTypeExample parWarDeployTypeExample = new ParWarDeployTypeExample();
        	parWarDeployTypeExample.createCriteria().andDeployTypeIdIn(warDeployTypeIds);
            count = parWarDeployTypeMapper.deleteByExample(parWarDeployTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(warDeployTypeName, ",") + " ]调拨类型信息");
            } else {
                returnResult.setMsg("发生未知错误，调拨类型信息删除失败");
            }
        }
        return returnResult;
    }
}
