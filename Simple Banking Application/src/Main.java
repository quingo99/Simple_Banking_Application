import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		Collection Qui = new Collection();
		
		int i =1;
		int x;
		int PIN;
		System.out.println("Please Enter PIN: ");
		PIN = scnr.nextInt();
		while(PIN !=  Qui.PIN) {
			System.out.println("WRONG!!!!!");
			System.out.println("Please Enter Again: ");
			PIN = scnr.nextInt();
			i++;
			if(i == 3) {
				System.out.println("You enter wrong over permision times.");
				break;
			}
		}
		System.out.println("*********Welcome Qui Ngo************");
		do {
			System.out.println("-------------MENU--------------");
			System.out.println("1. Deposit ");
			System.out.println("2. Withdraw ");
			System.out.println("3. Check Balance ");
			System.out.println("4. Reset Password ");
			System.out.println("0. Exit. ");
			
			System.out.println("Enter your choice: ");
			x = scnr.nextInt();
			
			if(x == 1)
				Qui.deposit();
			else if (x==2)
				Qui.withdraw();
			else if (x==3)
				Qui.checkBalance();
			else if(x==4)
				Qui.changePin();
				
		}while(x!=0);
		System.out.println("Thank you for using our service");
		
	}

}
