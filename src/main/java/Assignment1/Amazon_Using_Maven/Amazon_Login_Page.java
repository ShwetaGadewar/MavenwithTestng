package Assignment1.Amazon_Using_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import package3.Test_Data;

public class Amazon_Login_Page extends Test_Data{
WebDriver driver;
	
	@FindBy(name = "email")
	WebElement Mobileno;

	@FindBy(id = "continue")
	WebElement conti;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement signin;

	public void un() {
		Mobileno.sendKeys(un1);
		}

	public void continue_button() {
		conti.click();
	}

	public void pass() {
		password.sendKeys(pwd);
	}

	public void sign_button() {
		signin.click();
	}
	
	public Amazon_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



}
