package com.patterns;

import java.util.Scanner;

public class pattern3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :   ");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            int j;
            for(j=i;j<rows;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}


