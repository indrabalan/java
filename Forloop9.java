package Firstpackage;
import java.io.*;
import java.util.Scanner;


public class Forloop9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n,i,j;
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter the row limimt");
	        n=s.nextInt();
	        for (i=1;i<=n;i++)
	        {
	        	
	        	for(j=n-i;j>0;j--)
	        	{
	        		System.out.print(" ");
	        	}
	        	for(j=1;j<=i;j++)
	        	{
	        		System.out.print(j);
	        	}
	        	{
	        	System.out.println();
	        	}
	        	
	         }

	}

}
