package org.training.slotmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SlotMachineCalculator {

    public static int calculateResult(String p, String c, String b) {
        int win = 0;
        // find doubles element in list
        List<String> roleaux = new ArrayList<>(List.of(p , c , b));
        List<String> doubles = roleaux.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        roleaux.removeAll(doubles);
        for (String symbol : doubles) {
            win += (int) Math.pow(wigth(symbol),3 - roleaux.size());
        }
//        System.out.println(doubles);
//        if(!p.equals(c) && !c.equals(b) && !p.equals(b)) { win = 0; };
//        if(p.equals(c) ) win = 2 * wigth(p);
//        if(c.equals(b) ) win = 2 * wigth(c);
//        if(b.equals(p) ) win = 2 * wigth(b);
//        if(p.equals(c) && c.equals(b)) win = (int) Math.pow(wigth(p),3d);
        return win;
    }

    private static int wigth(String b) {
        int wigth = 0;
        switch (b){
            case "POMME" ->   wigth = 10 ;
            case "CERISE" -> wigth = 30;
            case "BAR" -> wigth = 50;
            case "7" -> wigth = 100;
        }
        return wigth;
    }
}
