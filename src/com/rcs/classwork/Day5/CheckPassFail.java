package com.rcs.classwork.Day5;
import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter grade: ");
	    int grade = scanner.nextInt();
	    scanner.close();

	    if(grade >= 50) {
	        System.out.println("Pass");
        } else {
	        System.out.println("Fail");
        }
            System.out.println("Done");
    }
}
