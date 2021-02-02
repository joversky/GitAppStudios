package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testsetup {
	
    public WebDriver driver;
    public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HomePC\\eclipse-workspaceTest\\AppStudios\\src\\main\\java\\resources\\data.properties");
	
	    prop.load(fis);
	    String browserName = prop.getProperty("browser");
	    
	    if(browserName.equals("chrome")) {
	    	
	    	//execute in chrome driver
	    	
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HomePC\\Desktop\\Oriontek\\chromedriver_win32\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    }
	    else if (browserName.equals("firefox")) {
	    	
	    	//execute in firefox driver
	    	
	    }
	    else if(browserName.equals("IE")) {
	     	//execute in IE driver
	    }
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    return driver;
	}
}
