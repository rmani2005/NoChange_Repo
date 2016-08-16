package Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {

	private static Logger Log=Logger.getLogger(Log.class.getName());
	
	public static void info(String msg)
	{
		DOMConfigurator.configure("Log4j.xml");
		Log.info(msg);
	}
	
	public static void warn(String msg)
	{
		DOMConfigurator.configure("Log4j.xml");
		Log.warn(msg);
	}
	
	public static void error(String msg)
	{
		DOMConfigurator.configure("Log4j.xml");
		Log.error(msg);
	}
	public static void fatal(String msg)
	{
		DOMConfigurator.configure("Log4j.xml");
		Log.fatal(msg);
	}
	public static void debug(String msg)
	{
		DOMConfigurator.configure("Log4j.xml");
		Log.debug(msg);
	}

}
