

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginInfo
 */
@WebServlet("/LoginInfo")
public class LoginInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("txtUser");
		String pwd = request.getParameter("txtPass");
		
		if(uname.equals("Venugopal") && pwd.equals("admin@123"))
		{
			// In-Memory Cookie
			Cookie ck1 = new Cookie("user", uname);
			ck1.setMaxAge(10000); // persistant cookie
			response.addCookie(ck1);

			RequestDispatcher  rd = request.getRequestDispatcher("WelcomePage");
			rd.forward(request, response);
		}
		else
		{
			out.print("<h2>Please check username / password</h2>");
			RequestDispatcher  rd = request.getRequestDispatcher("LoginPage.html");
			rd.include(request, response);
		}
	}
}
