<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>updatepage</title>
</head>
<body>
<h2>Update|Lead</h2>
<form action="updatelead"method="post">
<pre>
<input type="hidden" name="id" value="${lead.id}"/>
FirstName<input type="text"name="firstName"value="${lead.firstName}"/>
LastName<input type="text"name="LastName"value="${lead.lastName}"/>
Email<input type="text"name="email"value="${lead.email}"/>
Mobile<input type="text"name="mobile"value="${lead.mobile}"/>
<input type="submit"value="update"/>
</pre>
</form>
</body>
</html>