/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderapp;

import java.util.Scanner;

/**
 *
 * @author Tamsyn
 */
public class StringBuilderApp {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(s);
        
        int vowelCount = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
           if (         (c == 'A')  ||  (c == 'a')
                    ||  (c == 'E')  ||  (c == 'e')
                    ||  (c == 'I')  ||  (c == 'i')
                    ||  (c == 'O')  ||  (c == 'o')
                    ||  (c == 'U')  ||  (c == 'u')  )
           {
               sb.setCharAt(i, '*');
           }
        }
        System.out.println();
        System.out.println(s);
        System.out.println(sb.toString());
    }
    
}
