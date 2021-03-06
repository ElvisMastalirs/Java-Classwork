package com.rcs.classwork.Day9;

import java.util.Scanner;

public class doWhileLoopTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi tekstu : ");
        String text = scanner.nextLine();
        scanner.close();
        int i = 0;
        do {
            System.out.println(Character.toUpperCase(text.charAt(i++)));
        } while (i < text.length());
    }
}
