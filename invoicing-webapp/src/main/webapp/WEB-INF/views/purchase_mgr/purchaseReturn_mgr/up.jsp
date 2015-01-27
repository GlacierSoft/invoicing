<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.io.File"%> 
<%@ page import="java.io.IOException"%> 

<%@ page import="java.util.List"%> 
<%@ page import="javax.servlet.ServletException"%> 
<%@ page import="javax.servlet.http.HttpServlet"%> 
<%@ page import="javax.servlet.http.HttpServletRequest"%> 
<%@ page import="javax.servlet.http.HttpServletResponse"%> 


<%@ page import="org.apache.commons.fileupload.FileItem"%> 
<%@ page import="org.apache.commons.fileupload.FileUploadException"%>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>

<%
DiskFileItemFactory factory = new DiskFileItemFactory();
		// 设置内存缓冲区，超过后写入临时文件
		factory.setSizeThreshold(1024000000);
		// 设置临时文件存储位置
		String base = "d:/upload";
		File file = new File(base);
		if(!file.exists())
			file.mkdirs();
		factory.setRepository(file);
		ServletFileUpload upload = new ServletFileUpload(factory);
		// 设置单个文件的最大上传值
		upload.setFileSizeMax(100024000000000000l);
		// 设置整个request的最大值
		upload.setSizeMax(1000240000000000000l);
		upload.setHeaderEncoding("UTF-8");
		
		try {
			List items = upload.parseRequest(request);
			FileItem item = null;
			String fileName = null;
			for (int i = 0 ;i < items.size(); i++){
				item = (FileItem) items.get(i);
				
				
				//文件名字的获取及修改
				
				fileName = base + File.separator + item.getName()+i;
				// 保存文件
				if (!item.isFormField() && item.getName().length() > 0) {
					item.write(new File(fileName));
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
%>