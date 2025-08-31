package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LamdaAndStreams {

    public static void main(String[] args) {
        System.out.print("Hello Lambda And Streams \n");

        List<Integer> list = Arrays.asList(84,12, 54,95, 43, 69, 23);

        int secondHighest = list.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                skip(1).
                findFirst().orElse(-1);

        System.out.println(secondHighest);


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        long count = numbers.stream().filter(num -> num %2 == 0).count();
        System.out.println(count);


//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"

        String[] str = new String[]{"flower","flow","flight"};

        String res =  Arrays.stream(str).reduce((s1,s2) -> {
            int i = 0;
            while (i < s1.length() && i < s2.length() &&s1.charAt(i) == s2.charAt(i)) {
                i++;
            }
            return s1.substring(0,i);
        })
        .orElse("");
        System.out.println(res);


        List<Integer> numbers2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int i = numbers2.stream().reduce((x, y) -> x + y).get();
        System.out.println(i);


    }

}
