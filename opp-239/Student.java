class Student {
	private String name;
	private int rollNo;
	private double percentage;

	public Student(String n){
    	name=n;

    }

    public Student(int r){
    	rollNo=r;

    }
    public Student(double per){
    	percentage=per;
    }
	 public Student(String n, int r){
    	name=n;
    	rollNo=r;
    }
    public Student(int r, String n){
    	
    	rollNo=r;
    	name=n;
    }

    public Student(String n, double per){
    	name=n;
    	percentage=per;
    }

    public Student(double per, String n){
    	percentage=per;
    	name=n;
    }

    public Student(int r, double per){
    	
    	rollNo=r;
    	percentage=per;
    }

    public Student(double per, int r){
    	
    	percentage=per;
    	rollNo=r;
    }
    public Student(String n,  double per, int r){
    	name=n;
    	percentage=per;
		rollNo=r;    	

    }
    
    public Student(double per, int r, String n){
    	percentage=per;
    	rollNo=r;
    	name=n;
    }
    public Student(int r, String n,  double per){
    	
    	rollNo=00;
    	name="XYZ";
    	percentage=0.0;
    }

    public Student(int r, double per, String n){
    	
    	rollNo=r;
    	percentage=per;
    	name=n;
    }

    public Student(String n, int r, double per){
    	name=n;
    	rollNo=r;
    	percentage=per;
    }

    public Student(double per, String n, int r){
    	percentage=per;
    	name=n;
    	rollNo=r;
    }
    public void setName(String n){
		name = n;
	}
	public void setRollNo(int r){
		rollNo = r;
	}
	public void setPercentage(double p){
		percentage = p;
	}
	 public String getName(){
	 	return name;
	 }
	 public int getRollNo(){
	 	return rollNo;
	 }
	 public double getPercentage(){
	 	return percentage;
	 }
	 public String toString()
	 {
	 	return "Name: " +this.name +"\nRoll: " +this.rollNo +"\npercentage: " +this.percentage;
	 }
	 public boolean isBetter(Student arg){
	 	return (this.percentage>arg.percentage) ;
	 }
	 public Student isBest(Student arg1,Student arg2,Student arg3,Student arg4,Student arg5,Student arg6,Student arg7,
	 Student arg8,Student arg9,Student arg10 ){
	 	if (arg1.isBetter(arg2) && arg1.isBetter(arg3) && arg1.isBetter(arg4) && arg1.isBetter(arg5) && arg1.isBetter(arg6) && arg1.isBetter(arg7)
	 		&& arg1.isBetter(arg8) && arg1.isBetter(arg9) && arg1.isBetter(arg10) ) {
	 		return arg1;
	 		
	 	}
	 	else if (arg2.isBetter(arg1) && arg2.isBetter(arg3) && arg2.isBetter(arg4) && arg2.isBetter(arg5) && arg2.isBetter(arg6) && arg2.isBetter(arg7)
	 		&& arg2.isBetter(arg8) && arg2.isBetter(arg9) && arg2.isBetter(arg10) ) {
	 		return arg2;
	 		
	 	}
	 		else if (arg3.isBetter(arg1) && arg3.isBetter(arg2) && arg3.isBetter(arg4) && arg3.isBetter(arg5) && arg3.isBetter(arg6) && arg3.isBetter(arg7)
	 		&& arg3.isBetter(arg8) && arg3.isBetter(arg9) && arg3.isBetter(arg10) ) {
	 		return arg3;
	 		
	 	}
	 		else if (arg4.isBetter(arg1) && arg4.isBetter(arg2) && arg4.isBetter(arg3) && arg4.isBetter(arg5) && arg4.isBetter(arg6) && arg4.isBetter(arg7)
	 		&& arg4.isBetter(arg8) && arg4.isBetter(arg9) && arg4.isBetter(arg10) ) {
	 		return arg4;
	 		
	 	}
	 		else if (arg5.isBetter(arg1) && arg5.isBetter(arg2) && arg5.isBetter(arg3) && arg5.isBetter(arg4) && arg5.isBetter(arg6) && arg5.isBetter(arg7)
	 		&& arg5.isBetter(arg8) && arg5.isBetter(arg9) && arg5.isBetter(arg10) ) {
	 		return arg5;
	 		
	 	}

	 		else if (arg6.isBetter(arg1) && arg6.isBetter(arg2) && arg6.isBetter(arg3) && arg6.isBetter(arg4) && arg6.isBetter(arg5) && arg6.isBetter(arg7)
	 		&& arg6.isBetter(arg8) && arg6.isBetter(arg9) && arg6.isBetter(arg10) ) {
	 		return arg6;
	 		
	 	}

	 		else if (arg7.isBetter(arg1) && arg7.isBetter(arg2) && arg7.isBetter(arg3) && arg7.isBetter(arg4) && arg7.isBetter(arg5) && arg7.isBetter(arg6)
	 		&& arg7.isBetter(arg8) && arg7.isBetter(arg9) && arg7.isBetter(arg10) ) {
	 		return arg7;
	 		
	 	}

	 		else if (arg8.isBetter(arg1) && arg8.isBetter(arg2) && arg8.isBetter(arg3) && arg8.isBetter(arg4) && arg8.isBetter(arg5) && arg8.isBetter(arg6)
	 		&& arg8.isBetter(arg7) && arg8.isBetter(arg9) && arg8.isBetter(arg10) ) {
	 		return arg8;
	 		
	 	}

	 		else if (arg9.isBetter(arg1) && arg9.isBetter(arg2) && arg9.isBetter(arg3) && arg9.isBetter(arg4) && arg9.isBetter(arg5) && arg9.isBetter(arg6)
	 		&& arg9.isBetter(arg7) && arg9.isBetter(arg8) && arg9.isBetter(arg10) ) 
	 		return arg9;
	 		
	 	else
	 		return arg10;


	 	


	 }
	 
	
}