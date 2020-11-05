package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Ifstatements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		System.out.println("Enter the a,b number");
		Scanner s =new Scanner (System.in);
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
			{
			System.out.println("a is a big number");
			}
			
		else
			{
			System.out.println("b is a big number");
			}
		
		

	}

}
