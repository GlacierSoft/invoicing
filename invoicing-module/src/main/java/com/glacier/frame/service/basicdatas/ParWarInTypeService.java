/**
 * @Title: ParWarInTypeService.java 
 * @Package com.glacier.global.service.ParWarInType
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
import com.glacier.frame.dao.basicdatas.ParWarInTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParWarInTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParWarInType;
import com.glacier.frame.entity.basicdatas.ParWarInTypeExample;
import com.glacier.frame.entity.basicdatas.ParWarInTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParWarInTypeService
 * @Description: TODO(入库业务类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParWarInTypeService {

	@Autowired
	private ParWarInTypeMapper parWarInTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有入库业务类型信息) 
     * @param @param jqPager ParWarInTypeQueryDTO warInTypeQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParWarInTypeQueryDTO warInTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParWarInTypeExample parWarInTypeExample = new ParWarInTypeExample(); 
        Criteria queryCriteria = parWarInTypeExample.createCriteria();
        warInTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parWarInTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parWarInTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parWarInTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_war_in_type_"));
        }
        List<ParWarInType>  parWarInTypeList = parWarInTypeMapper.selectByExample(parWarInTypeExample); // 查询所有入库业务类型列表
        int total = parWarInTypeMapper.countByExample(parWarInTypeExample); // 查询总页数
        returnResult.setRows(parWarInTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getWarInTypeCombo 
     * @Description: TODO(根据入库业务类型Id查找入库业务类型信息或查询全部,用于Combo的数据绑定) 
     * @param  @param warInTypeId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getWarInTypeCombo(String warInTypeId) {
    	ParWarInTypeExample parClientExample = new ParWarInTypeExample();
        if (StringUtils.isNotBlank(warInTypeId)) {// 可以根据ID查找，如果参数Id为空，则查找所有的数据
        	parClientExample.createCriteria().andInTypeIdEqualTo(warInTypeId);
        }
        List<ParWarInType> parWarInTypes = parWarInTypeMapper.selectByExample(parClientExample);
        return JackJson.fromObjectToJson(parWarInTypes);
    }
    
    /**
	 * @Title: getParWarInType 
	 * @Description: TODO(根据入库业务类型Id获取入库业务类型信息) 
	 * @param @param parWarInTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParWarInType(String parWarInTypeId) {
    	ParWarInType parWarInType = parWarInTypeMapper.selectByPrimaryKey(parWarInTypeId);
        return parWarInType;
    }
    
    /**
     * @Title: addParWarInType 
     * @Description: TODO(新增入库业务类型) 
     * @param @param parWarInType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarInTypeList_add")
    public Object addParWarInType(ParWarInType parWarInType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParWarInTypeExample parWarInTypeExample = new ParWarInTypeExample();
        int count = 0;
        // 防止入库业务类型名称重复
        parWarInTypeExample.createCriteria().andInTypeNameEqualTo(parWarInType.getInTypeName());
        count = parWarInTypeMapper.countByExample(parWarInTypeExample);
        if (count > 0) {
            returnResult.setMsg("入库业务类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parWarInType.setInTypeId(RandomGUID.getRandomGUID());
        parWarInType.setCreater(pricipalUser.getUserCnName());
        parWarInType.setCreateTime(new Date());
        parWarInType.setUpdater(pricipalUser.getUserCnName());
        parWarInType.setUpdateTime(new Date());
        count = parWarInTypeMapper.insert(parWarInType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parWarInType.getInTypeName() + "] 入库业务类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，入库业务类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParWarInType 
     * @Description: TODO(修改入库业务类型信息) 
     * @param @param parWarInType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarInTypeList_edit")
    public Object editParWarInType(ParWarInType parWarInType) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParWarInTypeExample parWarInTypeExample = new ParWarInTypeExample();
        int count = 0;
        //防止入库业务类型名称重复
        parWarInTypeExample.createCriteria().andInTypeNameEqualTo(parWarInType.getInTypeName()).andInTypeIdNotEqualTo(parWarInType.getInTypeId());
        count = parWarInTypeMapper.countByExample(parWarInTypeExample);
        if (count > 0) {
            returnResult.setMsg("入库业务类型名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parWarInType.setUpdater(pricipalUser.getUserCnName());
        parWarInType.setUpdateTime(new Date());
        count = parWarInTypeMapper.updateByPrimaryKeySelective(parWarInType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parWarInType.getInTypeName() + "] 入库业务类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，入库业务类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParWarInType 
     * @Description: TODO(删除入库业务类型) 
     * @param @param warInTypeIds warInTypeName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WarInTypeList_del")
    public Object delParWarInType(List<String> warInTypeIds, List<String> warInTypeName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (warInTypeIds.size() > 0) {
        	ParWarInTypeExample parWarInTypeExample = new ParWarInTypeExample();
        	parWarInTypeExample.createCriteria().andInTypeIdIn(warInTypeIds);
            count = parWarInTypeMapper.deleteByExample(parWarInTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(warInTypeName, ",") + " ]入库业务类型信息");
            } else {
                returnResult.setMsg("发生未知错误，入库业务类型信息删除失败");
            }
        }
        return returnResult;
    }
}
