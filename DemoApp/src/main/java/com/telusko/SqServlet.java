package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/* public class SqServlet extends HttpServlet {
//	RequestDispatcher	
//	public void doGet(HttpServletRequest req, HttpServletResponse res)  throws IOException {
//		
//		int k = (int)req.getAttribute("k");
//		k = k*k;
//		
//		PrintWriter out = res.getWriter();
//		out.println("Result is: " + k);
//	}

//  Session Management - URL Rewriting
//	public void doGet(HttpServletRequest req, HttpServletResponse res)  throws IOException {
//		int k = Integer.parseInt(req.getParameter("k"));
//		k = k*k;
//		
//		PrintWriter out = res.getWriter();
//		out.println("Result is: " + k);
//		
//		System.out.println("sq called");
//	}

//  Session Management - session
//	public void doGet(HttpServletRequest req, HttpServletResponse res)  throws IOException {
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
//		session.removeAttribute("k"); // To remove session details that have k value you can use removeAttribute()
//		k = k*k;
//		
//		PrintWriter out = res.getWriter();
//		out.println("Result is: " + k);
//	}
	
//  Session Management - cookie
	public void doGet(HttpServletRequest req, HttpServletResponse res)  throws IOException {
		int k=0;
		Cookie cookies[] = req.getCookies(); // We have multiple cookies while getting it. So we need to find cookie that contains "k" thus we are using loop to find it.
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is: " + k);
	}
} */

//  Servlet Annotation Configuration - using annotation instead of web.xml file 
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)  throws IOException {
		int k=0;
		Cookie cookies[] = req.getCookies(); // We have multiple cookies while getting it. So we need to find cookie that contains "k" thus we are using loop to find it.
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is: " + k);
	}
}