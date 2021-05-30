package by.epam.unit04.main;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("The generated matrix is:");
        int n = 6;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            array[i][n - i - 1] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("[%1d]", array[i][j]);
            }
            System.out.println();
        }
    }
}
