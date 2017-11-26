package Core_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Browser {
	
	public static WebDriver browser = Browser_Factory.getBrowser("Browser", "url");
	
	public static void go(String url)
	{
		browser.get(url);
	}
	
	public static void navigateToURL(String url){
		browser.navigate().to(url);
	}
	
	//send keys activity find a element and perform action
	
	public void sendKeys(String webelementLocator,String text)
	throws Exception{
		findTheElement(webelementLocator).sendKeys(text);
		
	}
	
	public static WebElement findTheElement(String webelementLocator){
		
		By webElementLocatorBy = findBy(webelementLocator);
		try{
			return browser.findElement(webElementLocatorBy);
		}
		catch(Exception e){
//			log.error("Unable to find the Element with Locator"
//					+webelementLocator+".Trying to wait for the Element to Load");
			return browser.findElement(webElementLocatorBy);
		}
		
	}
	
	public static By findBy(String input){
		String returnval = input;
		By locatorObj = null;
		
		if(input != null){
			int cdataIndex = input.indexOf("CDATA[");
			
			if(cdataIndex >0){
				returnval = input.substring(cdataIndex+1);
				int cdataStart = returnval.indexOf("[");
				int cdataEnd = returnval.indexOf("]");
				
				if(cdataStart >0 && cdataEnd>0){
					returnval = (returnval.substring(cdataStart+1, cdataEnd))
							.trim();
				}
				int index = returnval.indexOf("=");
				
				if(index>0){
					returnval = input.substring(index+1);
				}
				
			}
			else{
				int index = input.indexOf("=");
				if(index>0)
				{
					returnval = input.substring(index+1);
				}
			}
			
			if(returnval != null)
				returnval = returnval.trim();
			
			if(input.startsWith("name=")){
				locatorObj = By.name(returnval);
			}else if(input.startsWith("id=")){
				locatorObj = By.id(returnval);
			}else if(input.startsWith("xpath=")){
				locatorObj = By.xpath(returnval);
			}
		}
		
		return locatorObj;
		
	}
	
	public static void click(String WebElementLocator){
		WebElement  element = findTheElement(WebElementLocator);
		try{
			element.click();
		}
		catch(ElementNotVisibleException e){
			//log.info("Eelemt with Locator Not found, waiting for the element");
		}
	}

	public static void select(String webElementLocator,String OptionText)throws Exception
	{
		Select select = new Select(findTheElement(webElementLocator));
		select.selectByVisibleText(OptionText);
	}
	
	public static boolean isTextPresent(String expectedText){
		try{
			browser.findElement(By.xpath("//body[.,'"+expectedText+"']"));
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	
	public static boolean isEnable(String webElementLocator)
	{
		return (findTheElement(webElementLocator).isEnabled());
	}
	
	
	
	
	
	
}
