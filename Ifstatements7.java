package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Ifstatements7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age,weight;
		System.out.println("Enter the Age");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		if(age>18)
		{
			System.out.println("Enter the WEIGHT");
			weight=s.nextInt();
			if(weight>50)
			{
			System.out.println("aligible for blood donate");
			}
			else
			{
				System.out.println("weight is not aligible for blood donate");
			}
		}
		else
		{
			System.out.println("Age is not aligible for blood donate");
		}


	}

}
