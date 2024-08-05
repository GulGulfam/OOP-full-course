class BankAccount {
	private int accountNumber;
	private String accountOwner;
	private double accountBalance;

	public BankAccount(){
		this.setAccountNumber(120);
		this.setAccountOwner("gul");
		this.setAccountBalance(132.01);
	}
	public BankAccount(int accountNumber, String accountOwner, double accountBalance){
		this.setAccountNumber(accountNumber);
		this.setAccountOwner(accountOwner);
		this.setAccountBalance(accountBalance);
	}
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setAccountOwner(String accountOwner){
		this.accountOwner = accountOwner;
	}
	public void setAccountBalance(double accountBalance ){
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public String getAccountOwner(){
		return accountOwner;
	}
	public double getAccountBalance(){
		return accountBalance;
	}
	public void accountStatement(){
		System.out.println("Account number : " +getAccountNumber());
		System.out.println("Account Owner : " +getAccountOwner());
		System.out.println("Account balance : " +getAccountBalance());
	}
	public void deposit(double amount){
		this.setAccountBalance(amount + getAccountBalance()) ;
	}
	public void withdrawal(double amount){
		this.setAccountBalance(getAccountBalance() - amount) ;
	}

	
}