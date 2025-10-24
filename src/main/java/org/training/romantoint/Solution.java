package org.training.romantoint;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public int romanToInt(String s) {
        int val = 0;
        Map<String, Integer> romanVal = Map.ofEntries(
                Map.entry("I", 1),
                Map.entry("V", 5),
                Map.entry("X", 10),
                Map.entry("L", 50),
                Map.entry("C", 100),
                Map.entry("D", 500),
                Map.entry("M", 1000)
//                Map.entry("CM", 900),
//                Map.entry("XC", 90),
//                Map.entry("IV", 4),
//                Map.entry("IX", 9),
//                Map.entry("XL", 40),
//                Map.entry("CD", 400)
        );
        String[] charsRomans = s.split("");
        for (int i = 0; i < charsRomans.length; i++) {
            // substraction cases
            if ((i + 1 < charsRomans.length) && List.of("CM", "XC", "IV", "IX", "XL", "CD").contains(charsRomans[i] + charsRomans[i + 1])) {
                val += romanVal.get(charsRomans[i + 1]) - romanVal.get(charsRomans[i]);
                i++;
            } else {
                val += romanVal.get(charsRomans[i]);
            }
        }
        return val;
    }
}
    /*
     * Solutions alternatives :
    // Solution 1 : Extract sub string by patterns
       List<String> regexps = List.of("(CM|XC|IV|IX|XL|CD)" ,"([IVXLCDM])");
       for (String regex : regexps){
           Pattern pattern = Pattern.compile(regex);
           Matcher matcher = pattern.matcher(s);
           while(matcher.find()){
               val += romanVal.get(matcher.group());
           }
           s = String.join("",s.split(regex));
       }

    // Solution 2 :
    int val = 0;
        Map<Character, Integer> romanVal = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000
        );
        for (int i = 0; i < s.length(); i++) {
            int current = romanVal.get(s.charAt(i));

            // Vérifier si on a une soustraction
            if (i + 1 < s.length()) {
                int next = romanVal.get(s.charAt(i + 1));
                if (current < next) {
                    val += next - current;
                    i++; // Sauter le prochain caractère
                    continue;
                }
            }
            val += current;
        }
        return val;
     */


