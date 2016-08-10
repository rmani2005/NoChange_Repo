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
		driver.get("http://ischolar.rsstv.com");
	}

		@Test
		public void loginMethod()
		{
			driver.manage().window().fullscreen();
			System.out.println("Test111111111111111111111111");
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
