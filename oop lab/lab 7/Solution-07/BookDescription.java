public class BookDescription{

	private String title;
	private String author;
	private String publisher;
	private int copiesSold;

	public BookDescription(){
		this.setTitle("Bal-e-Jibril");
		this.setAuthor("Dr. Allama Iqbal");
		this.setPublisher("Taj company");
		this.setCopiesSold(5000000);
	}//Default constructor()

	public BookDescription(String t, String a, String p, int c){
		this.setTitle(t);
		this.setAuthor(a);
		this.setPublisher(p);
		this.setCopiesSold(c);
	}//Overloaded constructor

	public void setTitle(String t){
		title = t;
	}//setTitle()

	public void setAuthor(String a){
		author = a;
	}//setAuthor()

	public void setPublisher(String p){
		publisher = p;
	}//setPublisher()

	public void setCopiesSold(int c){
		copiesSold = c;
	}//setCopiesSold()

	public String getTitle(){
		return title;
	}//getTitle()

	public String getAuthor(){
		return author;
	}//getAuthor()

	public String getPublisher(){
		return publisher;
	}//getPublisher()

	public int getCopiesSold(){
		return copiesSold;
	}//getCopiesSold()

	public void display(){
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Publisher: " + getPublisher());
		System.out.println("Copies sold: " + getCopiesSold());
	}//display()

	public boolean isMorePopular(BookDescription b){
		return this.getCopiesSold() > b.getCopiesSold();
	}//isMorePopular()
	
	public void copy(BookDescription b){
		b.setTitle(this.getTitle());
		b.setAuthor(this.getAuthor());
		b.setPublisher(this.getPublisher());
		b.setCopiesSold(this.getCopiesSold());
	}//copy()

	public String toString(){
		return this.getTitle() + ", " + this.getAuthor() + ", " + this.getPublisher() + ", " + this.getCopiesSold();
	}//toString()

	public boolean compare(BookDescription b){
		return this.getTitle().equals(b.getTitle()) &&
				this.getAuthor().equals(b.getAuthor()) &&
				this.getPublisher().equals(b.getPublisher()) &&
				this.getCopiesSold() == b.getCopiesSold();
	}//compare()

}//class