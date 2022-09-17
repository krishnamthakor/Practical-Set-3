public abstract class GeometricObject
{
	private String Color;
	private boolean Filled;
	private java.util.Date DateCreated;
	
	public String getColor() {
		return Color;
	}
	
	public void setColor(String color) {
		Color = color;
	}
	
	public boolean isFilled() {
		return Filled;
	}
	
	public void setFilled(boolean filled) {
		Filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return DateCreated;
	}
	
	public void setDateCreated(java.util.Date dateCreated) {
		DateCreated = dateCreated;
	}
	
	protected GeometricObject()
	{
		DateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String Color, boolean Filled) 
	{
		DateCreated = new java.util.Date();
		this.Color = Color;
		this.Filled = Filled;
	}
	
	public String toString() 
	{
		return ("Created on " + DateCreated + "\nColor: " + Color + " and Filled: " + Filled) ;
	}

	public abstract double getArea();
	
	public abstract double getPerimeter();
}	