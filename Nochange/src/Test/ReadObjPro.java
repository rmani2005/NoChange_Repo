package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObjPro 
{

	static Properties oData= new Properties();
	static Properties aData= new Properties();
	
	public static void loadpropertyfile()
	{
		try{
		oData.load(new FileInputStream("objectRepository.properties"));
		aData.load(new FileInputStream("AND.PROPERTIES"));
		}catch(FileNotFoundException e){
			System.out.println(e.getStackTrace());
		}catch(IOException e){
			System.out.println(e.getStackTrace());
		}
		
	}
		
		public static String getTestData(String property)
		{
			return aData.getProperty(property);
		}
		

		public static String getTestObj(String property)
		{
			return oData.getProperty(property);
		}

	public static Properties getOPro() throws IOException
	{
	InputStream stream=new FileInputStream(new File(System.getProperty("user.dir"))+ "objectRepository.properties");
	oData.load(stream);
	return oData;
	}
	
	public static Properties getAPro() throws IOException
	{
	InputStream stream=new FileInputStream(new File(System.getProperty("user.dir"))+ "AND.PROPERTIES");
	aData.load(stream);
	return aData;
	}
	
}
