/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.farenheittocelcius;

/**
 *
 * @author briankogi
 */
import java.util.Scanner;

public class FarenheitToCelcius {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        int fahrenheit = scanner.nextInt();

        double temperature = ((fahrenheit - 32) * 5.0 / 9.0);
        System.out.println("The temperature is " + temperature + " degree Celsius");

        // Using Math.round for a rounded Celsius value:
        // double temperature = ((fahrenheit - 32) * 5.0 / 9.0);
        // System.out.println("The temperature is " + Math.round(temperature) + " degree Celsius");

        scanner.close();
    }
    }