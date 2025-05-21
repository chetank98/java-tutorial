package com.functions;

import java.util.Scanner;

public class digitsFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int digit = sc.nextInt();
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        int count = 0;;

        while (digit != 0  ) {

            int quotient = digit % 10;

            if (quotient == number) {
                count++;
            }

            digit = digit / 10;

        }

        System.out.println(count);

    }

}
