package Collections;


import java.util.HashSet;
import java.util.Set;
public class setOperationss {
	public static void main(String [] args) { 
Set<Integer> set1=new HashSet<>();
Set<Integer> set11=new HashSet<>();
Set<Integer> set111=new HashSet<>();

set1.add(2);
set1.add(3);
set1.add(4);
set11.add(1);
set11.add(3);
set11.add(5);
set111.add(2);
set111.add(4);
set111.add(6);
 
Set<Integer> diff=new HashSet<>(set1);
diff.removeAll(set11);

Set<Integer> inter=new HashSet<>(set1);
inter.retainAll(set11);

Set<Integer> unio=new HashSet<>(set1);
unio.addAll(set111);

System.out.println("set1="+set1);
System.out.println("set11="+set11);
System.out.println("set111="+set111);

System.out.println("intersection operation :" +inter);
System.out.println("difference operation :" +diff);
System.out.println("union operation :" +unio);
	}
}
