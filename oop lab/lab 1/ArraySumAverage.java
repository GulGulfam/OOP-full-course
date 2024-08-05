import java.util.Scanner;
import java.util.Arrays;
class ArraySumAverage {

	public static void fillArray(int[] array){
		Scanner sc = new Scanner(System.in);
		for (int i=0 ; i<array.length ; i++ ) {
			System.out.println("Enter index " +i);
			array[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(array));

		printSumAVG(array);
	}

	public static void printSumAVG(int[] array){
		int sum  = 0;
		for (int i=0; i<array.length ;i++ ) {
			sum += array[i];
			
		}
		int avg = sum/array.length;
		System.out.println(sum);
		System.out.println(avg);
	}







	public static void main(String[] args) {
		int size = 4;

		int[] array = new int[size];

		fillArray(array);
	}
	
}