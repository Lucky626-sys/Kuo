<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>樂透號碼產生器</title>
	</head>
	<body>
		<h1>今彩539 您的幸運號碼是:</h1>
		<h2>
			<%--顯示 servlet傳遞過來的資料--%>
			${ numbers }	<%--EL Language--%>
		</h2>
	</body>
</html>