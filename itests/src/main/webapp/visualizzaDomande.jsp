<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Domanda</th>
			<th>Visualiza Risposte</th>
			<th>Modifica</th>
			<th>Elimina</th>
		</tr>
		<c:forEach var="domanda" items="${listaDomanda}">
			<tr>
				<td>${domanda.getDomanda()}</td>
				<td><button>Visualiza Risposte</button></td>
				<td><button>Modifica</button></td>
				<td><button>Elimina</button></td>
			</tr>
		</c:forEach>
	</table>
	<a href="getListaCategoria"><button>Aggiungi domanda</button></a>
</body>
</html>