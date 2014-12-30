/**
 * @Title: OperaLogService.java 
 * @Package com.glacier.frame.service.system 
 * @author songjundong  
 * @email 985776597@qq.com
 * @date 2014-8-18 下午3:18:37 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-8-18
				修改人：songjundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：songjundong
 * 
 */
package com.glacier.frame.service.system;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.system.OperaLogMapper;
import com.glacier.frame.dto.query.system.OperalogQueryDTO;
import com.glacier.frame.entity.system.OperaLog;
import com.glacier.frame.entity.system.OperaLogExample;
import com.glacier.frame.entity.system.OperaLogExample.Criteria;
import com.glacier.frame.util.MethodLog;

/**
 * @ClassName: OperaLogService
 * @Description: TODO(操作日志业务类)
 * @author songjundong
 * @email 985776597@qq.com
 * @date 2014-8-18 下午3:18:37
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class OperaLogService {

    @Autowired
    private OperaLogMapper operaLogMapper;

    /**
     * @Title: listAsGrid
     * @Description: TODO(以表格结构展示操作日志列表)
     * @param @param pager
     * @param @return
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    public Object listAsGrid(OperalogQueryDTO operalogQueryDTO,JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        OperaLogExample operaLogExample = new OperaLogExample();
        Criteria queryCriteria = operaLogExample.createCriteria();
        operalogQueryDTO.setQueryCondition(queryCriteria);
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	operaLogExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	operaLogExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	operaLogExample.setOrderByClause(pager.getOrderBy("temp_operalog_"));
        }
        // 高级检索
        List<OperaLog> OperaLogs = operaLogMapper.selectByExample(operaLogExample); // 查询所有操作日志列表
        int total = operaLogMapper.countByExample(operaLogExample); // 查询总页数
        returnResult.setRows(OperaLogs);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getOperaLog 
	 * @Description: TODO(根据会员信用等级id进行查询) 
	 * @param  @param operalogId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 */
	public Object getOperaLog(String operalogId){
		OperaLog operaLog = operaLogMapper.selectByPrimaryKey(operalogId);
        return operaLog;
	}
    
    /**
     * @Title: delOperaLog 
     * @Description: TODO(删除操作日志) 
     * @param  @param operalogId
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false)
    @MethodLog(opera="OperalogList_del")
    public Object delOperaLog(List<String> operalogIds,List<String> operaPenals){
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if(operalogIds.size() > 0){
			OperaLogExample operaLogExample = new OperaLogExample();
			operaLogExample.createCriteria().andOperalogIdIn(operalogIds);
			count = operaLogMapper.deleteByExample(operaLogExample);
			if(count >0){
				returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(operaPenals, ",") + " ]操作");
				returnResult.setSuccess(true);
			}else{
				returnResult.setMsg("发生未知错误，操作日志信息删除失败");
			}
		}
		return returnResult;
    }
}
