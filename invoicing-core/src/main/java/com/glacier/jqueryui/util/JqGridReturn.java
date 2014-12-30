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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @ClassName: JqGridReturn 
 * @Description: TODO(JQuery Grid返回对象) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:18:32
 */
@SuppressWarnings("rawtypes")
public class JqGridReturn {
    /**
     * 总共条数
     */
    private int total = 0;
    
    /**
     * 当前页数
     */
    private int p = 1;

    /**
     * 内容数据
     */
    private List<?> rows = new ArrayList();

    /**
     * 脚表头数据
     */
    private List<?> footer = new ArrayList();

    public JqGridReturn() {
    }

    public JqGridReturn(int total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public JqGridReturn(int total, List<?> rows, List<?> footer) {
        this.total = total;
        this.rows = rows;
        this.footer = footer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public List<?> getFooter() {
        return footer;
    }

    public void setFooter(List<?> footer) {
        this.footer = footer;
    }
    
    public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
