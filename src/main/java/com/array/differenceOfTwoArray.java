package com.array;

import java.util.Scanner;

public class differenceOfTwoArray {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the length of array1 : ");
        int n1 = sc.nextInt();
        System.out.print("enter the length of array2 : ");
        int n2 = sc.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        System.out.print("enter the array 1 number : ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.print("enter the array 2 number : ");
        for (int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        sc.close();

        int max = Math.max(n1,n2);
        int diff[] = new int[max];

    }

}
