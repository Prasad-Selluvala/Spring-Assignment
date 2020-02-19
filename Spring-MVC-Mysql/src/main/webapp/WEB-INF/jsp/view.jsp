<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:forEach var ="prod"  items="${viewProducts}">

<table>

	<tr>
	<td>${prod.id}</td>
	<td>${prod.name}</td>
	<td>${prod.price}</td>
	<td>${prod.brand}</td>
	<td>${prod.maiden}</td>
</table>
</c:forEach>



</body>
</html>