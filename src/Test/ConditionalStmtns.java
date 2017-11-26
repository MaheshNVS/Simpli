package Test;

public class ConditionalStmtns
{

	public static void main(String[] args) 
	{
		int score = 85;
		char grade;
		
		if(score>=90)
		{
			grade = 'A';
		}
		else if(score>=80)
		{
			grade ='B';
		}
		else if(score>=70)
		{
			grade ='C';
		}
		else
		{
			grade='F';
		}
		System.out.println("Grade = "+ grade);
		

		
		
		//SWitch case construct
		
		int month =10;
		String strMonth = null;
		
		switch(month)
		{
		case 1: strMonth = "January";
		break;
		case 2: strMonth = "Feb";
		break;
		case 3: strMonth = "Mar";
		break;
		case 4: strMonth = "APR";
		break;
		case 5: strMonth = "MAY";
		break;
		case 6: strMonth = "JUN";
		break;
		case 7: strMonth = "JUL";
		break;
		case 8: strMonth = "AUG";
		break;
		case 9: strMonth = "SEP";
		break;
		case 10: strMonth = "OCT";
		break;
		case 11: strMonth = "NOV";
		break;
		case 12: strMonth = "DEC";
		break;
		}
		System.out.println("Current MOnth is : "+ strMonth);
		
		
		
		
		
		//Loop Statements
		//while
		//Do while
		//For 
		
		
		//WHile
		int i=1;
		while(i<=10)
		{
			System.out.println("The Value of I in while loop is :"+i);
			i=i+1;
		}
		
		//Do While
		int y=1;
		do
		{
			System.out.println("THe value of Y is DO WHILE is:"+ y);
			y=y+1;
		}
		while(y>10);
		
		//for Loop
		int sum = 0;
		for(int z=1;z<100;z++)
		{
			if(z%2 ==0)
			{
				sum = sum+1;
			}
			else if(sum!=sum)
			{
				break;
			}
		}
		System.out.println("Sum of all the even values is "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
