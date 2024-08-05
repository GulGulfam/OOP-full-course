class SortAray {

	public static void sortAray(int[] array){

		
		if (arrayValidate(array)) {
			int s = array.length;
		int[] temp = new int[s];
		int c =0;

			for(int i=0; i<array.length;i++){
				if (array[i]==0) {
					temp[0] = array[i];
					++c; 	
				}//if 0
			}//for 0
			for(int i=0; i<array.length;i++){
				if (array[i]==1) {
					temp[0] = array[i];
					++c; 	
				}//if 1
			}// for 1
			for(int i=0; i<array.length;i++){
				if (array[i]==2) {
					temp[0] = array[i];
					++c; 	
				}//if 2
			}//for 2
			printArray(temp);

			
		}//outer if
		else
			System.out.println("Wrong data");
	}//method

	static void printArray(int[] array){
		
		for (int i = 0; i < array.length ; ++i) {
			System.out.print(array[i] + " ");
		}//for

	}//printArray()


	public static boolean arrayValidate(int[] array){
		boolean flag = true;
		for (int i=0;i<array.length ;i++ ) {
			if (array[i]<0 || array[i]>2) {
				flag = false;
				
			}
			
		}
		return flag;
	}












	public static void main(String[] args) {
		int[] array= {2,1,0,2,1,0,2,1,0,1,2,1};

		sortAray(array);
	}
	
}