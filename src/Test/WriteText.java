package Test;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteText 
{

	private static void main(String[] args) throws Exception
	{
		//Create a file for writing purpose
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Simpli\\TEst\\NewFile.txt"));
		
		//write data into the file
		bw.write("My Firlst File Creation in JAVA");
		bw.newLine();
		bw.write("SImpli ELarn Cool JAVA EXAMPLE");
		
		
		bw.close();
	}
	
}
