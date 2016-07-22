/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenpennies;

/**
 *
 * @author tamurphy
 */
public class TenPennies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the New Math..." + "Or, Why Java Can't Add\n");
        double penny = 0.01;    //This is a penny
        double dime = 0.10;     //This is a dime
        double tenPennies = 0;
        for (int i = 0; i < 10; i++)    //add up to 10 pennies
            tenPennies += penny;
        
        System.out.println("A dime is " + dime);
        System.out.println("Ten pennies is " + tenPennies);
        
        if (tenPennies == dime)
                System.out.println("Ten pennies is equal to a dime.");
                
        else
            System.out.println("Ten pennies is NOT equal to a dime!");
    }
    
}
