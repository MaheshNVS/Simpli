package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SpiceJet_Search {

	WebDriver wd;
	@AfterSuite
	public void chkExectuion()
	{
		System.out.println("At the End of Suite Execution");
	}
	
	@BeforeTest
	@Parameters({"browser"})
	public void openBrowser(String br)throws Exception
	{
		
		if(br.matches("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Simpli\\Browser_Executables\\geckodriver.exe");
			wd = new FirefoxDriver();
			wd.get("http://spicejet.com/");
		}
		else if(br.matches("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Simpli\\Browser_Executables\\chromedriver.exe");
			wd = new ChromeDriver();
			wd.get("http://spicejet.com/");
		}
	}
	
	@Test
	public void mySpiceJet()
	{
						
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		wd.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[6]/a")).click();
		wd.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[3]/li[5]/a")).click();
		
		wd.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[2]/td[4]/a")).click();
		
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")).click();
		
		Select str = new Select(wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']/option[2]")));
		str.selectByVisibleText("3 Adults");
		
	}
	
	
	

	@AfterTest
	public void closBrowser()
	{
		wd.close();
	}
}
