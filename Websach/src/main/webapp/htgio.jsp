<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
<%@page import="bean.loaibean"%>
<%@page import="bo.loaibo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>AJax</title>
	<meta charset="utf-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
    		<div class="navbar-header">
      			<a class="navbar-brand" href="#">Trang Chủ</a>
    		</div>
		    <ul class="nav navbar-nav">
			      <li class="active"><a href="#">Giỏ Hàng</a></li>
			      <li><a href="#">Thanh Toán</a></li>
			      <li><a href="#"><%=session.getAttribute("s")%></a></li>
		    </ul>
		    <ul class="nav navbar-nav navbar-right">
			      <li><a href="remove.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
			   
			      <li>
			         <%if(session.getAttribute("dn")==null) {%>
			         <a href="dangnhap.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
			      <%}else{ %>
			    	    <a href="#"><span class="glyphicon glyphicon-log-in"></span>
			    	    Hi<%=session.getAttribute("dn") %></a></li>
			      <%}
			    	  %>
			      
		    </ul>
  		</div>
	</nav>
	
	<div class="container">
		<div class="container-fluid" style="margin: 30px">
      		<h1 class="">Sách Online</h1>
		    <ul class="nav navbar-nav">
		      
				<%
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("uft-8");
				loaibo loai=new loaibo();
					for(loaibean l: loai.getloai()){%>
						<li><a href="htsach.jsp?ml=<%=l.getMaloai()%>">
						<%=l.getTenloai()%></a></li>
					<%
					}
				%>
		    </ul>
		    
		    <form class="navbar-form navbar-left">
				 <input type="text" class="form-control" placeholder="Tìm kiếm ở đây" name="search">
		 		<button type="submit" class="btn btn-primary">Submit</button>
			</form>
			<%
			
			%>
		</div>
		<table width="600">
		   		
	<table width="1000" align="center" class="table">
   
   		<td valign="top" width="200" > 
   		<table class="table table-hover">
	   		<%
	   		
	   			for(loaibean l: loai.getloai()){%>
	   			   <tr><td>
	   				  <a href="htsach.jsp?ml=<%=l.getMaloai()%>">
	   				   <%=l.getTenloai()%> </a>
	   				 </td>
	   				</tr>
	   		<%	}
	   		%>
   		 </table>
   		 </td>
   		<td valign="top" width="600" >
   		<form action="xoalist.jsp" method="post"> 
   		<table  class="table table-hover">
	   		 <%
	   		 giohangbo gh=(giohangbo)session.getAttribute("gio");
	   		  for(giohangbean h: gh.ds){%>
	   		  <tr>
	   		    <td> 
	   		    <input name="check" type="checkbox" value="<%=h.getMasach()%>"> <br>
	   		    </td>
	   		    
	   		    <td>
	   		      <%=h.getMasach() %>
	   		    </td>
	   		    <td>
	   		      <%=h.getTensach() %>
	   		    </td><td>
	   		      <%=h.getGiasach() %>
	   		    </td>
	   		    <td><%=h.getSoluong() %> </td>
	   		    <td>
	   		    <input name="<%=h.getMasach() %>" type="number" value="0" min="0"> 
	   		    
	   		    <button type="submit" name="butsua" value="<%=h.getMasach() %>"> Update</button>
	   		    <button type="submit" name="butxoa" value="<%=h.getMasach() %>"> Delete</button>
	   		    </td>
	   		    <td><%=h.getThanhtien() %> </td></tr>
	   		    <%} %>
   		 	</table>
   		 	<button type="submit" name="butcheck"> Xoá chọn</button>
   		 </form> 
   		    </td>
   		<td valign="top" width="200" >
   		
   <form action="htsach.jsp" method="get">
      <input class="form-control" name="txttk" type="text" value="" placeholder="Nhap tt"> <br>
      <input class="btn-primary" name="butdn" type="submit" value="Search">
   	</form>	 
   		 </td>
   </tr>
</table>
	
</body>
</html>