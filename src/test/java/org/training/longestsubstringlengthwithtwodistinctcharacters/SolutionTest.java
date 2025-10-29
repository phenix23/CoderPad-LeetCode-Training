package org.training.longestsubstringlengthwithtwodistinctcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void withSimpleInput(){
        assertEquals(5 , solution.longestSubstringLengthWithTwoDistinctCharacters(new char[]{'A','A','A','H','H','I','B','C'} , 2));
    }
}