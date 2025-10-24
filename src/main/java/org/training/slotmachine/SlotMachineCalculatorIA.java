package org.training.slotmachine;

import java.util.HashMap;
import java.util.Map;

public class SlotMachineCalculatorIA {

    public enum Symbol {
        POMME(10),
        CERISE(30),
        BAR(50),
        SEPT(100);

        private final int weight;

        Symbol(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

    public static int calculateWin(Symbol[] symbols) {
        if (symbols.length != 3) {
            throw new IllegalArgumentException("Il doit y avoir exactement 3 symboles");
        }

        // Compter les occurrences de chaque symbole
        Map<Symbol, Integer> countMap = new HashMap<>();
        for (Symbol symbol : symbols) {
            countMap.put(symbol, countMap.getOrDefault(symbol, 0) + 1);
        }

        // Trouver le symbole avec le plus d'occurrences
        Symbol mostFrequent = null;
        int maxCount = 0;

        for (Map.Entry<Symbol, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        // Appliquer les règles de gain
        if (maxCount == 3) {
            // Trois symboles identiques : cube du poids
            return (int) Math.pow(mostFrequent.getWeight(), 3);
        } else if (maxCount == 2) {
            // Deux symboles identiques : 2 fois le poids
            return 2 * mostFrequent.getWeight();
        } else {
            // Tous différents : pas de gain
            return 0;
        }
    }

    // Méthode utilitaire pour créer un tirage à partir de strings
    public static int calculateWin(String[] symbolNames) {
        Symbol[] symbols = new Symbol[symbolNames.length];
        for (int i = 0; i < symbolNames.length; i++) {
            symbols[i] = Symbol.valueOf(symbolNames[i].toUpperCase());
        }
        return calculateWin(symbols);
    }
}
