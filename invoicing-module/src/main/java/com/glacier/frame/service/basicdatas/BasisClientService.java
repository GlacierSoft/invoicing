/**
 * @Title: BasisClientService.java 
 * @Package com.glacier.global.service.BasisClient
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2015-1-9
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.basicdatas; 
import java.text.SimpleDateFormat;
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
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.BasisClientMapper;
import com.glacier.frame.dto.query.basicdatas.BasisClientQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.BasisClient;
import com.glacier.frame.entity.basicdatas.BasisClientExample;
import com.glacier.frame.entity.basicdatas.BasisClientExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  BasisClientService
 * @Description: TODO(客户档案表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-9
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class BasisClientService {

	@Autowired
	private BasisClientMapper basisClientMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有客户档案信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, BasisClientQueryDTO deliverTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        BasisClientExample basisClientExample = new BasisClientExample(); 
        Criteria queryCriteria = basisClientExample.createCriteria();
        deliverTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	basisClientExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	basisClientExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	basisClientExample.setOrderByClause(jqPager.getOrderBy("temp_basis_client_"));
        }
        List<BasisClient>  basisClientList = basisClientMapper.selectByExample(basisClientExample); // 查询所有客户档案列表
        int total = basisClientMapper.countByExample(basisClientExample); // 查询总页数
        returnResult.setRows(basisClientList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getBasisClient 
	 * @Description: TODO(根据客户档案Id获取客户档案信息) 
	 * @param @param deliverTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getBasisClient(String deliverTypeId) {
    	BasisClient basisClient = basisClientMapper.selectByPrimaryKey(deliverTypeId);
        return basisClient;
    }
    
    /**
     * @Title: addBasisClient 
     * @Description: TODO(新增客户档案) 
     * @param @param basisClient
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientList_add")
    public Object addBasisClient(BasisClient basisClient) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        BasisClientExample basisClientExample = new BasisClientExample();
        int count = 0;
        // 防止客户档案名称重复
        basisClientExample.createCriteria().andClientNameEqualTo(basisClient.getClientName());
        count = basisClientMapper.countByExample(basisClientExample);
        if (count > 0) {
            returnResult.setMsg("客户档案名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        //客户档案编号格式:表名_年_月_日_分_秒
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        basisClient.setClientId(RandomGUID.getRandomGUID());
        basisClient.setClientCode("client"+formatDate.format(new Date()));
        basisClient.setCreater(pricipalUser.getUserCnName());
        basisClient.setCreateTime(new Date());
        basisClient.setUpdater(pricipalUser.getUserCnName());
        basisClient.setUpdateTime(new Date());
        count = basisClientMapper.insert(basisClient);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + basisClient.getClientName() + "] 客户档案信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客户档案信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editBasisClient 
     * @Description: TODO(修改客户档案信息) 
     * @param @param basisClient
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientList_edit")
    public Object editBasisClient(BasisClient basisClient) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        BasisClientExample basisClientExample = new BasisClientExample();
        int count = 0;
        // 防止客户档案名称重复
        basisClientExample.createCriteria().andClientNameEqualTo(basisClient.getClientName()).andClientIdNotEqualTo(basisClient.getClientId());
        count = basisClientMapper.countByExample(basisClientExample);
        if (count > 0) {
            returnResult.setMsg("客户档案名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        basisClient.setUpdater(pricipalUser.getUserCnName());
        basisClient.setUpdateTime(new Date());
        count = basisClientMapper.updateByPrimaryKeySelective(basisClient);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + basisClient.getClientName() + "] 客户档案信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客户档案信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delBasisClient 
     * @Description: TODO(删除客户档案) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientList_del")
    public Object delBasisClient(List<String> clientIds, List<String> ClientNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (clientIds.size() > 0) {
        	BasisClientExample basisClientExample = new BasisClientExample();
        	basisClientExample.createCriteria().andClientIdIn(clientIds);
            count = basisClientMapper.deleteByExample(basisClientExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(ClientNames, ",") + " ]客户档案信息");
            } else {
                returnResult.setMsg("发生未知错误，客户档案信息删除失败");
            }
        }
        return returnResult;
    }
}
