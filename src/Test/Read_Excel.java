package Test;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Read_Excel {

	
	
	public static void readexcel(String UserName,String Password)throws Exception
	{
		//get Workbook in the excel file
				Workbook wb = Workbook.getWorkbook(new FileInputStream("C:\\Simpli\\TEst\\Data.xls"));
				
				//get sheet 0 from the workbook
				Sheet ws = wb.getSheet(0);
				
				//find the rows that are used in the excel sheet
				for(int r=1;r<ws.getRows();r++)
				{
					//get columns used in the excel sheet
					for(int c=0;c<ws.getColumns();c++)
					{
						System.out.println(ws.getCell(c, r).getContents());
					}
					System.out.println("***************************");
				}
				
				//wb.close();
	}
	
	
	

}
