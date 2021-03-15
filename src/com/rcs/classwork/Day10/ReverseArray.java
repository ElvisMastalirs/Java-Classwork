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
        for (int i = 0; i < numberArray.length / 2; i++) {
            temp = numberArray[i];
            numberArray[i] = numberArray[numberArray.length - i - 1];
            numberArray[numberArray.length - i - 1] = temp;
        }
        System.out.print(Arrays.toString(numberArray));
    }
}


