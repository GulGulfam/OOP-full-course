class IdentifyMatrix {

	public static boolean identifyMatrix(int[][] array){

		boolean flag = true;

		if (array.length != array[0].length) {
			flag = false;
			
		}
		else{
			for (int i=0;i<array.length ;i++ ) {
				for (int j = 0; j<array[0].length ;j++ ) {
					
					if (i==j) {

						if (array[i][j]!= 1) {
							flag = false;

						}//inner if
					}//outer if
					else{
						if (array[i][j] != 0) {
							flag = false;
							
							}//if
						}//else
						
				}//inner for
				
			}//outer for
		}//outer else

		return flag;
	}//method










	public static void main(String[] args) {
		int[][] array = {{1 ,0 ,0 ,0 ,0},{0 ,1 ,0 ,0 ,0},{0 ,0 ,1 ,0 ,0},{0 ,0, 0, 1 ,0},{0 ,0 ,0 ,0 ,1}};

		
		System.out.println(identifyMatrix(array));
	}
	
}