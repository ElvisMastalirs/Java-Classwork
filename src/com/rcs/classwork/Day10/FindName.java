package com.rcs.classwork.Day10;

import java.util.Scanner;

public class FindName {
    public static void main(String[] args){
        String[] names = { "Kristaps", "Kristīne", "Līga",
                "Matīss", "Martiņš", "Jānis",
                "Ilze", "Sanita", "Sandijs" };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Meklēt: ");
        String searchby = scanner.next();
        scanner.close();
        for(int i = 0; i < names.length;i++ ){
            if(names[i].toLowerCase().startsWith(searchby.toLowerCase())) {
                System.out.println(names[i]);
            }
        }
    }
}

        // enchached for Loop
        /* for(String name : names) {
        if(name.toLowerCase().startsWith(searchby.toLowerCase())) {
        System.out.println(names[i]);
        }
        }
         */

