import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
public class StudentList{

	static boolean add(String[][] student, int counter){

		
		Scanner sc = new Scanner(System.in);

		if (counter<student.length) {
			System.out.println("Enter name  ");
			student[counter][0] = sc.nextLine();
			System.out.println("Enter roll#  ");
			student[counter][1] = sc.nextLine();
			System.out.println("Enter percentage  ");
			student[counter][2] = sc.nextLine();

				return true;
		}//if
	
		return false;

	}//method



	//  SEARCH BY NAME METHOD START HERE
 	static int searchByName(String[][] student, int counter, String key){

 		for (int i = 0; i<student.length ;i++ ) {
 	
 			if (key.compareTo(student[counter][i])==0) {
 				int result = (key.compareTo(student[counter][i]));
 					return result;
 				
 			}
 				
			
 		}
 		return -1;
 		

 	}

 	// SEARCH BY STUDENT ROLLNO

 	static int searchByRollNo(String[][] student ,int sizeCounter, String key){

 		for (int i=1; i<student.length ;i++ ) {
 			if(key==student[sizeCounter][i]){
 				return 1;

 			}//If
 		}//FOR
 		return -1;

 	}//SEARCH BY ROLL#

	//SORT BY ROLL NO START HERE

		static void sortById(String[][] students, int currentSize){
		String a , b;

		for (int i = 0; i < students.length ; i++ ) 
		{
			for (int j = i + 1 ; j < students.length; j++ )
			{
				int c = students[i][1].compareTo(students[j][1]);

				if(c > 0)
				{
					a = students[i][0];
					students[i][0] = students[j][0];
					students[j][0] = a;

					b = students[i][1];
					students[i][1] = students[j][1];
					students[j][1] = b;
				}
			}	
		}
	}


	static void sortByPercent(String[][] students, int currentSize){
		String a , b, c;

		for (int i = 0; i < students.length ; i++ )
		{
			for (int j = i + 1 ; j < students.length; j++ )
			{
				int firstValue= Integer.parseInt(students[i][2]);
				int secondValue= Integer.parseInt(students[j][2]);
				int d = compare(firstValue,secondValue);

				if(d > 0)
				{
					a = students[i][0];
					students[i][0] = students[j][0];
					students[j][0] = a;

					b = students[i][1];
					students[i][1] = students[j][1];
					students[j][1] = b;
					c = students[i][2];
					students[i][2] = students[j][2];
					students[j][2] = c;
				}
			}
		}
	}

		for(String[] t: student){
			System.out.println(Arrays.toString(t));
		}

	}




	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(	"Enter rows " );
		int row = input.nextInt();

		while(row<5 || row>10 ){
			System.out.print("Please enter between 5 to 10  ");
			row = input.nextInt();
		}//while
	

		int col = 3;
		String[][] array = new String[row][col];

		System.out.println("Enter menu between 0 to 7  ");
			int menu = input.nextInt();
		int sizeCounter = 0;

		// ADD A STUDENT
		
		if(menu==1){
	sizeCounter = 0;
				System.out.println("Before add student ");
			for (String[] temp: array ) 
			System.out.println(Arrays.toString(temp));
			//boolean flag = ;
				if (add(array, sizeCounter)) {
					sizeCounter++;
				}//if
				else
					System.out.println("Class full");
					System.out.println("After adding student ");
						for (String[] v: array ) {
							System.out.println(Arrays.toString(v));
						}//for
				}//if

		

		//SEARCH BY NAME
		else if (menu==2) {

			System.out.println("Enter name of the student of search :   ");
			String key  = input.nextLine();

			//int after2 = ;

			if (searchByName(array,sizeCounter,key)==0) {
				System.out.println(key +" found in class ");
			}//if
			else{
				System.out.println(key +" not enrolled in this class  ");
			}//else
			
		}//end of if


		//SEARCH STUDENT BY ROLL NO
		else if (menu==3) {

			System.out.println(" Enter student Roll#  ");
			String roll = input.nextLine();

			int rollNo = searchByRollNo(array,sizeCounter,roll);
			if (rollNo==1) {
				System.out.println("STUDENT FOUND AT  " +(rollNo));
			}//if	
		}//if

	else if (menu==4) {
			sortByRollNo(array,sizeCounter);
			
		}
		// SORT BY PERCENTAGE

		else if (menu==5) {
			sortByPercentage(array,sizeCounter);
			
		}

		/*System.out.println("FOR STOP PRESS 0  ");
		if(menu==0)
		System.exit(0);*/
	



		}//main
	}//class
	
		

