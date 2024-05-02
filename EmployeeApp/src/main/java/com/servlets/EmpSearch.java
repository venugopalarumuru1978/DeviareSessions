package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Employee;
import com.operations.EmpOperations;

/**
 * Servlet implementation class EmpSearch
 */
@WebServlet("/EmpSearch")
public class EmpSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int eno = Integer.parseInt(request.getParameter("txtEno"));
		
		EmpOperations e_oper = new EmpOperations();
		Employee emp = e_oper.SearchEmployee(eno);
		
		if(emp!=null)
		{
			out.print("<table width='100%' border='1'>");
			out.print("<tr><th>Empno</th><th>EmpName</th><th>Job</th><th>Salary</th><th>Email</th><th>Password</th></tr>");
			out.print("<tr>");
			out.print("<td>" + emp.getEmpno() + "</td>");
			out.print("<td>" + emp.getEmpname() + "</td>");
			out.print("<td>" + emp.getJob() + "</td>");
			out.print("<td>" + emp.getSalary() + "</td>");
			out.print("<td>" + emp.getEmail() + "</td>");
			out.print("<td>" + emp.getPswd() + "</td>");
			out.print("</tr></table>");
		}
		else
		{
			out.print("<h1 style='text-align: center;'>");
			out.print("Employee Not Found</h1>");
			out.print("<hr />");
		}
		
		out.print("<h3 style='text-align: center;'>");
		out.print("<a href='SearchEmp.html'>Search Another Employee</a></h3>");
	}

}
