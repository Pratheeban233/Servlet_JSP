package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void Post(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("t1"));
		int j=Integer.parseInt(req.getParameter("t2"));
		
		int k=i+j;
		
		/*
		 * req.setAttribute("k", k);
		 * 
		 * PrintWriter out=res.getWriter(); out.println("Inside AddServlet");
		 * 
		 * RequestDispatcher rd=req.getRequestDispatcher("sq"); rd.forward(req, res);
		 */
		
		res.sendRedirect("sq?k="+k);  // send redirect to server 
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		AddServlet as=new AddServlet();
		as.Post(req, res);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		AddServlet as= new AddServlet();
		as.Post(req, res);
	}
}
