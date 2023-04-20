<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing info</title>
</head>
<body>
<h2>Invoice Details</h2>
First Name : ${billing.firstName}<br/>
Last Name  : ${billing.lastName}<br/>
Email Id   : ${billing.email}<br/>
Mobile No. : ${billing.mobile}<br/>
Product    : ${billing.product}<br/>
Amount     : ${billing.amount}<br/>

<form action="sendEmailBilling" method="post">
<input type="hidden" name="email" value="${billing.email}"/>
<input type="submit" value="Share Invoice copy by Email"/>
</form>

</body>
</html>