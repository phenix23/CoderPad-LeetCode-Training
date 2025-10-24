package org.training.boundingrectangle;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> boundingRectangle(List<List<Integer>> coordinatesPointes){
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY= Integer.MIN_VALUE;
        for (List<Integer> coordinatesPointe : coordinatesPointes){
           minX =  Math.min(minX,coordinatesPointe.getFirst());
           maxX =  Math.max(maxX,coordinatesPointe.getFirst());
           minY =  Math.min(minY,coordinatesPointe.getLast());
           maxY =  Math.max(maxY,coordinatesPointe.getLast());
        }
        return Arrays.asList(minX,minY,maxX-minX,maxY-minY);
    }
}
