<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<table>
		<tr>
			<td>
				<% String user = request.getParameter("username"); %>
				<a>Welcome <%out.println(user); %>User!! You have logged in</a>
			</td>
		</tr>
		<tr>
			<td>
				<a href = "login2.jsp"><b>LOGIN</b></a>
			</td>
		</tr>
	</table>
</body>
</html>