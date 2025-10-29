package org.training.longestsubstringlengthwithtwodistinctcharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int longestSubstringLengthWithTwoDistinctCharacters(char[] input , int k){
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < input.length ; windowEnd++) {
            if(map.containsKey(input[windowEnd])) map.replace(input[windowEnd],map.get(input[windowEnd])+1);
            map.putIfAbsent(input[windowEnd],1);
            while (map.size() > k){
                map.replace(input[windowStart],map.get(input[windowStart])-1);
                if(map.get(input[windowStart]) == 0) map.remove(input[windowStart]);
                windowStart++;
            }
            maxLength = Math.max(maxLength, (windowEnd - windowStart) + 1);
        }
        return maxLength;
    }
}
