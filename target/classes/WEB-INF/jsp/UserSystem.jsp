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
		<form:form method="POST" action="systems" commandName="userSystem">
			<form:checkbox path="system_id" value="1" />Xbox One
			<form:checkbox path="system_id" value="2" />PlayStation 4<br>
			<form:checkbox path="system_id" value="3" />Xbox 360
			<form:checkbox path="system_id" value="4" />PlayStation 3
			
			<form:label path="XBLgamertag">Enter your Xbox Live GamerTag</form:label>
			<form:input path="XBLgamertag" />
			
			<form:label path="XBLgamertag">Enter your Xbox Live GamerTag</form:label>
			<form:input path="XBLgamertag" />			
		</form:form>
		
	</div>
		



</body>
</html>