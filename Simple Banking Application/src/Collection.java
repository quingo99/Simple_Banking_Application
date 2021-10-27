import java.util.*;
public class Collection {
	Scanner scnr = new Scanner(System.in);
	private Data_Collection Qui;
	public int PIN;
	
	public Collection() {
		Qui = new Data_Collection();
		this.PIN = Qui.PIN;
	}
	public void deposit()
	{
		float d;
		System.out.println("Enter number of money that you want to deposit: ");
		d = scnr.nextInt();
		Qui.collectDeposit(d);
		
	}
	public void withdraw()
	{
		float w;
		System.out.println("Enter number of money that you want withdraw: ");
		w = scnr.nextInt();
		if(w > Qui.checkBalance()){
			System.out.println("The money don't enough to withdraw");
		}
		
		else
			Qui.collectWithdraw(w);
	}
	public void changePin()
	{
		System.out.println("Enter new PIN: ");
		PIN = scnr.nextInt();
		Qui.Change_PIN(PIN);
	}
	public void checkBalance()
	{
		System.out.println("Balance: " + Qui.checkBalance()+"$");
	}

}
