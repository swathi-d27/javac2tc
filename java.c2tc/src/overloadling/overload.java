package overloadling;

public class overload {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p=new point();
		System.out.println(p);
		point p1=new point(0.2f);
		System.out.println(p1);
		point p2=new point(0.3f,0.9f);
		System.out.println(p2);
		
}
}
