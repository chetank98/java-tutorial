package com.conditions;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();

        if (number > 90 ) {
            System.out.println("Excellent");
        }
        else if (number > 80 && number <= 90) {
            System.out.println("Good");
        }
        else if (number > 70 && number <= 80) {
            System.out.println("Fair");
        }
        else if (number > 60 && number <= 70) {
            System.out.println("Meets Exceptions");
        }
        else if (number <= 60) {
            System.out.println("Below par");
        }

    }
}
