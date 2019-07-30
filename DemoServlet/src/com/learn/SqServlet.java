package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{	
		int k = 0;
		/*
		 * //session HttpSession session=req.getSession(); int k=(int)
		 * session.getAttribute("k");
		 */

		Cookie[] cookies = req.getCookies();

		for (Cookie c : cookies) {
			if (c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}

		// int k=(int) req.getAttribute("k");
		// int k=Integer.parseInt(req.getParameter("k"));
		k = k * k;

		PrintWriter out = res.getWriter();
		out.println("Inside SqServlet<br>");

		out.println("result is:" + k);
		
		out.println("<br>");
		//PrintWriter out = res.getWriter();
		out.println("Inside servletContextConfig :: ");
		
		ServletConfig cnf = getServletConfig();
		String str1 = cnf.getInitParameter("name2");
		out.println(str1);
		
		ServletContext ctx = getServletContext(); 
		String str = ctx.getInitParameter("name3"); 
		out.println(str);
		 
		out.println("<br>after serveltcontextconfig");
	}
}
