package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Methods3 {
	

    void sum1(int x,int y)
    {
   	 int c;
   	 c=x+y;
   	 System.out. println("a+b="+c);
    }
    void sub1(int M,int N)
    {
   	 int c;
   	 c=M-N;
   	 System.out.println("a-b="+c);
    }
    void mult1(int E,int F)
    {
   	 int c;
   	 c=E*F;
   	 System.out.println("a*b="+c);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int a,b;
	      System.out.println("Enter the a,b value");
	  	  Scanner s=new Scanner(System.in);
	  	  a=s.nextInt();
	  	  b=s.nextInt();
	  	  Methods3 m=new Methods3();      
	      m.sum1(a,b);
	      m.sub1(a,b);
	      m.mult1(a,b);

	}

}
