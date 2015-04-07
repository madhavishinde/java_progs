package madhavi;

public class Test
{
	private int i = 100;
	public Test()
	{
		i = 120;
	}
	public Test(int i)
	{
		this.i = i;
	}
	public int display()
	{
		System.out.println("Value of i = " + i);
		return i;
	}
	
}