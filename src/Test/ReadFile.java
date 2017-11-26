package Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadFile 
{

	public static void main(String[] args) throws Exception
	{
		String s;
		FileReader fr = new FileReader("C:\\Simpli\\TEst\\Data.txt");//Opens file for reading purpose dosent reads
		BufferedReader br = new BufferedReader(fr);
		
		while((s =br.readLine())!=null )
		{
			System.out.println(s);
		}
		
		br.close();

	}

}
