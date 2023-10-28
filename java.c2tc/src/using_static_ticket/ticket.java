package using_static_ticket;

public class ticket {
	private static int avail=10;
	public static void main(String[]args)
	{
		for(int i=0;i<=10;i++)
		{
			book(i);
			
		}
	}
	
	public static void book(int person)
	{
		if(avail>0)
		{
			System.out.println("person"+person+" booked a ticket.\nAvailable tickets :" +avail);
			avail--;
		}
		else
			System.out.println("Sorry... no more tickets available for person "+person);
		
	}

}
