package constructor;

public class customer {
	private String name;
	private int id;
	private String city;
	
	public customer()
	{
		System.out.println("default constructor");
	}
	public customer(String name,int id,String city)
	{
		this();//default constructor
		this.name=name;
		this.id=id;
		this.city=city;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return "customer [name=" + name + ", id=" + id + ", city=" + city + "]";
	}

}

