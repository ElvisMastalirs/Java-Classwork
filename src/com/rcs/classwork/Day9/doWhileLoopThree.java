package com.rcs.classwork.Day9;

import java.util.Scanner;

public class doWhileLoopThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi skaitli :");
        int number = scanner.nextInt();
        scanner.close();
        int i = 1;
        do {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
            i++;
        } while (i <= number);
    }
}

