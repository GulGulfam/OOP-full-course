class SumAverageRows{

	static void sumAverageForRows(int[][] array){

		for (int i=0;i<array.length ;i++ ) {
			int sum = 0;
			double avg = 0.0;
			for (int j=0;j<array[0].length ;j++ ) {

				sum += array[i][j];
				avg = (double)sum/ (array[0].length);
			}
			System.out.println(sum +" for index " +i);
			System.out.println(" Aveage =  " +avg );
			
		}



	}










	public static void main(String[] args) {
		int[][] array = {{5,7,9,4,3,1},{2,4,9,7,6,5},{3 ,6, 8, 7, 9, 4},{1 ,9 ,7 ,5 ,6 ,3}};

		sumAverageForRows(array);
	}
}