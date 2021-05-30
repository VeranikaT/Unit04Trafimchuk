package by.epam.unit04.main;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("The generated matrix is:");
        int n = 6;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[0][i] = 1;
                array[i][0] = 1;
                array[i][n - 1] = 1;
                array[n - 1][i] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("[%1d]", array[i][j]);
            }
            System.out.println();
        }
    }
}