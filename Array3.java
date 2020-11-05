package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Array3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a[] = new int[6];
	     int sum=0;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter the value");
	     for(int i=0;i<6;i++)
	     {
	    	a[i]=s.nextInt();
	     }
	     for(int i=0;i<6;i++)
	     {
	    	sum=sum+a[i];
	     }
	     
	     System.out.println("sum="+sum);

	}

}
