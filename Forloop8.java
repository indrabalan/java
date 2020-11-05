package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Forloop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n,i,j,k=0;
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter the row limimt");
	      n=s.nextInt();
	      for(i=1;i<=n;i++,k++)
	      {
	    	  for(j=n-i;j>0;j--)
	    		  
	    	  {
	    		  System.out.print(" ");
	    		  
	    	  }
	    	  for(j=1;j<=i+k;j++)
	    	  {	  
	    	      System.out.print("*");
	    	      
	    	  }
	    	  System.out.println();
	      }

	}

}
