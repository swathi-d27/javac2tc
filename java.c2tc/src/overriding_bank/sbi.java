package overriding_bank;

public class sbi extends Rbi{
	public float getRateOfInterest()
	{
		super.getRateOfInterest();
		return 8.7f;
		//super.getRateOfInterest();
		
	}

}
