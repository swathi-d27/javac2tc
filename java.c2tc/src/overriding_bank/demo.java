package overriding_bank;

public class demo {
	public static void main(String[]args)
	{
		sbi ob=new sbi();
		System.out.println(ob.getRateOfInterest());
	    
		Rbi ob2=new Rbi();
		System.out.println(ob2.getRateOfInterest());
		
	}
	
}
