package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Methods6 {
	
	int first=0,second=1,temp,n;
    void getinfo()
    {
    	System.out.println("Enter the value");
    	Scanner s=new Scanner(System.in);    	
    	n=s.nextInt();
    }
 void value1() 
 {
	for(int i=0;i<=n;i++)
	{
		if(i==0)
		{
			System.out.print(" "+first);
		}
		else
		{
		temp=first+second;
		second=first;
		first=temp;
		System.out.print(" "+temp);
		}
	}
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods6 m=new Methods6();
		m.getinfo();
		m.value1();


	}

}
