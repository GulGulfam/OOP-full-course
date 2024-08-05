import java.io.*;
import java.util.Scanner;
class FileProductEvenOdd {

	public static void productEvenOdd(int[] array) throws Exception{
FileWriter f = new FileWriter("output-4-4.txt");
		int productEven = 1;
		int productOdd = 1;
		for (int i = 0;i<array.length ;i++ ) {

			if (array[i]%2==0) {

				productEven *= array[i];

			}	
			else{
				productOdd *= array[i];
			}
		}
		

		f.write("product of evne  =  " +productEven);
		f.write("Product of odd =  " +productOdd);
		f.close();

		


	}


	public static void main(String[] args) throws Exception {
		
		File read = new File("input-2-4.txt");
		Scanner sc = new Scanner(read);
		


		int size= 0;
		while(sc.hasNext()){
			sc.next();
			size++;
		}

		sc.close();

		int[] array = new int[size];

		Scanner s = new Scanner(read);
		int i=0;

		while(s.hasNext())
		{
			array[i] = Integer.parseInt(s.next());
			i++;
		}
		productEvenOdd(array);

	}
}
