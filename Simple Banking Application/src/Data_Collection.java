
public class Data_Collection {
	public int PIN; 
	public String user_name;
	private float Balance;
	
	Data_Collection(){
		PIN = 999999;
		Balance = 0;
	}
	public void Change_PIN(int p)
	{
		PIN = p;
	}
	public void collectDeposit(float d)
	{
		Balance = Balance + d;
	}
	public void collectWithdraw(float w)
	{
		Balance = Balance - w;
	}
	float checkBalance()
	{
		return Balance;
	}

}
