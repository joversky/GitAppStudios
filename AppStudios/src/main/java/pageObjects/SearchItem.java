package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchItem {
	
	public WebDriver driver;
	

	By searchInput = By.cssSelector("input.search_query.form-control.ac_input");
	By searchButton = By.cssSelector("button.btn.btn-default.button-search");
	
	
	
	
	public SearchItem(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement getSearchInput() {
		
		return driver.findElement(searchInput);
	}
    public WebElement getSearchButton() {
		
		return driver.findElement(searchButton);
	}
	

}
