import java.util.Arrays;
public class SwapValues{

	static void printMethod(int[] array){
		int length = array.length;

		for (int i=0; i<length ; i++ ) {

			System.out.print(array[i]+"\t");
			
		}
	}

	static int[] swapMethod(int[] array){

		int length = array.length;

		int[] temp = new int[length];
		temp[length-1] = array[0];

		for(int i=1; i<length; i++){
			temp[i-1] = array[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};

		printMethod(array);
		int[] arr = swapMethod(array);
		System.out.println();
	System.out.print(Arrays.toString(arr));
	}
}