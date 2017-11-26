package Core_Framework;

import org.testng.annotations.Test;

public class Test_Loader {
	
	@Test
	public void myfunction()throws Exception
	{
		Browser_Factory br = new Browser_Factory();
		br.getBrowser("FF","http://www.google.com");
		
		
		Browser brw = new Browser();
		brw.sendKeys("xpath=.//*[@id='lst-ib']", "selenium");
		brw.click("xpath=.//*[@id='tsf']/div[2]/div[3]/center/input[1]");
		brw.select("xpath=", "1 Adult");
		
		boolean val = brw.isTextPresent("GOOGLE");
		System.out.println("The String is Present on the WebPage"+ val);
		
		brw.isEnable("xpath=");
	
	}
	
	

}
