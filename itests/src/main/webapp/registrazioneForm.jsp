<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
	<form id="registrazioneForm" action="insertOrUpdateAcc" method="post">
		<label for="username"> <input type="text"
			class="usernameInput" id="usernameInput" name="username"
			placeholder="Inserisci username">
		</label> 
		<label for="password"> <input type="password"
			class="passwordInput" id="passwordInput" name="password"
			placeholder="Inserisci password">
		</label>
		<button type="submit">Registrati</button>
	</form>
</body>
</html>