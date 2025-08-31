package com.array;

import java.util.Scanner;

public class sumOfTwoArray {

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
        int sum[] = new int[max];

        int i = n1-1, j = n2-1, k = max-1, carry = 0;

        while (k >= 0) {
            int d = carry;

            if (i >= 0){
                d += arr1[i];
            }

            if (j >= 0){
                d += arr2[j];
            }

            carry = d /10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }
        if (carry != 0){
            System.out.println(carry);
        }

        for (int val:sum){
            System.out.println(val);
        }
    }

}
