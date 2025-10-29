package org.training.containsduplicate;


import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0) return false;
        Map<Integer, Integer> map = new TreeMap<>();
        int windowRight = 1;
        for (int windowLeft = 0; windowLeft < nums.length ; windowLeft++) {
            map.putIfAbsent(nums[windowLeft], 1);
            while (windowRight < nums.length && (windowRight - windowLeft) <= k) {
                if (map.containsKey(nums[windowRight])) {
                    return true;
                }
                map.putIfAbsent(nums[windowRight], 1);
                windowRight++;
            }
            map.remove(nums[windowLeft]);
        }
        return false;
    }
}
