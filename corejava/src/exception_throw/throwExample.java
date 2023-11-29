package exception_throw;

public class throwExample {

	public static void main(String[]args)
	{
		int age=16;
		if(age<18)
		{
			throw new ArithmeticException("Age must be atleat 18...");
			
		}
		System.out.println("Age is valid");
	}
	
}
