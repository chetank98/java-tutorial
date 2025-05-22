package com.patterns;

import java.util.Scanner;

public class barChart {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bars : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter bar heights : ");
        for(int i = 0;i< n;i++){
            arr[i]= sc.nextInt();
        }




    }

}
