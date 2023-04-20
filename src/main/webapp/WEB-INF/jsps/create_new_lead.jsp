<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2>Create New Lead</h2>

<form action="createLead" method="post">
<pre>
Enter your details below:

First Name : <input type="text" name="firstName"/>
Last Name  : <input type="text" name="lastName"/>
Email Id   : <input type="text" name="email"/>
Mobile No. : <input type="number" name="mobile"/>

How did you got to know about us?

<select name="source">
  <option value="News Paper">News Paper</option>
  <option value="TV add">TV add</option>
  <option value="Roadside Banners">Roadside Banners</option>
  <option value="website">Web-site</option>
</select>

<input type="submit" value="save lead"/>
</pre>
</form>

${msg}

</body>
</html>