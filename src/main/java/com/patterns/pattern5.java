package com.patterns;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:  ");
        int n = sc.nextInt();

//        ss*ss
//        s***s
//        *****
//        s***s
//        ss*ss

        for(int i=1;i<=(n/2)+1;i++){
            int space;
            for(space=1;space<=(n/2)+1-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n/2;i++){
            for(int space=1;space<=i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*((n/2)-i+1)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
