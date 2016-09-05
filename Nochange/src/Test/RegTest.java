package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import Driver.DriverLibrary;
import Page.RegPage;

import static org.testng.Assert.assertTrue;

import Utility.Excelutil;

public class RegTest extends DriverLibrary
{
	//public WebDriver driver;
		public Logger log=Logger.getLogger(RegTest.class.getName());
		WebDriver driver;
		
		@BeforeTest
		public void setup()
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			DOMConfigurator.configure("Log4j.xml");
			
		}
		
		
		
		/*
		@Test
		public void validRegVerifiactionTest() throws IOException
		{
			DOMConfigurator.configure("Log4j.xml");
			log.info(RegTest.class.getName() + " " + " validRegVerifiactionTest is started running");
			LoadData ld=new LoadData();
			log.info("Loaded the information");
			XSSFSheet sh = (XSSFSheet) ld.getShname("Registeration.xlsx", "Reg1");
		    int lastRowCount=sh.getLastRowNum();
		    int lastColumnCount=sh.getRow(1).getLastCellNum();
		    String[][] str=new String[lastRowCount][lastColumnCount];
		    if (lastRowCount > 1){
			for(int i = 2;i<=lastRowCount;i++){
				for(int j = 2;j<=lastColumnCount;j++){
					str[i][j]= sh.getRow(i).getCell(j).getStringCellValue(); 
				}
				
				RegPage rp=new RegPage(driver);
				rp.loadRegPage();
				rp.registerWithValid(str[i][2], str[i][3], str[i][4], str[i][5], str[i][6], 
						str[i][7], str[i][8], str[i][9], str[i][10], str[i][11], str[i][12], str[i][13], str[i][14]);
				Boolean yesno=  driver.getCurrentUrl().contains("create_account_success.php");
				assertTrue(yesno);
				}
		    }
		}
		*/
		
		@Test
		public void check() throws IOException, InterruptedException
		{
			
			log.info(RegTest.class.getName() + " " + " validRegVerifiactionTest is started running");
			Excelutil ld=new Excelutil();
			log.info("Loaded the information");
			XSSFSheet sh = (XSSFSheet) ld.getShname("Registeration.xlsx", "Reg1");

			int rowcount = sh.getLastRowNum()-sh.getFirstRowNum();
			int columncount = sh.getRow(1).getLastCellNum();
			String[] str=new String[columncount];
			
			if (rowcount > 1){
			for(int i = 1; i < rowcount+1;i++)
			{
				XSSFRow row = sh.getRow(i);
				int j1=0;
				for(int j = j1;j < columncount;j++)
				{ 
					str[j]=row.getCell(j).toString();
					System.out.println(row.getCell(j).toString());
					//log.info(row.getCell(j).toString());
				}
				RegPage rp=new RegPage(driver);
				rp.loadRegPage();
				rp.registerWithValid(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9],str[10],str[11],str[12]);
				Boolean yesno=  driver.getCurrentUrl().contains("create_account_success.php");
				assertTrue(yesno);
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.urlContains("create_account_success.php"));
			}
			}
		}
		 

}


