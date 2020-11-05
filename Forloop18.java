package Firstpackage;

import java.util.Scanner;

public class Forloop18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k,n;
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
