import java.util.Scanner;
class RunViva {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Viva sd1  =  new Viva(sc.next());
		int rollNo = Integer.parseInt(sc.next());


		sd1.setRollNo(rollNo);
		System.out.println(sd1.getRollNo());
	}
	
}