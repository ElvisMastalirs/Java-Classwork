package com.rcs.classwork.Day6;

import java.util.Scanner;

public class Calculator {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi skaitli a: ");
        float a = scanner.nextFloat();
        System.out.print("Ievadi skaitli b: ");
        float b = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Ievadi darbību (+,-,*,/): ");
        String action = scanner.next();
        scanner.close();
        switch(action){
            case "+":
                System.out.printf("%.2f + %.2f = %.2f ",a ,b ,a + b);
                break;
            case "-":
                System.out.printf("%.2f + %.2f = %.2f ",a ,b ,a - b);
                break;
            case "*":
                System.out.printf("%.2f + %.2f = %.2f ",a ,b ,a * b);
                break;
            case "/":
                System.out.printf("%.2f + %.2f = %.2f ",a ,b ,a / b);
                break;
            default:
                System.out.println("Nepareiza darbība");
        }
    }
}
