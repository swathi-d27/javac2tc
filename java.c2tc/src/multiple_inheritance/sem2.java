package multiple_inheritance;
import java.util.Scanner;

public class sem2 extends sem1 {
	int m4,m5,m6;
	float avg2;
	
	public void seme2()
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter c++ :");
		m4=s2.nextInt();
		System.out.println("Enter c++ lab:");
		m5=s2.nextInt();
		System.out.println("Enter maths allied 2 :");
		m6=s2.nextInt();
		
		avg2=(m4+m5+m6)/3;
	}
	public float getAvg2()
	{
		return avg2;
		
	}
	
	float total()
	{
		return ((avg1+avg2)/2);
	}
}

