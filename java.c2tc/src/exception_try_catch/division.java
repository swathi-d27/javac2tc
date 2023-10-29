package exception_try_catch;



public class division{
	public static void divi()
	{
		int a=6,b=0,c;
		try 
		{
			c=a/b;
			System.out.println("Divide is:"+c);
		}
		catch(ArrayIndexOutOfBoundsException e)
	    {
			System.out.print("Exception is :"+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.print("Exception is :"+e.getMessage());
		}
		/*catch(InputMismatchException e)
		{
			System.out.print("Exception is :"+e.getMessage());
		}*/
	}
	

}
