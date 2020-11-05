package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n,i=1;
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter the Number");
	      n=s.nextInt();
	      while(i<=n)
	      {
	    	if(i%2!=0)
	    	{
	    		
	    		System.out.println(i);
	    		
	    	}
	    	i++;
	    	}
	    	

	}

}
