package exception_nestedtrycatch;
import java.lang.*;

public class nestedtrycatch {
	public static void check()
	{
		String str="swathi";
		int len=str.length();
		System.out.println("String length="+len);
		String news=null;
		int z=12;
	try
	{
		try
		{
			System.out.println(str.charAt(z));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Inndex out of bound"+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception ..."+e.getMessage());
		}
		System.out.println("news length:"+news.length());
		
	}
	catch(NullPointerException e)
	{
		System.out.println("Exception thrown:"+e.getMessage());
	}
	
	}
}
