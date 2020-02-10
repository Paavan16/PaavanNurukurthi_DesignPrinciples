package epamtask3;
import java.util.*;
public class calcidesign
{
	public static int add(int ab,int cd)
	{
		int sumnum=ab+cd;
		return sumnum;
	}
	public static int sub(int ab,int cd)
	{
		int diff=ab-cd;
		return diff;
	}
	public static int multiply(int ab,int cd)
	{
		int multi=ab*cd;
		return multi;
	}
	public static double divide(int ab,int cd)
	{
		int div=ab/cd;
		return div;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one value:");
		int num1=sc.nextInt();
		System.out.println("enter second value:");
		int num2=sc.nextInt();
		System.out.println("enter any of the 4 choices");
		System.out.println(" 1\tAddition\n 2\tSubtraction\n 3\tMultiplication\n 4\tDivision");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:	System.out.println("Result="+add(num1,num2));
		break;
		case 2: System.out.println("Result="+sub(num1,num2));
		break;
		case 3: System.out.println("Result="+multiply(num1,num2));
		break;
		case 4: System.out.println("Result="+divide(num1,num2));
		break;
		default: System.out.println("Invalid choice!");
		}
		
	}

}
