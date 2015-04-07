public class B extends A
{
	public void xMethod()
	{
		System.out.println("In xMethod of Child class");
	}
	public void yMethod()
	{
		System.out.println("In yMethod of Child class");
	}
	public static void main(String args[])
      	{	
              		System.out.println("Hello World");
		A objA = new B();
		objB.yMethod();
      	}
}