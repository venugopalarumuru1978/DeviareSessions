package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Student;
import com.service.StudentService;

/**
 * Servlet implementation class AddStd
 */
public class AddStd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname = request.getParameter("txtSname");
		String course = request.getParameter("txtCourse");
		String fees = request.getParameter("txtFees");
		
		Student std = new Student();
		std.setSname(sname);
		std.setCourse(course);
		std.setFees(Float.parseFloat(fees));
		
		StudentService ss = new StudentService();
		ss.AddStudent(std);
		
		response.sendRedirect("AddStudent.html");
	}

}
