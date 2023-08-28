package firstpackage;

public class person {
	private String name;
	private int income;
	private int tax;
	//getters and setters are used to protect the data
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String toString() {
		return "person [name=" + name + ", income=" + income + ", tax=" + tax + "]";
	}
	

}
