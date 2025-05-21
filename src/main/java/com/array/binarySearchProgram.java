package com.array;

import java.util.Scanner;

public class binarySearchProgram {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int number) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] < number) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.println("Enter elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int number = sc.nextInt();

        sort(arr);

        int result = binarySearch(arr, number);

        if (result == -1) {
            System.out.println("Number not found in the list.");
        } else {
            System.out.println("Number found at index: " + result);
        }
    }
}
