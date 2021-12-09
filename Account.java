//C211 Final Project - Team One - Matthew Stauder - December 10, 2021
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author mattstauder
 */
public class Account {
    

    //instance variables
    public static final ArrayList<Account> accounts = new ArrayList<Account>();
    public String accountName;
    public String accountNumber;
    public int booksCheckedOut;
    public int booksReturned;
    
    Account john = new Account("John Doe", "98765", 4, 3);
    Account jane = new Account("Jane Doe", "12345", 2, 4);
    Account robert = new Account("Robert Jones", "01397", 3, 3);
    Account kent = new Account("Kent Roy", "24315", 5, 1);
    Account beth = new Account("Beth Page", "65214", 5, 5);

    //Default constructor
    public Account() {
        booksCheckedOut = 0;
        booksReturned = 0;
    }

    //Non-default constructor
    public Account(String accountName, String accountNumber, int booksCheckedOut, int booksReturned) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.booksCheckedOut = booksCheckedOut;
        this.booksReturned = booksReturned;
    }

    //Set method for Account Holder name
    public void setName(String name) {
        this.accountName = accountName;
    }

    //Get method for Account Holder name
    public String getName() {
        return accountName;
    }

    //Set method for Account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Get method for Account number
    public String getAccountNumber() {
        return accountNumber;
    }

    //Set method for checked out book count
    public void setBooksCheckedOut() {
        this.booksCheckedOut = booksCheckedOut;
    }

    //Get method for checked out book count
    public int getBooksCheckedOut() {
        return booksCheckedOut;
    }

    //Set method for book return count
    public void setBooksReturned() {
        this.booksReturned = booksReturned;
    }

    //Get method for book return book
    public int getBooksReturned() {
        return booksReturned;
    }
    
    public void Account(String filename)
    {
        
        try (FileWriter f = new FileWriter(filename))
        {
            for (Account b: accounts)
                f.write(this.accountName + "\n" + this.accountNumber + "\n" + this.booksCheckedOut + "\n" + this.booksReturned + "\n");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }    
             
    }
    
    public void writeAccounts(FileWriter f)
    {
        try
        {
            for (Account a: accounts)
                f.write(this.accountName + "\n" + this.accountNumber + "\n" + this.booksCheckedOut + "\n" + this.booksReturned + "\n");
              
        }
     catch (Exception e)
        {
            e.printStackTrace();
        } 
    }
    public void writeAccounts()
    {
        try
        {
            for (Account a: accounts)
                System.out.print(this.accountName + "\n" + this.accountNumber + "\n" + this.booksCheckedOut + "\n" + this.booksReturned + "\n");
              
        }
     catch (Exception e)
        {
            e.printStackTrace();
        } 
    }
    
    //Allows user to checkout a book if they have no more than 5 books already checked out.
    public void checkoutBook(){
        if(booksCheckedOut >= 5){
            System.out.println("Please return at least one book before checking out more.");
        }
        else {
            System.out.println("Enjoy your book!");
            booksCheckedOut +=1;
            System.out.println();
        }
    }
    
    //Allows a user to return a book that is checked out.
    public void returnBook(){
        booksCheckedOut -= 1;
        booksReturned += 1;
        System.out.println();
    }
    
    //Adds a new account
    public Account addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first and last name of the account holder.");
        String name = sc.nextLine();
        System.out.println("Please enter the account number for the account.");
        String accountNumber = sc.nextLine();
        int booksCheckedOut = 0;
        int booksReturned = 0;
        System.out.println();
        return new Account(accountName, accountNumber, booksCheckedOut, booksReturned);
    }
    
    @Override
    //Prints account holder information
    public String toString(){
        return "\nName: " + accountName + "\nAccount Number: " + accountNumber + 
                "\nBooks Checked Out: " + booksCheckedOut + "\nBooks returned: " + 
                booksReturned;
    }
}
        //Adds an account to ArrayList
        
        //Account john = new Account("John Doe", "98765", 4, 3);
        //Account jane = new Account("Jane Doe", "12345", 2, 4);
        //Account robert = new Account("Robert Jones", "01397", 3, 3);
        //Account kent = new Account("Kent Roy", "24315", 5, 1);
        //Account beth = new Account("Beth Page", "65214", 5, 5);

        //for (int x = 0; x < aList.size(); x++){
            //System.out.println(aList.get(x));
        //}
        

        //System.out.println("John's Account: " + john + "\n");
        //System.out.println("Jane's Account: " + jane + "\n");
        //System.out.println("Robert's Account: " + robert + "\n");
        //System.out.println("Kent's Account: " + kent + "\n");
        //System.out.println("Beth's Account: " + beth + "\n");
