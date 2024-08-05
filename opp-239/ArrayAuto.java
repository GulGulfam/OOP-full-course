class ArrayAuto {
			public static void setArray(int[][] array){
			for (int i=0, tb1=2; i<array.length ; i++,tb1++ ) {
				for (int j=0,count=0;j<array[0].length  ; j++, count++) {
					array[i][j] = tb1 * count;
					
				}

				
			}
		}
	public static void printArray(int[][] array){
			for (int i=0; i<array.length ; i++ ) {
				for (int j=0;j<array[0].length  ; j++) {
					System.out.print(array[i][j]);
					
				}
				System.out.println();

				
			}
		}
	public static void main(String[] args) {

		


		int[][] array = new int[4][5];

		setArray(array);
		printArray(array);

	}
	
}