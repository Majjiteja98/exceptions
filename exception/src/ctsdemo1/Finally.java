import java.util.InputMismatchException;
import java.util.Scanner;
Package ctsdemo1;

public class Finally
{
	public static void main(String[] args)
	{
		try {
			int d=20;
			int n=0;
			int fraction=n/d;
		}
	catch(ArithmeticException e) 
		{
		System.out.println("in the catch block due to exception="+e);
			}
	finally 
	{
		System.out.println("inside finally block");
	}
	}
}
/*
importjava.util.Scanner;
importjava.util.InputMismatchException;
class Teja
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter an int: ");
		try 
		{
			int x=obj.nextInt();
			System.out.println("x value is: "+x);
			
		}
		    
		catch(InputMismatchException e )
		{
			System.out.println("Exception:invalid input ");
		}
	
	finally
	{
		System.out.println("finally block");		
	}
	}
}