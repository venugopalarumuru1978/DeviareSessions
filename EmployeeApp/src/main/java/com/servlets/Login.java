package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entities.Employee;
import com.operations.EmpOperations;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("txtUser");
		String pwd = request.getParameter("txtPass");
		HttpSession session = request.getSession();
		
		if(uname.equals("Admin") && pwd.equals("admin@123"))
		{
			session.setAttribute("uAdmn", uname);
			response.sendRedirect("ViewAll");
		}
		else
		{
			EmpOperations e_oper = new EmpOperations();
			Employee emp = e_oper.UserCheck(uname, pwd);
			if(emp!=null)
			{
				session.setAttribute("eUser", emp.getEmpname());
				session.setAttribute("eid", emp.getEmpno());
				response.sendRedirect("EmpWelcome");
			}
			else
			{
				out.print("<h2 style='text-align:center;color:red'>Please check username /password</h2>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
		}
		
	}

}
