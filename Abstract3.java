package Firstpackage;
import java.io.*;
import java.util.Scanner;

abstract class NM1
{
	int a,b,c;
	public void info()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a,b value");
		a=s.nextInt();
		b=s.nextInt();
	}
}
class NM2 extends NM1
{
	void sum()
	{
		c=a+b;
		System.out.println("c="+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("c="+c);
	}
	void mult()
	{
		c=a*b;
		System.out.println("c="+c);
	}
	void div()
	{
		c=a/b;
		System.out.println("c="+c);
	}
}

public class Abstract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  NM2 S=new NM2();
		     S.info();
		     S.sum();
		     S.sub();
		     S.mult();
		     S.div();

	}

}
