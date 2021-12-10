//C211 Final Project - Team One - Corey Ross - December 10, 2021

package library;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileReader;
import java.util.Scanner;


public class Book{

	public static final ArrayList<Book> bList = new ArrayList<Book>();
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
	//Set method for book name.
	public void setBookName (String bName) {
		this.bookName = bName;
	}
	//Get method for book name.
	public String getBookName() {
		return bookName;
	}
	//Set method for Author Name.
	public void setAuthorName(String aName) {
		this.authorName = aName;
	}
	//Get method for Author Name. 
	public String getAuthorName() {
		return authorName;
		//System.out.println(authorName);
	}
	//Set method for volume number.
	public void setVolumeNumber(int vNum) {
		this.volumeNumber = vNum;
	}
	//Get method for volume number.
	public int getVolumeNumber() {
		return volumeNumber;
	}
	//Set method for availability.
	public void setAvailable(String avail) {
		this.available = avail;
	}
	//Get method for availability. 
	public String getavailable() {
		return available;
	}
	//Adds a book.
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
	
	public void Book(String filename)
    { 
        try (FileWriter f = new FileWriter(filename))
        {
            for (Book b: bList)
                f.write(this.bookName + "\n" + this.authorName + "\n" + this.available + "\n" + this.volumeNumber + "\n");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }            
    } 
    public void writeBooks(FileWriter f)
    {
        try
        {
            for (Book a: bList)
                f.write(this.bookName + "\n" + this.authorName + "\n" + this.available + "\n" + this.volumeNumber + "\n");      
        }
     catch (Exception e)
        {
            e.printStackTrace();
        } 
    }
    public void writeBooks()
    {
        try
        {
            for (Book a: bList)
                System.out.print(this.bookName + "\n" + this.authorName + "\n" + this.available + "\n" + this.volumeNumber + "\n");      
        }
     catch (Exception e)
        {
            e.printStackTrace();
        } 
    }
	public String toString(){	
		return "\nBook Name: " + bookName + "\nAuthor: " + authorName + 
                "\nBook Availability: " + available + "\nVolume: " + volumeNumber;
	}
}
