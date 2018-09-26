package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username; 
		String password;
		
		try {
			username = request.getParameter("username");
			password = request.getParameter("password");
			
			if( username.equals("test") && password.equals("test")) {
				response.sendRedirect("index.jsp");
			}
			else {
				response.sendRedirect("loginFailed.jsp");
			}
		}
		catch(Exception e) {
			response.sendRedirect("loginFailed.jsp");
			System.out.println(e);
	}
	}
}
