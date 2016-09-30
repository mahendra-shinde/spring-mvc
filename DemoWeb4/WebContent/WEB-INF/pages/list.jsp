<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>List of products</h1>

<c:if test="${productList == null or empty productList }">
	No Products found!
</c:if>

<c:if test="${productList != null and not empty productList }">
	Products found!
	<table>
	<tr>
		<td>Name of Product</td>
		<td>Description</td>
		<td>Price [INR]</td>
	</tr>
	<c:forEach items="${productList}" var="p">
	<tr>
		<td>${p.name }</td>
		<td>${p.description }</td>
		<td>${p.price }</td>
	</tr>	
	</c:forEach>
	</table>
</c:if>
</body>
</html>