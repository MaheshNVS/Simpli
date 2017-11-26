package Test;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Parameterization_Notepad {

	WebDriver wd;
	@Test
	public void chksimpli()throws Exception
	{
		String s,a[];
		FileReader fr = new FileReader("C:\\Simpli\\TEst\\Text_Params.txt");
		BufferedReader br = new BufferedReader(fr);//giving reference variable for reading 
		System.setProperty("webdriver.gecko.driver", "C:\\Simpli\\Browser_Executables\\geckodriver.exe");
		wd = new FirefoxDriver();
		wd.get("https://www.simplilearn.com/");
		
				
		while((s=br.readLine())!=null)
		{
			a = s.split(",");
			for(int i=0;i<=a.length;i++)
			{
				wd.findElement(By.xpath(".//*[@id='login-name']")).sendKeys(a[i]);//user1  user2
				wd.findElement(By.xpath(".//*[@id='login-register']/div[1]/form/div[2]/input")).sendKeys(a[i]);//pwd1 ,,, pwd2
				System.out.println(a[i]);
				
			}
			Thread.sleep(3000);
			wd.findElement(By.xpath(".//*[@id='login-name']")).clear();
			wd.findElement(By.xpath(".//*[@id='login-register']/div[1]/form/div[2]/input")).clear();
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
	}
//		br.close();
	}

	
	@AfterSuite
	public void clickLogin()
	{
		wd.findElement(By.xpath(".//*[@id='loginBtn']")).click();
	}
}
