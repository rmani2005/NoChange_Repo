package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionLibrary 
{
	protected WebDriver driver;
	public By locateEle(String pro)
	{
		String[] Loc=pro.split(":");
		
		String Locator=Loc[0];
		
		if(Locator.contains("id"))
			return By.id(Loc[1]);
		else if(Locator.contains("name"))
			return By.name(Loc[1]);
		else if(Locator.contains("link"))
			return By.linkText(Loc[1]);
		else if(Locator.contains("xpath"))
			return By.xpath(Loc[1]);
		else if(Locator.contains("partiallink"))
			return By.partialLinkText(Loc[1]);
		else if(Locator.contains("css"))
			return By.cssSelector(Loc[1]);
		else if(Locator.contains("class"))
			return By.className(Loc[1]);
		else if(Locator.contains("tag"))
			return By.tagName(Loc[1]);
		else
			return null;
	}
	
		
		protected void openURL(WebDriver driver, String url)
		{
			driver.get(url);
		}
		
		protected void clickOnElement(WebDriver driver, String eleLocator) throws InterruptedException
		{
			By locator=locateEle(eleLocator);
			//WebElement findEle = driver.findElement(By.id("emailid"));
			WebElement findEle = driver.findElement(locator);
			if(findEle.isDisplayed())
				findEle.click();
			Thread.sleep(5000);
		}
		
		protected void typeTheValue(WebDriver driver, String eleLocator, String val)
		{
			By locator=locateEle(eleLocator);
			WebElement findEle=driver.findElement(locator);
			if(findEle.isDisplayed())
				findEle.sendKeys(val);
		}
	
		protected String getText(WebDriver driver, String eleLocator)
		{
			By locator=locateEle(eleLocator);
			WebElement findEle=driver.findElement(locator);
			return findEle.getText();
			
		}
		
		//We can keep add the method for different actions 
		//like Dra and Drop, double clicks and so on.
		
		
		
}
	