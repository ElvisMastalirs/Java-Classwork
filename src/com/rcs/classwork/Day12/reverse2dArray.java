package com.rcs.classwork.Day12;

import java.util.Random;

public class reverse2dArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(5) + 2;
        int m = rnd.nextInt(6) + 2;
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rnd.nextInt(101);
            }
        }
        for (int[] row : array) {
            for (int column : row) {
                System.out.printf("%5d", column);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int[] value = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = value;
        }
        for (int[] row : array) {
            for (int column : row) {
                System.out.printf("%5d", column);
            }
            System.out.println();
        }
    }
}


