package org.training.romantoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void simpleTest(){
        assertEquals(3 , solution.romanToInt("III"));
    }

    @Test
    public void simpleTestUC2(){
        assertEquals(58 , solution.romanToInt("LVIII"));
    }

    @Test
    public void simpleTestUC3(){
        assertEquals(1994 , solution.romanToInt("MCMXCIV"));
    }

}