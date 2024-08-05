import java.util.Arrays;
public class Value{
	static int smallestMethod(int[] array){
		int length = array.length;

		int smallest = array[0];
		for (int i = 1; i<length ; i++ ) {
			if(array[i]<smallest){
				smallest = array[i];
			}
			
		}
		return smallest;
	}

		static int largestMethod(int[] array){
		int length = array.length;

		int largest = array[0];
		for (int i = 1; i<length ; i++ ) {
			if(array[i]>largest){
				largest = array[i];
			}
			
		}
		return largest;
	}

	static int middleMethod(int[] array){
		int length = array.length;

		int midValue = 0;
		for (int i = 1; i<length ; i++ ) {
			if(length%2==1){
				midValue = array[length/2];
			
			}
			
		}
		return midValue;
	}





	public static void main(String[] args) {
		
		int[] array = {1,2,3,5,4,8,7,9};

		int small = smallestMethod(array);
		int large = largestMethod(array);
		int middle = middleMethod(array);
		System.out.print(small);
		System.out.println();
		System.out.print(large);
		System.out.println();
		System.out.print(middle);

	}
}