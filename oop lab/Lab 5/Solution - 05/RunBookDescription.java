public class RunBookDescription{
	public static void main (String[] args){
		BookDescription book1 = new BookDescription();
		book1.setTitle("English");
		book1.setAuthor("Kamal");
		book1.setPublisher("ABC publishers");
		book1.setCopiesSold(50000);
		book1.display();

		BookDescription book2 = new BookDescription();
		book2.setTitle("Java");
		book2.setAuthor("Tom");
		book2.setPublisher("XYZ publishers");
		book2.setCopiesSold(100000);
		book2.display();

		BookDescription book3 = new BookDescription();
		book3.setTitle("Maths");
		book3.setAuthor("qwweee");
		book3.setPublisher("ABC publishers");
		book3.setCopiesSold(1000);
		book3.display();
		
	}//main
}//class