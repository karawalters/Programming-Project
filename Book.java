package library;

import java.io.*;

public class Book /*implements java.io.Serializable*/ {

	String bookName;
	String authorName;
	String available;
	int volumeNumber;
	
	public Book(String bName, String aName, String avail, int vNum) {
		String bookName = bName;
		String authorName = aName;
		String available = avail;
		int volumeNumber = vNum;
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
	
	public void getAuthorName() {
		//return authorName;
		System.out.println(authorName);
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
}