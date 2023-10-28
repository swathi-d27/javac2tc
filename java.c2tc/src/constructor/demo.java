package constructor;

import java.util.Scanner;

public class demo {
public static void main(String[]args) {
	Scanner o=new Scanner(System.in);
	String name,city;
	int id;
	System.out.println("enter id:");
	id=o.nextInt();
	o.nextLine();
	System.out.println("enter name:");
	name=o.next();
	o.nextLine();
	System.out.println("enter city:");
	city=o.next();
	o.nextLine();
	customer c=new  customer();//default
	c.setId(id);
	c.setName(name);
	c.setCity(city);
	System.out.println(c);
	customer c1=new customer(name,id,city);	
}

}
