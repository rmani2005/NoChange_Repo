package Test;

import org.openqa.selenium.WebDriver;

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
	public String register_submit_button = ReadObjPro.getTestObj("register");
	
	public RegPage(WebDriver driver) 
	{
	this.driver=driver;
	}
	
	public void loadRegPage()
	{
		openURL(ReadObjPro.getTestData("base_url"));
	}
	
	public void registerWithValid(String name, String lastname, String phone,
			String emailID, String add1, String add2, String city,
			String state, String postalCode, String country,
			String EID, String pass, String confirmpass )
	{
		typeTheValue(register_name, name);
		typeTheValue(register_name, lastname);
		typeTheValue(register_name, phone);
		typeTheValue(register_name, emailID);
		typeTheValue(register_name, add1);
		typeTheValue(register_name, add2);
		typeTheValue(register_name, city);
		typeTheValue(register_name, state);
		typeTheValue(register_name, postalCode);
		typeTheValue(register_name, country);
		typeTheValue(register_name, EID);
		typeTheValue(register_name, name);
		typeTheValue(register_name, pass);
		typeTheValue(register_name, confirmpass);
		clickOnElement(register_submit_button);
	}

}
