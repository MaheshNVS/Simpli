package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class write_Excel_example {
	
	WebDriver wd;
	WritableSheet ws;
	WritableSheet ws1;
	WritableWorkbook wb;
	
	@BeforeTest
	public void createExcel()throws Exception
	{
		wb = Workbook.createWorkbook(new FileOutputStream("C:\\Simpli\\TEst\\example.xls"));
		ws = wb.createSheet("WebPage_Links", 0);
		ws1 = wb.createSheet("TEstData", 1);
	}
	
	@Test
	public void chkExcelWriting()throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Simpli\\Browser_Executables\\geckodriver.exe");
		wd = new FirefoxDriver();
		
		wd.get("http://www.spicejet.com");
		Thread.sleep(5000);
		
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_btn_FindFlights']")).click();
		capture("SpicejetHomepage");
		Thread.sleep(3000);
		String alertMSG = wd.switchTo().alert().getText();
		System.out.println(alertMSG);
		wd.switchTo().alert().accept();//Accept to click on OK Button of Alert
//		wd.switchTo().alert().dismiss();//Dismiss to click on Cancel Button of ALert		
		
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		String myvalues = wd.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul/li/a")).getText();
		System.out.println(myvalues);
		System.out.println(myvalues.length());
		for(int i=0;i<myvalues.length();i++)
		{
			ws.addCell(new Label(0,i,myvalues));
		}
		
		//for(String s:xyz)
		wb.write();
		wb.close();
		
		
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();//clickin on one way
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		wd.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[1]/a")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[3]/li[1]/a")).click();
		wd.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[4]/a")).click();
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
		Thread.sleep(3000);
		//select currency converter link
		wd.findElement(By.xpath(".//*[@id='popUpConverter']")).click();
		
		Select from_currency = new Select(wd.findElement(By.xpath(".//*[@id='CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency']")));
		from_currency.selectByVisibleText("Indian Rupees(INR)");
		
		Select To_Currency = new Select(wd.findElement(By.xpath(".//*[@id='CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency']")));
		To_Currency.selectByVisibleText("US Dollar(USD)");
		
		wd.findElement(By.xpath(".//*[@id='CurrencyConverterCurrencyConverterView_TextBoxAmount']")).sendKeys("100");//entering covnersion amount
		wd.findElement(By.xpath(".//*[@id='CurrencyConverterCurrencyConverterView_ButtonConvert']")).click();//click on convert button
		wd.findElement(By.xpath(".//*[@id='ButtonCloseWindow']")).click();//click on Close Button
				
		
	}
	
	
	public void capture(String str)throws Exception
	{
		DateFormat df = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		
		String time = df.format(date);
		
		System.out.println(time);
		
		File f = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Simpli\\IMages\\"+str+time+".png"));
		
		
	}
	
	

}
