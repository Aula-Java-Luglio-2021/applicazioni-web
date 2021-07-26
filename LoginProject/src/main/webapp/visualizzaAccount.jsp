<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabella Account</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Password</th>
			<th>Email</th>
			<th>Modifica</th>
			<th>Cancella</th>
		</tr>
		<c:forEach var="acc" items="${listaAccount}">
			<tr>
				<td>${acc.getId()}</td>
				<td>${acc.getUsername()}</td>
				<td>${acc.getPassword()}</td>
				<td>${acc.getEmail()}</td>
				<td>?</td>
				<td><a href="AvvioServlet?deleteOn=true&id=${acc.getId()}"><button
							type="button">Rimuovi</button></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>