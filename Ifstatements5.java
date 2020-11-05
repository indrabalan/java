package Firstpackage;
import java.io.*;
import java.util.Scanner;


public class Ifstatements5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		System.out.println("Enter the Age");
		Scanner s= new Scanner(System.in);
		age=s.nextInt();
		if(age>18)
		{
			System.out.println("Eligible for Voting");	
			}
		else
		{
		System.out.println("Not Eligible for Voting");
		}

	}

}
