package Firstpackage;
import java.util.Scanner;

public class Array4 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];
		int b[][] = new int[2][3];
		int c[][] = new int[2][3];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a matrix values");
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();				
			}
			System.out.println("");
		}
		System.out.println("Enter b matrix values");
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();				
			}
			System.out.println("");
		}
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]	=a[i][j]+b[i][j];		
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
