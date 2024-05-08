<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
<!-- Presenting db data using Scriptlet tag -->
<%
	StudentService ss = new StudentService();
	List<Student>  stdlist = ss.ShowAll();
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
</tr>

<%
for(Student s : stdlist)
{	
%>

<tr>
<td><%=s.getRollno() %>  </td>
<td><%=s.getSname() %>  </td>
<td><%=s.getCourse() %>  </td>
<td><%=s.getFees() %>  </td>
<td><%=s.getEmail() %>  </td>
<td><%=s.getPswd() %>  </td>
</tr>

<%
} 
%>
</table>
</body>
</html>