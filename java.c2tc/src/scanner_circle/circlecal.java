package scanner_circle;

import java.util.Scanner;

public class circlecal {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int radius;
		String color;

		System.out.println("Enter radius of the circle:");
		radius=obj.nextInt();
		obj.nextLine();
		System.out.println("Enter color of the circle:");
		color=obj.next();
		obj.nextLine();
		circle c= new circle();
		c.setColor(color);
		c.setRadius(radius);
		System.out.println(c);	   

        System.out.println("area of the circle:"+c.getArea());
        System.out.println("color of the circle: "+c.getColor()) ;
       
		}
		
		
}


