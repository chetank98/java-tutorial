package com.patterns;

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for(int i=0;i<=rows;i++){
            for(int j=i;j<=rows;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
