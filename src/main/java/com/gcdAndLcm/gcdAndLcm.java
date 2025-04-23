package com.gcdAndLcm;

import java.util.Scanner;

public class gcdAndLcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int n1 = a;
        int n2 = b;

        while (a % b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int gcd = b;
        int lcm = (n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}
