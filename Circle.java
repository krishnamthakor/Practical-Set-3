public class Circle extends GeometricObject
{
	private double Radius;
	
	public Circle()
	{
		Radius = 0;
	}
	
	public Circle(double Radius)
	{
		this.Radius = Radius;
	}
	
	public Circle(double Radius, String Color, boolean Filled)
	{
		this.Radius = Radius;
		setColor(Color);
		setFilled(Filled);
	}
	
	public double getArea()
	{
		return (3.14*Radius * Radius);
	}
	
	public double getPerimeter()
	{
		return (2*3.14*Radius);
	}
}