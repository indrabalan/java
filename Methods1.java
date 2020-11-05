package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Methods1 {
	

	
	int a,b;
	void getinfo()
	{
		
	  System.out.println("Enter the a,b value ");
	  Scanner s = new Scanner(System.in);
	  a=s.nextInt();
      b=s.nextInt();	  
	}
	int sum1()
	{
		
		return a+b;
		
		
	}
	int sub1()
	{
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;	
	    Methods1  m = new  Methods1 ();
		m.getinfo();	
		result=m.sum1();
		System.out.println("a+b= "+result);	
	    result= m.sub1();
	    System.out.println("a-b= "+result);
		
		

	}

}
