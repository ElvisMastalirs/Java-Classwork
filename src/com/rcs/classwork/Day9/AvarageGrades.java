package com.rcs.classwork.Day9;

import java.util.Arrays;

public class AvarageGrades {
    public static void main(String[] args){
        int[] grades = {5, 6, 8 ,9 ,10, 7, 1, 2};
        int sum = 0;
        for(int i = 0; i < grades.length; i++){
            System.out.println(grades[i]);
            sum += grades[i];
        }
        float avarage = (float)sum / grades.length;
        System.out.printf("Avarage : %.2f", avarage);
    }
}
