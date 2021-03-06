package com.rcs.classwork.Day9;

public class doWhileLoopOne {
    public static void main(String[] args) {
        int i = 1;
        int sumNumbers = 0;
        do {
            System.out.println(i++);
            sumNumbers += i;
        } while (i <= 10);
        System.out.println("Skaitļu summma ir : " + sumNumbers);
    }
}

