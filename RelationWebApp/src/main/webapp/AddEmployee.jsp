<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">Employee Registration</h1>
	<hr />
<form method="post" action="AddEmp">
	<p style="text-align: center;">
		<input type="text"  name="txtEname"  placeholder="Employee Name" required />
		<br /><br />
		<label>Employee Job</label><br />
		<select name="ddlJob">
			<option value="Manager">Manager</option>
			<option value="Developer">Developer</option>
			<option value="Tester">Tester</option>
			<option value="P-Manager">Project Manager</option>
		</select>
		<br /><br />
		<input type="text"  name="txtSal"  placeholder="Salary " required />
		<br /><br />
		<textarea name="txtAdrs"  rows="5" cols="30" placeholder="Address"></textarea>
		<br /><br />
		<input type="text"  name="txtLoc"  placeholder="Location " required />
		<br /><br />
		<input type="submit"  value="Register Here" />
	</p>
</form>
</body>
</html>