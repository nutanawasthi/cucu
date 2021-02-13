package testonly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dbConnection {

	public static void main(String[] args) throws SQLException {
		
		
		//1. create connection class object	
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Sakila", "root", "admin");
		
		Statement stmt= con.createStatement();
		
		System.out.println("new comment");
		String s="insert into meals (meal_id, meal_options,Location) values(5, 'Dosa','Canteen')";
		
	
		
//		WebDriver driver;
//		
//		
//		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
//		
//		driver	= new ChromeDriver();
//		
		
//		stmt.execute(useSakila);
		
		stmt.execute(s);
		con.close();
		
		System.out.println("program exitting now");
		
		

	}

}
