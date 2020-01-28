package ctsdemo1;

import java.util.Scanner;

public class Exception3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an int: ");
		int a;
		try {
			a=sc.nextInt();
			}
		catch(Exception e)
			{
			System.out.println("Invalid Number!");
			a=0;
	}
		System.out.println("value of a: "+a);
		sc.close();		}
}
