package com.array;

import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int []arr = new int[length];

        for (int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }

        int number = sc.nextInt();

        int index = -1;
        for (int i=0;i<length;i++){
            if (arr[i] == number) {
                index=i;
                break;
            }
        }
        System.out.println(index);
    }

}
