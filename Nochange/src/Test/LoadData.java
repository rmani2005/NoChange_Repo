package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LoadData {

	public LoadData()
	{
		
	}

	public void readExcel() throws FileNotFoundException
	
	{
		try{
		File fi=new File("OR.PROPERTIES");
		FileInputStream fis = new FileInputStream(fi);
		
		
		}catch(FileNotFoundException e)
		{
		System.out.println(e.getStackTrace());
		}
		
		
	}

}
