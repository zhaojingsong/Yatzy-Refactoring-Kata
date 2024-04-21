package org.codingdojo.yatzy3.scorer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.codingdojo.YatzyCategory.SMALL_STRAIGHT;
import static org.junit.jupiter.api.Assertions.*;

class StraightScorerTest {
    @Test
    public void calculateScore_shouldReturnStraightScore(){
        StraightScorer straightScorer = new StraightScorer(1);

        assertEquals(15, straightScorer.calculateScore(List.of(1, 2, 3, 4, 5)));
        assertEquals(0, straightScorer.calculateScore(List.of(1, 2, 2, 4, 5)));
    }

}