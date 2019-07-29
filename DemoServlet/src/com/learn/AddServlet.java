package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.spi.servicecontext.ServiceContext;

public class AddServlet extends HttpServlet
{
	public void Post(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		
		
		  int i=Integer.parseInt(req.getParameter("t1")); int
		  j=Integer.parseInt(req.getParameter("t2"));
		  
		  int k=i+j;
		 

		/*
		 * //RequestDispatcher
		 * 
		 * req.setAttribute("k", k);
		 */
		  
		  //ServeltContextConfig//
		/*
		 * PrintWriter out = res.getWriter(); out.println("Inside AddServlet ");
		 * 
		 * out.println("Inside servletContextConfig ");
		 * 
		 * ServletContext ctx = getServletContext(); String str =
		 * ctx.getInitParameter("name3"); out.print(str);
		 * 
		 * ServletConfig cnf = getServletConfig(); String str1 =
		 * cnf.getInitParameter("name1"); out.print(str1);
		 * 
		 * out.println("after servelt context");
		 */

		/*
		 * RequestDispatcher rd=req.getRequestDispatcher("sq"); rd.forward(req, res);
		 */

		// Session
		/*
		 * HttpSession session=req.getSession(); session.setAttribute("k", k);
		 */

		
		  Cookie cookie=new Cookie("k", k+""); res.addCookie(cookie);
		 

		// res.sendRedirect("sq?k="+k); // send redirect to server by url
		 res.sendRedirect("sq");

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		AddServlet as = new AddServlet();
		as.Post(req, res);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		AddServlet as = new AddServlet();
		as.Post(req, res);
	}
}
