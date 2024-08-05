import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

	class FileIOStringPalindrome {

		static String reverseString(String word){
			String s = ""; 
			char st = ' ';

			for (int i = word.length() - 1; i >= 0; --i){
				System.out.print(word.charAt(i));
				st = word.charAt(i);
				s=s+st;
				//s += word.charAt(i);
			}//for
			System.out.println();
			return s;

	}//displayBackwards()




		static void isPalindrome(String word ){

		String str =  reverseString(word);

		if (str==word) {
			System.out.println("YES this a palindorme ");
			
		}
		else{
			System.out.println("Not A PALINDORME ");
		}


		}




	
		public static void main(String[] args) throws Exception {
		
		File myFile = new File("input-1-4.txt");
		Scanner sc = new Scanner(myFile);

		while(sc.hasNext()){
			//System.out.println(sc.nextLine());
				isPalindrome(sc.nextLine());
		}
		//Scanner rec = new Scanner(System.in);
		//System.out.print("Enter a word which u compare for palindorme ");
		//String word  = .nextLine();

	










}	
}

