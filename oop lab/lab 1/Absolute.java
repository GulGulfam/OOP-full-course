import java.util.Scanner;
import java.util.Arrays;
class Absolute {

	public static void absolute(int[] array){

		for (int i=0; i<array.length ;i++ ) {
			array[i] = Math.abs(array[i]);
			
		}

	}

	public static void print(int[] array){
		System.out.println(Arrays.toString(array));
	}





	public static void main(String[] args) {
		int[] array = {1,2,-6,-9};

		absolute(array);
		print(array);



	}
	
}