package Assignment1.Amazon_Using_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_Page {
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement addtowishlist;
	
	@FindBy(linkText="View Your List")
	WebElement view_your_list;
	
	public void addtowishlist() {
		addtowishlist.click();
	}

	public void viewyourlist() {
		view_your_list.click();
	}
	public Amazon_Product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
