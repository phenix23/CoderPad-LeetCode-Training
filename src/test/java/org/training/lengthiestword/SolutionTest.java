package org.training.lengthiestword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void shouldReturnString(){
        String expected = "Hello";
        assertEquals(expected , solution.findLengthiestWord("Hello There"));
    }

    @Test
    public void whenInputStringWithWordsHaveSameLength(){
        String expected = "How";
        assertEquals(expected , solution.findLengthiestWord("How are you"));
    }

    @Test
    public void whenInputStringHasSpecialChars(){
        String expected = "frolic";
        assertEquals(expected , solution.findLengthiestWord("Come have lots of fun!! and frolic&! gamers"));
    }

    @Test
    public void whenInputStringHasOneSpecialChar(){
        String expected = "everything";
        assertEquals(expected , solution.findLengthiestWord("Hello there, hope everything's is good"));
    }
}