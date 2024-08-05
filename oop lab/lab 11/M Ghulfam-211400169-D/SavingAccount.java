class SavingAccount extends BankAccount {
	private double anualInterestRate;

	public SavingAccount(){
		super();
		this.setAnualInterestRate(133.0);
	}
	public SavingAccount(double anualInterestRate){
		this.setAnualInterestRate(anualInterestRate);
	}
	public SavingAccount(double anualInterestRate, int accountNumber, String accountOwner, double accountBalance){
		super(accountNumber,accountOwner,accountBalance);
		this.setAnualInterestRate(anualInterestRate);
	}
	public void setAnualInterestRate(double anualInterestRate){
		this.anualInterestRate = anualInterestRate;
	}
	public double getAnualInterestRate(){
		return anualInterestRate;
	}
		public void accountStatement(){

		System.out.println("anualInterestRate : " +getAnualInterestRate());
		super.accountStatement();
	}
	public void withdrawal(double amount){
		if (getAccountBalance()<amount) 
			System.out.println("Insufficient balance! Please recharge your account ");
			
			else{
				super.withdrawal(amount);
				System.out.println("Amount "+amount +" withdrawal");
			}
	}

	public void depositMonthlyInterset(){
		setAccountBalance(getAccountBalance()+(getAccountBalance() * getAnualInterestRate()/100/12.0));
	}

	
}