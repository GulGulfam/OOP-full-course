import java.util.Scanner;
import java.util.Arrays;
class ArraySwapRows{

	static void printArray(int[][] array){
		System.out.println("Matrix before swaping");
		for (int i = 0; i<array.length  ; i++ ) {
		for(int j=0; j<array[i].length; j++){
			System.out.print(array[i][j]+"  ");
		}//inner for
		System.out.println();
	}//outer for

	swapFirstAndLastRow(array);
	}



	static void swapFirstAndLastRow(int[][] array){

		for (int i=0; i<array[0].length ;i++ ) {
			int temp = array[0][i];
			array[0][i] = array[array.length-1][i];
			array[array.length-1][i] = temp;

				
			}
			System.out.println("Matrix after swapping");

				for (int i = 0; i<array.length  ; i++ ) {
		for(int j=0; j<array[i].length; j++){
			System.out.print(array[i][j]+"  ");
		}//inner for
		System.out.println();
	}//outer for


			
			
		

	}




public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter size for rows(must be greater than 0) :  ");
	int row = sc.nextInt();

	while(row<1){
		System.out.print("Enter row must be greater than 0  :   ");
		row = sc.nextInt();
	}

	System.out.println("Enter size for column must be greater 0  :   ");
	int col = sc.nextInt();

	while(col<1){
			System.out.println("Enter size for column must be greater 0  :   ");
			col = sc.nextInt();
	}

	int[][] array = new int[row][col];

	for(int i = 0; i<array.length; i++){
		for (int j = 0; j<array[i].length; j++ ) {
			System.out.println("Enter value for " +i +" and "+j +" index");
			array[i][j] = sc.nextInt();
			
		}//inner for

		
	}//outer for

	printArray(array);

	
	
	}
}