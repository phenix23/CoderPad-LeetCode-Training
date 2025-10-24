package org.training.findtemperature;

import java.util.List;

public class Solution {

    /**
     * @param ts the temperatures measured by the captor.
     * @return the temperature closest to zero.
     */
    public static double closestToZero(List<Double> ts) {

        if(ts.isEmpty() || ts.contains(0d)) return 0d;
        Double min = null;
        for (Double double1 : ts) {
            if (min == null){
                min = Math.min(Double.MAX_VALUE,double1);
            }else{
                if (double1 > 0){
                    min = Math.min(min,double1);
                }else{
                    min = Math.max(min, double1) ;
                }
            }
        }
        return min;
    }
}
