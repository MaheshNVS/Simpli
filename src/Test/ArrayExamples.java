package Test;

public class ArrayExamples {

	public static void main(String[] args) 
	{
		String username = "SimpliLearn";
		String pwd = "Test123";
		String email = "Test@simplilearn.com";
		String phone = "23456788";
		
		String str[] = new String[5];
		
		str[0] = "SimpliLearn";
		str[1] = "Test123";
		str[2] = "Test@simplilearn.com";
		str[3] = "23456788";
		
		for(int x=0;x<str.length;x++)
		{
			System.out.println(str[x]);
		}
			
		for(int y=str.length-1;y>=0;y--)
		{
			System.out.println("Reverse values"+str[y]);
		}
		
		
		//Object ARRAY
		Object ar[] = new Object[5];
		ar[0] = "Hi Simpli Learn";
		ar[1] = 123456789;
		ar[2] = "3456780";
		ar[3] = true;
		ar[4] = 345.67;
		
		for(int z = 0;z<ar.length;z++)
		{
			System.out.println(ar[z]);
		}
		
		
		
		
		//Two DImension Array
		String x[][] = new String[3][4];
		//First Row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		
		//Second Row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		
		//Third Row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		
		//Total Rows
		System.out.println("Total Rows are "+x.length);
		//TOtal Columns
		System.out.println("Total COlumns are"+x[0].length);
		
		int rows = x.length;
		int cols = x[0].length;
		
		for(int rownum = 0;rownum<rows;rownum++)
		{
			//one more nested for loop for iterating between the columns
			for(int colnum=0;colnum<cols;colnum++)
			{
				System.out.println(x[rownum][colnum]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
