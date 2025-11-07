package org.training.minimumsizesubarraysum;

import java.util.Arrays;


public class Solution {
    // minLength = 0,1, .... nums.length
    public int minSubArrayLen(int target, int[] nums) {
//        int minLength = nums.length;
//        int maxSum = Integer.MIN_VALUE;
//        Arrays.sort(nums);
//        for (int i = nums.length - 1; i > 0; i--) {
//            int j = i  ;
//            int sum = nums[i];
//            while (j > -1){
//                sum+= i == j ? 0 : nums[j] ;
//                if(sum >= target) {
//                    minLength = Math.min(minLength, Math.abs(j - i) + 1);
//                    maxSum = Math.max(maxSum, sum);
//                }
//                j--;
//            }
//        }
//        return minLength == nums.length && maxSum < target? 0 : minLength;
//    }

    int left = 0, right = 0, sumOfCurrentWindow = 0;
    int res = Integer.MAX_VALUE;

        for(right = 0; right < nums.length; right++) {
        sumOfCurrentWindow += nums[right];

            while (sumOfCurrentWindow >= target) {
                res = Math.min(res, right - left + 1);
                sumOfCurrentWindow -= nums[left++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
}
}
