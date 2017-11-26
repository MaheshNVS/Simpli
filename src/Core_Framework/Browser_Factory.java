package Core_Framework;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser_Factory {
	
	
	public static WebDriver browser = null;
	
	
	public static WebDriver getBrowser(String browserName, String URL)
	{
		
		if(browser == null)
		{
			try{
				
				if("FF".equalsIgnoreCase(browserName)){
					browser = loadFirefoxDriver(URL);
				}else if("chrome".equalsIgnoreCase(browserName)){
					browser = loadChromeDriver(URL);
				}
				
			}
			catch(Exception exception){
				
			}
		}
		
		
		return browser;
	}
	
	private static RemoteWebDriver loadFirefoxDriver(String URL)throws Exception
	{
		String loadfirefoxprofile = CommonUtils.readfromconfig("loadffprofile");
		RemoteWebDriver rwd = null;
		FirefoxProfile profile = null;
		
		if("true".equalsIgnoreCase(loadfirefoxprofile))
		{
			String profilePath = CommonUtils.readfromconfig("FIREFOXPROFILEDIR");
			File profileDir = new File(profilePath);
			profile = new FirefoxProfile(profileDir);
			profile.setAcceptUntrustedCertificates(false);	
		}
		
		if("true".equalsIgnoreCase(loadfirefoxprofile)){
			rwd = new FirefoxDriver();
		}else
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Simpli\\Browser_Executables\\geckodriver.exe");
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setAcceptInsecureCerts(true);
			browser = new FirefoxDriver(dc);
			Browser br  = new Browser();
//			br.go(URL);	
			br.navigateToURL(URL);
			
		}
		return rwd;
	}
	

	private static RemoteWebDriver loadChromeDriver(String URL)throws Exception
	{
		RemoteWebDriver rd = null;
		String hostOS = CommonUtils.getHostOperatingSystem();
		
		
		if(hostOS.equalsIgnoreCase("Mac OS X")){
			System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
		}else{
			System.setProperty("webdrvier.chrome.driver", "C:\\Simpli\\Browser_Executables\\chromedriver.exe");
		}
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		rd = new ChromeDriver(capabilities);
		capabilities.setAcceptInsecureCerts(true);
		
		browser = new ChromeDriver(capabilities);
		Browser br = new Browser();
		br.go(URL);
	
		
		
		return rd;
	}
	
	
}
