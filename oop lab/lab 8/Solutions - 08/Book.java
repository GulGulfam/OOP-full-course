import java.util.Scanner;

public class Book{
	private int bookId;
	private int pages;
	private double price;

	public Book(){
		this.setBookId(0);
		this.setPages(0);
		this.setPrice(0.0);
	}//Book()

	public Book(int id){
		this.setBookId(id);
	}//Book()

	public Book (int id, int pages){
		this.setBookId(id);
		this.setPages(pages);
	}//Book()

	public Book (int pages, double price){
		this.setPages(pages);
		this.setPrice(price);
	}//Book()	

	public Book (int id, int pages, double price){
		this.setBookId(id);
		this.setPages(pages);
		this.setPrice(price);
	}//Book()	

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

	public void display(){
		
		System.out.println("BookID = " + getBookId());
		System.out.println("pages = " + getPages());
		System.out.println("price = " + getPrice());

	}//display()

	public boolean isLarger(Book b){
		return this.getPages() > b.getPages();
	}//isLarger()

	public boolean isExpensive(Book b){
		return (this.getPrice() - b.getPrice()) > 0.000001;
	}//isExpensive()

	public void copy(Book b){
		b.setBookId(this.getBookId());
		b.setPages(this.getPages());
		b.setPrice(this.getPrice());
	}//copy()

	public String toString(){
		return this.getBookId() + ", " + this.getPages() + ", " + this.getPrice();
	}//toString()

	public boolean isEqual(Book b){
		return this.getBookId() == b.getBookId() &&
				this.getPages() == b.getPages() &&
				this.getPrice() == b.getPrice();
	}//isEqual()

	public Book create(Book b){
		return new Book(this.getBookId() + b.getBookId(),
							this.getPages() + b.getPages(),
							this.getPrice() + b.getPrice());
	}//create()

}//class