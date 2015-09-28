/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copydemo;
import java.util.Arrays;
/**
 *
 * @author Tamsyn
 */
public class CopyDemo {

    public static void main(String[] args) {
        int arrayOriginal[] = {42, 55, 21};
        int arrayNew[] = Arrays.copyOf(arrayOriginal, 3);
        printIntArray(arrayNew);
    }
    
    static void printIntArray(int arrayNew[])
    {
        for (int i : arrayNew)
        {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }
}
