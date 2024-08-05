class CheckingAccount extends BankAccount {
	private double insufficientFundsFee;

	public CheckingAccount(){
		this.setInsufficientFundsFee(235.0);
	}
	public CheckingAccount(double insufficientFundsFee){
		this.setInsufficientFundsFee(insufficientFundsFee);
	}
	public CheckingAccount(double insufficientFundsFee, int accountNumber, String accountOwner, double accountBalance){
		super(accountNumber,accountOwner,accountBalance);
		this.setInsufficientFundsFee(insufficientFundsFee);

	}
	public void setInsufficientFundsFee(double insufficientFundsFee){
		this.insufficientFundsFee = insufficientFundsFee;
	}
	public double getInsufficientFundsFee(){
		return insufficientFundsFee;
	}
	public void accountStatement(){
		super.accountStatement();
		System.out.println("insufficientFundsFee : " +getInsufficientFundsFee());
	}
	public void withdrawal(double amount){
		if (super.getAccountBalance()<amount) {
			setAccountBalance(super.getAccountBalance() - this.getInsufficientFundsFee());
			System.out.println("insufficientFundsFee " +this.getInsufficientFundsFee());
			
		}
		else{
			super.withdrawal(amount);
			System.out.println("Amount " +amount +" withdrawal");
		}
	}
	
}
	
