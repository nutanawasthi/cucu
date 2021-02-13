package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage( WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);

	}
	// identify all elements by locators

	@FindBy(name="uid")
	@CacheLookup
	WebElement TxtUserId;


	@FindBy(name="password")
	@CacheLookup
	WebElement TxtPassword;


	@FindBy(name="btnLogin")
	WebElement BtnLogin;

	@FindBy(name="btnReset")
	WebElement BtnReset;

	@FindBy(linkText="Log out")
	WebElement LnkLogOut;



	//Action Methods

	//for value we are going to input, we use set method. as we will input userid and password 
	public void setUserId(String uId) {
		TxtUserId.clear();
		TxtUserId.sendKeys(uId);

	}

	public void setPassword(String pwd) { 

		TxtPassword.clear();
		TxtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		BtnLogin.click();
	}

	public void clickReset(){
		BtnReset.click();

	}


	public void clickLogOut() {
		LnkLogOut.click();
	}

}




