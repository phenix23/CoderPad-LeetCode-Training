package org.training.slotmachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void whenSymbolsAreDiffrent(){
        assertEquals(0 , SlotMachineCalculatorIA.calculateWin(new String[]{"POMME","CERISE","BAR"}));
    }

    @Test
    public void whenWeHaveTwoSymbolsEqualsUC1(){
        assertEquals(20, SlotMachineCalculatorIA.calculateWin(new String[]{"POMME","POMME","BAR"}));
    }

    @Test
    public void whenWeHaveTwoSymbolsEqualsUC2(){
        assertEquals(100, SlotMachineCalculatorIA.calculateWin(new String[]{"POMME","BAR","BAR"}));
    }

    @Test
    public void whenWeHaveTwoSymbolsEqualsUC3(){
        assertEquals(60, SlotMachineCalculatorIA.calculateWin(new String[]{"CERISE","BAR","CERISE"}));
    }

    @Test
    public void whenWeHaveThreeSymbolsEquals(){
        assertEquals(1000, SlotMachineCalculatorIA.calculateWin(new String[]{"POMME","POMME","POMME"}));
    }

    @Test
    public void whenWeHaveThreeSymbolsEqualsUC2(){
        assertEquals(1000000, SlotMachineCalculatorIA.calculateWin(new String[]{"SEPT","SEPT","SEPT"}));
    }

    @Test
    public void whenWeHaveThreeSymbolsEqualsUC3(){
        assertEquals(125000, SlotMachineCalculatorIA.calculateWin(new String[]{"BAR","BAR","BAR"}));
    }

}