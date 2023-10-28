package scanner_commmission;

import java.util.Scanner;
public class demo {
public static void main(String[]args)
{
	Scanner obj=new Scanner(System.in);
	String name;
    String address;
    String phone;
    int sales_amount;
    System.out.println("Name:");
    name=obj.nextLine();
 
    System.out.println("Address:");
    address=obj.nextLine();
    
    System.out.println("Phone:");
    phone=obj.nextLine();
   
    System.out.println("Amount:");
    sales_amount=obj.nextInt();
    obj.nextLine();
    commission c1=new commission();
    c1.setName(name);
    c1.setAddress(address);
    c1.setPhone(phone);
    c1.setSales_amount(sales_amount);
    commcal cal=new commcal();
    cal.calcom(c1);
    System.out.println(c1);
    System.out.println("Name:"+c1.getName());
    System.out.println("Address:"+c1.getAddress());
    System.out.println("Phone:"+c1.getPhone());
    System.out.println("Amount:"+c1.getSales_amount());
    System.out.println("Commission:"+c1.getCommission()+"%");
    System.out.println("commission amount:RS."+c1.getComm_amount());
}
}
