<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="../css/index_work.css"/>
	<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
	<script type="text/javascript">
		$(function (){
			$.ajax({
				url:"../queryCourseAll",
				success : function (obj) {
					for(var i in obj){
						
						$("#td").append("<input type='checkbox' name='cids' class='cids' value="+obj[i].cid+">"+obj[i].cname);
						}
					
					},
				dataType:"json"
				});
			
			$("#btn").click(function (){
				$.post(
					"../addStudent",//url
					$("#form").serialize(),//data
					function (obj){//成功时回调函数
							if(obj){
								location = "../list"
								}
						},
					"json"//dataType
						);

				});
				
			
			});
		
	</script>
</head>
<body>
	<form id="form">
		<table>
			<tr>
				<td>用户名</td>
				<td>
					<input type="text" name="username" id="username"/>
				</td>
			</tr>
			<tr>
				<td>密码</td>
				<td>
					<input type="text" name="password" id="passord"/>
				</td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					<input type="radio" name="sex" class="sex"value="男"/>男
					<input type="radio" name="sex" class="sex"value="女"/>女
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td>
					<input type="text" name="age" id="age"/>
				</td>
			</tr>
			<tr>
				<td>爱好</td>
				<td>
					<input type="checkbox" name="hobby" class="hobby" value="抽烟"/>抽烟
					<input type="checkbox" name="hobby" class="hobby" value="喝酒"/>喝酒
					<input type="checkbox" name="hobby" class="hobby" value="烫头"/>烫头
				</td>
			</tr>
			<tr>
				<td>请选择课程</td>
				<td id="td">
					
				</td>
			</tr>
			<tr>
				<td colspan="2">
					 <input type="button" value="添加" id="btn"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>