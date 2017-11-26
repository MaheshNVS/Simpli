package Test;

public class Method_Overloading {

	public static void main(String[] args) 
	{
		

	}
	
	public void UerRegistration(String name,String ID)
	{
		System.out.println(name);
		System.out.println(ID);
	}
	
	public void UerRegistration(String name,String ID,int empid,String Email,int Phone)
	{
		System.out.println(name);
		System.out.println(ID);
		System.out.println(empid);
		
	}
	
	public void UerRegistration(boolean gender)
	{
		
	}

	public void UerRegistration(String name,String ID,int empid,String Email)
	{
		System.out.println(name);
		System.out.println(ID);
		System.out.println(empid);
		
	}
}
