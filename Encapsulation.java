//Encapsulated class
class Book{
	private String title;
	private String author;
	private String publisher;
	private Integer price;
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getAuthor(){
		return this.author;
	}	
	
	public void getBookInfo(){
		System.out.println("Title: " + this.title + "\tAuthor: " + this.author + "\tPublisher: " + this.publisher+ "\tPrice: " + this.price);
	}
}
class Encapsulation{
	public static void main(String[] a){
		Book book = new Book();
		book.setTitle("I die on my own");
		book.setAuthor("Do you need?");	
		System.out.println("Title: " + book.getTitle());
		book.getBookInfo();
	}		
}