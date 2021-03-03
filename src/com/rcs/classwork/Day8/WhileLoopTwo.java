package com.rcs.classwork.Day8;

import java.util.Scanner;

public class WhileLoopTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi tekstu : ");
        String text = scanner.nextLine();
        scanner.close();
        int i = 0;
        while(i < text.length()){
            System.out.println(Character.toUpperCase(text.charAt(i++)));
        }
    }
}
