package com.kevin;

import java.util.Scanner;

public class Commander {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;
        while (true) {
            System.out.print("How old are you? ");
            if (sc.hasNextInt()) break;
            sc.next();
        };
        age = sc.nextInt();

        System.out.println("You have " + age + " years old.");
    }

}
