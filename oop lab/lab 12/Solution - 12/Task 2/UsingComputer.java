public class UsingComputer {

	public static void main(String[] args) {

		Ram ram = new Ram(5600,8);
		HardDisk hardisk = new HardDisk(12000,"SSD",128);

		Computer c1 = new Computer(hardisk, ram, 100000, "Dell");
		System.out.println("\n\nComputer's Ram capacity?  " + c1.getRamCapacity() + "GB.");
		System.out.println("Computer's hardisk capacity? " + c1.getHardDiskCapacity() + "GB.");


		//Checking if HD is HDD or SSD
		if (c1.isDiskSSD()) {
			System.out.println("\nComputer has SSD.");
			
		} else {
			System.out.println("\nComputer has HDD.");

		}//if

		//Checking if Ram is costly
		if (c1.isRamCostly()) {
			System.out.println("\nYes! Ram is costly.");
			
		} else {
			System.out.println("\nNo! Ram is not costly.");
		}//if

		System.out.println("\n\nPrinting the state of the computer...");
		c1.state();
	}//main()

}//class
