package nuts.about.candies.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserLogin
 */
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>User Login</title>");
		out.print("</head>");
		out.print("<body align=center>");
		out.print("<h1>Nuts About Candies");
		out.print("<hr/>");
		out.print("<h3>----- Under Construction -----</h3>");
		out.print("<br/>");
		out.print("<form method=post  action=index.html>");
		out.print("<input type=submit name=goBackButton value='Go Back' />");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");

	}

}
