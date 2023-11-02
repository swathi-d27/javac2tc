package exception_userdefined;
import java.util.*;

public class userdefined {
	private static int age;
	static void validate() throws hello
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER AGE:");
		age=sc.nextInt();
		
		if(age<18)
		
			throw new hello("Invalidate");
		
		else
		
			System.out.println("you are eligible");
			
		
	}
	
}
