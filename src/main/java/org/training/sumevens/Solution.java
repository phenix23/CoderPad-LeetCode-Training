package org.training.sumevens;

public class Solution {

    public int sumEvens(int[] numbers){
        int sum = 0;
        for (int number : numbers){
            if(number <= 20  && number % 2 == 0){
                sum += number;
            }
        }
        return sum;
    }
}
