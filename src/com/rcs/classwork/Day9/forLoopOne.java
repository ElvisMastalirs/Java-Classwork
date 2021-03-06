package com.rcs.classwork.Day9;

public class forLoopOne {
    public static void main(String[] args) {
        int sumNumbers = 0;
        for (int i = 1; i <= 10; i++) {
            sumNumbers += i;
            System.out.println(i);
        }
        System.out.println("Skaitļu summma ir : " + sumNumbers);
    }
}

