package exception_userdefined;

public class demo {
	public static void main(String[]args)
	{
		try
		{
			userdefined.validate();
			
		}
		catch(age e)
		{
			System.out.println("caught :"+e.getMessage());
		}
	}

}
