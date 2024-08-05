class Assignment{
	private String name;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private double score;
	private double totalPoints;
	private double totalWeight;

    public Assignment(String name, int month, int day, int hour, int minute, double score, double totalPoints, double totalWeight) {
    	this.setName(name);
    	this.setMonth(month);
    	this.setDay(day);
    	this.setHour(hour);
    	this.setMinute(minute);
    	this.setScore(score);
    	this.setTotalPoints(totalPoints);
    	this.setTotalWeight(totalWeight);
    }//8-arguments overloaded constructor

    public void setName(String name) {
        this.name = name;
    }//setName

    public void setMonth(int month) {
        this.month = month;
    }//setMonth

    public void setDay(int day) {
        this.day = day;
    }//setDay

    public void setHour(int hour) {
        this.hour = hour;
    }//setHour

    public void setMinute(int minute) {
        this.minute = minute;
    }//setMinute

    public void setScore(double score) {
        this.score = score;
    }//setScore

    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }//setTotalPoints

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }//setTotalWeight

    public String getName() {
        return this.name;
    }//getName

    public int getMonth() {
        return this.month;
    }//getMonth

    public int getDay() {
        return this.day;
    }//getDay

    public int getHour() {
        return this.hour;
    }//getHour

    public int getMinute() {
        return this.minute;
    }//getMinute

    public double getScore() {
        return this.score;
    }//getScore

    public double getTotalPoints() {
        return this.totalPoints;
    }//getTotalPoints

    public double getTotalWeight() {
        return this.totalWeight;
    }//getTotalWeight

    public String toString(){
    	return "Name: " + this.getName() + ", Month: " + this.getMonth()
    			+ ", Day: " + this.getDay()  + ", Hour: " + this.getHour()
    			 + ", Minute: " + this.getMinute()  + ", Score: " + this.getScore()
    			  + ", Total points: " + this.getTotalPoints()
    			   + ", Total weight: " + this.getTotalWeight();
    }//toString

    public static void showAssignments(Assignment[] assignments){
    	for (int i = 0; i < assignments.length; ++i ) {
    		System.out.println(assignments[i] + "\n\n");
    	}//for
    }//showAssignments

}//class