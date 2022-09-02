package com.wdy.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//@WebServlet("/demo1")
public class MyServlet implements Servlet{
	private String username;
	public MyServlet() {
		//System.out.println("创建了Servlet对象");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//销毁
		//System.out.println("释放了Servlet对象....");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		//创建
		//System.out.println("对Servlet完成初始化操作");
		System.out.println(arg0.getServletName());
		//System.out.println(arg0.getInitParameter("username"));
		//this.username=arg0.getInitParameter("username");
		//Enumeration<String> enumeration=arg0.getInitParameterNames();
		//while(enumeration.hasMoreElements()) {
		//	String element=enumeration.nextElement();
		//	System.out.println(arg0.getInitParameter(element));
		//	
		//}
		//ServletContext servletContext=arg0.getServletContext();
		//System.out.println(servletContext.getContextPath());//得到文件路径，输出：/first
		//System.out.println(servletContext.getServerInfo());//得到服务器信息，输出：Apache Tomcat/7.0.106
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		/*
		 *String id=arg0.getParameter("id");
		 *System.out.println("对Servlet完成初始化操作");
		 *System.out.println("我是Servlet，我已经接收到了来自客户端发来的信息，参数是"+id);
		 *arg1.setContentType("text/html;charset=UTF-8");
		 *arg1.getWriter().write("客户端你好，我已经接收到了你的请求");
		 * 
		 */
		// TODO Auto-generated method stub
		//工作
		//System.out.println("执行了Servlet的业务方法....");
		
	}

}
