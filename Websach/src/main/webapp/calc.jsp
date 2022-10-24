<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%	double kq=0;
	if(request.getAttribute("bkq")!=null)
	 kq=(double) request.getAttribute("bkq");
%>
<h1>Online Calculator</h1>

	<form action=" test" method="post">
		a=<input	name="txta" type="number" value="0" ><br>
		b=<input	name="txtb"	type="number" value="0" ><br>
		kq=<input	name="Ketqua"	type="number" value="<%=kq%>"><br>
	<input name="butc" type="submit" value="+">
	<input name="butt" type="submit" value="-">
	<input name="butn" type="submit" value="*">
	<input name="butch" type="submit" value="/">
	</form>
</body>
</html>