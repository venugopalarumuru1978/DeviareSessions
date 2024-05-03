package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entities.Employee;
import com.operations.EmpOperations;

/**
 * Servlet implementation class EmpWelcome
 */
@WebServlet("/EmpWelcome")
public class EmpWelcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpWelcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		if(session.getAttribute("eUser")!=null)
		{
			out.print("<p style='text-align: center;'>");
			out.print("<a href='EmpWelcome'>Home</a>");
			out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
			out.print("<a href='ChangePassword.html'>Change Password</a>");
			out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
			out.print("<a href='EmpLogout'>Logout</a></p><hr />");
			
			String uname = (String)session.getAttribute("eUser");
			out.print("<h3>Welcome to : " + uname + "</h3><hr />");
			int eno = (Integer)session.getAttribute("eid");
			EmpOperations e_oper = new EmpOperations();
			Employee e = e_oper.SearchEmployee(eno);
			out.print("<table width='100%' border='1'>");
			out.print("<tr><th>Empno</th><th>EmpName</th><th>Job</th><th>Salary</th><th>Email</th><th>Password</th></tr>");
			out.print("<tr>");
			out.print("<td>" + e.getEmpno() + "</td>");
			out.print("<td>" + e.getEmpname() + "</td>");
			out.print("<td>" + e.getJob() + "</td>");
			out.print("<td>" + e.getSalary() + "</td>");
			out.print("<td>" + e.getEmail() + "</td>");
			out.print("<td>" + e.getPswd() + "</td>");
			out.print("</tr></table>");
		}
		else
			response.sendRedirect("Login.html");
	}

}
