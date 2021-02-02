package com.automationpractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import pageObjects.AddToShoppingCart;
import resources.Testsetup;


public class ValidateStoreInformation extends Testsetup {
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
		
		JavascriptExecutor ms = (JavascriptExecutor) driver;
        ms.executeScript("javascript:window.scrollBy(0,2700)");
        AddToShoppingCart title = new AddToShoppingCart(driver);
        AssertJUnit.assertEquals(title.getTitle().getText(), "Store information");
        log.info("Successfully validate");
		
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
