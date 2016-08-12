package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DriverLibrary {

	protected WebDriver driver;
	
	public void loadDriver(String browser)
	{
		
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver=new FirefoxDriver();			
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Mani\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();			
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "");
			driver=new InternetExplorerDriver();			
		}
		else
		{
			System.out.println("Invalid Browser, Please choose the relevant browser");
			System.exit(0);
		}
	}
		@BeforeClass
		public void preConfig()
		{
			ReadObjPro.loadpropertyfile();
		}
		
		@BeforeMethod
		public void setup()
		{
			loadDriver(ReadObjPro.getTestData("browser"));
		}
		
		@AfterMethod		
		public void terminate()
		{
			driver.quit();
		}
		
		
	}

	

