package org.training.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void whenInputListIsSortedArrays(){
        int[] expectedResult = new int[]{0,1};
        assertArrayEquals(expectedResult, solution.twoSum(new int[]{2,7,11,15},9));
    }

    @Test
    public void whenInputListIsNotSortedArrays(){
        int[] expectedResult = new int[]{1,2};
        assertArrayEquals(expectedResult, solution.twoSum(new int[]{3,2,4},6));
    }

    @Test
    public void whenInputListHasDoubles(){
        int[] expectedResult = new int[]{0,1};
        assertArrayEquals(expectedResult, solution.twoSum(new int[]{3,3},6));
    }

}