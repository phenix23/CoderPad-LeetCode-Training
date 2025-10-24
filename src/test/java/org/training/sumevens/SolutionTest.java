package org.training.sumevens;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void shouldReturnSum(){
        assertEquals(50 , solution.sumEvens(new int[]{1 , 4 , 6, 8, 12 , 20}));
    }

    @Test
    public void shouldReturnSumForOdds(){
        assertEquals(20, solution.sumEvens(new int[]{1,3,5,7,9,20}));
    }

    @Test
    public void shouldReturnSumForNumbersGreaterThenTwenty(){
        assertEquals(0, solution.sumEvens(new int[]{40,50,55}));
    }
}