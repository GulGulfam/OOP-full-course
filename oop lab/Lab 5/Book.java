import java.util.Scanner;
class Book {
	private int bookID,page;
	private double price;

	public void get(){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter book id  ");
		int b = sc.nextInt();
		System.out.println("  Enter book page  ");
		int p = sc.nextInt();
		System.out.println("Enter price of the book  ");
		double pr = sc.nextDouble();
		set(b,p,pr);
	}

	public void set(int b, int p, double pr){
		bookID=b;
		page=p;
		price=pr;
	}
	/*public void setBookID(int b){
		bookID = b;
	}
	public void setPage(int p){
		page = p;
	}
	public void setPrice(double pr){
		price = pr;
	}*/
	public int getBookID(){
		return bookID;
	}
	public int getPage(){
		return page;
	}
	public double getPrice(){
		return price;
	}
	public void show(){
		System.out.println("Book id = " +getBookID());
		System.out.println("Book page =  " +getPage());
		System.out.println("Book price =  " +getPrice());
	}
	
}