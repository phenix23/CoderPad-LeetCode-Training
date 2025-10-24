package org.training.even;

public class Solution {
    public boolean isEven(int i , int j){
        return (Math.abs(i) + Math.abs(j)) % 2 == 0;
    }
}
