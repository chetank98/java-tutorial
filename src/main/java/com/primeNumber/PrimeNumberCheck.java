package com.primeNumber;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean isPrime = true;

        if(n<=1){
            System.out.println("Prime number");
        }

        for( int i=2;i<n;i++) {
            if (n%i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime number");
        }

    }
}
