/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package genstack;
import java.util.*;
/**
 *
 * @author Tamsyn
 */
public class GenStack<E> {

    private LinkedList<E> list = new LinkedList<E>();
    
    public void push(E item)
    {
        list.addFirst(item);
    }
    
    public E pop()
    {
        return list.poll();
    }
    
    public E peek()
    {
        return list.peek();
    }
    
    public boolean hasItems()
    {
        return !list.isEmpty();
    }
    
    public int size()
    {
        return list.size();
    }

}

