package javalab;
import java.util.Scanner;
class AgeException extends Exception
{
	public AgeException(String message)
	{
		super(message);
	}
}
public class customdemo
{
	public static void validateAge(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("age must be atleast 18 years old");
		}
		else
		{
			System.out.println("age is valid:"+age);
		}
	}
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eligiblity test for voting");
		System.out.println("enter your age");
		int age=sc.nextInt();
		try
		{
			validateAge(age);
		}
		catch(AgeException e)
		{
			System.out.println("Error:"+e.getMessage());	
		}
		finally
		{
			System.out.println("i am final block ...i am always here");
			sc.close();
		}
	}
	

}

