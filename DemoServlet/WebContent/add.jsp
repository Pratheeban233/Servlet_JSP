<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
	
	<%
		 int i=Integer.parseInt(request.getParameter("t1"));
		 int j=Integer.parseInt(request.getParameter("t2"));
		 int k=i+j;
		 
		 out.println("Result is::"+k);
	%>

</body>
</html>