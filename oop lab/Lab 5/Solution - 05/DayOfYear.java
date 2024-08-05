import java.util.Scanner;

public class DayOfYear{
	private int day;
	private int month;

	public void input(){
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the month as a number: ");
		int m = read.nextInt();
		System.out.println("Enter the day of the month: ");
		int d = read.nextInt();
		set(m, d);
	}//input()

	public void set(int m, int d){
		day = d;
		month = m;
	}//set()

	public int getMonth(){
		return  month;
	}//getMonth()

	public int getDay(){
		return day;
	}//getDay()

	public void output(){
		System.out.println("Month = " + getMonth() + ", Day = " + getDay());
	}//output
	
}//class