package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Forloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n,i,j;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter the row limimt");
	     n=s.nextInt();
	     for(i=1;i<=n;i++)
	     {	 
	    	for(j=1;j<=n;j++)
	    	{
			System.out.print("*");
		    }
	     System.out.println("");
	     }

	}

}
