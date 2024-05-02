

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
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
		
		if(session.getAttribute("user")!=null)
		{
			String username = (String)session.getAttribute("user");
			out.print("<h2>Welcome To : " + username + "</h2>");
			out.print("<h3>Session ID : " + session.getId() + "</h3>");
			out.print("<form method='post' action='Logout'>");
			out.print("<input type='submit'  value='Logout'/>");
			out.print("</form>");
		}
		else
			response.sendRedirect("Login.html");
	}

}
