package com.patterns;

import java.util.Scanner;

public class pattern7 {

    public static void main(String[] args) {

        System.out.println("Pattern 7");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == j){
                    System.out.println("*");
                }
            }
        }

    }

}
