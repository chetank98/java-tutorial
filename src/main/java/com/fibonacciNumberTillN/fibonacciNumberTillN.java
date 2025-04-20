package com.fibonacciNumberTillN;

import java.util.Scanner;

public class fibonacciNumberTillN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int n1 =0;
        int n2 =1;

        for (int i = 1 ; i <= number ; i++){
            if (n1 > number){
                break;
            }
            System.out.println(n1);
            int fibonaci = n1 +n2 ;
            n1=n2;
            n2=fibonaci;

        }

//        if (n1 <= number){
//            System.out.println(n1);
//        }
//
//        while (n2 <= number) {
//            System.out.println(n2);
//            int fibonaci = n1 +n2 ;
//            n1=n2;
//            n2=fibonaci;
//        }

    }
}
