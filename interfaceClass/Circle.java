public class Circle implements Shape
{
	public double Area(double size)
	{
		return (3.01*size*size);
	}
	public void Show(double res)
	{
		System.out.println("Area of Circle is " + res);
	}
}