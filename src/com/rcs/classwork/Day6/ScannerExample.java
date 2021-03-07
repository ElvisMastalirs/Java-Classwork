package com.rcs.classwork.Day6;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi skaitli: ");
        if (scanner.hasNextDouble()) {
            System.out.println(scanner.nextDouble());
            x++;
        }
        scanner.nextLine();
        System.out.print("Ievadi boolean tipa vērtību: ");
        if (scanner.hasNextBoolean()) {
            System.out.println(scanner.nextBoolean());
            x++;
        }
        scanner.nextLine();
        System.out.print("Ievadi tekstu: ");
        if (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            x++;
        }
        scanner.close();
        System.out.println("Puntku skaits: " + x);

    }
}
