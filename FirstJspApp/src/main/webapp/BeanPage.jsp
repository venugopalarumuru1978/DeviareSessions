<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="Obj1" class="com.entities.Sample" scope="session"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Obj1.setX(100);
	Obj1.setY(200);
%>
<h1>Using Scriplet Tag</h1>
<h1>X value is : <%=Obj1.getX() %></h1>
<h1>Y value is : <%=Obj1.getY() %></h1>

<hr />
<jsp:setProperty name="Obj1" property="x" value="120" />
<jsp:setProperty name="Obj1" property="y" value="240" />
<h1>Using setProp and getProp</h1>
<h1>X value : <jsp:getProperty name="Obj1" property="x" /> </h1>
<h1>Y value : <jsp:getProperty name="Obj1" property="y" /> </h1>

</body>
</html>