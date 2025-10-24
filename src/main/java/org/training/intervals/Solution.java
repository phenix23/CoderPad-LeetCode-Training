package org.training.intervals;

import java.util.*;
import java.util.stream.Collectors;


public class Solution {

    public static int findSmallestInterval(List<Integer> numbers){
//        List<String> names = List.of("TOTO","mimi","Sky","test","CoderPad");
//        List<String> result = names
//                .stream()
//                .filter(s -> s.length() > 3).toList();
//        List<String> result2 = names
//                .stream()
//                .filter(s -> { return s.length() > 3 ;}).toList();
//        System.out.println(" without return in filter expression : "+ result);
//        System.out.println(" with  return in filter expression : "+ result);
//
//        List<String> isBlank = List.of(""," ","Hello world");
//        for (String s : isBlank){
//            System.out.println(s.isBlank());
//        }
        //numbers.sort(Comparator.naturalOrder());
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < numbers.size() - 1; i++) {
//            min = Math.min(min, Math.abs(numbers.get(i) - numbers.get(i+1)));
//        }
//        return min;

        //
        int[] arr = numbers.stream().distinct().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                if (min == 0) break;
            }
        }
        return min;
    }


}
