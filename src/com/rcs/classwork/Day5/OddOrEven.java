package com.rcs.classwork.Day5;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ieraksti skaitli: ");
        int number = scanner.nextInt();
        scanner.close();

        if(number % 2 == 0){
            System.out.println("Skaitlis ko ievadīji ir pāra skaitlis");
        } else {
            System.out.println("Skaitlis ko ievadīji ir nepāra skaitlis");
        }


    }
}
