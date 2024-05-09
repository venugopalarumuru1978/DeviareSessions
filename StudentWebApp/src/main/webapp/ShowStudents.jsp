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
<title>Insert title here</title>
</head>
<body>
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
<table width="100%" border="1">
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
</body>
</html>