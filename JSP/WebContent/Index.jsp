<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "">
<input type = "text" name = "uname">
<input type = "text" name = "uname">
<input type = "submit" value = "go">
</form>
</form>
Hi <c:out value = "${paramValues.uname[0]} ${paramValues.uname[1]}"/>//the name should be that of "" in input tag
<table>
<c:forEach begin = "1" end = "10" var = "counter">
<tr><td> <c:out value = "${counter}"></c:out>
</td></tr></c:forEach>
</table>

</body>
</html>