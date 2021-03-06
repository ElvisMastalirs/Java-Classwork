package com.rcs.classwork.Day9;

import java.util.Scanner;

public class forLoopTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi tekstu : ");
        String text = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < text.length(); i++) {
            System.out.println(Character.toUpperCase(text.charAt(i)));
        }
    }
}
