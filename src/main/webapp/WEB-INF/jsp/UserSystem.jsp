<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- Optional: Include the jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<!-- jquery validation plugin -->
<script src=" http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.js"></script>


<!-- Optional: Incorporate the Bootstrap JavaScript plugins -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<!-- CSS and Javascripts -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/css/userSystem.css">
<script src="${pageContext.request.contextPath}/resources/styles/js/userSystem.js"></script>

<!-- Google Web Fonts -->
<link href='http://fonts.googleapis.com/css?family=Comfortaa:400,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>

<title>Insert title here</title>
</head>
<body>
		<h1>What systems do you own</h1>
${message }
	<div class="container">
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
		<div class="row">
			<div class="col-md-6 col-md-offset-3 text-center">
				<input type="hidden" name="user" value="${user}">							
				<label class="checkbox-inline ms"><input id="xbone" type="checkbox" name="XB1" value="true">Xbox One</label>			    	
				<label class="checkbox-inline ms"><input id="xbthree" type="checkbox" name="XB360" value="true">Xbox 360</label>			
				<label class="checkbox-inline sony"><input id="psthree" type="checkbox" name="PS4" value="true">PlayStation 4</label>					  
				<label class="checkbox-inline sony"><input id="psfour" type="checkbox" name="PS3" value="true">Playstation 3</label>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="form-group" id="gamertag">
					<label>Enter your Xbox Live gamertag</label>
					<input class="form-control" type="text" name="XBL">
				</div>
				<div class="form-group" id="psn">
					<label>Enter your PSN ID</label>
					<input class="form-control" type="text" name="PSN" value=null>
				</div>			
				<input type="submit" class="btn btn-default" id="account-submit">
			</div>
		</div>
		</form>		
	</div>
		



</body>
</html>