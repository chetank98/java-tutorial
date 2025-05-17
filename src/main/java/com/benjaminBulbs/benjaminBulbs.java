package com.benjaminBulbs;

import java.util.HashMap;
import java.util.Scanner;

public class benjaminBulbs {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bulbs: ");
        int n  = sc.nextInt();

        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }

//        HashMap<Integer, String> bulbs = new HashMap<>();
//        for (int i=1;i<=n;i++){
//            bulbs.put(i, "off");
//        }
//
//        for(int i=1;i<=n;i++){
//            for(int j=i;j<=n;j++){
//                if (j%i==0){
//                    if (bulbs.get(j).equals("off")) {
//                        bulbs.put(j, "on");
//                    } else {
//                        bulbs.put(j, "off");
//                    }
//                }
//            }
//        }
//
//        for (int i=1;i<=n;i++){
//            if (bulbs.get(i).equals("on")){
//                System.out.println(i);
//            }
//        }
//
    }

}
