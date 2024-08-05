class UsingAccount {
	public static void main(String[] args) {
		SavingAccount acc = new SavingAccount();
		System.out.println("Before Display state of obj #1 \n");
		acc.accountStatement();
		System.out.println();
		acc.withdrawal(2500.0);
		acc.withdrawal(2440.0);
		acc.depositMonthlyInterset();
		acc.depositMonthlyInterset();
		acc.depositMonthlyInterset();
		acc.depositMonthlyInterset();
		System.out.println("Display state of obj #1 \n");
		acc.accountStatement();
		System.out.println();

		SavingAccount acc2 = new SavingAccount(16.1);
		System.out.println("Before Display state of obj #2 \n");
		acc2.accountStatement();
		System.out.println();
		acc2.withdrawal(893.0);
		acc2.withdrawal(900.0);
		acc2.depositMonthlyInterset();
		acc2.depositMonthlyInterset();
		acc2.depositMonthlyInterset();
		System.out.println("Displaying state of obj #2 \n");
		acc2.accountStatement();
		System.out.println();

		SavingAccount acc3 = new SavingAccount(1230.0, 156,"Muhammad",245.0);
		System.out.println("Before Display state of obj #3 \n");
		acc3.accountStatement();
		System.out.println();
		acc3.withdrawal(100.0);
		acc3.withdrawal(200.0);
		acc3.depositMonthlyInterset();
		acc3.depositMonthlyInterset();
		acc3.depositMonthlyInterset();
		System.out.println("Displaying obj #3 \n");
		acc3.accountStatement();
		System.out.println();

		CheckingAccount ch = new CheckingAccount();
		System.out.println("Before Displaying CheckingAccount OBJ #1 \n");
		ch.accountStatement();
		System.out.println();
		ch.withdrawal(2000.0);
		ch.withdrawal(1000.0);
		ch.withdrawal(200.0);
		ch.withdrawal(2000.0);
		ch.withdrawal(2000.0);
		ch.withdrawal(2000.0);
		ch.withdrawal(2500.0);
		System.out.println("Displaying CheckingAccount OBJ #1 \n");
		ch.accountStatement();
		System.out.println();

		CheckingAccount ch1 = new CheckingAccount(86.0);
		System.out.println("Before Displaying CheckingAccount OBJ #2 \n");
		ch1.accountStatement();
		System.out.println();
		ch1.withdrawal(2000.0);
		ch1.withdrawal(2000.0);
		ch1.withdrawal(2000.0);
		ch1.withdrawal(2000.0);
		ch1.withdrawal(2000.0);
		ch1.withdrawal(2000.0);
		ch1.withdrawal(2500.0);
		System.out.println("Displaying CheckingAccount OBJ #2 \n");
		ch1.accountStatement();
		System.out.println();

		CheckingAccount ch2 = new CheckingAccount(860.0,565,"UMAR",165.0);
		System.out.println("Before Displaying CheckingAccount OBJ #3 \n");
		ch2.accountStatement();
		System.out.println();
		ch2.withdrawal(2000.0);
		ch2.withdrawal(2000.0);
		ch2.withdrawal(2000.0);
		ch2.withdrawal(2000.0);
		ch2.withdrawal(2000.0);
		ch2.withdrawal(2000.0);
		ch2.withdrawal(2500.0);
		System.out.println("Displaying CheckingAccount OBJ #3 \n");
		ch2.accountStatement();
		System.out.println();













		

		
	}
	
}