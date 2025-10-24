package org.training.findtemperature;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void whenInputDataIsSimple(){
        assertEquals(2.4 , Solution.closestToZero(List.of(7.2 , 2.4, 9.6 , -5.7, 4d)));
    }

    @Test
    public void whenInputDataHasTwoValueClosestToZeroOneNegativeThenPositive(){
        assertEquals(7.1 , Solution.closestToZero(List.of(15d , -7.1, 9.2, 14.3, 7.1 , 12.9)));
    }

    @Test
    public void whenInputDataHasTwoValueClosestToZeroOnePositiveThanNegative(){
        assertEquals(7.1 , Solution.closestToZero(List.of(15d , 7.1, 9.2, 14.3, -7.1 , 12.9)));
    }

    @Test
    public void whenInputDataHasOnlyMaxValue(){
        assertEquals(5526 , Solution.closestToZero(List.of(5526d)));
    }

    @Test
    public void whenInputDataHasOnlyMinValue(){
        assertEquals(-273d, Solution.closestToZero(List.of(-273d)));
    }

    @Test
    public void whenInputDataHasOnlyNegativesValues(){
        assertEquals(-9.6 , Solution.closestToZero(List.of(-15.8,-50.7,-9.6, -14.5, -9.7)));
    }

    @Test
    public void whenInputDataHasTwiceSameValueNegative(){
        assertEquals(-10 , Solution.closestToZero(List.of(-10d,-10d)));
    }

    @Test
    public void whenInputDataHasZeroInEnd(){
        assertEquals(0d , Solution.closestToZero(List.of(10.5 , 10.5 , 20.1 , -20.1 , 0d)));
    }

    @Test
    public void whenInputDataIsEmpty(){
        assertEquals(0d, Solution.closestToZero(List.of()));
    }

}