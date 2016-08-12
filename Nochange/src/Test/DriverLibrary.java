package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverLibrary {

	protected WebDriver driver;
	
	public void loadDriver(String browser)
	{
		
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.bin", "C:\\Users\\319468\\");
			driver=new FirefoxDriver();			
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\319468\\");
			driver=new ChromeDriver();			
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\319468\\");
			driver=new InternetExplorerDriver();			
		}
		
	}

	
}
