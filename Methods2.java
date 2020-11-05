package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Methods2 {
	
	int a,b;
	void getinfo()
	{
		System.out.println("Enter the a,b value");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
	}
	     int sum1()
	     {
	    	 return a+b;
	     }
	     int sub1()
	     {
	    	return a-b ;
	     }
	     int mult1()
	     {
	    	 return a*b;
	     }
	     int div1()
	     {
	    	 return a/b;
	     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int result;
		  Methods2 m=new Methods2();
	      m.getinfo();
	      result=m.sum1();
	      System.out.println("a+b"+result);
	      result=m.sub1();
	      System.out.println("a-b"+result);
	      result=m.mult1();
	      System.out.println("a*b"+result);
	      result=m.div1();
	      System.out.println("a/b"+result);

	}

}
