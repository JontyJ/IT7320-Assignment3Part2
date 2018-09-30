package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username; 
		String password;
		
		try {
			username = request.getParameter("username");
			password = request.getParameter("password");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamegear","root", "");
			PreparedStatement stmt =con.prepareStatement("insert into register(username, password) values(?,?)");
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			
		response.sendRedirect("index.jsp");
			
		}
		catch(Exception e) {
			response.sendRedirect("loginFailed.jsp");
			System.out.println(e);
	}
	}

}
