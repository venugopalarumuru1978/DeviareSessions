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
 * Servlet implementation class AddEmp
 */
@WebServlet("/AddEmp")
public class AddEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String ename = request.getParameter("txtEname");
		String job = request.getParameter("ddlJob");
		int sal = Integer.parseInt(request.getParameter("txtSal"));
		String email = request.getParameter("txtEmail");
		String pwd = request.getParameter("txtPass");
		
		Employee emp = new Employee();
		emp.setEmpname(ename);
		emp.setJob(job);
		emp.setSalary(sal);
		emp.setEmail(email);
		emp.setPswd(pwd);
		
		EmpOperations  e_oper = new EmpOperations();
		int res = e_oper.AddEmployee(emp);
		
		if(res>=1)
			//out.print("<h1>Employee Details are Addedd...</h1>");
			response.sendRedirect("ViewAll");
	}
}
