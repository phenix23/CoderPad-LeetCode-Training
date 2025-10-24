package org.training.boundingrectangle;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void shouldReturnNotEmpty(){
        assertEquals(List.of(2, 39, 99 , 91),solution.boundingRectangle(List.of(List.of(101,39),List.of(2,88),List.of(83,130))));
    }

    @Test
    public void shouldReturnNotEmptyWhenSquareUnit(){
        assertEquals(List.of(0, 0 , 1 , 1),solution.boundingRectangle(List.of(List.of(0,0),List.of(1,1))));
    }

    @Test
    public void shouldReturnNotEmptyWhenCoordinatesNegatives(){
        assertEquals(List.of(-5, -8 , 4 , 1),solution.boundingRectangle(List.of(List.of(-1,-7),List.of(-5,-8))));
    }

    @Test
    public void shouldReturnNotEmptyWhenSquarePonctuale(){
        assertEquals(List.of(2, 4 , 2 , 1),solution.boundingRectangle(List.of(List.of(2,4),List.of(4,5))));
    }

    @Test
    public void shouldReturnNotEmptyWhenManyCoordinates(){
        assertEquals(List.of(-14, -22 , 38 , 39),solution.boundingRectangle(
                List.of(
                        List.of(-7, 15),
                        List.of(24, -3),
                        List.of(-12, 8),
                        List.of(5, -19),
                        List.of(-2, 11),
                        List.of(9, -6),
                        List.of(-14, 7),
                        List.of(3, -22),
                        List.of(-8, 17),
                        List.of(13, -5)
                )));
    }
}