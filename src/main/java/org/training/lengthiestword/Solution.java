package org.training.lengthiestword;

public class Solution {

    public String findLengthiestWord(String inputTxt){
        String[] words = inputTxt.split("[^a-zA-Z0-9_]+");
        int maxLength = 0;
        String result = "";
        for (String word : words) {
            if (word.length() > maxLength) {
                result = word;
                maxLength = word.length();
            }
        }
        return result;
    }
}
