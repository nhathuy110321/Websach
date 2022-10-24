<%@page import="java.awt.Insets"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  String un =request.getParameter("txtun");
       String pass=request.getParameter("txtpass");
     //  if(un.equals("abc") && pass.equals("123")){
    	 if(session.getAttribute("dn")==null)
    		 session.setAttribute("dn","");
    	 session.setAttribute("dn", un);
    	  response.sendRedirect("htsach.jsp");
    	   
    	   
       %>
</body>
</html>