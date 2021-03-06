package com.rcs.classwork.Day9;

import java.util.Scanner;

public class forLoopThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi skaitli :");
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
    }
}
