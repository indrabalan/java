package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Switchstatements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int week;
		System.out.println("Enter the Week Number");
		Scanner s=new Scanner(System.in);
		week=s.nextInt();
		switch (week)
		{
		case 1:System.out.println("SUNDAY");
		       break;
		case 2:System.out.println("MONDAY");
		       break;
		case 3:System.out.println("TUESDAT");
		       break;
		case 4:System.out.println("WEDNESDAY");
		       break;
		case 5:System.out.println("THURSDAT");
		       break;
		case 6:System.out.println("FRIDAT");
		       break;
		case 7:System.out.println("SATURDAY");
		       break;
		}
			

	}

}
