package org.training.containsduplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    public void simpleTest(){
        assertTrue(solution.containsNearbyDuplicate(new int[]{1,2,3,1},3));
    }

    @Test
    public void simpleTestUC2(){
        assertTrue(solution.containsNearbyDuplicate(new int[]{1,0,1,1},1));
    }

    @Test
    public void simpleTestUC3(){
        assertFalse(solution.containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }

    @Test
    public void simpleTestUC4(){
        assertTrue(solution.containsNearbyDuplicate(new int[]{99,99},2));
    }

    @Test
    public void simpleTestUC5(){
        assertTrue(solution.containsNearbyDuplicate(new int[]{2,2},3));
    }

    @Test
    public void simpleTestUC6(){
        assertFalse(solution.containsNearbyDuplicate(new int[]{1,2,1},0));
    }

    @Test
    public void simpleTestUC7(){
        assertTrue(solution.containsNearbyDuplicate(new int[]{0,1,2,3,2,5},3));
    }

}