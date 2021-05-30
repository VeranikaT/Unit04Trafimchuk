package by.epam.unit04.main;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        int n = 10;
        int[][] mas = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(1000);
            }
        }
        System.out.println("Original matrix is:");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%3d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nDiagonal elements are:");
        for (int x = 0; x < mas.length; x++) {
            System.out.printf("[%3d]", mas[x][x]);
        }
        System.out.println();
    }
}