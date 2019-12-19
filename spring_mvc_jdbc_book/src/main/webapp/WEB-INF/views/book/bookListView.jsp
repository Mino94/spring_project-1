<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Book List</title>
		<style>
			h3{text-align: center;}
			table{margin: 0 auto;}
		</style>
	</head>
	<body>
		<h3>책 조회</h3>
		<table border='1' width='600'>
			<tr><td>책번호</td><td>책이름</td><td>책가격</td><td>책출판</td><td>책재고</td></tr>
			<c:forEach items="${bList }" var="book">
				<tr>
				<td><a href="<c:url value='/book/bookDetailView/${book.bookNo }'/>">${book.bookNo }</a></td>
				<td>${book.bookName }</td>
				<td>${book.bookPrice }</td>
				<td>${book.bookPublisher }</td>
				<td>${book.bookStock }</td></tr>
			</c:forEach>
		</table>
		<h3><a href="/book/">메인</a></h3>
	</body>
</html>