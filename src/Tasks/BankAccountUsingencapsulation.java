package Tasks;

public class BankAccountUsingencapsulation {
	private int accountnumber;
	private String holdername;
	private double balance;
	
	public BankAccountUsingencapsulation (int accountnumber,String holdername) {
		this.accountnumber = accountnumber;
		this.holdername = holdername;
		this.balance = 5000;
		
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("deposited:1000"+ amount);
	}
	public void withdraw(double amount) {
		if(amount<= balance) {
			balance = balance - amount;
			System.out.println("withdraw:1000"+amount);
		}else {
			System.out.println("insuffient balance");
		}
	}

	public static void main(String[] args) {
		BankAccountUsingencapsulation  bank = new BankAccountUsingencapsulation(101,"farhana");
		bank.deposit(2000);
		bank.withdraw(1500);
		 
		 System.out.println("final balance:1000"+bank.balance);
		
	}

}
