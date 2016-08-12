package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObjPro 
{

	Properties oData= new Properties();
	Properties aData= new Properties();
	public Properties getOPro() throws IOException
	{
	InputStream stream=new FileInputStream(new File(System.getProperty("user.dir"))+ "OBJECT.PROPERTIES");
	oData.load(stream);
	return oData;
	}
	
	public Properties getAPro() throws IOException
	{
	InputStream stream=new FileInputStream(new File(System.getProperty("user.dir"))+ "AND.PROPERTIES");
	aData.load(stream);
	return aData;
	}
	
}
