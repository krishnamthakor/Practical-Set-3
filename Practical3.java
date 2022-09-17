import java.util.Vector;
/*
  * NAME : Krishna M. Thakor
    ID: 21CE142
    Write a program to create a default method in an interface IPrinter. 
    Create an interface IPrinter and IScanner. You can assume variables 
    and methods for both interfaces. Create a concrete class to implement
    both the interfaces. Create 5 objects of the class, store it in Vector
    and display the result of the vector.
  */

public class Practical3
{
	public static void main(String[] args) 
	{
		Vector v= new Vector();
		Concrete c[]= new Concrete[5];
		for(int i=0;i<5;i++)
		{
			c[i]=new Concrete();
			v.add(c[i]);
		}
		Concrete cc1 = (Concrete) v.get(0);
		cc1.func();
		cc1.func1();
		
		System.out.println();
		System.out.println("ID:21CE142 \nName : Krishna M. Thakor");
	}
}