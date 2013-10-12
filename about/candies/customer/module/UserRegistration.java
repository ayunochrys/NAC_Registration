package nuts.about.candies.customer.module;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuts.about.candies.user.User;


/**
 * Servlet implementation class UserRegistration
 */
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final OpenOption APPEND = null;
	private static final OpenOption CREATE = null;
	private static final OpenOption CREATE_NEW = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.print("<html> ");
		out.print("<head> ");
		out.print("<title>UserRegistration</title> ");
		out.print("</head> ");
		out.print("<body align = center> ");
		out.print("<h1>Nuts About Candies</h1>");
		out.print("<hr/>");
		out.print("<form id=form1 name=form1 method=post action='UserRegistration'");
		out.print("  <p>&nbsp;</p> ");
		out.print("  <table width=421 height=170 border=0 align = center> ");
		out.print("    <tr> ");
		out.print("      <td width=177>First Name:</td> ");
		out.print("      <td width=234><input type=text name='FirstName'/></td> ");
		out.print("    </tr> ");
		out.print("    <tr> ");
		out.print("      <td>Last Name: </td> ");
		out.print("      <td><input type=text name='LastName'/></td> ");
		out.print("    </tr> ");
		out.print("    <tr> ");
		out.print("      <td>E-mail: ");
		out.print("       </td> ");
		out.print("      <td><input type=email name='Email'/></td> ");
		out.print("   </tr> ");
		out.print("    <tr> ");
		out.print("      <td>Password: </td> ");
		out.print("      <td><input type=password name='Password'/></td> ");
		out.print("    </tr> ");
		out.print("    <tr> ");
		out.print("      <td>Re-enter Password:</td> ");
		out.print("      <td><input type=password name='RePassword'></td> ");
		out.print("   </tr> ");
		out.print("  </table> ");
		out.print("  <p>&nbsp;</p> ");
		out.print("<input type=submit name=goBackButton value= Register />");
		out.print("</form> ");
		out.print("</body> ");
		out.print("</html> ");

	}

	/**
	 * @param path 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Path path) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User usr=new User();
		usr.setFirstName(request.getParameter("FirstName"));
		usr.setLastName(request.getParameter("LastName"));
		usr.setEmail(request.getParameter("Email"));
		usr.setPassword(request.getParameter("Password"));
		usr.setRePassword(request.getParameter("RePassword"));
		
		
		ArrayList<User> usersDB = new ArrayList<User>();
		usersDB.add(usr);
		
		//OutputStream out = Files.newOutputStream(path);
		
		//FileOutputStream fos = new FileOutputStream(getServletContext().getRealPath("packages.db"));
		//ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//oos.writeObject(usersDB);
		
		//oos.close();
		
		
		RequestDispatcher rd=request.getRequestDispatcher("DisplayInfosFromUser");
		request.setAttribute("Registration", usr);
		rd.forward(request, response);

	}

}
