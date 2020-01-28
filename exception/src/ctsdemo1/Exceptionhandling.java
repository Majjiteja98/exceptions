package ctsdemo1;

public class Exceptionhandling
{
public static void main(String[] args)
{

	 int d=0;
     int n=5;
try
	{
		int fraction=n/d;
		//System.out.println("this line will not be executed");
	}
catch (ArithmeticException e )
{
	 System.out.println("Ein the catch block due to exception=" +e);
}
	 
System.out.println("end of main");
		  
	 }

}
