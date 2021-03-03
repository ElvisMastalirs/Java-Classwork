package com.rcs.classwork.Day8;

public class WhileLoopOne {
    public static void main(String[] args) {
        int i = 1;
        int sumNumbers = 0;
        while (i <= 10) {
            System.out.println(i++);
            sumNumbers += i;
        }
        System.out.println("Skaitļu summma ir : " + sumNumbers);
    }
}
