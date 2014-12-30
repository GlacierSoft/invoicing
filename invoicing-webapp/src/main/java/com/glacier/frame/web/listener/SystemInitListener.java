/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 *//*
package com.glacier.frame.web.listener;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.glacier.basic.util.DBHelper;
import com.glacier.basic.util.JackJson;
import com.glacier.frame.dto.service.basicdatas.FieldDTO;

*//**
 * @ClassName: SystemInitListener 
 * @Description: TODO(加载基础数据下拉项到容器session,进行字段映射) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-28 下午5:35:09
 *//*
public class SystemInitListener implements ServletContextListener {

    private static final Logger logger = LoggerFactory.getLogger(SystemInitListener.class);

    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().removeAttribute("fields");
    }

    public void contextInitialized(ServletContextEvent sce) {
        try {
            logger.info("服务器读取系统默认配置");
            LinkedHashMap<String, List<FieldDTO>> fieldMap = new LinkedHashMap<String, List<FieldDTO>>();
            StringBuilder sqlStr = new StringBuilder();
            sqlStr.append("select ");
            sqlStr.append("temp_parameter_optgroup_value.optgroup_value_code as temp_parameter_optgroup_value_optgroup_value_code,temp_parameter_optgroup_value.optgroup_value_name as temp_parameter_optgroup_value_optgroup_value_name");
            sqlStr.append(",temp_parameter_optgroup.optgroup_code as temp_parameter_optgroup_value_optgroupCode ");
            sqlStr.append("from t_parameter_optgroup_value temp_parameter_optgroup_value INNER JOIN t_parameter_optgroup temp_parameter_optgroup ON temp_parameter_optgroup.optgroup_id = temp_parameter_optgroup_value.optgroup_id ");
            sqlStr.append("WHERE ( temp_parameter_optgroup_value.status = ? )");
            Object[] param = new Object[]{"enable"};
            ResultSet rs = DBHelper.executeQuery(sqlStr.toString(), param);// 为了提高性能，同时解除Web和Bean的耦合，这里使用了jdbc方式进行数据获取
            while (rs.next()) {// 遍历返回数据，进行字符串构造
                String key = rs.getString("temp_parameter_optgroup_value_optgroupCode");
                FieldDTO fieldDTOTemp = new FieldDTO();
                fieldDTOTemp.setLabel(rs.getString("temp_parameter_optgroup_value_optgroup_value_name"));
                fieldDTOTemp.setValue(rs.getString("temp_parameter_optgroup_value_optgroup_value_code"));
                if (fieldMap.containsKey(key)) { // 如果包含这个field，就加入它的值
                    fieldMap.get(key).add(fieldDTOTemp);
                } else { // 没有这个field，则新加入这个filed
                    List<FieldDTO> fields = new ArrayList<FieldDTO>();
                    fields.add(fieldDTOTemp);
                    fieldMap.put(key, fields);
                } 
            }
            DBHelper.free(rs);// 关闭链接
            sce.getServletContext().setAttribute("fields", JackJson.fromObjectToJson(fieldMap));
        } catch (Exception e) {
            logger.error("服务器读取系统默认配置出错");
            e.printStackTrace();
        }
    }
}
*/