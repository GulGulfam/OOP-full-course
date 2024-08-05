import java.util.Scanner;
import java.util.Arrays;

	class Swap {

		public static int[] arraySwap(int[] array){

			int size = array.length;

			int[] temp = new int[size];

			temp[size - 1] = array[0];
			for (int i =1; i<array.length ;i++ ) {
				temp[i-1]= array[i];
				
			}
			return temp;
		}






		public static void main(String[] args) {
			int[] array = {1,2,3,4,5,6,7,8,9,10};

			System.out.println(Arrays.toString(array));
	
			int[] ar = arraySwap(array);

			System.out.println(Arrays.toString(ar));

		}
		
	}