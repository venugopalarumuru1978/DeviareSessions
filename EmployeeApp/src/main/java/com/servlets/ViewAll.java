package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Employee;
import com.operations.EmpOperations;

/**
 * Servlet implementation class ViewAll
 */
@WebServlet("/ViewAll")
public class ViewAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		EmpOperations e_oper = new EmpOperations();
		List<Employee>  emplist = e_oper.ShowAllEmps();
		/*
		 * 	<p style="text-align: center;">
		<a href="AddEmp.html">New Employee</a>
		&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
		<a href="ViewAll">All Employees</a>
		</p>
		 */
		
		out.print("<p style='text-align: center;'>");
		out.print("<a href='AddEmp.html'>New Employee</a>");
		out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
		out.print("<a href='ViewAll'>All Employees</a>");
		out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
		out.print("<a href='SearchEmp.html'>Employee Search</a></p>");
		out.print("<hr />");
		out.print("<h1 style='text-align: center;'>");
		out.print("Employee Information</h1>");
		out.print("<hr />");
		out.print("<table width='100%' border='1'>");
		out.print("<tr><th>Empno</th><th>EmpName</th><th>Job</th><th>Salary</th><th>Email</th><th>Password</th></tr>");
		
		for(Employee e : emplist)
		{
			out.print("<tr>");
			out.print("<td>" + e.getEmpno() + "</td>");
			out.print("<td>" + e.getEmpname() + "</td>");
			out.print("<td>" + e.getJob() + "</td>");
			out.print("<td>" + e.getSalary() + "</td>");
			out.print("<td>" + e.getEmail() + "</td>");
			out.print("<td>" + e.getPswd() + "</td>");
			out.print("</tr>");
		}
		
		out.print("</table>");
		
	}

}
