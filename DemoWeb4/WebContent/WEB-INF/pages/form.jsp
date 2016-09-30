<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form modelAttribute="product">
	<table>
	<tr>
		<td>Name </td>
		<td><sf:input path="name"/> </td>
		<td><sf:errors path="name" /> </td>
	</tr>
	<tr>
		<td>Description </td>
		<td><sf:input path="description"/> </td>
		<td><sf:errors path="description"/> </td>
	</tr>
	<tr>
		<td>Price </td>
		<td><sf:input path="price"/> </td>
		<td><sf:errors path="price"/> </td>
	</tr>
	<tr>
		<td>Manufacturing date </td>
		<td><sf:input path="mfd"/> </td>
		<td><sf:errors path="mfd"/> </td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="save"/>
		</td>
	
	</tr>
	
		
	</table>


</sf:form>
</body>
</html>