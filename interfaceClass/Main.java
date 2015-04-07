class Main
{
	public static void main(String args[])
	{
		double res;
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		res = r1.Area(10);
		r1.Show(res);
		res = c1.Area(2);
		c1.Show(res);
	}
}