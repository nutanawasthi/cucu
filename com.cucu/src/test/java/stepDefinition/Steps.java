package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps {
	
public WebDriver driver;

public LoginPage lp;


@Given("User Launch chrome Browser")
public void user_launch_chrome_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nutan\\eclipse-workspace2\\com.cucu\\src\\test\\resources\\drivers\\chromedriver.exe");
	driver= new ChromeDriver();
    lp=new LoginPage(driver);}// calling the constructor we gave in LoginPage

@When("User opens url {string}")
public void user_opens_url(String url) {
    driver.get(url);
}

@When("User enters UserID as {string} and Password as {string}")
public void user_enters_user_id_as_and_password_as(String userId, String password) {
   lp.setUserId(userId);
   lp.setPassword(password);
 
}

@When("clicks on Login")
public void clicks_on_login() {
    lp.clickLogin();
}


@Then("Page Title should be {string}")
public void page_title_should_be(String pageTitle) throws InterruptedException {
	String Expectedtitle= pageTitle;
	String Acualtitle= driver.getTitle();
	Assert.assertEquals(Acualtitle, Expectedtitle);
		System.out.println("assert passed");
	
	}



@When("User Click on LogOut Link")
public void user_click_on_log_out_link() throws InterruptedException {
   lp.clickLogOut();
   Thread.sleep(3000);

	driver.switchTo().alert().accept();
	System.out.println("Alert accepted");
}



@Then("Browser should close")
public void browser_should_close() {
    driver.quit();
}



}
