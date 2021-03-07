package com.rcs.classwork.Day9;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = new Random().nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzmini ciparu par kuru es domāju ... [0 - 9]");
        int x;
        do {
            x = scanner.nextInt();
           if (x != number)
               System.out.println("Nepareizi mini vēlreiz !");
        } while (x != number);
        scanner.close();
        System.out.println("Pareizi tu uzminēji: " + x);
    }
}

