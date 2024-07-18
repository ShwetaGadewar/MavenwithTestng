package Assignment1.Amazon_Using_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Checkout_Page {

	WebDriver driver;
	@FindBy(name="submissionURL")
	WebElement selectaddress;
	
	public void selectaddress_method() {
		selectaddress.click();
	}
	public Amazon_Checkout_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
}
}