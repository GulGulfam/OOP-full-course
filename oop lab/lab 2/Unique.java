class Unique {

	public static void unique(int[] array){

		boolean fla = true;
		for (int i = 0; i<array.length ;i++ ) {
			for (int j=0;j<array.length ;j++ ) {
				if (i!=j) {
					
					if (array[i]==array[j]) {
						fla =  false;

						
					}


					
				}

				
			}

			
		}



	}









	public static void main(String[] args) {
		int[] array = {3,7,3,17,7,5,19,0,11,2};

		unique(array);
	}
	
}