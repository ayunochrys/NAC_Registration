package nuts.about.candies.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLogin
 */
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	final String btHtml = "<html>";
	final String btHead = "<head>";
	final String btTitle = "<title>";
	final String title = "Admin Login";
	final String etTitle = "</title>";
	final String etHead = "</head>";
	final String btbody = "<body align = center>";
	final String head = "<h1>Nuts About Candies</h1>";
	final String horiLine = "<hr/>";
	final String btform1 = "<form method=post action=display.html>";
	final String username = "<p>Username: </p>";
	final String userInput = "<input type = text required placeholder=Username name='uname' />";
	final String brLine = "<br/>";
	final String password = "<p>Password: </p>";
	final String passInput = "<input type=password  required placeholder=Password name='pass' />";
	final String form1Input =  "<input type=submit name=loginButton value=Login />";
	final String etForm1 = "</form>";
	final String btForm2 = "<form method=post  action=index.html>";
	final String form2Input = "<input type=submit name=goBackButton value='Go Back' />";
	final String etForm2 = "</form>";
	final String endBody = "</body>";
	final String endHtml = "</html>";
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
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
		
		out.print(btHtml);
		out.print(btHead);
		out.print(btTitle);
		out.print(title);
		out.print(etTitle);
		out.print(etHead);
		out.print(btbody);
		out.print(head);
		out.print(horiLine);
		out.print(btform1);
		out.print(username);
		out.print(userInput);
		out.print(brLine);
		out.print(password);
		out.print(passInput);
		out.print(brLine);
		out.print(brLine);
		out.print(form1Input);
		out.print(etForm1);
		out.print(btForm2);
		out.print(form2Input);
		out.print(etForm2);
		out.print(endBody);
		out.print(endHtml);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
