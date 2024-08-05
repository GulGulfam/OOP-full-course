import java.util.Arrays;
class SelectionSort {
public static void main(String[] args) {
	int[] array = {11,5,44,55,45};

	int min_index;

	for (int i = 0; i<array.length ; i++ ) {
		min_index = i;
		for (int j = i+1;j<array.length ; j++ ) {
			if(array[min_index]>array[j]){
				min_index = j;

			}
			int temp = array[i];
			array[i] = array[min_index];
			array[min_index] = temp;
			
		}
		
		
	}
	System.out.println(Arrays.toString(array));
}
																
}