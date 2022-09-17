import java.util.*;

public class MethodOverriding
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Enter Value of a : ");
		a = sobj.nextInt();
		
		System.out.print("Enter Value of b : ");
		b=sobj.nextInt();
		
		ClassA aobj1 = new ClassA();
		ClassA aobj2 = new ClassB();
		ClassB bobj = new ClassB();
		
		aobj1.setA(a);
		bobj.setB(b);
		
		System.out.println();
		aobj1.display();
		bobj.display();
		
		System.out.println();
		System.out.println("ID : 21CE142 \nName : Krishna M. Thakor");
	}
}