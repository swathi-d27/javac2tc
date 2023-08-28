package thirdpackage;

public class commcal {
	public void calcom(commission c)
	{
		int a;
		if(c.getSales_amount()>=100000)
		{
			c.setCommission(10);
			a=(c.getSales_amount()/100)*10;
			c.setComm_amount(a);
		}
		else if(c.getSales_amount()>=50000 && c.getSales_amount()<100000)
		{
			c.setCommission(5);
			a=(c.getSales_amount()/100)*5;
			c.setComm_amount(a);
			
		}
		else if(c.getSales_amount()>=30000 && c.getSales_amount()<50000)
		{   
			c.setCommission(3);
			a=(c.getSales_amount()/100)*3;
			c.setComm_amount(a);
		}
		else
		{
			c.setCommission(0);
			a=(c.getSales_amount()/100)*0;
			c.setComm_amount(a);
		}
	}

}
