import java.util.Scanner;
class Gross {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Entr");
		double grossPay = sc.nextDouble();

		while(grossPay>0){
			double com = (grossPay/100)*9;
			double e = (com + grossPay) +200;
			System.out.println(e);
			grossPay = sc.nextDouble();		}
	}
	
}