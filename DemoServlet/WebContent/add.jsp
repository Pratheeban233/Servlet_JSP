<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body bgcolor="yellow">
	
	<%
		// int i=Integer.parseInt(request.getParameter("t1"));
		// int j=Integer.parseInt(request.getParameter("t2"));
		// int k=i/j;
		// k=k/0;
		
			String k="Prathi";
		// out.println("Result is::"+k);  
		 
		 request.setAttribute("label", k);
		 RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
		 rd.forward(request, response);
				
	%>

</body>
</html>