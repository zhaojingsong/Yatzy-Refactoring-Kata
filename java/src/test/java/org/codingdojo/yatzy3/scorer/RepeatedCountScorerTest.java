package org.codingdojo.yatzy3.scorer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedCountScorerTest {

    @Test
    public void calculateScore_shouldReturnRepeatedCount(){
        RepeatedCountScorer repeatedCountScorerFor_6= new RepeatedCountScorer(5);
        assertEquals(0, repeatedCountScorerFor_6.calculateScore(List.of(2,2,2,2,1)));
        assertEquals(10, repeatedCountScorerFor_6.calculateScore(List.of(2,2,2,2,2)));


        RepeatedCountScorer repeatedCountScorerFor_1= new RepeatedCountScorer(1);
        assertEquals(1, repeatedCountScorerFor_1.calculateScore(List.of(1,1,1,1,1)));
        assertEquals(2, repeatedCountScorerFor_1.calculateScore(List.of(2,1,1,1,1)));
        assertEquals(5, repeatedCountScorerFor_1.calculateScore(List.of(5,4,3,2,1)));
    }

}