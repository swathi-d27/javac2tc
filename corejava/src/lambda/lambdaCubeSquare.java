package lambda;

public class lambdaCubeSquare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cube c=(a)->{return(a*a*a);};
		System.out.println("cube of the no is "+c.calculate(3));
		
		square s=(x)->{return(x*x);};
		System.out.println("Square of the no is "+s.calculate(7));
	}
}
