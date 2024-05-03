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

import com.operations.EmpOperations;

/**
 * Servlet implementation class ChPwd
 */
@WebServlet("/ChPwd")
public class ChPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChPwd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String npwd = request.getParameter("txtNPwd");
		String cnpwd = request.getParameter("txtCNPwd");
		
		HttpSession session = request.getSession();
		int eno = (Integer)session.getAttribute("eid");
		if(npwd.equals(cnpwd))
		{
			EmpOperations  e_oper = new EmpOperations();
			e_oper.ChangePwd(npwd, eno);
			response.sendRedirect("EmpLogout");
		}
		else
		{
			out.print("<h3 style='text-align:center;color:red'>New and Confirm Password must be Same</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("ChangePassword.html");
			rd.include(request, response);
		}
	}

}
