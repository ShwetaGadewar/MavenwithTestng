package Assignment1.Amazon_Using_Maven;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import package3.Test_Data;

public class TestCase4  {

	@Test
	public void Amazon_product_Page() throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Test_Data t1=new Test_Data();
		t1.Data_fetching();
		
		Amazon_Login_Page a1=new Amazon_Login_Page(driver);
		a1.un();
		a1.continue_button();
		a1.pass();
		a1.sign_button();
		
		Amazon_Home_Page a2= new Amazon_Home_Page(driver);
	    a2.search_tf();
	    
	    Amazon_SearchResult_Page a3=new Amazon_SearchResult_Page(driver);
	    a3.select_product();
	    
	    Set<String> windowHandles=driver.getWindowHandles();
	    Iterator<String> parenchildId=windowHandles.iterator();
	    
	    String parentId=parenchildId.next();
	    String childId=parenchildId.next();
	    
	    driver.switchTo().window(childId);
	    
	    Amazon_Product_Page a4=new Amazon_Product_Page(driver);
	    a4.addtowishlist();
	    
	    a4.viewyourlist();
	    
	    Amazon_Wishlist_Page a5=new Amazon_Wishlist_Page(driver);
	    a5.addtocart_method();
}
}