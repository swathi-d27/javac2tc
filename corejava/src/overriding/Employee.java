package overriding;

public class Employee {

	private String name;
	private int id;
	
	static String company="TNS";
	
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
		
	}

	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company=" +company + "]";
	}
	
}
