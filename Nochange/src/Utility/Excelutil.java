package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class Excelutil {

	Workbook wb=null;
	
	public void readExcel(String path, String filename, String Sheetname) throws IOException
	
	{
		
		
		try{
		File fi=new File(path +"\\" + filename);
		FileInputStream fis = new FileInputStream(fi);
		String fileext=filename.substring(filename.indexOf("."));
		if(fileext.equals(".xlsx"))
		{
			wb=new XSSFWorkbook(fis);
		}
		else if(fileext.equals(".xls"))
		{
			wb=new HSSFWorkbook(fis);
		}
		}catch(FileNotFoundException e)
		{
		System.out.println(e.getStackTrace());
		}
		
		
	}

	
	public Sheet getShname(String filename, String Sheetname) throws IOException
	{	
		
		try{
			File fi=new File(filename);
			FileInputStream fis = new FileInputStream(fi);
			String fileext=filename.substring(filename.indexOf("."));
			if(fileext.equals(".xlsx"))
			{
				wb=new XSSFWorkbook(fis);
			}
			else if(fileext.equals(".xls"))
			{
				wb=new HSSFWorkbook(fis);
			}	
		}catch(FileNotFoundException e){
			System.out.println(e.getStackTrace());
			}
	
			Sheet sh = wb.getSheet(Sheetname);
			return sh;
			
	
	}
	
}
