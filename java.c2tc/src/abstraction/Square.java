package abstraction;

public class Square extends Shape {
	private float side;
	 public Square()
	{
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	void calcarea()
	{
		super.area=side*side;
		}

	public String toString() {
		return "Square [side=" + side + "]";
	}

}
