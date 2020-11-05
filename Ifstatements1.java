package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Ifstatements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		System.out.println("enter the age");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		if(age>18)
		{
			System.out.println("he is major ");
		}
		else
		{
			System.out.println("he is a minor");
		}
			


	}

}
