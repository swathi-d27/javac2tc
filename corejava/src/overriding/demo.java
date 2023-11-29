package overriding;

public class demo {
	public static void main(String[]args)
	{
		System.out.println(Employee.company);
		Employee e=new Employee("swathi",123);
		System.out.println(e);
		
	    e=new Employee("joy",023);
		System.out.println(e);
		
	}

}
