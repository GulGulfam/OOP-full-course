import java.util.Scanner;
	public class calculatorNo{

		public static void operation(int x, int y, Scanner input){


		double div;
		int add,mul,sub;
			System.out.println("For addition press 1  ");
			System.out.println("For MULTIPLYING press 2   ");
			System.out.println("For division press 3  ");
			System.out.println( " For SUBTRACTING press 4 ");

			int z = input.nextInt();

			if ((z>-1) && (z<10) ) {
				if(z==1){
					  add = x + y;
					System.out.println(" Adding " +x +" and " +y +" results " +" =  "  +add);
			}

			else if (z==2) {
					 mul = x * y;
					
				System.out.println(" MULTIPLYING " +x +" with " +y +" results "  +" = " +mul);
	
			}

			else if(z==3){

				div = (double) x / y;
			System.out.println(" DIVIDING " +x +" by " +y  +" results " +" = " +div);

			}

			else if (z==4) {

					sub = x - y;
		System.out.println(" SUBTRACTING " +x +" from " +y +" results "  +" = " +sub);
				
			}
				
			
			}

			


		}



		public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		// DEACLARE VARIABLE
	
		// ASSIGN VALUE USING SCANNER

		System.out.print("Enter first number : ");
		int x = input.nextInt();
		System.out.print("Enter Second number  : ");
		int y = input.nextInt();

		operation(x,y,input);

}
}

		/*if(((x>-1)&&(x<10))&&((y>-1)&&(y<10))){


	
		
}		
		else{
		System.out.println("PLease Enter Between 0 and 9");}*/


