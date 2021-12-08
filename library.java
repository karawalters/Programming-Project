/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Tream 1
//Shontina Wesley
/**
 *
 * @author 13175
 */
public class library {
    
     // Reference to refer to list of books and accounts.
    private ArrayList<Book> books;
    private ArrayList<Account> accounts;
    
    public library (){
        books = new ArrayList<Book>();
        accounts = new ArrayList<Account>();
        
    }
 
    // Constructor of this class
    public library(ArrayList<Book> books,ArrayList<Account> accounts)
    {
 
        // This keyword refers to current instance itself
        this.books = books;
        this.accounts = accounts;
        
    }
 
    // Method of this class
    // Getting the list of books
    public ArrayList<Book> getListOfBooksInLibrary()
    {
        return books;
    }
    // Getting the list of accounts
    public ArrayList<Account> getListOfAccountsInLibrary()
    {
        return accounts;
    }    
    public void readBooks(String filename)
    {
        File f = new File(filename);
        String name1,name2,available;
        int number;
        Book b;
        
        try (Scanner scan = new Scanner(f))
         {
            while (scan.hasNext())
            {  
              name1 = scan.nextLine();
              name2 = scan.nextLine();
              available = scan.nextLine();
              number = scan.nextInt();
              scan.nextLine();
              b = new Book(name1, name2, available, number);
              books.add(b);
              
            //books = scan.nextLine();
            //accounts = scan.nextLine();
            }
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }    
           
    }   
    public void readBooks(Scanner scan)
    { 
        String name1,name2,available;
        int number;
        Book b;
          if (scan.hasNext())
          {
              name1 = scan.nextLine();
              name2 = scan.nextLine();
              available = scan.nextLine();
              number = scan.nextInt();
              b = new Book(name1, name2, available, number);
              books.add(b);
          
          }
    } 
    public void writeBooks(String filename)
    {
        
        try (FileWriter f = new FileWriter(filename))
        {
            for (Book b: books)
                f.write(b.bookName + "\n" + b.authorName + "\n" + b.available + "\n" + b.volumeNumber + "\n");
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
            for (Book b: books)
                f.write(b.bookName + "\n" + b.authorName + "\n" + b.available + "\n" + b.volumeNumber + "\n");
              
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
            for (Book b: books)
                System.out.print(b.bookName + "\n" + b.authorName + "\n" + b.available + "\n" + b.volumeNumber + "\n");
              
        }
     catch (Exception e)
        {
            e.printStackTrace();
        } 
    }
    public void readAccounts(String filename)
    {
        File f = new File(filename);
        String account1,account2;
        int checkedOut,returned;
        Account a;
        
        try (Scanner scan = new Scanner(f))
         {
            while (scan.hasNext())
            {  
              account1 = scan.nextLine();
              account2 = scan.nextLine();
              checkedOut = scan.nextInt();
              returned = scan.nextInt();
              scan.nextLine();
              a = new Account(account1, account2, checkedOut, returned);
              accounts.add(a);
              
            
            }
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }    
           
    }   
    public void readAccounts(Scanner scan)
    { 
        String account1,account2;
        int checkedOut,returned;
        Account a;
          if (scan.hasNext())
          {
              account1 = scan.nextLine();
              account2 = scan.nextLine();
              checkedOut = scan.nextInt();
              returned = scan.nextInt();
              scan.nextLine();
              a = new Account(account1, account2, checkedOut, returned);
              accounts.add(a);
          
          }
    } 
    public void Accounts(String filename)
    {
        
        try (FileWriter f = new FileWriter(filename))
        {
            for (Account b: accounts)
                f.write(b.accountName + "\n" + b.accountNumber + "\n" + b.booksCheckedOut + "\n" + b.booksReturned + "\n");
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
                f.write(a.accountName + "\n" + a.accountNumber + "\n" + a.booksCheckedOut + "\n" + a.booksReturned + "\n");
              
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
                System.out.print(a.accountName + "\n" + a.accountNumber + "\n" + a.booksCheckedOut + "\n" + a.booksReturned + "\n");
              
        }
     catch (Exception e)
        {
            e.printStackTrace();
        } 
    }
} 


    

