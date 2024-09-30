package javalab;
import java.util.Scanner;
public class Exception 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char confirmation;
		do
		{
			System.out.println("enter your choice");
			System.out.println("1.ARITHEMETIC OPERATION");
			System.out.println("2.ARRAY ACCESS");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				try
				{
					System.out.println("enter the dividend");
					int dividend=sc.nextInt();
					System.out.println("enter the divisor");
					int divisor=sc.nextInt();
					int result=dividend/divisor;
					System.out.println("the result is"+result);
				}
				catch(ArithmeticException e)
				{
					System.out.println("caught an exception"+e.getMessage());
				}
				break;
			case 2:
				try
				{
					int array[]= {2,5,8,9};
					System.out.println("enter the index you want to access");
					int index=sc.nextInt();
					System.out.println("the number in"+index+"is"+array[index]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("caught an exception"+e.getMessage());
				}
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
			System.out.println("do you want to continue: type y or n");
			confirmation=sc.next().charAt(0);
		}
		while(confirmation=='y'|| confirmation=='Y');
	}

}
