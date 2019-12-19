<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert Book</title>
		<style>
			*{text-align: center;}
		</style>
	</head>
	<body>
		<br>
		<form method="post" action="/book/book/insert">
			책 번호 : <input type="text" name="bookNo"><br>
			책 이름 : <input type="text" name="bookName"><br>
			책 가격 : <input type="text" name="bookPrice"><br>
			책 출판 : <input type="text" name="bookPublisher"><br>
			책 재고 : <input type="text" name="bookStock"><br>
			<input type="submit" value="submit">&nbsp&nbsp<input type="reset" value="reset">
		</form>
	</body>
</html>