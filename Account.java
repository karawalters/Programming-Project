//C211 Final Project - Matthew Stauder
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author mattstauder
 */
public class Account {
    //instance variables
    public String name;
    public String accountNumb;
    public int bookCount;
    public int returnCount;
    
    //Default constructor
    public Account(){
        bookCount = 0;
        returnCount = 0;
    }
    
    //Non-default constructor
    public Account(String name, String accountNumb, int bookCount, int returnCount){
        this.name = name;
        this.accountNumb = accountNumb;
        this.bookCount = bookCount;
        this.returnCount = returnCount;
    }
    
    //Set method for Account Holder name
    public void setName(String name){
        this.name = name;
    }
    
    //Get method for Account Holder name
    public String getName(){
        return name;
    }
    
    //Set method for Account number
    public void setAccountNumber(String accountNumb){
        this.accountNumb = accountNumb;
    }
    
    //Get method for Account number
    public String getAccountNumber(){
        return accountNumb;
    }
    
    //Set method for checked out book count
    public void setBookCount(){
        this.bookCount = bookCount;
    }
    
    //Get method for checked out book count
    public int getBookCount(){
        return bookCount;
    }
    
    //Set method for book return count
    public void setReturnCount(){
        this.returnCount = returnCount;
    }
    
    //Get method for book return book
    public int getReturnCount(){
        return returnCount;
    }
}

//public static final ArrayList<Account> accountList = new ArrayList<Account>();
//public static Scanner scan = new Scanner(System.in);

//Add an account
//public static Account addAccount() {
//System.out.println("Please enter the first and last name of the account holder.");
//String name = scan.nextLine();
//System.out.println("Please enter the account number for the account.");
//String accountNumber = scan.nextLine();
//int bookCount = 0;
//int returnCount = 0;
//System.out.println();
//return new Account(name, address, bookCount, returnCount);

//Account john = new Account("John Doe", "98765", 4, 3);
//accountList.add(john);

//Account jane = new Account("Jane Doe", "12345", 2, 4);
//accountList.add(jane);

//Account robert = new Account("Robert Jones", "01397", 3, 3);
//accountList.add(robert);

//Account kent = new Account("Kent Roy", "24315", 5, 1);
//accountList.add(kent);

//Account beth = new Account("Beth Page", "65214", 5, 5);
//accountList.add(beth);