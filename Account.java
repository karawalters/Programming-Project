//C211 Final Project - Matthew Stauder
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
    public String name;
    public String accountNumb;
    public int bookCount;
    public int returnCount;

    //Default constructor
    public Account() {
        bookCount = 0;
        returnCount = 0;
    }

    //Non-default constructor
    public Account(String name, String accountNumb, int bookCount, int returnCount) {
        this.name = name;
        this.accountNumb = accountNumb;
        this.bookCount = bookCount;
        this.returnCount = returnCount;
    }

    //Set method for Account Holder name
    public void setName(String name) {
        this.name = name;
    }

    //Get method for Account Holder name
    public String getName() {
        return name;
    }

    //Set method for Account number
    public void setAccountNumber(String accountNumb) {
        this.accountNumb = accountNumb;
    }

    //Get method for Account number
    public String getAccountNumber() {
        return accountNumb;
    }

    //Set method for checked out book count
    public void setBookCount() {
        this.bookCount = bookCount;
    }

    //Get method for checked out book count
    public int getBookCount() {
        return bookCount;
    }

    //Set method for book return count
    public void setReturnCount() {
        this.returnCount = returnCount;
    }

    //Get method for book return book
    public int getReturnCount() {
        return returnCount;
    }

    public void read(String fname) {
        File x = new File(fname);
        try (Scanner scan = new Scanner(x)) {
            name = scan.nextLine();
            accountNumb = scan.nextLine();
            bookCount = scan.nextInt();
            returnCount = scan.nextInt();
        } catch (Exception y) {
            y.printStackTrace();
        }
    }

    public void read(Scanner scan) {
        name = scan.nextLine();
        accountNumb = scan.nextLine();
        bookCount = scan.nextInt();
        returnCount = scan.nextInt();
    }
    
    public void write(String fname) {
        try (FileWriter x = new FileWriter(fname)) {
            x.write(name + "\n" + accountNumb + "\n" + bookCount + "\n" + 
                    returnCount + "\n");
        } catch (Exception y) {
            y.printStackTrace();
        }
    }
    
    public void write(FileWriter x) {
        try {
            x.write(name + "\n" + accountNumb + "\n" + bookCount + "\n" + 
                    returnCount + "\n");
        }
        catch (Exception y) {
            y.printStackTrace();
        }
    }
  
    //Adds a new account
    public static Account addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first and last name of the account holder.");
        String name = sc.nextLine();
        System.out.println("Please enter the account number for the account.");
        String accountNumber = sc.nextLine();
        int bookCount = 0;
        int returnCount = 0;
        System.out.println();
        return new Account(name, accountNumber, bookCount, returnCount);
    }
    
    @Override
    //Prints account holder information
    public String toString(){
        return "\nName: " + name + "\nAccount Number: " + accountNumb + 
                "\nBooks Checked Out: " + bookCount + "\nBooks returned: " + 
                returnCount;
    }
}

        //Account john = new Account("John Doe", "98765", 4, 3);
        //Account jane = new Account("Jane Doe", "12345", 2, 4);
        //Account robert = new Account("Robert Jones", "01397", 3, 3);
        //Account kent = new Account("Kent Roy", "24315", 5, 1);
        //Account beth = new Account("Beth Page", "65214", 5, 5);
        
        //System.out.println("John's Account: " + john + "\n");
        //System.out.println("Jane's Account: " + jane + "\n");
        //System.out.println("Robert's Account: " + robert + "\n");
        //System.out.println("Kent's Account: " + kent + "\n");
        //System.out.println("Beth's Account: " + beth + "\n");
