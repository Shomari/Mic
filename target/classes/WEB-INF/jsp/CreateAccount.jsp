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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/css/createAccount.css">
<script src="${pageContext.request.contextPath}/resources/styles/js/createAccount.js"></script>

<!-- Google Web Fonts -->
<link href='http://fonts.googleapis.com/css?family=Comfortaa:400,700' rel='stylesheet' type='text/css'>

<title>Mic.Social Create Account Page</title>
</head>
<body>


${message }
	<div class="container">
		<div class="row form">
			<div class="col-md-4 col-md-offset-4">
				<div class="form-group">
					<form:form role="form" method="POST" action="users" commandName="user">
						<fieldset>
						<h1>Create your account</h1>
						<form:label path="email">Enter your email address</form:label>
						<form:input type="email" class="form-control" id="email" path="email" required="required"/>
				</div>
				<div class="form-group">				
					<form:label path="password">Create Password</form:label>
					<form:password class="form-control" id="pwd" path="password" required="required" />
				</div>
				<div class="form-group">
					<label>Verify Password</label>
					<input class="form-control" id="confirm-pwd" type="password" oninput="check(this)" required="required" /><br>
				</div>
					<input class="btn btn-default" type="submit">
						</fieldset>
				</form:form>
			</div>
		</div>
		
	</div>
		
	
	
</body>
</html>