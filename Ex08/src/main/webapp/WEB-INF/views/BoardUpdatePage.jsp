<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		<style>
	body {
		background-color: #eeeeee;
	}
	.main {
/* 		text-align: center; */
		padding-left: 566px;
	}
	.btn {
		margin-left: 240px;
	    margin-top: 15px;
	    width: 106px;
	    height: 30px;
	    font-size: 16px;
	    background-color: #c3c3c3;
	    border: 0;
	    border-radius: 20px;
	}
	</style>
</head>
<body>
	<div class="main">
		<h1 style="
		    margin-left: 240px;
		">글 수정</h1>
		<form action="BoardUpdate">
		<input type="hidden" name="bno" value="${bno}"/>
		<input type="hidden" name="page" value="${page}"/>
			<table>
				<tr>
					<th style="
					    background-color: #c4c4c4;
					    width: 65px;
					    border-radius: 30px;
					">제목</th>
					<td>
						<input type="text" name="title" style="
						    width: 500px;
						    height: 35px;
						    border-radius: 15px;
						    border: 0;
						"/>
					</td>
				</tr>
				<tr>
					<th style="
					    background-color: #c4c4c4;
					    width: 65px;
					    border-radius: 5px;
					">내용</th>
					<td>
						<input type="text" name="content" style="
						    width: 500px;
						    height: 200px;
						    border-radius: 5px;
						    border: 0;
						"/>
					</td>
				</tr>
			</table>
			<input type="submit" class="btn" value="등록"/>
		</form>
	</div>
</body>
</html>