<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="test.ProductBean,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<ProductBean>al=(ArrayList<ProductBean>)request.getAttribute("alist");
if(al.size()==0)
{
	out.println("no products Avalaible");
}
else{
	Iterator<ProductBean> it=al.iterator();
	while(it.hasNext())
	{
		ProductBean pb=(ProductBean)it.next();
		out.println(pb.getCode()+"&nbsp&nbsp"+pb.getName()+"&nbsp&nbsp"+pb.getPrice()+"&nbsp&nbsp"+pb.getQty()+"<br>");
	}
}
%>
<%@include file="link.html" %>
</body>
</html>