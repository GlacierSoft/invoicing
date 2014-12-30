/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 */
package com.glacier.jqueryui.util;

import com.glacier.basic.util.GlacierUitls;
import com.glacier.basic.util.IgnoreParam;

/**
 * @ClassName: JqPager 
 * @Description: TODO(JQueryUI的分页请求对象) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:18:43
 */
public class JqPager implements IgnoreParam{

    /**
     * 分页的start
     */
    private Integer page;

    /**
     * 分页的llimit
     */
    private Integer rows;

    /**
     * 排序的field
     */
    private String sort;

    /**
     * DESC or ASC
     */
    private String order;
    
    public String getOrderBy(String prefix){
        return GlacierUitls.camelTounderline(prefix+this.getSort())+" "+this.getOrder(); 
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

}
