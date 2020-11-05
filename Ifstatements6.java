package Firstpackage;
import java.io.*;
import java.util.Scanner;

public class Ifstatements6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char vowels;
		System.out.println("Enter the letters");
		Scanner s=new Scanner(System.in);
		vowels=s.next().charAt(0);
		if(vowels=='A'||vowels=='E'||vowels=='I'||vowels=='O'||vowels=='U'||vowels=='a'||vowels=='e'||vowels=='i'||vowels=='o'||vowels=='u')
		{
			System.out.println("is a Vowels");
		}
		else
		{
			System.out.println("is a consonant");
		}

	}

}
