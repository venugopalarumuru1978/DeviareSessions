<%
String uname = request.getParameter("txtUser");
String pwd = request.getParameter("txtPass");

if(uname.equals("Venugopal") && pwd.equals("v@123"))
	response.sendRedirect("Welcome.jsp");
else
	response.sendRedirect("Error.jsp");
%>
