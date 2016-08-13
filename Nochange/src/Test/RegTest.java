package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class RegTest 
{
	public WebDriver driver;
	
	

		@Test
		public void validRegVerifiactionTest()
		{
			RegPage rp=new RegPage(driver);
			rp.loadRegPage();
			
			
			
			rp.registerWithValid(name, lastname, phone, emailID, add1, add2, city, state, postalCode, country, EID, pass, confirmpass);
			assertTrue(driver.getCurrentUrl().contains("create_account_success.php"));
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
