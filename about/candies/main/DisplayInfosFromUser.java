package nuts.about.candies.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuts.about.candies.user.User;

/**
 * Servlet implementation class DisplayInfosFromUser
 */
public class DisplayInfosFromUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayInfosFromUser() {
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
		// TODO Auto-generated method stub
		User signup=(User)request.getAttribute("Registration");
		PrintWriter out=response.getWriter();
		out.println("First Name: "+ signup.getFirstName());
		out.println("Last Name: " + signup.getLastName());
		out.println("Email Address: " + signup.getEmail());
		out.println("Password: " + signup.getPassword());
	}

}
