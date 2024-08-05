import java.io.*;
import java.util.Scanner;
class FabSerie {


	static boolean fabSeries(int[] array){
		boolean res = true;
		if(!(array[0]==0 && array[1]==1)){
			return false;
		}

			if(res){
				for (int i=2; i<array.length ; i++ ) {
					if (array[i-1] + array[i-2]!=array[i]) {
						return false;
						
					}//inner if
					
				}//for

			}//outer if
			return res;

	}//method

	public static void main(String[] args)throws Exception {
		
		File file = new File("input-1-4.txt");
		Scanner sc = new Scanner(file);
		FileWriter f = new FileWriter("output-1-4.txt");

		int size = Integer.parseInt(sc.next());

		int[] array = new int[size];

		int i = 0 ;

		while(sc.hasNext()){
			array[i] = Integer.parseInt(sc.next());

			i++;
	}//while

	if(fabSeries(array)){
		f.write("Fabo serires");
	}//if
	else{
		f.write("Not a fabo series ");
	}//else
	f.close();
}//main
	
}//class