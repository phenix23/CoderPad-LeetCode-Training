package org.training.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums ,int target){
        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length ; j++) {
//                if(nums[i] + nums[j] == target){
//                    result[0] = i ;
//                    result[1] = j;
//                }
//            }
//        }

        Map<Integer , Integer> temps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if(temps.containsKey(rest)){
                result[0] = temps.get(rest);
                result[1] = i;
            }else{
                temps.put(nums[i],i);
            }
        }
        return result;
    }

}
