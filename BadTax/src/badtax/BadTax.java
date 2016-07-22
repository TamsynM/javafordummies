/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badtax;

import java.util.*;
import java.text.*;

/**
 *
 * @author tamurphy
 */
public class BadTax {

    static Scanner sc = new Scanner(System.in);
    static NumberFormat cf = NumberFormat.getCurrencyInstance();
    
    public static void main(String[] args) 
    {
        double subTotal, salesTax, invoiceTotal;
        double taxRate = 0.05;
        
        System.out.println("Welcome to the sales tac calculator.");
               
        do
        {
            System.out.print("\nEnter subtotal: ");
            subTotal = sc.nextDouble();
            sc.nextLine();
            
            salesTax = subTotal * taxRate;
            invoiceTotal = subTotal + salesTax;
            
            System.out.print("Subtotal:   ");
            System.out.println(cf.format(subTotal));
            System.out.print("Sales Tax:   ");
            System.out.println(cf.format(salesTax));
            System.out.print("Total:   ");
            System.out.println(cf.format(invoiceTotal));
        }
        
        while (getAnother());
    }
    
    static boolean getAnother()
    {
        System.out.print("\nAgain? (Y or N) ");
        if (sc.nextLine().equalsIgnoreCase("Y"))
            return true;
        return false;
    }
    
}
