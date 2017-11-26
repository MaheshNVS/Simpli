package Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class Date_Select {
	
	@Test
	public void getCurrentDate()
	{
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		
		Date dt = new Date();
		
		
		String mydate = df.format(dt);
		
		System.out.println(dt);
		
		
		
		
		
		
		
	}

}
