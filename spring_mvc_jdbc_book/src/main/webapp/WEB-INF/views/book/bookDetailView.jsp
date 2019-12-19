<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Book Detail</title>
		<style>
			h3{text-align: center;}
			table{margin: 0 auto;}
		</style>
	</head>
	<body>
		<h3>책 상세 조회</h3>
		<table border='1' width='300'>
			<tr><td>책번호</td><td>${bk.bookNo }</td></tr>
			<tr><td>책이름</td><td>${bk.bookName }</td></tr>
			<tr><td>책가격</td><td>${bk.bookPrice }</td></tr>
			<tr><td>책출판</td><td>${bk.bookPublisher }</td></tr>
			<tr><td>책재고</td><td>${bk.bookStock }</td></tr>
		</table>
		<h3><a href="/book/book/bookListView">List</a></h3>
		<h3><a href="/book/book/updateForm/${bk.bookNo }">Update Book</a></h3>
		<h3><a href="javascript:deleteCheck();">Delete Book</a></h3>
		<script>
			function deleteCheck(){
				var answer = confirm("삭제하시겠습니까?");
				if(answer == true){
					location.href="/book/book/delete/${bk.bookNo}";
				}
			}
		</script>
	</body>
</html>