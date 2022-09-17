/*
* NAME: Krishna M. Thakor
* ID: 21CE142
* Write a java program which shows importing of classes from
other user define packages.
*/

import MyPackage.MyClass;

public class Practical5
{
	public static void main(String[] args) 
	{
		MyClass m1= new MyClass();
		System.out.println("SUM : "+m1.sum(5, 10));
		System.out.println("DIFFERENCE :"+m1.diff(20, 10) );
		
		System.out.println();
		System.out.println("ID:21CE142 \nName : Krishna M. Thakor");
	}
}