package Collections;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList2
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list1=new ArrayList();
		System.out.println("To check whether the list is empty or not: "+list1.isEmpty());
		System.out.println("Size of Arraylist is:"+list1.size());
		list1.add(67);
		list1.add('j');
		list1.add(89);
		System.out.println("Sizeof arraylist after adding elements is:"+list1.size());
		System.out.println(list1);
		System.out.println(list1.contains(99));
		System.out.println("element at the position 1 is: "+list1.get(1));
		System.out.println("removing the element from the same position.."+list1.remove(1));
		System.out.println(list1);
		list1.add(1);
		list1.add(2);
		System.out.println(list1);
		System.out.println("removing the element "+list1.remove(list1.indexOf(2))+" from the list");
		System.out.println(list1);

		ArrayList <String>ob=new ArrayList<String>();
		ob.add("Swathi");
		ob.add("DhARMA");
		ob.add("Mcc");
		//traverse a list
		
		
		Iterator<String>i=ob.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.println(nm);
			
		}
		
		
		
	}
}
