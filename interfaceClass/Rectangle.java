public class Rectangle implements Shape
{
	public double Area(double size)
	{
		return (size*size);
	}
	public void Show(double res)
	{
		System.out.println("Area of rectangle is " + res);
	}
}