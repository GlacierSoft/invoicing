/**
 * @Title: MyMath.java 
 * @Package com.glacier.netloan.util 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-7-31 上午10:14:37 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-7-31
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @ClassName: MyMath
 * @Description: TODO(用于金钱运算)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-7-31 上午10:14:37
 */
public class MyMath {
	public static float add(float d1, float d2,String FormatString) { // 进行加法运算
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		DecimalFormat df = new DecimalFormat(FormatString);  
		return Float.parseFloat(df.format(b1.add(b2).floatValue())); 
	}

	public static float sub(float d1, float d2,String FormatString) { // 进行减法运算
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		DecimalFormat df = new DecimalFormat(FormatString);  
		return Float.parseFloat(df.format(b1.subtract(b2).floatValue()));
	}

	public static float mul(float d1, float d2,String FormatString) { // 进行乘法运算
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		DecimalFormat df = new DecimalFormat(FormatString);  
		return Float.parseFloat(df.format(b1.multiply(b2).floatValue())); 
	}

	public static float div(float d1, float d2, int len,String FormatString) {// 进行除法运算
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		DecimalFormat df = new DecimalFormat(FormatString);  
		return Float.parseFloat(df.format(b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).floatValue()));  
	}

	public static float round(float d,float f, int len,String FormatString) { // 进行四舍五入操作
		BigDecimal b1 = new BigDecimal(d);
		BigDecimal b2 = new BigDecimal(f);
		// 任何一个数字除以1都是原数字
		// ROUND_HALF_UP是BigDecimal的一个常量，表示进行四舍五入的操作
		DecimalFormat df = new DecimalFormat(FormatString);  
		return Float.parseFloat(df.format(b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).floatValue())); 
	}
	
	public static void main(String[] args) {
		System.out.println(" 减法："+sub(200.52123f,100.52f,"#.###")); //减法

		System.out.println(" 加法："+add(200.52123f,100.52f,"#.###")); //加法

		System.out.println(" 乘法："+mul(200.52123f,100.52f,"#.###")); //乘法

		System.out.println(" 除法："+div(10.345f, 3.333f, 3,"#.###")); //除法

		System.out.println(" 四舍五入："+round(10.345f,3, 3,"#.###")); //进行四舍五入操作
	}
}
