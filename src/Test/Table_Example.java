package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_Example {
	
	static WebDriver wd;
	
	public static void main(String[] args)throws Exception
	{
		
		String url = "http://content.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx";
		int c;
		System.setProperty("webdriver.gecko.driver", "C:\\Simpli\\Browser_Executables\\geckodriver.exe");
		wd = new FirefoxDriver();
		wd.get(url);
		
		Thread.sleep(3000);
//		WebElement table = wd.findElement(By.xpath(".//*[@id='pnl_Bse']/table/tbody/tr/td[1]/a"));
		
		WebElement table = wd.findElement(By.xpath(".//*[@id='pnl_Bse']/table"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(WebElement row:rows)
		{
			c=0;
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(WebElement col:cols)
			{
				System.out.println(col.getText());
				c++;
				if(c>0)
				{
					break;
				}
			}
		}
		
		
		
	}

}
