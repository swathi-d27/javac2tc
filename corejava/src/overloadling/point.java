package overloadling;

public class point {
	private float x;
	private float y;
	
	public point()
	{
		x=0.0f;
		y=0.0f;
	}
	public point(float x)
	{
		this.x=x;
		this.y=x;
		
	}
	public point(float x,float y)
	{
		this.x=x;
		this.y=y;
		
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}
	
	

}
