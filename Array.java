/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;

/**
 *
 * @author briankogi
 */
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the minimum word length: ");
        int minLength = scanner.nextInt();

        String[] words = sentence.split(" ");

        System.out.println("Words with length greater than " + minLength + ":");

        for (String word : words) {
            if (word.length() > minLength) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
