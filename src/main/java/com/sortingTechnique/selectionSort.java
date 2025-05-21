package com.sortingTechnique;

import java.util.Scanner;

public class selectionSort {

    public static void swap(int arr[], int i,int j){

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int []arr = new int[length];

        for (int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if (arr[i]<arr[j]){
                    swap(arr,i,j);
                }
            }
        }

        for (int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
