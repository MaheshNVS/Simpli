package Test;

public class Method_Overriding extends Write_Excel
{

	public static void main(String[] args) 
	{
		
		Method_Overriding obj = new Method_Overriding();
		obj.chkexcel();
	}

	
	//overriding method
	public void chkexcel()
	{
		//THis will call the child class version
		System.out.println("IM inside a method of parent class can be called by child");
	}
}
