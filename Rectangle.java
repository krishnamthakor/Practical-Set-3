public class Rectangle extends GeometricObject
{
	private double Width;
	private double Height;
	
	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

	public Rectangle()
	{
		Width=0;
		Height=0;
	}
	
	public Rectangle(double Height, double Width)
	{
		this.Width= Width;
		this.Height = Height;
	}
	
	public Rectangle(double Height, double Width, String Color, boolean Filled)
	{
		this.Width= Width;
		this.Height = Height;
		setColor(Color);
		setFilled(Filled);
	}
	
	public double getArea()
	{
		return (Width * Height);
	}
	
	public double getPerimeter()
	{
		return (2*(Width + Height));
	}
}