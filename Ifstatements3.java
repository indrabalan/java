package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Ifstatements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;		
		char gender;
		System.out.println("Enter the gender M/F");
		Scanner s =new Scanner(System.in);
		gender=s.next().charAt(0);
		if(gender=='M'|| gender=='m')
		{
			System.out.println("Enter the age");
			age=s.nextInt();
			if(age>21)
			{
				System.out.println(" Eligible for marrage");
			}
			else
		    
			{
				System.out.println("Not eligible for marrage");
			}
		}
		if(gender=='F')
		 {
					System.out.println("Enter the age");
					age=s.nextInt();
					if(age>18)
					{
						System.out.println(" Eligible for marrage");
					}
					else
				    
					{
						System.out.println("Not eligible for marrage");
					}
				}

	}

}
