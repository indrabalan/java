package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Array7
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		int temp;
		System.out.println("Enter the Array values");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("decending Order");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}


	}

}
