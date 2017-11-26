package Test;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class Write_Excel {

	public static void main(String[] args)throws Exception
	{
		//get workbook in the excel file
		WritableWorkbook wb = Workbook.createWorkbook(new FileOutputStream("C:\\Simpli\\TEst\\NewFile.xls"));
		
				
		//get sheet 0 from the workbook
		WritableSheet ws = wb.createSheet("MyNewSheet", 0);
		WritableSheet ws1 = wb.createSheet("MySecondSheet", 1);
		
		
		
		//write data in the spread sheet
		ws.addCell(new Label(0,0,"SimpliLearn"));
		
		

		wb.write();
		wb.close();
	}

}
