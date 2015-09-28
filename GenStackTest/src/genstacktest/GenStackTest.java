/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genstacktest;
import java.util.*;
/**
 *
 * @author Tamsyn
 */
public class GenStackTest {

    public static void main(String[] args) {
        GenStack<String> gs = new GenStack<String>();
        
        System.out.println("Pushing four items onto the stack.");
        gs.push("One");
        gs.push("Two");
        gs.push("Three");
        gs.push("Four");
        
        System.out.println("There are " + gs.size() + " Items in the stack. \n");
        
        System.out.println("The top item is: " + gs.peek() + "\n");
        
        System.out.println("There are still " + gs.size() + " items in the stack. \n");
        
        System.out.println("Popping everything:");
        while (gs.hasItems())
            System.out.println(gs.pop());
        
        System.out.println("There are now " + gs.size() + " items in the stack.\n");
        
        System.out.println("The top item is: " + gs.peek() + "\n");
    }
}
