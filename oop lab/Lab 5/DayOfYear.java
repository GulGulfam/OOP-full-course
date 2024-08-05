import java.util.Scanner;

class DayOfYear {
	private int day,month;

	public void input(){
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter day as number  ");
		int d = sc.nextInt();
		System.out.println(" Enter month  as number   ");
		int m = sc.nextInt();

		set(d,m);
	}
	public void set(int d, int m){
		day = d;
		month = m;
	}
	/*public void setMonth(int m){
		month = m;
	}*/
	public int getDay(){
		return day;

	}
	public int getMonth(){
		return month;
	}

	public void show(){
		System.out.println("Today date month =  " +getMonth() +" day =  " +getDay() );
	}
	/*public void show1(){
		System.out.println(" Ali birthday month = " +month +" day =  " +day);
		System.out.println("HAPPY BIRTHDAY JAN");
	}*/

}

