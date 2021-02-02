package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddToShoppingCart {
	
	public WebDriver driver;
	
	By selectProduct = By.cssSelector("a.product-name");
	By addToCart = By.cssSelector("#add_to_cart");
	By proceedToCheckout = By.cssSelector("a.btn.btn-default.button.button-medium");
	By title = By.cssSelector("#block_contact_infos > div > h4");
	
	
	//By proceedToCheckoutFinal = By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium");
	
	
	
	public AddToShoppingCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement getSelectedProduct() {
		
		return driver.findElement(selectProduct);
	}
	
	public WebElement getAddToCard() {
		
		return driver.findElement(addToCart);
	}
	
    public WebElement getProceedToCheckout() {
		
		return driver.findElement(proceedToCheckout);
	}
    
    public WebElement getTitle() {
		
		return driver.findElement(title);
	}
	/*
	 * public WebElement getProceedToCheckoutFinal() {
	 * 
	 * return driver.findElement(proceedToCheckoutFinal); }
	 */

}
