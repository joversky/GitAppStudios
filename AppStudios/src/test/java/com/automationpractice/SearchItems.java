package com.automationpractice;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import pageObjects.SearchItem;
import resources.Testsetup;


public class SearchItems extends Testsetup {
	public static Logger log = LogManager.getLogger(Testsetup.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
	}

	
	@Test(dataProvider="getData")
	public void basePageNavigation(String searchItem) throws IOException, InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		
		SearchItem newSearch = new SearchItem(driver);
		newSearch.getSearchInput().sendKeys(searchItem);
		SearchItem clickSearchButton = new SearchItem(driver);
		clickSearchButton.getSearchButton().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        log.info("Successfully searched");

	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{   
		
		Object[][] data = new Object[2][1];
		
		//Positive
		data[0][0]= "145";
		
		//Negative
		data[1][0]= "Blouse";
		
		return data;
	}
	
	
	
	

}
