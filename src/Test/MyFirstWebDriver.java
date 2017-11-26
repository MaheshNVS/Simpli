package Test;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstWebDriver 

{
	
	static WebDriver wd;
	static String UserName;
	static String Password;
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Simpli\\Browser_Executables\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Simpli\\Browser_Executables\\geckodriver.exe");
//		wd = new FirefoxDriver();
		wd =new ChromeDriver();
		wd.get("http://www.simplilearn.com");
		wd.findElement(By.xpath("//*[@id='loginBtn']")).click();
	
		
		//get Workbook in the excel file
		Workbook wb = Workbook.getWorkbook(new FileInputStream("C:\\Simpli\\TEst\\Data.xls"));
		
		//get sheet 0 from the workbook
		Sheet ws = wb.getSheet(0);
		
		//find the rows that are used in the excel sheet
		for(int r=1;r<ws.getRows();r++)
		{
			//get columns used in the excel sheet
			for(int c=0;c<ws.getColumns();c++)
			{
				System.out.println(ws.getCell(c, r).getContents());
				UserName =ws.getCell(0, r).getContents();
				Password = ws.getCell(1, r).getContents();
			}
			Thread.sleep(3000);//synchronization
			wd.findElement(By.xpath(".//*[@id='login-name']")).sendKeys(UserName);
			wd.findElement(By.xpath(".//*[@id='login-register']/div[1]/form/div[2]/input")).sendKeys(Password);
			//clearing the text box after typing the values
			Thread.sleep(500);
			wd.findElement(By.xpath(".//*[@id='login-name']")).clear();
			wd.findElement(By.xpath(".//*[@id='login-register']/div[1]/form/div[2]/input")).clear();
			Thread.sleep(1500);
			System.out.println("***************************");
			
			
			
		}
		
		//wb.close();
		
				
	}

}
