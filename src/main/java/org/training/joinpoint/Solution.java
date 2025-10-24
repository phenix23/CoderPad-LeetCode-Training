package org.training.joinpoint;

public class Solution {

    public static int computeJoinPoint(int s1, int s2) {
        int next1 = s1 + computeSumDigit(s1);
        int next2 = s2 + computeSumDigit(s2);
        while (next1 != next2){
            if(next1 > next2){
                if(next1 == 0) return -1;
                next2 += computeSumDigit(next2);
            }else{
                if(next1 == 0) return -1;
                next1 += computeSumDigit(next1);
            }
        }
        return next1;

// Recursive solution generate error stackoverflow
//        if(next1 == next2){
//            //join point founded
//            return next1;
//        }else{
//            return computeJoinPoint(next1 , next2);
//        }
    }

    private static int computeSumDigit(int s1) {
//        Recursive solution generate error stackoverflow
//        if(s1 < 10){
//            return s1;
//        }else{
//            int rest = s1 / 10 ; // s1 = 34 , rest = 30 , rest'= 3
//            int digit = s1 % 10; //digit = 4 , digit = 3
//            return digit + computeSumDigit(rest);
//        }
        int sumDigit = 0;
        for (char digitChar : String.valueOf(s1).toCharArray()) {
            sumDigit += Character.getNumericValue(digitChar);
        }
        return sumDigit;
    }
}
