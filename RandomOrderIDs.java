/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomorderids;

/**
 *
 * @author briankogi
 */
import java.util.Random;
public class RandomOrderIDs {
    public static void main(String[] args) {
        Random random = new Random();
        String[] orderIDs = new String[5];

        for (int i = 0; i < orderIDs.length; i++) {
            int prefixValue = random.nextInt(5) + 65; // Generates A to E (ASCII values 65 to 69).
            String prefix = Character.toString((char) prefixValue);
            String suffix = String.format("%03d", random.nextInt(1000));

            orderIDs[i] = prefix + suffix;
        }

        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }
}
