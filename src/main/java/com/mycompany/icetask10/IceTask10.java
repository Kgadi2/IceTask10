/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask10;

/**
 *
 * @author RC_Student_lab
 */
public class IceTask10 {

    public static void main(String[] args) {
     // Create the arrays
        int[] price = {200, 350, 700, 400};
        String[] item = {"Shirt", "Pants", "Sneakers", "Jacket"};

        // 1. Calculate the sum of all elements in price
        int sum = 0;
        for (int p : price) {
            sum += p;
        }
        System.out.println("1. Sum of all prices: $" + sum);

        // 2. Calculate the average of the elements in price array
        double average = (double) sum / price.length;
        System.out.printf("2. Average price: $%.2f%n", average);

        // 3. Get the maximum and minimum price
        int max = price[0];
        int min = price[0];
        for (int i = 1; i < price.length; i++) {
            if (price[i] > max) {
                max = price[i];
            }
            if (price[i] < min) {
                min = price[i];
            }
        }
        System.out.println("3. Maximum price: $" + max);
        System.out.println("   Minimum price: $" + min);

        // 4. Get the item with the highest price
        int maxIndex = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("4. Item with the highest price: " + item[maxIndex] + " ($" + price[maxIndex] + ")");    
    }
}
