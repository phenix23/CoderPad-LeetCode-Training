package org.training.joinpoint;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void whenSimpleInputs(){
        assertEquals(519 , Solution.computeJoinPoint(471, 480));
    }

    @Test
    public void whenFirstInputIsLowestThanSecond(){
        assertEquals(111 , Solution.computeJoinPoint(57, 78));
    }

    @Test
    public void whenFirstInputIsGreatestThanSecond(){
        assertEquals(620 , Solution.computeJoinPoint(11, 7));
    }


}