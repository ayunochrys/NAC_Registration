package nuts.about.candies.dbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpServlet;

import nuts.about.candies.main.Displayer;
import nuts.about.candies.user.User;

import com.nutsaboutcandy.entities.InventoryPackages;

public class DBase {

	public static void savePackagesDB(ArrayList<InventoryPackages> packagesDB) throws IOException{
		FileOutputStream fos = new FileOutputStream("packages.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(packagesDB);
		
		oos.close();
	}
	
	public static ArrayList<InventoryPackages> getPackagesDB() throws IOException, ClassNotFoundException{
		InputStream input = Displayer.class.getResourceAsStream("packages.db");
		ObjectInputStream ois = new ObjectInputStream(input);
		
		ArrayList<InventoryPackages> tempDB = (ArrayList<InventoryPackages>) ois.readObject();
		
		return tempDB;
	}
	public static ArrayList<User> getUsersDB() throws IOException, ClassNotFoundException{
		InputStream input = ServletDummy.class.getResourceAsStream("users.db");
		ObjectInputStream ois = new ObjectInputStream(input);
		
		ArrayList<User> tempDB = (ArrayList<User>) ois.readObject();
		
		return tempDB;
	}
}
