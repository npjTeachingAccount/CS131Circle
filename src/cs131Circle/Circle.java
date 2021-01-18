package cs131Circle;

public class Circle {
	private double radius;
	
	public Circle()
	{
		radius=1;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double calculateArea(double radius)
	{
		return Math.PI*Math.pow(radius,2);
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	
}
