package Firstpackage;
import java.io.*;
import java.util.Scanner;

abstract class add4
{
	int c;
	
	abstract int sum(int a  ,int b );
	abstract int sub(int a, int b);
	abstract int mult(int a, int b);
	abstract int div(int a,int b);
}
class addd5 extends add4
{
	int sum(int a, int b)
	{
		c=a+b;
		System.out.println("c="+c);
		return 0;
	}
	int sub(int a, int b)
	{
		c=a-b;
		System.out.println("c="+c);
		return 0;
	}
	int mult(int a,int b)
	{
		c=a*b;
		System.out.println("c="+c);	
		return 0;
	}
	int div(int a,int b)
	{
		c=a/b;
		System.out.println("c="+c);	
		return 0;
	}
}


public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a,b;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter the value");
	     a=s.nextInt();
	     b=s.nextInt();
	     addd5 s1 = new addd5();
	     s1.sum(a,b);
	     s1.sub(a,b);
	     s1.mult(a,b);
	     s1.div(a,b);

	}

}
