package Page;

import org.openqa.selenium.WebDriver;

import Driver.ActionLibrary;
import Driver.ReadObjPro;
import Utility.Log;
public class RegPage extends ActionLibrary {

	WebDriver driver;
	public String register_name=ReadObjPro.getTestObj("register_name");
	public String register_lastname=ReadObjPro.getTestObj("register_lastname");
	public String register_phone=ReadObjPro.getTestObj("register_phone");
	public String register_emailID=ReadObjPro.getTestObj("register_emailID");
	public String register_add1=ReadObjPro.getTestObj("register_add1");
	public String register_add2=ReadObjPro.getTestObj("register_add2");
	public String register_city=ReadObjPro.getTestObj("register_city");
	public String register_state=ReadObjPro.getTestObj("register_state");
	public String register_postalCode=ReadObjPro.getTestObj("register_postalCode");
	public String regsiter_country=ReadObjPro.getTestObj("regsiter_country");
	public String register_EID=ReadObjPro.getTestObj("register_EID");
	public String register_pass=ReadObjPro.getTestObj("register_pass");
	public String register_confirmpass=ReadObjPro.getTestObj("register_confirmpass");
	public String register_submit_button = ReadObjPro.getTestObj("registersubmitbutton");
	
	public RegPage(WebDriver driver) 
	{
	this.driver=driver;
	Log.info("New registration process has been initiated");
	}
	
	public void loadRegPage()
	{
		openURL(driver, ReadObjPro.getTestData("baseurl"));
		Log.info("Now the browser is displayed by navigating");
	}
	
	public void registerWithValid(String name, String lastname, String phone,
			String emailID, String add1, String add2, String city,
			String state, String postalCode, String country,
			String EID, String pass, String confirmpass ) throws InterruptedException
	{
		Log.info("Register with valid input");
		try{
		typeTheValue(driver, register_name, name);
		typeTheValue(driver, register_lastname, lastname);
		typeTheValue(driver, register_phone, phone);
		typeTheValue(driver, register_emailID, emailID);
		typeTheValue(driver, register_add1, add1);
		typeTheValue(driver, register_add2, add2);
		typeTheValue(driver, register_city, city);
		typeTheValue(driver, register_state, state);
		typeTheValue(driver, register_postalCode, postalCode);
		typeTheValue(driver, regsiter_country, country);
		typeTheValue(driver, register_EID, EID);
		typeTheValue(driver, register_pass, name);
		typeTheValue(driver, register_confirmpass, pass);
		typeTheValue(driver, register_submit_button, confirmpass);
		clickOnElement(driver, register_submit_button);
		}
		catch(Exception e) 
		{
			Log.error(e.toString());
			Log.fatal(e.getLocalizedMessage());
			throw(e);
		}
		clickOnElement(driver, register_submit_button);
	}

}
