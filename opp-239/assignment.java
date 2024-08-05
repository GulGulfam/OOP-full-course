import java.util.Scanner;
import java.io.*;
class assignment{
	public static void main(String[] args)throws IOException{

		String[][] students=new String[10][3];

		int counter=0;
			File file=new File("students.txt");
			Scanner in=new Scanner(file);
 

		Students s1= new Students();
		
		Students s2=new Students();
		Students s3=new Students();
		Students s4=new Students();
		Students s5=new Students();
		Students s6=new Students();
		Students s7=new Students();
		Students s8=new Students();
		Students s9=new Students();
		Students s10=new Students();
	

		//file.close();

		fillArray(students,counter);
  		printArray(students);
  }
		public static void fillArray(String [][] students , int counter){
			Scanner in = new Scanner(System.in);
				counter=0;
					while(counter<students.length){
						System.out.print("Enter Name: ");
						students[counter][0]=in.nextLine();
						System.out.print("Enter Roll no: ");
						students[counter][1]=in.nextLine();
						System.out.print("Enter Percentage: ");
						students[counter][2]=in.nextLine();
							
							counter++;
					}	

					

		}
		

	public static void printArray(String[][] students) throws IOException{
		PrintWriter pw = new PrintWriter("students.txt");
	  		 for (int i = 0 ; i<students.length ; i++){
        		   for (int j = 0 ; j<students[0].length ; j++){
         		  		pw.write(students[i][j]+" ");

           }

           pw.println();

	   }
	   pw.close();
	 
	   
    class Students{

    	private String name;
    	private int roll_number;
    	private double percentage;
    
    public Students(String n){
    	name=n;

    }

    public Students(int roll){
    	roll_number=roll;

    }
    public Students(double per){
    	percentage=per;
    }
    public Students(String n, int roll){
    	name=n;
    	roll_number=roll;
    }
    public Students(int roll, String n){
    	
    	roll_number=roll;
    	name=n;
    }

    public Students(String n, double per){
    	name=n;
    	percentage=per;
    }

    public Students(String n,  double per, int roll){
    	name=n;
    	percentage=per;
		roll_number=roll;    	

    }
    
    public Students(double per, int roll, String n){
    	percentage=per;
    	roll_number=roll;
    	name=n;
    }
    public Students(int roll, String n,  double per){
    	
    	roll_number=roll;
    	name="XYZ";
    	percentage=per;
    }

    public Students(int roll, double per, String n){
    	
    	roll_number=roll;
    	percentage=per;
    	name=n;
    }

    public Students(String n, int roll, double per){
    	name=n;
    	roll_number=roll;
    	percentage=per;
    }

    public Students(double per, String n, int roll){
    	percentage=per;
    	name=n;
    	roll_number=roll;
    }

    public void setName(String n){
    	name=n;
    }

    public void setRollNumber(int roll_no){
    	roll_number=roll_no;
    }

    public void setPercentage(double percen){
    	percentage=percen;
    }

    public String getName(){
    	return name;
    }

    public int setRollNumber(){
    	return roll_number;
    }

    public double setPercentage(){
    	return percentage;
    }
    }
	   



	   
}

}