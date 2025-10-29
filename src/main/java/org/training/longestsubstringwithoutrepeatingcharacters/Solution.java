package org.training.longestsubstringwithoutrepeatingcharacters;

import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
//        Map<Character, List<Integer>> ref = new LinkedHashMap<>();
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            ref.putIfAbsent(chars[i], new ArrayList<>(i));
//            if (ref.containsKey(chars[i])) {
//                ref.get(chars[i]).add(i);
//            }
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        Character prec = null;
//        for (Character chr : ref.keySet()) {
//            if (prec == null) {
//                prec = chr;
//                stringBuilder.append(prec);
//            } else {
//                int i = 0;
//                int j = 0;
//                while (i < ref.get(chr).size() && j < ref.get(prec).size()) {
//                    if (ref.get(chr).get(i) - ref.get(prec).get(j) == 1) {
//                        stringBuilder.append(chr);
//                        prec = chr;
//                        break;
//                    } else{
//                        stringBuilder.deleteCharAt(0).append(chr);
//                        prec = chr;
//                    }
//                    i++;
//                    j++;
//                }
//            }
//        }
//        System.out.println(stringBuilder.toString());
//        return stringBuilder.toString().length();
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }

        return maxLength;
    }
}
