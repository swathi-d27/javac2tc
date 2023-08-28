package thirdpackage;

public class commission {
	private String name;
	private String address;
	private String phone;
	private int sales_amount;
	private int commission;
	private int comm_amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSales_amount() {
		return sales_amount;
	}
	public void setSales_amount(int sales_amount) {
		this.sales_amount = sales_amount;
	}
	public int getCommission() {		
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	
	}
	
	public int getComm_amount() {
		return comm_amount;
	}
	public void setComm_amount(int comm_amount) {
		this.comm_amount = comm_amount;
	}
	public String toString() {
		return "commission [name=" + name + ", address=" + address + ", phone=" + phone + ", sales_amount="
				+ sales_amount + ", commission=" + commission + "%, comm_amount=RS." + comm_amount + "]";
	}
	
    
	

}
