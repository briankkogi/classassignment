/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.incrementdecrement;

/**
 *
 * @author briankogi
 */
public class IncrementDecrement {
    public static void main(String[] args) {
        int value = 1;
        value = value + 1;
        System.out.println("First Increment: " + value);
        value += 1;
        System.out.println("Second Increment: " + value);
        value++;
        System.out.println("Third Increment: " + value);
        value = value - 1;
        System.out.println("First Decrement: " + value);
        value -= 1;
        System.out.println("Second Decrement: " + value);
        value--;
        System.out.println("Third Decrement: " + value);
    }
}

   
