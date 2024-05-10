<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored="false" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%@ page import="com.entities.*" %>
    <%@ page import="com.connections.*" %>
    <%@ page import="com.service.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Student Information</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body class="text-bg-primary">
<div class="container-fluid">
<!-- Presenting db data using JSTL tag -->
<%

	if(session.getAttribute("admn")!=null)
	{
		StudentService ss = new StudentService();
	List<Student>  stdlist = ss.ShowAll();
	pageContext.setAttribute("sinfo", stdlist);
%>

<jsp:include page="Links.jsp" />
<h1 style="text-align: center;">Students Information</h1>
<hr />
<table class="table table-dark table-hover">
<tr>
<th>Roll Number</th>
<th>Student Name</th>
<th>Course</th>
<th>Fees</th>
<th>Email</th>
<th>Password</th>
<th>Operations</th>
</tr>

<c:forEach var="std"  items="${sinfo }">

<c:url var="deletestudent" value="DeleteStd.jsp">
	<c:param name="rno" value="${std.rollno }"/>
</c:url>

<tr>
	<td>
		<c:out value="${std.rollno }" />
	</td>
	<td>
		<c:out value="${std.sname }" />
	</td>
	<td>
		<c:out value="${std.course }" />
	</td>
	<td>
		<c:out value="${std.fees }" />
	</td>
	<td>
		<c:out value="${std.email }" />
	</td>
	<td>
		<c:out value="${std.pswd }" />
	</td>
	<td>
		<a href="${deletestudent }">Delete</a>
	</td>

</tr>
</c:forEach>

</table>
<%
	}
	else
		response.sendRedirect("Login.jsp");
%>
</div>
</body>
</html>