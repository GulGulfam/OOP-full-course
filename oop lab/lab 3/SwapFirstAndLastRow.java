class SwapFirstAndLastRow {

	static void swapRow(int[][] array){

		for (int i = 0; i<array[0].length ;i++ ) {
			//for (int j=0; j<array[0].length ;j++ ) {
			int temp = array[0][i];
			array[0][i] = array[(array.length)-1][i];
			array[(array.length)-1][i] = temp;

			
			
		}



	}

	public static void printArray(int[][] array){

		for (int i=0; i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				System.out.print(array[i][j] +" ");
				
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		int[][] array = {{5, 7, 9 ,4 ,3 ,1},{2, 4 ,9 ,7 ,6, 5},{3, 6 ,8 ,7 ,9, 4},{1, 9 ,7 ,5, 6, 3}};

		swapRow(array);
		printArray(array);
	}
	
}