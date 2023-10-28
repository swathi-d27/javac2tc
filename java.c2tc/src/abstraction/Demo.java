package abstraction;


	public class Demo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Square sq=new Square();
			Rectangle rec=new Rectangle();
			System.out.println(sq);
			System.out.println(rec);
			//Shape s=new Shape();
			Shape s;
			s=new Square(4.0f);
			s.calcarea();
			s.show();
			
			s=new Rectangle(4.0f,2.0f);
			s.calcarea();
			s.show();
			
			
		}

}
