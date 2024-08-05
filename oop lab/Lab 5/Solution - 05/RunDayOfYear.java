public class RunDayOfYear{
	public static void main(String[] args){

		DayOfYear today = new DayOfYear();
		today.input();
		System.out.print("Today's date is ");
		today.output();
		DayOfYear birthday = new DayOfYear();
		birthday.input();
		System.out.print("Ali's birthday is ");
		today.output();
		System.out.println("Happy Birthday Ali!");
		
	}//main
}//class