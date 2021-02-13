package testonly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/");
		
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		
		driver.findElement(By.name("btnLogin")).click();
		
		System.out.println("Page title is :"+driver.getTitle());
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log out")).click();
		
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
