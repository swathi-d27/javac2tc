package single_inheritance;

public class student extends citizen {
	private int roll;
	private String college;
	public student()
	{
		super();
	}
	
	




	public student(String name,long aadhar,String address ,long phone,int roll,String college )
	{
		super(name,aadhar,address,phone);
		this.roll=roll;
		this.college=college;
	
		
	}


public String toString() {
	return "student [roll=" + roll + ", college=" + college + ", getName()=" + getName() + ", getAadhar()="
			+ getAadhar() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + "]";
}

}
