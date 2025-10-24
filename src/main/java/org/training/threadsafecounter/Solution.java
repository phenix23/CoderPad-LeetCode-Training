package org.training.threadsafecounter;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

//    private static int count = 0;
//
//    public static int increment(){
//        return count + 1;
//    }

    private static final AtomicInteger count = new AtomicInteger(0);

    public static int increment(){
        return count.incrementAndGet();
    }
}
