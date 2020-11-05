package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Methods5 {
	

	int a,b,c;
	void getinfo()
	{
		System.out.println("Enter the a,b value");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
	}
	void mult()
	{
	c=a*b;
	System.out.println("a*b= "+c);
	}
	void div()
	{
		c=a/b;
		System.out.println("a/b= "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods5 m = new Methods5();
	     m.getinfo();
	     m.mult();
	     m.div();

	}

}
