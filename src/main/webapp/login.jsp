<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="../css/index_work.css"/>
	</head>
	<body>
		
		${login_error }
		
		<form action="login" method="post">
			<input type="text" name="username"/><br>
			<input type="password" name="password"/><br>
			<input type="submit" value="登录"/>
		</form>
	</body>
</html>