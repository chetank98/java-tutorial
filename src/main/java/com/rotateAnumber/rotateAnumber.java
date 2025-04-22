package com.rotateAnumber;

import java.util.Scanner;

public class rotateAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Enter number of rotations: ");
        int k = sc.nextInt();

        // Count digits
        int temp = n;
        int digits = 0;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        // Normalize k
        k = k % digits;
        if (k < 0) {
            k += digits;
        }

        // Compute the divider and multiplier
        int divisor = (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, digits - k);

        int left = n / divisor;
        int right = n % divisor;

        int rotated = right * multiplier + left;

        System.out.println("Rotated number: " + rotated);
    }
}
