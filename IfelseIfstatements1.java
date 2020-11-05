package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class IfelseIfstatements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char week;
		System.out.println("Enter the Letter");
		Scanner s=new Scanner(System.in);
		week=s.next().charAt(0);
		if(week=='S')
		{
			System.out.println("SUNDAY");
		}
		else if(week=='M')
		{
			System.out.println("MONDAY");
		}
		else if(week=='T')
		{
			System.out.println("TUESDAY");
		}
		else if(week=='W')
		{
			System.out.println("WEDNESDAY");
		}
		else if(week=='t')
		{
			System.out.println("THURSDAY");
		}
		else if(week=='F')
		{
			System.out.println("FRIDAY");
		}
		else if(week=='s')
		{
			System.out.println("SATURDAY");
		}

	}

}
