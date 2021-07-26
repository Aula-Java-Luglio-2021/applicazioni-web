<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
<link rel="stylesheet" href="css/mioStile.css" type="text/css">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<form id="form" action="AvvioServlet" method="post">
		<label>Username</label> <input id="username" type="text"
			placeholder="Inserisci username" name="username"> <small
			id="smallUser"></small> <br> <br> 
		<label>Password</label> <input
			id="password" type="password" placeholder="Inserisci password" name="password">
		    <small id="smallPassword"></small> <br> <br> 
		<label>E-mail</label>
		<input id="email" type="text" placeholder="Inserisci email"
			name="email"> <small id="smallEmail"></small> <br> <br>
		<button id="bottone" type="button" onclick="validazione()">Registrati</button>
	</form>
	<script src="JS/validazioneLogin.js" type="text/javascript"></script>
</body>
</html>