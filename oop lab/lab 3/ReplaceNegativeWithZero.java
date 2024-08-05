import java.util.Arrays;
class ReplaceNegativeWithZero {

	static void printArray(int[][] array){
		for (int i=0; i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				System.out.print(array[i][j] +" ");
				
			}
			System.out.println();
			
		}
	}


	static void replaceWithZero(int[][] array){

		for (int i=0; i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				if (array[i][j]<0) {
					array[i][j]=0;
					
				}
			}
		}

	}







	public static void main(String[] args) {
		int[][] array = {{-9,-5,-9}, {1,-5,3}, {-9,10,11},{19,25,-54}};


		
		replaceWithZero(array);
		printArray(array);


	}

}