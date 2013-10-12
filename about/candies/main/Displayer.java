package nuts.about.candies.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nuts.about.candies.dbase.DBase;

import com.nutsaboutcandy.entities.InventoryPackages;
import com.nutsaboutcandy.entities.categories.CandyCategory;
import com.nutsaboutcandy.entities.categories.NutsCandyCategory;
import com.nutsaboutcandy.entities.categories.NutsCategory;
import com.nutsaboutcandy.entities.items.Candy;
import com.nutsaboutcandy.entities.items.Item;
import com.nutsaboutcandy.entities.items.Nut;

/**
 * Servlet implementation class Displayer
 */
public class Displayer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession clientSession = request.getSession();
		String uname = (String) clientSession.getAttribute("uname");
		
		
		if(uname!=null){
			ArrayList<InventoryPackages> packagesDB = null;
			
			try {
				packagesDB = DBase.getPackagesDB();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
			out.println("<h1>Nuts About Candies Products</h1>");
			out.println("<a href = Admin><h4>Logout</h4></a>");
			out.println("<table width=990 height=480 border=1>");
			out.println("<tr>");
			out.println("<td width=200 height=60>Product Category</td>");
			out.println("<td width=200>Name</td>");
			out.println("<td width=100>Type</td>");
			out.println("<td width=100>Size</td>");
			out.println("<td width=100>Weigh in Grams</td>");
			out.println("<td width=100>Price</td>");
			out.println("<td width=100>No. Of Stocks</td>");
			out.println("<td width=100>Ingredients</td>");
			out.println("<td width=260>Ingredients</td>");
			out.println("</tr>");
			
			
			
			Iterator<InventoryPackages> it = packagesDB.iterator();
			int ctr = 1;
			while (it.hasNext()) {
				out.println("<tr>");
				InventoryPackages ip = (InventoryPackages) it.next();
				
				if(ip.getProduct().getCategory() instanceof NutsCategory){
					out.println("<td>"+"["+ctr+++"] Nuts+"+"</td>");
				}
				else if(ip.getProduct().getCategory() instanceof CandyCategory){
					out.print("<td>"+"["+ctr+++"] Candy"+"</td>");
				}
				else if(ip.getProduct().getCategory() instanceof NutsCandyCategory){
					out.print("<td>"+"["+ctr+++"] Nuts and Candy"+"</td>");
				}
				
		
				out.print("<td>"+ip.getProduct().getName()+"</td>");
		
				out.print("<td>"+ip.getProduct().getCategory().getType()+"</td>");
				
				out.print("<td>"+ip.getSize()+"</td>");
				
				out.print("<td>"+ip.getWeighInGrams()+" grams"+"</td>");
				
				
					//////////////////////////--> Product Price <--//////////////////////////////
			
					if(ip.getSize().equalsIgnoreCase("small")){
						out.print("<td>"+"Php "+ip.getProduct().getCategory().getSmallPrice()+"</td>");
					}
					else if(ip.getSize().equalsIgnoreCase("medium")){
						out.print("<td>"+"Php "+ip.getProduct().getCategory().getMediumPrice()+"</td>");
					}
					else if(ip.getSize().equalsIgnoreCase("large")){
						out.print("<td>"+"Php "+ip.getProduct().getCategory().getLargePrice()+"</td>");
					}
					
				out.print("<td>"+ip.getNumberOfStock()+"</td>");
				
				ArrayList<Item> ingredients = ip.getProduct().getItems();
				
				Iterator<Item> itemsIt = ingredients.iterator();
				
				while(itemsIt.hasNext()){
					Item item = itemsIt.next();
					out.print("<td>");
					out.print(item.getName()+"(");
					if(item instanceof Candy){
						out.print("Candy)/");
					}
					else if(item instanceof Nut){
						out.print("Nut)/");
					}
					out.print("</td>");
				}
				out.println("</tr>");
			}
		}else{
			response.sendRedirect("Admin");
		}
		
	}	
	
		

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(name.equals("admin") && pass.equals("admin")){
			HttpSession clientSession = request.getSession();
			clientSession.setAttribute("uname", name);
			doGet(request,response);
		}else{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.print("Invalid input");
		}
		
		
	}

}
