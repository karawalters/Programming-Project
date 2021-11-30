package library;

public class Libraian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("Harry Potter", "J.K. Rowling", 1);
		Book book2 = new Book("Harry Potter", "J.K. Rowling", 2);
		Book book3 = new Book("Harry Potter", "J.K. Rowling", 3);
		Book book4 = new Book("Harry Potter", "J.K. Rowling", 4);
		Book book5 = new Book("Harry Potter", "J.K. Rowling", 5);
		Book book6 = new Book("Harry Potter", "J.K. Rowling", 6);
		Book book7 = new Book("Harry Potter", "J.K. Rowling", 7);
		
		book1.getAuthorName();
		
		book1.getAuthorName();
		
		book2.getAuthorName();
		
		book3.getAuthorName();
		
		String result4 = book4.getBookName();
		System.out.println(result4);
		
		System.out.println(book5.getBookName());
		
		System.out.println(book6.getVolumeNumber());
		
		System.out.println(book7.getVolumeNumber());
		
	}

}
