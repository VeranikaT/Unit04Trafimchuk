package by.epam.unit04.main;

import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }
        System.out.println("Original array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%2d]", array[i]);
        }
        System.out.println("\nArray after insertion sort is:");
        for (int i = 1; i < array.length; i++) {
            int newElement = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > newElement) {
                array[j] = array[j - 1];
                --j;
            }
            array[j] = newElement;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%2d]", array[i]);
        }
    }
}
