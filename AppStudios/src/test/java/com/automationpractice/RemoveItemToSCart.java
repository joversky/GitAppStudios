package com.automationpractice;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import pageObjects.AddToShoppingCart;
import pageObjects.RemoveToShoppingCart;
import resources.Testsetup;


public class RemoveItemToSCart extends Testsetup {
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
		
		JavascriptExecutor ls = (JavascriptExecutor) driver;
		ls.executeScript("javascript:window.scrollBy(250,650)");
		RemoveToShoppingCart removeItem = new RemoveToShoppingCart(driver);
		removeItem.getCartList().click();
		 log.info("Successfully remove product");

	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}
