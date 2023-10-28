package single_inheritance;

public class citizen {
	private String name;
	private long aadhar;
	private String address;
	private long phone;
	
	public citizen(String name,long aadhar,String address,long phone)
	{
		super();
		this.name=name;
		this.aadhar=aadhar;
		this.address=address;
		this.phone=phone;
		
	}

	public citizen()
	{
		super();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
