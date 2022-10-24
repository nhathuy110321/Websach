<%@page import="bo.giohangbo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String masach=request.getParameter("ms");
		String tensach=request.getParameter("ts");
		long soluong=(long)1;
		long giasach=Long.parseLong(request.getParameter("gia"));
		String anh=request.getParameter("anh");
		// nếu mua lần đầu
		giohangbo gh;
		if(session.getAttribute("gio")==null){
			gh=new giohangbo();
			session.setAttribute("gio", gh);
		};
		//b1 gán ss voà 1 biên
		gh=(giohangbo) session.getAttribute("gio");
		//b2 thao tac tren bien gh
		gh.Them(masach, tensach, giasach, soluong, anh);
		
		//b3 lưu ds vào ss
		
		session.setAttribute("gio",gh);
		//hienthi gio
		response.sendRedirect("htgio.jsp");
	%>
</body>
</html>