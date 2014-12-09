<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Create your account nigga!</h1>
${message }
	<div class="createContainer">
		<form:form method="POST" action="users" commandName="user">
			<form:label path="email">Enter your email address</form:label>
			<form:input path="email" /><br>
		
			<form:label path="password">Create Password</form:label>
			<form:input path="password" /><br>
			<label>Verify Password</label>
			<input type="password" /><br>
			<input type="submit">
		</form:form>
		
	</div>
		
	
	
</body>
</html>