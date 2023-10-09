<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="resources/js/jquery-3.7.0.min.js"/></script>
	<script>
		$(function(){
			$(".toBoardList").click(function(){
				location.href = "BoardList?page=${page}";
			});
			$(".btnBoardUpdate").click(function(){
				location.href = "BoardUpdatePage?page=${page}&bno=${boardDetail.bno}";
			});
			$(".btnBoardDelete").click(function(){
				location.href = "BoardDelete?bno=${boardDetail.bno}";
			});
		});
	</script>
	<style>
		body {
			background-color: #eeeeee;
		}
		table {
			margin: auto;
			margin-top: 20px;
		}
		.btns {
			text-align: center;
			margin-top: 10px;
		}
		table th {
			background-color: #c4c4c4;
		    width: 65px;
		    border-radius: 30px;
		}
		table td {
			width: 500px;
		    height: 35px;
		    border-radius: 15px;
		    border: 0;
		    background-color: white;
    		padding-left: 20px;
		}
		table tr:nth-child(5) td {
			 width: 500px;
		    height: 200px;
		    border-radius: 5px;
		    border: 0;
		}
		table tr:nth-child(5) th {
			background-color: #c4c4c4;
		    width: 65px;
		    border-radius: 5px;
		}
		.btn {
			width: 106px;
		    height: 30px;
		    font-size: 16px;
		    background-color: #c3c3c3;
		    border: 0;
		    border-radius: 20px;
		}
		.btnBoardDelete {
		    background-color: #3d3c3c;
    		color: white;
		}
		.head {
			text-align: center;
			margin-top: 50px;
		}
	</style>
</head>
<body>
	<h1 class="head">게시글 상세보기 </h1>
	<table>
		<tr>
			<th>제목</th>
			<td>${boardDetail.title}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${boardDetail.writer}</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${boardDetail.writedate}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${boardDetail.hitcount}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${boardDetail.content}</td>
		</tr>
	</table>
	<div class="btns">
		<input type="button" value="목록" class="toBoardList btn"/>
		<input type="button" value="수정" class="btnBoardUpdate btn"/>
		<input type="button" value="삭제" class="btnBoardDelete btn"/>
	</div>
</body>
</html>