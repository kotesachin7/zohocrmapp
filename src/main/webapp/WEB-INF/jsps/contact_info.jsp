<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact info</title>
</head>
<body>
<h2>Contact Details</h2>
First Name : ${contact.firstName}<br/>
Last Name  : ${contact.lastName}<br/>
Email Id   : ${contact.email}<br/>
Mobile No. : ${contact.mobile}<br/>
Source     : ${contact.source}<br/>

<form action="sendEmailToContact" method="post">
<input type="hidden" name="email" value="${contact.email}"/>
<input type="submit" value="Send Email"/>
</form>

<form action="convertContact" method="post">
<input type="hidden" name="id" value="${contact.id}"/>
<input type="submit" value="Convert To"/>
</form>


</body>
</html>