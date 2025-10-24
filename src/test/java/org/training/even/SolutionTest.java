package org.training.even;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void whenNumbersArePositivesAndSumExpectedIsEven(){
        assertTrue(solution.isEven(1,5));
    }

    @Test
    public void whenNumbersArePositivesAndSumExpectedIsOdd(){
        assertFalse(solution.isEven(2,3));
    }

    @Test
    public void whenNumbersAreNegativesAndSumExpectedIsEven(){
        assertTrue(solution.isEven(-3,-1));
    }
}