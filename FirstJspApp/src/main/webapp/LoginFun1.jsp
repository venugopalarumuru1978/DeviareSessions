<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="LogObj" class="com.entities.LoginAction" scope="session"/>
<jsp:setProperty property="uname" name="LogObj" value='<%=request.getParameter("txtUser") %>'/>
<jsp:setProperty property="pswd" name="LogObj" value='<%=request.getParameter("txtPass") %>'/>

<h2>User Name : <jsp:getProperty property="uname" name="LogObj"/></h2>
<h2>Password : <jsp:getProperty property="pswd" name="LogObj"/></h2>

<c:set var="uname" value='<%=LogObj.getUname() %>' />
<c:set var="pswd" value='<%=LogObj.getPswd() %>' />
<h2><c:out value="${uname }" /></h2>
<h2><c:out value="${pswd }" /></h2>

<c:if test="${uname=='Venugopal' && pswd=='abcd' }">
	<jsp:forward page="Welcome.jsp"/>
</c:if>

<c:if test="${uname!='Venugopal' || pswd!='abcd' }">
	<jsp:forward page="Error.jsp"/>
</c:if>