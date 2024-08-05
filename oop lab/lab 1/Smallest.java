import java.util.Arrays;
class Smallest {

	public static int smallest(int[]array){
		int smallestNum = array[0];

		for (int i=1;i<array.length ;i++ ) {
			if (array[i]<smallestNum) {
				smallestNum = array[i];
				
			}
			
		}
		return smallestNum;
	}
	public static int largest(int[]array){
		int largestNum = array[0];

		for (int i=1;i<array.length ;i++ ) {
			if (array[i]>largestNum) {
				largestNum = array[i];
				
			}
			
		}
		return largestNum;
	}



	public static void main(String[] args) {
		
		int[] array = {1,5,6,4,2,8};

		int small =  smallest(array);
		System.out.println(small);

		int large = largest(array);
		System.out.println(large);
	}
	
}