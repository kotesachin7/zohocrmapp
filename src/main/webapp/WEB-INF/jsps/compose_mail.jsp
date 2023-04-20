<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose Mail</title>
</head>
<body>
<form action="triggerEmail" method="post">
<pre>
Email Id<input type="text" name="emailId" value="${email}"/>
Subject<input type="text" name="subject"/>
Type your Email body here
<textarea name="emailBody" rows="10" cols="50">
</textarea>

<input type="submit" value="Send"/>
</pre>
</form>

${msg}

</body>
</html>