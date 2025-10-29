package org.training.longestsubstringwithoutrepeatingcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void whenWeHaveSimpleInput(){
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void whenWeHaveOneRepeatedChar(){
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void whenWeHaveSubsquence(){
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void whenWeHaveSubsquenceUC2(){
        assertEquals(3, solution.lengthOfLongestSubstring("bwf"));
    }


}