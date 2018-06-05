<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		First Name:	<form:input path="firstName" placeholder="First Name"/>
		<br/>
		Last Name:	<form:input path="lastName" placeholder="Last Name"/>
		<br/>
		Country: <form:select path="country" >
					<form:option value="Bulgaria" label="Bulgaria" />
					<form:option value="Germany" label="Germany" />
					<form:option value="Greece" label="Greece" />
					<form:option value="Turkey" label="Turkey" />			
				 </form:select>
		<br/>
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>