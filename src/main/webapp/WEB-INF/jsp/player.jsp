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
	<form:form commandName="system">
		<form:select path="name" items="${systems}"></form:select>
	</form:form>
	<form:form commandName="game">
		<form:select path="name" items="${xb1}"></form:select>
		<form:select path="name" items="${xb360}"></form:select>
		<form:select path="name" items="${ps4}"></form:select>
		<form:select path="name" items="${ps3}"></form:select>
	</form:form>


</body>
</html>

