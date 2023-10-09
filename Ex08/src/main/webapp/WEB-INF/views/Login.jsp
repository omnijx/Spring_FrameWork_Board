<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="msg" value="${msg }"/>
<c:choose>
	<c:when test="${not empty msg}">
		<script>alert("${msg}");</script>
	</c:when>
</c:choose>
<!DOCTYPE html>
<html>
<head>
<style>
	* {
		background-color: #eeeeee;
	}
	.head {
		text-align: center;
	}
	.box {
		text-align: center;
	    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
	    width: 400px;
	    margin: auto;
	    padding: 20px;
	    margin-top: 120px;
	    border-radius: 20px;
	}
	.idBox {
		width: 280px;
	    height: 30px;
	    border: 0;
   	    border-radius: 20px;
		background-color: #d5d5d5;
		box-shadow: 0px 0px 3px rgba(0, 0, 0, 1.2);
		margin-bottom: 10px;
	}
	.pwBox {
		width: 280px;
    	height: 30px;
    	border: 0;
        border-radius: 20px;
		background-color: #d5d5d5;
		box-shadow: 0px 0px 3px rgba(0, 0, 0, 1.2);
		margin-bottom: 20px;
	}
	input::placeholder {
		padding-left: 10px;
  	    color: black;
	}
	.login {
		width: 80px;
	    height: 30px;
	    border: 0;
	    border-radius: 20px;
	    background-color: #645e5e;
	    box-shadow: 0px 0px 3px rgba(0, 0, 0, 1.2);
	    margin-bottom: 20px;
	    color: white;
	}
	
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="box">
		<h1 class="head">Login</h1>
		<form action="LoginCheck" method="post"> <br/>
			<input type="text" name="id" class="idBox" placeholder="ID"/> <br/>
			<input type="password" name="pw" class="pwBox" placeholder="PassWord"/> <br/>
			<input type="submit" class="login" value="login"/>
		</form>
	</div>
</body>
</html>