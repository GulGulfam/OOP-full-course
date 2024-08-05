class SumAverage {

	public static void printArray(int[][] array){

		for (int i=0; i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				System.out.print(array[i][j] +" ");
				
			}
			System.out.println();
			
		}
	}

	public static void sumAverage(int[][] array){

		int sum = 0;

		for (int i=0;i<array.length ;i++ ) {
			for (int j=0; j<array[i].length ;j++ ) {
				sum += array[i][j];
				
			}
			
		}

		double avg = (double) sum/ (array.length*array[0].length);
		System.out.println(sum);
		System.out.println(avg);

	}



	public static void main(String[] args) {
		int[][] array = {{14,2,1},{3,1,7},{5,2,13},{15,29,31}};

		printArray(array);
		sumAverage(array);
	}
	
}