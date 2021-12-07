package library;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileReader;
import java.util.Scanner;


public class Book{

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
	
	public static Book addBook () {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the name of the book?");
		String bName = input.nextLine();
		
		System.out.println("What is the authors name?");
		String aName = input.nextLine();
		
		System.out.println("Is the book available? yes or no");
		String avail = input.nextLine();
		
		System.out.println("What volume of book is it?");
		int vNum = input.nextInt();
		
		return new Book(bName, aName, avail, vNum);	
	}
	
	public String toString(){	
		return "\nBook Name: " + bookName + "\nAuthor: " + authorName + 
                "\nBook Availability: " + available + "\nVolume: " + volumeNumber;
	}
}
