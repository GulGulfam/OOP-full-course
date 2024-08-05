class RunDayOfYear {
	public static void main(String[] args) {
		DayOfYear today = new DayOfYear();
		DayOfYear birthDay = new DayOfYear();

		today.input();
		today.show();


		birthDay.setMonth();
		birthDay.setDay();
		birthDay.getMonth();
		birthDay.getDay();
		birthDay.show();
		System.out.println("BRDY ALI");
	}
	
}