class BookDescription {
	private String title,author,publisher;
	int copiesSold;

	public void setTitle(String t){
		title = t;
	}
	public void setAuthor(String a){
		author = a;
	}
	public void setPublisher(String p){
		publisher = p;
	}
	public void setCopiesSold(int c){
		copiesSold = c;
	}

	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public String getPublisher(){
		return publisher;
	}
	public int getCopiesSold(){
		return copiesSold;
	}

	public void show(){
		System.out.println(" Title =  " +getTitle());
		System.out.println("Author =   " +getAuthor());
		System.out.println("PUBLISHER =  " +getPublisher());
		System.out.println("copies sold =  " +getCopiesSold());
	}
	
}