<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello JSP - It is JSP Page - JSTL Tags</h1>
<h1>
<c:out value="${'hello world' }" />
</h1>
<c:set var="sal"  value="${25000}" />
<c:set var="ename"  value="${'Pavani' }" />
<h2>
Emp Name : <c:out value="${ename }" />
<br /><br />
Salary : <c:out value="${sal }" />

<c:if test="${sal>=20000 }">
	<p> Salary is above or equals 20000  </p>
</c:if>

<c:if test="${sal<20000 }">
	<p> Salary is below 20000  </p>
</c:if>
</h2>

<h2>

<c:choose>  
    <c:when test="${sal <20000}">  
       Salary is not good.  
    </c:when>  
    <c:when test="${sal >= 20000}">  
        Salary is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  
</h2>

<c:remove var="ename"/>
Emp Name : <c:out value="${ename }" />
<c:forEach var="i" begin="1" end="10">
	<c:out value="${i }" />
</c:forEach>
<br />
<c:url value="/Welcome.jsp" var="urlinfo" />
<c:out value="${urlinfo }" />
<br />
<a href="${urlinfo }">Page</a>
<br />

<c:url value="/Error.jsp" var="urlinfos">
	<c:param name="user"  value="Praveen Kumar" />
	<c:param name="loc"  value="Hyderabad" />
</c:url>
<br />
<c:out value="${urlinfos }" />
<br /><br />
<a href="${urlinfos }">New Page</a>
</body>
</html>