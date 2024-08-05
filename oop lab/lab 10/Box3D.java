class Box3D {
	private double length;
	private double width;
	private double height;
	private String color;

	/******************************* Constructor **************************/

	public Box3D(){
		setLength(2.0);
		setWidth(3.2);
		setHeigth(4.3);
		setColor("Green");
	}

	public Box3D(double length, double width, double height , String color){
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public Box3D(Box3D b){
		setLength(b.getLength());
		setWidth(b.getWidth());
		setHeigth(b.getHeight());
		setColor(b.getColor());
	}

	/************** SETTER ***************/
	public void setLength(double length){
		this.length = length;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public void setHeigth(double height){
		this.height = height;
	}
	public void setColor(String color){
		this.color = color;
	}

	/********* GETTER *******/
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public String getColor(){
		return color;
	}

	/*************** PRINT ******************/
	public void print(){
		System.out.println("Length = " +getLength());
		System.out.println("Width = " +getWidth());
		System.out.println("Height = "+getHeight());
		System.out.println("Color = " +getColor());
	}

	public static void print(Box3D[] b){
		for (int i=0; i<b.length ; i++ ) {
			b[i].print();
			System.out.println();
			
		}
	}

	/************************ isEqual ***********************/
	public boolean isEqual(Box3D b){
		return (this.length == b.length && this.width == b.width && this.height == b.height && this.color.equals(b.color)); 
	}

	public double area(){
		
		return height * width * length;
	}

	public static void sort(Box3D[] b){
		for(int i = 0; i < b.length-1; i++){
			int minIndex = getMinIndex(b,i);
			Box3D temp = b[i];
			b[i] = b[minIndex];
			b[minIndex] = temp;
		}
	}
	public static int getMinIndex(Box3D[] b, int start){
		int minIndex = start;
		Box3D min = b[start];
		for(int i = start; i < b.length; i++){
			if (b[i].getColor().compareTo(min.getColor())<0) {
				min=b[i];
				minIndex=i;
			}
		}
		
		return minIndex;
	}
	
	public static int linearSearch(Box3D[] b, double key){
		for (int i = 0; i < b.length; ++i) {
			if(b[i].area() == key){
				return i;
            }//if
        }//for
        return -1;
    }//linearSearch()

    public static int binarySearch(Box3D[] b, String key){

    	int low = 0, high = b.length-1, mid;
    	while(low <= high){
    		mid = (low+high)/2;
    		if((b[mid].getColor().compareTo(key))<0)
    			return mid;
    		else if(b[mid].getColor().compareTo(key)>0)
    			high = --mid;
    		else 
    			low = ++mid;
		} //while
		return -1;
	}//binarySearch
	














}

