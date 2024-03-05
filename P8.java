class Account {
	private String depositorName;
	private String accountNumber;
	private String accountType;
	private double balance;

	public Account(String depositorName, String accountNumber, String accountType, double balance) {
		this.depositorName = depositorName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("Invalid Deposit Amount");
		} else {
			balance+=amount;
			System.out.println("Deposit of $ "+amount +" Successful\n");
		}
	}

	public void displayAccountInfo() {
		System.out.println("Depositor Name :: "+depositorName);
		System.out.println("Account Number :: "+accountNumber);
		System.out.println("Account Type :: "+accountType);
		System.out.println("Balance :: $ "+balance);
	}
}
class P8 {
	public static void main(String[] args) {
		Account account = new Account("rudra","220130318128","Savings",900000);
		account.deposit(150000);
		account.displayAccountInfo();
	}
}