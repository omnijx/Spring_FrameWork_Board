<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 로그인 여부 체크 --%>
<c:set var="loginId" value="${loginId }"/>
<c:choose>
	<c:when test="${empty loginId}">
		<script>
			alert("로그인부터 하세요"); 
			location.href = "${pageContext.request.contextpath}/";
		</script>
	</c:when>
</c:choose>
<%-- //로그인 여부 체크 --%>

<!DOCTYPE html> 
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="resources/js/jquery-3.7.0.min.js"/></script>
	<script>
		$(function(){
			$(".boardList").click(function(){
				let bno = $(this).find(".bno").text();
				location.href = "BoardDetail?bno="+bno+"&page=${page}"
			});
			
			$("#btnWrite").click(function(){
				location.href = "BoardWritePage";
			});
		});
	</script>
	<style>
		body {
			background-color: #eeeeee;
		}
		.main {
			margin: auto;
		}
		.head {
			text-align: center;
		}
		table {
			margin: auto;
/* 			box-shadow: 0px 0px 3px rgba(0, 0, 0, 1.2); */
		}
		tr:first-child {
			font-size: 20px;
    		font-weight: 600;
    		background-color: #dbdbdb !important;
    	}
		table, th, td {
			border: 1px solid black;
		    border-collapse: collapse;
		    width: 730px;
		    height: 40px;
		    text-align: center;
		}
		
		.page {
			text-align: center;
		    margin-top: 20px;
		}
		#btnWrite {
			width: 100px;
		    height: 30px;
		    margin-left: 1105px;
		    background-color: #c4c4c4;
		    border: 0;
		    color: white;
		    font-size: 17px;
		    margin-bottom: 100px;
		}
    	tr td:nth-child(1) {
    		width: 300px;
		}
    	tr td:nth-child(2) {
		}
    	tr td:nth-child(3) {
    		width: 300px;
		}
    	tr td:nth-child(4) {
    		width: 300px;
		}
    	tr td:nth-child(5) {
		}
		a {
			text-decoration: none;
		    width: 25px;
		    height: 25px;
		    display: inline-block;
		    background-color: #c4c4c4;
		    color: white;
		}
		.boardList {
			background-color: white;
		}
	</style>
</head>
<body>
	<div class="main">
		<h1 class="head">게시글 전체 보기</h1>
		<table>
			<tr>
				<td>글번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>조회수</td>
				<td>작성일시</td>
			</tr>
			<c:forEach var="dto" items="${listBoard}">
				<tr class="boardList">
					<td class="bno">${dto.bno}</td>
					<td>${dto.title}</td>
					<td>${dto.writer}</td>
					<td>${dto.hitcount}</td>
					<td>${dto.writedate}</td>
				</tr>
			</c:forEach>
		</table>
		<div class="page">
			<c:forEach begin="1" end="${pageCount}" var="index">
				<c:choose>
					<c:when test="${index == page}">
						<a>
						<span style="color: black">${index}</span>
						</a>
					</c:when>
					<c:otherwise>
						<a href="BoardList?page=${index}">${index}</a>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</div>
		
		<button id="btnWrite">글쓰기</button>
	</div>
</body>
</html>
