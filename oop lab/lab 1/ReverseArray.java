import java.util.Arrays;
public class ReverseArray{

	static int[] reverseMethod(int[] array){
		int length = array.length;

		int[] temp = new int[length];
		for (int i=0; i<length ; i++ ) {
			temp[length-1-i] = array[i];
		}

		return temp;
	}


	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};

		int[] arr = reverseMethod(array);
	
		System.out.print(Arrays.toString(arr));
	}
}