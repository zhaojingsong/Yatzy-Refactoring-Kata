package org.codingdojo.yatzy3.scorer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoPairsScorerTest {

    final TwoPairsScorer twoPairsScorer = new TwoPairsScorer();
    @Test
    public void calculateScore_shouldReturnSumOfTwoPairs(){
        assertEquals(16, twoPairsScorer.calculateScore(List.of(3, 3, 5, 5, 4)));
        assertEquals(16, twoPairsScorer.calculateScore(List.of(3, 3, 5, 5, 5)));
    }
}