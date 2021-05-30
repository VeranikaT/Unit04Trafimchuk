package by.epam.unit04.main;

import java.util.Random;

public class Task08 {
    public static void main(String[] args) {
        int n = 6;
        int m = 8;
        int[][] array = new int[n][m];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(1000);
            }
        }
        System.out.println("Original matrix is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("[%3d]", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("The 3rd string of matrix is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 2) {
                    System.out.printf("[%3d]", array[i][j]);
                }
            }
        }
        System.out.println("\nThe 5th column of matrix is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 4) {
                    System.out.printf("[%3d]", array[i][j]);
                }
            }
            System.out.println();
        }
    }
}
