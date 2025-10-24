package org.training.threadsafecounter;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void shouldReturnCorrectValue() throws ExecutionException, InterruptedException {
        Callable<Integer> task = Solution::increment;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> counterTask = null;
        for (int i = 0; i < 10; i++) {
            counterTask = executorService.submit(task);
        }
        assertEquals(10, counterTask.get());
    }

}