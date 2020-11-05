package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Array8
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];		
		a[0][0]=2;
		a[0][1]=3;
		a[0][2]=5;
		a[1][0]=6;
		a[1][1]=7;
		a[1][2]=8;
		
		
	int b[][]={{2,3,4},{5,6,7}};			
 
	int c[][] = new int[2][3];;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the values");
	for (int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			c[i][j]=s.nextInt();
		}
		System.out.println("");
	}
	System.out.println("Printing....");
	for (int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print("\t"+c[i][j]);
		}
		System.out.println("");
	}

	}

}
