public class BookDescription{

	private String title;
	private String author;
	private String publisher;
	private int copiesSold;

	//setters

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


	//getters
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
	
}//class