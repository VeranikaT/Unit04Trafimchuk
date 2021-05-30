package by.epam.unit04.main;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        System.out.println("Original array is:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%2d]", array[i]);
        }
        System.out.println("\nEven numbers from array are:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.printf("[%2d]", array[i]);
            }
        }
    }
}
