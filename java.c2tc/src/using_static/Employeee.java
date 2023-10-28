package using_static;

public class Employeee {
	private String name;
	private int id;
	static String company="TNS";
	public Employeee(String name,int id)
	{
		super();
		this.name=name;
		this.id=id;
	
	}
	public String toString() {
		return "Employeee [name=" + name + ", id=" + id + "]";
	}
 
}
