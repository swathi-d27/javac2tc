package using_staticblock;

public class classmain {
	private int section;
	private static int srno;
	static
	{
		System.out.println("Static Block....");
		srno=100;
		
	}
	
	classmain()
	{
		System.out.println("default constructor");
		section++;
		srno++;
	}
	
	static void display()
	{
		System.out.println("serial no:"+srno);
		
	}

	public String toString() {
		return "classmain [section=" + section + "]";
	}

	
}
