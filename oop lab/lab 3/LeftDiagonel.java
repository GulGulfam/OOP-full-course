class LeftDiagonel {

	static void getSumOfLeftDiaonel(int[][] array){

		int sum = 0;
		for (int i=0;i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				if (i==j) {
					sum += array[i][j];
					
				}
				
			}
			
		}
		System.out.println(sum);



	}






	public static void main(String[] args) {
		int[][] array = {{5 ,7 ,9 ,4 ,3},{2 ,4 ,9 ,7 ,6},{3 ,6 ,8 ,7 ,9},{1 ,9 ,7 ,5 ,6},{3 ,8 ,7 ,9 ,2}};

		getSumOfLeftDiaonel(array);
	}
	
}