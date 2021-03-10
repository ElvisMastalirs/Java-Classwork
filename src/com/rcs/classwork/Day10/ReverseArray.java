package com.rcs.classwork.Day10;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numberArray = new int[10];
        Random rnd = new Random();
        int temp;
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = rnd.nextInt(31) + 20;
        }
        System.out.println(Arrays.toString(numberArray));
        for (int j = 0; j < numberArray.length / 2; j++) {
            temp = numberArray[j];
            numberArray[j] = numberArray[numberArray.length - j - 1];
            numberArray[numberArray.length - j - 1] = temp;
        }
        System.out.print(Arrays.toString(numberArray));
    }
}


