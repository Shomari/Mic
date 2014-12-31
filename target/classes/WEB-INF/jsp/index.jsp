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

<!-- Google Web Fonts -->
<link href='http://fonts.googleapis.com/css?family=Comfortaa:400,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Open+Sans:800' rel='stylesheet' type='text/css'>



<title>Mic.Social</title>
</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<p class="navbar-brand">Mic.Social</p>				
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li>
    					<form action="join">
        					<button class="btn btn-default navbar-btn join">Join</button>
    					</form>
					</li>			
				</ul>
			</div>
		</div>
	</nav>

	<div class="container homepage">
		<div class="row text-center headline">			
			<p>Finding teammates has never been easier</p>
		</div>
		<div class="row desc-login">
			<div class="col-md-6 description">
				<p>Connect with console gamers who want to talk while playing multiplayer games coopertivaly </p>
			</div>
			<div class= "col-md-4 col-md-offset-1">
				<form class="form-signin" id="login" role="form" method="POST" action="session">	
	  				<c:set var="hope" value="${param.message}"/>
	  				<c:if test="${hope!=null}">
     					<span id="error">${param.message}</span>
    				 </c:if>
       				 <span class="form-signin-heading text-center">Sign-in</span>
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