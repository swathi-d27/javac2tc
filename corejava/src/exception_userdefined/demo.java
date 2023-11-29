package exception_userdefined;

public class demo {
	public static void main(String[]args)
	{
		try
		{
			userdefined.validate();
			
		}
		catch(hello e)
		{
			System.out.println("caught by exception:"+e.getMessage());
		}
	}

}
