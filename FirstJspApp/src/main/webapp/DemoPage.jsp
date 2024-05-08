<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World - JSP Page</h1>
<%
int x = 100;
float y = 12.45f;
List<String> strlst = new ArrayList<String>();
strlst.add("Pavan");
strlst.add("Kumar");
strlst.add("Kalyan");
strlst.add("Murali");
strlst.add("Pavani");
out.print("Hello");
%>

<h1>X value is : <%=x %></h1>
<h1>Y value is : <%=y %></h1>
<h1>Addition Value is : <%=(x+y) %></h1>
<h2>List values : <%=strlst %></h2>
<hr />
<%
for(String s : strlst)
{
%>
	<p style="color:green">
		<b>
			<%=s %>
		</b>
	</p>
<%
}
%>

<jsp:include page="Page2.jsp"/>
<jsp:forward page="Page2.jsp"/>
</body>
</html>