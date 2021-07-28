<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<form:form action="/registration" method="post" modelAttribute="user">
	Username : <form:input id="username" type="text" name="username" path="username"/>
	<form:errors  path="username" class="text-danger"></form:errors><br><br>
	Password : <form:input id="password" type="text" name="password"  path="password"/>
	<form:errors  path="password"  class="text-danger"/><br><br>
	Email : <form:input id="email" type="text" name="email" path="email"/>
	<form:errors  path="email"  class="text-danger"/><br><br>
	Contact : <form:input id="contact" type="text" name="contact" path="contact"/>
	<form:errors  path="contact"  class="text-danger"/><br><br>
	City :
	<form:select id="city" name="city" path="city">
	  <option value="Karaikal">Karaikal</option>
	  <option value="Chennai">Chennai</option>
	  <option value="Delhi">Delhi</option>
	  <option value="Mumbai">Mumbai</option>
	  <option value="Kerala">Kerala</option>
	</form:select><br><br>
	Zipcode : <form:input id="zipcode" type="text" name="zipcode" path="zipcode"/>
	<form:errors  path="zipcode"  class="text-danger"/><span class="text-danger">${errorZip}</span>
	<br><br><br>
	<input type="Submit" value="Log in">
</form:form>
</body>
</html>