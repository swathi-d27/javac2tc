package scanner;

import java.util.Scanner;

public class personexec {
	public static void main(String[] args)
	{
		Scanner o=new Scanner(System.in);
		String name;
		System.out.println("enter name:");
		name=o.nextLine();
		System.out.println("enter income:");
		int in=o.nextInt();
		
	    person pp=new person();
	    pp.setName(name);
	    pp.setIncome(in);
	    tax cal=new tax();
	    cal.calculateTax(pp);
	    System.out.println("Tax:");
	    System.out.println(pp.getTax());
	    System.out.println(pp);
	    
	}

}
