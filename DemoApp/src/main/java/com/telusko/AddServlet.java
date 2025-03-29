package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*public class AddServlet extends HttpServlet {
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException { //the method name must be service()
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException { // request works only with post request
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		System.out.println(" Result is: " + k); // prints output on eclipse console
//		res.getWriter().println(" Result is: " + k); // take respose object and using getWriter we are printing output
//		PrintWriter out = res.getWriter();
//		out.println("result is " + k);
//	}

//	RequestDispatcher	
//  If we want to use two methods GET and POST 	use below code
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException { // request works only with get request
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		Request Dispatcher and Redirect - Calling Servlet from another Servlet 
//		Session Management - one way of sending data from one servlet to another servlet
//	 	another way of sending data from one servlet to another servlet is using req attribute		
//		req.setAttribute("k", k); // passing key value pair. passing k value in right and naming it as k in left. When we are passing it to SqServlet we will use k.
//		
//		RequestDispatcher rd = req.getRequestDispatcher("sq"); // mentioning what is "sq" in web.xml 
//		rd.forward(req, res);
//	}

//	Sending data via URL rewriting
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException { // request works only with get request
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		res.sendRedirect("sq?k="+k);	// Session Management - URL Rewriting
		
//		Concept of session management management - where you can transfer data from one server to another server with the help of three concept - 
//		i. Session, ii. Cookies , iii. URL rewriting because you're changing your URL and that's why it is called as URL rewriting
		
//	}

//	Sending data via session	
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException { // request works only with get request
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i+j;
//		HttpSession session = req.getSession(); // Session Management - session
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");	
//	}
	
//	Sending data via cookie	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException { // request works only with get request
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		Cookie cookie = new Cookie("k", Integer.toString(k)); // Convert integer to string
//		Cookie cookie = new Cookie("k", k + " "); // Another way of converting integer to string is appending " " to integer it becomes String
		res.addCookie(cookie); // Session Management - cookie
		res.sendRedirect("sq");	
	}
}*/

//	Servlet Annotation Configuration - using annotation instead of web.xml file 
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException { // request works only with get request
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		Cookie cookie = new Cookie("k", Integer.toString(k)); // Convert integer to string
//		Cookie cookie = new Cookie("k", k + " "); // Another way of converting integer to string is appending " " to integer it becomes String
		res.addCookie(cookie); // Session Management - cookie
		res.sendRedirect("sq");	
	}
}
