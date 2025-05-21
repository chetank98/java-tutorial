package com.array;

import java.util.Scanner;

public class spanOfArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        int difference = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }

        difference = max - min;
        System.out.println(difference);


    }

}
