package by.epam.unit04.main;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        int n = 6;
        int m = 8;
        int[][] array = new int[n][m];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(10000);
            }
        }
        System.out.println("Original matrix is:");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("[%4d] ", array[i][j]);
                if (array[i][j] == 7) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("\nNumber {7} occurred in matrix " + count + " times.");
    }
}
