<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>generate bill</title>
</head>
<body>
<h2>Generate Invoice</h2>

<form action="generateInvoice" method="post">
<pre>
First Name : <input type="text" name="firstName" value="${contact.firstName}"/>
Last Name  : <input type="text" name="lastName" value="${contact.lastName}"/>
Email Id   : <input type="text" name="email" value="${contact.email}"/>
Mobile No. : <input type="number" name="mobile" value="${contact.mobile}"/>
Product    : <input type="text" name="product"/>
Amount (Rs): <input type="number" name="amount" />

<input type="submit" value="Generate Bill"/>
</pre>
</form>

${msg}

</body>
</html>