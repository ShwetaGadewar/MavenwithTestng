package Assignment1.Amazon_Using_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Wishlist_Page {
	WebDriver driver;
@FindBy(xpath="(//a[@class='a-button-text a-text-center'])[1]")
WebElement addtocart;

@FindBy(linkText="Proceed to checkout")
WebElement proceedtocheckout;

public void addtocart_method() {
	addtocart.click();
}
public void proceedtocheckout_method() {
	proceedtocheckout.click();
}
public Amazon_Wishlist_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

}
