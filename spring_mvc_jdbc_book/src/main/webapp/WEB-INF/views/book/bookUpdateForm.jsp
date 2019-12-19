<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Update Book</title>
		<style>
			h3{text-align: center;}
			table{margin: 0 auto;}
		</style>
	</head>
	<body>
		<h3>책 정보 수정</h3>
		<form method="post" action="/book/book/update">
		<table>
			<tr><td>책 번호</td>
				<td><input type="text" name="bookNo" value="${bk.bookNo }" readonly></td></tr>
			<tr><td>책 이름</td>
				<td><input type="text" name="bookName" value="${bk.bookName }"></td></tr>
			<tr><td>책 가격</td>
				<td><input type="text" name="bookPrice" value="${bk.bookPrice }"></td></tr>
			<tr><td>책 출판</td>
				<td><input type="text" name="bookPublisher" value="${bk.bookPublisher }"></td></tr>
			<tr><td>책 재고</td>
				<td><input type="text" name="bookStock" value="${bk.bookStock }"></td></tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="submit" value="submit">&nbsp&nbsp<input type="reset" value="reset">
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>