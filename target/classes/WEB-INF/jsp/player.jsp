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

		<form action="online" method="POST">
			<select name="system">
				<c:forEach items="${systems}" var="system">
					<option value="${system.name}">${system.name}</option>
				</c:forEach>				
			</select>
			<select name="Xbox One">
				<c:forEach items="${xb1}" var="game">
					<option value="${game.name}">${game.name}</option>
				</c:forEach>				
			</select>
			<select name="Xbox 360">
				<c:forEach items="${xb360}" var="game">
					<option value="${game.name}">${game.name}</option>
				</c:forEach>				
			</select>
			<select name="PlayStation 4">
				<c:forEach items="${ps4}" var="game">
					<option value="${game.name}">${game.name}</option>
				</c:forEach>				
			</select>
			<select name="PlayStation 3">
				<c:forEach items="${ps3}" var="game">
					<option value="${game.name}">${game.name}</option>
				</c:forEach>				
			</select>
			
			<input type="submit">
		</form>

</body>
</html>

