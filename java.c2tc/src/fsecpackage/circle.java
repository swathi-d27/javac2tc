package fsecpackage;

public class circle {
	private int radius;
	private String color;
	private double area;
	
	

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		this.area=3.14*radius*radius;
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String toString() {
		return "circle [radius=" + radius + ", color=" + color + ", area=" + area + "]";
	}
}
	
	

