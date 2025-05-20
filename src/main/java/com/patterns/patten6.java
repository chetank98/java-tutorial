package com.patterns;

import java.util.Scanner;

public class patten6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:  ");
        int n = sc.nextInt();

        /*
        *** ***
        **   **
        *     *
        **   **
        *** ***
         */

        int star = n/2+1;
        int space = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }

            System.out.println();

            if (i<=n/2){
                star--;
                space+=2;
            }else {
                star++;
                space-=2;
            }


        }

    }

}
