package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* ServletConfig & ServleContext we use to get initial values from web.xml for a Servlet using these two concept
 ServletContext - multiple servlets sharing same configuration. If your project has 5-10 servlets or more this ServletContext initial values will be shared by all servlets.
 ServletConfig - each servlets having unique configuration . It will be used by particular servlets only. If you have 5 servlet then we have 5 ServletConfig objects. 
 */

public class ServletConfigAndContext extends HttpServlet {
//	ServletContext	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		out.print("Hi ");
//		ServletContext ctx = getServletContext(); // alternative to request.getServletContext(); can use either one.
//		ServletContext ctx = request.getServletContext();
//		String str = ctx.getInitParameter("name");
//		out.println(str);
//	}
	
//	ServletConfig	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("Hi ");
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		out.println(str);
	}
}
