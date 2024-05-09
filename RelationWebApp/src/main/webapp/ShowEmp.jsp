<%@page import="com.entities.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.service.TestService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	TestService ts = new TestService();
	List<Employee> emplist = ts.ShowAll();
%>
<h1 style="text-align: center;">Employee Information</h1>
<hr />
<table width="100%" border="1">
<tr>
<th>Emp No</th>
<th>Emp Name</th>
<th>Job</th>
<th>Salary</th>
<th>Adderss</th>
<th>Location</th>
</tr>

<%
for(Employee e : emplist)
{	
%>

<tr>
<td><%=e.getEmpno() %>  </td>
<td><%=e.getEname() %>  </td>
<td><%=e.getJob() %>  </td>
<td><%=e.getSalary() %>  </td>
<td><%=e.getAdrs().getAdrsinfo() %>  </td>
<td><%=e.getAdrs().getLocation() %>  </td>
</tr>

<%
} 
%>
</table>
</body>
</html>