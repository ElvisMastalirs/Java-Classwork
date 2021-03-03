package com.rcs.classwork.Day8;

import java.util.Scanner;

public class WhileLoopThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi skaitli :");
        int number = scanner.nextInt();
        scanner.close();
        int i = 1;
        while(i <= 10){
            System.out.printf("%d * %d = %d \n", number, i, number * i);
            i++;
        }
    }
}
