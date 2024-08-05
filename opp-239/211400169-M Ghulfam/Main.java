import java.util.*;
//import java.util.Scanner;
import java.io.*;
class Main {

	// PrintArray
	public static void printArray(String[][] array ) throws Exception{

		FileWriter f = new FileWriter("Students.txt");
		
		System.out.println("After adding student ");
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[0].length ;j++ ) {
				f.write(array[i][j] +" ");
			}
			f.write("\n");
			
		}//for
			f.close();

					}//printArray


					static void fillArray(String[][] student){
						Scanner read = new Scanner(System.in);
						for (int counter=0; counter<student.length; counter++ ) {

							System.out.println("Enter name  ");
							student[counter][0] = read.nextLine();
							System.out.println("Enter roll#  ");
							student[counter][1] = read.nextLine();
							System.out.println("Enter percentage  ");
							student[counter][2] = read.nextLine();
						}



	}//method

	public static void main(String[] args) throws Exception {
		File file = new File("Student.txt");
		Scanner sc = new Scanner(file);
		FileWriter f = new FileWriter("Students.txt");
		String[][] array = new String[10][3];

		fillArray(array);
		printArray(array);

		
		
		Student sd1 = new Student(sc.next());
		int temp = Integer.parseInt(sc.next());
		double temp1 = Double.parseDouble(sc.nextLine());

		Student sd2 = new Student(sc.next());
		int temp2 = Integer.parseInt(sc.next());
		double temp3 = Double.parseDouble(sc.nextLine());

		Student sd3 = new Student(sc.next());
		int temp4 = Integer.parseInt(sc.next());
		double temp5 = Double.parseDouble(sc.nextLine());

		Student sd4 = new Student(sc.next());
		int temp6 = Integer.parseInt(sc.next());
		double temp7 = Double.parseDouble(sc.nextLine());

		Student sd5 = new Student(sc.next());
		int temp8 = Integer.parseInt(sc.next());
		double temp9 = Double.parseDouble(sc.nextLine());

		Student sd6 = new Student(sc.next());
		int temp10 = Integer.parseInt(sc.next());
		double temp11 = Double.parseDouble(sc.nextLine());

		Student sd7 = new Student(sc.next());
		int temp12 = Integer.parseInt(sc.next());
		double temp13 = Double.parseDouble(sc.nextLine());

		Student sd8 = new Student(sc.next());
		int temp14 = Integer.parseInt(sc.next());
		double temp15 = Double.parseDouble(sc.nextLine());

		Student sd9 = new Student(sc.next());
		int temp16 = Integer.parseInt(sc.next());
		double temp17 = Double.parseDouble(sc.nextLine());

		Student sd10 = new Student(sc.next());
		int temp18 = Integer.parseInt(sc.next());
		double temp19 = Double.parseDouble(sc.nextLine());

		sc.close();

		//Display all studetn
		System.out.println("Studetn 1 =  " +sd1);
				System.out.println("Studetn 1 =  " +sd2);
						System.out.println("Studetn 1 =  " +sd3);
								System.out.println("Studetn 1 =  " +sd4);
										System.out.println("Studetn 1 =  " +sd5);
												System.out.println("Studetn 1 =  " +sd6);
														System.out.println("Studetn 1 =  " +sd7);
																System.out.println("Studetn 1 =  " +sd8);
																		System.out.println("Studetn 1 =  " +sd9);
																				System.out.println("Studetn 1 =  " +sd10);



				sd2.setRollNo(temp2);
				sd2.setPercentage(temp3);

				sd3.setRollNo(temp4);
				sd3.setPercentage(temp5);

				sd4.setRollNo(temp6);
				sd4.setPercentage(temp7);

				sd5.setRollNo(temp8);
				sd5.setPercentage(temp9);

				sd6.setRollNo(temp10);
				sd6.setPercentage(temp11);

				sd7.setRollNo(temp12);
				sd7.setPercentage(temp13);

				sd8.setRollNo(temp14);
				sd8.setPercentage(temp15);

				sd9.setRollNo(temp16);
				sd9.setPercentage(temp17);

				sd10.setRollNo(temp18);
				sd10.setPercentage(temp19);

				Student best = new Student();
				Student p = best.isBest(sd1,sd2,sd3,sd4,sd5,sd6,sd7,sd8,sd9,sd10);
				System.out.println("Best student is " +p);




				










			}

		}