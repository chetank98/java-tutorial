package com.reverseNumber;

import java.util.Scanner;

public class reverseAnumber {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number :");
        int n =  sc.nextInt();

        int reverse = 0;
        int temp = n;
        while (temp != 0){
            int digits = temp % 10;
            reverse = reverse * 10 + digits;
            temp /= 10;
        }
        System.out.println(reverse);

    }
}
