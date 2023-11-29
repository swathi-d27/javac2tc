package Collections;



public class GenericMain{
	public static void main(String [] args) {
generics <String> obj=new generics<String>();//creating generic object for string type
obj.set("ello");
System.out.println(obj.get());
generics <Integer> obj2=new generics<Integer>();
obj2.set(45);
System.out.println(obj2.get());

}
}
