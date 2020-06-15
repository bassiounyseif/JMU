/*
 * Author: Seif Abdou
 * Date: 3/18/2019
 * Assignment: Homework 7
 * Purpose:  Test and run the Bank Account Class
 */
package HW;

public class BankAccountApp {

    public static void main(String[] args) {
        
        BankAccount seif = new BankAccount("Seif", -100);
        BankAccount jeremy = new BankAccount("Jeremy", 100);
        System.out.println(seif.accountID);
        System.out.println(jeremy.accountID);
        
        System.out.println(seif.accountOwner);
        System.out.println(jeremy.accountOwner);
        
        System.out.println(seif.accountBalance);
        System.out.println(jeremy.accountBalance);
        
        System.out.println(seif.nextID);
        System.out.println(jeremy.nextID);
        
        System.out.println(seif.getBalance());
        seif.setBalance(-100);
        
        System.out.println(jeremy.getBalance());
        jeremy.setBalance(100);
        
        
    }
    
}
