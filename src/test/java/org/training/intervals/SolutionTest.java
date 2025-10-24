package org.training.intervals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void whenInputIsSimple(){
        assertEquals(2 , Solution.findSmallestInterval(new ArrayList<>(List.of(1, 3, 9)))) ;
    }

    @Test
    public void whenInputIsNotOrderedList(){
        assertEquals(6 , Solution.findSmallestInterval(new ArrayList<>(List.of(2, 100, 8, 20)))) ;
    }

    @Test
    public void whenInputHasInverseCouple(){
        assertEquals(2 , Solution.findSmallestInterval(new ArrayList<>(List.of(15 , 98 , 22, 74, 44 , 72)))) ;
    }

    @Test
    public void whenInputHasNegativesNumbers(){
        assertEquals(2 , Solution.findSmallestInterval(new ArrayList<>(List.of(-10, -30, -12 , -66, -23)))) ;
    }

    @Test
    public void whenInputHasLargeInterval(){
        assertEquals(2 , Solution.findSmallestInterval(new ArrayList<>(List.of(1, 50, 10000, 3 , 234)))) ;
    }

    @Test
    public void whenInputHasLongLength(){
        // Generate a long list
        List<Integer> numbers = ThreadLocalRandom.current()
                .ints(99999, -10000, 10000)  // de -100000 à 100000 inclus
                .boxed().toList();

        long startTime = System.currentTimeMillis();
        int result = Solution.findSmallestInterval(numbers);
        long endTime = System.currentTimeMillis();

        assertEquals(1, result);
        assertTrue((endTime - startTime) < 1000); // Doit s'exécuter en moins d'1 seconde

    }

}