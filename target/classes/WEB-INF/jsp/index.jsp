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
<!-- Optional: Incorporate the Bootstrap JavaScript plugins -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/css/index.css">
<script src="${pageContext.request.contextPath}/resources/styles/js/index.js"></script>
<link href='http://fonts.googleapis.com/css?family=Comfortaa:700' rel='stylesheet' type='text/css'>
<title>Mic.Social</title>
</head>
<body>

	<div class="jumbotron container-fluid">
		<div class="row">
			<div class="col-md-6">
				<h1 id="index_header">Mic.Social</h1>			
			</div>
			<div class="col-md-5">
				<p>Find players with mics to play games with</p>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-6">
				${message }
				Top Xbox One Games
				<ul>
					<li>Destiny</li>
					<li>Call of Duty: Advanced Warfare</li>
					<li>Halo: The Master Chief Collection</li>
					<li>Grand Theft Auto 5</li>
				</ul>			
			</div>
			<div class="col-md-6">
				Top PlayStation 4 Games
				<ul>
					<li>Destiny</li>
					<li>Call of Duty: Advanced Warfare</li>
					<li>Fifa 15</li>
					<li>Grand Theft Auto 5</li>
				</ul>			
			</div>	
			<div class="row">
				<div class="col-md-12">
				<button class="btn btn-lg btn-primary sign-in"><span class="glyphicon glyphicon-off"></span> </button>
				<a href="#" class="btn btn-lg btn-primary"><span class="glyphicon glyphicon-pencil"></span> </a>
				</div>
			</div>	
		</div>	
	</div>
	<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
	  <form class="form-signin" id="login" role="form" method="POST" action="session">	
	  <c:set var="hope" value="${param.message}"/>
	  <c:if test="${hope!=null}">
     	<span id="error">${param.message}</span>
     </c:if>
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" name="email" class="form-control inputs" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password" id="inputPassword" class="form-control inputs" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
      </div>
     </div>
     </div>
     




</body>
</html>