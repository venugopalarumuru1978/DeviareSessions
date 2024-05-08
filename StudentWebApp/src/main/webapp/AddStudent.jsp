<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Links.jsp" />
<h1 style="text-align: center;">Student Registration</h1>
	<hr />
<form method="post" action="AddStd">
	<p style="text-align: center;">
		<input type="text"  name="txtSname"  placeholder="Student Name" required />
		<br /><br />
		<input type="text"  name="txtCourse"  placeholder="Student Course" required />
		<br /><br />
		<input type="text"  name="txtFees"  placeholder="Fees " required />
		<br /><br />
		<input type="email"  name="txtEmail"  placeholder="Email " required />
		<br /><br />
		<input type="text"  name="txtPass"  placeholder="Password " required />
		<br /><br />
		<input type="submit"  value="Register Here" />
	</p>
</form>
</body>
</html>