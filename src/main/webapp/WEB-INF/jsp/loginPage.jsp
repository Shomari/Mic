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
  <form:form method="POST" action="/session" commandName="player">
	<form:label path="email">email</form:label><br>
  <form:input path="email" /><br><br>
  
  <form:label path="password">password</form:label><br>
  <form:input path="password" />
  <input type="submit" />
	
</form:form>

</body>
</html>