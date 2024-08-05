class ali {

	 private String name,department,position;
    private int number ;
   

    // get value

    public void get(){
    	setName("M Usman");
        setNumber(21414);
        setDepartment("HR");
        setPosition("Vice President");
    }

    public void get1(){
    	setName("Abdul Hadi");
    	setNumber(21147);
    	setDepartment("IT");
    	setPosition("Programmer");
    }

    public void get2(){
    	setName("Afhsan");
    	setNumber(21698);
    	setDepartment("Manufacturing");
    	setPosition("Engineer");
    }
    // Set Values
    public void set(String n, int num, String d, String p){
    	setName(n);
    	setNumber(num);
    	setDepartment(d);
    	setPosition(p);
    }

    public void setName(String n){
    	name = n;
    }
    public void setNumber(int num){
    	number = num;
    }
    public void setDepartment(String d){
    	department = d;
    }

    public void setPosition(String p){
    	position = p;
    }

    public String getName(){
    	return name;
    }
    public int getNumber(){
    	return number;
    }
    public String getDepartment(){
    	return department;
    }

    public String getPosition(){
    	return position;
    }

    public void show(){
    	 System.out.println(name+"\t\t"+number+"\t\t"+department+"\t\t"+position);
    }

 	public void show1(){
    	 System.out.println(name+"\t"+number+"\t\t"+department+"\t\t"+position);
    }
    
    public void show2(){
    	 System.out.println(name+"\t\t"+number+"\t\t"+department+"\t"+position);
    }
}