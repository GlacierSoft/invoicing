//package com.glacier.frame.service.system;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import javax.annotation.PostConstruct;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * @ClassName: DataBackUpService
// * @Description: TODO(数据备份业务层) 
// * @author junjie.zheng
// * @email 1203807137@QQ.com
// * @date 2014-8-5上午8:57:51
// */
//
//@Service("DataBackUpService")
//@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
//public class DataBackUpService {
//    
//	/**
//	 * @Title: handleDataBackUp 
//	 * @Description: TODO(数据备份) 
//	 * @throws
//	 */
//	@PostConstruct
//	public void handleDataBackUp(){
//		try { 
//			//构建SQL命令执行路径
//			String sqlWebapp=null; 
//			String sqlPath=System.getProperty("user.dir");
//		    if(sqlPath.contains("netloan-module"))
//		    	sqlWebapp=sqlPath.replaceAll("\\\\","\\\\\\\\").replaceAll("netloan-module","netloan-webapp");
//		    if(sqlPath.contains("netloan-website"))
//		        sqlWebapp=sqlPath.replaceAll("\\\\","\\\\\\\\").replaceAll("netloan-website","netloan-webapp");
//		    if(sqlPath.contains("netloan-webapp"))
//		        sqlWebapp=sqlPath.replaceAll("\\\\","\\\\\\\\");
//		    // 创建隐藏文件夹存储备份数据
//			File file_netloan = new File(""+sqlWebapp+"\\src\\main\\webapp\\resources\\backupsql");
//			if (!file_netloan.exists() || !file_netloan.isDirectory()) {
//				file_netloan.mkdir();
//			}
//			//判断存储文件是否为空文件
//			if(file_netloan.listFiles().length>0){
//				 //指定文件夹内最后修改时间
//			    long file_time=file_netloan.lastModified();
//				// 当前日历设置
//				Calendar calendar = Calendar.getInstance();
//				calendar.set(Calendar.HOUR_OF_DAY, 0);// 设置日历时
//				calendar.set(Calendar.MINUTE, 0);// 设置日历分
//				calendar.set(Calendar.SECOND, 0);// 设置日历秒
//				Date date=new Date(file_time);//文件夹内最后修改时间
//				//判断文件夹内是否有当天的备份文件
//				if(date.before(calendar.getTime())){
//					//构建执行命令
//				    Runtime rt = Runtime.getRuntime();
//		            //调用调用 mysql命令
//					Process child = rt.exec(""+sqlWebapp+"\\src\\main\\webapp\\resources\\mysql\\mysqldump.exe -h localhost -uroot -proot  netloan");// 设置导出编码为utf8。这里必须是utf8
//		            //把进程执行中的控制台输出信息写入.sql文件，即生成了备份文件。注：如果不对控制台信息进行读出，则会导致进程堵塞无法运行
//					InputStream in = child.getInputStream();// 控制台的输出信息作为输入流
//		            InputStreamReader xx = new InputStreamReader(in, "utf8");// 设置输出流编码为utf8。这里必须是utf8，否则从流中读入的是乱码
//		            String inStr;
//					StringBuffer sb = new StringBuffer("");
//					String outStr;
//					//组合控制台输出信息字符串
//					BufferedReader br = new BufferedReader(xx);
//					while ((inStr = br.readLine()) != null) {
//						sb.append(inStr + "\r\n");
//					}
//					outStr = sb.toString();
//					//日期格式转化
//		            SimpleDateFormat sf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
//					String str = "netloan" + sf.format(new Date()) + ".sql";
//		            // 要用来做导入用的sql目标文件：
//					FileOutputStream fout = new FileOutputStream(""+sqlWebapp+"\\src\\main\\webapp\\resources\\backupsql\\" + str + "");
//					OutputStreamWriter writer = new OutputStreamWriter(fout, "utf8");
//					writer.write(outStr);
//					// 如果用缓冲方式写入文件的话，会导致中文乱码，用flush()方法则可以避免
//					writer.flush();
//		            // 关闭输入输出流
//					in.close();
//					xx.close();
//					br.close();
//					writer.close();
//					fout.close();
//				}
//			}else{
//				//构建执行命令
//			    Runtime rt = Runtime.getRuntime();
//	            //调用 mysql命令
//				Process child = rt.exec(""+sqlWebapp+"\\src\\main\\webapp\\resources\\mysql\\mysqldump.exe -h localhost -uroot -proot  netloan");// 设置导出编码为utf8。这里必须是utf8
//	            //把进程执行中的控制台输出信息写入.sql文件，即生成了备份文件。注：如果不对控制台信息进行读出，则会导致进程堵塞无法运行
//				InputStream in = child.getInputStream();// 控制台的输出信息作为输入流
//	            InputStreamReader xx = new InputStreamReader(in, "utf8");// 设置输出流编码为utf8。这里必须是utf8，否则从流中读入的是乱码
//	            String inStr;
//				StringBuffer sb = new StringBuffer("");
//				String outStr;
//				//组合控制台输出信息字符串
//				BufferedReader br = new BufferedReader(xx);
//				while ((inStr = br.readLine()) != null) {
//					sb.append(inStr + "\r\n");
//				}
//				outStr = sb.toString();
//				//日期格式转化
//	            SimpleDateFormat sf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
//				String str = "netloan" + sf.format(new Date()) + ".sql";
//	            // 要用来做导入用的sql目标文件：
//				FileOutputStream fout = new FileOutputStream(""+sqlWebapp+"\\src\\main\\webapp\\resources\\backupsql\\" + str + "");
//				OutputStreamWriter writer = new OutputStreamWriter(fout, "utf8");
//				writer.write(outStr);
//				// 如果用缓冲方式写入文件的话，会导致中文乱码，用flush()方法则可以避免
//				writer.flush();
//	            // 关闭输入输出流
//				in.close();
//				xx.close();
//				br.close();
//				writer.close();
//				fout.close();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//	    }
//   }
//}
