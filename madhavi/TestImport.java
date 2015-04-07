package madhavi;

public class TestImport extends Test
{
	public int display()
	{
		int ii = super.display();
		System.out.println("Value of i is in child class is " + ii);
		return ii;
	}
	TestImport(int i1)
	{
		super(i1);
	}
	public static void main(String args[])
	{
		//Test t1 = new Test();
		TestImport t1 = new TestImport(508);
		t1.display();
	}
}