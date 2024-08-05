import java.util.ArrayList;
class Main {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("monday");
		arr.add("tuesday");
		arr.add("wednesday");
		arr.add("thursday");
		arr.add("friday");
		System.out.println("On days" +arr);

		arr.add("saturday");
		arr.add("Sunday");
		System.out.println("OFFDays " +arr.get(5) +arr.get(6));

		arr.set(4,"saturday");
		arr.set(5,"friday");

		// 
		// for (String i : arr ) {
		// 	System.out.println(i);
			
		// }
		arr.remove(4);
		System.out.println("OFFDays: " +arr.get(5) +arr.get(6));
	}
	
}