<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" isELIgnored = "false"%>

<!DOCTYPE html>
<html>
	<head>
		<title>USER WEB APP</title>
	</head>
	<body>
		<form action="details" method="get">
			<label>Search:- </label>
			<input type="text" name="q">
			<input type="submit" value="Click Me">
		</form>
		<h1>${d1}</h1>
	</body>
</html>