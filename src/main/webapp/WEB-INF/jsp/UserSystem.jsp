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
<%-- 		<form:form method="POST" action="systems" commandName="userSystem">
			<form:checkbox path="system"  />Xbox One
			<form:checkbox path="system"  />PlayStation 4<br>
			<form:checkbox path="system"  />Xbox 360
			<form:checkbox path="system" " />PlayStation 3<br><br>
			
			<form:label path="gamertag">Enter your Xbox Live GamerTag</form:label>
			<form:input path="gamertag" value="XBL" /><br>
			
    		<form:label path="gamertag">Enter your PSN Live GamerTag</form:label>
			<form:input path="gamertag" value="PSN ID"/> 
			
			<input type="submit">		
		</form:form> --%>
		
	
		
		
		<form action="systems" method="POST">
			
			<input type="hidden" name="user" value="${user }">
					
			Xbox One	<input type="checkbox" name="XB1" value="true">				    	
			Xbox 360	<input type="checkbox" name="XB360" value="true">
			
			PlayStation 4 <input type="checkbox" name="PS4" value="true">					  
			PlayStation 3 <input type="checkbox" name="PS3" value="true">
			
			<input type="text" name="XBL">Enter Your Xbox Live Gamertag
			<input type="text" name="PSN" value=null>Enter Your PSN ID
			
			
					
			
			<input type="submit">
		</form>
		
	</div>
		



</body>
</html>