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
</style>
</head>
<body>
	<h1>글 쓰기</h1>
	<form action="WriteAction">
		<table>
			<tr>
				<th>등록자 정보</th>
				<td>
					<span>${loginId}</span>
				</td>
			</tr>
<!-- 						<tr> -->
<!-- 							<th>등록일</th> -->
<!-- 							<td> -->
<!-- 								<span>작성일</span> -->
<!-- 							</td> -->
<!-- 						</tr> -->
			<tr>
				<th>제목</th>
				<td>
					<input type="text" name="title" id="title" required>
				</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>
					<textarea rows="20" cols="30" style="width:100%;" id="content" name="content">	</textarea>
				</td>
			</tr>
		</table>
		
		<div class="writebtn">
			<div class="wb1">
				<input type="submit" value="등록">
				<input type="button" value="취소">
			</div>
		</div>
	</form>
</body>
</html>