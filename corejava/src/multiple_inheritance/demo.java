package multiple_inheritance;

public class demo {
	public static void main(String[]args)
	{
	sem2 o=new sem2();
	o.seme1();
	o.seme2();
	System.out.println("semester 1 :"+o.getAvg1());
	System.out.println("semester 2:"+o.getAvg2());
	
	System.out.println(" totalsemester :"+o.total());
	
	}

}
