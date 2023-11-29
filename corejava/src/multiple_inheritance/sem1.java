package multiple_inheritance;
import java.util.Scanner;

public class sem1 {
	int m1,m2,m3;
	float avg1;
	
	public void seme1()
	{
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter c :");
			m1=s1.nextInt();
			System.out.println("Enter c lab:");
			m2=s1.nextInt();
			System.out.println("Enter maths allied 1 :");
			m3=s1.nextInt();
		}
		avg1=(m1+m2+m3)/3;
	}
	public float getAvg1()
	{
		return avg1;
		
	}

}
