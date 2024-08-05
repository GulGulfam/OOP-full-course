import java.util.Arrays;
class printCommon {

	public static void printCommon(int[]array1, int[]array2){

		for (int i=0 ; i<array1.length ;i++ ) {
			for (int j=0;j<array2.length ;j++ ) {
				if (array1[i]==array2[j]) {
					System.out.println(array1[i] +",");
					
				}
				
			}
			
		}
	}






	public static void main(String[] args) {
		int[] array1 = {5,1,9,15,29,25,27,6,10};
		int[] array2 = {9,4,1,0,27,5,31,37};

		printCommon(array1,array2);
	}
	
}