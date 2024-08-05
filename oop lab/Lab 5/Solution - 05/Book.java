import java.util.Scanner;

public class Book{
	private int bookId;
	private int pages;
	private double price;

	public void get(){

		Scanner read = new Scanner(System.in);
		System.out.println("Enter the id of the book: ");
		int id = read.nextInt();
		System.out.println("Enter the pages of the book: ");
		int p = read.nextInt();
		System.out.println("Enter the price of the book: ");
		double pr = read.nextDouble();
		set(id, p, pr);

	}//get()

	public void set(int b, int p, double pr){
		
		setBookId(b);
		setPages(p);
		setPrice(pr);

	}//set()

	public void setBookId(int id){
		bookId = id;
	}//setBookId()

	public void setPages(int p){
		pages = p;
	}//setPages()

	public void setPrice(double pr){
		price = pr;
	}//setPrice()

	public int getBookId(){
		return bookId;
	}//getBookId()

	public int getPages(){
		return pages;
	}//getPages()

	public double getPrice(){
		return price;
	}//getPrice()

	public void show(){
		
		System.out.println("BookID = " + getBookId());
		System.out.println("pages = " + getPages());
		System.out.println("price = " + getPrice());

	}//show()

}//class