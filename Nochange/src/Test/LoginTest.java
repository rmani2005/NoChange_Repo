package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class LoginTest 
{
	public WebDriver driver;
	
	@BeforeTest
	public void setup1()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.com");
	}

		@Test
		public void loginMethod()
		{
			System.out.println("Test111111111111111111111111" + driver.getCurrentUrl());
		}
		
		@Test
		public void maxi()
		{
			driver.manage().window().maximize();
			System.out.println("Test22222222222222222222222222");
		}	

		@AfterTest
		public void finalset()
		{
			driver.quit();
		}

}
