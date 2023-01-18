<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead|Create</title>
</head>
<body>
<h2>create new lead</h2>
<form action="savelead"method="post">
<pre>
FirstName<input type="text"name="firstName"/>
LastName<input type="text"name="LastName"/>
Email<input type="text"name="email"/>
Mobile<input type="text"name="mobile"/>
<input type="submit"value="save"/>
</pre>
</form>
${saveMsg}
</body>
</html>