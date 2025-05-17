package com.pythagoreanTriplet;

import java.util.Scanner;

public class pythagoreanTriplet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max = Math.max(n1, Math.max(n2, n3));
        int secondMax = Math.min(Math.max(n1, n2), Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));


        if (min * min + secondMax * secondMax == max * max) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }

}
