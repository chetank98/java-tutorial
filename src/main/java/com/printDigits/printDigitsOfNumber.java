package com.printDigits;

import java.util.Scanner;

public class printDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        //this solution print the digits in the reverse order

//        if (n == 0){
//            System.out.println(0);
//        }
//        else {
//            while (n != 0) {
//                int digit = n % 10;
//                n = n / 10;
//                System.out.println(digit);
//            }
//        }



        //this solution print the original order

        if (n==0){
            System.out.println(0);
        }

        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        while (reverse != 0) {
            int digits = reverse %10;
            System.out.println(digits);
            reverse /= 10;
        }





    }
}
