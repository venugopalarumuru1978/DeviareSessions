package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Address;
import com.entities.Employee;
import com.service.TestService;

/**
 * Servlet implementation class AddEmp
 */
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
		String ename = request.getParameter("txtEname");
		String job = request.getParameter("ddlJob");
		String sal = request.getParameter("txtSal");
		String adr = request.getParameter("txtAdrs");
		String loc = request.getParameter("txtLoc");
		
		Address adrs = new Address();
		adrs.setAdrsinfo(adr);
		adrs.setLocation(loc);
		
		Employee emp = new Employee();
		emp.setEname(ename);
		emp.setJob(job);
		emp.setSalary(Float.parseFloat(sal));
		emp.setAdrs(adrs);
		
		TestService ts = new TestService();
		ts.AddEmp(emp);
		response.sendRedirect("AddEmployee.jsp");
	}

}
