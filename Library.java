package library;

import java.io.*;

public class Library implements java.io.Serializable {
	
	String libName;
	String location;
	int libNumber;
	
	public Library(String lName, String locat, int lNum) {
		String libName = lName;
		String location = locat;
		int libNumber = lNum;
	}
	
	public void setLibName (String lName) {
		this.libName = lName;
	}
	
	public String getLibName() {
		return libName;
	}
	
	public void setLocation(String locat) {
		this.location = locat;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLibNumber(int lNum) {
		this.libNumber = lNum;
	}
	
	public int getLibNumber() {
		return libNumber;
	}
}
