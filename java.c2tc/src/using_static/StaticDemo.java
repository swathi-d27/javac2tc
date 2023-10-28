package using_static;

public class StaticDemo {
	public static void main(String[]args)
	{
		System.out.println(Employeee.company);
		Employeee e=new Employeee("swathi",231);
		System.out.println(e);
		e=new Employeee("swa",898);
		System.out.println(e);
	}

}
