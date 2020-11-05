package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Forloop12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n,i,j,count=0;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter the number");
	     n=s.nextInt();
	    
	    	for(i=1;i<=n;i++)
	    	{
	    		count=0;
	    		for(j=1;j<=i;j++)
	    		{
	    			if(i%j==0)
	    			{
	    			  count++;	
	    			}
	    			
	    		}
	    		if(count==2)
				{
					System.out.println(i);
				}
	    			

	    	}
	}
	

}
