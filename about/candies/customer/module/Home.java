package nuts.about.candies.customer.module;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("  <title>NAC</title>");
		out.print("</head>");

		out.print("<body>");
		out.print("<table width=\"960\" height=\"255\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">");
		out.print("  <tr>");
		out.print("    <td height=\"126\" colspan=\"2\" align=\"center\" valign=\"middle\">Nuts About Candies</td>");
		out.print("  </tr>");
		out.print("  <tr>");
		out.print("    <td colspan=\"2\" align=\"center\" valign=\"middle\"><hr /></td>");
		out.print("  </tr>");
		out.print("  <tr>");
		out.print("    <td width=\"476\" height=\"108\">&nbsp;</td>");
		out.print("    <td width=\"484\" align=\"center\" valign=\"middle\"><a href=\"UserRegistration\"/>Register</td>");
		out.print("  </tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");

	}

}
