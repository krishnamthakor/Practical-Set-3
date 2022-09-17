/*

* NAME: Krishna M. Thakor
* ID: 21CE142
* Write a program that demonstrates use of packages & import
statements.
*/

import java.util.Scanner;
import java.lang.Math;

public class Practical6 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Base : ");
		int a=s.nextInt();
		System.out.print("Enter Power : ");
		int b=s.nextInt();
		
		System.out.println("POWER: "+ Math.pow(a, b));	
		
		System.out.print("\nEnter Number : ");
		int c=s.nextInt();
		
		System.out.println("ABSOLUTE :" +Math.abs(c));
		
		System.out.println();
		System.out.println("ID:21CE142 \nName : Krishna M. Thakor");
	}
}