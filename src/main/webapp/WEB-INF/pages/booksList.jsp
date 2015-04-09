<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book List</title>
</head>
<body>
<p>Book List </p>
	${bookList}
	<c:forEach items="${booksList}" var="book">
		<p>Dentro: </p>
		<c:out value="${book.id}" />
		<c:out value="${book.bookName}" />
		<c:out value="${book.quantity}" />
		<c:out value="${book.price}" />
		
		
	</c:forEach>
</body>
</html>	