package enum1;

public class Main
{
	public static void main(String args[])
	{
		colors obj[] = colors.values();

		for(colors col : obj)
		{
			System.out.println(col);
		}	
	}
}