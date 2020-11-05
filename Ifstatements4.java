package Firstpackage;
import java.io.*;
import java.util.Scanner;


public class Ifstatements4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0)
		{
		     System.out.println("it is a even number");
		}
		else
			
		{
			System.out.println("It is a odd number");
		}

	}

}
