package by.epam.unit04.main;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(10);
        double[] array = new double[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }
        System.out.print("Original array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%2.1f] ", array[i]);
        }
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            }
            if (array[i] < 0) {
                negative++;
            }
            if (array[i] == 0) {
                zero++;
            }
        }
        System.out.println("\nThere are amount of positive numbers: " + positive);
        System.out.println("There are amount of negative numbers: " + negative);
        System.out.println("There are amount of zeros:" + zero);
    }
}
