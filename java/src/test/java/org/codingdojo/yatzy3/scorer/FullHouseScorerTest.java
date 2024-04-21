package org.codingdojo.yatzy3.scorer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FullHouseScorerTest {
    final FullHouseScorer fullHouseScorer = new FullHouseScorer();

    @Test
    public void calculateScore_shouldReturnFullHouseScore() {
        assertEquals(7, fullHouseScorer.calculateScore(List.of(1, 1, 1, 2, 2)));
        assertEquals(0, fullHouseScorer.calculateScore(List.of(1, 1, 2, 2, 3)));
    }

}