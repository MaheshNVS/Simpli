package Core_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {
	
	private static final String CONFIG_PROPERTY_FILE_PATH = "C:\\Simpli\\lib\\config.properties.properties";
	
	
	public static String readfromconfig(String input)
		throws FileNotFoundException,IOException
	{
		Properties properties = new Properties();
		properties.load(new FileInputStream(CONFIG_PROPERTY_FILE_PATH));
		String returnval = properties.getProperty(input);
		return returnval;
	}
	
	public static String getHostOperatingSystem(){
		String osName = System.getProperty("os.name");
		
		return osName;
	}

}
