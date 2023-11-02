package exception_userdefined;
import java.util.*;

public class userdefined {
	private static int age;
	static void validate() throws hel
	{
		Scanner c=new Scanner(System.in);
		System.out.println("ENTER AGE:");
		age=c.nextInt();
		
		if(age<18)
		
			throw new hel("Invalidate");
		
		else
		
			System.out.println("you are eligible");
			
		
	}
	
}
