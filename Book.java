package library;

import java.io.*;

public class Book {//implements java.io.Serializable {

	public String bookName;
	public String authorName;
	public String available;
	public int volumeNumber;
	
	public Book(String bName, String aName, String avail, int vNum) {
		this.bookName = bName;
		this.authorName = aName;
		this.available = avail;
		this.volumeNumber = vNum;
	}
	
	public void setBookName (String bName) {
		this.bookName = bName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthorName(String aName) {
		this.authorName = aName;
	}
	
	public String getAuthorName() {
		return authorName;
		//System.out.println(authorName);
	}
	
	public void setVolumeNumber(int vNum) {
		this.volumeNumber = vNum;
	}
	
	public int getVolumeNumber() {
		return volumeNumber;
	}
	
	public void setAvailable(String avail) {
		this.available = avail;
	}
	
	public String getavailable() {
		return available;
	}
	
	Book book1 = new Book("Harry Potter", "J.K. Rowling", "Yes", 1);
	Book book2 = new Book("Harry Potter", "J.K. Rowling", "No", 2);
	Book book3 = new Book("Harry Potter", "J.K. Rowling", "Yes", 3);
	Book book4 = new Book("Harry Potter", "J.K. Rowling", "Yes",  4);
	Book book5 = new Book("Harry Potter", "J.K. Rowling", "No", 5);
	Book book6 = new Book("Harry Potter", "J.K. Rowling", "Yes", 6);
	Book book7 = new Book("Harry Potter", "J.K. Rowling", "No", 7);
	
	/*public String getAll() {
		return 
	}*/
	
	
}
