package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class RemoveToShoppingCart {
	
	public WebDriver driver;
	

	By cartList = By.cssSelector("i.icon-minus");
	
	
	
	
	public RemoveToShoppingCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement getCartList() {
		
		return driver.findElement(cartList);
	}
	

}
