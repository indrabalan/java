package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Methods4 {
	
	int sum1(int x,int y)
    {
   	 
   	 return x+y;
   	 
    }
    int sub1(int M,int N)
    {
   	 
   	 return M-N;
   	 
    }
    int mult1(int E,int F)
    {
   	
   	 return E*F;
   	 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a,b,result;
	      System.out.println("Enter the a,b value");
	  	  Scanner s=new Scanner(System.in);
	  	  a=s.nextInt();
	  	  b=s.nextInt();
	  	  Methods4  m=new Methods4 ();      
	      
	      result=m.sum1(a,b);
	      System.out.println("a+b="+result);
	      result=m.sub1(a,b);
	      System.out.println("a-b="+result);
	     result= m.mult1(a,b);
	      System.out.println("a*b="+result);

	}

}
