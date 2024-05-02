

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String uname = request.getParameter("txtUser");
		String pwd = request.getParameter("txtPass");
		String tempval = request.getParameter("temp");
		System.out.println(tempval);
		if(uname.equals("Venugopal") && pwd.equals("admin@123"))
		{
			HttpSession  session = request.getSession();
			session.setAttribute("user", uname);
			
			response.sendRedirect("Welcome");
		}
		else
			response.sendRedirect("Error.html");
	}
}
