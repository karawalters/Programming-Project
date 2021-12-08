/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author 13175
 */
public class testlibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       library l = new library();
       l.readBooks("books.txt");
       l.writeBooks();
       l.readAccounts("accounts.txt");
       l.writeAccounts();
       
       
    }
    
}
