import java.io.*;
import java.util.Scanner;
class FileSum {
	public static void main(String[] args) throws Exception {
		
		

		File myFile = new File("input-2-4.txt");
		Scanner sc = new Scanner(myFile);


		int sum = 0;
		while(sc.hasNext()){

			sum += Integer.parseInt(sc.next());
			

		}
		FileWriter f = new FileWriter("output-2-4.txt");
		f.write("sum =  " +sum);
		f.close();


	}
	
}