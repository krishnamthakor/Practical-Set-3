import java.util.*;

public class TestGeometricObject
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter Radius of a Circle : ");
		double Radius = sobj.nextDouble();
		GeometricObject gobj1 = new Circle(Radius);
		System.out.println("Area of Circle : " + gobj1.getArea());
		System.out.println("Perimeter of Circle : " + gobj1.getPerimeter());
		
		System.out.println();
		System.out.print("Enter Width of a Rectangle : ");
		double width = sobj.nextDouble();
		System.out.print("Enter Height of a Rectangle : ");
		double height = sobj.nextDouble();
		GeometricObject gobj2 = new Rectangle(width,height);
		System.out.println("Area of Rectangle: " + gobj2.getArea());
		System.out.println("Perimeter of Rectangle : " + gobj2.getPerimeter());
		
		sobj.close();
		System.out.println();
		System.out.println("ID:21CE142 \nName : Krishna M. Thakor");
	}
}