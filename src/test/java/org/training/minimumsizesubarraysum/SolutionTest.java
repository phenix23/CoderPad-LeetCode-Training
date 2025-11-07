package org.training.minimumsizesubarraysum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testUC1(){
        assertEquals(2  , solution.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

    @Test
    public void testUC2(){
        assertEquals(1  , solution.minSubArrayLen(4,new int[]{1,4,4}));
    }

    @Test
    public void testUC3(){
        assertEquals(0 , solution.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1}));
    }

    @Test
    public void testUC4(){
        assertEquals(3 , solution.minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }

    @Test
    public void testUC5(){
        assertEquals(5 , solution.minSubArrayLen(15,new int[]{1,2,3,4,5}));
    }

    @Test
    public void testUC6(){
        assertEquals(2 , solution.minSubArrayLen(15,new int[]{2,14}));
    }


}