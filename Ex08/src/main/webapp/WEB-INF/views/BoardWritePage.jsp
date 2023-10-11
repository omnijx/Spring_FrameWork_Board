<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="resources/js/jquery-3.7.0.min.js"/></script>
	<style>
	body {
		background-color: #eeeeee;  
	}
	.main {
/* 		text-align: center; */
		padding-left: 566px;
	}
	.btn {
		margin-left: 265px;
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
		    margin-left: 265px;
		">글쓰기</h1>
		<form action="BoardWrite" class="form">
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
					    border-radius: 30px;
					">작성자</th>
					<td>
						<input type="text" name="writer" readonly="readonly" value="${id}" style="
						    width: 500px;
						    height: 35px;
						    font-size: 15px;
						    font-weight: 500;
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
