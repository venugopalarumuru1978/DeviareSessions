<%@page import="com.service.StudentService"%>

<%

	String rno = request.getParameter("rno");

StudentService ss = new StudentService();
	ss.DeleteStudent(Integer.parseInt(rno));

	response.sendRedirect("ShowStudents.jsp");
%>