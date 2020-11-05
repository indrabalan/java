package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Methods7 {
	
	int a,b,c;
	void getinfo()
	{
		
	  System.out.println("Enter the a,b value ");
	  Scanner s = new Scanner(System.in);
	  a=s.nextInt();
      b=s.nextInt();	  
	}
	void sum1()
	{
		c=a+b;
		System.out.println("a+b= "+c);
	}
	void sub1()
	{
		c=a-b;
		System.out.println("a-b= "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods7 m = new Methods7();
		m.getinfo();
		m.sum1();
	    m.sub1();

	}

}
