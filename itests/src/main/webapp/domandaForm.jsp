<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserimento Domanda</title>
</head>
<body>
	<form action="insertOrUpdateCat" method="post">
		<input type="text" class="categoria" id="categoria">
		<button type="submit">Conferma</button>
	</form>
	<form action="insertOrUpdateDom" method="post">
		<input type="text" name="domanda" id="domanda"> 
		<select>
            <option value="java">Java</option>
			<c:forEach var="cat" items="${listaCategoria}">
				<option value="${cat.getId()}">${cat.getCategoria()}</option>
			</c:forEach>
		</select>
		<button type="submit">Conferma</button>
	</form>
</body>
</html>