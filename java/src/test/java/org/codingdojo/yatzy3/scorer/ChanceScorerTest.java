package org.codingdojo.yatzy3.scorer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChanceScorerTest {
    final ChanceScorer chanceScorer = new ChanceScorer();
    @Test
    public void calculateScore_shouldReturnSumOfDice(){
        assertEquals(0, chanceScorer.calculateScore( List.of()));
        assertEquals(0, chanceScorer.calculateScore( List.of(0)));
        assertEquals(1, chanceScorer.calculateScore( List.of(0,1)));
    }

}