<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>showing all contacts</title>
</head>
<body>
<h2>All Contacts</h2>

<table  border=1>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email Id</th>
<th>Mobile No.</th>
<th>Source</th>
<th>Billing</th>
</tr>
<c:forEach var="contact" items="${contacts}">
<tr>
<td><a href="contactInfo?id=${contact.id}">${contact.firstName}</a></td>
<td>${contact.lastName}</td>
<td>${contact.email}</td>
<td>${contact.mobile}</td>
<td>${contact.source}</td>
<td><a href="generateBill?id=${contact.id}">Make Invoice</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>