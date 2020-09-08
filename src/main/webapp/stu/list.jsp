<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/index_like.css"/>
<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function (){
		$("#add").click(function (){
			location="stu/add.jsp";
			
			})

		})
</script>
</head>
<body>
	${login_success }
	<table>
		<tr>
			<td>序号</td>
			<td>用户名</td>
			<td>密码</td>
			<td>性别</td>
			<td>年龄</td>
			<td>爱好</td>
			<td>所学课程</td>
			<td>
				<input type="button" name="tianjia" value="添加" id="add"/>
			</td>
		</tr>
		<c:forEach items="${list }" var="s" varStatus="i">
			<tr>
				<td>${i.count }</td>
				<td>${s.username }</td>
				<td>${s.password }</td>
				<td>${s.sex }</td>
				<td>${s.age }</td>
				<td>${s.hobby }</td>
				<td>
					<c:forEach items="${s.stuCou }" var="sc">
						${sc.course.cname }
					</c:forEach>
				</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>