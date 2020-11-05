package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Ifstatements9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		System.out.println("ENTER THE YEAR");
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		if(year%4==0)
		{
			System.out.println("Leap Year");
			
		}
		else
		{
			System.out.println("Not a Leap Year");
		}


	}

}
