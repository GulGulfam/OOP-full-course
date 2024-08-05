public class ArrayReverseLab1{

	static int[] reverseArray(int[] array){

		int size = array.length;
		int[] temp = new int[size];
			
		for (int i = 0; i < size; ++i){
				temp[size - 1 - i] = array[i];
		}//for				

		return temp;

	}//reverseArray()

	static void printArray(int[] array){
	int size = array.length;

	for (int i = 0; i < size; ++i){
		System.out.println("Value of index " + i + " is: " + array[i]);
	}//for

	}//printArray()

	public static void main (String [] args){

		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		System.out.println("Original array values:");
		printArray(array);
		array = reverseArray(array);
		System.out.println("Reversed array values:");
		printArray(array);

	}//main
}//class
