package by.epam.unit04.main;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.*;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        System.out.print("Original array is: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%2d]", array[i]);
        }
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

            if (array[i] < min)
                min = array[i];
        }

        int result = max - min;

        System.out.println("\nMin number is: " + min + " and Max number is: " + max + ".");
        System.out.println("\nMin length of number axis is: " + result + ".");
    }
}
