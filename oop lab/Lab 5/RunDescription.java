class RunDescription {
	public static void main(String[] args) {
		BookDescription book1 = new BookDescription();

		book1.setTitle("CHOR");
		book1.setAuthor("Bashir");
		book1.setPublisher("Maulana Bashir");
		book1.setCopiesSold(2);
		book1.show();

		BookDescription book2 =  new BookDescription();

		book2.setTitle("Chorra");
		book2.setAuthor("ALI SHB ");
		book2.setPublisher("BHAi ne ");
		book2.setCopiesSold(500);
		book2.show();

		BookDescription book3 =  new BookDescription();


		book3.setTitle("Chori");
		book3.setAuthor("Gul ");
		book3.setPublisher("KHD  ");
		book3.setCopiesSold(511);
		book3.show();
	}
	
}