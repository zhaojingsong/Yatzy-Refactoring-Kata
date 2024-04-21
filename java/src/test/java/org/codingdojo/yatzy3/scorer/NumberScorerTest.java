package org.codingdojo.yatzy3.scorer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberScorerTest {

    @Test
    public void calculateScore_shouldReturnSumOfNumber(){
        NumberScorer numberScorer = new NumberScorer(2);
        assertEquals(0, numberScorer.calculateScore(List.of(1,1,1,1,1)));
        assertEquals(2, numberScorer.calculateScore(List.of(2,1,1,1,1)));
        assertEquals(4, numberScorer.calculateScore(List.of(2,2,1,1,1)));
    }


}