package com.automationpractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import pageObjects.AddToShoppingCart;
import resources.Testsetup;



public class AddItemToSCart extends Testsetup {
	
	public static Logger log = LogManager.getLogger(Testsetup.class.getName());
	
	@BeforeTest
	
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get("http://automationpractice.com/index.php");
		log.info("Navigated to automation practice page");
	}
	
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,650)");
        AddToShoppingCart l = new AddToShoppingCart(driver);
		l.getSelectedProduct().click();
		
		AddToShoppingCart addToCard = new AddToShoppingCart(driver);
		addToCard.getAddToCard().click();
		
		AddToShoppingCart proceedToCheckout = new AddToShoppingCart(driver);
		proceedToCheckout.getProceedToCheckout().click();
		JavascriptExecutor ms = (JavascriptExecutor) driver;
        ms.executeScript("javascript:window.scrollBy(250,450)");
        log.info("Successfully add product to the cart");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	

}
